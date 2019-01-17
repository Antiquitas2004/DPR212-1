class Bicycle 
{
int cadence = 0; //variables
int speed = 0;
int gear = 1;

void changeCadence(int new Value)
{//methods
cadence=newValue;
}

void changeGear (int newValue)
{
gear=newValue;
}

void speedUp(int increment)
{
speed=speed+increment;
}

void applyBrakes(int decrement)
{
speed=speed-decrement;
}

void printStates() 
{//print out our current states
system.out.println("cadence:"+
cadence + "speed:"+
speed+ "gear:"+gear);
}
}
