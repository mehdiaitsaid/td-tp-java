package com.tdtpjava.td3;

public class Ex6 {
    public static void main(String[] args) {
        Banque compte = new Banque(1, 5000.75f, "AB1200");
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
    }
}

class Banque{
    private int nCompte;
    private float solde;
    private String cin;

    public Banque(int nCompte, float solde, String cin) {
        this.nCompte = nCompte;
        this.solde = solde;
        this.cin = cin;
    }

    public void deposer(float solde){
        this.solde += solde;
    }
    public void retirer(float solde){
        if (this.solde > solde)
        this.solde -= solde;
    }

    public float avoirSolde() {
        return solde;
    }


    public String avoirInf() {
        return "Compte{" +
                "nCompte=" + nCompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
}
