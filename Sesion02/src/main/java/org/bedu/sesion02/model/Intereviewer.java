package org.bedu.sesion02.model;

import lombok.Builder;
import lombok.Data;

//Agrega Setter, Getter, ToString y EqualsAndHashCode (compara dos objetos del mismo tiempo)
//Patrones de diseño: soluciones que resuelven o facilita el codigo
@Data
@Builder //PPermite crear instancias utilizando métodos
public class Intereviewer {

    private long id;
    private Stringn name;
    private String email;
    
}
