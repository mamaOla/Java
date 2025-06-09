package Homework9;

// Класс для демонстрации работы AnimalCollection
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр AnimalCollection
        AnimalCollection animalCollection = new AnimalCollection();

        // Добавляем животных
        animalCollection.addAnimal("Собака");
        animalCollection.addAnimal("Кошка");
        animalCollection.addAnimal("Слон");
        animalCollection.addAnimal("Лев");

        System.out.println("Животные в коллекции: " + animalCollection.getAnimals()); // Output: [Лев, Слон, Кошка, Собака]

        // Удаляем животных
        String removedAnimal1 = animalCollection.removeLastAnimal();
        String removedAnimal2 = animalCollection.removeLastAnimal();

        System.out.println("Удаленное животное из конца: " + removedAnimal1); // Output: Собака
        System.out.println("Удаленное животное из конца: " + removedAnimal2); // Output: Кошка
        System.out.println("Животные в коллекции после удаления: " + animalCollection.getAnimals()); // Output: [Лев, Слон]

        // Проверяем удаление из пустой коллекции
        animalCollection.removeLastAnimal();
        animalCollection.removeLastAnimal();

        String removedAnimal3 = animalCollection.removeLastAnimal();
        if (removedAnimal3 == null) {
            System.out.println("Коллекция пуста, удаление невозможно.");
        }
    }
}
