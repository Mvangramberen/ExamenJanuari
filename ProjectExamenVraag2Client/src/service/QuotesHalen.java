/**
 * QuotesHalen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface QuotesHalen extends java.rmi.Remote {
    public java.lang.Object[] getQuotes() throws java.rmi.RemoteException;
    public java.lang.Object[] printGezochteQuote(java.lang.Object[] aLijst, java.lang.String gezochtWoord) throws java.rmi.RemoteException;
    public void printQuotes(java.lang.Object[] aLijst) throws java.rmi.RemoteException;
}
