import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testPersonForIsOlderThanMethod() throws Exception {
        Person.Name name = new Person.Name("Munna","Bhai");
        Person.Address address  = new Person.Address("Kolhapur","Great land","USA");
        Person.Gender gender = Person.Gender.MALE;
        Person.Person person = new Person.Person(name, 30, gender, address);

        assertEquals(person.isOlderThan(20),true);
        assertEquals(person.isOlderThan(40),false);
    }

    @Test
    public void testPersonForIsOfCountryMethod() throws Exception {
        Person.Name name = new Person.Name("Circuit","Sachiwala");
        Person.Address address  = new Person.Address("Pagalpur","West land","Chin");
        Person.Gender gender = Person.Gender.MALE;
        Person.Person person = new Person.Person(name, 30, gender, address);

        assertEquals(person.isOfCountry("Chin"),true);
        assertEquals(person.isOfCountry("USA"),false);
    }

    @Test
    public void testPersonForFormalNameMethodForMale() throws Exception {
        Person.Name name = new Person.Name("Nice","Name");
        Person.Address address  = new Person.Address("Good","East I-land","Bhutan");
        Person.Gender gender = Person.Gender.MALE;
        Person.Person person = new Person.Person(name, 32, gender, address);

        assertEquals(person.formalName(),"Mr Nice Name");
    }

    @Test
    public void testPersonForFormalNameMethodForFemale() throws Exception {
        Person.Name name = new Person.Name("Beautiful","Name");
        Person.Address address  = new Person.Address("Better","East I-land","Bangladesh");
        Person.Gender gender = Person.Gender.FEMALE;
        Person.Person person = new Person.Person(name, 20, gender, address);

        assertEquals(person.formalName(),"Ms Beautiful Name");
    }

    @Test
    public void testPersonForInformalNameMethodForMale() throws Exception {
        Person.Name name = new Person.Name("Nice","Name");
        Person.Address address  = new Person.Address("Good","East I-land","Bhutan");
        Person.Gender gender = Person.Gender.MALE;
        Person.Person person = new Person.Person(name, 32, gender, address);

        assertEquals(person.inFormalName(),"Mr Name, Nice");
    }

    @Test
    public void testPersonForInformalNameMethodForFemale() throws Exception {
        Person.Name name = new Person.Name("Beautiful","Name");
        Person.Address address  = new Person.Address("Better","East I-land","Bangladesh");
        Person.Gender gender = Person.Gender.FEMALE;
        Person.Person person = new Person.Person(name, 20, gender, address);

        assertEquals(person.inFormalName(),"Ms Name, Beautiful");
    }
}