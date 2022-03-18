package com.ss.android.lark.mail.impl.threadaction;

import java.util.ArrayList;

public class ThreadActionConfig {
    private ArrayList<String> barActionList;
    private ArrayList<String> panelActionList;

    public ArrayList<String> getBarActionList() {
        return this.barActionList;
    }

    public ArrayList<String> getPanelActionList() {
        return this.panelActionList;
    }

    public ThreadActionConfig clone() {
        ArrayList arrayList;
        ArrayList<String> arrayList2 = this.barActionList;
        ArrayList arrayList3 = null;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = (ArrayList) arrayList2.clone();
        }
        ArrayList<String> arrayList4 = this.panelActionList;
        if (arrayList4 != null) {
            arrayList3 = (ArrayList) arrayList4.clone();
        }
        return new ThreadActionConfig(arrayList, arrayList3);
    }

    public ArrayList<String> getAllActionList() {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = this.barActionList;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<String> arrayList3 = this.panelActionList;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public ThreadActionConfig(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.barActionList = arrayList;
        this.panelActionList = arrayList2;
    }
}
