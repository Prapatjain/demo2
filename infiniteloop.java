class infiniteloop
{
public static void main(String agrs[])
{
System.out.println("hey buddy");
try{
while(true){
System.out.println("5 sec. timeout");
Thread.sleep(5000);
}}
catch(Exception e){
System.out.println(e);
}
System.out.println("wake up after 5 sec.");
}
}

