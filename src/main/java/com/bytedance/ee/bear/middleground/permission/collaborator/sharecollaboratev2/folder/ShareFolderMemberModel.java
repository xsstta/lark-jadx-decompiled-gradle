package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.folder;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9706c;
import com.bytedance.ee.bear.middleground.permission.p486f.C9920g;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManager;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.IRequestCallback;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u001c\u0010\u0011\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J4\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "token", "", "spaceId", "(Lcom/bytedance/ee/bear/list/dto/FolderVersion;Ljava/lang/String;Ljava/lang/String;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "fetchCollaborates", "callback", "Lcom/larksuite/framework/callback/IRequestCallback;", "", "fetchFolderCollaborate", "fetchShareFolderCollaborate", "unlock", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.b */
public final class ShareFolderMemberModel {

    /* renamed from: a */
    public static final Companion f25828a = new Companion(null);

    /* renamed from: b */
    private final C68289a f25829b = new C68289a();

    /* renamed from: c */
    private final FolderVersion f25830c;

    /* renamed from: d */
    private final String f25831d;

    /* renamed from: e */
    private final String f25832e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo36813a() {
        this.f25829b.dispose();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.b$b */
    public static final class C9621b<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ IRequestCallback f25833a;

        C9621b(IRequestCallback iRequestCallback) {
            this.f25833a = iRequestCallback;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            this.f25833a.onSuccess(shareUserInfoResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.b$d */
    static final class C9623d<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f25835a;

        C9623d(IGetDataCallback iGetDataCallback) {
            this.f25835a = iGetDataCallback;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f25835a.onSuccess(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.b$c */
    public static final class C9622c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ IRequestCallback f25834a;

        C9622c(IRequestCallback iRequestCallback) {
            this.f25834a = iRequestCallback;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("ShareFolderMemberModel", th);
            this.f25834a.onError(new ErrorResult("fetchShareFolderCollaborate()...Error"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.b$e */
    static final class C9624e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f25836a;

        C9624e(IGetDataCallback iGetDataCallback) {
            this.f25836a = iGetDataCallback;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("ShareFolderMemberModel", th);
            this.f25836a.onError(new ErrorResult(th.getMessage()));
        }
    }

    /* renamed from: b */
    private final void m39812b(IRequestCallback<ShareUserInfoResult, Throwable> iRequestCallback) {
        UserInfo a = C9706c.m40177a();
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        if (a != null) {
            arrayList.add(a);
        }
        ShareUserInfoResult shareUserInfoResult = new ShareUserInfoResult();
        shareUserInfoResult.setTotalNum(1);
        shareUserInfoResult.setUserInfoList(arrayList);
        shareUserInfoResult.setHasMore(false);
        iRequestCallback.onSuccess(shareUserInfoResult);
    }

    /* renamed from: a */
    public void mo36814a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f25829b.mo237937a(FolderPermissionManager.f26813a.mo37743c(this.f25831d).mo238001b(new C9623d(iGetDataCallback), new C9624e(iGetDataCallback)));
    }

    /* renamed from: a */
    public void mo36815a(IRequestCallback<ShareUserInfoResult, Throwable> iRequestCallback) {
        Intrinsics.checkParameterIsNotNull(iRequestCallback, "callback");
        if (!this.f25830c.isFolderV1()) {
            m39811a(this.f25832e, this.f25831d, iRequestCallback, this.f25830c);
        } else if (TextUtils.isEmpty(this.f25832e)) {
            m39812b(iRequestCallback);
        } else {
            m39811a(this.f25832e, this.f25831d, iRequestCallback, this.f25830c);
        }
    }

    public ShareFolderMemberModel(FolderVersion folderVersion, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "spaceId");
        this.f25830c = folderVersion;
        this.f25831d = str;
        this.f25832e = str2;
    }

    /* renamed from: a */
    private final void m39811a(String str, String str2, IRequestCallback<ShareUserInfoResult, Throwable> iRequestCallback, FolderVersion folderVersion) {
        this.f25829b.mo237937a(new C9920g().mo37755a(str, str2, folderVersion, "").mo238001b(new C9621b(iRequestCallback), new C9622c(iRequestCallback)));
    }
}
