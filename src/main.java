import java.util.Scanner;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> KodeKaryawan = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> genders = new ArrayList<String>();
		ArrayList<String> Job = new ArrayList<String>();
		ArrayList<Integer> Salary = new ArrayList<Integer>();
		
		int insert;
		String nama = null;
		String jenisKelamin = null;
		String jabatan = null;
		int gaji = 0;
		 int angka;
		Randomizer code = new Randomizer();
		
		String kode; 
		
		menu menu = new menu();
		menu.printmenu();
		
		do {
//		int n = names.size();
		
//		if(n == 0)
//			System.out.println("List Karyawan: Kosong");
//		
//		else
//			System.out.println("List Karyawan: " + names);
		
		
		System.out.println("Insert action [1-4]: ");
		Scanner scan = new Scanner(System.in);
		insert = scan.nextInt();
		scan.nextLine();
		
		switch(insert)
		{
			case 1:
				kode = code.generateRandom();
				KodeKaryawan.add(kode);
			
				do 
					{
						System.out.println("Input Nama Karyawan [>= 3]: ");
						nama = scan.nextLine();
						names.add(nama);
					}
				while(nama.length() < 3);
				
				do 
				{
					System.out.println("Input Jenis Kelamin [Laki-laki | Perempuan]: ");
					jenisKelamin = scan.nextLine();
					genders.add(jenisKelamin);
				}
				while(!jenisKelamin.equals("Laki-laki") && !jenisKelamin.equals("Perempuan"));
				
				do 
				{
					System.out.println("Input Jabatan [Manager | Supervisor | Admin]: ");
					jabatan = scan.nextLine();
					Job.add(jabatan);
				}
				while(!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"));
				
				if(jabatan.equals("Manager")) gaji = 8000000;
				else if(jabatan.equals("Supervisor")) gaji = 6000000;
				else if(jabatan.equals("Admin")) gaji = 4000000;
				
				Salary.add(gaji);
				
				System.out.println("Berhasil menambahkan karyawan dengan ID " + kode);
				
//			
				break;
			case 2:
				
				 if(names.isEmpty()) {
			            System.out.println("Tidak ada karyawan!");
			            System.out.println("Press enter to continue...");
			            scan.nextLine();
			        }else {
			            System.out.println("=======================================================================================================================");
			            System.out.println("|     No     |      Kode Karyawan     |    Nama Karyawan    |    Jenis Kelamin    |    Jabatan    | |    Gaji    |"); 
			            System.out.println("=======================================================================================================================");

			            for (int i = 0; i < Salary.size(); i++) {
			               for (int j = 0; j < Salary.size() - 1; j++) {
			                if (Salary.get(j).compareTo(Salary.get(j + 1)) > 0) {

			                 int tempSalary;
			                 tempSalary = Salary.get(j);
			                 Salary.set(j, Salary.get(j + 1));
			                 Salary.set((j + 1), tempSalary);

			                }
			              }
			               
			                System.out.println( "\t" + (i+1) + "\t\t" + KodeKaryawan.get(i) + "\t\t\t" + names.get(i) + "\t\t" + genders.get(i) + "\t\t" + Job.get(i) + "\t\t" + Salary.get(i));
			                
			            }
			            System.out.println("=======================================================================================================================");
			                System.out.println("");
			     }
				 
			
				break;
			case 3:
				 if(names.isEmpty()) {
			            System.out.println("Tidak ada karyawan!");
			            System.out.println("Press enter to continue...");
			            scan.nextLine();
			        }else {
			            System.out.println("=======================================================================================================================");
			            System.out.println("|     No     |      Kode Karyawan     |    Nama Karyawan    |    Jenis Kelamin    |    Jabatan    | |    Gaji    |"); 
			            System.out.println("=======================================================================================================================");

			            for (int i = 0; i < Salary.size(); i++) {
			               for (int j = 0; j < Salary.size() - 1; j++) {
			                if (Salary.get(j).compareTo(Salary.get(j + 1)) > 0) {

			                 int tempSalary;
			                 tempSalary = Salary.get(j);
			                 Salary.set(j, Salary.get(j + 1));
			                 Salary.set((j + 1), tempSalary);

			                }
			              }
			               
			                System.out.println( "\t" + (i+1) + "\t\t" + KodeKaryawan.get(i) + "\t\t\t" + names.get(i) + "\t\t" + genders.get(i) + "\t\t" + Job.get(i) + "\t\t" + Salary.get(i));
			                
			            }
			            System.out.println("=======================================================================================================================");
			                System.out.println("");
			     }
				
				 System.out.println("Insert angka yang ingin diupdate: ");
				 
				 angka = scan.nextInt();
				 scan.nextLine();
				 if(angka == 0) System.out.println("Error");
				 else
				 {
					 System.out.println("Kode: ");
					 kode = scan.nextLine();
					 KodeKaryawan.set(angka, kode);
					 
					 System.out.println("Nama: ");
					 nama = scan.nextLine();
					 names.set(angka, nama);
					 
					 System.out.println("Jenis Kelamin: ");
					 jenisKelamin = scan.nextLine();
					 genders.set(angka, jenisKelamin);
					 
					 System.out.println("Jabatan: ");
					 jabatan = scan.nextLine();
					 Job.set(angka, jabatan);
					 
					 System.out.println("Gaji: ");
					 gaji = scan.nextInt();
					 Salary.set(angka, gaji);
					 
					 System.out.println("Berhasil mengupdate karyawan dengan ID " + KodeKaryawan.get(angka));
				 }
				break;
			case 4:
				 if(names.isEmpty()) {
			            System.out.println("Tidak ada karyawan!");
			            System.out.println("Press enter to continue...");
			            scan.nextLine();
			        }else {
			            System.out.println("=======================================================================================================================");
			            System.out.println("|     No     |      Kode Karyawan     |    Nama Karyawan    |    Jenis Kelamin    |    Jabatan    | |    Gaji    |"); 
			            System.out.println("=======================================================================================================================");

			            for (int i = 0; i < Salary.size(); i++) {
			               for (int j = 0; j < Salary.size() - 1; j++) {
			                if (Salary.get(j).compareTo(Salary.get(j + 1)) > 0) {

			                 int tempSalary;
			                 tempSalary = Salary.get(j);
			                 Salary.set(j, Salary.get(j + 1));
			                 Salary.set((j + 1), tempSalary);

			                }
			              }
			               
			                System.out.println( "\t" + (i+1) + "\t\t" + KodeKaryawan.get(i) + "\t\t\t" + names.get(i) + "\t\t" + genders.get(i) + "\t\t" + Job.get(i) + "\t\t" + Salary.get(i));
			                
			            }
			            System.out.println("=======================================================================================================================");
			                System.out.println("");
			     }
			
				 System.out.println("Insert angka yang ingin didelete: ");
				 
				 angka = scan.nextInt();
				 scan.nextLine();
				 if(angka == 0) System.out.println("Error");
				 else
				 {
		
					 KodeKaryawan.remove(angka);
					 
					
					 names.remove(angka);
					 
				
					 genders.remove(angka);
					 
					
					 Job.remove(angka);
					 
					
					 Salary.remove(angka);
					 
					 System.out.println("Karyawan dengan kode " + KodeKaryawan.get(angka) + "berhasil dihapus");
				 }
				break;
		}
		}
		while(insert != 5);
	}

}
