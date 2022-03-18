package com.ss.android.lark.diskmanage.clean.settings;

import com.ss.android.lark.diskmanage.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class ExpiredConfigItem implements NonProguard {
    long expiredTime = -1;
    private List<String> files = new ArrayList();

    public long getExpiredTime() {
        return this.expiredTime;
    }

    public List<String> getFiles() {
        return this.files;
    }

    public String toString() {
        return "ExpiredConfigItem{files=" + this.files + ", expiredTime=" + this.expiredTime + '}';
    }

    public void setExpiredTime(long j) {
        this.expiredTime = j;
    }

    public void setFiles(List<String> list) {
        this.files = list;
    }
}
