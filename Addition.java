class Addition
{

/*public int add(int a ,int b){
return a+b;
}
public int add(int a,int b, int c){
return a+b+c;


}*/
 public int add(int b,int c,int ...a){
int sum=0;
 for(int i=0;i<a.length;i++){
 sum=sum+a[i];

}
return sum;
}
 
public static void main(String arg[]){

Addition obj=new Addition();
int sum=obj.add(3,4,4,5,7,9,4,8);
System.out.println("Addition is"+sum);
}
}
