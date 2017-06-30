package io.d8a.conjure;

import java.util.UUID;

public class UDIDNode implements ConjureTemplateNode {

    public StringBuilder generate(StringBuilder buff) {
        buff.append( UUID.randomUUID().toString());
        return buff;
    }
}
