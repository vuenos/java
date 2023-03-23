package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 변수: 값을 저장하는 공간
        String name = "Kim"; // name 이라는 문자열 변수 생성 하고 값을 대입
        int hour = 15; // int

        System.out.println("Hello, " + name + " 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println("Hello, " + name + " 배송이 완료되었습니다.");

        double score = 90.5; // 정밀한 값 표현
        char grade = 'A'; // char 는 작은 따옴표안에 값을 넣는다.
        name = "James"; // 변수값 재 할당
        System.out.println(name + "님의 평균 점수는" + score + "점 입니다.");
        System.out.println(name + "님의 학점은 " + grade + "입니다.");

        boolean pass = true; // boolean type
        System.out.println("시험에 합격했나요? " + pass);

        double d = 3.141234567; // 정말힌 수 표현
        float f = 3.141234567F; // float 을 double 처럼 사용할 수 있게(실수)
        System.out.println(d);
        System.out.println(f);

        int i = 2000000000; // int 의 범위 -21억 + 21억 사이
        long l = 10000000000L; // int 의 범위를 벗어났을 경우
        l = 10_000_000_000L; // 보기 편하게 _ 로 표현 가능
        System.out.println(i);
        System.out.println(l);
    }
}
