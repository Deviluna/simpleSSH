package service;

import commons.ServiceResponse;
import dao.TeaPicDao;
import entity.TeaPicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

@Service
public class TeaPicService {
    @Value("${pic.path}")
    private String picPath = "D:/projects/simpleSSH/src/main/resources/images";

    @Autowired
    private TeaPicDao teaPicDao;

    public ServiceResponse add(MultipartFile file) {
        ServiceResponse sr = new ServiceResponse();
        try {
            this.storePic(file.getInputStream(), file);
        } catch (Exception e) {
            e.printStackTrace();
            sr.put("errorCode", -1);
            sr.put("errorMsg", "保存图片出错");
        }
        return sr;
    }

    public ServiceResponse list(Integer sid) {
        ServiceResponse sr = new ServiceResponse();
        sr.put("vos", teaPicDao.list(sid));
        return sr;
    }

    public ServiceResponse delete(Integer id, Integer sid) {
        ServiceResponse sr = new ServiceResponse();
        if (null == id && null == sid) {
            sr.put("errorCode", -1);
            sr.put("errorMsg", "需要指定删除的图片");
            return sr;
        }
        TeaPicEntity vo = new TeaPicEntity();
        vo.setId(id);
        vo.setSid(sid);
        teaPicDao.delete(vo);
        return sr;
    }

    public void storePic(InputStream inputStream,MultipartFile multipartFile) throws Exception{
        FileOutputStream outputStream = null;
        try {
            File file = new File(picPath);
            if (!file.exists()) {
                file.mkdir();
            }
            File target = new File(picPath + "/" + (null == multipartFile ? "11.jpg" : multipartFile.getName()));
            outputStream = new FileOutputStream(target);
            // 设置数据缓冲
            byte[] bs = new byte[1024 * 2];
            int len;
            while ((len = inputStream.read(bs)) > -1) {
                outputStream.write(bs, 0, len);
            }
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                inputStream.close();
            }
            if (null != outputStream) {
                outputStream.close();
            }
        }
    }

    public static void main(String[] args) {
        TeaPicService service = new TeaPicService();
        try {
            File picFile = new File("D:\\timg.jpg");
            service.storePic(new FileInputStream(picFile), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(service.getClass().getResource("").getPath());
    }
}
