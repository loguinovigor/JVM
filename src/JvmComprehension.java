
public class JvmComprehension {

    public static void main(String[] args) { /* Метаспейс: Метод main загружается в метаспейс,
                                             где хранятся метаданные классов и методов
                                             Стэк: Создается фрейм для метода main в стэке. */
        int i = 1;                      // Стэк: Переменная i примитивного типа int создается и сохраняется в текущем фрейме стэка.
        Object o = new Object();        /*Хип: Создается новый объект Object в хипе.
                                        Стэк: Ссылка на объект o сохраняется в текущем фрейме стэка. */
        Integer ii = 2;                 /* Хип: Создается объект Integer со значением 2 в хипе.
                                        Стэк: Ссылка на объект ii сохраняется в текущем фрейме стэка.*/
        printAll(o, i, ii);             // Стэк: Создается новый фрейм для метода printAll и передаются ссылки на o, i и ii.
        System.out.println("finished"); /* Хип: Создается строка "finished" в хипе.
                                           Стэк: Ссылка на строку передается методу println, который выводит ее на консоль.*/
    }

    private static void printAll(Object o, int i, Integer ii) { /* Метаспейс: Метод printAll загружается в метаспейс.
                                                                Стэк: Создается фрейм для метода printAll. */
        Integer uselessVar = 700;                   /* Хип: Создается объект Integer со значением 700 в хипе.
                                                       Стэк: Ссылка на объект uselessVar сохраняется в текущем фрейме стэка. */
        System.out.println(o.toString() + i + ii); /* Хип: Создаются временные строки и объекты для конкатенации.
                                                   Стэк: Ссылки на временные объекты передаются методу println, который выводит результат на консоль.*/
    }
}


/* Сборщик мусора: После завершения методов main и printAll,
   объекты, на которые больше нет ссылок, становятся кандидатами для удаления сборщиком мусора*/