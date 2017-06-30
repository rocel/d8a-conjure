package io.d8a.conjure;

import java.util.Map;
import java.util.UUID;

public class UDID implements ConjureTemplateNode {

    public static UDIDNode createNode(Map config) {
        return new UDIDNode();
    }

    public StringBuilder generate(StringBuilder buff) {
        buff.append( UUID.randomUUID().toString());
        return buff;
    }
}
