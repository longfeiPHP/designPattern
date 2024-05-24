package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        if (false) {
            List<String> list = new ArrayList<>();
            list.add("第一个");
            list.add("第二个");
            list.forEach(ele -> System.out.println(ele));

            Map<String, List<String>> map = new HashMap<>();
            map.put("abc", list);
            System.out.println(map.get("abc"));

            Book book1 = new Book(1, "唐诗三百首", 8);
            Book book2 = new Book(2, "小星星", 12);
            Book book3 = new Book(3, "成语大全", 22);

            /*把Book对象放到map中*/
            Map<Integer, Book> books = new HashMap<Integer, Book>();
            books.put(1001, book1);
            books.put(1002, book2);
            books.put(1003, book3);
            for (Integer id : books.keySet()) {
                System.out.println(books.get(id));
            }
            /*把Book放到list中*/
            List<Book> bookList = new ArrayList<>();
            bookList.add(book1);
            bookList.add(book2);
            bookList.add(book3);
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
        }
        /*泛类型*/
        Stu<String, Integer, Character> stu = new Stu<>("张晓玲", 28, '女');
        System.out.println(stu);
    }
}
