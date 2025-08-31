public class Main {
    public static void main(String[] args) throws Exception {
        Person [ ] p = new Person[3];

        p[0] = new Person("Person's name", 30);
        p[1] = new Student("Student's name", 18, 5);
        p[2] = new Teacher("Programming", "Teacher's name", 30);

        for ( int i = 0; i < p.length; i++ )
            p[i].introduce();

    }
}

// In your Main:
// Create an array of Person objects that holds:
// One Person
// One Student
// One Teacher
// Use a for loop to call introduce() on each element.
// Expected behavior:
// Even though the array is of type Person[], Java will call the correct overridden method depending on whether the element is a Person, Student, or Teacher.