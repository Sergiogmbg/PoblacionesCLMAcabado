/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Utilidades;

/**
 *
 * @author Usuario1
 */
public class Poblaciones extends HttpServlet {
   private ArrayList<String> provincias;
   private String rutaFicheros;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
   public void init( ServletConfig config ) throws ServletException {
       
       provincias = new ArrayList<String>();
       provincias.add("Albacete");
       provincias.add("CiudadReal");
       provincias.add("Cuenca");
       provincias.add("Guadalajara");
       provincias.add("Toledo");
       rutaFicheros = config.getServletContext().getRealPath("").concat(File.separator).concat("ficheros");
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
       ArrayList<String> pueblos = Utilidades.getPoblaciones(rutaFicheros.concat(File.separator).concat("Albacete.txt"));
       request.setAttribute("provincias", provincias);
       request.setAttribute("provincia", "Albacete");
       request.setAttribute("pueblos", pueblos);
       request.getRequestDispatcher("pueblos.jsp").forward(request, response);
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
