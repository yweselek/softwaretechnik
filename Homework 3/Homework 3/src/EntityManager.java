import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EntityManager<Entity> {
    private List<Entity> entities;

    public EntityManager() {
        this.entities = new ArrayList<Entity>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public Entity getEntityById(String id) {
        for (Entity entity : entities) {
            if (entity instanceof User) {
                if(((User) entity).getId().equals(id)) {
                    return entity;
                }
            }
            if (entity instanceof Course) {
                if(((Course) entity).getCourseId().equals(id)) {
                    return entity;
                }
            }
            if (entity instanceof ExerciseGroup) {
                if(((ExerciseGroup) entity).getGroupID().equals(id)) {
                    return entity;
                }
            }

        }
        return null;
    }

    public List<Entity> getAllEntities() {
        return entities;
    }
}
