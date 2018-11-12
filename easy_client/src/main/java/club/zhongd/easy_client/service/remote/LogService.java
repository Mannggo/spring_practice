package club.zhongd.easy_client.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 谢仲东 2018-11-12 16:16
 */
@FeignClient(name = "log-service", fallbackFactory = LogServiceFallbackFactory.class)
public interface LogService {

    @RequestMapping("/log/record")
    boolean recordLog(@RequestParam("msg") String log);

}
