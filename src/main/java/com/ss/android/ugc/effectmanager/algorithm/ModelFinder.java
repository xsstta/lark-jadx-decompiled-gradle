package com.ss.android.ugc.effectmanager.algorithm;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.C60629h;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.C60512d;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.common.p3053h.C60536o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.C60633c;
import com.ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\fJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/effectmanager/algorithm/ModelFinder;", "", "config", "Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;", "modelConfigArbiter", "Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;", "modelCache", "Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;", "assetManagerWrapper", "Lcom/ss/android/ugc/effectmanager/algorithm/AssetManagerWrapper;", "(Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;Lcom/ss/android/ugc/effectmanager/algorithm/AssetManagerWrapper;)V", "TAG", "", "checkModelMd5", "", "nameOfModel", "modelName", "businessId", "", "monitorTrace", "Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "findResourceUri", "dir", "isExactBuiltInResource", "isResourceAvailable", "nameStr", "monitorStatusRateFail", "", "monitorStatusRateSuccess", "onModelNotFound", "errorMessage", "queryResourceUri", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.a.g */
public final class ModelFinder {

    /* renamed from: a */
    private final String f151160a = "ModelFinder";

    /* renamed from: b */
    private final DownloadableModelConfig f151161b;

    /* renamed from: c */
    private final C60471c f151162c;

    /* renamed from: d */
    private final IModelCache f151163d;

    /* renamed from: e */
    private final C60467a f151164e;

    /* renamed from: c */
    private final boolean m235005c(String str) {
        C60467a aVar = this.f151164e;
        if (aVar == null) {
            return false;
        }
        return aVar.mo207015b("model/" + str);
    }

