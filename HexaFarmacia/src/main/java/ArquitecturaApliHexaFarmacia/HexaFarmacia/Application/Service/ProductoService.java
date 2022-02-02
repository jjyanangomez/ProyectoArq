package ArquitecturaApliHexaFarmacia.HexaFarmacia.Application.Service;

import ArquitecturaApliHexaFarmacia.HexaFarmacia.Application.Repository.ProductoRepository;
import ArquitecturaApliHexaFarmacia.HexaFarmacia.Domain.Producto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ProductoService {
    private final ProductoRepository ProduRe;

    public Producto getProducto(long id){
        return ProduRe.findByid(id);
    }
    public Producto saveProducto(Producto pro){
        return ProduRe.save(pro);
    }

}
