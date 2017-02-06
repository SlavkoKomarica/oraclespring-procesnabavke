package slavko.baze2.procesnabavke.domain;

import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.*;

/**
 * @author Slavko Komarica
 */
public class NacinPlacanja implements UserType, Serializable {

    private String opis;
    private String naziv;


    private static final int SQL_TYPE = Types.STRUCT;
    private static final String OBJECT_TYPE = "obj_nacin_placanja";

    public NacinPlacanja() {
    }

    public NacinPlacanja(String opis, String naziv) {
        this.opis = opis;
        this.naziv = naziv;
    }

    public NacinPlacanja(NacinPlacanja nacinPlacanja) {
        this.opis = nacinPlacanja.getOpis();
        this.naziv = nacinPlacanja.getNaziv();
    }

    /**
     * Returns the object from the 2 level cache
     */
    public Object assemble(Serializable cached, Object owner)
            throws HibernateException {
        return cached;
    }

    /**
     * Used to create Snapshots of the object
     */
    public Object deepCopy(Object value) throws HibernateException {
        if (value == null) {
            return null;
        }
        final NacinPlacanja recievedParam = (NacinPlacanja) value;
        final NacinPlacanja addressData = new NacinPlacanja(recievedParam);

        return addressData;
    }

    /**
     * method called when Hibernate puts the data in a second level cache. The
     * data is stored in a serializable form
     */
    public Serializable disassemble(final Object value)
            throws HibernateException {
        return (Serializable) value;
    }

    public boolean equals(final Object o1, final Object o2)
            throws HibernateException {
        boolean isEqual = false;
        if (o1 == o2) {
            isEqual = true;
        }
        if (null == o1 || null == o2) {
            isEqual = false;
        } else {
            isEqual = o1.equals(o2);
        }
        return isEqual;
    }

    public int hashCode(final Object arg0) throws HibernateException {
        return arg0.hashCode();
    }

    public boolean isMutable() {
        return true;
    }

    public Object nullSafeGet(final ResultSet resultSet, final String[] names,
                              SessionImplementor sessionImp, final Object jmbgOwner)
            throws HibernateException, SQLException {
        System.out.println("nullSafeGet...");
        //must write custom native query in repo for this to work with NacinPlacanja alias
        return new NacinPlacanja(resultSet.getString("opis"), resultSet.getString("naziv"));
    }

    public void nullSafeSet(final PreparedStatement statement, final Object value, final int index,
                            SessionImplementor arg3) throws HibernateException, SQLException {
        if (value == null) {

            statement.setNull(index, SQL_TYPE, OBJECT_TYPE);

        } else {
            final NacinPlacanja addresssData = (NacinPlacanja) value;
            final Object[] values = new Object[]{addresssData.getOpis()};
            final Connection connection = statement.getConnection();
            final STRUCT struct = new STRUCT(StructDescriptor.createDescriptor(OBJECT_TYPE, connection), connection, values);
            statement.setObject(index, struct, SQL_TYPE);

        }

    }

    public Object replace(final Object original, final Object target,
                          final Object owner) throws HibernateException {
        return this.deepCopy(original);
    }

    @SuppressWarnings("rawtypes")
    public Class returnedClass() {
        return NacinPlacanja.class;
    }

    public int[] sqlTypes() {
        return new int[]{SQL_TYPE};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NacinPlacanja np1 = (NacinPlacanja) o;

        return (opis != null ? opis.equals(np1.opis) : np1.opis == null)
                && (naziv != null ? naziv.equals(np1.naziv) : np1.naziv == null);
    }

    @Override
    public int hashCode() {
        return (opis != null ? opis.hashCode() : 0) + (naziv != null ? naziv.hashCode() : 0);
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
