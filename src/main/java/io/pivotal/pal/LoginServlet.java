package io.pivotal.pal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final String username = "palstudent@pivotal.io";
    private final String password = "super-secret";
    private final String phoneNumber = "(720) 328-1446";

    private final Integer INACTIVITY_TIMEOUT = 30 * 60;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String submittedUsername = req.getParameter("username");
        String submittedPassword = req.getParameter("password");

        if(submittedUsername.equals(username) && submittedPassword.equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            session.setAttribute("phoneNumber", phoneNumber);

            session.setMaxInactiveInterval(INACTIVITY_TIMEOUT);

            resp.sendRedirect("/profile");
        }
    }
}