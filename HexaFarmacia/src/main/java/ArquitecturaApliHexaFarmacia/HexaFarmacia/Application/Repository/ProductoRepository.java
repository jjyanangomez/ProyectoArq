package ArquitecturaApliHexaFarmacia.HexaFarmacia.Application.Repository;

import ArquitecturaApliHexaFarmacia.HexaFarmacia.Domain.Producto;

public interface ProductoRepository {

    Producto findByid(long id);
    Producto save(Producto pro);
}
