package com.ss.ugc.effectplatform.download;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.EffectFetcherArguments;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/ugc/effectplatform/download/EffectUnZipper;", "Lcom/ss/ugc/effectplatform/download/IUnZipper;", "arguments", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;Lcom/ss/ugc/effectplatform/EffectConfig;)V", "getArguments", "()Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "setArguments", "(Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;)V", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "getEffectConfig", "()Lcom/ss/ugc/effectplatform/EffectConfig;", "execUnZip", "", "zipFilePath", "", "uploadDirDiff", "", "dirPath", "zipPath", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.f */
public final class EffectUnZipper implements IUnZipper {

    /* renamed from: a */
    private final Effect f164906a;

    /* renamed from: b */
    private EffectFetcherArguments f164907b;

    /* renamed from: c */
    private final EffectConfig f164908c;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e4 A[Catch:{ Exception -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f0 A[Catch:{ Exception -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c A[Catch:{ Exception -> 0x0125 }] */
    @Override // com.ss.ugc.effectplatform.download.IUnZipper
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo227789a(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.download.EffectUnZipper.mo227789a(java.lang.String):boolean");
    }

    public EffectUnZipper(EffectFetcherArguments bVar, EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(bVar, "arguments");
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164907b = bVar;
        this.f164908c = effectConfig;
        this.f164906a = bVar.mo227733a();
    }

    /* renamed from: a */
    private final void m256809a(String str, String str2) {
        IMonitorReport a;
        if ((!Intrinsics.areEqual(str, str2)) && (a = this.f164908c.mo227572s().mo8625a()) != null) {
            HashMap hashMap = new HashMap();
            String k = this.f164908c.mo227564k();
            String str3 = "";
            if (k == null) {
                k = str3;
            }
            hashMap.put("app_id", k);
            String b = this.f164908c.mo227555b();
            if (b != null) {
                str3 = b;
            }
            hashMap.put("access_key", str3);
            hashMap.put("effect_id", this.f164906a.getEffect_id());
            hashMap.put("EffectDir", str);
            hashMap.put("zippath", str2);
            a.mo227791a("effect_download_error", 1, hashMap);
        }
    }
}
