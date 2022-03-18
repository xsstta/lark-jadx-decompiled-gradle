package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.bitableshare;

import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.permission.bitableshare.BitableSharePermissionManager;
import com.larksuite.framework.callback.IRequestCallback;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "token", "", "shareToken", "(Ljava/lang/String;Ljava/lang/String;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getShareToken", "()Ljava/lang/String;", "setShareToken", "(Ljava/lang/String;)V", "destroy", "", "fetchCollaborates", "callback", "Lcom/larksuite/framework/callback/IRequestCallback;", "", "unlock", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.a */
public final class BitableShareMemberModel {

    /* renamed from: a */
    public static final Companion f25755a = new Companion(null);

    /* renamed from: b */
    private final C68289a f25756b = new C68289a();

    /* renamed from: c */
    private final String f25757c;

    /* renamed from: d */
    private String f25758d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo36764a() {
        this.f25756b.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.a$b */
    static final class C9594b<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ IRequestCallback f25759a;

        C9594b(IRequestCallback iRequestCallback) {
            this.f25759a = iRequestCallback;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            this.f25759a.onSuccess(shareUserInfoResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.a$c */
    static final class C9595c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ IRequestCallback f25760a;

        C9595c(IRequestCallback iRequestCallback) {
            this.f25760a = iRequestCallback;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f25760a.onError(th);
        }
    }

    /* renamed from: a */
    public final void mo36766a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f25758d = str;
    }

    /* renamed from: a */
    public void mo36765a(IRequestCallback<ShareUserInfoResult, Throwable> iRequestCallback) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iRequestCallback, "callback");
        if (this.f25758d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iRequestCallback.onSuccess(new ShareUserInfoResult());
            return;
        }
        this.f25756b.mo237937a(BitableSharePermissionManager.m41323a(this.f25757c, this.f25758d, "").mo238001b(new C9594b(iRequestCallback), new C9595c(iRequestCallback)));
    }

    public BitableShareMemberModel(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "shareToken");
        this.f25757c = str;
        this.f25758d = str2;
    }
}
