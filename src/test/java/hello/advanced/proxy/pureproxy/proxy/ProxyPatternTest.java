package hello.advanced.proxy.pureproxy.proxy;

import hello.advanced.proxy.pureproxy.proxy.code.CacheProxy;
import hello.advanced.proxy.pureproxy.proxy.code.ProxyPatternClient;
import hello.advanced.proxy.pureproxy.proxy.code.RealSubject;
import hello.advanced.proxy.pureproxy.proxy.code.Subject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    @DisplayName("noProxyTest")
    void noProxyTest() throws Exception {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    @DisplayName("cacheProxyTest")
    void cacheProxyTest() throws Exception {
        Subject realSubject = new RealSubject();
        CacheProxy cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);

        client.execute();
        client.execute();
        client.execute();
    }
}
