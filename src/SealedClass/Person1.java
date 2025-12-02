package SealedClass;
import java.util.*;
import java.io.*;
public sealed class Person1 extends Human permits Person4{
    public void print()
    {
        System.out.println("Person 1");
    }
}
