#mark down example
https://gist.github.com/ihoneymon/652be052a0727ad59601

# nata-jpa-exercise
spring boot, h2, jpa, rest, templete

#### Step 1 jpa 기본설정

>JpaRepository<User, Long> -> T는 Entity의 타입클래스이고 ID는 P.K 값의 Type 이다. (래퍼클래스 설정)
>반환형은 Optional
>단순한 쿼리문은 spring-data를 참고하면 될것 같음.

>@Entity로 테이블을 설계한 후,
>@Repository로 인터페이스에 연결하면 테이블이 자동생성된다.
<hr/>
