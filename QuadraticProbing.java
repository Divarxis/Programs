class Main{
    // printing the hash table
	static void showHashTable(int hash_table[]){
		for (int i = 0; i < hash_table.length; i++) {
			System.out.print(hash_table[i] + " ");
		}
	}
	
    // quadratic probing function
	static void quadraticProbing(int hash_table[], int table_size, int Key[], int N){
        // for all the elements find the hash value
		for (int i = 0; i < N; i++) {
            // hash value calculation without any collision
			int hash_value = Key[i] % table_size;
            // checkthe  if position is empty at that hash value in hash table
			if (hash_table[hash_value] == -1)
				hash_table[hash_value] = Key[i];
			else {
                // if the position is not empty i.e collision occurs. find the next hash value by quadratic hash function
				for (int j = 0; j < table_size; j++) {
                    // quadratic hash function
					int new_hash_value = (hash_value + j * j) % table_size;
					if (hash_table[new_hash_value] == -1) {
						hash_table[new_hash_value] = Key[i];
						break;
					}
				}
			}
		}

		showHashTable(hash_table);
	}

	// Driver code
	public static void main(String args[]){
		int Key[] = { 9,19,29,39,49,59,71 };
		int N = 7;

		// Size of the hash table
		int S = 10;
		int hash_table[] = new int[S];

		// Initialize the hash table with -1
		for (int i = 0; i < S; i++) {
			hash_table[i] = -1;
		}

		// calling Quadratic probing function
		quadraticProbing(hash_table, S, Key, N);
	}
}
