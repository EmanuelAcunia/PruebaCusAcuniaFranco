package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-17T13:39:45")
@StaticMetamodel(Pasajes.class)
public class Pasajes_ { 

    public static volatile SingularAttribute<Pasajes, Integer> codPas;
    public static volatile SingularAttribute<Pasajes, Boolean> escalaVue;
    public static volatile SingularAttribute<Pasajes, Date> fecSal;
    public static volatile SingularAttribute<Pasajes, String> ubicacionAs;
    public static volatile SingularAttribute<Pasajes, String> destVue;
    public static volatile SingularAttribute<Pasajes, Character> estadoPas;
    public static volatile SingularAttribute<Pasajes, Integer> canPas;
    public static volatile SingularAttribute<Pasajes, Float> costoPas;
    public static volatile SingularAttribute<Pasajes, String> comentario;
    public static volatile SingularAttribute<Pasajes, String> nomApePas;
    public static volatile SingularAttribute<Pasajes, String> dni;

}