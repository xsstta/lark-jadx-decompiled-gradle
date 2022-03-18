package com.bytedance.ee.larkwebview.p671d.p673b.p674a;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkwebview.p671d.p673b.p674a.AbstractC13430c;

/* renamed from: com.bytedance.ee.larkwebview.d.b.a.a */
public class C13428a {

    /* renamed from: a */
    private int f35405a = -1;

    /* renamed from: b */
    private AbstractC13430c.AbstractC13431a f35406b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49825a() {
        this.f35406b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49828a(AbstractC13430c.AbstractC13431a aVar, int i) {
        if (this.f35406b == null) {
            this.f35406b = aVar;
        }
        this.f35405a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49826a(int i, int i2, Intent intent) {
        AbstractC13430c.AbstractC13431a aVar;
        if (i == this.f35405a && (aVar = this.f35406b) != null) {
            aVar.mo49822a(i, i2, intent);
            this.f35406b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49827a(Fragment fragment, Intent intent, int i, AbstractC13430c.AbstractC13431a aVar) {
        this.f35406b = aVar;
        this.f35405a = i;
        fragment.startActivityForResult(intent, i);
    }
}
