/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAO.Impl.SliderDAOImpl;
import Models.Slider;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;

/**
 *
 * @author hp
 */
@MultipartConfig
public class AddSlider extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddSlider</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddSlider at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher(request.getContextPath() + "slider/addslider.jsp").forward(request, response);
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
        SliderDAOImpl s = new SliderDAOImpl();
        FileUploadHelper helper = new FileUploadHelper();
        final String path = "C:\\Users\\hp\\Desktop";
        Part filePart = request.getPart("image"); // Retrieves <input type="file" name="thumbnail">
        String fileName = helper.getFileName(filePart); // getFilename from file part
        String image = null;
        helper.getFileContent(fileName, filePart, path);
        File fileUpload = new File(path + "\\" + fileName);
        if (!filePart.getSubmittedFileName().isEmpty()) {
            image = helper.getUrlCloudinaryForEditSlide(fileUpload, fileName);
        }
        String backlink = request.getParameter("backlink");
        String statusraw = request.getParameter("status1");
        String note = request.getParameter("note");
        String title = request.getParameter("title");
        try {
            int status = Integer.parseInt(statusraw);
            // Get image
            Slider sl1 = new Slider(-1, title, image, backlink, status, note);
            s.insert(sl1);

        } catch (NumberFormatException e) {

        }
//         s.updateSlider(1, title, image, backlink, 1, note);
        response.sendRedirect("sliders");
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
