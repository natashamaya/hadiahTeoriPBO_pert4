import java.util.Scanner;

class hadiah_prakPBO_pert4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int harga = 0;
		String nama,alamat;
		char tipe;
		int bayar,kembalian;
		boolean loop = true;
		
			
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Alamat Anda : ");
		alamat = input.nextLine();
		
		System.out.println("Pesawat Tipe A  =  Rp. 5.000.000 ");
		System.out.println("Pesawat Tipe B  =  Rp. 2.000.000");
		System.out.println("Pesawat Tipe C  =  Rp. 1.000.000");
	
		while(loop){
		System.out.print("Masukkan Tipe Pesawat yang Anda Pilih (A/B/C) : ");
		tipe = input.next().charAt(0);
		


		
		 switch(tipe){
            case 'A' :
                harga = 5000000;
                System.out.println("Harga : "+harga);
                
                loop = false;
                break;
            case 'B' :
               harga = 2000000;
                 System.out.println("Harga :" +harga);
                 
                loop= false;
                break;
            case 'C' :
               harga = 1000000;
                 System.out.println("Harga :" +harga);
                 
                loop = false;
                break;
            
               default :
                System.out.println("Tidak Ada Pilihan");
               
                
        }
        
	  
	}
	   System.out.print("Masukkan Jumlah Uang Anda : ");
		bayar = input.nextInt();
		
		kembalian =  bayar - harga;
		
		
	   System.out.println("Nama      : "+nama );
	   System.out.println("Alamat    : "+alamat);
	   System.out.println("Kembalian : "+kembalian);
	    
	   
	    	
		
				
	}
}