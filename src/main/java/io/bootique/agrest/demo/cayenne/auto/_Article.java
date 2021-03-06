package io.bootique.agrest.demo.cayenne.auto;

import java.util.Date;
import java.util.List;

import io.bootique.agrest.demo.cayenne.Domain;
import io.bootique.agrest.demo.cayenne.Tag;
import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Article was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Article extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> BODY = Property.create("body", String.class);
    public static final Property<Date> PUBLISHED_ON = Property.create("publishedOn", Date.class);
    public static final Property<String> TITLE = Property.create("title", String.class);
    public static final Property<Domain> DOMAIN = Property.create("domain", Domain.class);
    public static final Property<List<Tag>> TAGS = Property.create("tags", List.class);

    public void setBody(String body) {
        writeProperty("body", body);
    }
    public String getBody() {
        return (String)readProperty("body");
    }

    public void setPublishedOn(Date publishedOn) {
        writeProperty("publishedOn", publishedOn);
    }
    public Date getPublishedOn() {
        return (Date)readProperty("publishedOn");
    }

    public void setTitle(String title) {
        writeProperty("title", title);
    }
    public String getTitle() {
        return (String)readProperty("title");
    }

    public void setDomain(Domain domain) {
        setToOneTarget("domain", domain, true);
    }

    public Domain getDomain() {
        return (Domain)readProperty("domain");
    }


    public void addToTags(Tag obj) {
        addToManyTarget("tags", obj, true);
    }
    public void removeFromTags(Tag obj) {
        removeToManyTarget("tags", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Tag> getTags() {
        return (List<Tag>)readProperty("tags");
    }


    protected abstract void onPostAdd();

}
