package istic.taa.wkapp.repository;

import javax.persistence.EntityManager;

public abstract class EntityDAO {
    protected EntityManager manager;

    protected EntityDAO(EntityManager manager){
        this.manager = manager;
    }

    public EntityManager getManager() {
        return this.manager;
    }
}
