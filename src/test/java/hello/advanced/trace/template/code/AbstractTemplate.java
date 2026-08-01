package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {
    public void execute() {
        long startTimeMs = System.currentTimeMillis();

        call();

        long endTimeMs = System.currentTimeMillis();
        long result = endTimeMs - startTimeMs;

        log.info("result={}", result);
    }

    protected abstract void call();
}
