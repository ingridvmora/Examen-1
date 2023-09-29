package logica;

public class Tablero {
	int[][] arr;
	
	public Tablero() {
       
        arr = new int[8][8];

        // Fill the array with some numbers:
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i+j;
            }
        }
    }

}
