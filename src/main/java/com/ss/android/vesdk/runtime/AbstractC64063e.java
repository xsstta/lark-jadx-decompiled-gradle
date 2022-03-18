package com.ss.android.vesdk.runtime;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.e */
public abstract class AbstractC64063e {

    /* renamed from: a */
    protected String f161765a;

    /* renamed from: b */
    protected String f161766b;

    /* renamed from: c */
    private List<String> f161767c = new ArrayList();

    /* renamed from: d */
    private List<String> f161768d = new ArrayList();

    /* renamed from: a */
    public abstract String mo221800a();

    /* renamed from: b */
    public void mo221805b() {
        List<String> list = this.f161767c;
        if (list != null) {
            list.clear();
            this.f161767c = null;
        }
        List<String> list2 = this.f161768d;
        if (list2 != null) {
            list2.clear();
            this.f161768d = null;
        }
    }

    /* renamed from: c */
    public String mo221806c() {
        return this.f161765a + File.separator + "temp" + ".mp4";
    }

    public AbstractC64063e(String str) {
        this.f161765a = str;
    }
}
