package com.bytedance.ee.bear.drive.biz.permission;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.permission.model.ThirdPartyAttachmentPermission;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010J\b\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveThirdPartyPermissionVM;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "livePerm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/drive/biz/permission/model/ThirdPartyAttachmentPermission;", "permExecutor", "Lcom/bytedance/ee/bear/drive/biz/permission/ThirdPartyAttachmentPermissionExecutor;", "fetchPermission", "", "objToken", "", "extra", "mountPoint", "Landroidx/lifecycle/LiveData;", "onCleared", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.permission.d */
public final class DriveThirdPartyPermissionVM extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C68289a compositeDisposable = new C68289a();
    public final C1177w<ThirdPartyAttachmentPermission> livePerm = new C1177w<>();
    private final C6518e permExecutor = new C6518e((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveThirdPartyPermissionVM$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final LiveData<ThirdPartyAttachmentPermission> livePerm() {
        return this.livePerm;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.mo237935a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/ThirdPartyAttachmentPermission;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.d$b */
    static final class C6516b<T> implements Consumer<ThirdPartyAttachmentPermission> {

        /* renamed from: a */
        final /* synthetic */ DriveThirdPartyPermissionVM f17952a;

        C6516b(DriveThirdPartyPermissionVM dVar) {
            this.f17952a = dVar;
        }

        /* renamed from: a */
        public final void accept(ThirdPartyAttachmentPermission thirdPartyAttachmentPermission) {
            this.f17952a.livePerm.mo5926a(thirdPartyAttachmentPermission);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.d$c */
    static final class C6517c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DriveThirdPartyPermissionVM f17953a;

        C6517c(DriveThirdPartyPermissionVM dVar) {
            this.f17953a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f17953a.livePerm.mo5926a((ThirdPartyAttachmentPermission) null);
            C13479a.m54759a("DriveThirdPartyPermissionVM", "fetch perm error", th);
        }
    }

    public final void fetchPermission(String str, String str2, String str3) {
        this.compositeDisposable.mo237937a(this.permExecutor.mo26028a(str, "", str2, str3).mo238001b(new C6516b(this), new C6517c(this)));
    }
}
