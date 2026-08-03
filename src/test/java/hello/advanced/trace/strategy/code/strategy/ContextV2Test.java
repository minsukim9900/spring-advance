package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    /**
     * 전략 패턴 적용
     */

    @Test
    @DisplayName("전략 패턴 적용")
    void strategyV1() throws Exception {
        ContextV2 context = new ContextV2();

        context.execute(new StrategyLogic1());
        context.execute(new StrategyLogic2());
    }

    /**
     * 전략 패턴 익명 내부 클래스
     */

    @Test
    @DisplayName("전략 패턴 익명 내부 클래스")
    void strategyV2() throws Exception {
        ContextV2 context = new ContextV2();

        context.execute(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직 1 실행");
            }
        });

        context.execute(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직 2 실행");
            }
        });
    }

    /**
     *  전략 패턴 람다 실행
     */

    @Test
    @DisplayName("전략 패턴 람다 실행")
    void strategyV3() throws Exception {

         ContextV2 context = new ContextV2();

        context.execute(() -> {
            log.info("비즈니스 로직 1 실행");
        });

        context.execute(() -> {
            log.info("비즈니스 로직 2 실행");
        });
    }
}
