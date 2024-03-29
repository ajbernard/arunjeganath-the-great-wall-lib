/*
 * Copyright WizTools.org
 * Licensed under the Apache License, Version 2.0:
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package org.wiztools.commons;

/**
 * Convenience method to encode XML pre-defined entity characters.
 * @author subwiz
 */
public final class XmlEntityEncode {
    private XmlEntityEncode(){}

    public static String encode(final String input){
        String t = input.replaceAll("&", "&amp;");
        t = t.replaceAll("<", "&lt;");
        t = t.replaceAll(">", "&gt;");
        t = t.replaceAll("'", "&apos;");
        t = t.replaceAll("\"", "&quot;");
        return t;
    }
}
