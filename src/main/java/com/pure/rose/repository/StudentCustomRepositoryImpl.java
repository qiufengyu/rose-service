package com.pure.rose.repository;

import com.pure.rose.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

public class StudentCustomRepositoryImpl implements StudentCustomRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Student> findStudentByStatus(String status) {
        Query query = entityManager.createNativeQuery("SELECT * FROM student s where s.status = ?1 limit 1 for update", Student.class)
                .setParameter(1, status);
        List<Student> s = (List<Student>)query.getResultList();
        return s;
    }

    @Override
    public Student findStudentById(Integer id) {
        Query query = entityManager.createNativeQuery("SELECT * FROM student s where s.id = ?1 for update", Student.class)
                .setParameter(1, id);
        Student s = (Student)query.getSingleResult();
        return s;
    }

    @Override
    public void updateStudentById(Integer id, String status) {
        entityManager.createNativeQuery("UPDATE student s set s.status = ?1 where s.id = ?2")
                .setParameter(1, status)
                .setParameter(2, id)
                .executeUpdate();
    }

}
