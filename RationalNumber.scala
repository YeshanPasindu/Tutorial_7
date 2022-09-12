//Q1 and Q2

case class RationalNumber(m: Int, n: Int){
    if(n == 0) throw new IllegalArgumentException("deninator cannot be 0")
    
    def this(m: Int) = this(m, 1)

    private def GCD(a: Int, b: Int): Int = if (b == 0) a.abs else GCD(b, (a % b))
    
    private def gcd = GCD(n, m)
    private def num = m / gcd
    private def den = n / gcd
    

    def -(that: RationalNumber) = RationalNumber(num * that.den - that.num * den, den * that.den)
    override def toString = s"$num/$den"
    
}
object MyApp extends App{
        val x = RationalNumber(3, 4)
        val y = RationalNumber(5, 8)
        val z = RationalNumber(2, 7)
        println(x - y - z)
}