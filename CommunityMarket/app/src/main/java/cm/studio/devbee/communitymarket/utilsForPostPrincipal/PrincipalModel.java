package cm.studio.devbee.communitymarket.utilsForPostPrincipal;

import cm.studio.devbee.communitymarket.utilsForNouveautes.PostId;

public class PrincipalModel extends PostId{

    private String decription_du_produit;
    private String date_de_publication;
    private String nom_du_produit;
    private String prix_du_produit;
    public  String image_du_produit;
    private String user_image;
    private String like;
    private String utilisateur;
    private String categories;
    String post_id;

    public PrincipalModel(){

    }

    public PrincipalModel(String decription_du_produit, String date_de_publication, String nom_du_produit, String prix_du_produit, String image_du_produit, String user_image, String like, String utilisateur, String categories, String post_id) {
        this.decription_du_produit = decription_du_produit;
        this.date_de_publication = date_de_publication;
        this.nom_du_produit = nom_du_produit;
        this.prix_du_produit = prix_du_produit;
        this.image_du_produit = image_du_produit;
        this.user_image = user_image;
        this.like = like;
        this.utilisateur = utilisateur;
        this.categories = categories;
        this.post_id = post_id;
    }

    public String getDecription_du_produit() {
        return decription_du_produit;
    }

    public void setDecription_du_produit(String decription_du_produit) {
        this.decription_du_produit = decription_du_produit;
    }

    public String getDate_de_publication() {
        return date_de_publication;
    }

    public void setDate_de_publication(String date_de_publication) {
        this.date_de_publication = date_de_publication;
    }

    public String getNom_du_produit() {
        return nom_du_produit;
    }

    public void setNom_du_produit(String nom_du_produit) {
        this.nom_du_produit = nom_du_produit;
    }

    public String getPrix_du_produit() {
        return prix_du_produit;
    }

    public void setPrix_du_produit(String prix_du_produit) {
        this.prix_du_produit = prix_du_produit;
    }

    public String getImage_du_produit() {
        return image_du_produit;
    }

    public void setImage_du_produit(String image_du_produit) {
        this.image_du_produit = image_du_produit;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }
}
