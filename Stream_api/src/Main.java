import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // forEach
        // method reference - ссылка на метод
        List<Panda> pandas = List.of(
                new Panda("Po", 60_000),
                new Panda("Boo", 65_000),
                new Panda("Small Jay", 40_000)
        );
        //хочу изменить исходные значения - мутировать
        // Method ref: ClassName::methodName
        pandas.forEach(Panda::eatBamboo);
        System.out.println(pandas);
        // Операции - бывают:
        //- intermediate - промежуточные
        //- terminal - последняя в цепочке методов -
        // после нее мы уже не можем продолжать

        // reduce - свидение к какому-то
        double totalWeight = pandas
                .stream()
                .map(Panda::getWeight)
                // пока не заменили на метод референс было так
                //(a,b) -> a+b
                .reduce(0.0, Double::sum);
        // limit
        List<String> animals = List.of(
                "Panda", "Lion", "Giraffe",
                "Monkey", "Rat", "Monkey"
        );
        //
        //limit- возвращает указанное количество элементов начиная с первого
        List<String> limited =
                animals.stream().limit(2).toList();
        System.out.println(limited);
        System.out.println("------------------------");
        //skip - первые указанное элементов опускаеться\пропускаються
        //если указали цифру 3 - первые тр элемента будут пропущенны
        List<String> skipedanimals =
                animals.stream().limit(2).toList();
        animals.stream().skip(2).toList();
        System.out.println(skipedanimals);
//distrinct == различные - оставит только уникальные элементы
        //
        List<String> uniqueAnimals =
                animals.stream().distinct().toList();
        System.out.println(uniqueAnimals);
        // sorted
        //Хочу отсортировать по количеству букв в словах
        List<String> sortedAnimal =
                animals.stream()
                        .sorted(
                                (a, b) -> Integer.compare(a.length(), b.length()))
//                Альтернативная версия: Comparator.comparingInt(String::length)
                        .toList();
        System.out.println(sortedAnimal);
        // Terminal operations:
        // reduce, forEach - мы рассмотрели выше
        // findAny
        Optional<Panda> panda =
                pandas.stream()
                        .filter(a -> a.getTitle().equals("Po")).findFirst();
        // anyMatch-  проверяет есл ли хотя бы один элемент удолетворяющий условию
       // то есть предикарту
       boolean poExist= pandas.stream()
               .allMatch(a->a.getTitle().equals("Po"));
        System.out.println(poExist);
        // allMatch - тоже самое но удолетворяют ли все элементы условию
        boolean allPandasArePo= panda.stream()
                .allMatch(a->a.getTitle().equals("Po"));
        System.out.println(allPandasArePo);
    }
}
