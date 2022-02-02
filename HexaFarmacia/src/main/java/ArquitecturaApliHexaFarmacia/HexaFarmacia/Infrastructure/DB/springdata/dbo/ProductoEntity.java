package ArquitecturaApliHexaFarmacia.HexaFarmacia.Infrastructure.DB.springdata.dbo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductoEntity {

  @Id
  private Long id;
  private String Codigo;
  private String Nombre;
  private String Descripcion;
  private String FormaFarmaceutica;
  private String Concentracion;
  private long Cantidad;
  private String FechaElaboracion;
  private String FechaCaducidad;

}
