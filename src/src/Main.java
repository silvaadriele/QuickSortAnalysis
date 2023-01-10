package src;

public class Main {

	public static void main(String[] args){
		long startTime;
		long endTime;
		int amount = 10000;
        int v[] = new int[amount]; 
        int j=0;
        
        /*for (int i=0; i<amount; i++) {									//sorted list
        	v[i]=i;
        }/*
        
        /*for (int i=amount-1; i>=0; i--) {									// descending sorted list
        	v[j++]=i;
        }*/
        for (int i=0; i<amount;i++) {										//unsorted list
        	v[i]=(int)(Math.random() * 40000 );
        }
        
        
        String notSortedVector = "|";
        for (int i=0; i<amount; i++) {
        	notSortedVector = notSortedVector + notSortedVector.valueOf(v[i]);
            notSortedVector = notSortedVector + "|";
        }
        
        
        System.out.println("Not sorted list:\n"+notSortedVector);
        
        startTime = System.currentTimeMillis();
        Sort op = new Sort();
        op.QuickSort(v, 0, amount-1);                                   
        endTime = System.currentTimeMillis();
        
        String sortedVector = "|";
        for (int i=0; i<amount; i++) {
        	sortedVector = sortedVector + sortedVector.valueOf(v[i]);
        	sortedVector = sortedVector + "|";
        }
        System.out.println("\n\nProcessing time: " + (endTime - startTime));

        System.out.println("\n\nSorted list:\n"+sortedVector);
        System.out.println("\n\nNumber of position changes: "+op.getCounter());
    }
}
