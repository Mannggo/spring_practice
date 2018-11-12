package club.zhongd.easy_client.service.remote;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 谢仲东 2018-11-12 16:18
 */
@Component
@Slf4j
public class LogServiceFallbackFactory implements FallbackFactory<LogService> {
    @Override
    public LogService create(Throwable throwable) {

        if (!"".equals(throwable.getMessage())) {
            log.error(throwable.getMessage(), throwable.getCause());
        }

        return new LogService() {
            @Override
            public boolean recordLog(String log) {
                return false;
            }
        };
    }
}
