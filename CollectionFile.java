package work;

import java.util.*;

public class CollectionFile {
    public static final String STANDARDALPHABET = "abcdefghijklmnopqrstuvwxyz ";
    
	public static void main(String[] args) {
		System.out.print("Enter string to check for: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
        System.out.println("Is \"" + input + "\" in standard alphabet? " + isStandard(input));
	}

	private static String isStandard(String input) {
		char[] chr = STANDARDALPHABET.toCharArray();
		
		//Collections data structures for alphabet
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		TreeMap<Character, Integer> mapTree = new TreeMap<Character, Integer>();
		HashSet<Character> set = new HashSet<Character>();
		TreeSet<Character> setTree = new TreeSet<Character>();
        List<Character> list = new ArrayList<Character>();
        LinkedList<Character> head = new LinkedList<>();
        
        Vector<Character> vect = new Vector<Character>();
		PriorityQueue<Character> queue = new PriorityQueue<Character>();
		
		for(int i = 0; i < chr.length; i++){
			map.put(chr[i], 1);
			mapTree.put(chr[i], 1);
			set.add(chr[i]);
			setTree.add(chr[i]);
			list.add(chr[i]);
			head.add(chr[i]);
			
			vect.add(chr[i]);
			queue.add(chr[i]);
		}
		
		//Check if input is in alphabet
		for(char a : input.toCharArray()){
			if(!map.containsKey(a) || !set.contains(a) || !list.contains(a) || !head.contains(a) || !mapTree.containsKey(a) || !setTree.contains(a)) {
				System.out.println("Did not find " + a + " in Collections.");
				return "NO";
			}
			
			else if(!vect.contains(a) || !queue.contains(a)){
				System.out.println("Did not find " + a + " in other.");
				return "NO";
			}
		}
		
		return "YES";
	}
}