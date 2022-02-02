package ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.repository;

import ArquitecturaApliHexaFarmacia.HexaFarmacia.Application.Repository.ProductoRepository;
import ArquitecturaApliHexaFarmacia.HexaFarmacia.Domain.Producto;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ProductoDboRepository implements ProductoRepository {

  private final SpringDataProductoRepository ProductoRepository;

  private final ProductoEntityMapper ProyectoMapper;

  @Override
  public Producto findById(Long id) {
    return ProductoMapper.toDomain(ProductoRepository.findById(id).orElseThrow());
  }

  @Override
  public Producto save(Producto user) {

    return ProductoMapper.toDomain(ProductoRepository.save(ProductoMapper.toDbo(user)));

  }
}
