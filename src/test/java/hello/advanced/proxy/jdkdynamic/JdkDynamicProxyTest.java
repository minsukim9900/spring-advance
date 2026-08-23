package hello.advanced.proxy.jdkdynamic;

import hello.advanced.proxy.jdkdynamic.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    @DisplayName("dynamicA")
    void dynamicA() throws Exception {
        AInterface target = new AImpl();
        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        AInterface proxy = (AInterface) Proxy
                .newProxyInstance(
                        AInterface.class.getClassLoader(),
                        new Class[]{AInterface.class},
                        handler
                );

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }

    @Test
    @DisplayName("dynamicB")
    void dynamicB() throws Exception {
        BInterface target = new BImpl();
        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        BInterface proxy = (BInterface) Proxy
                .newProxyInstance(
                        BInterface.class.getClassLoader(),
                        new Class[]{BInterface.class},
                        handler
                );

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }
}
