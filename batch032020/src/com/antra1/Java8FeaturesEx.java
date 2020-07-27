package com.antra1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.antra.Student;

public class Java8FeaturesEx {

	public static void main(String[] args) {
		
		
		//List al=Arrays.asList(1,2,3);
		/*List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);*/
		
		
		
		
		/*List<Person> newPersonList=list.stream().filter(p->{if(p.getGender().equals("M")) {
			
			return true;
		}
			return false;
		}).map(p->{
			p.setAge(p.getAge()+2);
			return p;		
		}).collect(Collectors.toList());
		
		newPersonList.stream().forEach(p->{
			System.out.println(p.getAge());
			System.out.println(p.getName());
		});*/
		
		/*List<Person> newList=list.stream().filter(p->{if(p.getGender().equals("F")) {
			
			return true;
		}
			return false;	
		}).collect(Collectors.toList());
		
		
		newList.stream().forEach(s->System.out.println(s.getName()));
		*/
		ArrayList<Integer> al=new ArrayList<>();
		al.add(34); 
		al.add(56);
		al.add(67);
		al.add(23);
		al.add(64);
		
		//List list=al.stream().sorted().collect(Collectors.toList());
		
		//al.stream().sorted(comparator)
				
		
		//Function<Integer,Integer> f
		
		/*List<Integer> li=al.stream().filter(i->{if(i>50) {
			return true;
		}
		return false;}
				).map(i->{return i+2;}).collect(Collectors.toList());
		
		li.stream().forEach(i->System.out.println(i));*/
		
		/*Predicate<Integer> p=i->{if(i>50) {
			return true;
		}
			return false;
		};*/
		
		/*List<Integer> newAl=al.stream().filter(i->{if(i>50) {
			return true;
		}
			return false;
		}).collect(Collectors.toList());
		
		newAl.stream().forEach(i->System.out.println(i));*/
		
		//al.stream().forEach(i->System.out.println(i));
		
		
		
		/*Supplier<Double> sp=()->{
			
			
			return Math.random();
		}; 
		
		
		System.out.println(sp.get());*/
		
		/*Consumer<Student> con=(st)->{
			System.out.println(st);
		};
		
		con.accept(new Student());*/
		
		/*Function<String,String> fun=(String str)->{
			
			String str2=str.concat("Kumar");
			return str2;
		};
		
		System.out.println(fun.apply("Manas"));*/
		
		/*
		Predicate<String> p=(String t)-> {
				if(t.length()>5) {
					return true;
				}
				return false;
			};
		
		
		System.out.println(p.test("Manas"));*/
		
		/*Calculator c=(a,b)->System.out.println("in add:"+(a+b));
		
		c.add(10, 20);*/
		/*Car car=()->{
				return false;
		};*/
		
		
		
		/*int add=c.add(10, 20);
		System.out.println(add);*/
		/*I1 i1=new I1Impl();
		
		i1.m2();
		i1.m3();
		
		I1.staticM1();*/
		
		
	}
}
