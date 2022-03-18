package com.ss.android.lark.chatsetting.impl.group.ownership.group_search;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnablePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView$Delegate;", "context", "Landroid/content/Context;", "dependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;", "chatId", "", "isThread", "", "(Landroid/content/Context;Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "getDependency", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;", "()Z", "create", "", "createViewDelegate", "initData", "onBackPressed", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.b */
public final class GroupSearchEnablePresenter extends BasePresenter<IGroupSearchEnableContract.IModel, IGroupSearchEnableContract.IView, IGroupSearchEnableContract.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f89647a = new Companion(null);

    /* renamed from: b */
    private final Context f89648b;

    /* renamed from: c */
    private final GroupSearchEnableView.IViewDependency f89649c;

    /* renamed from: d */
    private final String f89650d;

    /* renamed from: e */
    private final boolean f89651e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnablePresenter$Companion;", "", "()V", "LOG_TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final Context mo128189d() {
        return this.f89648b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IGroupSearchEnableContract.IView.Delegate createViewDelegate() {
        return new C34717b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo128186a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnablePresenter$createViewDelegate$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView$Delegate;", "getCurChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isInfoComplete", "", "isPublic", "onAvatarLayoutClicked", "", "onSaveSetting", "isChecked", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.b$b */
    public static final class C34717b implements IGroupSearchEnableContract.IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnablePresenter f89652a;

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView.Delegate
        /* renamed from: b */
        public boolean mo128192b() {
            return ((IGroupSearchEnableContract.IModel) this.f89652a.getModel()).mo128184b();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView.Delegate
        /* renamed from: d */
        public Chat mo128194d() {
            return ((IGroupSearchEnableContract.IModel) this.f89652a.getModel()).mo128180a();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView.Delegate
        /* renamed from: c */
        public boolean mo128193c() {
            Chat a = ((IGroupSearchEnableContract.IModel) this.f89652a.getModel()).mo128180a();
            if (a != null) {
                return a.isPublic();
            }
            return false;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView.Delegate
        /* renamed from: a */
        public void mo128190a() {
            boolean z;
            if (NetworkUtils.m153070c(this.f89652a.mo128189d())) {
                ArrayList arrayList = new ArrayList();
                Chat a = ((IGroupSearchEnableContract.IModel) this.f89652a.getModel()).mo128180a();
                if (a != null) {
                    String avatarKey = a.getAvatarKey();
                    if (avatarKey == null || avatarKey.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        String avatarKey2 = a.getAvatarKey();
                        Intrinsics.checkExpressionValueIsNotNull(avatarKey2, "currentChat.getAvatarKey()");
                        arrayList.add(avatarKey2);
                    } else {
                        arrayList.add(((IGroupSearchEnableContract.IModel) this.f89652a.getModel()).mo128181a(this.f89652a.mo128189d()));
                    }
                    ((IGroupSearchEnableContract.IView) this.f89652a.getView()).mo128166a(a, arrayList);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34717b(GroupSearchEnablePresenter bVar) {
            this.f89652a = bVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IView.Delegate
        /* renamed from: a */
        public void mo128191a(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            ((IGroupSearchEnableContract.IModel) this.f89652a.getModel()).mo128183a(z, new UIGetDataCallback(iGetDataCallback));
        }
    }

    /* renamed from: c */
    public final void mo128188c() {
        ((IGroupSearchEnableContract.IView) getView()).mo128171c();
    }

    /* renamed from: a */
    public final void mo128186a() {
        ((IGroupSearchEnableContract.IModel) getModel()).mo128182a(new UIGetDataCallback(new C34718c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnablePresenter$initData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.b$c */
    public static final class C34718c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnablePresenter f89653a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34718c(GroupSearchEnablePresenter bVar) {
            this.f89653a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            ((IGroupSearchEnableContract.IView) this.f89653a.getView()).mo128165a(chat);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("GroupSearchEnablePresenter", errorResult.getDisplayMsg());
        }
    }

    public GroupSearchEnablePresenter(Context context, GroupSearchEnableView.IViewDependency bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89648b = context;
        this.f89649c = bVar;
        this.f89650d = str;
        this.f89651e = z;
        GroupSearchEnableModel aVar = new GroupSearchEnableModel(str);
        GroupSearchEnableView groupSearchEnableView = new GroupSearchEnableView(context, bVar, str, z);
        groupSearchEnableView.setViewDelegate(createViewDelegate());
        setModel(aVar);
        setView(groupSearchEnableView);
    }
}
