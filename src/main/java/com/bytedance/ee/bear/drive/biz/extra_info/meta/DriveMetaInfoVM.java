package com.bytedance.ee.bear.drive.biz.extra_info.meta;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.biz.p326a.C6322a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6521a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/extra_info/meta/DriveMetaInfoVM;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "docInfoDataFetchExecutor", "Lcom/bytedance/ee/bear/drive/biz/docinfo/DocInfoDataFetchExecutor;", "liveMetaInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DriveMetaInfo;", "getLiveMetaInfo", "()Landroidx/lifecycle/MutableLiveData;", "fetchMetaInfo", "", "fileId", "", "onCleared", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.meta.a */
public final class DriveMetaInfoVM extends AbstractC1142af {
    private final C68289a compositeDisposable = new C68289a();
    private final C6322a docInfoDataFetchExecutor = new C6322a((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null));
    private final C1177w<C6521a> liveMetaInfo = new C1177w<>();

    public final C1177w<C6521a> getLiveMetaInfo() {
        return this.liveMetaInfo;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.mo237935a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.meta.a$b */
    static final class C6448b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f17815a;

        C6448b(String str) {
            this.f17815a = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("DriveComponent", th);
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27167b().mo27887a("request_meta_info", this.f17815a, (AbstractC6927d) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "driveMetaInfo", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DriveMetaInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.meta.a$a */
    static final class C6447a<T> implements Consumer<C6521a> {

        /* renamed from: a */
        final /* synthetic */ DriveMetaInfoVM f17813a;

        /* renamed from: b */
        final /* synthetic */ String f17814b;

        C6447a(DriveMetaInfoVM aVar, String str) {
            this.f17813a = aVar;
            this.f17814b = str;
        }

        /* renamed from: a */
        public final void accept(C6521a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "driveMetaInfo");
            C13479a.m54764b("DriveComponent", "fetch meta info=" + aVar);
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27167b().mo27887a("request_meta_info", this.f17814b, (AbstractC6927d) null);
            this.f17813a.getLiveMetaInfo().mo5926a(aVar);
        }
    }

    public final void fetchMetaInfo(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        C13479a.m54764b("DriveComponent", "DriveMetaInfoVM#fetchMetaInfo() start");
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        f.mo27167b().mo27896b(str, "request_meta_info", null);
        Disposable b = this.docInfoDataFetchExecutor.mo25416a(str).mo238001b(new C6447a(this, str), new C6448b(str));
        Intrinsics.checkExpressionValueIsNotNull(b, "docInfoDataFetchExecutor…     )\n                })");
        this.compositeDisposable.mo237937a(b);
    }
}
