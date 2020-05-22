package test.java.lesson9;

public class A_First {
    public static void main(String[] args) {
        String tel = "+38(050) asdas1-135-45 45"; //38050XXXXXXXXX
        String res = tel
                .replace("+", "")
                .replace("(", "")
                .replace(")", "")
                .replace(" ", "")
                .replace("-", "");
        String res2 = tel.replaceAll("^", "");
        System.out.println(res);
        System.out.println(res2);
        String[] arr = {
                "Ноутбуки и компьютеры",
                "Смартфоны, ТВ и электроника",
                "Бытовая техника",
                "Товары для дома",
                "Инструменты и автотовары", "Сантехника и ремонт", "Дача, сад и огород", "Спорт и увлечения", "Одежда, обувь и украшения",
                "Красота и здоровье", "Детские товары", "Канцтовары и книги", "Алкогольные напитки и продукты", "Товары для бизнеса",
                "Услуги и сервисы", "Лето ждет! Сейл до 50%", "Продовольственные наборы"};
    }
}
