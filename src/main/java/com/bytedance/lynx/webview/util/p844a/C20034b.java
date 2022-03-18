package com.bytedance.lynx.webview.util.p844a;

import android.text.TextUtils;
import com.bytedance.lynx.webview.util.p844a.AbstractC20035c;
import com.bytedance.lynx.webview.util.p844a.C20038e;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lynx.webview.util.a.b */
public class C20034b implements AbstractC20035c.AbstractC20036a {

    /* renamed from: a */
    private C20038e.AbstractC20039a f48959a;

    @Override // com.bytedance.lynx.webview.util.p844a.AbstractC20035c.AbstractC20036a
    /* renamed from: a */
    public void mo68002a() {
    }

    @Override // com.bytedance.lynx.webview.util.p844a.AbstractC20035c.AbstractC20036a
    /* renamed from: a */
    public void mo68003a(int i) {
    }

    @Override // com.bytedance.lynx.webview.util.p844a.AbstractC20035c.AbstractC20036a
    /* renamed from: a */
    public void mo68004a(int i, Map<String, List<String>> map) {
    }

    @Override // com.bytedance.lynx.webview.util.p844a.AbstractC20035c.AbstractC20036a
    /* renamed from: b */
    public void mo68007b(int i) {
    }

    /* renamed from: a */
    public void mo68005a(C20038e.AbstractC20039a aVar) {
        this.f48959a = aVar;
    }

    @Override // com.bytedance.lynx.webview.util.p844a.AbstractC20035c.AbstractC20036a
    /* renamed from: a */
    public void mo68006a(C20038e eVar) {
        if (eVar == null || eVar.f48966b == null || !TextUtils.equals("200", eVar.f48965a)) {
            C20038e.AbstractC20039a aVar = this.f48959a;
            if (aVar != null) {
                aVar.mo67764b(eVar);
                return;
            }
            return;
        }
        C20038e.AbstractC20039a aVar2 = this.f48959a;
        if (aVar2 != null) {
            aVar2.mo67762a(eVar);
        }
    }
}
