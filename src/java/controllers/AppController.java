/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import entities.Categorie;
import entities.Marque;
import entities.Produit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.jasper.tagplugins.jstl.ForEach;
import services.CategorieServices;
import services.MarqueServices;
import services.ProduitServices;

/**
 *
 * @author faouzia
 */
@WebServlet("/app*")
public class AppController extends HttpServlet {
private ProduitServices produitServices;
private MarqueServices marqueServices;
private CategorieServices categorieServices;
public void init (){
    produitServices = new ProduitServices();
}
 Produit produit = new Produit();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }
    protected void getProduits(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        
        List<Produit> produits = produitServices.findAllProduits();
        request.setAttribute("produits", produits);
        for(Produit produit : produits){
            response.getWriter().append( produit.getNom());
        
        }
        //RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
         //dispatcher.forward(request, response);
    }
   
    
       protected void AjouterProduit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String nom = request.getParameter("nom");
       String designation = request.getParameter("designation");
        double prix = Double.parseDouble(request.getParameter("prix"));
        String image = request.getParameter("image");
        int unite = Integer.parseInt(request.getParameter("unite"));
        
        produitServices.AddProduit(new Produit(nom, designation, designation, prix, image, unite));
    }

       
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
          String url = request.getRequestURI().toString();
           String action[] = url.substring(1).split("/");           
           response.setContentType("text/html;charset=UTF-8");
           PrintWriter out = response.getWriter();
           try{
            switch(action[1]){
            case "produits" : getProduits(request,response);
            break;
            default : getProduits(request,response);
            break;           
           // case "addproduits" : addProduits();
            }            
               out.println(action[1]);
           }finally{
               out.close();
           }

        processRequest(request, response);
}
         
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
