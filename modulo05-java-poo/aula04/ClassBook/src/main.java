public class main {
    public static void main(String[] args) {
        Book book = new BookImpl();
        System.out.println(book);
        ((BookImpl) book).setTitle("20000 leguas submarinas");
        System.out.println(book);
        book.emprestimo();
        System.out.println(book);
        book.devolver();
        System.out.println(book);
    }
}
