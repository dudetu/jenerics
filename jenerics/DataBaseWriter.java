package jenerics;

public class DataBaseWriter<T> {
    //Здесь мы объявляем обобщенный тип T для значения поля.
    // Конструктор берет за основу два аргумента - имя данных и значение для собрания.
    // Метод сохранения выводит сообщение на экран со сведениями о типе данных, используя метод getClass() и метод getSimpleName(), который возвращает простое имя класса без пакета.
    private String database;
    private T value;

    public DataBaseWriter(String database, T value) {
        this.database = database;
        this.value = value;
    }


    public void save() {

        DataBaseWriter<String> writer = new DataBaseWriter<>("mydb", "Hello World!");
        writer.save(); // выводит: Данные в базу данных mydb записаны, тип данных = String

        DataBaseWriter<Integer> writer2 = new DataBaseWriter<>("mydb", 123);
        writer2.save(); // выводит: Данные в базу данных mydb записаны, тип данных = Integer


        System.out.println("Данные в базу данных " + database + " записаны, тип данных = " + value.getClass().getSimpleName());
    }


}
