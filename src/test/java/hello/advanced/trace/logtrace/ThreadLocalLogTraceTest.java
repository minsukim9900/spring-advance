package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThreadLocalLogTraceTest {
    ThreadLocalLogTrace trace = new ThreadLocalLogTrace();

    @Test
    @DisplayName("begin_end_level2")
    void begin_end_level2() throws Exception {
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status1);
        trace.end(status2);
    }

    @Test
    @DisplayName("begin_exception_level2")
    void begin_exception_level2() throws Exception {
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status1, new IllegalStateException());
        trace.exception(status2, new IllegalStateException());
    }
}