package org.launchcode.models.data;


import org.launchcode.models.Cheese;

public class CheeseDaoImpl implements CheeseDao{


    @Override
    public <S extends Cheese> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Cheese> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Cheese findOne(Integer integer) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Cheese> findAll() {
        return null;
    }

    @Override
    public Iterable<Cheese> findAll(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void delete(Cheese entity) {

    }

    @Override
    public void delete(Iterable<? extends Cheese> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
