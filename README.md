# JAVA Study

강의영상 : https://www.youtube.com/watch?v=NQq0dOoEPUM

IDE : IntelliJ
## Chapter 01
### Hello World

- package 생성
- java class 파일 생성
- class 생성
```java
package chap_01;

public class _01_HelloWorld {
    // shotkey : psvm
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
    }
}
```

### 자료형

|타입|설명| 크기(bit)                                      | 범위                                               |
|:---|:---|:---------------------------------------------|:-------------------------------------------------|
char|16비트 유니코드(Unicode) 문자 데이터| 16                                           | ‘\u0000’ ~ ‘\uFFFF’                              |
boolean|참/거짓 값| 8                                            | true 또는 false                                    |
byte|부호를 가진 8비트 정수| 8                                            | -128 ~ +127                                      |
short|부호를 가진 16비트 정수| 16| -32,768 ~ +32,767                                |
int|부호를 가진 32비트 정수| 32| -2,147,483,638~+2,147,483,647                    |
long|부호를 가진 64비트 정수| 64| -9223372036854775808~+9223372036854775807        |
float|부호를 가진 32비트 부동 소수점| 32| -3.402932347e+38~+3.40292347e+38                 |
double|부호를 가진 64비트 부동 소수점| 64                                           | -179769313486231570e+308~1.79769313486231570e+08 |

- 문자형: char
- 논리형: boolean
- 정수형: byte, short, int, long
- 부동 소수점형: float, double