import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDrill {
	int[] stub = {3, 5, 5, 3, 3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("testing");
		
		ArrayListDrill myObj = new ArrayListDrill();
		
		System.out.println(myObj.getStopsAway());
	}

    public ArrayList getStopsAway() {
        ArrayList result = new ArrayList();

        for(int j=0; j<5; j++) {
//            int temp = "Siri.ServiceDelivery.StopMonitoringDelivery[0].MonitoredStopVisit[" + i + "].MonitoredVehicleJourney.MonitoredCall.Extensions.Distances.StopsFromCall()";
        	int temp = stub[j];
            if(temp != 0 && !result.contains(temp)) {
                result.add(temp);
            }
        }
        return result;
    }
    
}
