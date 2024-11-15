package cn.tt.sp3;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tt.sp3.mapper")
public class Sp3Application {
    public static void main(String[] args) {
        SpringApplication.run(Sp3Application.class, args);
    }
}