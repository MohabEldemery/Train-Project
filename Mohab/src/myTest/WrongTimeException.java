/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package myTest;

/**
 *
 * @author student
 */
public class WrongTimeException extends Exception{

    /**
     * Creates a new instance of <code>WrongTimeException</code> without detail
     * message.
     */
    public WrongTimeException() {
    }

    /**
     * Constructs an instance of <code>WrongTimeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public WrongTimeException(String msg) {
        super(msg);
    }
}
