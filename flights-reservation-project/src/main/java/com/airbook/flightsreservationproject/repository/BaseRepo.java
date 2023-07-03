package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.models.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;

import java.util.List;

@Repository
public abstract class BaseRepo<T> {

//    @PersistenceUnit
//    @Autowired
//    private EntityManagerFactory entityManagerFactory;

    @PersistenceContext
    @Autowired
    private EntityManager em; // ем прави транзакциите

    public abstract String getEntityName();

    @Transactional
    public void create(T baseEntity) {
//       EntityManager em = entityManagerFactory.createEntityManager();
        try {
            //Airline airline = new Airline("Bulgaria Air", "Bulgaria", "Sofia", "BG-75");
            em.persist(baseEntity);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Transactional
    public void delete(Long id) {
//        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            String jpql = "delete from "+ getEntityName()  ;
            em.createQuery(jpql + " where id = :id")
                    .setParameter("id",id)
                    .executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Transactional
    public List<T> findAll() {
        return em.createQuery("from " + getEntityName()).getResultList();

    }


}
