package com.ss.android.lark.dynamicconfig.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.p2909v.C57897d;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.dynamicconfig.service.impl.b */
public class C36885b implements IDomainConfigService {

    /* renamed from: e */
    private static C36885b f94810e = new C36885b();

    /* renamed from: a */
    public InitSDKRequest.EnvType f94811a;

    /* renamed from: b */
    public String f94812b;

    /* renamed from: c */
    public Map<String, DomainSettings.Pair> f94813c;

    /* renamed from: d */
    public Map<String, DomainSettings.Pair> f94814d;

    /* renamed from: f */
    private volatile int f94815f;

    /* renamed from: g */
    private List<IGetDataCallback<Boolean>> f94816g = new ArrayList();

    /* renamed from: c */
    public static C36885b m145580c() {
        return f94810e;
    }

    /* renamed from: e */
    public MMKV mo136186e() {
        return MMKV.mmkvWithID("DYNAMIC_DOMAIN_MMKV_V4_ID", 4);
    }

    private C36885b() {
    }

    /* renamed from: g */
    private void m145582g() {
        if (C57897d.m224697b(DynamicConfigModule.m145550a().getContext())) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.dynamicconfig.service.impl.C36885b.RunnableC368861 */

                public void run() {
                    Map<String, DomainSettings.Pair> map;
                    if (C36885b.this.f94814d != null) {
                        map = C36885b.this.f94814d;
                        Log.m165389i("DynamicConfigService", "write cache source from fetched cache");
                    } else if (C36885b.this.f94813c != null) {
                        map = C36885b.this.f94813c;
                        Log.m165389i("DynamicConfigService", "write cache source from default cache");
                    } else {
                        map = null;
                    }
                    if (map == null) {
                        Log.m165389i("DynamicConfigService", "write cache source from no one");
                        return;
                    }
                    try {
                        for (String str : map.keySet()) {
                            C36885b.this.mo136185d().putStringSet(str, new LinkedHashSet(map.get(str).domains));
                            C36885b.this.mo136186e().putStringSet(C36885b.this.f94811a.getValue() + "_" + C36885b.this.f94812b + "_" + str, new LinkedHashSet(map.get(str).domains));
                        }
                        Log.m165389i("DynamicConfigService", "write cache success");
                    } catch (Exception e) {
                        Log.m165385e("DynamicConfigService", "write domain cache failed", e, true);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public MMKV mo136185d() {
        MMKV.mmkvWithID("DYNAMIC_DOMAIN_MMKV_V2_ID", 4).clearAll();
        return MMKV.mmkvWithID("DYNAMIC_DOMAIN_MMKV_V3_ID", 4);
    }

    /* renamed from: i */
    private String m145584i() {
        Context context = DynamicConfigModule.m145550a().getContext();
        String str = context.getFilesDir().getAbsolutePath() + "/" + "rust_config";
        if (m145579a(str, "lark_settings")) {
            return str;
        }
        Log.m165383e("DynamicConfigService", "getSdkConfigDirPath load init config failed.");
        return null;
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: b */
    public void mo136170b() {
        if (!C26284k.m95186b(LarkContext.getApplication()) || DynamicConfigModule.m145550a().isLogin()) {
            synchronized (C36885b.class) {
                if (this.f94815f != 2) {
                    this.f94815f = 2;
                    CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                        /* class com.ss.android.lark.dynamicconfig.service.impl.$$Lambda$b$DDg6p0JKZY1i1gX5ikw8WAkTNyI */

                        public final void run() {
                            C36885b.this.m145586k();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: f */
    public String mo136187f() {
        String str = null;
        for (int i = 0; i < 5; i++) {
            str = m145584i();
            if (!TextUtils.isEmpty(str)) {
                break;
            }
            Log.m165389i("DynamicConfigService", "getSdkConfigDirPath auto retry times " + i);
        }
        return str;
    }

    /* renamed from: j */
    private void m145585j() {
        Context context = DynamicConfigModule.m145550a().getContext();
        File file = new File((context.getFilesDir().getAbsolutePath() + "/" + "rust_config") + "/" + "lark_settings");
        if (file.exists()) {
            file.deleteOnExit();
        }
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: a */
    public void mo136167a() {
        m145578a(DynamicConfigModule.m145550a().getEnvType(), DynamicConfigModule.m145550a().getUserUnit());
        this.f94813c = m145583h();
        m145582g();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m145586k() {
        ArrayList<IGetDataCallback> arrayList;
        List<DomainSettings.Pair> list = C36884a.m145573a(SettingManager.getInstance().getString(RuntimeDomainConfig.class)).domain_settings.pairs;
        if (list == null) {
            Log.m165383e("DynamicConfigService", "get server config error");
            return;
        }
        HashMap hashMap = new HashMap();
        for (DomainSettings.Pair pair : list) {
            hashMap.put(pair.alias_str, pair);
        }
        synchronized (this) {
            arrayList = new ArrayList(this.f94816g);
            this.f94816g.clear();
        }
        if (hashMap.isEmpty()) {
            this.f94815f = 3;
            for (IGetDataCallback iGetDataCallback : arrayList) {
                iGetDataCallback.onError(new ErrorResult("request dynamic config failed"));
            }
            return;
        }
        m145578a(DynamicConfigModule.m145550a().getEnvType(), DynamicConfigModule.m145550a().getUserUnit());
        this.f94814d = hashMap;
        this.f94815f = 1;
        for (IGetDataCallback iGetDataCallback2 : arrayList) {
            iGetDataCallback2.onSuccess(true);
        }
        m145582g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0126  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.bytedance.lark.pb.basic.v1.DomainSettings.Pair> m145583h() {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.dynamicconfig.service.impl.C36885b.m145583h():java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.dynamicconfig.service.impl.b$2 */
    public static /* synthetic */ class C368872 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94818a;

        /* JADX WARNING: Can't wrap try/catch for region: R(180:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|180) */
        /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0258 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0264 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0270 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0294 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x02a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x02ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x02b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x02c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x02dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x02e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0300 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x030c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0318 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0324 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0330 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x033c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0348 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0354 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0360 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x036c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x0378 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x0384 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x0390 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x039c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x03a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x03b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x03c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x03cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x03d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x03e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x03f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x03fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x0408 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0414 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x0420 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0210 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x021c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0228 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x024c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 1069
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.dynamicconfig.service.impl.C36885b.C368872.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: a */
    public String mo136164a(DomainSettings.Alias alias) {
        return mo136165a(m145581c(alias));
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: b */
    public List<String> mo136169b(DomainSettings.Alias alias) {
        return mo136184b(m145581c(alias));
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: a */
    public String mo136165a(String str) {
        List<String> b = mo136184b(str);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    /* renamed from: c */
    private String m145581c(DomainSettings.Alias alias) {
        if (alias == null) {
            return null;
        }
        switch (C368872.f94818a[alias.ordinal()]) {
            case 1:
                return "api";
            case 2:
                return "file";
            case 3:
                return "oapi";
            case 4:
                return "drive";
            case 5:
                return "long";
            case 6:
                return "short_rtc";
            case 7:
                return "long_rtc";
            case 8:
                return "mina";
            case 9:
                return "docs";
            case 10:
                return "open";
            case 11:
                return "cdn";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "docs_api";
            case 13:
                return "docs_drive";
            case 14:
                return "passport";
            case 15:
                return "internal_api";
            case 16:
                return "group_qr_code";
            case 17:
                return "helpdesk";
            case 18:
                return "contact";
            case 19:
                return "privacy";
            case 20:
                return "help_document";
            case 21:
                return "docs_long";
            case 22:
                return "cj_hongbao";
            case 23:
                return "device";
            case 24:
                return "sentry";
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                return "ttpush";
            case 26:
                return "log";
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                return "people";
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                return "vod";
            case 29:
                return "mp_applink";
            case 30:
                return "mp_refer";
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                return "mp_config";
            case 32:
                return "mp_tt";
            case 33:
                return "open_app_feed";
            case 34:
                return "open_msg_card";
            case 35:
                return "open_appcenter1";
            case 36:
                return "open_appcenter2";
            case 37:
                return "open_appcenter3";
            case 38:
                return "open_moment";
            case 39:
                return "open_api_login";
            case 40:
                return "suite_image_cdn";
            case 41:
                return "tt_cdn";
            case 42:
                return "suite_report";
            case 43:
                return "open_appcenter_cardjump";
            case 44:
                return "docs_home";
            case 45:
                return "suite_android_hotfix";
            case 46:
                return "tt_musical";
            case 47:
                return "docs_account_delete_notice";
            case 48:
                return "suite_main_domain";
            case 49:
                return "passport_captcha";
            case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                return "open_jssdk_config";
            case 51:
                return "suite_safetynet";
            case 52:
                return "open_app_interface";
            case 53:
                return "suite_security_link";
            case 54:
                return "docs_main_domain";
            case 55:
                return "docs_fe_resource_hotfix";
            case 56:
                return "suite_secsdk";
            case 57:
                return "help_center";
            case 58:
                return "tt_et";
            case 59:
                return "suite_tklog";
            case 60:
                return "email";
            case 61:
                return "docs_peer";
            case 62:
                return "applink_peer";
            case 63:
                return "docs_feed";
            case 64:
                return "tt_graylog";
            case 65:
                return "suite_pan_cdn";
            case 66:
                return "ug_activity";
            case 67:
                return "tt_applog";
            case 68:
                return "tt_npth";
            case 69:
                return "tt_slardar_setting";
            case 70:
                return "tt_slardar_report";
            case 71:
                return "tt_slardar_exception";
            case 72:
                return "tt_abtest";
            case 73:
                return "vc_privacy";
            case 74:
                return "suite_appconfig";
            case 75:
                return "tt_slardar_crash_host_ios";
            case 76:
                return "tt_slardar_exception_host_ios";
            case 77:
                return "open_appstore";
            case 78:
                return "tt_slardar";
            case 79:
                return "open_applink_schema_enable_host";
            case CalendarSearchResultRv.f82651b:
                return "vc_mm";
            case 81:
                return "docs_frontier";
            case 82:
                return "pano";
            case 83:
                return "suite_admin";
            case 84:
                return "rtc_frontier";
            case 85:
                return "rtc_decision";
            case 86:
                return "rtc_defaultips";
            case 87:
                return "ntp";
            case 88:
                return "mock_gateway";
            case 89:
                return "basic_mode";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public List<String> mo136184b(String str) {
        DomainSettings.Pair pair;
        DomainSettings.Pair pair2;
        if (str == null) {
            return null;
        }
        if (!C57897d.m224697b(DynamicConfigModule.m145550a().getContext())) {
            Set<String> stringSet = mo136185d().getStringSet(str, null);
            if (!CollectionUtils.isEmpty(stringSet)) {
                return new ArrayList(stringSet);
            }
            Log.m165389i("DynamicConfigService", "multi process domain cache feature on , " + str + " fetch KV cache failed");
        }
        if (this.f94811a != DynamicConfigModule.m145550a().getEnvType() || !TextUtils.equals(this.f94812b, DynamicConfigModule.m145550a().getUserUnit())) {
            Log.m165389i("DynamicConfigService", "has changed env , old data should be clear");
        }
        Map<String, DomainSettings.Pair> map = this.f94814d;
        if (map != null && !map.isEmpty() && (pair2 = this.f94814d.get(str)) != null) {
            return pair2.domains;
        }
        Log.m165379d("DynamicConfigService", "get domains config before remote config fetch success , alias is " + str);
        Log.m165379d("DynamicConfigService", "domain cache feature on , will try load from KV cache , alias is " + str);
        Set<String> stringSet2 = mo136185d().getStringSet(str, null);
        if (!CollectionUtils.isEmpty(stringSet2)) {
            Log.m165379d("DynamicConfigService", "domain cache feature on , " + str + " hit KV cache");
            return new ArrayList(stringSet2);
        }
        Log.m165389i("DynamicConfigService", "domain cache feature on , " + str + " fetch KV cache failed");
        if (this.f94813c == null) {
            Log.m165389i("DynamicConfigService", "get domains config before default config fetch success , load it");
            mo136167a();
        }
        if (this.f94813c == null) {
            Log.m165389i("DynamicConfigService", "after force load still empty");
        }
        Map<String, DomainSettings.Pair> map2 = this.f94813c;
        if (map2 != null && !map2.isEmpty() && (pair = this.f94813c.get(str)) != null) {
            return pair.domains;
        }
        Log.m165383e("DynamicConfigService", "get alias pair empty, error key is " + str);
        return null;
    }

    /* renamed from: a */
    private void m145578a(InitSDKRequest.EnvType envType, String str) {
        this.f94811a = envType;
        this.f94812b = str;
    }

    /* renamed from: a */
    private boolean m145579a(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String string = C57744a.m224104a().getString("KEY_LARK_SETTING_VERSION_RECORD");
        String a = C26246a.m94977a(LarkContext.getApplication());
        File file2 = new File(str + "/" + str2);
        if (!file2.exists() || !TextUtils.equals(string, a)) {
            InputStream inputStream = null;
            try {
                file2.delete();
                file2.createNewFile();
                InputStream open = DynamicConfigModule.m145550a().getContext().getAssets().open(str2);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read <= -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                C57744a.m224104a().putString("KEY_LARK_SETTING_VERSION_RECORD", a);
                Log.m165389i("DynamicConfigService", "finish loadConfigFileFromAssets version is " + a);
                if (open != null) {
                    try {
                        open.close();
                    } catch (Exception unused) {
                        return false;
                    }
                }
                return true;
            } catch (IOException e) {
                Log.m165399w("DynamicConfigService", e);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                return false;
            } catch (Exception e2) {
                Log.m165399w("DynamicConfigService", e2);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception unused4) {
                        return false;
                    }
                }
                throw th;
            }
        } else {
            Log.m165379d("DynamicConfigService", "ignore loadConfigFileFromAssets.");
            return true;
        }
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: a */
    public List<String> mo136166a(String str, int i, String str2) {
        Set<String> stringSet = mo136186e().getStringSet(i + "_" + str2 + "_" + str, null);
        if (!CollectionUtils.isEmpty(stringSet)) {
            return new ArrayList(stringSet);
        }
        return null;
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService
    /* renamed from: a */
    public void mo136168a(InitSDKRequest.EnvType envType, String str, DomainSettings domainSettings) {
        if (domainSettings != null) {
            List<DomainSettings.Pair> list = domainSettings.pairs;
            if (list == null) {
                Log.m165383e("DynamicConfigService", "updateDomainSetting config error");
                return;
            }
            HashMap hashMap = new HashMap();
            for (DomainSettings.Pair pair : list) {
                hashMap.put(pair.alias_str, pair);
            }
            m145578a(envType, str);
            this.f94813c = hashMap;
            this.f94814d = hashMap;
            this.f94815f = 0;
            m145582g();
        }
    }
}
