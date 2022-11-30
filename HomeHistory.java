package com.example.demo;

import java.util.ArrayList;

public class HomeHistory {
	private ArrayList<History> mom;
	private ArrayList<History> self;
	private ArrayList<History> dad;
	@Override
	public String toString() {
		return "HomeHistory [mom=" + mom + ", self=" + self + ", dad=" + dad + "]";
	}
	public ArrayList<History> getMom() {
		return mom;
	}
	public void setMom(ArrayList<History> mom) {
		this.mom = mom;
	}
	public ArrayList<History> getSelf() {
		return self;
	}
	public void setSelf(ArrayList<History> self) {
		this.self = self;
	}
	public ArrayList<History> getDad() {
		return dad;
	}
	public void setDad(ArrayList<History> dad) {
		this.dad = dad;
	}


}
