package todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteToDoServlet extends HttpServlet {

    private final ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        super.doGet(httpServletRequest, httpServletResponse);

        toDoService.deleteTodo(new ToDo(request.getParameter("todo"), request.getParameter("category")));

        response.sendRedirect("/todo.do");

    }

}
