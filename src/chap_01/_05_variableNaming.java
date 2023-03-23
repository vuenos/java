package chap_01;

public class _05_variableNaming {
    public static void main(String[] args) {
        // 변수 네이밍 룰
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 가능 (공백 사용 불가
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 문자 제외) : 파스칼
        // 6. 예약어 사용 불가 (public, static, void, int, double, float...)

        // 입국 신고서
        String nationality = "대한민국"; // 극작
        String firstName = "JINTAE";
        String lastName = "KIM";
        String dateOfBirth = "1976-04-20";
        String residentialAddress = "Hillton Hotel";
        String purposeOfVisit = "trip";
        String flightNumber = "KA666";
        String _flightNo = "KA666";
        String flight_no = "KA666";
//        String -flightNumber = "KE666"; // error
        int accompany = 3;
        int lengthOfStay = 5;

        String items1 = "Watch";
        String items2 = "Bag";
//        String 3items = "Shoes"; // error

    }
}
