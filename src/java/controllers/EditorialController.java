/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.EditorialDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Editorial;

/**
 *
 * @author JK Gzenna
 */
public class EditorialController extends HttpServlet {

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

                
        String nit=request.getParameter("nit");
        String nombre=request.getParameter("nombre");
        String telefono=request.getParameter("telefono");
        String direccion=request.getParameter("direccion");
        String email=request.getParameter("email");
        String sitioweb=request.getParameter("sitioweb");
        
        Editorial e = new Editorial();
        e.setNit (nit);
        e.setNombre (nombre);
        e.setTelefono (telefono);
        e.setDireccion (direccion);
        e.setEmail (email);
        e.setSitioweb (sitioweb);
        
        if (request.getParameter("Registrar")!= null){
            if(EditorialDAO.registrar(e)){
                request.setAttribute("mensaje","La Editorial se ha registrado correctamente");
            }else{
                request.setAttribute("mensaje","No se ha podido registrar la Editorial");
            }
        }else if (request.getParameter("Actualizar")!= null){
            if (EditorialDAO.actualizar(e)){
                request.setAttribute("mensaje","Se ha actualizado la Editorial correctamente");
            }else{
                request.setAttribute("mensaje","Los datos de la Editorial no se han podido actualizar");
            }
        }else if (request.getParameter("Eliminar")!= null){
            if (EditorialDAO.eliminar(e)){
                request.setAttribute("mensaje", "Se ha eliminado la Editorial");
            }else{
                request.setAttribute("mensaje", "No se ha podido eliminar la Editorial");
            }
        }else{
            request.setAttribute("mensaje", "Acción desconocida");
        }
        request.getRequestDispatcher("registroEditorial.jsp").forward(request, response);
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
