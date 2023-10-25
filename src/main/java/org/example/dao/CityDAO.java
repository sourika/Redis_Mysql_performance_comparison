package org.example.dao;

import org.example.entity.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;


public class CityDAO {

    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<City> getItems(int offset, int limit) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery("from City", City.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public Long getTotalCount() {
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("select count (*) from City", Long.class);
        return query.getSingleResult();
    }

    public City getById(Integer id) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery("select c from City c join fetch c.country where c.id = :ID", City.class);
        query.setParameter("ID", id);
        return query.getSingleResult();
    }
}
