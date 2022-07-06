package fr.simplon;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import fr.simplon.model.Article;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("BD_hibernate");
            entityManager = entityManagerFactory.createEntityManager();

            System.out.println("- Lecture de tous les articles -----------");

            List<Article> articles = entityManager.createQuery("from Article", Article.class)
                    .getResultList();
            for (Article article : articles) {
                System.out.println(article);
            }

            // System.out.println( "- Insertion d'un nouvel article ----------" );

            // EntityTransaction trans = entityManager.getTransaction();
            // trans.begin();

            // Article newArticle = new Article( "DBS", "Aston Martin", 200000 );
            // entityManager.persist( newArticle );

            // List<Article> results = entityManager.createQuery("from Article",
            // Article.class).getResultList();
            // for( Article article : results) {
            // System.out.println( article );
            // }

            // System.out.println( "- Modification d'un article --------------" );

            // newArticle.setPrice( 40000 );
            // entityManager.persist( newArticle );

            // results = entityManager.createQuery("from Article",
            // Article.class).getResultList();
            // for( Article article : results) {
            // System.out.println( article );
            // }

            // System.out.println( "- Suppression d'un article ---------------" );

            // entityManager.remove( newArticle );

            // results = entityManager.createQuery("from Article",
            // Article.class).getResultList();
            // for( Article article : results) {
            // System.out.println( article );
            // }

            // trans.commit();
        } finally {
            if (entityManager != null)
                entityManager.close();
            if (entityManagerFactory != null)
                entityManagerFactory.close();
        }
    }
}