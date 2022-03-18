package com.larksuite.component.dybrid.h5api.api;

import android.text.TextUtils;
import java.util.List;

public class H5PluginConfig {

    /* renamed from: a */
    public AbstractC24169l f59745a;

    /* renamed from: b */
    public String f59746b;

    /* renamed from: c */
    public List<String> f59747c;

    /* renamed from: d */
    public Scope f59748d = Scope.PAGE;

    public enum Scope {
        SERVICE,
        SESSION,
        PAGE
    }

    /* renamed from: a */
    public boolean mo86721a() {
        List<String> list;
        if ((!TextUtils.isEmpty(this.f59746b) || this.f59745a != null) && (list = this.f59747c) != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public H5PluginConfig(AbstractC24169l lVar, List<String> list) {
        this.f59745a = lVar;
        this.f59747c = list;
    }
}
