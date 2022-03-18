package com.bytedance.ee.bear.document.comment;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.document.comment.c */
public class C5715c<T> extends C1177w {
    C5715c() {
    }

    /* renamed from: f */
    private void m23102f() {
        try {
            Field declaredField = LiveData.class.getDeclaredField("i");
            declaredField.setAccessible(true);
            if (declaredField.getBoolean(this)) {
                declaredField.setBoolean(this, false);
            }
            C13479a.m54764b("SecureLiveData", "clearDispatchStatus success");
        } catch (Exception unused) {
            C13479a.m54758a("SecureLiveData", "clearDispatchStatus error");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: b */
    public void mo5929b(Object obj) {
        try {
            super.mo5929b(obj);
        } catch (Exception e) {
            C13606d.m55245a("SecureLiveData", e);
            m23102f();
        }
    }
}
