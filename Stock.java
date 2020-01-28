import java.util.*;
class Stock{
String stockname;
String stocksymbol;
double prevprice;
double curprice;
Stock()
{
stockname="xxxx";
stocksymbol="y";
prevprice=30.4;
curprice=40.2;
}
double changePercentage()
{
Double per=(curprice-prevprice)*100/prevprice;
return per;
}
public static void main(String args[])
{
Stock obj=new Stock();
System.out.println(obj.changePercentage());
}
}