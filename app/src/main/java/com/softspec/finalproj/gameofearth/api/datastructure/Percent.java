package com.softspec.finalproj.gameofearth.api.datastructure;

import java.io.Serializable;
import java.util.*;

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 25/May/2017 - 5:50 PM
 */
public class Percent implements Serializable {
	public static long serialVersionUID = 1L;
	
	private long number;
	
	public Percent(long number) {
		this.number = number;
	}
	
	public void add(long add) {
		number += add;
	}
	
	public void add(Percent add) {
		number += add.number;
	}
	
	public void remove(long remove) {
		number -= remove;
	}
	
	public void remove(Percent remove) {
		number -= remove.number;
	}
	
	public long getNumber() {
		return number;
	}
	
	public double percent() {
		return number / 100.0;
	}
	
	@Override
	public String toString() {
		return String.format(Locale.ENGLISH, "%d%% ~ %.2f", number, percent());
	}
}
