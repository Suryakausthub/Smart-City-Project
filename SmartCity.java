import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SmartCity {
	
	private static void printLine3() {
			for (int i = 0; i < 50; i++) {
			System.out.print("-");
		} 
		System.out.println();
	}

	private static BinarySearchTree addRestaurant(BinarySearchTree a11, Restaurant[] a1) {
		for(int i=0;i<a1.length;i++) {
			a11.insert(a1[i].getName());
		}
		return a11;
	}
	
	
	private static BinarySearchTree addHotels(BinarySearchTree area, Hotel[] area1) {
		
		for (int i = 0; i < area1.length; i++) {
			area.insert(area1[i].getHotelName());	
		}
		return area;
	}// end of addHotels
	private static void printLine2() {
		for (int i = 0; i < 70; i++) {
		System.out.print("><");
		}
		System.out.println();
	}

	private static void printLine1() {

		for (int i = 0; i < 140; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static String readFile(String name){
      String data="";
      try {
      File myObj = new File(name);
      Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
         data = data+ myReader.nextLine();
       
      }
        myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return data;
  }


	public static void main(String[] args) {
		
		Hotel area1h1 = new Hotel("NOVOTEL", 20);
		Hotel area1h2 = new Hotel("VASAVI HOTEL", 18);
		Hotel[] area1 = {area1h1, area1h2};
		BinarySearchTree area11 = new BinarySearchTree();
		area11 = addHotels(area11 , area1);
		
		Hotel area2h1 = new Hotel("Katriya Hotel & Towers", 19);
		Hotel area2h2 = new Hotel("Harvey's Hotels - Gachibowli", 20);
		Hotel[] area2 = {area2h1, area2h2};
		BinarySearchTree area22 = new BinarySearchTree();
		area22 = addHotels(area22 , area2);
		
		Hotel area3h1 = new Hotel("Casa Hotels & Suites, Gachibowli, Hyderabad", 24);
		Hotel area3h2 = new Hotel("The Park Hyderabad Hotel", 21);
		Hotel[] area3 = {area3h1, area3h2};
		BinarySearchTree area33 = new BinarySearchTree();
		area33 = addHotels(area33, area3);
		
		Hotel area4h1 = new Hotel("Townhouse 1305 CASA GRAND", 23);
		Hotel area4h2 = new Hotel("Townhouse Hotel Eaglewood Gachibowli", 12);
		Hotel[] area4 = {area4h1, area4h2};
		BinarySearchTree area44 = new BinarySearchTree();
		area44 = addHotels(area44 , area4);
		
		//Restaurant class
		
		Restaurant area1r1 = new Restaurant("Taj Deccan, Hyderabad",12);
		Restaurant area1r2 = new Restaurant("Taj Falaknuma Palace, Hyderabad",15);
		Restaurant area1r3 = new Restaurant("Pizza Hut",9);
		Restaurant[] a1 = {area1r1,area1r2,area1r3};
		BinarySearchTree a11 = new BinarySearchTree();
		a11 = addRestaurant(a11,a1);
		
		Restaurant area2r1 = new Restaurant("Stone ove",7);
		Restaurant area2r2 = new Restaurant("Pappannam",17);
		Restaurant area2r3 = new Restaurant("Broadway",16);
		Restaurant[] a2 = {area2r1,area2r2,area2r3};
		BinarySearchTree a22 = new BinarySearchTree();
		a22 = addRestaurant(a22,a2);
		
		Restaurant area3r1 = new Restaurant("Chutneys",6);
		Restaurant area3r2 = new Restaurant("Rayalseema Ruchulu",9);
		Restaurant area3r3 = new Restaurant("Paradise Biryani",12);
		Restaurant[] a3 = {area3r1,area3r2,area3r3};
		BinarySearchTree a33 = new BinarySearchTree();
		a33 = addRestaurant(a33,a3);
		
		Restaurant area4r1 = new Restaurant("Shah Ghouse Café",18);
		Restaurant area4r2 = new Restaurant("Tim-Hortons",19);
		Restaurant area4r3 = new Restaurant("Minerva Coffee Shop",16);
		Restaurant[] a4 = {area4r1,area4r2,area4r3};
		BinarySearchTree a44 = new BinarySearchTree();
		a44 = addRestaurant(a44,a4);
		
		
		Museum m1 = new Museum(1, "Hyderabad Museum", "8am-5pm", "Neil Degrasse Tyson");

        Items i_1 = new Items(.001, "Charminar Miniature");
        Items i_2 = new Items(.002, "Hyderabadi Biryani Recipe Book");
        Items i_3 = new Items(.003, "Pearl Jewelry Set");
        Items i_4 = new Items(.004, "Bidriware Vase");
        Items i_5 = new Items(.005, "Lad Bazaar Bangles");
        Items i_6 = new Items(.006, "Golconda Fort Model");
        Items i_7 = new Items(.007, "Nizam's Sword Replica");
        Items i_8 = new Items(.008, "Pochampally Ikat Saree");
        Items i_9 = new Items(.009, "Hyderabadi Haleem Cooking Pot");
        Items i_10 = new Items(.011, "Deccan Chronicles Newspaper from 1947");

		m1.add(i_1);
		m1.add(i_2);
		m1.add(i_3);
		m1.add(i_4);
		m1.add(i_5);
		m1.add(i_6);
		m1.add(i_7);
		m1.add(i_8);
		m1.add(i_9);
		m1.add(i_10);

		
		Museum m2=new Museum(002,"Salarjung  Museum Of Arts", "10am-4pm",  "Abdul Mateen");
		
		m2.add(i_1);
		m2.add(i_2);
		m2.add(i_3);
		m2.add(i_4);
		m2.add(i_5);
		m2.add(i_6);
		m2.add(i_7);
		m2.add(i_8);
		m2.add(i_9);
		m2.add(i_10);

		
		Museum m3=new Museum(003,"chowmouhala Museum Of Arts", "3am-5pm", "Sateesh");
		
		m3.add(i_1);
		m3.add(i_2);
		m3.add(i_3);
		m3.add(i_4);
		m3.add(i_5);
		m3.add(i_6);
		m3.add(i_7);
		m3.add(i_8);
		m3.add(i_9);
		m3.add(i_10);

		
		Museum m4=new Museum(004,"India Museum Of Science", "3am-5pm", "Sree Lakshmi");
		
		m4.add(i_1);
		m4.add(i_2);
		m4.add(i_3);
		m4.add(i_4);
		m4.add(i_5);
		m4.add(i_6);
		m4.add(i_7);
		m4.add(i_8);
		m4.add(i_9);
		m4.add(i_10);

		
		MyArrayList<Museum> mue=new MyArrayList<>();
		mue.add(m1);
		mue.add(m2);
		mue.add(m3);
		mue.add(m4);
				
		
		
		News news=new News(01);
		
		String str_1=readFile("News/Text.txt");
		String str_2=readFile("News/Text2.txt");
		String str_3=readFile("News/Text3.txt");
		String str_4=readFile("News/Text4.txt");
		
		Article article_1=new Article("Hindi BO: Kalki Sets 2024 Record", "Tanvi Nakka",str_1 );
		Article article_2=new Article("Haryana assembly polls: First session of BJP meeting begins in Panchkula", "Hithvika Reddy",str_2 );
		Article article_3=new Article("India vs South Africa – ICC T20 World Cup 2024 final", "Harsha bogle",str_3 );
		Article article_4=new Article(" SpaceX Successfully Launches First Commercial Moon Landing Mission", "Pooja Sree",str_4 );
		
		
		
		
		
		news.add(article_1);
		news.add(article_2);
		news.add(article_3);
		news.add(article_4);
		

		//
		
		Scanner in = new Scanner(System.in);
		String firstInput = "y";
		String input1 = "n";	
		String input2 = "n";	
		String userName = null;
		String passWord = null;
		String checkName = null;
		String checkPass = null;
		Accounts accounts1 = new Accounts();
		String areaNum = "0";
		String button = "0";
		String hotelChoice = "0";
		String hotelBookCancel = "0";
		String resChoice = "0";
		String tableBooking = "0";
		String continueSignOut = "0";
		
		printLine1();
		System.out.println("\t\t\t\t\t\t******Welcome TO The Smart City Application******");
		printLine1();
		System.out.println("\n\t\t\t We Aim To Solve An Issue That Every Tourist Faces When Visiting A New City And, \n\t\t\t\t "
				+ "That Is The Lack of Knowledege Of Where Exactly To Visit In This Foreign City. \n");
		printLine2();
		
		
		while(firstInput == "y") {
		System.out.println("\nPress 1: To Create A New Account\n"
				+ "Press 2: To Sign In To Your Exsistent Account\n"
				+ "Press 0: To Exit");
		printLine3();
		String input = in.nextLine();
		 

		 if( input.equals("1")) {
			 input1 = "n";
			 while(input1.equals("n") ||  1==1) {
			 if(!input1.equals("n")){
				System.out.println("Wrong input, Please Try Again");
				input1 = in.nextLine().toLowerCase();
			 }
			 
			 else
			 {
				System.out.println("Kindly, Enter The User-Name For Your Account");
			  userName = in.nextLine();
			  printLine3();
			 System.out.println(userName + ",  Are You Sure You Want To Use This User-Name?"
			 		+ "\nIf Yes then Press: Y"
			 		+ "\nIf No Then Press : N");

			   input1 = in.nextLine().toLowerCase();
			 }
				if(input1.equals("y")) 
					break;
			 }
			 
			 input2 = "n";
			 while(input2.equals("n")||  1==1) {
				if(!input2.equals("n")){
						System.out.println("Wrong input, Please Try Again");
						input2 = in.nextLine().toLowerCase();

				}
				else
				{
					System.out.println("Kindly, Enter The PassWord For Your Account");
			 passWord = in.nextLine();
			 printLine3();
			 System.out.println(passWord+ ",  Are You Sure You Want To Use This PassWord?"
			 		+ "\nIf Yes Then Press: Y"
			 		+ "\nIf No Then Press : N");
			 
			   input2 = in.nextLine().toLowerCase();	
				}
				if(input2.equals("y")) 
					break;
			 }
			 printLine3();
			 accounts1.addAccount(userName, passWord);
			 printLine3();
		 }
		 else if(input.equals("2")) {
			 System.out.println("Kindly, Enter Your User-Name To Sign In:");
			 checkName = in.nextLine();
			 System.out.println("Kindly, Enter Your PassWord To Sign In:");
			 checkPass = in.nextLine();
			 printLine3();
			 
			 if(accounts1.checkAccount(checkName, checkPass)) {
				 
				System.out.println("\n\t\t\t\t\t\t******WELCOME*****"
						+ "\nUser-Name: "+ checkName);
				System.out.println("\n\tOur Services Are Currently Only Limited To Hyderabad But"
						+ " We Are Expanding Our Services, So kindly Do Bare With Us");
				System.out.println("\n\t\t\t\t\t\t~~~~~Welcome To Smart Hyderabad~~~~~");
				
				areaNum = "0";
				while (areaNum.equals("0")) {
					button = "0";
					while (button.equals("0")) { 
						System.out.println("\n\t\t Hyderabad Offers A Lot To Its Visitors, With Endless"
								+ " Activities And Fun Filled Nights,"
								+ " \n\tKindly Enter The Area You Are Currently Visiting In Hyderabad, To See"
								+ " The Nearby Places And Activities That You Can Explore"
								+ "\n1--)Charminar Area  :Press 1"
								+ "\n2--)Banjara Hills Area   :Press 2"
								+ "\n3--)Hitech City Area      :Press 3"
								+ "\n4--)Gachibowli Area     :Press 4"
								+ "\nPress 0: To Log Out, To The Home Screen");
					 
				areaNum = in.nextLine();
				printLine3();
				if(areaNum.equals("1")) {
				
					continueSignOut = "0";
					while(continueSignOut.equals("0")) {
					System.out.println("\n\t\t*****Welcome To Charminar Area*****");
					System.out.println("The Nearby Areas And Around You That You Can Explore"
							+ " Are As Follows: ");
					button = "0";
					while(button.equals("0")) { 
					System.out.println("1--)Hotels"
							+ "\n2--)Restaurants"
							+ "\n3--)Museums"
							+ "\n4--)See The Latest News Of The Area"
							+ "\n0--)To Go Back");
						
					System.out.println("Press The Relevant Button On The Menu To Continue: ");
					button = in.nextLine();
					
					printLine3();
					
					if(button.equals("1")) {
						System.out.println("There Are Currently 2 Hotels Near You");
						area11.preOrder();
						hotelChoice = "0";
						while(hotelChoice.equals("0")) {
						System.out.println("Please Choose a Hotel: 1 or 2");
						hotelChoice = in.nextLine();
						printLine3();
						
						if(hotelChoice.equals("1")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
							System.out.println("Press 1: To Make A Booking"
									+ "\nPress 2: To Cancel Your Booking");
							hotelBookCancel = in.nextLine();
							if(hotelBookCancel.equals("1")) {
								System.out.println("Enter The Number Of Nights You Will Be"
										+ " Staying At The Hotel");
								int nights = in.nextInt();
								in.nextLine();
								area1h1.addBooking(nights);
								printLine3();
							}
							else if(hotelBookCancel.equals("2")) {
								System.out.println("Enter Your Booking Number To Cancel"
										+ " Your Booking");
								int bookingNumber = in.nextInt();
								in.nextLine();
								area1h1.cancelBooking(bookingNumber);
								printLine3();
							}
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								hotelBookCancel = "0";
								printLine3();
							}
						}
					}
						else if(hotelChoice.equals("2")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
								System.out.println("Press 1: To Make A Booking"
										+ "\nPress 2: To Cancel Your Booking");
								hotelBookCancel = in.nextLine();
								if(hotelBookCancel.equals("1")) {
									System.out.println("Enter The Number Of Nights You Will Be"
											+ " Staying At The Hotel");
									int nights = in.nextInt();
									in.nextLine();
									area1h2.addBooking(nights);
									printLine3();
								}
								else if(hotelBookCancel.equals("2")) {
									System.out.println("Enter Your Booking Number To Cancel"
											+ " Your Booking");
									int bookingNumber = in.nextInt();
									in.nextLine();
									area1h2.cancelBooking(bookingNumber);
									printLine3();
								}
								else {
									System.out.println("You Pressed The Wrong Key, Try Again");
									hotelBookCancel = "0";
									printLine3();
								}
								}
						}
						else {
							System.out.println("You Pressed The Wrong Key, Try Again");
							hotelChoice = "0";
							printLine3();
						}}
						
					
					}
					
					else if(button.equals("2")) {
						System.out.println("There Are Currently 3 Restaurants Near You");
						a11.preOrder();
						resChoice = "0";
						while(resChoice.equals("0")) {
							System.out.println("Please choose a Restaurant : 1,2 or 3 ");
							resChoice=in.nextLine();
							printLine3();
							
							if(resChoice.equals("1")) {
								tableBooking = "0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area1r1.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										in.nextLine();
										printLine3();
										area1r1.cancelTable(num);
										printLine3();
									}//else-if
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//if
							else if(resChoice.equals("2")) {
								tableBooking = "0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area1r2.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area1r2.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else if(resChoice.equals("3")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area1r3.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area1r3.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								resChoice = "0";
								printLine3();
							}
						}
					}
					
					else if(button.equals("3")) {
						
						System.out.println("Would you like to see the museum and its items ? (y/n)");
						String seeMuseum = in.nextLine();
						if(seeMuseum.equals("y")) {
							int area_of_museum=Integer.parseInt(areaNum);
							mue.print(area_of_museum);
							m1.printAll();
						}	
						else {
							System.out.println("Wrong selection. Going Back");
						}
						System.out.println("Would you like to book  a ticket for the museum ? (y/n)");
						String bookTicket = in.nextLine();
						if(bookTicket.equals("y")) {
							System.out.println("Enter the number of tickets you want to book");
							int num_of_tickets = in.nextInt();
							in.nextLine();
							m1.bookTicket(num_of_tickets);
							
							

						}
						else {
							System.out.println("Wrong selection. Going Back");
						}



					}
					
					else if(button.equals("4")) {

						news.printAll();

					}
					else {
						if(button.equals("0")) {
							System.out.println("Going Back");
							continueSignOut = "n";
							break;
						}
						else {
						System.out.println("You Have Pressed The Wrong Key, Try Again");
						button = "0";
						
						}
					}
					}
					if(!button.equals("0")) {
						continueSignOut="0";
						while(continueSignOut.equals("0")) {
						System.out.println("Would You Like Sign Out Or Continue Using ? "
								+ "\nPress 0: To Go Back"
								+ "\nPress 1: To Sign Out");
						 continueSignOut = in.nextLine();
						if(continueSignOut.equals("0")) {
							System.out.println("Going Back");
							printLine3();
							break;
						}// going back
						else if(continueSignOut.equals("1")) {
							System.out.println("Thank You For Logging In Today,"
									+ " See You Soon!!!");
							printLine3();
						}// sign Out
						else {
							System.out.println("You Have Pressed The Wrong Key, Try Again");
							continueSignOut = "0";
							printLine3();
						}
						}
						}
				
					}
				}
					
					
				else if(areaNum.equals("2")) {
					
					continueSignOut = "0";
					while(continueSignOut.equals("0")) {
					System.out.println("\n\t\t*****Welcome To Banjara Hills, Hyderabad*****");
					System.out.println("The Nearby Areas And Around You That You Can Explore"
							+ " Are As Follows: ");
					button = "0";
					while(button.equals("0")) {
					System.out.println("1--) Hotels"
							+ "\n2--)Restaurants"
							+ "\n3--)Museums"
							+ "\n4--)See The Latest News Of The Area"
							+ "\n0--)To Go Back");
					System.out.println("Press The Relevant Button On The Menu To Continue: ");
					button = in.nextLine();
					
					printLine3();
					if(button.equals("1")) {
						System.out.println("There Are Currently 2 Hotels Near You");
						area22.preOrder();
						hotelChoice = "0";
						while(hotelChoice.equals("0")) {
						System.out.println("Please Choose A Hotel: 1 or 2");
						hotelChoice = in.nextLine();
						printLine3();
						
 
						if(hotelChoice.equals("1")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
							System.out.println("Press 1: To Make A Booking"
									+ "\nPress 2: To Cancel Your Booking");
							hotelBookCancel = in.nextLine();
							if(hotelBookCancel.equals("1")) {
								System.out.println("Enter The Number Of Nights You Will Be"
										+ " Staying At The Hotel");
								int nights = in.nextInt();
								in.nextLine();
								area2h1.addBooking(nights);
								printLine3();
							}// end of booking
							else if(hotelBookCancel.equals("2")) {
								System.out.println("Enter Your Booking Number To Cancel"
										+ " Your Booking");
								int bookingNumber = in.nextInt();
								in.nextLine();
								area2h1.cancelBooking(bookingNumber);
								printLine3();
							}// end of cancel
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								hotelBookCancel = "0";
								printLine3();
							}
							}
						}// first Hotel
						else if(hotelChoice.equals("2")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
								System.out.println("Press 1: To Make A Booking"
										+ "\nPress 2: To Cancel Your Booking");
								hotelBookCancel = in.nextLine();
								if(hotelBookCancel.equals("1")) {
									System.out.println("Enter The Number Of Nights You Will Be"
											+ " Staying At The Hotel");
									int nights = in.nextInt();
									in.nextLine();
									area2h2.addBooking(nights);
									printLine3();
								}// end of booking
								else if(hotelBookCancel.equals("2")) {
									System.out.println("Enter Your Booking Number To Cancel"
											+ " Your Booking");
									int bookingNumber = in.nextInt();
									in.nextLine();
									area2h2.cancelBooking(bookingNumber);
									printLine3();
								}// end of cancel
								else {
									System.out.println("You Pressed The Wrong Key, Try Again");
									hotelBookCancel = "0";
									printLine3();
								}
								}
						}// second Hotel
						else {
							System.out.println("You Pressed The Wrong Key, Try Again");
							hotelChoice = "0";
							printLine3();
						}
					}
				}
					
					else if(button.equals("2")) {
						System.out.println("There Are Currently 3 Restaurants Near You");
						a22.preOrder();
						resChoice="0";
						while(resChoice.equals("0")) {
							System.out.println("Please choose a Restaurant : 1,2 or 3 ");
							resChoice=in.nextLine();
							printLine3();
							
							if(resChoice.equals("1")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area2r1.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										in.nextLine();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										printLine3();
										area2r1.cancelTable(num);
										printLine3();
									}//else-if
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//if
							else if(resChoice.equals("2")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area2r2.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area2r2.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else if(resChoice.equals("3")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area2r3.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										in.nextLine();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										printLine3();
										area2r3.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								resChoice = "0";
								printLine3();
							}
						}//while
					}// Interacting with the restaurant class
					
					else if(button.equals("3")) {
						/*
						 * Abdul Rehman Your Work here
						 */
						// would you like to see the museum and its items
						System.out.println("Would you like to see the museum and its items ? (y/n)");
						String seeMuseum = in.nextLine();
						if(seeMuseum.equals("y")) {
							int area_of_museum=Integer.parseInt(areaNum);
							mue.print(area_of_museum);
							m1.printAll();
						}	
						else {
							System.out.println("Wrong selection. Going Back");
						}
						//would you like to book  a ticket for the museum
						System.out.println("Would you like to book  a ticket for the museum ? (y/n)");
						String bookTicket = in.nextLine();
						if(bookTicket.equals("y")) {
							System.out.println("Enter the number of tickets you want to book");
							int num_of_tickets = in.nextInt();
							in.nextLine();
							m2.bookTicket(num_of_tickets);
							
							

						}
						else {
							System.out.println("Wrong selection. Going Back");
						}

					}// Interacting with the musuem class
					
					else if(button.equals("4")) {
						
						news.printAll();
					}// Interacting with the news class
					else {
						if(button.equals("0")) {
							System.out.println("Going Back");
							continueSignOut = "n";
							break;
						}
						else {
						System.out.println("You Have Pressed The Wrong Key, Try Again");
						button = "0";
						
						}
					}// Wrong Key Press By User, input validation and Quit to the main screen
					}// Input Validation
					if(!button.equals("0")) {
						continueSignOut="0";
						while(continueSignOut.equals("0")) {
						System.out.println("Would You Like Sign Out Or Continue Using ? "
								+ "\nPress 0: To Go Back"
								+ "\nPress 1: To Sign Out");
						 continueSignOut = in.nextLine();
						if(continueSignOut.equals("0")) {
							System.out.println("Going Back");
							printLine3();
							break;
						}// going back
						else if(continueSignOut.equals("1")) {
							System.out.println("Thank You For Logging In Today,"
									+ " See You Soon!!!");
							printLine3();
						}// sign Out
						else {
							System.out.println("You Have Pressed The Wrong Key, Try Again");
							continueSignOut = "0";
							printLine3();
						}// Wrong Key Press By User, input validation and Quit to the main screen
						}
						}
					
						}// bringing user-back into the app
				
				
				}// bringing user into Model Town
				
				else if(areaNum.equals("3")) {
					/*
					 * All Areas related to area 3 will be shown here
					 */
					continueSignOut = "0";
					while(continueSignOut.equals("0")) {
					System.out.println("\n\t\t*****Welcome To Hitech City , Hyderabad*****");
					System.out.println("The Nearby Areas And Around You That You Can Explore"
							+ " Are As Follows: ");
					button = "0";
					while(button.equals("0")) {
					System.out.println("1--) Hotels"
							+ "\n2--)Restaurants"
							+ "\n3--)Museums"
							+ "\n4--)See The Latest News Of The Area"
							+ "\n0--)To Go Back");
					System.out.println("Press The Relevant Button On The Menu To Continue: ");
					button = in.nextLine();
					//Allowing the user to interact with the areas
					printLine3();
					if(button.equals("1")) {
						System.out.println("There Are Currently 2 Hotels Near You");
						area33.preOrder();
						hotelChoice = "0";
						while(hotelChoice.equals("0")) {
						System.out.println("Please Choose A Hotel: 1 or 2");
						hotelChoice = in.nextLine();
						printLine3();
						//Below Is the section allowing the user to interact with the hotel
						// to allow him to make or cancel a booking
 
						if(hotelChoice.equals("1")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
							System.out.println("Press 1: To Make A Booking"
									+ "\nPress 2: To Cancel Your Booking");
							hotelBookCancel = in.nextLine();
							if(hotelBookCancel.equals("1")) {
								System.out.println("Enter The Number Of Nights You Will Be"
										+ " Staying At The Hotel");
								int nights = in.nextInt();
								in.nextLine();
								area3h1.addBooking(nights);
								printLine3();
							}// end of booking
							else if(hotelBookCancel.equals("2")) {
								System.out.println("Enter Your Booking Number To Cancel"
										+ " Your Booking");
								int bookingNumber = in.nextInt();
								in.nextLine();
								area3h1.cancelBooking(bookingNumber);
								printLine3();
							}// end of cancel
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								hotelBookCancel = "0";
								printLine3();                                    
							}// end of input Validation
							}// end of while loop- input validation
						}// first Hotel
						else if(hotelChoice.equals("2")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
								System.out.println("Press 1: To Make A Booking"
										+ "\nPress 2: To Cancel Your Booking");
								hotelBookCancel = in.nextLine();
								if(hotelBookCancel.equals("1")) {
									System.out.println("Enter The Number Of Nights You Will Be"
											+ " Staying At The Hotel");
									int nights = in.nextInt();
									in.nextLine();
									area3h2.addBooking(nights);
									printLine3();
								}// end of booking
								else if(hotelBookCancel.equals("2")) {
									System.out.println("Enter Your Booking Number To Cancel"
											+ " Your Booking");
									int bookingNumber = in.nextInt();
									in.nextLine();
									area3h2.cancelBooking(bookingNumber);
									printLine3();
								}// end of cancel
								else {
									System.out.println("You Pressed The Wrong Key, Try Again");
									hotelBookCancel = "0";
									printLine3();
								}// end of input Validation
								}// end of while loop- input validation
						}// second Hotel
						else {
							System.out.println("You Pressed The Wrong Key, Try Again");
							hotelChoice = "0";
							printLine3();
						}// end of else-checking for invalid input
					}// end of while-loop for input validation			
					}// Interaction With The Hotel Class
					
					else if(button.equals("2")) {
						System.out.println("There Are Currently 3 Restaurants Near You");
						a33.preOrder();
						resChoice="0";
						while(resChoice.equals("0")) {
							System.out.println("Please choose a Restaurant : 1,2 or 3 ");
							resChoice=in.nextLine();
							printLine3();
							//Below Is the section allowing the user to interact with the Restaurant
							// to allow him to book or cancel a table
							if(resChoice.equals("1")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area3r1.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area3r1.cancelTable(num);
										printLine3();
									}//else-if
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//if
							else if(resChoice.equals("2")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area3r2.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area3r2.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else if(resChoice.equals("3")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area3r3.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area3r3.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								resChoice = "0";
								printLine3();
							}
						}//while
					}// Interacting with the restaurant class
					
					else if(button.equals("3")) {
						/*
						 * Abdul Rehman Your Work here
						 */
						// would you like to see the museum and its items
						System.out.println("Would you like to see the museum and its items ? (y/n)");
						String seeMuseum = in.nextLine();
						if(seeMuseum.equals("y")) {
							int area_of_museum=Integer.parseInt(areaNum);
							mue.print(area_of_museum);
							m1.printAll();
						}	
						else {
							System.out.println("Wrong selection. Going Back");
						}
						//would you like to book  a ticket for the museum
						System.out.println("Would you like to book  a ticket for the museum ? (y/n)");
						String bookTicket = in.nextLine();
						if(bookTicket.equals("y")) {
							System.out.println("Enter the number of tickets you want to book");
							int num_of_tickets = in.nextInt();
							in.nextLine();
							m3.bookTicket(num_of_tickets);
							
							

						}
						else {
							System.out.println("Wrong selection. Going Back");
						}

					}// Interacting with the musuem class
					
					else if(button.equals("4")) {
						
						news.printAll();
					}// Interacting with the news class
					else {
						if(button.equals("0")) {
							System.out.println("Going Back");
							continueSignOut = "n";
							break;
						}
						else {
						System.out.println("You Have Pressed The Wrong Key, Try Again");
						button = "0";
						
						}
					}// Wrong Key Press By User, input validation and Quit to the main screen
				}//InputValidation
					if(!button.equals("0")) {
						continueSignOut="0";
						while(continueSignOut.equals("0")) {
						System.out.println("Would You Like Sign Out Or Continue Using ? "
								+ "\nPress 0: To Go Back"
								+ "\nPress 1: To Sign Out");
						 continueSignOut = in.nextLine();
						if(continueSignOut.equals("0")) {
							System.out.println("Going Back");

							printLine3();
							break;
						}// going back
						else if(continueSignOut.equals("1")) {
							System.out.println("Thank You For Logging In Today,"
									+ " See You Soon!!!");
							printLine3();
						}// sign Out
						else {
							System.out.println("You Have Pressed The Wrong Key, Try Again");
							continueSignOut = "0";
							printLine3();
						}// Wrong Key Press By User, input validation and Quit to the main screen
						}
						}
					
						}// bringing user-back into the app	
				
				
				}// bringing user into Gulberg
				else if(areaNum.equals("4")) {
					/*
					 * All Areas related to area 4 will be shown here
					 */
					continueSignOut = "0";
					while(continueSignOut.equals("0")) {
					
					System.out.println("\n\t\t*****Welcome To Gachibowwli, Hyderabad*****");
					System.out.println("The Nearby Areas And Around You That You Can Explore"
							+ " Are As Follows: ");
					button = "0";
					while(button.equals("0")) {
					System.out.println("1--) Hotels"
							+ "\n2--)Restaurants"
							+ "\n3--)Museums"
							+ "\n4--)See The Latest News Of The Area"
							+ "\n0--)To Go Back");
					System.out.println("Press The Relevant Button On The Menu To Continue: ");
					button = in.nextLine();
					//Allowing the user to interact with the areas
					printLine3();
					if(button.equals("1")) {
						System.out.println("There Are Currently 2 Hotels Near You");
						area44.preOrder();
						hotelChoice = "0";
						while(hotelChoice.equals("0")) {
						System.out.println("Please Choose A Hotel: 1 or 2");
						hotelChoice = in.nextLine();
						printLine3();
						//Below Is the section allowing the user to interact with the hotel
						// to allow him to make or cancel a booking
 
						if(hotelChoice.equals("1")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
							System.out.println("Press 1: To Make A Booking"
									+ "\nPress 2: To Cancel Your Booking");
							hotelBookCancel = in.nextLine();
							if(hotelBookCancel.equals("1")) {
								System.out.println("Enter The Number Of Nights You Will Be"
										+ " Staying At The Hotel");
								int nights = in.nextInt();
								in.nextLine();
								area4h1.addBooking(nights);
								printLine3();
							}// end of booking
							else if(hotelBookCancel.equals("2")) {
								System.out.println("Enter Your Booking Number To Cancel"
										+ " Your Booking");
								int bookingNumber = in.nextInt();
								in.nextLine();
								area4h1.cancelBooking(bookingNumber);
								printLine3();
							}// end of cancel
							else {
								System.out.println("You Pressed The Wrong Key, Try Again");
								hotelBookCancel = "0";
								printLine3();
							}// end of input Validation
							}// end of while loop- input validation
						}// first Hotel
						else if(hotelChoice.equals("2")) {
							hotelBookCancel = "0";
							while(hotelBookCancel.equals("0")) {
								System.out.println("Press 1: To Make A Booking"
										+ "\nPress 2: To Cancel Your Booking");
								hotelBookCancel = in.nextLine();
								if(hotelBookCancel.equals("1")) {
									System.out.println("Enter The Number Of Nights You Will Be"
											+ " Staying At The Hotel");
									int nights = in.nextInt();
									in.nextLine();
									area4h2.addBooking(nights);
									printLine3();
								}// end of booking
								else if(hotelBookCancel.equals("2")) {
									System.out.println("Enter Your Booking Number To Cancel"
											+ " Your Booking");
									int bookingNumber = in.nextInt();
									in.nextLine();
									area4h2.cancelBooking(bookingNumber);
									printLine3();
								}// end of cancel
								else {
									System.out.println("You Pressed The Wrong Key, Try Again");
									hotelBookCancel = "0";
									printLine3();
								}// end of input Validation
								}// end of while loop- input validation
						}// second Hotel
						else {
							System.out.println("You Pressed The Wrong Key, Try Again");
							hotelChoice = "0";
							printLine3();
						}// end of else-checking for invalid input
					}// end of while-loop for input validation			
					}// Interaction With The Hotel Class
					
					else if(button.equals("2")) {
						System.out.println("\nThere Are Currently 3 Restaurants Near You.");
						a44.preOrder();
						resChoice="0";
						while(resChoice.equals("0")) {
							System.out.println("Please choose a Restaurant : 1,2 or 3 ");
							resChoice=in.nextLine();
							printLine3();
							//Below Is the section allowing the user to interact with the Restaurant
							// to allow him to book or cancel a table
							if(resChoice.equals("1")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area4r1.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area4r1.cancelTable(num);
										printLine3();
									}//else-if
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//if
							else if(resChoice.equals("2")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										in.nextLine();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area4r2.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area4r2.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else if(resChoice.equals("3")) {
								tableBooking="0";
								while(tableBooking.equals("0")) {
									System.out.println("Press 1: To Book a table"
											+ "\nPress 2: To Cancel a table");
									tableBooking = in.nextLine();
									printLine3();
									String name;
									int num;
									if(tableBooking.equals("1")) {
										System.out.println("\nEnter table number :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										System.out.println("\nEnter your name :  ");
										name = in.nextLine();
										printLine3();
										area4r3.bookTable(num,name);
										printLine3();
									}//if
									else if(tableBooking.equals("2")){
										System.out.println("\nEnter table number to cancel :  ");
										num = in.nextInt();
										while(num<1 || num>area1r1.getNumOfTables()) {
											System.out.println("\nInvalid number..!\nEnter table number again :  ");
											num = in.nextInt();
											in.nextLine();
										}
										in.nextLine();
										printLine3();
										area4r3.cancelTable(num);
										printLine3();
									}
									else {
										System.out.println("You Pressed The Wrong Key, Try Again");
										tableBooking = "0";
										printLine3();
									}
								}//while
							}//else-if
							else {
								System.out.println("You Pressed The Wrong Key, Try Again.");
								resChoice = "0";
								printLine3();
							}
						}//while
					}// Interacting with the restaurant class
					
					else if(button.equals("3")) {
						/*
						 * Abdul Rehman Your Work here
						 */
						// would you like to see the museum and its items
						System.out.println("Would you like to see the museum and its items ? (y/n)");
						String seeMuseum = in.nextLine();
						if(seeMuseum.equals("y")) {
							int area_of_museum=Integer.parseInt(areaNum);
							mue.print(area_of_museum);
							m1.printAll();
						}	
						else {
							System.out.println("Wrong selection. Going Back");
						}
						//would you like to book  a ticket for the museum
						System.out.println("Would you like to book  a ticket for the museum ? (y/n)");
						String bookTicket = in.nextLine();
						if(bookTicket.equals("y")) {
							System.out.println("Enter the number of tickets you want to book");
							int num_of_tickets = in.nextInt();
							in.nextLine();
							m4.bookTicket(num_of_tickets);
							
							

						}
						else {
							System.out.println("Wrong selection. Going Back");
						}

					}// Interacting with the musuem class
					
					else if(button.equals("4")) {
						/*
						 * Abdul Rehman Your Work here
						 */
						news.printAll();
					}// Interacting with the news class
					else {
						if(button.equals("0")) {
							System.out.println("Going Back");
							continueSignOut = "n";
							break;
						}
						else {
						System.out.println("You Have Pressed The Wrong Key, Try Again");
						button = "0";
						}
					}// Wrong Key Press By User, input validation and Quit to the main screen
					}// Wrong button Press
					if(!button.equals("0")) {
						continueSignOut="0";
						while(continueSignOut.equals("0")) {
						System.out.println("Would You Like Sign Out Or Continue Using ? "
								+ "\nPress 0: To Go Back"
								+ "\nPress 1: To Sign Out");
						 continueSignOut = in.nextLine();
						if(continueSignOut.equals("0")) {
							System.out.println("Going Back");
							printLine3();
							break;
						}// going back
						else if(continueSignOut.equals("1")) {
							System.out.println("Thank You For Logging In Today,"
									+ " See You Soon!!!");
							printLine3();
						}// sign Out
						else {
							System.out.println("You Have Pressed The Wrong Key, Try Again");
							continueSignOut = "0";
							printLine3();
						}// Wrong Key Press By User, input validation and Quit to the main screen
						}
						}					
						}// bringing user-back into the app
				}// bringing user into DHA
				else {
					if(areaNum.equals("0")) {
						System.out.println("Thank You For Exploring Smart Lahore, Take Care");
						printLine3();
						areaNum = "n";
						break;
					}// end of if taking user back to the main page
					else {
						System.out.println("You May Have Seemed To Press The Wrong Key"
								+ " Please, Try Again!!!");
						areaNum = "0";
						printLine3();
					}// input validation
				}// bringing user to the main page or input validation
				}// end of while-loop used for input Validation
			 }// end of if-inside else-if to check if the account exsists
			 }
			 
			 else {
				 System.out.println("\n\t~~~No Such Account Exsists, Kindly Create"
					 		+ " A New Account Or Sign In Again~~~");
				 printLine3();
			 }
		 }// end of else-if signing into exsistent account
		 else {
			 if( input.equals("0") ) {
			 System.out.println("^^^^^Thank You For Signing In Today, Hope To See You Again"
			 		+ "^^^^^");
			 printLine1();
			 break;
			 }// end of if checking for last input
			 else {
				 System.out.println("You May Have Seemed To Press The Wrong Key, Please "
				 		+ "Try Again!!!");
				 printLine3();
			 }// else inside of our else to check if user entered a wrong key 
		 }// end of else to exit the user
		}// end of while-Loop prompting the initial input from the user
	}// end of main


	

}// end of class SmartCity
