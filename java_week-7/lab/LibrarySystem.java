class LibraryUser {
    protected String name;

    public LibraryUser(String name) { this.name = name; }

    public void enterLibrary() {
        System.out.println(name + " entered the library.");
    }
}

class StudentUser extends LibraryUser {
    public StudentUser(String name) { super(name); }

    public void borrowBook() { System.out.println(name + " borrowed a book."); }
}

class FacultyUser extends LibraryUser {
    public FacultyUser(String name) { super(name); }

    public void reserveBook() { System.out.println(name + " reserved a book."); }
}

class GuestUser extends LibraryUser {
    public GuestUser(String name) { super(name); }

    public void browseBooks() { System.out.println(name + " is browsing books."); }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryUser[] users = {
            new StudentUser("Alice"),
            new FacultyUser("Prof. Bob"),
            new GuestUser("Charlie")
        };

        for (LibraryUser u : users) {
            u.enterLibrary(); // Works for all
            // u.borrowBook(); // ❌ Cannot call subclass-specific methods
        }
    }
}
