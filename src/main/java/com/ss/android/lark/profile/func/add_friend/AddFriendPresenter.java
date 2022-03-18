package com.ss.android.lark.profile.func.add_friend;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.contact.entity.mobile.util.C35409a;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.dto.AddFriendPush;
import com.ss.android.lark.profile.func.add_friend.IAddFriendContract;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IModel;", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView;", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView$IDelegate;", "model", "view", "(Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IModel;Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView;)V", "create", "", "createViewDelegate", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.add_friend.c */
public final class AddFriendPresenter extends BasePresenter<IAddFriendContract.IModel, IAddFriendContract.IView, IAddFriendContract.IView.IDelegate> {

    /* renamed from: a */
    public static final Companion f129624a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendPresenter$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IAddFriendContract.IView.IDelegate createViewDelegate() {
        return new C52263b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IAddFriendContract.IView) getView()).mo179065a(((IAddFriendContract.IModel) getModel()).mo179055a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendPresenter$createViewDelegate$1", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView$IDelegate;", "onAddBtnClick", "", "context", "Landroid/content/Context;", "reason", "", "alias", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.c$b */
    public static final class C52263b implements IAddFriendContract.IView.IDelegate {

        /* renamed from: a */
        final /* synthetic */ AddFriendPresenter f129625a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52263b(AddFriendPresenter cVar) {
            this.f129625a = cVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/add_friend/AddFriendPresenter$createViewDelegate$1$onAddBtnClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.add_friend.c$b$a */
        public static final class C52264a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C52263b f129626a;

            /* renamed from: b */
            final /* synthetic */ String f129627b;

            /* renamed from: c */
            final /* synthetic */ String f129628c;

            /* renamed from: d */
            final /* synthetic */ Context f129629d;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo179063a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("AddFriendPresenter", errorResult.getDebugMsg());
                if (errorResult.getErrorCode() == UserAuthorityUtils.f129641a.mo179073a()) {
                    UserAuthorityUtils.f129641a.mo179074a(this.f129629d, errorResult);
                } else {
                    String displayMsg = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_FriendRequestSendFailedRetry));
                    Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(\n     …dRequestSendFailedRetry))");
                    ((IAddFriendContract.IView) this.f129626a.f129625a.getView()).mo179069b(displayMsg);
                }
                if (C35409a.m138445c()) {
                    InvApmUtils.m158962a("oneway_contact_list_add_friend_fail", (Map<String, ? extends Object>) null, errorResult);
                } else if (C35409a.m138446d()) {
                    InvApmUtils.m158962a("oneway_contact_new_add_friend_fail", (Map<String, ? extends Object>) null, errorResult);
                }
            }

            /* renamed from: a */
            public void mo179063a(boolean z) {
                ProfileHitPoint.m204733m();
                UserProfileHitPointV3.f130746c.mo180565a(this.f129627b, ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179059d(), ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179060e());
                ContactSource b = ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179057b();
                if (Intrinsics.areEqual("profile_add", b.getFromTag())) {
                    ProfileHitPoint.m204700a(b.getSourceType(), ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179058c(), ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179059d(), ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179060e());
                } else if (!TextUtils.isEmpty(b.getFromTag())) {
                    String fromTag = b.getFromTag();
                    Intrinsics.checkExpressionValueIsNotNull(fromTag, "source.fromTag");
                    ProfileHitPoint.m204712b(fromTag, ((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179058c());
                }
                ((IAddFriendContract.IView) this.f129626a.f129625a.getView()).mo179067a(this.f129628c);
                AddFriendPush.f129608a.mo178907a(((IAddFriendContract.IModel) this.f129626a.f129625a.getModel()).mo179055a().mo179072b());
            }

            C52264a(C52263b bVar, String str, String str2, Context context) {
                this.f129626a = bVar;
                this.f129627b = str;
                this.f129628c = str2;
                this.f129629d = context;
            }
        }

        @Override // com.ss.android.lark.profile.func.add_friend.IAddFriendContract.IView.IDelegate
        /* renamed from: a */
        public void mo179062a(Context context, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ProfileHitPoint.m204734n();
            ((IAddFriendContract.IModel) this.f129625a.getModel()).mo179056a(str, str2, new C52264a(this, str, str2, context));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddFriendPresenter(IAddFriendContract.IModel aVar, IAddFriendContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
    }
}
