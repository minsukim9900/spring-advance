package hello.advanced.proxy.common.advice;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jspecify.annotations.Nullable;

@Slf4j
public class TimeAdvice implements MethodInterceptor {

    @Override
    public @Nullable Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("TimeProxy 실행");
        long start = System.currentTimeMillis();

        Object result = invocation.proceed();

        long end = System.currentTimeMillis();

        log.info("TimeProxy 종료 resultTime: {} ms", end - start);
        return result;
    }
}
