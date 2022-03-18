package com.bytedance.platform.godzilla.plugin;

import android.app.Application;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.plugin.b */
public abstract class AbstractC20330b extends AbstractC20329a {

    /* renamed from: a */
    private List<AbstractC20329a> f49610a;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<AbstractC20329a> mo68541c();

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public final void mo68530a() {
        super.mo68530a();
        for (AbstractC20329a aVar : this.f49610a) {
            aVar.mo68530a();
        }
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public final void mo68531a(Application application) {
        super.mo68531a(application);
        List<AbstractC20329a> c = mo68541c();
        this.f49610a = c;
        for (AbstractC20329a aVar : c) {
            aVar.mo68531a(application);
        }
    }

    /* renamed from: a */
    public final void mo68642a(StartType startType) {
        for (AbstractC20329a aVar : this.f49610a) {
            if (aVar.mo68641d() == startType) {
                aVar.mo68530a();
            }
        }
    }
}
