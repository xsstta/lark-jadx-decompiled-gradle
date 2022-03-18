package com.ss.android.lark.inno.network;

import java.io.Serializable;

public class VcLiveResponse<Data> implements Serializable {
    public int code;
    public Data data;
    public String message;
}
