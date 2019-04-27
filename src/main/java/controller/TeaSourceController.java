package controller;

import commons.ServiceResponse;
import entity.TeaSourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TeaSourceService;

@RestController
@RequestMapping("/source")
public class TeaSourceController {
    @Autowired
    private TeaSourceService teaSourceService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse add(@RequestBody TeaSourceEntity vo) {
        return teaSourceService.add(vo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse update(@RequestBody TeaSourceEntity vo) {
        return teaSourceService.update(vo);
    }

    @RequestMapping("/list")
    public ServiceResponse list(@RequestParam(required = false, defaultValue = "1") Integer pageNo,
                                @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                @RequestParam(required = false) String teaName) {
        return teaSourceService.list(pageNo, pageSize, teaName);
    }

    @RequestMapping("/delete")
    public ServiceResponse delete(@RequestParam Integer id) {
        return teaSourceService.delete(id);
    }
}
