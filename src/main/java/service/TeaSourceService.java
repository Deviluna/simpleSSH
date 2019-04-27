package service;

import commons.ServiceResponse;
import dao.TeaSourceDao;
import entity.TeaSourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeaSourceService {
    @Autowired
    private TeaSourceDao teaSourceDao;

    public ServiceResponse add(TeaSourceEntity vo) {
        teaSourceDao.add(vo);
        return new ServiceResponse();
    }

    public ServiceResponse update(TeaSourceEntity vo) {
        ServiceResponse sr = new ServiceResponse();
        if (null == vo.getId()) {
            sr.put("errorCode", -1);
            sr.put("errorMsg", "需要指定主键");
            return sr;
        }
        teaSourceDao.update(vo);
        return sr;
    }

    public ServiceResponse delete(Integer id) {
        ServiceResponse sr = new ServiceResponse();
        if (null == id) {
            sr.put("errorCode", -1);
            sr.put("errorMsg", "需要指定删除的主键");
            return sr;
        }
        TeaSourceEntity vo = new TeaSourceEntity();
        vo.setId(id);
        teaSourceDao.delete(vo);
        return sr;
    }

    public ServiceResponse list(Integer pageNo, Integer pageSize, String teaName) {
        ServiceResponse sr = new ServiceResponse();
        StringBuilder queryStr = new StringBuilder("from tea_source");
        boolean flag = false;
        if (null != teaName) {
            queryStr.append("where tea_name='").append(teaName).append("'");
        }
        System.out.println(queryStr.toString());
        sr.put("vos", teaSourceDao.list(pageNo, pageSize, queryStr.toString()));
        return sr;
    }
}
