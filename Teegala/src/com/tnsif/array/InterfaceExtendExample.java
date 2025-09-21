package com.tnsif.array;

        interface Animal {
		    void eat();
		}
		interface Dog extends Animal {
		    void bark();
		}
		class PetDog implements Dog {
		    public void eat() {
		        System.out.println("Dog is eating");
		    }
		    public void bark() {
		        System.out.println("Dog is barking");
		    }
		}
		public class InterfaceExtendExample {
		    public static void main(String[] args) {
		        PetDog d = new PetDog();
		        d.eat();
		        d.bark();
		    }
		}


	
