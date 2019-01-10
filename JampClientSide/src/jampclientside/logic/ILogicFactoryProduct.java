/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jampclientside.logic;

/**
 * Clase que devuelve objetos que implementan la interfaz. Si yo necesito un
 * objeto de la logica, hay que pedirselo a la factoria. Class that returns the
 * objects that implements the interface
 *
 * @author Julen
 */
public class ILogicFactoryProduct {

    /**
     * Metodo que va a devolver un nuevo objeto que implementa la interfaz.
     * Method that returns the new object of the implementation
     *
     * @return getIlogic
     */
    public static ILogicProduct getILogicProduct() {

        return new ILogicImplementationProduct();
    }

}
