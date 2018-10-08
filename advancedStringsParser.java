class FunStringGames
{
	public static void main( String [] args )
	{
		String s = "OOXXXOOOXOXOXOOOXXOXXOXOOXOXO";
      String x = “123”
		
		//System.out.println(s);
		
		System.out.println("Stage 1 value:" + stage1(s));
		
		System.out.println("Stage 2 value:" + stage2(s));
		
		System.out.println("Stage 3 value:" + stage3(s));
		
		System.out.println("Stage 4 value:" + parseInt(x));

	}
	
	//Function  stage1
	public static int stage1(String s)
	{
		int value = 0;
		String previous = "";
		String current = "";
		for(int i = 0; i < s.length(); i++)
		{
			if (i == 0 )
			{
				previous = s.substring(i, (i+1));
				continue;
			}
			
			current = s.substring(i, i+1);
			if( previous.compareTo("O") == 0 && current.compareTo("X") == 0) 
				value++;
			else if ( previous.compareTo("X") == 0 && current.compareTo("O") == 0) 
				value--;
			
			//System.out.println(i + " " + previous + " " +  current + " " + value);
			
			previous = current;	
			
		}
		return value;
	}
	
	//Function stage2	
	public static int stage2(String s)
	{
		int stage2value = 0;
		String stage2previous = "";
		String stage2current = "";
		for(int i = 0; i < s.length(); i++)
		{
			if (i == 0 )
			{
				stage2previous = s.substring(i, i+1);
				continue;
			}
			stage2current = s.substring(i, i+1);
			if (stage2previous.compareTo("X") == 0 && stage2current.compareTo("X") == 0 )
				stage2value = stage2value + 1;
			else if ( stage2previous.compareTo("O") == 0 && stage2current.compareTo("O") == 0 )
				stage2value = stage2value - 1;
			
			//	System.out.println(i + " " + stage2previous + " " +  stage2current + " " + stage2value);
			
			stage2previous = stage2current;	
		}
		return stage2value;
	}
	
	//Function stage3	
	public static int stage3(String s)
	{ int count = 0;
		int count_oxo = 0;
		String remainingS = "";
		int index = 0;
		
		//search OX
		count = searchpattern(s, "OX")
		+ ( searchpattern(s, "OXO") * -2)
		+ ( searchpattern(s, "OXOX") * 3)
		+ ( searchpattern(s, "XO") * -1)
		+ ( searchpattern(s, "XOX") * 2)
		+ ( searchpattern(s, "XOXO") * -3);
		
		
		return count;
		
		
	}
	
	public static int wordScrabler(String s) {
		int rV;
		rV = Integer.parseInt(s);
		return rV;
	}
