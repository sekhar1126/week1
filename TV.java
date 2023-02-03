package example;



public class TV {
	int channel=1;
	int volume=1;
	boolean on;
	
		public void turnon() 
		{
			on=true;
			
		}
		void turnoff() {
			on = false;
			
		}
		void setchannel(int newchannel) {
			if( on &&channel>=1&& channel<=120) {
				channel=newchannel;
			}
			
		}
		void setvolume(int volume_level) {
			if(on&& volume_level <=7&& volume_level>=1  ) {
				volume=volume_level;
;
				
			}
		}
		void channelup() {
			if (on && channel<120) {
				channel++;
				
			}
		}void channeldown() {
			if (on&& channel<120) {
				channel--;
				
			}
		}
		void volumeup() {
			if (on && volume<7) {
				volume++;
				
			}
		}
		void volumedown() {
			if (on && volume>=7) {
				volume--;
				
				
			}
		}
		void display() {
			System.out.println("channel :"+channel+"volume level:"+volume);
		}
	
		
	

	public static void main(String[] args) {
		TV obj = new TV();
		obj.turnon();
		obj.setchannel(10);
		obj.setvolume(5);
		obj.volumeup();
		obj.channelup();
		obj.display();
		
		
		
		
	}

}
