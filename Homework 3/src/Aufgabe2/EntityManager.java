package Aufgabe2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EntityManager<T> {
    private List<T> entities;

    public EntityManager() {
        this.entities = new ArrayList<T>();
    }

    public void addEntity(T entity) {
        entities.add(entity);
    }

    public T getEntityByCriterion(Predicate criterion){
        for(T entity : entities){
            if(criterion.test(entity)){
                return entity;
            }
        }
        return null;
    }

    public List<T> getAllEntities() {
        return entities;
    }
}