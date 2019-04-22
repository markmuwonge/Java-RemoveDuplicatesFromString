
public class Output {
	
	public void removeDuplicates(String msg)
	{
		String word = "";
		
		String msg2 = "";
		
		int duplicatesFound = 0;
		
		String word2 = "";
		
		if (!(msg.substring(msg.length() -1, msg.length()).equals(" "))) //spaces needed to detect end of word
		{
			msg = msg + " "; //add space to the end of msg
		}
		
		for (int x = 0; x < msg.length(); x++) //loop through message
		{
			
			if (msg.substring(x, x + 1).equals(" "))  //when a space has been found in the message word has been created
			{	
				if (msg2.equals("")) //msg2 empty when appending first word
				{
					msg2 = msg2 + word + " "; //append first word to msg2 
				}
				else //msg2 not empty, check if found word exists already before adding it
				{
					for (int y = 0; y < msg2.length(); y++)
					{
						if (msg2.substring(y, y + 1).equals(" ")) 
						{
							if (word2.equals(word))
							{
								duplicatesFound++; //duplicate has been found
								
							}
							
							word2 = "";
						}
						else
						{
							word2 = word2 + msg2.substring(y, y + 1);
						}
							
					}
					
					if (duplicatesFound == 0)
					{
						msg2 = msg2 + word + " ";
					}
					
					duplicatesFound = 0;
					
				}
				
				word = "";
			}
			else //no space found in the message... append found character to word variable
			{
				word = word + msg.substring(x, x + 1); 
			}
		}
		
		System.out.println(msg2);
		
		
	}

}
