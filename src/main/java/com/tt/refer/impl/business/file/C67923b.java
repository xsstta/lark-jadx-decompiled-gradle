package com.tt.refer.impl.business.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import java.util.List;

/* renamed from: com.tt.refer.impl.business.file.b */
public class C67923b implements IDiskCleanTask {
    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public Biz mo135615a() {
        return Biz.MIN_APP;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: c */
    public double mo135618c() {
        AppBrandLogger.m52830i("AppDiskCleanTask", "getCanManualSize....");
        return 0.0d;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: d */
    public List<DefaultAutoCleanItem> mo135619d() {
        AppBrandLogger.m52830i("AppDiskCleanTask", "getDefaultAutoCleanRegistry....");
        return null;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: b */
    public CleanResult mo135617b() {
        AppBrandLogger.m52830i("AppDiskCleanTask", "onManualClean....");
        return new CleanResult();
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public CleanResult mo135616a(RemoteConfig dVar) {
        return new CleanResult();
    }
}
