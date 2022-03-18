package com.ss.android.vc.net.service;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.response.C60986t;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VCSettingsService {
    public static final Map<String, C60986t> sCacheSettingsEntitys = new ConcurrentHashMap();
    public static final Map<String, Boolean> sSyncFlag = new ConcurrentHashMap();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Key {
    }

    private static List<String> getStringKeys() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("vc_simulcast_stream_desc");
        arrayList.add("vc_active_speaker_config_v2");
        arrayList.add("follow_degradation_config");
        arrayList.add("vc_follow_config");
        arrayList.add("vc_sketch_config");
        arrayList.add("vc_mute_prompt_config");
        arrayList.add("vc_virtual_background_images");
        arrayList.add("vc_lab_default_values_config");
        arrayList.add("vc_retry_interval");
        arrayList.add("rtc_config_android");
        arrayList.add("vc_xp_config");
        arrayList.add("vc_live_link_identifier");
        arrayList.add("vc_isv_lingchan_appid");
        arrayList.add("vc_tone_play_config");
        arrayList.add("vc_feature_performance_config");
        arrayList.add("vc_video_sort_config");
        arrayList.add("vc_billing_link_config");
        arrayList.add("vc_enterprise_control_link");
        arrayList.add("audio_share_compat_config");
        arrayList.add("vc_single_instance");
        arrayList.add("vc_howling_warn");
        arrayList.add("vc_platform_config");
        arrayList.add("vc_check_rtc_engine");
        arrayList.add("rvc_url_config");
        arrayList.add("vc_pad_config");
        return arrayList;
    }

    public static String getSettings(String str) {
        return getSettings(str, false);
    }

    public static void getSettings(final String str, final AbstractC63598b<String> bVar) {
        C60700b.m235843a("VCSettingsService", "[getSettings8]", "key=" + str);
        final String c = VideoChatModuleDependency.m236630c();
        if (TextUtils.isEmpty(c)) {
            C60700b.m235864f("VCSettingsService", "[getSettings9]", "userId is null");
            return;
        }
        C60986t tVar = sCacheSettingsEntitys.get(c);
        if (tVar == null || tVar.f152721a == null) {
            pullSettings(new AbstractC63598b() {
                /* class com.ss.android.vc.net.service.VCSettingsService.C636152 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(null);
                    }
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    C60986t tVar;
                    if (bVar != null && (tVar = VCSettingsService.sCacheSettingsEntitys.get(c)) != null && tVar.f152721a != null) {
                        String str = tVar.f152721a.get(str);
                        C60700b.m235851b("VCSettingsService", "[getSettings11]", "in cache: " + str + " = " + str);
                        if (!TextUtils.isEmpty(str)) {
                            bVar.onSuccess(str);
                        } else {
                            bVar.onError(null);
                        }
                    }
                }
            }, "getSettings");
            return;
        }
        String str2 = tVar.f152721a.get(str);
        C60700b.m235851b("VCSettingsService", "[getSettings10]", "in cache: " + str + " = " + str2);
        if (bVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            bVar.onSuccess(str2);
        } else {
            bVar.onError(null);
        }
    }

    private static void pullSettings(final AbstractC63598b bVar, final String str) {
        C60700b.m235843a("VCSettingsService", "[pullSettings]", str);
        final String c = VideoChatModuleDependency.m236630c();
        if (!TextUtils.isEmpty(c)) {
            Map<String, Boolean> map = sSyncFlag;
            if (map.get(c) != Boolean.TRUE) {
                List<String> stringKeys = getStringKeys();
                if (C60735ab.m236005a(false)) {
                    VcBizSender.m249276f(stringKeys).mo219889a(new AbstractC63598b<C60986t>() {
                        /* class com.ss.android.vc.net.service.VCSettingsService.C636141 */

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            C60700b.m235864f("VCSettingsService", "[pullSettings4]", str + " error: " + eVar.mo219902b());
                            AbstractC63598b bVar = bVar;
                            if (bVar != null) {
                                bVar.onError(null);
                            }
                        }

                        public void onSuccess(C60986t tVar) {
                            C60700b.m235851b("VCSettingsService", "[pullSettings2]", str + " success");
                            VCSettingsService.sSyncFlag.put(c, true);
                            if (tVar != null) {
                                C60700b.m235843a("VCSettingsService", "[pullSettings3]", str + " result=" + tVar.f152721a);
                                VCSettingsService.sCacheSettingsEntitys.put(c, tVar);
                            }
                            AbstractC63598b bVar = bVar;
                            if (bVar != null) {
                                bVar.onSuccess(null);
                            }
                        }
                    });
                    return;
                }
                C60986t syncGetSetting = VcBizSender.syncGetSetting(stringKeys);
                map.put(c, true);
                if (syncGetSetting != null) {
                    C60700b.m235843a("VCSettingsService", "[pullSettings5]", str + " result=" + syncGetSetting.f152721a);
                    sCacheSettingsEntitys.put(c, syncGetSetting);
                    if (bVar != null) {
                        bVar.onSuccess(null);
                        return;
                    }
                    return;
                } else if (bVar != null) {
                    bVar.onError(null);
                    return;
                } else {
                    return;
                }
            }
        }
        if (bVar != null) {
            bVar.onError(null);
        }
    }

    public static String getSettings(String str, boolean z) {
        C60700b.m235843a("VCSettingsService", "[getSettings]", "called with: key = [" + str + "], onlyInCache = [" + z + "]");
        String c = VideoChatModuleDependency.m236630c();
        String str2 = null;
        if (TextUtils.isEmpty(c)) {
            C60700b.m235864f("VCSettingsService", "[getSettings2]", "userId is null");
            return null;
        }
        Map<String, C60986t> map = sCacheSettingsEntitys;
        C60986t tVar = map.get(c);
        if (!(tVar == null || tVar.f152721a == null)) {
            String str3 = tVar.f152721a.get(str);
            if (!TextUtils.isEmpty(str3)) {
                if (TextUtils.equals(str, "vc_virtual_background_images")) {
                    C60700b.m235851b("VCSettingsService", "[getSettings3]", "backgrounds in cache.");
                } else {
                    C60700b.m235851b("VCSettingsService", "[getSettings4]", "getSettings in cache: " + str + " = " + str3);
                }
                return str3;
            }
            C60700b.m235851b("VCSettingsService", "[getSettings5]", "in cache: " + str + ", content is empty");
        }
        if (C60735ab.m236005a(false)) {
            pullSettings(null, "getSettings");
        } else {
            C60986t syncGetSetting = VcBizSender.syncGetSetting(getStringKeys());
            if (syncGetSetting != null) {
                sSyncFlag.put(c, true);
                map.put(c, syncGetSetting);
                if (syncGetSetting.f152721a != null) {
                    str2 = syncGetSetting.f152721a.get(str);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                C60700b.m235851b("VCSettingsService", "[getSettings6]", String.format(Locale.getDefault(), "syncGetSetting fail: key=%s, value=%s", str, str2));
            } else {
                C60700b.m235851b("VCSettingsService", "[getSettings7]", String.format(Locale.getDefault(), "syncGetSetting succ: key=%s, value=%s", str, str2));
            }
        }
        return str2;
    }
}
