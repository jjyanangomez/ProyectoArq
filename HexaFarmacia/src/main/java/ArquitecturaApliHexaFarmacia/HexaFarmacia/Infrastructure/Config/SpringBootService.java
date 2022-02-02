package ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure")
@EntityScan(basePackages = "com.refactorizando.hexagonalarchitecture.domain")
public class SpringBootService {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootService.class, args);
    }
}
