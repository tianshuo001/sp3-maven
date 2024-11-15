package cn.tt.sp3.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @program: sp3-maven
 * @ClassName SwaggerConfig
 * @description: 访问路径 http://localhost/sp3/swagger-ui/index.html
 * @author: tianshuo
 * @create: 2024-11-15 11:12
 * @Version 1.0
 **/

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI swaggerOpenApi() {
        return new OpenAPI()
                .info(new Info().title("XXX平台YYY微服务")
                        .description("描述平台多牛逼")
                        .version("v1.0.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("设计文档")
                        .url("https://juejin.cn/user/254742430749736/posts"));
    }
}
