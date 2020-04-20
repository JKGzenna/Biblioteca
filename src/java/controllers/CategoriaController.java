package controllers;

import dao.CategoriaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Categoria;

/**
 *
 * @author formacion
 */
public class CategoriaController extends HttpServlet {

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

        String nombre = request.getParameter("nombre");
        Categoria c = new Categoria();
        c.setNombre(nombre);
        if (request.getParameter("Registrar")!= null){
            if(CategoriaDAO.registrar(c)){
                request.setAttribute("mensaje","La Categoria se ha registrado correctamente");
            }else{
                request.setAttribute("mensaje","No se ha podido registrar la categoria");
            }
        }else if (request.getParameter("Eliminar")!= null){
            if (CategoriaDAO.eliminar(c)){
                request.setAttribute("mensaje", "Se ha eliminado la Categoria");
            }else{
                request.setAttribute("mensaje", "No se ha podido eliminar la Categoria");
            }
        }else{
            request.setAttribute("mensaje", "Acción desconocida");
        }
        request.getRequestDispatcher("registroCategoria.jsp").forward(request, response);
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

