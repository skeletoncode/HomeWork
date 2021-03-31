package Task6.Ferum.too.Gate;

public class Author {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 1 )
        {
            throw new IllegalArgumentException("не корректоное имя  < 2");
        }

        this.name = name;
    }

    public String getSurname() {



        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.trim().length() < 2 )
        {
            throw new IllegalArgumentException("не корректоное фамилия  < 2");
        }
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Author(String name, String surname) {
        setName(name);
        setSurname(surname);
    }
}
