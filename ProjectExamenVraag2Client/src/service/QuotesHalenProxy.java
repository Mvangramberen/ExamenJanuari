package service;

public class QuotesHalenProxy implements service.QuotesHalen {
  private String _endpoint = null;
  private service.QuotesHalen quotesHalen = null;
  
  public QuotesHalenProxy() {
    _initQuotesHalenProxy();
  }
  
  public QuotesHalenProxy(String endpoint) {
    _endpoint = endpoint;
    _initQuotesHalenProxy();
  }
  
  private void _initQuotesHalenProxy() {
    try {
      quotesHalen = (new service.QuotesHalenServiceLocator()).getQuotesHalen();
      if (quotesHalen != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)quotesHalen)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)quotesHalen)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (quotesHalen != null)
      ((javax.xml.rpc.Stub)quotesHalen)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.QuotesHalen getQuotesHalen() {
    if (quotesHalen == null)
      _initQuotesHalenProxy();
    return quotesHalen;
  }
  
  public java.lang.Object[] getQuotes() throws java.rmi.RemoteException{
    if (quotesHalen == null)
      _initQuotesHalenProxy();
    return quotesHalen.getQuotes();
  }
  
  public java.lang.Object[] printGezochteQuote(java.lang.Object[] aLijst, java.lang.String gezochtWoord) throws java.rmi.RemoteException{
    if (quotesHalen == null)
      _initQuotesHalenProxy();
    return quotesHalen.printGezochteQuote(aLijst, gezochtWoord);
  }
  
  public void printQuotes(java.lang.Object[] aLijst) throws java.rmi.RemoteException{
    if (quotesHalen == null)
      _initQuotesHalenProxy();
    quotesHalen.printQuotes(aLijst);
  }
  
  
}