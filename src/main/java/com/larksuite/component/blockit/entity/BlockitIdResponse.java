package com.larksuite.component.blockit.entity;

import java.io.Serializable;

public class BlockitIdResponse implements Serializable {
    public int code;
    public Data data;
    public String msg;

    public class Data implements Serializable {
        public String BlockID;

        public Data() {
        }
    }
}
