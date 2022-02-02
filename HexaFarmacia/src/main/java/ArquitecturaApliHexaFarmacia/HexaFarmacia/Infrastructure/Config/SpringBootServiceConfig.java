package ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.Config;

import ArquitecturaApliHexaFarmacia.HexaFarmacia.Application.Repository.ProductoRepository;
import ArquitecturaApliHexaFarmacia.HexaFarmacia.Application.Service.ProductoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootServiceConfig {

    @Bean
    public ProductoService ProService(ProductoRepository proRepository){
        return new ProductoService(proRepository);
    }
}
