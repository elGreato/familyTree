package application;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable {
	Person father;
	Person mother;
	Person husband;
	Person wife;
	  String name;
	  ArrayList<Person> siblings;
	  ArrayList<Person> uncles;
	  ArrayList<Person> aunts;
	  ArrayList<Person> cousins;
	  Gender gender;
	  int age;
	  private static final long serialVersionUID = 1L;
	
public Gender getGender() {
		return gender;
	}
	public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
public Person(String name){
		this.name=name;
	}
	public Person(String name,Person father, Person mother, Gender gender, Person husband, Person wife, int age){
		this.name=name;
		this.father= father;
		this.mother= mother;
		this.husband = husband;
		this.wife=wife;
		this.age=age;
		this.gender=gender;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Person getHusband() {
		return husband;
	}
	public void setHusband(Person husband) {
		this.husband = husband;
	}
	public Person getWife() {
		return wife;
	}
	public void setWife(Person wife) {
		this.wife = wife;
	}
	
	public void setFather(Person father) {
		this.father = father;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getFather(){
		return father;
	}
	public Person getMother(){
		return mother;
	}
	public ArrayList<Person> getSiblings() {
		return siblings;
	}
	public void setSiblings(ArrayList<Person> siblings) {
		this.siblings = siblings;
	}
	public ArrayList<Person> getCousins() {
		return cousins;
	}
	public void setCousins(ArrayList<Person> cousins) {
		this.cousins = cousins;
	}
	public ArrayList<Person> getUncles() {
		return uncles;
	}
	public void setUncles(ArrayList<Person> uncles) {
		this.uncles = uncles;
	}
	public ArrayList<Person> getAunts() {
		return aunts;
	}
	public void setAunts(ArrayList<Person> aunts) {
		this.aunts = aunts;
	}
}
