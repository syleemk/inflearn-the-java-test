package me.swimlee.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    /**
     * JUnit5부터는 메서드를 public으로 선언하지 않아도된다.
     * Java의 리플렉션을 사용하기 때문 (JUnit4에서도 사용했지만)
     * Java의 리플렉션을 사용하면 default나 private한 멤버에 접근 가능
     */
    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @Disabled //실행하고싶지 않은 테스트에 적용
    void create1() {
        System.out.println("create1");
    }

    /**
     * 모든 테스트 실행 전 딱 한번만 실행
     * static void로 작성해야함
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    /**
     * 각각 테스트 호출 이전 이후 한번씩 실행 (before/after)
     * 굳이 static일 필요없음
     */
    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}