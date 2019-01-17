public class MountainBike extends Bicycle
{
private String suspension;

public MountainBike 
{
int startCadence;
int startSpeed;
int startGear;
String suspensionType)
{
super(startCadence,
startSpeed,
startGear);
this.setSuspension(suspensionType);
}

public String getSuspension()
{
returnthis.suspension;
}

public void setSuspension(String suspensionType)
{
this.suspension=suspensionType;
}

public void printDescription()
{
super.printDescription();
system.out.println("The " + "MountainBike has a "+
getsuspension()+ " suspension.";
}
}
