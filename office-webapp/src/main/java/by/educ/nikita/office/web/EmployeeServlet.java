package by.educ.nikita.office.web;

import by.educ.nikita.office.model.Employee;
import by.educ.nikita.office.service.factory.ServiceFactoryImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Collection<Employee> employees = new ServiceFactoryImpl().getEmployeeService().getAllEmployees();
        req.setAttribute("employees", employees);
        req.getRequestDispatcher("/employeeView.jsp").forward(req, resp);
    }
}
