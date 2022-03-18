package com.ss.android.lark.eetroublecapture;

import android.view.View;
import com.larksuite.suite.R;
import java.util.Map;

/* renamed from: com.ss.android.lark.eetroublecapture.n */
public class C36997n implements AbstractC36983e {

    /* renamed from: a */
    protected boolean f95111a;

    /* renamed from: b */
    protected boolean f95112b;

    /* renamed from: c */
    protected Map<String, String> f95113c;

    @Override // com.ss.android.lark.eetroublebase.AbstractC36967b
    /* renamed from: c */
    public Map<String, String> mo129679c() {
        return this.f95113c;
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36983e
    /* renamed from: b */
    public boolean mo136497b() {
        return this.f95112b;
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36983e
    /* renamed from: a */
    public boolean mo136496a() {
        return this.f95111a;
    }

    /* renamed from: a */
    public void mo136514a(Map<String, String> map) {
        this.f95113c = map;
    }

    /* renamed from: b */
    public void mo136516b(boolean z) {
        this.f95112b = z;
    }

    /* renamed from: a */
    public void mo136515a(boolean z) {
        this.f95111a = z;
    }

    /* renamed from: a */
    public static void m146013a(View view, C36997n nVar) {
        view.setTag(R.id.tag_troublecapture_view, nVar);
    }
}
