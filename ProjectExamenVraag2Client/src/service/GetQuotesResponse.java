/**
 * GetQuotesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class GetQuotesResponse  implements java.io.Serializable {
    private java.lang.Object[] getQuotesReturn;

    public GetQuotesResponse() {
    }

    public GetQuotesResponse(
           java.lang.Object[] getQuotesReturn) {
           this.getQuotesReturn = getQuotesReturn;
    }


    /**
     * Gets the getQuotesReturn value for this GetQuotesResponse.
     * 
     * @return getQuotesReturn
     */
    public java.lang.Object[] getGetQuotesReturn() {
        return getQuotesReturn;
    }


    /**
     * Sets the getQuotesReturn value for this GetQuotesResponse.
     * 
     * @param getQuotesReturn
     */
    public void setGetQuotesReturn(java.lang.Object[] getQuotesReturn) {
        this.getQuotesReturn = getQuotesReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQuotesResponse)) return false;
        GetQuotesResponse other = (GetQuotesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getQuotesReturn==null && other.getGetQuotesReturn()==null) || 
             (this.getQuotesReturn!=null &&
              java.util.Arrays.equals(this.getQuotesReturn, other.getGetQuotesReturn())));
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
        if (getGetQuotesReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetQuotesReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetQuotesReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQuotesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service", ">getQuotesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQuotesReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "getQuotesReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service", "item"));
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
