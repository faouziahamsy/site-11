/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.google.gson.Gson;
import entities.Categorie;
import entities.Marque;
import entities.Produit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.metamodel.SetAttribute;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.CategorieServices;
import services.MarqueServices;
import services.ProduitServices;

/**
 *
 * @author DELL
 */
@WebServlet("/admin/*")
public class AdminController extends HttpServlet {
    private ProduitServices produitServices;
    private Marque marque;
    private MarqueServices marqueServices;
    private CategorieServices categorieServices;
public void init(){
    marqueServices = new MarqueServices();
    produitServices = new ProduitServices();
    categorieServices = new CategorieServices();
}

    protected void FormProduit(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        List<Marque> marques = marqueServices.findMarques();
        request.setAttribute("marques", marques);      
        List<Categorie> categories =categorieServices.listCategories();
      request.setAttribute("categories", categories);       
      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Produit.jsp");
      dispatcher.forward(request, response);    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {         
          String url[] = request.getPathInfo().split("/");           
         String action = url[1];
          switch(action){
          case "FormProduct" : FormProduit(request,response);
          break;
          case "AddProduct" : AddProduct(request,response);
          break;
          case "FormCategorie" : FormCategorie(request,response);
          break;  
          case "AddCategorie"  :AddCategorie(request,response); 
          break;  
          case "FormMarque" : FormMarque(request,response);
          break;  
          case "AddMarque"  :AddMarque(request,response); 
          break;  
          case "produits"  :getProduit(request,response); 
          break;
          case "listMarques"  :listMarques(request,response); 
          break;
          case "deleteMarque" : deleteMarque(request,response);
          default : FormProduit(request,response);
          break;           
              
          }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        //processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void AddProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
      String nom = request.getParameter("nom");
      String designation = request.getParameter("designation");
      double prix = Double.parseDouble(request.getParameter("prix"));
      String image = request.getParameter("image");
      int unite = Integer.parseInt(request.getParameter("unite"));
       int marque = Integer.parseInt(request.getParameter("marque"));
       Marque m = marqueServices.findMarqueById(marque);
      int categorie = Integer.parseInt(request.getParameter("categorie"));
      Categorie c = categorieServices.findCategorieById(categorie);
      if(produitServices.AddProduit(new Produit(nom, designation, designation, prix, image, unite, m, c)))
      {
          response.getWriter().append("Produit bien ajouté");
      }
    }
    private void getProduit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      List<Produit> produits = produitServices.findAllProduits();
      request.setAttribute("produits", produits);
      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/test.jsp");
      dispatcher.forward(request, response);    
    }

    private void FormCategorie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/categorieform.jsp");
      dispatcher.forward(request, response);    
    }

    private void AddCategorie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String categorie = request.getParameter("categorie");
        if(categorieServices.AddCategorie(new Categorie(categorie))){
            response.getWriter().append("Categorie bien ajouté");
        }
    }

    private void FormMarque(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/marqueform.jsp");
      dispatcher.forward(request, response);
    }

    private void AddMarque(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String marque = request.getParameter("marque");
        if(marqueServices.AddMarque(new Marque(marque))){
            response.getWriter().append("Marque bien ajouté");
        }
    }

    private void listMarques(HttpServletRequest request, HttpServletResponse response) throws IOException {
         response.setContentType("application/json");
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(marqueServices.findMarques()));
       
    }

    private void deleteMarque(HttpServletRequest request, HttpServletResponse response) throws IOException {
         try{
            int id = Integer.parseInt(request.getParameter("id"));
       marqueServices.deleteMarque(marqueServices.findMarqueById(id));
       }catch(NumberFormatException e){          
       }
         listMarques(request,response);
    }

  
}
