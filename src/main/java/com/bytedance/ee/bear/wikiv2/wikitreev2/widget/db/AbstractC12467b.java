package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db;

import android.text.TextUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.b */
public abstract class AbstractC12467b {
    /* renamed from: a */
    public abstract C12465a mo47444a(String str, String str2);

    /* renamed from: a */
    public abstract List<String> mo47445a();

    /* renamed from: a */
    public abstract List<C12465a> mo47446a(String str);

    /* renamed from: a */
    public abstract void mo47448a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo47451a(List<C12465a> list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo47452b(String str, List<String> list);

    /* renamed from: b */
    public abstract C12465a mo47453b(String str);

    /* renamed from: b */
    public abstract void mo47454b(List<C12465a> list);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo47456c(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo47457c(List<C12465a> list);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo47458d(List<C12465a> list);

    /* renamed from: b */
    public boolean mo47455b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            if (mo47453b(str) != null) {
                return true;
            }
            return false;
        } else if (mo47444a(str, str2) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo47449a(String str, List<C12465a> list) {
        mo47456c(str);
        mo47457c(list);
    }

    /* renamed from: a */
    public void mo47447a(String str, C12465a aVar, List<C12465a> list) {
        mo47458d(list);
        mo47454b(CollectionsKt.arrayListOf(aVar));
    }

    /* renamed from: a */
    public void mo47450a(String str, List<String> list, List<C12465a> list2) {
        mo47452b(str, list);
        mo47451a(list2);
    }
}
