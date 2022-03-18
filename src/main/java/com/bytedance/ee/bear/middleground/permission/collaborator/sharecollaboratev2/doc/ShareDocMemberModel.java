package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.doc;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.IRequestCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J \u0010\u0010\u001a\u00020\u000b2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", ShareHitPoint.f121869d, "", "token", "", "(ILjava/lang/String;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "fetchCollaborates", "callback", "Lcom/larksuite/framework/callback/IRequestCallback;", "", "resolveUserInfo", "userInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "unlock", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.b */
public final class ShareDocMemberModel {

    /* renamed from: a */
    public static final Companion f25787a = new Companion(null);

    /* renamed from: b */
    private final C68289a f25788b = new C68289a();

    /* renamed from: c */
    private final int f25789c;

    /* renamed from: d */
    private final String f25790d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo36789a() {
        this.f25788b.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberModel$fetchCollaborates$disposable$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "onFailed", "", "throwable", "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.b$b */
    public static final class C9606b implements AbstractC5204e<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberModel f25791a;

        /* renamed from: b */
        final /* synthetic */ IRequestCallback f25792b;

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            this.f25792b.onError(th);
        }

        /* renamed from: a */
        public void mo20806a(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ShareDocMemberModel bVar = this.f25791a;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            bVar.mo36792a(userInfoList);
            this.f25792b.onSuccess(shareUserInfoResult);
        }

        C9606b(ShareDocMemberModel bVar, IRequestCallback iRequestCallback) {
            this.f25791a = bVar;
            this.f25792b = iRequestCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.b$c */
    static final class C9607c<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f25793a;

        C9607c(IGetDataCallback iGetDataCallback) {
            this.f25793a = iGetDataCallback;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f25793a.onSuccess(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.b$d */
    static final class C9608d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f25794a;

        C9608d(IGetDataCallback iGetDataCallback) {
            this.f25794a = iGetDataCallback;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("ShareDocMemberModel", th);
            this.f25794a.onError(new ErrorResult(th.getMessage()));
        }
    }

    /* renamed from: a */
    public void mo36791a(IRequestCallback<ShareUserInfoResult, Throwable> iRequestCallback) {
        Intrinsics.checkParameterIsNotNull(iRequestCallback, "callback");
        this.f25788b.mo237937a(DocPermissionManager.m41989a(this.f25789c, this.f25790d, "", new C9606b(this, iRequestCallback)));
    }

    /* renamed from: a */
    public void mo36790a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f25788b.mo237937a(DocPermissionManager.m41990a(this.f25789c, this.f25790d).mo238001b(new C9607c(iGetDataCallback), new C9608d(iGetDataCallback)));
    }

    /* renamed from: a */
    public final void mo36792a(ArrayList<UserInfo> arrayList) {
        if (arrayList.size() != 0) {
            Iterator<UserInfo> it = arrayList.iterator();
            Intrinsics.checkExpressionValueIsNotNull(it, "userInfos.iterator()");
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (TextUtils.isEmpty(next.getAvatarUrl()) && next.isUnknownType()) {
                    C13479a.m54775e("ShareDocMemberModel", "Unknown user:" + next.getOwnerType());
                    it.remove();
                }
            }
        }
    }

    public ShareDocMemberModel(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f25789c = i;
        this.f25790d = str;
    }
}
