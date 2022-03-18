package com.bytedance.ee.bear.document.upload;

import com.bytedance.ee.bear.fileselector.bean.FileBean;

/* renamed from: com.bytedance.ee.bear.document.upload.a */
public class C6278a {

    /* renamed from: a */
    FileBean f17401a;

    /* renamed from: b */
    String f17402b;

    /* renamed from: a */
    public String mo25260a() {
        FileBean fileBean = this.f17401a;
        if (fileBean == null) {
            return null;
        }
        String mimeType = fileBean.getMimeType();
        int indexOf = mimeType.indexOf("/");
        if (indexOf != -1) {
            return mimeType.substring(indexOf + 1);
        }
        return mimeType;
    }
}
