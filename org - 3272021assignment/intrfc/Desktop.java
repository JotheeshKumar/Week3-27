package org.intrfc;

interface HardWare {
	   void hardwareResources();
	}

	interface Software {
	   void softwareResources();
	}
	
	class desktopModel implements HardWare, Software {
	   public void hardwareResources() {
	      System.out.println("All input and output devices...");
	   }
	   
	   public void softwareResources() {
	      System.out.println("Operating system to interact with us and hardware");
	   }
	}
	
	
	
	
	public class Desktop {
		
		public static void main(String args[]) {
			desktopModel acer = new desktopModel();
			System.out.println("Details of working Computer....");
		      acer.hardwareResources();
		      acer.softwareResources();
	}
	}
	   