    /* renamed from: b */
    private final void m235004b(String str) {
        AbstractC60511c n = this.f151161b.mo206985n();
        if (n != null) {
            n.mo207190a("find_resource_uri_success_rate", 0, C60532k.m235271a().mo207241a("app_id", this.f151161b.mo206983l()).mo207241a("access_key", this.f151161b.mo206984m()).mo207241a("model_name", str).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
        }
    }

    /* renamed from: a */
    public final void mo207063a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "errorMessage");
        RuntimeException runtimeException = new RuntimeException("model not found neither in asset nor disk " + str);
        try {
            ModelEventListener k = this.f151161b.mo206982k();
            if (k != null) {
                k.mo208066a((Effect) null, runtimeException);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final String mo207061a(String str, MonitorTrace bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        String str2 = null;
        String a = C60512d.m235165a(str);
        EPMonitor.m235192a(bVar, "ResourceFinder#findResourceUri::modelName = " + a);
        IModelCache dVar = this.f151163d;
        Intrinsics.checkExpressionValueIsNotNull(a, "name");
        C60633c a2 = dVar.mo207017a(a, bVar);
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        EPMonitor.m235192a(bVar, "ResourceFinder#findResourceUri::isResourceDownloaded = " + z);
        if (z) {
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            str2 = a2.mo208116f().toString();
        } else if (m235005c(str)) {
            str2 = "asset://model/" + str;
        }
        EPMonitor.m235192a(bVar, "ResourceFinder#findResourceUri::Result Uri = " + str2);
        return str2;
    }

    /* renamed from: a */
    public final void mo207062a(MonitorTrace bVar, String str) {
        List<String> list;
        long j;
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        AbstractC60511c n = this.f151161b.mo206985n();
        if (n != null) {
            C60532k a = C60532k.m235271a().mo207241a("app_id", this.f151161b.mo206983l()).mo207241a("access_key", this.f151161b.mo206984m()).mo207241a("model_name", str);
            if (bVar != null) {
                list = bVar.mo207201a();
            } else {
                list = null;
            }
            C60532k a2 = a.mo207242a("monitor_trace", list);
            if (bVar != null) {
                j = bVar.mo207203b();
            } else {
                j = 0;
            }
            n.mo207190a("find_resource_uri_success_rate", 1, a2.mo207240a("duration", Long.valueOf(j)).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
        }
    }

    /* renamed from: a */
    public final String mo207060a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "modelName");
        MonitorTrace bVar = new MonitorTrace(str2);
        EPMonitor.m235191a(bVar);
        String str3 = this.f151160a;
        EPLog.m235179b(str3, "findResourceUri::nameStr = " + str2);
        String a = mo207061a(str2, bVar);
        EPMonitor.m235192a(bVar, "findResourceUri = " + a);
        try {
            String a2 = C60512d.m235165a(str2);
            EPMonitor.m235192a(bVar, "findResourceUri::nameOfModel = " + a2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "nameOfModel");
            if (m235003a(a2, str2, i, bVar)) {
                return "asset://md5_error";
            }
        } catch (Exception e) {
            EPMonitor.m235192a(bVar, "findResourceUri::Exception occurred, cause=" + e.getMessage());
            String str4 = this.f151160a;
            EPLog.m235177a(str4, "findResourceUri::nameStr = " + str2, e);
        }
        if (a == null) {
            EPMonitor.m235192a(bVar, "findResourceUri::uri not found");
            EPMonitor.m235193b(bVar);
            String str5 = this.f151160a;
            EPLog.m235180c(str5, "findResourceUri::nameStr = " + str2 + " returned not_found");
            return "asset://not_found";
        }
        EPMonitor.m235193b(bVar);
        m235004b(str2);
        String str6 = this.f151160a;
        EPLog.m235179b(str6, "findResourceUri::nameStr = " + str2 + " returned result: " + a);
        return a;
    }

    public ModelFinder(DownloadableModelConfig downloadableModelConfig, C60471c cVar, IModelCache dVar, C60467a aVar) {
        Intrinsics.checkParameterIsNotNull(downloadableModelConfig, "config");
        Intrinsics.checkParameterIsNotNull(dVar, "modelCache");
        this.f151161b = downloadableModelConfig;
        this.f151162c = cVar;
        this.f151163d = dVar;
        this.f151164e = aVar;
    }

    /* renamed from: a */
    private final boolean m235003a(String str, String str2, int i, MonitorTrace bVar) {
        C60629h hVar;
        ModelInfo b;
        C60633c a = this.f151163d.mo207017a(str, bVar);
        if (a == null || m235005c(str2)) {
            return false;
        }
        EPMonitor.m235192a(bVar, "findResourceUri::localModel exist and is not buildIn model");
        C60471c cVar = this.f151162c;
        ExtendedUrlModel extendedUrlModel = null;
        if (cVar != null) {
            hVar = cVar.mo207030c(i);
        } else {
            hVar = null;
        }
        if (hVar != null) {
            try {
                extendedUrlModel = hVar.mo208055a(str);
            } catch (IllegalArgumentException e) {
                EPLog.m235177a(this.f151160a, "model info not found in model list!", e);
                C60471c cVar2 = this.f151162c;
                if (!(cVar2 == null || (b = cVar2.mo207029b(i, str)) == null)) {
                    extendedUrlModel = b.getFileUrl();
                }
            }
        }
        if (extendedUrlModel == null) {
            EPLog.m235180c(this.f151160a, "expected model info not found in model list!");
            return false;
        }
        Uri f = a.mo208116f();
        Intrinsics.checkExpressionValueIsNotNull(f, "localModelInfo.uri");
        String path = f.getPath();
        if (path == null) {
            Intrinsics.throwNpe();
        }
        String a2 = C60536o.m235318a(new File(path), bVar);
        String uri = extendedUrlModel.getUri();
        if (!TextUtils.equals(a2, uri)) {
            String str3 = str2 + " md5 = " + a2 + " expectedMd5 = " + uri;
            EPMonitor.m235192a(bVar, "findResourceUri::errorMessage = " + str3);
            EPMonitor.m235193b(bVar);
            EPLog.m235180c(this.f151160a, "findResourceUri() return asset://md5_error\n" + str3);
            mo207063a(str3);
            mo207062a(bVar, str2);
            return true;
        }
        return false;
    }
}
