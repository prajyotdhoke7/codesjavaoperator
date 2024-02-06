class Code8{
	public static void main(String[] args){
		//Q8(a)
		int x=10;
		int y=11;
		System.out.println((++x>=y)&&(x<++y));//true
		System.out.println(x);//11
		System.out.println(y);//12
		//Q8(b)
		int a=15;
		int b=35;
		System.out.println(x&y);
		System.out.println(x|y);
	}
}
