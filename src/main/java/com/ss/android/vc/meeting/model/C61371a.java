package com.ss.android.vc.meeting.model;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.VCFeatureConfig;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.ss.android.vc.meeting.model.a */
public class C61371a {

    /* renamed from: d */
    private static final Map<String, AdminSettings> f153790d = new HashMap();

    /* renamed from: a */
    public AdminSettings f153791a;

    /* renamed from: b */
    private C61303k f153792b;

    /* renamed from: c */
    private String f153793c;

    /* renamed from: e */
    private VCFeatureConfig f153794e;

    /* renamed from: b */
    public AdminSettings mo212427b() {
        return this.f153791a;
    }

    /* renamed from: c */
    public VideoChatSettings mo212429c() {
        VideoChatInMeetingInfo c = this.f153792b.mo212091I().mo212490a().mo212471c();
        if (c != null) {
            return c.getVideoChatSettings();
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public VCFeatureConfig mo212430d() {
        if (mo212429c() == null || mo212429c().getFeatureConfig() == null) {
            return this.f153794e;
        }
        return mo212429c().getFeatureConfig();
    }

    /* renamed from: a */
    public static synchronized AdminSettings m239155a() {
        AdminSettings adminSettings;
        synchronized (C61371a.class) {
            Map<String, AdminSettings> map = f153790d;
            if (map.get(VideoChatModuleDependency.m236630c()) == null) {
                map.put(VideoChatModuleDependency.m236630c(), VcBizSender.syncGetAdminSettings(""));
            }
            if (map.get(VideoChatModuleDependency.m236630c()) == null || (adminSettings = map.get(VideoChatModuleDependency.m236630c())) == null) {
                return VcBizSender.syncGetAdminSettings("");
            }
            return adminSettings;
        }
    }

    public C61371a(C61303k kVar) {
        this.f153792b = kVar;
    }

    /* renamed from: a */
    public void mo212425a(VideoChat videoChat) {
        if (videoChat != null && !TextUtils.isEmpty(videoChat.getId())) {
            this.f153793c = videoChat.getTenantId();
            mo212426a((AbstractC63598b<AdminSettings>) null);
        }
        mo212428b(videoChat);
    }

    /* renamed from: b */
    public void mo212428b(VideoChat videoChat) {
        if (videoChat == null) {
            C60700b.m235864f("ConfigData", "[initMeetingUIConfig]", "video chat is null");
            return;
        }
        VideoChatSettings videoChatSettings = videoChat.getVideoChatSettings();
        if (videoChatSettings != null && videoChatSettings.getFeatureConfig() != null) {
            this.f153794e = videoChatSettings.getFeatureConfig();
        }
    }

    /* renamed from: a */
    public void mo212426a(final AbstractC63598b<AdminSettings> bVar) {
        AdminSettings adminSettings = this.f153791a;
        if (adminSettings == null) {
            String str = this.f153793c;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            VcBizSender.m249290i(str).mo219893b(new AbstractC63598b<AdminSettings>() {
                /* class com.ss.android.vc.meeting.model.C61371a.C613721 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(eVar);
                    }
                }

                /* renamed from: a */
                public void onSuccess(AdminSettings adminSettings) {
                    if (adminSettings != null) {
                        C61371a.this.f153791a = adminSettings;
                        AbstractC63598b bVar = bVar;
                        if (bVar != null) {
                            bVar.onSuccess(C61371a.this.f153791a);
                            return;
                        }
                        return;
                    }
                    AbstractC63598b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onError(new C63602e(new ErrorResult("[getTenantAdminSettings] parse admin settings failed")));
                    }
                }
            });
        } else if (bVar != null) {
            bVar.onSuccess(adminSettings);
        }
    }
}
