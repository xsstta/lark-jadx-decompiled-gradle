package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import com.larksuite.framework.utils.C26246a;
import com.ss.android.ugc.effectmanager.C60484c;
import com.ss.android.ugc.effectmanager.C60624f;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.p3065f.p3066a.p3067a.C60627a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.EffectPlatformConfig;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.C61282e;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.service.VideoChatManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.cv;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u00101\u001a\u00020\u0004J\u0006\u00102\u001a\u00020\u0004J\u0006\u00103\u001a\u00020\u0004J\u000e\u00104\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u00105\u001a\u00020\u0004J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020\u0004J\u0006\u00109\u001a\u00020\u001aJ\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010\u0004J\u0010\u0010>\u001a\u0002072\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0006\u0010@\u001a\u000207J\u0006\u0010A\u001a\u000207J\u0006\u0010B\u001a\u000207J\u0006\u0010C\u001a\u00020DJ\f\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FJ\u000e\u0010H\u001a\u0002072\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020JJ\u000e\u0010L\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010+X\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006R"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/labs/effect/EffectPlayground;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "categoryModel", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "getCategoryModel", "()Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "setCategoryModel", "(Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;)V", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getEffect", "()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setEffect", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "effectList", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "getEffectList", "()Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "setEffectList", "(Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;)V", "effectManager", "Lcom/ss/android/ugc/effectmanager/EffectManager;", "getEffectManager", "()Lcom/ss/android/ugc/effectmanager/EffectManager;", "needUpdate", "", "getNeedUpdate", "()Ljava/lang/Boolean;", "setNeedUpdate", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "pannelInfo", "Lcom/ss/android/ugc/effectmanager/effect/model/PanelInfoModel;", "getPannelInfo", "()Lcom/ss/android/ugc/effectmanager/effect/model/PanelInfoModel;", "setPannelInfo", "(Lcom/ss/android/ugc/effectmanager/effect/model/PanelInfoModel;)V", "requirements", "", "getRequirements", "()[Ljava/lang/String;", "setRequirements", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "accessKey", "appId", "appVersion", "areRequirementsReady", "channel", "checkedEffectListUpdate", "", "deviceId", "em", "executor", "Ljava/util/concurrent/Executor;", "fetchCategoryEffect", "category", "fetchEffect", "effectId", "fetchEffectList", "fetchPanelInfo", "fetchResourcesNeededByRequirements", "fetcher", "Lcom/ss/android/ugc/effectmanager/effect/bridge/EffectFetcher;", "hosts", "", "Lcom/ss/android/ugc/effectmanager/link/model/host/Host;", "initFetcher", "context", "Landroid/content/Context;", "initManager", "isEffectReady", "modelFileEnv", "Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig$ModelFileEnv;", "modelType", "Lcom/ss/android/ugc/effectmanager/FetchModelType;", "sdkVersion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.d */
public final class EffectPlayground {

    /* renamed from: a */
    public static final EffectPlayground f156365a = new EffectPlayground();

    /* renamed from: b */
    private static final String f156366b = f156366b;

    /* renamed from: c */
    private static final C60624f f156367c = new C60624f();

    /* renamed from: b */
    public final String mo215314b() {
        return "05f43500d79911eab76b63d0864735f8";
    }

    /* renamed from: c */
    public final String mo215316c() {
        return "1160";
    }

    /* renamed from: d */
    public final String mo215317d() {
        return "online";
    }

    private EffectPlayground() {
    }

    /* renamed from: a */
    public final C60624f mo215311a() {
        return f156367c;
    }

    /* renamed from: j */
    public final DownloadableModelConfig.ModelFileEnv mo215323j() {
        return DownloadableModelConfig.ModelFileEnv.ONLINE;
    }

    /* renamed from: k */
    public final FetchModelType mo215324k() {
        return FetchModelType.ZIP;
    }

    /* renamed from: g */
    public final String mo215320g() {
        String a = C26246a.m94977a(ar.m236694a());
        Intrinsics.checkExpressionValueIsNotNull(a, "ApkUtil.getAppVersionNam…textDeps.getAppContext())");
        return a;
    }

    /* renamed from: i */
    public final Executor mo215322i() {
        return cv.m266808a(3, "effect").mo242722a();
    }

    /* renamed from: h */
    public final String mo215321h() {
        boolean z;
        String b = VideoChatModuleDependency.m236629b();
        String str = b;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0";
        }
        return b;
    }

    /* renamed from: f */
    public final String mo215319f() {
        try {
            C61237h a = C61237h.m238223a();
            Intrinsics.checkExpressionValueIsNotNull(a, "VcRtcService.getInstance()");
            String t = a.mo210562t();
            Intrinsics.checkExpressionValueIsNotNull(t, "VcRtcService.getInstance().effectSDKVersion");
            return t;
        } catch (LinkageError e) {
            C60700b.m235864f(f156366b, "[sdkVersion]", e.getMessage());
            return "9.9.0";
        }
    }

    /* renamed from: e */
    public final List<C60627a> mo215318e() {
        String str;
        VideoChatManager a = VideoChatManager.m249444a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VideoChatManager.getInstance()");
        C61282e k = a.mo220133k();
        Intrinsics.checkExpressionValueIsNotNull(k, "VideoChatManager.getInstance().meetingConfig");
        EffectPlatformConfig c = k.mo211942c();
        ArrayList arrayList = new ArrayList();
        if (c != null) {
            if (!LabsUtils.m242918j()) {
                AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
                Intrinsics.checkExpressionValueIsNotNull(appEnvDependency, "VideoChatModuleDependency.getAppEnvDependency()");
                if (!appEnvDependency.mo196333c()) {
                    str = c.feishuHost;
                    C60700b.m235851b(f156366b, "[hosts]", str);
                    arrayList.add(new C60627a(str));
                }
            }
            str = c.larkHost;
            C60700b.m235851b(f156366b, "[hosts]", str);
            arrayList.add(new C60627a(str));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo215313a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        try {
            return C60484c.m235025b().mo207069a(f156367c, effect);
        } catch (UnsatisfiedLinkError e) {
            C60700b.m235864f(f156366b, "[isEffectReady]", e.getMessage());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo215312a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectPlayground.mo215312a(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo215315b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectPlayground.mo215315b(android.content.Context):void");
    }
}
