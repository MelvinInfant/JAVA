import java.util.Scanner;
class Performance{
int[] marks=new int[10];
int highest=0;
int lowest=1;
int modef=1;
void readMarks(){
for(int i=0;i<10;i++){
	System.out.println("Enter mark of student "+i);
	Scanner myObj = new Scanner(System.in);
	marks[i]=myObj.nextInt();
}
}
void highest(){
int x=0;
for(int i=1;i<marks.length;i++){
	if(marks[x]<marks[i]){
	highest=marks[i];
	x=i;
}
}
}
void lowest(){
int x=0;
for(int i=1;i<marks.length;i++){
	if(marks[x]>marks[i]){
	lowest=marks[i];
	x=i;
}
}
}
void modefreq(){
int x=0;
for(int i=1;i<marks.length;i++){
	if(marks[x]<marks[i]){
	highest=marks[i];
	x=i;
}	else if(marks[x]==marks[i]){
	modef+=1;
}
}
}
void display(){
System.out.print("MARKS : ");
for(int i=0;i<marks.length;i++){
	System.out.print(marks[i]+" ");
}
System.out.println("\nHIGHEST MARK : " + highest);
System.out.println("LOWEST MARK : " + lowest);
System.out.println("MODE : " + highest);
System.out.println("MODE FREQUENCY : " + modef);
}
public static void main(String args[]){
Performance obj=new Performance();
obj.readMarks();
obj.highest();
obj.modefreq();
obj.lowest();
obj.display();
}
}


