package controller;

import commons.ServiceResponse;
import entity.SourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.SourceService;

@Controller
@RequestMapping(value = "/api/source")
public class SourceController {
    @Autowired
    private SourceService sourceService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse addNewUser(SourceEntity userEntity) {
        ServiceResponse sr = new ServiceResponse();
        sourceService.addSource(userEntity);
        return sr;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse updateUser(SourceEntity userEntity) {
        ServiceResponse sr = new ServiceResponse();
        sourceService.updateSource(userEntity);
        return sr;
    }

    @RequestMapping(value = "/delete")
    public ServiceResponse deleteUser(@RequestParam Integer sourceId) {
        ServiceResponse sr = new ServiceResponse();
        sourceService.deleteSource(sourceId);
        return sr;
    }

    @RequestMapping(value = "/list")
    public ServiceResponse list(@RequestParam(required = false, defaultValue = "1")Integer pageNo,
                                @RequestParam(required = false, defaultValue = "10")Integer pageSize) {
        ServiceResponse sr =  sourceService.listSources(pageNo, pageSize);
        return sr;
    }
}
