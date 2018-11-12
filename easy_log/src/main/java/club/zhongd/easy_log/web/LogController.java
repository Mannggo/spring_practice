package club.zhongd.easy_log.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谢仲东 2018-11-12 17:05
 */

@RestController
@RequestMapping("/log")
@Slf4j
public class LogController {

    @RequestMapping("/record")
    public boolean record(@RequestParam("msg") String msg) {
        log.info("记录日志-{}", msg);
        return true;
    }
}
