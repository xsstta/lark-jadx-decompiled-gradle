package com.ss.android.lark.diskmanage.clean.settings;

import com.ss.android.lark.diskmanage.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class RustConfigItem implements NonProguard {
    private List<String> files = new ArrayList();

    public List<String> getFiles() {
        return this.files;
    }

    public String toString() {
        return "RustConfigItem{files=" + this.files + '}';
    }

    public void setFiles(List<String> list) {
        this.files = list;
    }
}
