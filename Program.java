public class Program {
    public static void main(String[] args) {
        Student student = new Student("student1");

        LibraryResource book = new Book("book1");
        LibraryResource journal = new Journal("journal1");
        LibraryResource thesis = new Thesis("thesis1");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
    }
}
