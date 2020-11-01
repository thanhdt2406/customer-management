package controller;

import model.Customer;
import model.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controller.Edit",urlPatterns = "/edit")
public class Edit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        Customer customer = new Customer(ID,firstName,lastName,phoneNumber,address);
        DBUtils.edit(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/display");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("id"));
        List<Customer> list = new ArrayList<>();
        list.add(DBUtils.getCustomerByID(ID));
        request.setAttribute("list",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
        dispatcher.forward(request,response);
    }
}
