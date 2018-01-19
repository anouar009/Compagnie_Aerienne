package entities;

import entities.Aereport;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-19T16:53:19")
@StaticMetamodel(Vols.class)
public class Vols_ { 

    public static volatile SingularAttribute<Vols, Float> prix;
    public static volatile SingularAttribute<Vols, Aereport> aereportArrivee;
    public static volatile SingularAttribute<Vols, Date> dateArrivee;
    public static volatile SingularAttribute<Vols, Aereport> aereportDepart;
    public static volatile SingularAttribute<Vols, Integer> id;
    public static volatile SingularAttribute<Vols, Date> dateDepart;

}