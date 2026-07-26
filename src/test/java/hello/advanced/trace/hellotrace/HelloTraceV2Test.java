package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class HelloTraceV2Test {

    @Test
    @DisplayName("정상 요청 HelloTrace 흐름")
    void begin_end_level2() throws Exception {
        HelloTraceV2 trace = new HelloTraceV2();

        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    @DisplayName("예외 상황 HelloTrace 흐름")
    void begin_exception_level2() throws Exception {
        HelloTraceV2 trace = new HelloTraceV2();

        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }
}