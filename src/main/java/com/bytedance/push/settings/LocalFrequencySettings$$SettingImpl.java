package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.p883e.C20403a;
import com.bytedance.push.p883e.C20409d;
import com.bytedance.push.settings.storage.AbstractC20537i;
import java.util.List;

public class LocalFrequencySettings$$SettingImpl implements LocalFrequencySettings {

    /* renamed from: a */
    private Context f50046a;

    /* renamed from: b */
    private AbstractC20537i f50047b;

    /* renamed from: c */
    private final AbstractC20513c f50048c = new AbstractC20513c() {
        /* class com.bytedance.push.settings.LocalFrequencySettings$$SettingImpl.C205081 */

        @Override // com.bytedance.push.settings.AbstractC20513c
        /* renamed from: a */
        public <T> T mo69011a(Class<T> cls) {
            if (cls == C20522l.class) {
                return (T) new C20522l();
            }
            if (cls == C20516f.class) {
                return (T) new C20516f();
            }
            return null;
        }
    };

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public long mo69014a() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_time_mil")) {
            return 0;
        }
        return this.f50047b.mo69129c("last_update_sender_time_mil");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public String mo69020b() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_did")) {
            return "";
        }
        return this.f50047b.mo69123a("last_update_sender_did");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: c */
    public String mo69024c() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_login_device_id")) {
            return "";
        }
        return this.f50047b.mo69123a("last_update_sender_login_device_id");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: d */
    public String mo69026d() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_vc")) {
            return "";
        }
        return this.f50047b.mo69123a("last_update_sender_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: e */
    public String mo69028e() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_gray_vc")) {
            return "";
        }
        return this.f50047b.mo69123a("last_update_sender_gray_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: f */
    public String mo69030f() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_channel")) {
            return "";
        }
        return this.f50047b.mo69123a("last_update_sender_channel");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: g */
    public String mo69032g() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_update_sender_supported")) {
            return "";
        }
        return this.f50047b.mo69123a("last_update_sender_supported");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: h */
    public boolean mo69034h() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_send_switcher_stat")) {
            return false;
        }
        return this.f50047b.mo69131e("last_send_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: i */
    public int mo69035i() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("sys_switcher_stat")) {
            return -2;
        }
        return this.f50047b.mo69128b("sys_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: j */
    public String mo69036j() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("notify_channel_stat")) {
            return "";
        }
        return this.f50047b.mo69123a("notify_channel_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: l */
    public long mo69038l() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("last_upload_switch_ts")) {
            return 0;
        }
        return this.f50047b.mo69129c("last_upload_switch_ts");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: k */
    public List<C20409d> mo69037k() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("token_cache")) {
            return ((C20522l) C20512b.m74707a(C20522l.class, this.f50048c)).mo69094a();
        }
        return ((C20522l) C20512b.m74707a(C20522l.class, this.f50048c)).mo69095a(this.f50047b.mo69123a("token_cache"));
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: m */
    public List<C20403a> mo69039m() {
        AbstractC20537i iVar = this.f50047b;
        if (iVar == null || !iVar.mo69132f("revoke_rid_list")) {
            return ((C20516f) C20512b.m74707a(C20516f.class, this.f50048c)).mo69088a();
        }
        return ((C20516f) C20512b.m74707a(C20516f.class, this.f50048c)).mo69089a(this.f50047b.mo69123a("revoke_rid_list"));
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            iVar.mo69126a(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public void mo69015a(int i) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putInt("sys_switcher_stat", i);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public void mo69021b(long j) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putLong("last_upload_switch_ts", j);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: c */
    public void mo69025c(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("last_update_sender_vc", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: d */
    public void mo69027d(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("last_update_sender_gray_vc", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: e */
    public void mo69029e(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("last_update_sender_channel", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: f */
    public void mo69031f(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("last_update_sender_supported", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: g */
    public void mo69033g(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("notify_channel_stat", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public void mo69016a(long j) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putLong("last_update_sender_time_mil", j);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public void mo69022b(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("last_update_sender_login_device_id", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public void mo69017a(String str) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("last_update_sender_did", str);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public void mo69023b(List<C20403a> list) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("revoke_rid_list", ((C20516f) C20512b.m74707a(C20516f.class, this.f50048c)).mo69087a(list));
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public void mo69018a(List<C20409d> list) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putString("token_cache", ((C20522l) C20512b.m74707a(C20522l.class, this.f50048c)).mo69093a(list));
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public void mo69019a(boolean z) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("last_send_switcher_stat", z);
            b.apply();
        }
    }

    public LocalFrequencySettings$$SettingImpl(Context context, AbstractC20537i iVar) {
        this.f50046a = context;
        this.f50047b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50047b;
        if (iVar != null) {
            iVar.mo69125a(context, str, str2, aVar);
        }
    }
}
