package com.csc;

import java.util.ArrayList;

public class QueueTees<T> {
  ArrayList<T> pets = new ArrayList<>();
  int index = 0;

  public void enqueue(T animal, ArrayList<T> list) {
    list.add(animal);
    this.index++;
  }

  public void dequeue(ArrayList<T> list) {
    list.remove(0);
    this.index--;
  }

  public int size() {
    return this.index;
  }

  public void clearqueue(ArrayList<T> list) {
    while (!list.isEmpty()) {
      list.remove(0);
      this.index -= 1;
    }
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main(String[] args) {
    QueueTees queuetees = new QueueTees<>();
    Puppy puppy = new Puppy();
    Labrador labrador = new Labrador();
    Cat cat = new Cat();
    queuetees.enqueue(puppy, queuetees.pets);
    queuetees.enqueue(labrador, queuetees.pets);
    queuetees.enqueue(cat, queuetees.pets);
    System.out.println(queuetees.size());
    System.out.println(queuetees.pets);
    queuetees.dequeue(queuetees.pets);
    System.out.println(queuetees.pets);
    queuetees.dequeue(queuetees.pets);
    System.out.println(queuetees.pets);
    queuetees.clearqueue(queuetees.pets);
    System.out.print(queuetees.pets);
  }
}

class Puppy implements Cuties {

  @Override
  public String description() {
    return "a puppy with cute eyes";
  }

  @Override
  public Integer cutenessRating() {
    return 8;
  }
}

class Cat implements Cuties {
  @Override
  public String description() {
    return "a Cat with cute, big eyes";
  }

  @Override
  public Integer cutenessRating() {
    return 9;
  }
}

class Labrador implements Cuties {
  @Override
  public String description() {
    return "a Labrador with cute dark emerald eyes";
  }

  @Override
  public Integer cutenessRating() {
    return 11;
  }
}
