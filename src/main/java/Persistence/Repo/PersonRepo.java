package Persistence.Repo;

import Persistence.Domain.Person;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public class PersonRepo {

    @Query("SELECT p from Person p")
    List<Person> findAllJPQL();


    @Query(value = "SELECT * from Person", nativeQuery = true)
    List<Person> findAllSQL();
    List<Person> findPersonByAgeGreaterThan(int age);

    @Query(value = "SELECT p from Person")
    List<Person> findPersonByAgeGreaterThanJPQL(int age);

    @Query(value = "SELECT p from Person")
    List<Person> findPersonByAgeGreaterThanSQL(int age);
    List<Person> findPersonByAgeLessThan(int age);

    @Query(value = "SELECT p from Person")
    List<Person> findPersonByAgeGreaterThanJPQL(int age);

    @Query(value = "SELECT p from Person")
    List<Person> findPersonByAgeLessThanSQL(int age);
    List<Person> findPersonByName(String name);

    @Query(value = "SELECT p from Person p WHERE p.name = ?1")
    List<Person> findPersonByNameJPQL(String name);

    @Query(value = "SELECT p from Person p WHERE p.name = ?1",nativeQuery = true)
    List<Person> findPersonByNameSQL(String name);

    Person findPersonByNameAndAge(String name, int age);

    @Query("SELECT p from Person p WHERE p.name = ?1 and p.age = ?2")
    Person findPersonByNameAndAgeJPQL(String name, int age);


    @Query(value = "SELECT p from Person p WHERE p.name = ?1 and p.age = ?2",nativeQuery = true)
    Person findPersonByNameAndAgeSQL(String name, int age);

    List<Person> findPersonByNameIsNotNull();

    @Query("SELECT p from Person p")
    List<Person> findPersonByNameIsNotNullJPQL();

    @Query("SELECT p from Person p")
    List<Person> findPersonByNameIsNotNullSQL();
    List<Person> findPersonByNameIsNull();

    @Query("SELECT p from Person p")
    List<Person> findPersonByNameIsNullJPQL();

    @Query("SELECT p from Person p")
    List<Person> findPersonByNameIsNullSQL();

}
