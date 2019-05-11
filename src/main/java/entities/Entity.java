package entities;

import javax.annotation.PostConstruct;
import java.util.Random;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Entity {
    protected String description;
    protected String id;

    @PostConstruct
    public void init() {
        this.id = this.getClass().getSimpleName();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }


    public Boolean compareID(String id) {
        return this.id.equalsIgnoreCase(id);
    }

    protected Integer getRandomInt(int x, int y) {
        return new Random().nextInt(y - x) + x;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
