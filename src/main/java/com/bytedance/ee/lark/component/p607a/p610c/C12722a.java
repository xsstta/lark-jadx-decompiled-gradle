package com.bytedance.ee.lark.component.p607a.p610c;

import android.view.View;
import com.bytedance.ee.lark.component.p607a.p613f.C12730a;
import com.bytedance.ee.larkwebview.p670c.AbstractC13420b;

/* renamed from: com.bytedance.ee.lark.component.a.c.a */
public class C12722a implements AbstractC13420b {

    /* renamed from: a */
    private String f34068a;

    /* renamed from: b */
    private C12730a f34069b;

    @Override // com.bytedance.ee.larkwebview.p670c.AbstractC13420b
    /* renamed from: c */
    public void mo48175c() {
    }

    @Override // com.bytedance.ee.larkwebview.p670c.AbstractC13420b
    /* renamed from: a */
    public String mo48171a() {
        return this.f34068a;
    }

    @Override // com.bytedance.ee.larkwebview.p670c.AbstractC13420b
    /* renamed from: b */
    public View mo48174b() {
        return this.f34069b;
    }

    public C12722a(String str, C12730a aVar) {
        this.f34068a = str;
        this.f34069b = aVar;
    }

    @Override // com.bytedance.ee.larkwebview.p670c.AbstractC13420b
    /* renamed from: a */
    public void mo48172a(int i, int i2) {
        this.f34069b.mo48206a(this.f34068a, i, i2);
    }

    @Override // com.bytedance.ee.larkwebview.p670c.AbstractC13420b
    /* renamed from: a */
    public void mo48173a(int i, int i2, int i3, int i4) {
        this.f34069b.mo48207a(this.f34068a, i, i2, i3, i4);
    }
}
