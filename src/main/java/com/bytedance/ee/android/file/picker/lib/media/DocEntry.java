package com.bytedance.ee.android.file.picker.lib.media;

import android.text.TextUtils;
import java.io.Serializable;

public class DocEntry extends BaseFileEntry implements Serializable {
    private int docType;

    public static boolean isDoc(int i) {
        return i >= 1 && i <= 4;
    }

    public int getDocType() {
        return this.docType;
    }

    public void setDocType(int i) {
        this.docType = i;
    }

    public static int getDocTypeByFilePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".xls") || lowerCase.endsWith(".xlsx")) {
            return 1;
        }
        if (lowerCase.endsWith(".doc") || lowerCase.endsWith(".docx")) {
            return 2;
        }
        if (lowerCase.endsWith(".pdf")) {
            return 3;
        }
        if (lowerCase.endsWith(".ppt") || lowerCase.endsWith(".pptx") || lowerCase.endsWith(".pps")) {
            return 4;
        }
        return 0;
    }
}
