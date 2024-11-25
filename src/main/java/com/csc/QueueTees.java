package com.csc;

import java.util.ArrayList;

public class QueueTees {
  ArrayList<Cutie> pets = new ArrayList<>();
  int index = 0;

  public static void main(String[] args) {
    QueueTees queuetees = new QueueTees();
    System.out.println("So Cute!");
    Puppy puppy = new Puppy();
    Labrador labrador = new Labrador();
    Cat cat = new Cat();
    queuetees.enqueue(puppy, queuetees.pets);
    queuetees.enqueue(labrador, queuetees.pets);
    queuetees.enqueue(cat, queuetees.pets);
    System.out.print(queuetees.size());
    System.out.print(queuetees.pets);
    queuetees.dequeue(queuetees.pets);
    System.out.print(queuetees.pets);
    queuetees.dequeue(queuetees.pets);
    System.out.print(queuetees.pets);
    queuetees.dequeue(queuetees.pets);
    System.out.print(queuetees.pets);
    System.out.print(queuetees.size());
  }

  public void enqueue(Cutie animal, ArrayList<Cutie> list) {
    list.add(animal);
    this.index++;
  }

  public void dequeue(ArrayList<Cutie> list) {
    list.remove(0);
    this.index--;
  }

  public int size() {
    return this.index;
  }
}

class Puppy implements Cutie {

  @Override
  public String description() {
    return "a puppy with cute eyes";
  }

  @Override
  public Integer cutenessRating() {
    return 8;
  }
}

class Cat implements Cutie {
  @Override
  public String description() {
    return "a Cat with cute, big eyes";
  }

  @Override
  public Integer cutenessRating() {
    return 9;
  }
}

class Labrador implements Cutie {
  @Override
  public String description() {
    return "a Labrador with cute dark emerald eyes";
  }

  @Override
  public Integer cutenessRating() {
    return 11;
  }
}
