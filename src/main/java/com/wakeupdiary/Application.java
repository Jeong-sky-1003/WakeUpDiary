package com.wakeupdiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 프로젝트의 메인 클래스
 *
 * @SpringBootApplication
 * 해당 어노테이션으로 스프링 부트의 자동 설정, bean 읽기와 생성이 자동으로 설정됨
 * 항상 해당 어노테이션이 있는 곳으로부터 설정을 읽어가기에 프로젝트 최상단에 위치해야 함
 *
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 아래 run 메서드로 인해 내장 WAS를 실행함
        // 이로 항상 서버에 톰캣을 설치할 필요 없이 Jar를 실행하면 됨
        SpringApplication.run(Application.class, args);
    }

}
