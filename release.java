public class release {
    static void print_prime(int n)
    {
    for(int i = 2 ; i<=n ; i++)
    {
        if(isPrime(i))
        {
            System.out.println(i);
        }
    }
    }
static boolean isPrime(int n)
{
if(n<=0)
{
    return false;
}
else if(n==2)
{
    return true;
}
else if(n%2 == 0)
{
    return false;
}
for(int i  = 3 ; i*i<=n ; i++)
{
    if(n%i == 0)
    {
        return false;
    }
}
return true;
}
    public static void main(String[] args) {
print_prime(370);
    }



}
