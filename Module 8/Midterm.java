/* Nestor J Alvarez
   CS 111B, Professor Schatz
   22 March 2016
*/

//Question 1

public static int[] intArrayWithStringLengths(String[] s) {

   String temp;
   int str_length[] = new int[s.length];

   for(int i = 0; i < s.length; i++) {
      temp = s[i];
      str_length[i] = temp.length;
   }

}

//Question 2

6
6
6
6
6
6

//Question 3

"This" is a keyword to help distinguish between two similar objects objects. The one whose methods
are being invoked is refered to with "this".method() or "this".value. In constuctors, it helps 
distinguish with whether the value of the object is being changed or a similar-named
parameter value. 

//Question 4

public class BARTTrain {

   private String nextStation;
   private double milesPerHour;
   private double milesToNextStation;
   private boolean inbound;
   
   public BARTTrain() {
      nextStation = "";
      milesPerHour = 0.0;
      milesToNextStation = 0.0;
      inBound = false;
   }
   
   public BARTTrain(String station, double mph, double miles, boolean isInbound) {
      nextStation = station;
      milesPerHour = mph;
      milesToNextStation = miles;
      inbound = isInboud;
   }
   
   public void setNextStation(String s) {
      nextStation = s;
   }
   
   public String getNextStation() {
      return nextStation;
   }
   
   public double getMinutesToNextStation() {
      double minutes;
      //d = rt --> t = d / r
      //    miles                miles * hour         60 minutes           
      //    -----          ->       -----       x        -----       =     minute
      //miles per hour              miles                1 hour 
      minutes = ((milesToNextStation / milesPerHour) * 60.0);
      return minutes;
   }
   
   public void switchInbound() {
      if(inbound) {
         inbound = false;
      } else {
         inbound = true;
      }
   }

}

//Question 5

   public boolean equals(BARTTrain t) {
   
      private double EPSILON = 0.000001;
   
      /* Since we only have access to two values--the minutes to the next station, and the next station itself--
         these values have to match. It follows that two trains are the same if they have same nextStation and 
         the same time to get there... Unfortunately, if we have station order A, B, C and the distance
         between A and B is the same as the distance from B and C and two trains (one from A, the other from C)
         then they would be the same under the following test conditions. In real life, this might be overlooked.
         Here, I'd rather explain my reasoning so I don't lose points.
         
         GRAPHICALLY
         
         A                    B                    C
         |-----100 mi.--------|
                              |----100 mi. --------|
       this.train > 100 mph            100 mph < t.train
       time = 1 min                       time = 1 min
       
       I added the epsilon value since Java == gets iffy somtimes with testing at least from prior experience.
       
       In case we are allowed to add another helped method, the additional if-test is put here, commented out for
       the sake of the midterm.
       
       The additional accessor method would just be 
       
               public boolean isInbound() {
                  return inbound;
               }
         
         and be inside the BARTTrain class, not the equals method below.
       */
      
      
      
      if ((Math.abs(this.getMinutesToNextStation() - t.getMinutesToNextStation() ) < EPSILON) && ((this.getNextStation() == t.getNextStation() ))) {
         //if(this.isInbound() == t.isInbound()) {      
            return true;
         //}
      }
      
   
   }
   
   //Question 6
   
   public String toString() {
      if(inbound) {
         return ("Inbound. " + this.getNextStation() + " in " + this.getMinutesToNextStation() + " minutes");
      }
      
      return ("Outbound. " + this.getNextStation() + " in " + this.getMinutesToNextStation() + " minutes");
      
   }