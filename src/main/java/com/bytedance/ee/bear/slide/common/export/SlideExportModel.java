package com.bytedance.ee.bear.slide.common.export;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class SlideExportModel implements NonProguard {
    private List<String> ext;
    private int status;
    private int type;

    public List<String> getExt() {
        return this.ext;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    /* access modifiers changed from: package-private */
    public String parseExtToString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.ext) {
            sb.append(str);
            sb.append('|');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public void setExt(List<String> list) {
        this.ext = list;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
