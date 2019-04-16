import java.util.List;

public class Sorted implements isSorted{
	private static String[][] rules = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
	public boolean isWellSorted( String[] sequence )
	{
	  for(int i = 0; i < sequence.length; i++)
	  {
	    for(String[] rule: rules)
	    {
	       if(rule[1] == sequence[i])
	       {
	          boolean found = false;
	          for(int k = 0; k<i; k++)
	          {
	             if(sequence[k] == rule[0]) found = true;
	          }
	          if(!found) return false;
	       }
	    }
	  }
	  return true;
	}
}