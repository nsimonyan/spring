package org.testproject.spring;

import org.testproject.spring.basic.BasicContext;
import org.testproject.spring.destroy.DestroyContext;
import org.testproject.spring.init.InitMethodContext;
import org.testproject.spring.prototype.PrototypeContext;
import org.testproject.spring.singleton.SingletonContext;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
    	BasicContext.printMsg();

    	SingletonContext.printMsg();

        PrototypeContext.printMsg();
        
        InitMethodContext.printMsg();
        
        DestroyContext.printMsg();

    }
}

