import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
Дан список Programmer(String name, String city, List<Task>  tasks).
 Каждый программист  имеет список задач Task (int Number, String description, Status status).
 Естественно,  Status это enum.  Сформировать список из всех незавершенных задач
 (т.е. имеют статус, отличный от «DONE») , которые относятся к программистам из Берлина.

 */List<Programmer> programmers = List.of(
                new Programmer("John Smith", "Berlin", List.of(
                        new Task(1, "make header", Status.UNDONE),
                        new Task(2, "make footer", Status.DONE)
                )),
                new Programmer("Bob Marley", "Paris", List.of(
                        new Task(3, "buy baguette", Status.UNDONE),
                        new Task(4, "eat croissant", Status.DONE)
                ))
        );
        List<Task> undoneTasksFromBerlin = programmers
                .stream()
                .filter(programmer -> programmer.getCity().equals("Berlin"))
                .flatMap(programmer -> programmer
                        .getTasks()
                        .stream()
                        .filter(task-> !task.getStatus().equals(Status.DONE)))
                .toList();
        System.out.println(undoneTasksFromBerlin);


    }

}
