package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.storage.AbstractC20537i;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class AliveOnlineSettings$$SettingImpl implements AliveOnlineSettings {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Object> f50041a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f50042b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private AbstractC20537i f50043c;

    /* renamed from: d */
    private final AbstractC20513c f50044d = new AbstractC20513c() {
        /* class com.bytedance.push.settings.AliveOnlineSettings$$SettingImpl.C205071 */

        @Override // com.bytedance.push.settings.AbstractC20513c
        /* renamed from: a */
        public <T> T mo69011a(Class<T> cls) {
            if (cls == C20515e.class) {
                return (T) new C20515e();
            }
            return null;
        }
    };

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: a */
    public List<String> mo69002a() {
        AbstractC20537i iVar = this.f50043c;
        if (iVar == null || !iVar.mo69132f("ttpush_alv_white_list")) {
            return ((C20515e) C20512b.m74707a(C20515e.class, this.f50044d)).mo69085a();
        }
        return ((C20515e) C20512b.m74707a(C20515e.class, this.f50044d)).mo69086a(this.f50043c.mo69123a("ttpush_alv_white_list"));
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            iVar.mo69126a(aVar);
        }
    }

    public AliveOnlineSettings$$SettingImpl(AbstractC20537i iVar) {
        this.f50043c = iVar;
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: a */
    public void mo69003a(boolean z) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("allow_off_alive", z);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: b */
    public void mo69004b(boolean z) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("allow_push_job_service", z);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: c */
    public void mo69005c(boolean z) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("allow_push_daemon_monitor", z);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: d */
    public void mo69006d(boolean z) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("is_close_alarm_wakeup", z);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: e */
    public void mo69007e(boolean z) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("is_notify_service_stick", z);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        AbstractC20537i iVar;
        if (jSONObject != null && (iVar = this.f50043c) != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            if (jSONObject != null) {
                if (jSONObject.has("ttpush_allow_off_alive")) {
                    b.putBoolean("allow_off_alive", C20514d.m74710a(jSONObject, "ttpush_allow_off_alive"));
                }
                if (jSONObject.has("ttpush_uninstall_question_url")) {
                    b.putString("uninstall_question_url", jSONObject.optString("ttpush_uninstall_question_url"));
                }
                if (jSONObject.has("ttpush_allow_push_job_service")) {
                    b.putBoolean("allow_push_job_service", C20514d.m74710a(jSONObject, "ttpush_allow_push_job_service"));
                }
                if (jSONObject.has("ttpush_allow_push_daemon_monitor")) {
                    b.putBoolean("allow_push_daemon_monitor", C20514d.m74710a(jSONObject, "ttpush_allow_push_daemon_monitor"));
                }
                if (jSONObject.has("ttpush_allow_close_boot_receiver")) {
                    b.putBoolean("allow_close_boot_receiver", C20514d.m74710a(jSONObject, "ttpush_allow_close_boot_receiver"));
                }
                if (jSONObject.has("ttpush_is_close_alarm_wakeup")) {
                    b.putBoolean("is_close_alarm_wakeup", C20514d.m74710a(jSONObject, "ttpush_is_close_alarm_wakeup"));
                }
                if (jSONObject.has("ttpush_use_start_foreground_notification")) {
                    b.putBoolean("is_use_start_foreground_notification", C20514d.m74710a(jSONObject, "ttpush_use_start_foreground_notification"));
                }
                if (jSONObject.has("ttpush_job_schedule_wake_up_interval_second")) {
                    b.putInt("job_schedule_wake_up_interval_second", jSONObject.optInt("ttpush_job_schedule_wake_up_interval_second"));
                }
                if (jSONObject.has("ttpush_is_use_c_native_process_keep_alive")) {
                    b.putBoolean("is_use_c_native_process_keep_alive", C20514d.m74710a(jSONObject, "ttpush_is_use_c_native_process_keep_alive"));
                }
                if (jSONObject.has("ttpush_is_notify_service_stick")) {
                    b.putBoolean("is_notify_service_stick", C20514d.m74710a(jSONObject, "ttpush_is_notify_service_stick"));
                }
                if (jSONObject.has("ttpush_key_is_miui_close_daemon")) {
                    b.putBoolean("key_is_miui_close_daemon", C20514d.m74710a(jSONObject, "ttpush_key_is_miui_close_daemon"));
                }
                if (jSONObject.has("ttpush_alv_white_list")) {
                    b.putString("ttpush_alv_white_list", jSONObject.optString("ttpush_alv_white_list"));
                }
            }
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50043c;
        if (iVar != null) {
            iVar.mo69125a(context, str, str2, aVar);
        }
    }
}
