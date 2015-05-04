/*package Heap;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

class HeapApp {
	public static void main(String[] args) throws IOException {
		int value, value2;
		Heap theHeap = new Heap(31); // make a Heap; max size 31
		boolean success;

		theHeap.insert(70); // insert 10 items
		theHeap.insert(40);
		theHeap.insert(50);
		theHeap.insert(20);
		theHeap.insert(60);
		theHeap.insert(100);
		theHeap.insert(80);
		theHeap.insert(30);
		theHeap.insert(10);
		theHeap.insert(90);
		while (true) // until [Ctrl]-[C]
		{
			putText("Enter first letter of ");
			putText("show, insert, remove, change: ");
			int choice = getChar();
			switch (choice) {
			case 's': // show
				theHeap.displayHeap();
				break;
			case 'i': // insert
				putText("Enter value to insert: ");
				value = getInt();
				success = theHeap.insert(value);
				if (!success)
					putText("Can't insert; heap is full" + '\n');
				break;
			case 'r': // remove
				if (!theHeap.isEmpty())
					theHeap.remove();
				else
					putText("Can't remove; heap is empty" + '\n');
				break;
			case 'c': // change
				putText("Enter index of item: ");
				value = getInt();
				putText("Enter new priority: ");
				value2 = getInt();
				success = theHeap.change(value, value2);
				if (!success)
					putText("Can't change; invalid index" + '\n');
				break;
			default:
				putText("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
		// ------------------------------------------------------------

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

	// -------------------------------------------------------------
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------
} // end class HeapApp*/