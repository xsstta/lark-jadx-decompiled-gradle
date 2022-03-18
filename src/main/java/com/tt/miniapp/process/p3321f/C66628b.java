package com.tt.miniapp.process.p3321f;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.littleapp.prelaunch.AbstractC41413a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.background.AbstractC65782c;
import com.tt.miniapp.audio.background.BgAudioCallExtra;
import com.tt.miniapp.audio.background.BgAudioCommand;
import com.tt.miniapp.audio.background.BgAudioModel;
import com.tt.miniapp.audio.background.BgAudioState;
import com.tt.miniapp.audio.background.C65775b;
import com.tt.miniapp.entity.C66007a;
import com.tt.miniapp.event.p3281b.C66033e;
import com.tt.miniapp.manager.C66429e;
import com.tt.miniapp.manager.C66460m;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.p3311o.C66540a;
import com.tt.miniapp.p3352w.C67288b;
import com.tt.miniapp.p3352w.p3354b.AbstractC67299e;
import com.tt.miniapp.p3352w.p3354b.C67298d;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapp.titlemenu.item.C66919c;
import com.tt.miniapp.util.C67031e;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.appbase.C67466a;
import com.tt.miniapphost.data.C67489c;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.p3370d.C67481d;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.ext.AbstractC67622h;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.tt.miniapp.process.f.b */
public class C66628b {
    /* renamed from: a */
    static boolean m260287a(String str, CrossProcessDataEntity crossProcessDataEntity, CrossProcessDataEntity crossProcessDataEntity2, C67577a aVar) {
        AbstractC67433a k = C67448a.m262353a().mo234192k();
        if (k == null) {
            k = C67448a.m262353a().mo234190i();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1932192966:
                if (str.equals("getSnapshot")) {
                    c = 0;
                    break;
                }
                break;
            case -1853253192:
                if (str.equals("activity_created")) {
                    c = 1;
                    break;
                }
                break;
            case -1614149786:
                if (str.equals("savePlatformSession")) {
                    c = 2;
                    break;
                }
                break;
            case -1405248603:
                if (str.equals("setTmaLaunchFlag")) {
                    c = 3;
                    break;
                }
                break;
            case -806813950:
                if (str.equals("notifyPreloadEmptyProcess")) {
                    c = 4;
                    break;
                }
                break;
            case -600628793:
                if (str.equals("scheduleApiHandler")) {
                    c = 5;
                    break;
                }
                break;
            case -316023509:
                if (str.equals("getLocation")) {
                    c = 6;
                    break;
                }
                break;
            case -199222630:
                if (str.equals("fetchJsComponent")) {
                    c = 7;
                    break;
                }
                break;
            case -39279151:
                if (str.equals("getCurrentLang")) {
                    c = '\b';
                    break;
                }
                break;
            case 820504303:
                if (str.equals("registerBgAudioPlayState")) {
                    c = '\t';
                    break;
                }
                break;
            case 1915939293:
                if (str.equals("hostProcess_callback")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m260292b(crossProcessDataEntity, aVar);
                break;
            case 1:
                m260299f(crossProcessDataEntity);
                break;
            case 2:
                m260309p(crossProcessDataEntity);
                break;
            case 3:
                m260310q(crossProcessDataEntity);
                break;
            case 4:
                m260280a(k, crossProcessDataEntity);
                break;
            case 5:
                m260293b(crossProcessDataEntity, aVar, k);
                break;
            case 6:
                m260286a(aVar);
                break;
            case 7:
                m260285a(crossProcessDataEntity, aVar, k);
                break;
            case '\b':
                m260294b(aVar);
                break;
            case '\t':
                m260284a(crossProcessDataEntity, aVar);
                break;
            case '\n':
                m260283a(crossProcessDataEntity, crossProcessDataEntity2);
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m260288a(String str, CrossProcessDataEntity crossProcessDataEntity, CrossProcessDataEntity crossProcessDataEntity2, CrossProcessDataEntity[] crossProcessDataEntityArr) {
        AbstractC67433a k = C67448a.m262353a().mo234192k();
        if (k == null) {
            k = C67448a.m262353a().mo234190i();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2056786814:
                if (str.equals("removeHostEventListener")) {
                    c = 0;
                    break;
                }
                break;
            case -1276138387:
                if (str.equals("getPlatformSession")) {
                    c = 1;
                    break;
                }
                break;
            case -991883533:
                if (str.equals("type_bg_audio_sync_commond")) {
                    c = 2;
                    break;
                }
                break;
            case -965406614:
                if (str.equals("is_in_jump_list")) {
                    c = 3;
                    break;
                }
                break;
            case -858493621:
                if (str.equals("removeSpData")) {
                    c = 4;
                    break;
                }
                break;
            case -676828179:
                if (str.equals("type_get_favorite_set")) {
                    c = 5;
                    break;
                }
                break;
            case -674684898:
                if (str.equals("type_remove_from_favorite_set")) {
                    c = 6;
                    break;
                }
                break;
            case -488436872:
                if (str.equals("type_get_favorite_settings")) {
                    c = 7;
                    break;
                }
                break;
            case 198277422:
                if (str.equals("actionLog")) {
                    c = '\b';
                    break;
                }
                break;
            case 213806617:
                if (str.equals("update_jump_list")) {
                    c = '\t';
                    break;
                }
                break;
            case 383221365:
                if (str.equals("mini_process_used")) {
                    c = '\n';
                    break;
                }
                break;
            case 399449253:
                if (str.equals("jump_to_app_from_schema")) {
                    c = 11;
                    break;
                }
                break;
            case 559074316:
                if (str.equals("downloadJsComponent")) {
                    c = '\f';
                    break;
                }
                break;
            case 638061061:
                if (str.equals("addHostEventListener")) {
                    c = '\r';
                    break;
                }
                break;
            case 715716666:
                if (str.equals("type_is_new_more_menu")) {
                    c = 14;
                    break;
                }
                break;
            case 798957213:
                if (str.equals("getSpData")) {
                    c = 15;
                    break;
                }
                break;
            case 803973105:
                if (str.equals("restart_app")) {
                    c = 16;
                    break;
                }
                break;
            case 1064884100:
                if (str.equals("saveSpData")) {
                    c = 17;
                    break;
                }
                break;
            case 1078329351:
                if (str.equals("notify_mini_app_process_crash")) {
                    c = 18;
                    break;
                }
                break;
            case 1084566112:
                if (str.equals("type_add_to_favorite_set")) {
                    c = 19;
                    break;
                }
                break;
            case 1301584782:
                if (str.equals("jump_to_app")) {
                    c = 20;
                    break;
                }
                break;
            case 2034582128:
                if (str.equals("type_update_favorite_set")) {
                    c = 21;
                    break;
                }
                break;
            case 2121261769:
                if (str.equals("back_app")) {
                    c = 22;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m260298e(crossProcessDataEntity);
                return true;
            case 1:
                crossProcessDataEntityArr[0] = m260291b(crossProcessDataEntity, k);
                return true;
            case 2:
                crossProcessDataEntityArr[0] = m260312s(crossProcessDataEntity);
                return true;
            case 3:
                crossProcessDataEntityArr[0] = m260303j(crossProcessDataEntity);
                return true;
            case 4:
                m260296c(crossProcessDataEntity);
                return true;
            case 5:
                crossProcessDataEntityArr[0] = m260279a();
                return true;
            case 6:
                m260301h(crossProcessDataEntity);
                return true;
            case 7:
                crossProcessDataEntityArr[0] = m260289b();
                return true;
            case '\b':
                return m260311r(crossProcessDataEntity);
            case '\t':
                m260304k(crossProcessDataEntity);
                return true;
            case '\n':
                m260313t(crossProcessDataEntity);
                return true;
            case 11:
                m260306m(crossProcessDataEntity);
                return true;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                m260282a(crossProcessDataEntity, k);
                return true;
            case '\r':
                m260297d(crossProcessDataEntity);
                return true;
            case 14:
                crossProcessDataEntityArr[0] = m260295c();
                return true;
            case 15:
                crossProcessDataEntityArr[0] = m260290b(crossProcessDataEntity);
                return true;
            case 16:
                m260308o(crossProcessDataEntity);
                return true;
            case 17:
                m260281a(crossProcessDataEntity);
                return true;
            case 18:
                m260314u(crossProcessDataEntity);
                return true;
            case 19:
                m260302i(crossProcessDataEntity);
                return true;
            case 20:
                m260305l(crossProcessDataEntity);
                return true;
            case 21:
                m260300g(crossProcessDataEntity);
                return true;
            case 22:
                crossProcessDataEntityArr[0] = m260307n(crossProcessDataEntity);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private static CrossProcessDataEntity m260279a() {
        if (C66919c.f168793b == null) {
            return null;
        }
        return CrossProcessDataEntity.C67574a.m263013a().mo234762a("favorite_set", (List<String>) new ArrayList(C66919c.f168793b)).mo234763b();
    }

    /* renamed from: b */
    private static CrossProcessDataEntity m260289b() {
        String a = C12738a.m52723a(AppbrandContext.getInst().getApplicationContext(), (String) null, Settings.TT_TMA_SWITCH, Settings.TmaSwitch.FAVORITES);
        AppBrandLogger.m52828d("InnerHostProcessCallHandler", "favoritesJsonStr == ", a);
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("favorite_settings", (Object) a).mo234763b();
    }

    /* renamed from: c */
    private static CrossProcessDataEntity m260295c() {
        boolean z = false;
        if (C12738a.m52722a(AppbrandContext.getInst().getApplicationContext(), 0, Settings.TT_TMA_SWITCH, Settings.TmaSwitch.MORE_PANEL) == 1) {
            z = true;
        }
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("is_new_more_menu", (Object) Boolean.valueOf(z)).mo234763b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.process.f.b$8 */
    public static /* synthetic */ class C666388 {

        /* renamed from: a */
        static final /* synthetic */ int[] f168221a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tt.miniapp.audio.background.BgAudioCommand[] r0 = com.tt.miniapp.audio.background.BgAudioCommand.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a = r0
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.OBTAIN_MANAGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.PLAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.PAUSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.STOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.SEEK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.SET_AUDIO_MODEL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.GET_AUDIO_STATE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.tt.miniapp.process.p3321f.C66628b.C666388.f168221a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tt.miniapp.audio.background.BgAudioCommand r1 = com.tt.miniapp.audio.background.BgAudioCommand.NEED_KEEP_ALIVE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.process.p3321f.C66628b.C666388.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static void m260286a(C67577a aVar) {
        C66540a.m259963a(AppbrandContext.getInst().getApplicationContext()).mo232101a(aVar);
    }

    /* renamed from: g */
    private static void m260300g(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            C66919c.f168793b = null;
            return;
        }
        List<String> g = crossProcessDataEntity.mo234750g("favorite_set");
        if (g == null) {
            C66919c.f168793b = null;
        } else {
            C66919c.f168793b = new LinkedHashSet<>(g);
        }
    }

    /* renamed from: j */
    private static CrossProcessDataEntity m260303j(CrossProcessDataEntity crossProcessDataEntity) {
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("is_in_jumplist", (Object) Boolean.valueOf(C66007a.m258494b(crossProcessDataEntity.mo234744b("miniAppId")))).mo234763b();
    }

    /* renamed from: k */
    private static void m260304k(CrossProcessDataEntity crossProcessDataEntity) {
        C66007a.m258489a(crossProcessDataEntity.mo234744b("miniAppId"), crossProcessDataEntity.mo234746d("isGame"), crossProcessDataEntity.mo234746d("isSpecial"));
        C66007a.m258485a();
    }

    /* renamed from: m */
    private static void m260306m(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            C66007a.m258487a(crossProcessDataEntity.mo234744b("schema"), crossProcessDataEntity.mo234744b("miniAppFromId"), crossProcessDataEntity.mo234746d("isGame"), crossProcessDataEntity.mo234746d("killCurrentProcess"));
        }
    }

    /* renamed from: d */
    public static void m260297d(CrossProcessDataEntity crossProcessDataEntity) {
        AbstractC67299e eVar;
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("host_event_mp_id");
            String b2 = crossProcessDataEntity.mo234744b("host_event_event_name");
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2) && (eVar = (AbstractC67299e) C67288b.m262152a().mo233958a(C67298d.class)) != null) {
                eVar.mo233964a(b, b2);
            }
        }
    }

    /* renamed from: e */
    public static void m260298e(CrossProcessDataEntity crossProcessDataEntity) {
        AbstractC67299e eVar;
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("host_event_mp_id");
            String b2 = crossProcessDataEntity.mo234744b("host_event_event_name");
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2) && (eVar = (AbstractC67299e) C67288b.m262152a().mo233958a(C67298d.class)) != null) {
                eVar.mo233965b(b, b2);
            }
        }
    }

