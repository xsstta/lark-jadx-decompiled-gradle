package com.ss.android.lark.mail.impl.widget.picker;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.mail.impl.widget.picker.C44062c;

/* renamed from: com.ss.android.lark.mail.impl.widget.picker.a */
public class C44058a implements C44062c.AbstractC44063a {

    /* renamed from: a */
    private C1177w<Integer> f111826a = new C1177w<>();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.widget.picker.C44062c.AbstractC44063a
    /* renamed from: a */
    public C1177w<Integer> mo156734a() {
        return this.f111826a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f111826a.mo5929b((Integer) 1);
    }
}
