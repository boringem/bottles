public class Bottles{
	int startq, value = 1;

	public void setStart(int i){
		if(i>0){
startq = i;
}
else{
	system.out.println("Value must be greater than 0. Please try again.");
}
}

public void setValue(int i){
	if(i>0){
value = i;
}
else{
	system.out.println("Value must be greater than 0. Please try again.");
}
}
public void singSong(){
	for(startq: startq > 0: startq-value){
		system.out.println(startq + " bottles of sprite on the wall, " + startq + " bottles of sprite. Take one down, pass it around, " + startq-value + " bottles of sprite on the wall");
	}
}
}
