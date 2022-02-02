package ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataProductoRepository extends JpaRepository<ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.dbo.ProductoEntity, Long> {

}
