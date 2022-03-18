package com.larksuite.component.dynamicresources;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.larksuite.component.air.AbstractC24045b;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.larksuite.component.dynamicresources.d */
class C24291d implements AbstractC24045b {

    /* renamed from: a */
    private final C24301g f59953a = C24301g.m88706a();

    /* renamed from: b */
    private final Set<Activity> f59954b = new HashSet();

    /* renamed from: c */
    private final Map<Activity, LayoutInflater$Factory2C24292e> f59955c = new LinkedHashMap();

    /* renamed from: d */
    private final boolean f59956d;

    @Override // com.larksuite.component.air.AbstractC24045b
    /* renamed from: c */
    public void mo86287c(Activity activity) {
        this.f59955c.remove(activity);
        this.f59954b.remove(activity);
        this.f59953a.mo86993a(activity);
    }

    public C24291d(boolean z) {
        this.f59956d = z;
    }

    @Override // com.larksuite.component.air.AbstractC24045b
    /* renamed from: a */
    public void mo86285a(Activity activity) {
        if (C24301g.m88706a().mo86999d()) {
            this.f59954b.add(activity);
            this.f59955c.put(activity, LayoutInflater$Factory2C24292e.m88684a((Context) activity));
        }
    }

    @Override // com.larksuite.component.air.AbstractC24045b
    /* renamed from: b */
    public void mo86286b(Activity activity) {
        LayoutInflater$Factory2C24292e eVar = this.f59955c.get(activity);
        if (eVar != null && eVar.mo86983a() == null && (activity instanceof AppCompatActivity)) {
            AppCompatDelegate delegate = ((AppCompatActivity) activity).getDelegate();
            if (delegate instanceof LayoutInflater.Factory) {
                eVar.mo86984a((LayoutInflater.Factory) delegate);
            }
        }
    }

    @Override // com.larksuite.component.air.AbstractC24045b
    /* renamed from: a */
    public Resources mo86283a(Activity activity, Resources resources) {
        if (this.f59954b.contains(activity)) {
            return this.f59953a.mo86989a(activity, resources);
        }
        return resources;
    }

    @Override // com.larksuite.component.air.AbstractC24045b
    /* renamed from: a */
    public Resources mo86284a(Application application, Resources resources) {
        if (this.f59956d) {
            return this.f59953a.mo86990a(application, resources);
        }
        return resources;
    }
}
