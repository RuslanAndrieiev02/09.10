import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
Создайте класс товар Product с полями:
Создайте лист из 10 товаров с разными значениями
Задание 1
Получите лист товаров, которые стоят дороже 200 евро

 */

        List<Product>products=List.of(
            new Product("Computer",3,1_000,"Electronics"),
            new Product("TV",2,700,"Electronics"),
            new Product("Hair Dryer",1,40,"Electronics"),
            new Product("Coffee Machine",6,1_200,"Appliances"),
            new Product("Photo Machine",5,800,"Electronics"),
            new Product("Laptop",4,2_000,"Electronics"),
            new Product("Smart Clock",9,1_000,"Electronics"),
            new Product("Refrigerator",8,570,"Appliances"),
            new Product("Oven",7,650,"Appliances"),
            new Product("Printer",10,150,"Electronics")
        );
        System.out.println(products);


        List<Product> products1= products
                .stream()
                .filter(product -> product.getPrice() >200)
                .toList();
        System.out.println();
        System.out.println("-------------1-----------");
        System.out.println(products1);
    }

}
