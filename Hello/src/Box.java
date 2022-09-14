
public class Box {

	
	int width;
	int height;
    int depth;
	
	
	public Box(int width,int height,int depth)
	{
		
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	
        public void VolumeofSpere()
        {
        	int volume=width*depth*height;
        	System.out.println("volume of cube" +volume);
        }
        	
        	public static void main(String args[])
        	{
        		Box B = new Box(10, 20, 30);
        	    
        		B.VolumeofSpere();
        		
        		
        		
        		
        		
        	}

				
			
        	
        }
	

	

