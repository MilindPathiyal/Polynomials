// Milind Pathiyal

//Program follows polyDriver commands. For example, it will ask user to input coefficients for the a and b polynomials and follows various math steps such as adding and subtracting

public class Polynomial
{
    private int second;
    private int first;
    private int zero;
    //Pre:None
    //Post:Prints polynomial in a string formation
    public String toString()
    {
        String answer = new String();
        answer = second + "x^2" + "+" + first + "x" + "+" + zero;
        return answer;
    }
    //Pre:None
    //Post:Creates a polynomial with coefficients of 0
    public Polynomial()
    {
        this.second = 0;
        this.first = 0;
        this.zero = 0;
    }
    //Pre:None
    //Post:Substitutes given values into the coefficients
    public Polynomial(int second, int first, int zero)
    {
        this.second = second;
        this.first = first;
        this.zero = zero;
    }
    //Pre:None
    //Post:Sets polynomial to have coefficients
    public void setPoly(int second, int first, int zero)
    {
        this.second = second;
        this.first = first;
        this.zero = zero;
    }
    //Pre:None
    //Post:Adds the polynomials 
    public Polynomial add(Polynomial other)
    {
        Polynomial answer = new Polynomial();
        answer.second = this.second + other.second;
        answer.first = this.first + other.first;
        answer.zero = this.zero + other.zero;
        return answer;
    }
    //Pre:None
    //Post:Subtracts the polynomials
    public Polynomial subtract(Polynomial other)
    {
        Polynomial answer = new Polynomial();
        answer.second = this.second - other.second;
        answer.first = this.first - other.first;
        answer.zero = this.zero - other.zero;
        return answer;
    }
    //Pre:X^2 coefficient must equal 0
    //Post:squares both polynomials
    public Polynomial multiply(Polynomial other)
    {
        Polynomial answer = new Polynomial();
        answer.second = this.second * other.second;
        answer.first = (this.first * other.zero) + (this.first * other.zero);
        answer.zero = this.zero * other.zero;
        return answer;
    }
    //Pre:X^2 coefficient must be equal to 0
    //Post:squares both polynomials
    public void square()
    {
        this.second = this.second * this.second;
        this.first = (this.first * this.first);
        this.zero = this.zero * this.zero;
    }
    //Pre:Only works with perfect squares
    //Post:Finds the square root of a perfect square
    public void squareRoot()
    {
        this.first = (int)Math.sqrt(second);
        this.zero = (int)Math.sqrt(this.zero); 
        this.second = 0;
    }
}
    
/*
Welcome to the polynomial calculator
1. Set polynomial a
2. Set polynomial b
3. Add a + b
4. Subtract a - b
5. Multiply a * b
6. Square a
7. Get the square root of a
0. Quit
1
Enter the the coefficients for the 2, 1, and 0 powers for a
3
2
1
a now equals 3x^2+2x+1
*/
    
