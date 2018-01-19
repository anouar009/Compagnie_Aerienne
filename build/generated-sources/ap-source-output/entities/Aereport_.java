package entities;

import entities.Vols;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-19T16:53:19")
@StaticMetamodel(Aereport.class)
public class Aereport_ { 

    public static volatile CollectionAttribute<Aereport, Vols> volsCollection1;
    public static volatile SingularAttribute<Aereport, Integer> id;
    public static volatile SingularAttribute<Aereport, String> nom;
    public static volatile CollectionAttribute<Aereport, Vols> volsCollection;
    public static volatile SingularAttribute<Aereport, String> pays;

}