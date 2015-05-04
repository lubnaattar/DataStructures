package Collections.RL_Impl_SeparateChaining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HashChainApp {
	public static void main(String[] args) throws IOException {
		int aKey;
		Link aDataItem;
		int size, n, keysPerCell = 100;
		// get sizes
		putText("Enter size of hash table: ");
		size = getInt();
		putText("Enter initial number of items: ");
		n = getInt();
		// make table
		HashTable theHashTable = new HashTable(size);
		for (int j = 0; j < n; j++) // insert data
		{
			aKey = (int) (java.lang.Math.random() * keysPerCell * size);
			aDataItem = new Link(aKey);
			theHashTable.insert(aDataItem);
		}
		while (true) // interact with user
		{
			putText("Enter first letter of ");
			putText("show, insert, delete, or find: ");
			char choice = getChar();
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				putText("Enter key value to insert: ");
				aKey = getInt();
				aDataItem = new Link(aKey);
				theHashTable.insert(aDataItem);
				break;
			case 'd':
				putText("Enter key value to delete: ");
				aKey = getInt();
				theHashTable.delete(aKey);

				break;
			case 'f':
				putText("Enter key value to find: ");
				aKey = getInt();
				aDataItem = theHashTable.find(aKey);
				if (aDataItem != null)
					System.out.println("Found " + aKey);
				else
					System.out.println("Could not find " + aKey);
				break;
			default:
				putText("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
		// -------------------------------------------------------------

	public static void putText(String s) {
		System.out.print(s);
		System.out.flush();
	}

	// -------------------------------------------------------------

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	// -------------------------------------------------------------
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------

} // end class HashChainApp