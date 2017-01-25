<%@page import="service.QuotesHalenProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oscar wilde quotes</title>
</head>
<body>

<H1>Quotes van Oscar Wilde</H1>
<%
// JSP gebruiken voor de logica.
String zoekwoord = request.getParameter("zoekwoord");

// Arraylist maken voor het opslaan van de quotes
ArrayList<String> quotes = new ArrayList<String>();

// Proxy aanmaken voor het de quotes te kunnen gebruiken die in de webservice terug gehaald zijn geweest.
QuotesHalenProxy proxy = new QuotesHalenProxy();

// Als het zoekwoord niet ingevuld is of enkel spaties 
// Geef dan de volledige lijst weer
if(zoekwoord != null || zoekwoord.trim() == ""){
	System.out.println("wel zoekwoord");
	// Uitprinten van de Quotes die terugkomen adhv het zoekwoord
	//proxy.printQuotes((proxy.printGezochteQuote((proxy.getQuotes()), zoekwoord)));
	
	proxy.printQuotes(proxy.printGezochteQuote(proxy.getQuotes(), zoekwoord));
	quotes = (proxy.printGezochteQuote(proxy.getQuotes(), zoekwoord));
}
else
{
	// Uitprinten van alle Quotes
	System.out.println("Geen zoekwoord");
	proxy.printQuotes(proxy.getQuotes());
	quotes = proxy.getQuotes();
}
%>
<table>
<%

// Loop maken om alle quotes in een HTML tabel te printen.
int i =0;
for (String a : quotes)
{
%>
<tr><td>
<%=quotes.get(i) %></td></tr>
<%i++;}
%>
</table>


</body>
</html>