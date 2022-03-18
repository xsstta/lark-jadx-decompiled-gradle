package com.ss.android.lark.platform.diskmanage;

import android.app.Application;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36119d;
import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.diskmanage.clean.C36818d;
import com.ss.android.lark.diskmanage.clean.DiskCleanTaskManager;
import com.ss.android.lark.diskmanage.clean.DiskCleanUtils;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u0018\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J \u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DefaultCleanTask;", "Lcom/ss/android/lark/diskmanage/clean/IDiskCleanTask;", "()V", "mRustLogPrefix", "", "getBiz", "Lcom/ss/android/lark/diskmanage/Biz;", "getCanManualSize", "", "getDefaultAutoCleanRegistry", "", "Lcom/ss/android/lark/diskmanage/DefaultAutoCleanItem;", "getManualCleanList", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "internalClean", "Lcom/ss/android/lark/diskmanage/CleanResult;", "toDeleteFiles", "onManualClean", "onRemoteClean", "remoteConfig", "Lcom/ss/android/lark/diskmanage/RemoteConfig;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.h.a */
public final class DefaultCleanTask implements IDiskCleanTask {

    /* renamed from: a */
    private final String f128751a = "lark_";

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: d */
    public List<DefaultAutoCleanItem> mo135619d() {
        return null;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public Biz mo135615a() {
        return Biz.DEFAULT;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: b */
    public CleanResult mo135617b() {
        return m200834a(m200835e());
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: c */
    public double mo135618c() {
        Iterator<File> it = m200835e().iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += (double) it.next().length();
        }
        return d;
    }

    /* renamed from: e */
    private final ArrayList<File> m200835e() {
        Application application = LarkContext.getApplication();
        HashSet hashSet = new HashSet();
        DiskCleanUtils bVar = DiskCleanUtils.f94602a;
        StoragePathUtils dVar = StoragePathUtils.f94669a;
        Intrinsics.checkExpressionValueIsNotNull(application, "context");
        Application application2 = application;
        hashSet.addAll(bVar.mo135608b(dVar.mo135725W(application2), 1, true));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135726X(application2), 1, true));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135754t(application2), 0, true));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135740f(application2), 0, true));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135707E(application2), 0, true));
        DiskCleanUtils bVar2 = DiskCleanUtils.f94602a;
        StoragePathUtils dVar2 = StoragePathUtils.f94669a;
        AbstractC36119d a = C36083a.m141486a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
        String c = a.getEnvDependency().mo132695c();
        Intrinsics.checkExpressionValueIsNotNull(c, "CoreModule.getDependency…dency.rustSdkLogSubPath()");
        hashSet.addAll(bVar2.mo135602a(dVar2.mo135730a(application2, c), this.f128751a, 3));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135601a(StoragePathUtils.f94669a.mo135736c(application2), 3, true));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135601a(StoragePathUtils.f94669a.mo135733b(application2), 3, true));
        hashSet.addAll(DiskCleanUtils.f94602a.mo135608b(C57881t.m224611J(application2), 3, true));
        return new ArrayList<>(hashSet);
    }

    /* renamed from: a */
    private final CleanResult m200834a(ArrayList<File> arrayList) {
        Iterator<File> it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            File next = it.next();
            j += next.length();
            Intrinsics.checkExpressionValueIsNotNull(next, "file");
            C26311p.m95291k(next.getPath());
        }
        return new CleanResult(true, j, null, 4, null);
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public CleanResult mo135616a(RemoteConfig dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "remoteConfig");
        Application application = LarkContext.getApplication();
        ArrayList<File> arrayList = new ArrayList<>();
        C57744a a = C57744a.m224104a();
        float f = 1.0f;
        if (a.getBoolean("small_disk_on", false)) {
            f = a.getFloat("disk_timeout_factor", 1.0f);
        }
        int i = (int) (((float) 2) * f);
        DiskCleanUtils bVar = DiskCleanUtils.f94602a;
        StoragePathUtils dVar2 = StoragePathUtils.f94669a;
        Intrinsics.checkExpressionValueIsNotNull(application, "context");
        Application application2 = application;
        arrayList.addAll(bVar.mo135608b(dVar2.mo135740f(application2), i, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135749o(application2), i, true));
        int i2 = (int) (((float) 7) * f);
        arrayList.addAll(DiskCleanUtils.f94602a.mo135601a(StoragePathUtils.f94669a.mo135736c(application2), i2, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135601a(StoragePathUtils.f94669a.mo135733b(application2), i2, true));
        int i3 = (int) (((float) 6) * f);
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135725W(application2), i3, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135726X(application2), i3, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135710H(application2), i3, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135704B(application2), i3, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135716N(application2), i3, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(StoragePathUtils.f94669a.mo135754t(application2), i3, true));
        arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(C57881t.m224611J(application2), i3, true));
        for (DefaultAutoCleanItem bVar2 : DiskCleanTaskManager.f94590b.mo135593a().mo135588a()) {
            arrayList.addAll(DiskCleanUtils.f94602a.mo135608b(bVar2.mo135559a(), (int) (((float) bVar2.mo135560b()) * f), true));
        }
        new C36818d().mo135620a(application2, dVar.mo135641b());
        return m200834a(arrayList);
    }
}
