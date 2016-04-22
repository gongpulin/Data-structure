package com.gpl.util;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class ChineseSort {

	public static void main(String[] args) {
		Comparator com=Collator.getInstance(java.util.Locale.CHINA);
		String[] str={"百度","阿里巴巴","腾讯","华为","360"};
		Arrays.sort(str, com);
		for(String a:str){
			System.out.println(a);
		}
	}

}
