package com.ss.android.lark.download.service;

import java.io.Serializable;

public class DownloadFileMeta implements Serializable {
    private static final long serialVersionUID = 5313799077813905082L;
    private String filePath;
    private int progress;

    public String getFilePath() {
        return this.filePath;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setProgress(int i) {
        this.progress = i;
    }
}
