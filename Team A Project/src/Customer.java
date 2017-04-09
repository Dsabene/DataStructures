/**
 * Customer.java - represents a customer at a chinese takeout restaurant.
 *
 * Goal:
 * The goal of this endeavor is to produce a working program. The
 * objective is to demonstrate techniques, specifically data structures
 * learned in this semester, as proof of learning.
 *
 * Scope:
 * The scope of work is to produce a small program, using sufficient
 * data to demonstrate the program efficacy, but no more. 'Customers’
 * will not number over 100, and dishes will not number more than 15.
 *
 * Team Members:
 * Dennis Sabene
 * Christian Dimatteo
 * Katrina Sock
 * Collin McGuire
 * Corey Lowe
 * Guang Qu
 */
public class Customer
{
    // customer attributes
    private String name;
    private float wallet;
    private int number;
    private int[] order;
    // order is to become "Dish", int is used
    // for faster matching and sorting

    /**
     * Constructs a customer with a given name and
     * an initial amount of cash.
     * @param name the customer name
     * @param cash the amount of money held by the customer
     */
    public Customer(String name, float cash)
    {
        this.name = name;
        this.wallet = cash;
        this.number = 0;
        this.order = new int[10];   // no more than 10 orders
    }

    /**
     * @return the name of the customer
     */
    public String getName()
        { return this.name; }

    /**
     * @return the current amount the customer has
     */
    public float getWallet()
        { return this.wallet; }

    /**
     * @return the number of the customer
     */
    public int getNumber()
        { return this.number; }

    /**
     * @return the order for the customer
     */
    public int getOrder(int num)
        { return this.order[num]; }

    /**
     * Sets the name of the customer
     * @param name the customer name
     */
    public void setName(String name)
        { this.name = name; }

    /**
     * Sets an amount of money the customer has
     * @param cash the amount of money
     */
    public void setWallet(float cash)
        { this.wallet = cash; }

    /**
     * Sets the customer's number in "line"
     * @param number the customer number
     */
    public void setNumber(int number)
        { this.number = number; }

    /**
     * Sets the customer's orders in an array.
     * @param order the dish that is ordered
     * @param numOrders the amount of dishes
     */
    public void setOrder(int order, int numOrders)
        { this.order = new int[numOrders]; }

    /**
     * @return the String representation of a customer
     */
    public String toString()
    {
        String result = "";
        return result;
    }

}
