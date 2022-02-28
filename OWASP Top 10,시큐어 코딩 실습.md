### OWASP Top 10, 시큐어 코딩 실습 # 1(Java편) 



#### WHY? IT Essential

+ 네이처리퍼블릭, 고객정보 14만건 해킹... 테슬라코리아도 정보 유출



#### 시큐어코딩? 상용화 하려면 필수!

+ KISA 한국 인터넷 진흥원

+ 외국에는? OWASP 

  + Opewn Web Application Security Project?

  + Top Ten으로 발표를한다

    1. SQL injection

    ​

+ 공통 프로젝트는 유저 관련이 많다. (회원가입,로그인, 비밀번호찾기 등등등)

+ application.properties 에서


```java
### jpa 이쁘께 쿼리 로그 나오게
spring.jpa.properties.hibernate.format_sql=true
### jpa 바인딩되는 값 보이기
loggins.level.org.hibernate.type.descriptor.sql.BasicBinder=trace
```

+ injection 은 외부에서 들어오는 값은 철저히 검증해야한다!
+ 아이디 유효성 검증 4~12자로 할경우? 프론트단에서 막아야할까 백엔드에서 막아야할까?
  + 정답은 둘다!

![](https://i.ibb.co/yYz1xMz/1.png)



#### Cryptography

+ 암호화
  + 복호화 가능
    + 대칭 키암호화: AES,DES,ARIA,SEED 등등
    + 비대칭키 암호화(공개키암호화):RSA,ECC, ECDSA, DS(전자서명)
  + 복호화 불가능(단방향)
    + SHA256, keccak256,RIPEMD-160 등등



+ SHA256 : 검증을 위해서 사용한다.



#### SECURE CODING(![🍯](https://www.youtube.com/s/gaming/emoji/828cb648/emoji_u1f36f.svg)![🐝](https://www.youtube.com/s/gaming/emoji/828cb648/emoji_u1f41d.svg)꿀팁!!!!)

1. 스트링 비교시 string.equals("") 대신에 "".equals(string) 사용!!

```java
request.getType().equals("business") 보다
"business".equals(request.getCheckType()) 이 낫다.
전자 보다 후자가 낫다.
request.getType() 의 경우 NULL 이 날 수 있이만,
"business" 는 NULL이 절대 날수 없기 때문이다.
```

2. @RequestBody 바인딩 되는 부분을 JPA Entity 객체로 받으면 안됩니다.



#### SUMMARY & QUIZ

1. OWASP top 10 의 취약점 1위로서 시스템 DB에 쿼리문을 주입하는 방법으로 SQL injecdtion 라고한다.
2. 복호화 불가능(단방향)암호화에 쓰이는 SHA256 이나 keccak256 를 해시함수라고 한다.
3. 싸피에서 사용하는 정적분석 툴로서 보안 취약점이나 버그 등을 리포트 해주는 툴을 소나큐브 라고 한다.
4. 스트링 문자열 값이 같으면 해시암호화한 ㄱ밧은 salt 에 따라서 달라질 수있다. X
5. 에러가 나지 않는 구문 : "TESTID".equals(id)
6. 0.1 + 0.2 = ? (in computing) 



#### Q&A

+ 비밀번호를 객체로 보내면 문제가 되지 않는가? 그렇다! POST 나 fetch 로 보내면 된다.
+ 프론트에서 막으면 애초에 백엔드로 들어가지 않지 않는가? 그렇긴하다. 그런데 보안쪽에서는 그렇게 접근해서는 안된다. 금융보안에서 일하면 프론트는 정말 아무것도 아니란 것을 느끼게 된다.
+ 파이썬 편의 경우는 자율때 진행하게 된다.