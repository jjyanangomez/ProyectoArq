package ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.mapper;

import ArquitecturaApliHexaFarmacia.HexaFarmacia.Domain.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoEntityMapper {

  Producto toDomain(ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.dbo.ProductoEntity ProductoEntity);

  ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.dbo.ProductoEntity toDbo(Producto pro);


}
