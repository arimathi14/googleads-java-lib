// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * ConversionEvent_TrackingUrlsMapEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201911;


/**
 * This represents an entry in a map with a key of type ConversionEvent
 * and value of type TrackingUrls.
 */
public class ConversionEvent_TrackingUrlsMapEntry  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v201911.ConversionEvent key;

    private com.google.api.ads.admanager.axis.v201911.TrackingUrls value;

    public ConversionEvent_TrackingUrlsMapEntry() {
    }

    public ConversionEvent_TrackingUrlsMapEntry(
           com.google.api.ads.admanager.axis.v201911.ConversionEvent key,
           com.google.api.ads.admanager.axis.v201911.TrackingUrls value) {
           this.key = key;
           this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("key", getKey())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the key value for this ConversionEvent_TrackingUrlsMapEntry.
     * 
     * @return key
     */
    public com.google.api.ads.admanager.axis.v201911.ConversionEvent getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConversionEvent_TrackingUrlsMapEntry.
     * 
     * @param key
     */
    public void setKey(com.google.api.ads.admanager.axis.v201911.ConversionEvent key) {
        this.key = key;
    }


    /**
     * Gets the value value for this ConversionEvent_TrackingUrlsMapEntry.
     * 
     * @return value
     */
    public com.google.api.ads.admanager.axis.v201911.TrackingUrls getValue() {
        return value;
    }


    /**
     * Sets the value value for this ConversionEvent_TrackingUrlsMapEntry.
     * 
     * @param value
     */
    public void setValue(com.google.api.ads.admanager.axis.v201911.TrackingUrls value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionEvent_TrackingUrlsMapEntry)) return false;
        ConversionEvent_TrackingUrlsMapEntry other = (ConversionEvent_TrackingUrlsMapEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionEvent_TrackingUrlsMapEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "ConversionEvent_TrackingUrlsMapEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "ConversionEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "TrackingUrls"));
        elemField.setMinOccurs(0);
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
