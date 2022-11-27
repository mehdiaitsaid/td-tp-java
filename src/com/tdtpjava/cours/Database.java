package com.tdtpjava.cours;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    public static void main(String[] args) {


        String dburl = "jdbc:mariadb://185.224.137.7:3306/u539775000_lst_sitd";
        String username = "u539775000_lst_sitd";
        String password = "aqw147XSZ";
        try {
            Connection cx = DriverManager.getConnection(dburl, username, password);
            System.out.println("Connecté avec succès");

//            String sql = "create table IF NOT EXISTS etudiants\n" +
//                    "(\n" +
//                    "    id     int auto_increment\n" +
//                    "        primary key,\n" +
//                    "    nom    varchar(250) charset utf8 null,\n" +
//                    "    prenom varchar(250) charset utf8 null,\n" +
//                    "    email  varchar(250) charset utf8 null,\n" +
//                    "    cne    varchar(250) charset utf8 null\n" +
//                    ");";
//            Statement stmt = cx.createStatement();
//            stmt.executeQuery(sql);
//            System.out.println("Un nouveau tableau a été créé avec succès!");


            String sql = "SELECT * FROM etudiants";
            ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
            Statement statement = cx.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                Etudiant etd = new Etudiant();
                etd.setId(result.getInt("id"));
                etd.setNom(result.getString("nom"));
                etd.setPrenom(result.getString("prenom"));
                etd.setEmail(result.getString("email"));
                etd.setCne(result.getString("cne"));
                etudiants.add(etd);
            }
            for (Etudiant e: etudiants
                 ) {
                System.out.println(e.getNom());
            }

//            String sql = "INSERT INTO etudiants (nom, prenom, email, cne) VALUES (?, ?, ?, ?)";
//
//            Etudiant etudiant = new Etudiant("Mehdi","Amine","amine@gmail.com", "111111111");
//            PreparedStatement statement = cx.prepareStatement(sql);
//            statement.setString(1, etudiant.getNom());
//            statement.setString(2, etudiant.getPrenom());
//            statement.setString(3, etudiant.getEmail());
//            statement.setString(4, etudiant.getCne());
//            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("Un nouveau étudiant a été inséré avec succès!");
//            }


        } catch (SQLException ex) {
            System.out.println("Une erreur s'est produite");
        }


//
//
//
//        String sql = "SELECT * FROM etudiants";
//        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
//        Statement statement = connection.createStatement();
//        ResultSet result = statement.executeQuery(sql);
//        while (result.next()){
//            etudiants.add( new Etudiant()
//                    .setId(result.getInt("id"))
//                    .setNom(result.getString("nom"))
//                    .setPrenom(result.getString("prenom"))
//                    .setEmail(result.getString("email"))
//                    .setCne(result.getString("cne"))
//            );}
//
//
//        String sql = "INSERT INTO etudiants (nom, prenom, email, cne) VALUES (?, ?, ?, ?)";
//
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setString(1, etudiant.getNom());
//        statement.setString(2, etudiant.getPrenom());
//        statement.setString(3, etudiant.getEmail());
//        statement.setString(4, etudiant.getCne());
//        int rowsInserted = statement.executeUpdate();
//        if (rowsInserted > 0) {
//            System.out.println("Un nouveau étudiant a été inséré avec succès!");
//        }


    }
}

class Etudiant {

    private int id;
    private String nom, prenom, email, cne;

    public Etudiant() {
    }

    public Etudiant( String nom, String prenom, String email, String cne) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.cne = cne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
}
