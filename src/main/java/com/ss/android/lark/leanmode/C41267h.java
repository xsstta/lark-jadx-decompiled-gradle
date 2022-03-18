package com.ss.android.lark.leanmode;

import android.app.Activity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.leanmode.dto.SyncDataStrategy;
import com.ss.android.lark.leanmode.impl.C41271a;
import com.ss.android.lark.leanmode.p2120b.AbstractC41243a;
import com.ss.android.lark.leanmode.p2121c.C41249a;
import com.ss.android.lark.leanmode.p2121c.C41258d;

/* renamed from: com.ss.android.lark.leanmode.h */
public class C41267h {

    /* renamed from: a */
    private static volatile AbstractC41243a f105035a;

    /* renamed from: a */
    public static AbstractC41243a m163598a() {
        return f105035a;
    }

    /* renamed from: b */
    public AbstractC41263e mo148659b() {
        return C41271a.m163643j();
    }

    /* renamed from: c */
    public void mo148661c() {
        C41271a.m163643j().mo148685d();
    }

    /* renamed from: d */
    public boolean mo148662d() {
        LeanMode c;
        if (m163598a().mo143874a("lark.leanmode.switch") && (c = C41258d.m163569a().mo148616c()) != null && c.isDeviceInLeanMode()) {
            return true;
        }
        return false;
    }

    public C41267h(AbstractC41243a aVar) {
        f105035a = aVar;
    }

    /* renamed from: a */
    public void mo148655a(Activity activity) {
        C41271a.m163643j().mo148680a(activity);
    }

    /* renamed from: a */
    public void mo148656a(AbstractC29621n nVar) {
        C41249a.m163558a().mo148606a(nVar);
    }

    /* renamed from: b */
    public void mo148660b(AbstractC29621n nVar) {
        C41249a.m163558a().mo148607b(nVar);
    }

    /* renamed from: a */
    public void mo148657a(boolean z) {
        SyncDataStrategy syncDataStrategy;
        C41271a j = C41271a.m163643j();
        if (z) {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        } else {
            syncDataStrategy = SyncDataStrategy.TRY_LOCAL;
        }
        j.mo148683a(syncDataStrategy, (IGetDataCallback<LeanMode>) null);
    }

    /* renamed from: a */
    public void mo148658a(boolean z, IGetDataCallback<LeanMode> iGetDataCallback) {
        SyncDataStrategy syncDataStrategy;
        C41271a j = C41271a.m163643j();
        if (z) {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        } else {
            syncDataStrategy = SyncDataStrategy.TRY_LOCAL;
        }
        j.mo148683a(syncDataStrategy, iGetDataCallback);
    }
}
