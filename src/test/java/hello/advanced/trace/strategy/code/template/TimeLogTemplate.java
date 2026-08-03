package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {

    public void execute(Callback callback) {
        long startTimeMs = System.currentTimeMillis();
        callback.call();
        long endTimeMs = System.currentTimeMillis();

        long result = endTimeMs - startTimeMs;
        log.info("result={}", result);
    }
}
