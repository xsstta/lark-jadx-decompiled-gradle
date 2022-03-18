package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.storage.AbstractC20537i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class PushOnlineSettings$$SettingImpl implements PushOnlineSettings {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Object> f50054a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f50055b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private AbstractC20537i f50056c;

    /* renamed from: d */
    private final AbstractC20513c f50057d = new AbstractC20513c() {
        /* class com.bytedance.push.settings.PushOnlineSettings$$SettingImpl.C205101 */

        @Override // com.bytedance.push.settings.AbstractC20513c
        /* renamed from: a */
        public <T> T mo69011a(Class<T> cls) {
            return null;
        }
    };

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: b */
    public long mo69051b() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("ttpush_update_sender_interval")) {
            return 10800000;
        }
        return this.f50056c.mo69129c("ttpush_update_sender_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: c */
    public long mo69052c() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("ttpush_update_token_interval")) {
            return 86400000;
        }
        return this.f50056c.mo69129c("ttpush_update_token_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: d */
    public boolean mo69053d() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("ttpush_enable_restrict_update_token")) {
            return false;
        }
        return this.f50056c.mo69131e("ttpush_enable_restrict_update_token");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: e */
    public boolean mo69054e() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("ttpush_shut_push_on_stop_service")) {
            return false;
        }
        return this.f50056c.mo69131e("ttpush_shut_push_on_stop_service");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: f */
    public boolean mo69055f() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("is_receiver_message_wakeup_screen")) {
            return false;
        }
        return this.f50056c.mo69131e("is_receiver_message_wakeup_screen");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: g */
    public int mo69056g() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("receiver_message_wakeup_screen_time")) {
            return 5000;
        }
        return this.f50056c.mo69128b("receiver_message_wakeup_screen_time");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: h */
    public long mo69057h() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("ttpush_upload_switch_interval")) {
            return 86400000;
        }
        return this.f50056c.mo69129c("ttpush_upload_switch_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: i */
    public int mo69058i() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("ttpush_forbid_alias")) {
            return 0;
        }
        return this.f50056c.mo69128b("ttpush_forbid_alias");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: j */
    public boolean mo69059j() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("need_control_miui_flares_v2")) {
            return true;
        }
        return this.f50056c.mo69131e("need_control_miui_flares_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: k */
    public boolean mo69060k() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("remove_auto_boot_v2")) {
            return false;
        }
        return this.f50056c.mo69131e("remove_auto_boot_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: l */
    public int mo69061l() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("check_sign_v2")) {
            return 0;
        }
        return this.f50056c.mo69128b("check_sign_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: m */
    public boolean mo69062m() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("pass_though_new_activity")) {
            return false;
        }
        return this.f50056c.mo69131e("pass_though_new_activity");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: a */
    public boolean mo69050a() {
        AbstractC20537i iVar = this.f50056c;
        if (iVar == null || !iVar.mo69132f("allow_settings_notify_enable")) {
            return true;
        }
        return this.f50056c.mo69131e("allow_settings_notify_enable");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50056c;
        if (iVar != null) {
            iVar.mo69126a(aVar);
        }
    }

    public PushOnlineSettings$$SettingImpl(AbstractC20537i iVar) {
        this.f50056c = iVar;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: a */
    public void mo69049a(boolean z) {
        AbstractC20537i iVar = this.f50056c;
        if (iVar != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            b.putBoolean("ttpush_shut_push_on_stop_service", z);
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        AbstractC20537i iVar;
        if (jSONObject != null && (iVar = this.f50056c) != null) {
            SharedPreferences.Editor b = iVar.mo69109b();
            if (jSONObject != null) {
                if (jSONObject.has("ttpush_allow_settings_notify_enable")) {
                    b.putBoolean("allow_settings_notify_enable", C20514d.m74710a(jSONObject, "ttpush_allow_settings_notify_enable"));
                }
                if (jSONObject.has("ttpush_update_sender_interval")) {
                    b.putLong("ttpush_update_sender_interval", jSONObject.optLong("ttpush_update_sender_interval"));
                }
                if (jSONObject.has("ttpush_update_token_interval")) {
                    b.putLong("ttpush_update_token_interval", jSONObject.optLong("ttpush_update_token_interval"));
                }
                if (jSONObject.has("ttpush_enable_restrict_update_token")) {
                    b.putBoolean("ttpush_enable_restrict_update_token", C20514d.m74710a(jSONObject, "ttpush_enable_restrict_update_token"));
                }
                if (jSONObject.has("ttpush_shut_push_on_stop_service")) {
                    b.putBoolean("ttpush_shut_push_on_stop_service", C20514d.m74710a(jSONObject, "ttpush_shut_push_on_stop_service"));
                }
                if (jSONObject.has("ttpush_is_receiver_message_wakeup_screen")) {
                    b.putBoolean("is_receiver_message_wakeup_screen", C20514d.m74710a(jSONObject, "ttpush_is_receiver_message_wakeup_screen"));
                }
                if (jSONObject.has("ttpush_receiver_message_wakeup_screen_time")) {
                    b.putInt("receiver_message_wakeup_screen_time", jSONObject.optInt("ttpush_receiver_message_wakeup_screen_time"));
                }
                if (jSONObject.has("ttpush_upload_switch_interval")) {
                    b.putLong("ttpush_upload_switch_interval", jSONObject.optLong("ttpush_upload_switch_interval"));
                }
                if (jSONObject.has("ttpush_forbid_alias")) {
                    b.putInt("ttpush_forbid_alias", jSONObject.optInt("ttpush_forbid_alias"));
                }
                if (jSONObject.has("need_control_miui_flares_v2")) {
                    b.putBoolean("need_control_miui_flares_v2", C20514d.m74710a(jSONObject, "need_control_miui_flares_v2"));
                }
                if (jSONObject.has("remove_auto_boot_v2")) {
                    b.putBoolean("remove_auto_boot_v2", C20514d.m74710a(jSONObject, "remove_auto_boot_v2"));
                }
                if (jSONObject.has("remove_umeng_autoboot")) {
                    b.putBoolean("remove_umeng_autoboot", C20514d.m74710a(jSONObject, "remove_umeng_autoboot"));
                }
                if (jSONObject.has("check_sign_v2")) {
                    b.putInt("check_sign_v2", jSONObject.optInt("check_sign_v2"));
                }
                if (jSONObject.has("pass_though_new_activity")) {
                    b.putBoolean("pass_though_new_activity", C20514d.m74710a(jSONObject, "pass_though_new_activity"));
                }
                if (jSONObject.has("frontier_update_setting_interval")) {
                    b.putLong("frontier_update_setting_interval", jSONObject.optLong("frontier_update_setting_interval"));
                }
                if (jSONObject.has("frontier_strategy")) {
                    b.putInt("frontier_strategy", jSONObject.optInt("frontier_strategy"));
                }
                if (jSONObject.has("enable_pass_through_redbadge_show")) {
                    b.putBoolean("enable_pass_through_redbadge_show", C20514d.m74710a(jSONObject, "enable_pass_through_redbadge_show"));
                }
                if (jSONObject.has("enable_redbadge_auto_dismiss")) {
                    b.putBoolean("enable_redbadge_auto_dismiss", C20514d.m74710a(jSONObject, "enable_redbadge_auto_dismiss"));
                }
            }
            b.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, AbstractC20511a aVar) {
        AbstractC20537i iVar = this.f50056c;
        if (iVar != null) {
            iVar.mo69125a(context, str, str2, aVar);
        }
    }
}
