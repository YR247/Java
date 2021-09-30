package com;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class PersonService {



static HashMap<Integer, Person> personIdMap = getPersonIdMap(); //map list



public PersonService() {
super();



if (personIdMap == null) {
personIdMap = new HashMap<Integer, Person>();
// Creating some objects of Person while initializing
Person indiaPerson = new Person(1, "ram1", "ram1@gmail.com", "delhi");
Person chinaPerson = new Person(2, "ram2", "ram2@gmail.com", "delhi");
Person nepalPerson = new Person(3, "ram3", "ram3@gmail.com", "delhi");
Person bhutanPerson = new Person(4, "ram4", "ram4@gmail.com", "delhi");



//adding map list of collections in java
personIdMap.put(1, indiaPerson);
personIdMap.put(4, chinaPerson);
personIdMap.put(3, nepalPerson);
personIdMap.put(2, bhutanPerson);
}
}



public List<Person> getAllPersonlist() {
List<Person> personlist = new ArrayList<Person>(personIdMap.values());
return personlist;
}



public Person getPerson(int id) {
Person Person = personIdMap.get(id);
return Person;
}
// add person
public Person addPerson(Person person) {
person.setId(getMaxId()+ 1);

// key , value
personIdMap.put(person.getId(), person); ///logic class
return person;
}
//update
public Person updatePerson(Person person) {
if (person.getId() <= 0)
return null;
personIdMap.put(person.getId(), person);
return person;



}
//delete



public void deletePerson(int id) {
personIdMap.remove(id);
}



public static HashMap<Integer, Person> getPersonIdMap() {
return personIdMap;
}



// Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : personIdMap.keySet()) {
if (max <= id)
max = id;



}
return max;
}
}