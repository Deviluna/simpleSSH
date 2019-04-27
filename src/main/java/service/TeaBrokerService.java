package service;

import commons.ServiceResponse;
import dao.TeaBrokerDao;
import entity.TeaBrokerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeaBrokerService {
    @Autowired
    private TeaBrokerDao teaBrokerDao;

    public ServiceResponse add(TeaBrokerEntity vo) {
        teaBrokerDao.add(vo);
        return new ServiceResponse();
    }

    public ServiceResponse update(TeaBrokerEntity vo) {
        ServiceResponse sr = new ServiceResponse();
        if (null == vo.getId()) {
            sr.put("errorCode", -1);
            sr.put("errorMsg", "需要指定经销商的主键");
            return sr;
        }
        teaBrokerDao.update(vo);
        return sr;
    }

    public ServiceResponse delete(Integer id, Integer sid) {
        ServiceResponse sr = new ServiceResponse();
        if (null == id && null == sid) {
            sr.put("errorCode", -1);
            sr.put("errorMsg", "需要指定删除的经销商");
            return sr;
        }
        TeaBrokerEntity vo = new TeaBrokerEntity();
        vo.setId(id);
        vo.setSid(sid);
        teaBrokerDao.delete(vo);
        return sr;
    }

    public ServiceResponse list(Integer pageNo, Integer pageSize, Integer sid) {
        ServiceResponse sr = new ServiceResponse();
        StringBuilder queryStr = new StringBuilder("from tea_broker");
        boolean flag = false;
        if (null != sid) {
            queryStr.append("where sid='").append(sid).append("'");
        }
        System.out.println(queryStr.toString());
        sr.put("vos", teaBrokerDao.list(pageNo, pageSize, queryStr.toString()));
        return sr;
    }
}
