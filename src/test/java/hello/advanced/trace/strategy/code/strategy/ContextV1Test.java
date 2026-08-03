package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {
    @Test
    @DisplayName("teplateMethodV0")
    void strategyV0() throws Exception {
        logic1();
        logic2();
    }

    private void logic1() {
        long startTimeMs = System.currentTimeMillis();
        log.info("비즈니스 로직1 실행");
        long endTimeMs = System.currentTimeMillis();

        long result = endTimeMs - startTimeMs;
        log.info("result={}", result);
    }

    private void logic2() {
        long startTimeMs = System.currentTimeMillis();
        log.info("비즈니스 로직2 실행");
        long endTimeMs = System.currentTimeMillis();

        long result = endTimeMs - startTimeMs;
        log.info("result={}", result);
    }

    @Test
    @DisplayName("startegyLogic 인스턴스 생성 후 Context에 주입")
    void strategyV1() throws Exception {
        StrategyLogic1 strategyLogic1 = new StrategyLogic1();
        ContextV1 contextV1 = new ContextV1(strategyLogic1);
        contextV1.execute();

        StrategyLogic2 strategyLogic2 = new StrategyLogic2();
        ContextV1 contextV2 = new ContextV1(strategyLogic2);
        contextV2.execute();
    }

    @Test
    @DisplayName("익명 내부 클래스로 인스턴스 생성 후 Context에 주입")
    void strategyV2() throws Exception {

        Strategy strategy1 = new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        };

        ContextV1 contextV1 = new ContextV1(strategy1);
        contextV1.execute();

        Strategy strategy2 = new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        };

        ContextV1 contextV2 = new ContextV1(strategy2);
        contextV2.execute();
    }

    @Test
    @DisplayName("익명 내부 클래스로 인스턴스 생성 후 Context에 주입")
    void strategyV3() throws Exception {

        ContextV1 contextV1 = new ContextV1(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });
        contextV1.execute();

        ContextV1 contextV2 = new ContextV1(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        });
        contextV2.execute();
    }

    @Test
    @DisplayName("람다로 call 메서드 직접 실행 후 Context에 주입")
    void strategyV4() throws Exception {

        ContextV1 contextV1 = new ContextV1(() -> log.info("비즈니스 로직1 실행"));
        contextV1.execute();

        ContextV1 contextV2 = new ContextV1(() -> log.info("비즈니스 로직2 실행"));
        contextV2.execute();
    }
}
