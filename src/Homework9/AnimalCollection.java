package Homework9;

import java.util.LinkedList;

// Класс для хранения коллекции животных
class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    // Метод добавления животного в начало коллекции
    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    // Метод удаления животного из конца коллекции
    public String removeLastAnimal() {
        if (animals.isEmpty()) {
            return null; // Или выбросить исключение, если удаление из пустой коллекции недопустимо
        }
        return animals.removeLast();
    }

    // Метод для получения текущего состояния коллекции (для удобства вывода)
    public LinkedList<String> getAnimals() {
        return animals; // Возвращает копию списка, чтобы избежать прямого изменения извне
    }
}
