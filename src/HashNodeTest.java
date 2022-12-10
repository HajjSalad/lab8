import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashNodeTest {

	@Test
	public void test() {

	    for (map element : elements) {
	        Object key = element.getKey();
	        Object data = element.getData();
	        HashTableElement found = hashTable.search(key);
	        assertTrue(found != null);
	        assertTrue(found.getData().equals(data));
	    }
	}
}