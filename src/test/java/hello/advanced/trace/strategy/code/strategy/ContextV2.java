package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달 받는 방식
 */
@Slf4j
public class ContextV2 {

    public void execute(Strategy strategy) {
        long startTimeMs = System.currentTimeMillis();
        strategy.call();
        long endTimeMs = System.currentTimeMillis();

        long result = endTimeMs - startTimeMs;
        log.info("result={}", result);
    }
}
