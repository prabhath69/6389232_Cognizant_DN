package com.builder;

public class Computer {
	String CPU;
	String RAM;
	String Storage;
	String Color;
	
	private Computer(Builder buildercls) {
		this.CPU=buildercls.CPU;
		this.RAM=buildercls.RAM;
		this.Storage=buildercls.Storage;
		this.Color=buildercls.Color;
	}
	
	public static class Builder{
		String CPU;
		String RAM;
		String Storage;
		String Color;
		
		public Builder(String CPU, String RAM) {
			this.CPU=CPU;
			this.RAM=RAM;
		}
		
		public Builder storage(String Storage) {
			this.Storage=Storage;
			return this;
		}
		
		public Builder color(String Color) {
			this.Color=Color;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
		
	}
	public void display() {
        System.out.println("Configurations of the Computer");
        System.out.println("------------------------------");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage);
        System.out.println("Color: " + Color+"\n\n");
    }
	
}
