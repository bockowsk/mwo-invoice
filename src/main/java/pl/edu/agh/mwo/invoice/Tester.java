package pl.edu.agh.mwo.invoice;


public class Tester {
	public static void main(String[] args) {
		Invoice faktura1=new Invoice();
		System.out.println(Invoice.order_number);
		Invoice faktura2=new Invoice();
		System.out.println(Invoice.order_number);
	}
}
