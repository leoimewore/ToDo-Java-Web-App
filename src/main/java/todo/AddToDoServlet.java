package todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddToDoServlet extends HttpServlet {
    private final ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(httpServletRequest,httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //super.doPost(httpServletRequest, httpServletResponse);

        String todo = request.getParameter("todo");

        String category = request.getParameter("category");

        toDoService.addTodo(new ToDo(todo, category));

        response.sendRedirect("/todo.do");


    }
}