package com.ss.android.vesdk.bean;

import java.util.ArrayList;

public class VEUndoRedoBean {
    private String commandTag;
    private String layerId;
    private int undoIndex;

    public static class JniHolder {
        private ArrayList<VEUndoRedoBean> beans = new ArrayList<>();

        public ArrayList<VEUndoRedoBean> getJniResult() {
            return this.beans;
        }

        private void jniAdd(int i, String str, String str2) {
            this.beans.add(new VEUndoRedoBean(i, str, str2));
        }
    }

    public String getCommandTag() {
        return this.commandTag;
    }

    public int getIndex() {
        return this.undoIndex;
    }

    public String getLayerId() {
        return this.layerId;
    }

    private VEUndoRedoBean(int i, String str, String str2) {
        this.undoIndex = i;
        this.layerId = str;
        this.commandTag = str2;
    }
}
