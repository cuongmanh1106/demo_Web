/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.ReadQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.m_loai_san_pham;

/**
 *
 * @author TienDinh
 */
@WebServlet(name = "Update_loai_san_pham", urlPatterns = {"/Update_loai_san_pham"})
public class Update_loai_san_pham extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Update_loai_san_pham</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Update_loai_san_pham at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        
        //pass execution on to doPost
        doPost(request,response);
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
        
        int ma_loai = Integer.parseInt(request.getParameter("ma_loai"));
        String ten_loai = request.getParameter("ten_loai");
        String mo_ta = request.getParameter("mo_ta");
        int ma_loai_cha = Integer.parseInt(request.getParameter("ma_loai_cha"));
        
        ReadQuery rq = new ReadQuery();
        
        m_loai_san_pham l = new m_loai_san_pham();
        
        l.setMa_loai(ma_loai);
        l.setMa_loai_cha(ma_loai_cha);
        l.setTen_loai(ten_loai);
        l.setMo_ta(mo_ta);
        
        
        rq.doUpdate(l);
        
        String url = "/read_lsp";
        RequestDispatcher dis = request.getRequestDispatcher(url);
        dis.forward(request, response);
        
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
