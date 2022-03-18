package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.storage.AbstractC20537i;

public class LocalSettings$$SettingImpl implements LocalSettings {

    /* renamed from: a */
    private Context f50050a;

    /* renamed from: b */
    private AbstractC20537i f50051b;

    /* renamed from: c */
    private final AbstractC20513c f50052c = new AbstractC20513c() {
        /* class com.bytedance.push.settings.LocalSettings$$SettingImpl.C205091 */

        @Override // com.bytedance.push.settings.AbstractC20513c
        /* renamed from: a */
        public <T> T mo69011a(Class<T> cls) {
            return null;
        }
    };

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: b */
    public String mo69044b() {
        AbstractC20537i iVar = this.f50051b;
        if (iVar == null || !iVar.mo69132f("push_daemon_monitor_result")) {
            return "";
        }
        return this.f50051b.mo69123a("push_daemon_monitor_result");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: c */
    public String mo69046c() {
        AbstractC20537i iVar = this.f50051b;
        if (iVar == null || !iVar.mo69132f("push_channels_json_array")) {
            return "";
        }
        return this.f50051b.mo69123a("push_channels_json_array");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: d */
    public int mo69047d() {
        AbstractC20537i iVar = this.f50051b;
        if (iVar == null || !iVar.mo69132f("ali_push_type")) {
            return -1;
        }
        return this.f50051b.mo69128b("ali_push_type");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: e */
    public boolean mo69048e() {
        AbstractC20537i iVar = this.f50051b;
        if (iVar == null || !iVar.mo69132f("push_notify_enable")) {
            return true;
        }
        return this.f50051b.mo69131e("push_notify_enable");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public boolean mo69043a() {
        AbstractC20537i iVar = this.f50051b;
        if (iVar == null || !iVar.mo69132f("allow_network")) {
            return true;
        }
        return this.f50051b.mo69131e("allow_network");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50051b;
        if (iVar != null) {
            iVar.mo69126a(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public void mo69040a(int i) {
        AbstractC20537i iVar = this.f50051b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putInt("ali_push_type", i);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public void mo69041a(String str) {
        AbstractC20537i iVar = this.f50051b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("push_daemon_monitor_result", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: b */
    public void mo69045b(String str) {
        AbstractC20537i iVar = this.f50051b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("push_channels_json_array", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public void mo69042a(boolean z) {
        AbstractC20537i iVar = this.f50051b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("allow_network", z);
            b.apply();
        }
    }

    public LocalSettings$$SettingImpl(Context context, AbstractC20537i iVar) {
        this.f50050a = context;
        this.f50051b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50051b;
        if (iVar != null) {
            iVar.mo69125a(context, str, str2, aVar);
        }
    }
}
