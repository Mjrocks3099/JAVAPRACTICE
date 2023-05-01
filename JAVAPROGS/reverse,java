class reversehello extends Thread{
 public void run()
 {
  for(int j=49;j>=0;j--)
   System.out.println("Hello from Thread <"+(j+1)+">");
  try{
   Thread.sleep(1000);
  }
  catch(Exception e)
  {System.out.println(e);}
 }
 public static void main(){
  reversehello t[]=new reversehello [50];
  for(int i=0;i<50;i++)
   t[i]=new reversehello();
  for(int i=49;i>=0;i--)
   t[i].start();
 }
}