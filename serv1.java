package com.lueinfoservices.servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {


            if (OWASP.equalsIgnoreCase("Injection Flaws")) {
                RequestDispatcher rd = request.getRequestDispatcher("injection.jsp");
                rd.forward(request, response);

            } else if (OWASP.equalsIgnoreCase("Broken Authentication and Session Management")) {
                RequestDispatcher rd = request.getRequestDispatcher("brokenauthentication.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Cross-Site Scripting")) {
                RequestDispatcher rd = request.getRequestDispatcher("crosssite.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Insecure Direct Object References")) {
                RequestDispatcher rd = request.getRequestDispatcher("insecuredirect.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Security Misconfiguration")) {
                RequestDispatcher rd = request.getRequestDispatcher("securitymisconfiguration.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Sensitive Data Exposure")) {
                RequestDispatcher rd = request.getRequestDispatcher("sensitivedataexposure.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Missing Function Level Access Control")) {
                RequestDispatcher rd = request.getRequestDispatcher("missingfunctionlevel.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Cross-Site Request Forgery (CSRF)")) {
                RequestDispatcher rd = request.getRequestDispatcher("csrf.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Using Known Vulnerable Components")) {
                RequestDispatcher rd = request.getRequestDispatcher("usingknown.jsp");
                rd.forward(request, response);
            } else if (OWASP.equalsIgnoreCase("Unvalidated Redirects and Forwards")) {
                RequestDispatcher rd = request.getRequestDispatcher("unvalidatedredirects.jsp");
                rd.forward(request, response);
            }
            else {
                RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        }
        }
    }
}
