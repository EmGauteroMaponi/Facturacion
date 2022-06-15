package facturacion.controladores;

import facturacion.modelos.Fisica;
import facturacion.modelos.Persona;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping
@Api(value = "mediante los endpoints que se encontraran en esta clase, podra crear, editar y borrar a una persona en la base de datos, como tambien obtener un listado de todas las personas guardadas")
public class PersonasControlador {
    @PostMapping( "/api/category/add/")
    @ApiOperation(value = "Save an Category", notes = "Return the saved Category" )
    public ResponseEntity<Persona> save (@RequestBody String nombre){
        try{
//            Persona temp = personaService.create(persona);
            Persona temp = new Fisica("3571529612","emanuel.gautero012@gmail.com","otro","emanuel","gautero",38020730L);
            return ResponseEntity.created(new URI("/api/customer/add/"+temp.getDireccion())).body(temp);

//        }catch (Exception e){
//            return new ResponseEntity(e.getError(), new HttpHeaders(), e.getError().getStatus());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
