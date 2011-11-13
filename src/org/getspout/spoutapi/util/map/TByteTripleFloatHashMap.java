package org.getspout.spoutapi.util.map;
import gnu.trove.TFloatCollection;
import gnu.trove.iterator.TIntFloatIterator;
import gnu.trove.map.hash.TIntFloatHashMap;
import gnu.trove.set.TIntSet;

/**
 * A simplistic map that supports a 3 bytes for keys, using a trove int float hashmap in the backend.
 * @author Afforess
 *
 */
public class TByteTripleFloatHashMap{
	private TIntFloatHashMap map;
	
	public TByteTripleFloatHashMap() {
		map = new TIntFloatHashMap(100);
	}
	
	public TByteTripleFloatHashMap(int capacity){
		map = new TIntFloatHashMap(capacity);
	}
	
	public float put(int key1, int key2, int key3, float value) {
		int key = key(key1, key2, key3);
		return map.put(key, value);
	}
	
	public float get(int key1, int key2, int key3) {
		int key = key(key1, key2, key3);
		return map.get(key);
	}
	
	public boolean containsKey(int key1, int key2, int key3) {
		int key = key(key1, key2, key3);
		return map.containsKey(key);
	}
	
	public void clear() {
		map.clear();
	}

	public boolean containsValue(float val) {
		return map.containsValue(val);
	}

	public boolean increment(int key1, int key2, int key3) {
		int key = key(key1, key2, key3);
		return map.increment(key);
	}

	public boolean isEmpty() {
		return map.isEmpty();
	}

	public TIntFloatIterator iterator() {
		return map.iterator();
	}

	public TIntSet keySet() {
		return map.keySet();
	}

	public int[] keys() {
		return map.keys();
	}

	public float remove(int key1, int key2, int key3) {
		int key = key(key1, key2, key3);
		return map.remove(key);
	}

	public int size() {
		return map.size();
	}

	public TFloatCollection valueCollection() {
		return map.valueCollection();
	}

	public float[] values() {
		return map.values();
	}
	
	private static final int key(int x, int y, int z) {
		return ((x & 0xF) << 11) | ((z & 0xF) << 7) | (y & 0x7F);
	}
}
