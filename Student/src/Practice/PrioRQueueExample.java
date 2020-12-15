package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Algorithm that output your current location and a list of ATMs locations in that area. 
// Get you the closest K ATMs to your location.

public class PrioRQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Double> pq = new PriorityQueue<Double>((x,y)-> {Double z = y-x;return z.intValue(); });

		PrioRQueueExample pqe = new PrioRQueueExample();

		//Number of ATMs to return i.e. K

		int num_ATMs = 2;

		double curr_loc = 0.00;

		Map<String,Double> nallATMLocs = new HashMap<String,Double>();

		//Map of ATM names and their distance co-ordinates

		nallATMLocs.put("atm1",45.0);

		nallATMLocs.put("atm2",78.0);

		nallATMLocs.put("atm3",54.0);

		nallATMLocs.put("atm4",64.0);

		nallATMLocs.put("atm5",35.0);

		nallATMLocs.put("atm6",42.0);

		nallATMLocs.put("atm7",57.0);

		nallATMLocs.put("atm7",1.00);

		nallATMLocs.forEach((atm,dist) ->{if(pq.size() < num_ATMs){

		pq.add(pqe.getLocation(curr_loc,dist));}

		else{

		if(        pq.peek() > pqe.getLocation(curr_loc,dist)){

		pq.poll();

		pq.add(pqe.getLocation(curr_loc,dist));

		}

		}

		});

		pq.forEach(atmLoc -> System.out.println(atmLoc));

		}

		private double getLocation(double curr,double atm){

		return atm - curr;

		}

	}
