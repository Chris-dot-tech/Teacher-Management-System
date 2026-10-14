
package DAOImpl;

import DTO.Teacher;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import DAO.Dao;

public class Daoimpl implements Dao {

    static SessionFactory sf = new Configuration()
            .configure()
            .addAnnotatedClass(Teacher.class)
            .buildSessionFactory();

    public void addTeacher(Teacher teacher) {

        Session os = sf.openSession();

        Transaction tr = os.beginTransaction();

        try {
            Serializable id = os.save(teacher);

            System.out.println(id);

            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            os.close();
        }
    }

    public void fetchAll() {

        Session os = sf.openSession();

        try {
            String hql = "From Teacher";

            Query<Teacher> q = os.createQuery(hql,Teacher.class);

            List<Teacher> l = q.list();

            for (Object s : l) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            os.close();
        }
    }

    public void getTeacherById(int id) {

        Session os = sf.openSession();

        Transaction tr = os.beginTransaction();

        try {
            Teacher t = os.get(Teacher.class, id);

            System.out.println(t);

            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            os.close();
        }
    }

    public void updateTeacher(Teacher teacher) {

        Session os = sf.openSession();

        Transaction tr = os.beginTransaction();

        try {
            os.update(teacher);

            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            os.close();
        }
    }

    public void deleteTeacher(int id) {

        Session os = sf.openSession();

        Transaction tr = os.beginTransaction();

        try {
            Teacher t = os.get(Teacher.class, id);

            os.delete(t);

            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            os.close();
        }
    }
}