    /* renamed from: f */
    private static void m260299f(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("mini_app_id");
            String b2 = crossProcessDataEntity.mo234744b("sand_box_env_name");
            if (b != null && b2 != null) {
                ISandboxEnvInfo b3 = C66645a.m260337a().mo232358b(b2);
                if (b3 != null) {
                    if (TextUtils.isEmpty(b3.getAppId())) {
                        b3.processRunning(b, null);
                    }
                    b3.updateActivityCreateStatus(true);
                }
                ((AbstractC41413a) ClaymoreServiceLoader.loadFirst(AbstractC41413a.class)).recordAppLaunched(b);
            }
        }
    }

    /* renamed from: h */
    private static void m260301h(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("mini_app_id");
            if (!TextUtils.isEmpty(b) && C66919c.f168793b != null) {
                Iterator<String> it = C66919c.f168793b.iterator();
                while (it.hasNext()) {
                    if (it.next().contentEquals(b)) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private static void m260302i(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("mini_app_id");
            if (!TextUtils.isEmpty(b)) {
                if (C66919c.f168793b == null) {
                    C66919c.f168793b = new LinkedHashSet<>();
                }
                C66919c.f168793b.add(b);
            }
        }
    }

    /* renamed from: l */
    private static void m260305l(CrossProcessDataEntity crossProcessDataEntity) {
        String b = crossProcessDataEntity.mo234744b("miniAppToId");
        String b2 = crossProcessDataEntity.mo234744b("miniAppFromId");
        C66007a.m258486a(b, crossProcessDataEntity.mo234744b("startPage"), crossProcessDataEntity.mo234744b(SearchIntents.EXTRA_QUERY), crossProcessDataEntity.mo234744b("refererInfo"), crossProcessDataEntity.mo234746d("isGame"), crossProcessDataEntity.mo234744b("version_type"), b2, crossProcessDataEntity.mo234748e("miniAppOrientation"), crossProcessDataEntity.mo234744b("miniAppOriginEntrance"));
    }

    /* renamed from: n */
    private static CrossProcessDataEntity m260307n(CrossProcessDataEntity crossProcessDataEntity) {
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("back_app_result", (Object) Boolean.valueOf(C66007a.m258490a(crossProcessDataEntity.mo234744b("miniAppId"), crossProcessDataEntity.mo234744b("refererInfo"), crossProcessDataEntity.mo234746d("isApiCall")))).mo234763b();
    }

    /* renamed from: o */
    private static void m260308o(final CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "restartApp callData == null");
            return;
        }
        Observable.create(new Action() {
            /* class com.tt.miniapp.process.p3321f.C66628b.C666302 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AppbrandContext.getInst().getApplicationContext();
                String b = crossProcessDataEntity.mo234744b("miniAppId");
                String b2 = crossProcessDataEntity.mo234744b("miniAppSchema");
                if (C25529d.m91166g(C67448a.m262353a().mo234181b(C67440a.m262344a(AppType.GadgetAPP, b)))) {
                    try {
                        if (Uri.parse(b2).getQuery().contains("ssbFlag")) {
                            Log.m165389i("InnerHostProcessCallHandler", "SSB Model");
                            return;
                        }
                    } catch (Throwable th) {
                        Log.m165384e("InnerHostProcessCallHandler", "Throwable", th);
                    }
                }
                if (!TextUtils.isEmpty(b)) {
                    IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(b);
                    if (e != null) {
                        e.killSandBoxByAppId(b);
                    } else {
                        C48936b.m192783a("process is null");
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e2) {
                    AppBrandLogger.stacktrace(6, "InnerHostProcessCallHandler", e2.getStackTrace());
                }
                if (!TextUtils.isEmpty(b2)) {
                    C67489c.m262538a().openAppbrand(new C67466a(b2));
                }
            }
        }).schudleOn(C67554l.m262725b()).subscribeSimple();
    }

    /* renamed from: r */
    private static boolean m260311r(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            return C66033e.m258574a(crossProcessDataEntity.mo234744b("logEventName"), crossProcessDataEntity.mo234749f("logEventData"));
        }
        AppBrandLogger.m52829e("InnerHostProcessCallHandler", "innerPreHandleEventLog, callData is null");
        return false;
    }

    /* renamed from: t */
    private static void m260313t(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("sandboxName");
            ISandboxEnvInfo b2 = C66645a.m260337a().mo232358b(b);
            if (b2 != null) {
                IAppSandboxEnvProcessor d = C66645a.m260337a().mo232362d(b);
                if (d != null) {
                    d.startSandboxEnvMonitor(AppbrandContext.getInst().getApplicationContext(), b2, false, b2.getAppId());
                } else {
                    C48936b.m192783a("process is null");
                }
            } else {
                C48936b.m192783a("process info is null");
            }
        }
    }

    /* renamed from: a */
    public static void m260281a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("sp_data_file");
            String b2 = crossProcessDataEntity.mo234744b("sp_data_key");
            String b3 = crossProcessDataEntity.mo234744b("sp_data_value");
            if (!TextUtils.isEmpty(b2) && b != null) {
                C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), b).edit().putString(b2, b3).apply();
            }
        }
    }

    /* renamed from: b */
    public static CrossProcessDataEntity m260290b(CrossProcessDataEntity crossProcessDataEntity) {
        String str = null;
        if (crossProcessDataEntity == null) {
            return null;
        }
        CrossProcessDataEntity.C67574a aVar = new CrossProcessDataEntity.C67574a();
        String b = crossProcessDataEntity.mo234744b("sp_data_file");
        String b2 = crossProcessDataEntity.mo234744b("sp_data_key");
        String b3 = crossProcessDataEntity.mo234744b("sp_data_default");
        if (!TextUtils.isEmpty(b2) && b != null) {
            str = C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), b).getString(b2, b3);
        }
        if (TextUtils.isEmpty(str)) {
            if (b3 == null) {
                b3 = "";
            }
            str = b3;
        }
        aVar.mo234760a("sp_data_value", (Object) str);
        return aVar.mo234763b();
    }

    /* renamed from: c */
    public static void m260296c(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            String b = crossProcessDataEntity.mo234744b("sp_data_key");
            String b2 = crossProcessDataEntity.mo234744b("sp_data_file");
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
                C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), b2).edit().remove(b).apply();
            }
        }
    }

    /* renamed from: p */
    private static void m260309p(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "savePlatformSession callData == null");
            return;
        }
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null) {
            AppBrandLogger.m52829e("InnerHostProcessCallHandler", "savePlatformSession context == null");
            return;
        }
        String b = crossProcessDataEntity.mo234744b("miniAppId");
        String b2 = crossProcessDataEntity.mo234744b("platformSession");
        AppBrandLogger.m52828d("InnerHostProcessCallHandler", "appId " + b + " platformSession " + b2);
        if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
            C12791h.m52863a(applicationContext, b, b2);
        }
    }

    /* renamed from: q */
    private static void m260310q(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "setTmaLaunchFlag callData == null");
            return;
        }
        final String b = crossProcessDataEntity.mo234744b("processName");
        final String b2 = crossProcessDataEntity.mo234744b("miniAppId");
        final String b3 = crossProcessDataEntity.mo234744b("miniAppVersionType");
        AppBrandLogger.m52828d("InnerHostProcessCallHandler", "handleAsyncCall setTmaLaunchFlag processName:", b, "appId:", b2, "versionType:", b3);
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "TextUtils.isEmpty(processName) || TextUtils.isEmpty(appId)");
            return;
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.process.p3321f.C66628b.C666313 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(b2);
                if (e != null) {
                    e.updateSandboxEnvInfo(b, b2, b3);
                } else {
                    C48936b.m192783a("processor is null");
                }
                C66460m.m259779a(b2);
            }
        }, Schedulers.shortIO());
    }

    /* renamed from: u */
    private static void m260314u(final CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null && C67031e.m261247a()) {
            final Activity a = C66429e.m259690a();
            if (a == null || a.isFinishing()) {
                HostDependManager.getInst().showToast(AppbrandContext.getInst().getApplicationContext(), null, String.format("小程序进程 %s 出现 crash：%s", crossProcessDataEntity.mo234744b("processName"), crossProcessDataEntity.mo234744b("exceptionMessage")), 0, null);
                return;
            }
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.process.p3321f.C66628b.RunnableC666356 */

                public void run() {
                    HostDependManager inst = HostDependManager.getInst();
                    Activity activity = a;
                    inst.showModal(activity, null, "小程序进程 Crash", "此消息仅在 local_test 渠道下展示。\nCrash信息：\n" + crossProcessDataEntity.mo234744b("exceptionMessage"), false, null, null, "确定", null, new AbstractC67550j.AbstractC67551a<Integer>() {
                        /* class com.tt.miniapp.process.p3321f.C66628b.RunnableC666356.C666361 */

                        /* renamed from: a */
                        public void onNativeModuleCall(Integer num) {
                        }
                    }, a);
                }
            });
        }
    }

    /* renamed from: s */
    private static CrossProcessDataEntity m260312s(CrossProcessDataEntity crossProcessDataEntity) {
        String str = null;
        if (crossProcessDataEntity == null) {
            return null;
        }
        int e = crossProcessDataEntity.mo234748e("bgAudioId");
        switch (C666388.f168221a[BgAudioCommand.fromString(crossProcessDataEntity.mo234744b("bgAudioCommondType")).ordinal()]) {
            case 1:
                return CrossProcessDataEntity.C67574a.m263013a().mo234760a("bgAudioId", (Object) Integer.valueOf(C65775b.m257829a().mo230433a(e, BgAudioCallExtra.m257789a(crossProcessDataEntity.mo234744b("bgAudioCommondInfo"))))).mo234763b();
            case 2:
                C65775b.m257829a().mo230434a(e);
                break;
            case 3:
                C65775b.m257829a().mo230440b(e);
                break;
            case 4:
                C65775b.m257829a().mo230441c(e);
                break;
            case 5:
                String b = crossProcessDataEntity.mo234744b("bgAudioCommondInfo");
                if (!TextUtils.isEmpty(b)) {
                    C65775b.m257829a().mo230435a(e, Integer.parseInt(b));
                    break;
                }
                break;
            case 6:
                BgAudioModel a = BgAudioModel.m257793a(crossProcessDataEntity.mo234744b("bgAudioCommondInfo"));
                if (a != null) {
                    C65775b.m257829a().mo230436a(e, a);
                    break;
                }
                break;
            case 7:
                BgAudioState d = C65775b.m257829a().mo230442d(e);
                CrossProcessDataEntity.C67574a a2 = CrossProcessDataEntity.C67574a.m263013a();
                if (d != null) {
                    str = d.mo230415a();
                }
                return a2.mo234760a("bgAudioCommondRetState", (Object) str).mo234763b();
            case 8:
                return CrossProcessDataEntity.C67574a.m263013a().mo234760a("bgAudioCommandRetNeedKeepAlive", (Object) Boolean.valueOf(C65775b.m257829a().mo230443e(e))).mo234763b();
        }
        return null;
    }

    /* renamed from: b */
    private static void m260294b(C67577a aVar) {
        String str;
        Locale b = C67479c.m262467a().mo234228b();
        String str2 = "";
        if (b != null) {
            str = C67481d.m262478a(b);
        } else {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        AppBrandLogger.m52828d("InnerHostProcessCallHandler", "getCurrentLocale:" + str2);
        aVar.mo234767a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("localeLang", (Object) str2).mo234763b());
    }

    /* renamed from: a */
    private static void m260280a(AbstractC67433a aVar, CrossProcessDataEntity crossProcessDataEntity) {
        IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType = (IAppSandboxEnvManagerService.SandBoxEnvType) crossProcessDataEntity.mo234745c("current_env_sand_box_type");
        AppBrandLogger.m52830i("InnerHostProcessCallHandler", "sandBoxEnvType:" + sandBoxEnvType);
        C66645a.m260337a().mo232355a(sandBoxEnvType).preloadEmptySandboxEnv(1002, "inner preload", aVar);
    }

    /* renamed from: a */
    private static void m260282a(CrossProcessDataEntity crossProcessDataEntity, IAppContext iAppContext) {
        if (crossProcessDataEntity != null) {
            List<String> g = crossProcessDataEntity.mo234750g("js_component_names");
            int a = crossProcessDataEntity.mo234737a("js_component_download_from", -1);
            AppBrandLogger.m52830i("js_component_mgr", "downloadJsComponent......", Arrays.toString(g.toArray()));
            C66399c.m259608a().mo231920a(g, a, iAppContext);
        }
    }

    /* renamed from: b */
    private static CrossProcessDataEntity m260291b(CrossProcessDataEntity crossProcessDataEntity, IAppContext iAppContext) {
        if (crossProcessDataEntity == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "getPlatformSession callData == null");
            return null;
        }
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null) {
            AppBrandLogger.m52829e("InnerHostProcessCallHandler", "getPlatformSession context == null");
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("miniAppId");
        if (!TextUtils.isEmpty(b)) {
            return CrossProcessDataEntity.C67574a.m263013a().mo234760a("platformSession", (Object) C12791h.m52862a(applicationContext, b)).mo234763b();
        }
        AppBrandLogger.m52829e("InnerHostProcessCallHandler", "getPlatformSession appId is empty");
        return null;
    }

    /* renamed from: a */
    private static void m260283a(CrossProcessDataEntity crossProcessDataEntity, CrossProcessDataEntity crossProcessDataEntity2) {
        if (crossProcessDataEntity2 == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "callback callExtraData == null");
            return;
        }
        int a = crossProcessDataEntity2.mo234737a("callbackId", 0);
        boolean d = crossProcessDataEntity2.mo234746d("finishCallBack");
        C67566c.m262973a().mo234713a(a, crossProcessDataEntity);
        if (d) {
            C67566c.m262973a().mo232254a(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m260292b(com.tt.miniapphost.process.data.CrossProcessDataEntity r14, final com.tt.miniapphost.process.p3379e.C67577a r15) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.process.p3321f.C66628b.m260292b(com.tt.miniapphost.process.data.CrossProcessDataEntity, com.tt.miniapphost.process.e.a):void");
    }

    /* renamed from: a */
    private static void m260284a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        if (crossProcessDataEntity == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "registerBgAudioPlayState callData == null");
            return;
        }
        final int e = crossProcessDataEntity.mo234748e("bgAudioId");
        if (e >= 0) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.process.p3321f.C66628b.C666335 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    C65775b.m257829a().mo230437a(e, new AbstractC65782c() {
                        /* class com.tt.miniapp.process.p3321f.C66628b.C666335.C666341 */

                        @Override // com.tt.miniapp.audio.background.AbstractC65782c
                        /* renamed from: a */
                        public void mo230455a(int i, BgAudioModel bgAudioModel) {
                        }

                        @Override // com.tt.miniapp.audio.background.AbstractC65782c
                        /* renamed from: a */
                        public void mo230456a(BgAudioModel bgAudioModel) {
                        }

                        @Override // com.tt.miniapp.audio.background.AbstractC65782c
                        /* renamed from: a */
                        public void mo230457a(BgAudioModel bgAudioModel, boolean z) {
                        }

                        @Override // com.tt.miniapp.audio.background.AbstractC65782c
                        /* renamed from: a */
                        public void mo230458a(String str, BgAudioModel bgAudioModel, boolean z) {
                            aVar.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("bgAudioPlayState", (Object) str).mo234763b(), false);
                        }
                    });
                }
            }, C67554l.m262725b());
        }
    }

    /* renamed from: b */
    private static void m260293b(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar, IAppContext iAppContext) {
        if (crossProcessDataEntity == null) {
            DebugUtil.outputError("InnerHostProcessCallHandler", "apiHandler callData == null");
            return;
        }
        String b = crossProcessDataEntity.mo234744b(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        String b2 = crossProcessDataEntity.mo234744b("apiData");
        AppBrandLogger.m52828d("InnerHostProcessCallHandler", "handleAsyncCall apiHandler apiName: ", b, " apiData: ", b2);
        AbstractC67622h.AbstractC67623a extensionApiCreator = AppbrandContext.getInst().getExtensionApiCreator();
        if (TextUtils.isEmpty(b) || extensionApiCreator == null) {
            aVar.mo234768a(null, true);
            AppBrandLogger.m52829e("InnerHostProcessCallHandler", "handleAsyncCall TextUtils.isEmpty(apiName) || extApiHandlerCreator== null. apiName:", b);
            return;
        }
        final ApiHandler a = extensionApiCreator.mo48874a(b, b2, 0, null);
        if (a != null) {
            a.setAppContext(iAppContext);
            a.mApiHandlerCallback = new AbstractC67619e() {
                /* class com.tt.miniapp.process.p3321f.C66628b.C666324 */

                @Override // com.tt.option.ext.AbstractC67619e
                public void callback(int i, String str) {
                    a.operateFinishOnGoalProcess(str, aVar);
                }
            };
            C66625a.m260273a(a);
            return;
        }
        aVar.mo234768a(null, true);
        AppBrandLogger.m52829e("InnerHostProcessCallHandler", "handleAsyncCall apiHandler cannot create target ApiHandler. apiName:", b);
    }

    /* renamed from: a */
    private static void m260285a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar, IAppContext iAppContext) {
        if (crossProcessDataEntity != null) {
            List<String> g = crossProcessDataEntity.mo234750g("js_component_names");
            AppBrandLogger.m52830i("js_component_mgr", "fetchJsComponents......", Arrays.toString(g.toArray()));
            C66399c.m259608a().mo231921a(g, new IJSComponentManager.AbstractC24523a() {
                /* class com.tt.miniapp.process.p3321f.C66628b.C666291 */

                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24523a
                /* renamed from: a */
                public void mo87362a(Map<String, ReadyJSComponent> map) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    arrayList.addAll(map.values());
                    aVar.mo234767a(CrossProcessDataEntity.C67574a.m263013a().mo234761a("ready_components", arrayList).mo234763b());
                }
            }, iAppContext);
        }
    }
}
