package ua.com.karre.topjava.model;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public class BaseEntity {

    protected Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}