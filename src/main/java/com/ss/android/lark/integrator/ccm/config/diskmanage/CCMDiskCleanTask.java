package com.ss.android.lark.integrator.ccm.config.diskmanage;

import com.bytedance.ee.bear.basesdk.api.AbstractC4377c;
import com.bytedance.ee.bear.p391g.C7804b;
import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/config/diskmanage/CCMDiskCleanTask;", "Lcom/ss/android/lark/diskmanage/clean/IDiskCleanTask;", "()V", "getBiz", "Lcom/ss/android/lark/diskmanage/Biz;", "getCanManualSize", "", "getDefaultAutoCleanRegistry", "", "Lcom/ss/android/lark/diskmanage/DefaultAutoCleanItem;", "onManualClean", "Lcom/ss/android/lark/diskmanage/CleanResult;", "onRemoteClean", "remoteConfig", "Lcom/ss/android/lark/diskmanage/RemoteConfig;", "Companion", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.ccm.config.c.a */
public final class CCMDiskCleanTask implements IDiskCleanTask {

    /* renamed from: a */
    public static final Companion f100585a = new Companion(null);

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: d */
    public List<DefaultAutoCleanItem> mo135619d() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/config/diskmanage/CCMDiskCleanTask$Companion;", "", "()V", "TAG", "", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.ccm.config.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public Biz mo135615a() {
        return Biz.DOCS;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: b */
    public CleanResult mo135617b() {
        return new CleanResult(false, C7804b.m31283a().mo17138e().mo17027d(), null, 5, null);
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: c */
    public double mo135618c() {
        AbstractC4377c e = C7804b.m31283a().mo17138e();
        Intrinsics.checkExpressionValueIsNotNull(e, "LarkSpacekitSdk.getInsta…e().provideCacheManager()");
        return (double) e.mo17026c();
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public CleanResult mo135616a(RemoteConfig dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "remoteConfig");
        if (!C57765ac.m224187a(LarkContext.getApplication())) {
            return new CleanResult(false, 0, null, 7, null);
        }
        Log.m165389i("CCMDiskCleanTask", "CCMDiskCleanTask.onRemoteClean. ");
        return new CleanResult(false, C7804b.m31283a().mo17138e().mo17023a(dVar), null, 5, null);
    }
}
