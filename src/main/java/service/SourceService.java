package service;

import commons.ServiceResponse;
import dao.SourceDAO;
import entity.SourceEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceService {
    private Logger logger = LoggerFactory.getLogger(SourceService.class);

    @Autowired
    private SourceDAO sourceDAO;

    public void addSource(SourceEntity userEntity) {
        sourceDAO.add(userEntity);
    }

    public void deleteSource(Integer sourceId) {
        if (null == sourceId) {
            logger.error("需要删除的主键ID不能为空");
            return;
        }
        sourceDAO.delete(sourceId);
    }

    public void updateSource(SourceEntity userEntity) {
        sourceDAO.update(userEntity);
    }

    public ServiceResponse listSources(Integer pageNo, Integer pageSize) {
        ServiceResponse sr = new ServiceResponse();
        StringBuilder queryStr = new StringBuilder("from user");
        sr.put("vos", sourceDAO.list(pageNo, pageSize, queryStr.toString()));
        return sr;
    }
}
