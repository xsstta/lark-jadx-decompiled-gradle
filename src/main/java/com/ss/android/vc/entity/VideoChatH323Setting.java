package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class VideoChatH323Setting implements Serializable {
    private ArrayList<H323Access> h323AccessList;

    public ArrayList<H323Access> getH323AccessList() {
        return this.h323AccessList;
    }

    public void setH323AccessList(ArrayList<H323Access> arrayList) {
        this.h323AccessList = arrayList;
    }
}
