
public class algoritm {

	public static void main(String[] args) {

		int myArray[] = {0,0,1,1,0,0,0,1,1,1,1,0,1,1,1,1,1,1,0};

		System.out.println(search(myArray));
	}

	public static int search(int[] array){
		int maxCount = 0, countTemp = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] == 1){
				countTemp++;
			} else {
				if(countTemp > maxCount){
					maxCount = countTemp;
				}
				countTemp = 0;
			}
		}
		return maxCount;
	}
}

