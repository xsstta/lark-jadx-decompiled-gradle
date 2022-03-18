package com.tt.miniapp.video.p3341d.p3342a;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tt.miniapp.video.d.a.b */
public class C67096b implements AbstractC67100f {

    /* renamed from: a */
    private ArrayList<AbstractC67097c> f169152a;

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f
    /* renamed from: C */
    public ViewGroup mo233296C() {
        return null;
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f
    /* renamed from: D */
    public Context mo233297D() {
        return null;
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f
    /* renamed from: a */
    public void mo233304a(AbstractC67098d dVar) {
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f
    /* renamed from: d */
    public void mo233305d(int i) {
    }

    /* renamed from: a */
    public void mo233313a(AbstractC67097c cVar) {
        if (this.f169152a == null) {
            this.f169152a = new ArrayList<>();
        }
        if (cVar != null) {
            if (!this.f169152a.contains(cVar)) {
                this.f169152a.add(cVar);
            }
            cVar.mo233308a(this);
        }
    }

    /* renamed from: b */
    public boolean mo233314b(AbstractC67099e eVar) {
        boolean z = false;
        if (eVar == null) {
            AppBrandLogger.m52829e("BaseVideoPluginHost", "notifyVideoPluginEvent, event is null");
            return false;
        }
        AppBrandLogger.m52830i("BaseVideoPluginHost", "notifyVideoPluginEvent, event: ", Integer.valueOf(eVar.mo233317a()));
        ArrayList<AbstractC67097c> arrayList = this.f169152a;
        if (arrayList != null) {
            Iterator<AbstractC67097c> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().mo233309a(eVar)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
