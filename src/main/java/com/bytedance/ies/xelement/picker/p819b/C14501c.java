package com.bytedance.ies.xelement.picker.p819b;

import android.content.Context;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p820c.C14503a;
import com.bytedance.ies.xelement.picker.p820c.C14504b;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14513g;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14514h;
import com.bytedance.ies.xelement.picker.view.View$OnClickListenerC14531c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.b.c */
public class C14501c extends AbstractC14499a<C14501c> {

    /* renamed from: a */
    private C14504b f38261a;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.p819b.AbstractC14499a
    /* renamed from: a */
    public C14503a mo53390a() {
        return this.f38261a;
    }

    /* renamed from: b */
    public View$OnClickListenerC14531c mo53403b() {
        return new View$OnClickListenerC14531c(this.f38261a);
    }

    /* renamed from: a */
    public C14501c mo53398a(LocalizeAdapter aVar) {
        this.f38261a.f38304L = aVar;
        return this;
    }

    public C14501c(Context context) {
        C14504b bVar = new C14504b();
        this.f38261a = bVar;
        bVar.f38275f = context;
    }

    /* renamed from: a */
    public C14501c mo53399a(AbstractC14513g gVar) {
        this.f38261a.f38296D = gVar;
        return this;
    }

    /* renamed from: a */
    public C14501c mo53400a(AbstractC14514h hVar) {
        this.f38261a.f38297E = hVar;
        return this;
    }

    /* renamed from: b */
    public C14501c mo53402b(List<Integer> list) {
        if (list == null) {
            this.f38261a.f38300H = null;
        } else {
            this.f38261a.f38300H = new ArrayList(list);
        }
        return this;
    }

    /* renamed from: a */
    public C14501c mo53401a(List<List<String>> list) {
        if (list == null) {
            this.f38261a.f38298F = null;
        } else {
            this.f38261a.f38298F = new ArrayList(list);
        }
        return this;
    }
}
