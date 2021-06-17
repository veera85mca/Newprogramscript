package com.simple;

public class Duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ggegt responsibility";
		char [] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int temp=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					temp++;
					ch[j]='0';
				}
			}
			if(temp>1 && ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
	}

}
