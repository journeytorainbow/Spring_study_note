# Spring Framework 공부 노트

+ [인프런 - 자바 스프링 프레임워크](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC_renew/dashboard)를 들으며 공부한 내용들을 정리

+ 정리 노트에 삽입된 이미지들은 모두 위 강의에서 제공되는 자료이다.

+ 실습 환경
    + `Windows10`
    + `eclipse Version: 2020-09 (4.17.0)`
    + `Java 11`
    + `Spring 5.3.1`
    + `Maven`
    + `Tomcat 8.5`
    + `Oracle 18c`
    + `vs code` + `markdownlint  extension` : 강의 노트 작성용

---

# 목차

+ [스프링 개요](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%8A%A4%ED%94%84%EB%A7%81_%EA%B0%9C%EC%9A%94/%EB%A9%94%EB%AA%A8.md)
+ [스프링 프로젝트 생성](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%8A%A4%ED%94%84%EB%A7%81_%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8_%EC%83%9D%EC%84%B1/%EB%A9%94%EB%AA%A8.md) : `Maven` 및 `pom.xml` 설명 포함
+ [처음 해보는 스프링 프로젝트](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%B2%98%EC%9D%8C_%ED%95%B4%EB%B3%B4%EB%8A%94_%EC%8A%A4%ED%94%84%EB%A7%81_%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/%EB%A9%94%EB%AA%A8.md)
+ [프로젝트 생성 방법2](https://github.com/journeytorainbow/Spring_study_note/blob/master/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8_%EC%83%9D%EC%84%B1_%EB%B0%A9%EB%B2%952/%EB%A9%94%EB%AA%A8.md)
+ [DI(Dependency Injection)](https://github.com/journeytorainbow/Spring_study_note/blob/master/DI(Dependency_Injection)/%EB%A9%94%EB%AA%A8.md)
+ [다양한 의존 객체 주입](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EB%8B%A4%EC%96%91%ED%95%9C_%EC%9D%98%EC%A1%B4_%EA%B0%9D%EC%B2%B4%EC%A3%BC%EC%9E%85/%EB%A9%94%EB%AA%A8.md)
+ [스프링 설정 파일 분리](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%8A%A4%ED%94%84%EB%A7%81_%EC%84%A4%EC%A0%95%ED%8C%8C%EC%9D%BC_%EB%B6%84%EB%A6%AC/%EB%A9%94%EB%AA%A8.md)
+ [의존객체 자동 주입](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%9D%98%EC%A1%B4%EA%B0%9D%EC%B2%B4_%EC%9E%90%EB%8F%99%EC%A3%BC%EC%9E%85/%EB%A9%94%EB%AA%A8.md)
+ [의존객체 선택](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%9D%98%EC%A1%B4%EA%B0%9D%EC%B2%B4_%EC%84%A0%ED%83%9D/%EB%A9%94%EB%AA%A8.md)
+ [생명주기(Life Cycle)](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%83%9D%EB%AA%85%EC%A3%BC%EA%B8%B0(life_cycle)/%EB%A9%94%EB%AA%A8.md)
+ [어노테이션을 이용한 스프링설정1,2](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98_%EC%9D%B4%EC%9A%A9_%EC%8A%A4%ED%94%84%EB%A7%81%EC%84%A4%EC%A0%951/%EB%A9%94%EB%AA%A8.md)
+ [웹프로그래밍 설계 모델](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D_%EC%84%A4%EA%B3%84%EB%AA%A8%EB%8D%B8/%EB%A9%94%EB%AA%A8.md)
+ [스프링MVC 웹서비스 - 1](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%8A%A4%ED%94%84%EB%A7%81MVC_%EC%9B%B9%EC%84%9C%EB%B9%84%EC%8A%A41/%EB%A9%94%EB%AA%A8.md)
+ [스프링MVC 웹서비스 - 2](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%8A%A4%ED%94%84%EB%A7%81MVC_%EC%9B%B9%EC%84%9C%EB%B9%84%EC%8A%A42/%EB%A9%94%EB%AA%A8.md)
+ [STS를 이용하지 않은 웹 프로젝트](https://github.com/journeytorainbow/Spring_study_note/blob/master/STS_%EC%9D%B4%EC%9A%A9%ED%95%98%EC%A7%80%EC%95%8A%EB%8A%94_%EC%9B%B9%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/%EB%A9%94%EB%AA%A8.md)
+ [Service&DAO&Controller객체구현](https://github.com/journeytorainbow/Spring_study_note/blob/master/Service%26DAO%26Controller%EA%B0%9D%EC%B2%B4%EA%B5%AC%ED%98%84/%EB%A9%94%EB%AA%A8.md)
+ [세션&쿠키](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%84%B8%EC%85%98%26%EC%BF%A0%ED%82%A4/%EB%A9%94%EB%AA%A8.md)
+ [리다이렉트&인터셉트](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EB%A6%AC%EB%8B%A4%EC%9D%B4%EB%A0%89%ED%8A%B8%26%EC%9D%B8%ED%84%B0%EC%85%89%ED%8A%B8/%EB%A9%94%EB%AA%A8.md)
+ [JDBC](https://github.com/journeytorainbow/Spring_study_note/blob/master/JDBC/%EB%A9%94%EB%AA%A8.md)
+ [JdbcTemplate](https://github.com/journeytorainbow/Spring_study_note/blob/master/JdbcTemplate/%EB%A9%94%EB%AA%A8.md)
+ [커넥션풀](https://github.com/journeytorainbow/Spring_study_note/blob/master/%EC%BB%A4%EB%84%A5%EC%85%98%ED%92%80/%EB%A9%94%EB%AA%A8.md)