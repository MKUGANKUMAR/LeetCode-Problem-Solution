public class bestTimeForBuyAndSellStock 
{

  public static void main(String[] args) {
    int price[]={7,1,5,3,6,4};
    int min=price[0];
    int profit=0;

    for(int i=0;i<price.length;i++)
    {
      if(price[i]<min) min = price[i];
      profit=price[i]-min>=profit?price[i]-min:profit;
    }
    System.out.println("profit is :"+ profit);
  }
}
