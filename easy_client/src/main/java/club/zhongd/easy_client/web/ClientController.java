package club.zhongd.easy_client.web;

import club.zhongd.easy_client.service.remote.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 谢仲东 2018-11-12 16:21
 */
@RestController
@RequestMapping("/hello")
public class ClientController {

    @Autowired
    private LogService logService;

    @RequestMapping("/log")
    public boolean recordLog(@RequestParam("msg") String msg) {

        return logService.recordLog(msg);
    }

}
