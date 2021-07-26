package todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {

    private static List<ToDo> todos = new ArrayList<>();

    static {
        todos.add(new ToDo("Learn Web Application Dev", "Study"));
        todos.add(new ToDo("Learn Spring MVC", "Study"));
        todos.add(new ToDo("Learn SOAP and REST", "Study"));
    }

    public void addTodo(ToDo todo){
        todos.add(todo);
    }

    public void deleteTodo(ToDo todo){
        todos.remove(todo);
    }

    public List<ToDo> getTodos(){
        return todos;
    }

}
