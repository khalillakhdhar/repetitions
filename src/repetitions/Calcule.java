package repetitions;

public class Calcule {
public double factoriel(int x)
{
int f=1;
for(int i=2;i<=x;i++)
{
f*=i;	
}
return f;
}
public int pgcd(int a,int b)
{
	
while(a!=b)
{
if(a>b)
{
a=a-b;	
}
else
{
b=b-a;	
}
}
return a;


}
}
