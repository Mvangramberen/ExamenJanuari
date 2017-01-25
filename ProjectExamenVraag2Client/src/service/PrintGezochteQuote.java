/**
 * PrintGezochteQuote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class PrintGezochteQuote  implements java.io.Serializable {
    private java.lang.Object[] aLijst;

    private java.lang.String gezochtWoord;

    public PrintGezochteQuote() {
    }

    public PrintGezochteQuote(
           java.lang.Object[] aLijst,
           java.lang.String gezochtWoord) {
           this.aLijst = aLijst;
           this.gezochtWoord = gezochtWoord;
    }


    /**
     * Gets the aLijst value for this PrintGezochteQuote.
     * 
     * @return aLijst
     */
    public java.lang.Object[] getALijst() {
        return aLijst;
    }


    /**
     * Sets the aLijst value for this PrintGezochteQuote.
     * 
     * @param aLijst
     */
    public void setALijst(java.lang.Object[] aLijst) {
        this.aLijst = aLijst;
    }


    /**
     * Gets the gezochtWoord value for this PrintGezochteQuote.
     * 
     * @return gezochtWoord
     */
    public java.lang.String getGezochtWoord() {
        return gezochtWoord;
    }


    /**
     * Sets the gezochtWoord value for this PrintGezochteQuote.
     * 
     * @param gezochtWoord
     */
    public void setGezochtWoord(java.lang.String gezochtWoord) {
        this.gezochtWoord = gezochtWoord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintGezochteQuote)) return false;
        PrintGezochteQuote other = (PrintGezochteQuote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aLijst==null && other.getALijst()==null) || 
             (this.aLijst!=null &&
              java.util.Arrays.equals(this.aLijst, other.getALijst()))) &&
            ((this.gezochtWoord==null && other.getGezochtWoord()==null) || 
             (this.gezochtWoord!=null &&
              this.gezochtWoord.equals(other.getGezochtWoord())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getALijst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getALijst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getALijst(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGezochtWoord() != null) {
            _hashCode += getGezochtWoord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintGezochteQuote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service", ">printGezochteQuote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ALijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "aLijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gezochtWoord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "gezochtWoord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
