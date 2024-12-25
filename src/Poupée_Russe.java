public class Poupée_Russe {
    int taille;
    boolean etat;
    Poupée_Russe containe;
    Poupée_Russe containedans;

    public Poupée_Russe(int taille) {
        this.taille = taille;
        this.etat =false;
        this.containe = null;
        this.containedans = null;
    }
    void ouvrir(){
        if (!etat && containedans==null){
            etat=true;
            System.out.println("poupé russe "+taille +"ouvrte");
        }else System.out.println("poupée russe "+taille+"déja ouverte");
    }
    void fermer(){
        if (etat && containedans!=null){
            etat=false;
        }
    }
    void placerDans(Poupée_Russe p){
        if ( !etat && containedans==null&& p.etat && p.containedans==null && p.taille > this.taille){
            p.containe=this;
            this.containedans=p;
        }
    }
    void sortieDe(Poupée_Russe p){
        if (containedans==p && p.etat){
            p.containe=this;
            p.containedans=null;
        }
    }

    public static void main(String[] args) {
        Poupée_Russe grande=new Poupée_Russe(20);
        Poupée_Russe petit=new Poupée_Russe(10);
        grande.ouvrir();
        petit.fermer();
        grande.placerDans(petit);

    }
}
