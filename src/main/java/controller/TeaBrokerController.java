package controller;

import commons.ServiceResponse;
import entity.TeaBrokerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TeaBrokerService;

@RestController
@RequestMapping("/broker")
public class TeaBrokerController {
    @Autowired
    private TeaBrokerService teaBrokerService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse add(@RequestBody TeaBrokerEntity vo) {
        return teaBrokerService.add(vo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse update(@RequestBody TeaBrokerEntity vo) {
        return teaBrokerService.update(vo);
    }

    @RequestMapping("/list")
    public ServiceResponse list(@RequestParam(required = false, defaultValue = "1") Integer pageNo,
                                @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                @RequestParam Integer sid) {
        return teaBrokerService.list(pageNo, pageSize, sid);
    }

    @RequestMapping("/delete")
    public ServiceResponse delete(@RequestParam(required = false) Integer id,
                                  @RequestParam(required = false) Integer sid) {
        return teaBrokerService.delete(id, sid);
    }

}
