package hello.advanced.trace.template;

import hello.advanced.trace.template.code.AbstractTemplate;
import hello.advanced.trace.template.code.SubClassLogic1;
import hello.advanced.trace.template.code.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    @DisplayName("teplateMethodV0")
    void teplateMethodV0() throws Exception {
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
    @DisplayName("템플릿메서드 패턴 적용")
    void templateMehtodV1() throws Exception {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.execute();

        AbstractTemplate template2 = new SubClassLogic2();
        template2.execute();
    }

    @Test
    @DisplayName("탬프릿메서드 패턴 적용 및 익명 내부 클래스 적용")
    void templateMethodV2() throws Exception {
        AbstractTemplate template1 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직 1 실행");
            }
        };

        log.info("클래스명 {}", template1.getClass());
        template1.execute();

        AbstractTemplate template2 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직 2 실행");
            }
        };

        log.info("클래스명 {}", template2.getClass());
        template2.execute();
    }
}
