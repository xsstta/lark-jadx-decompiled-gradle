package com.bytedance.ee.bear.list.loadstateview;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.NetworkType;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.net.CloudReqFun;
import com.bytedance.ee.log.C13479a;
import java.net.SocketTimeoutException;

/* renamed from: com.bytedance.ee.bear.list.loadstateview.b */
public class C8594b {

    /* renamed from: a */
    private C8579a f23325a;

    /* renamed from: b */
    private Context f23326b;

    /* renamed from: a */
    public void mo33503a() {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.startLoading: ");
        this.f23325a.mo33486a();
    }

    /* renamed from: b */
    public void mo33513b() {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.java.loadedSuccess: 58 ");
        this.f23325a.mo33495b();
    }

    /* renamed from: c */
    public void mo33515c() {
        C13479a.m54772d("LoadStateViewDispatcher", "LoadStateViewDispatcher.java.loadedSuccessButEmpty: 68 ");
        this.f23325a.mo33496b(0);
    }

    /* renamed from: b */
    private boolean m35846b(Throwable th) {
        if (th instanceof CloudReqFun.OkHttpReqException) {
            return ((CloudReqFun.OkHttpReqException) th).exception.equals(SocketTimeoutException.class.getName());
        }
        return th instanceof SocketTimeoutException;
    }

    /* renamed from: a */
    public void mo33504a(int i) {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.java.updateEmptyView: dataCount= " + i);
        this.f23325a.mo33487a(i);
    }

    /* renamed from: a */
    public void mo33506a(EmptyCategory emptyCategory) {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.setEmptyCategory: category=" + emptyCategory.toString());
        this.f23325a.mo33489a(emptyCategory);
    }

    /* renamed from: b */
    public void mo33514b(int i) {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.java.loadedSuccess: dataCount= " + i);
        this.f23325a.mo33496b(i);
    }

    /* renamed from: a */
    public void mo33507a(LoadFailCategory loadFailCategory) {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.java.loadedFail: category= " + loadFailCategory);
        this.f23325a.mo33490a(loadFailCategory);
    }

    /* renamed from: a */
    public void mo33508a(LoadStateView.AbstractC8570b bVar) {
        this.f23325a.mo33491a(bVar);
    }

    /* renamed from: a */
    public void mo33509a(LoadStateView.AbstractC8574f fVar) {
        this.f23325a.mo33492a(fVar);
    }

    /* renamed from: a */
    public void mo33510a(Throwable th) {
        C13479a.m54764b("LoadStateViewDispatcher", "LoadStateViewDispatcher.java.loadedFail: throwable= " + th.getMessage());
        if (C4974b.m20620a(this.f23326b) == NetworkType.NETWORK_NO) {
            mo33507a(LoadFailCategory.CATEGORY_NO_NETWORK);
        } else if (m35846b(th)) {
            mo33507a(LoadFailCategory.CATEGORY_OVERTIME);
        } else {
            mo33507a(LoadFailCategory.CATEGORY_UN_KNOW);
        }
    }

    /* renamed from: a */
    public void mo33505a(LifecycleOwner lifecycleOwner, AbstractC1178x<LoadStateCategory> xVar) {
        this.f23325a.mo33488a(lifecycleOwner, xVar);
    }

    public C8594b(LoadStateView loadStateView, Looper looper) {
        if (loadStateView != null) {
            this.f23325a = new C8579a("LoadStateViewDispatcher", looper, loadStateView);
            this.f23326b = loadStateView.getContext();
            return;
        }
        throw new RuntimeException("LoadStateView is invalid !!!");
    }

    /* renamed from: a */
    public void mo33511a(boolean z, EmptyCategory emptyCategory) {
        mo33512a(z, emptyCategory, LoadingCategory.CATEGORY_LIST);
    }

    /* renamed from: a */
    public void mo33512a(boolean z, EmptyCategory emptyCategory, LoadingCategory loadingCategory) {
        this.f23325a.mo33493a(loadingCategory);
        this.f23325a.mo33489a(emptyCategory);
        this.f23325a.mo33494a(z);
        this.f23325a.mo50514i();
    }
}
