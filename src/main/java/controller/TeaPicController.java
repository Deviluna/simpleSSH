package controller;

import commons.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import service.TeaPicService;

@RestController
@RequestMapping("/pic")
public class TeaPicController {
    @Autowired
    private TeaPicService teaPicService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse addPic(@RequestParam("file") MultipartFile file) {
        return teaPicService.add(file);
    }

    @RequestMapping(value = "/list")
    public ServiceResponse listPic(@RequestParam Integer sid) {
        return teaPicService.list(sid);
    }

    @RequestMapping(value = "/delete")
    public ServiceResponse delete(@RequestParam(required = false) Integer id,
                                  @RequestParam(required = false) Integer sid) {
        return teaPicService.delete(id, sid);
    }
}
