# 스프링 핵심 원리 - 고급편

> 김영한님의 인프런 강의 **「스프링 핵심 원리 - 고급편」**을 수강하며 실습한 코드와 학습 내용을 정리한 저장소입니다.
>
> 스프링이 제공하는 기능을 단순히 사용하는 데서 그치지 않고, **디자인 패턴과 프록시 기술을 기반으로 스프링 AOP가 동작하는 원리**를 이해하는 것을 목표로 합니다.

<br>

## 강의 정보

- 강의명: [스프링 핵심 원리 - 고급편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B3%A0%EA%B8%89%ED%8E%B8)
- 강사: 김영한
- 주요 주제
  - 스프링 핵심 디자인 패턴
  - 멀티스레드와 `ThreadLocal`
  - 프록시와 동적 프록시
  - 빈 후처리기와 자동 프록시 생성기
  - 스프링 AOP의 원리와 활용

<br>

## 학습 목표

- 핵심 기능과 부가 기능을 분리해야 하는 이유를 이해한다.
- 템플릿 메서드, 전략, 템플릿 콜백 패턴의 차이를 설명할 수 있다.
- 프록시 패턴과 데코레이터 패턴의 목적을 구분할 수 있다.
- JDK 동적 프록시와 CGLIB의 동작 방식 및 차이를 이해한다.
- 스프링의 `ProxyFactory`, `Advice`, `Pointcut`, `Advisor` 관계를 이해한다.
- 빈 후처리기를 통해 프록시가 스프링 빈으로 등록되는 과정을 이해한다.
- 스프링 AOP의 주요 용어와 프록시 기반 AOP의 한계를 설명할 수 있다.
- 실무에서 AOP를 적용할 때 발생할 수 있는 내부 호출 문제와 주의사항을 이해한다.

<br>

## 참고 자료

- [스프링 핵심 원리 - 고급편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B3%A0%EA%B8%89%ED%8E%B8)
- [Spring Framework Documentation](https://docs.spring.io/spring-framework/reference/)
- [Java ThreadLocal API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/ThreadLocal.html)

<br>

## 저작권 및 출처

이 저장소는 강의를 수강하며 학습한 내용을 개인적으로 정리한 저장소입니다.

강의 자료와 예제 코드의 저작권은 원저작자에게 있으며, 유료 강의 자료의 원문을 그대로 공유하지 않습니다.

저장소에는 직접 작성한 실습 코드와 학습 과정에서 이해한 내용을 중심으로 기록합니다.