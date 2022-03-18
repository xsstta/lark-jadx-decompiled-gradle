package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0013\u0014B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0014J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView$Delegate;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "mChatId", "", "isThread", "", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;ZLcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$ViewDependency;)V", "createViewDelegate", "loadInitData", "", "Companion", "ViewDelegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k */
public final class SharingHistoryPresenter extends BasePresenter<ISharingHistoryContract.IModel, ISharingHistoryContract.IView, ISharingHistoryContract.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f89906a = new Companion(null);

    /* renamed from: b */
    private final Context f89907b;

    /* renamed from: c */
    private final View f89908c;

    /* renamed from: d */
    private final String f89909d;

    /* renamed from: e */
    private final boolean f89910e;

    /* renamed from: f */
    private final SharingHistoryView.ViewDependency f89911f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ISharingHistoryContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$ViewDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IView$Delegate;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter;)V", "canLoadMore", "", "onChatClick", "", "chatId", "", "onChatterClick", BottomDialog.f17198f, "onConfirmClick", "selectedIds", "", "onLoadMore", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$b */
    public final class ViewDelegate implements ISharingHistoryContract.IView.Delegate {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView.Delegate
        /* renamed from: a */
        public boolean mo128446a() {
            return ((ISharingHistoryContract.IModel) SharingHistoryPresenter.this.getModel()).mo128429a();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView.Delegate
        /* renamed from: b */
        public void mo128447b() {
            ((ISharingHistoryContract.IModel) SharingHistoryPresenter.this.getModel()).mo128430b(new C34807d(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$ViewDelegate$onConfirmClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$b$c */
        public static final class C34806c implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89917a;

            /* renamed from: b */
            final /* synthetic */ List f89918b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("SharingHistoryPresenter", "deactivateSharing Success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ISharingHistoryContract.IView bVar = (ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView();
                ArrayList arrayList = this.f89918b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                bVar.mo128440c(arrayList);
                Log.m165386e("SharingHistoryPresenter", errorResult);
            }

            C34806c(ViewDelegate bVar, List list) {
                this.f89917a = bVar;
                this.f89918b = list;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$ViewDelegate$onLoadMore$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$b$d */
        public static final class C34807d implements IGetDataCallback<List<? extends SharingHistoryViewData>> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89919a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34807d(ViewDelegate bVar) {
                this.f89919a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(List<SharingHistoryViewData> list) {
                ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128435b();
                ISharingHistoryContract.IView bVar = (ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView();
                if (list == null) {
                    list = new ArrayList();
                }
                bVar.mo128437b(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128435b();
                String displayMsg = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_LoadingFailed));
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(\n     …rk_Legacy_LoadingFailed))");
                ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128443e(displayMsg);
                Log.m165386e("SharingHistoryPresenter", errorResult);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$ViewDelegate$onChatClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$b$a */
        public static final class C34804a implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89913a;

            /* renamed from: b */
            final /* synthetic */ String f89914b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165386e("SharingHistoryPresenter", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat == null) {
                    Log.m165383e("SharingHistoryPresenter", "get chat is null");
                } else if (chat.getRole() == Chat.Role.MEMBER || chat.getRole() == Chat.Role.THREAD_FOLLOWER) {
                    ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128436b(this.f89914b);
                } else {
                    ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128433a(this.f89914b);
                }
            }

            C34804a(ViewDelegate bVar, String str) {
                this.f89913a = bVar;
                this.f89914b = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$ViewDelegate$onChatterClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$b$b */
        public static final class C34805b implements IGetDataCallback<Chatter> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89915a;

            /* renamed from: b */
            final /* synthetic */ String f89916b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165386e("SharingHistoryPresenter", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                if (chatter == null) {
                    Log.m165383e("SharingHistoryPresenter", "get chatter is null");
                } else if (chatter.isBot()) {
                    ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128442d(this.f89916b);
                } else {
                    ((ISharingHistoryContract.IView) SharingHistoryPresenter.this.getView()).mo128439c(this.f89916b);
                }
            }

            C34805b(ViewDelegate bVar, String str) {
                this.f89915a = bVar;
                this.f89916b = str;
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView.Delegate
        /* renamed from: a */
        public void mo128444a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            ((ISharingHistoryContract.IModel) SharingHistoryPresenter.this.getModel()).mo128431b(str, new C34804a(this, str));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView.Delegate
        /* renamed from: a */
        public void mo128445a(List<String> list) {
            ((ISharingHistoryContract.IModel) SharingHistoryPresenter.this.getModel()).mo128428a(list, new C34806c(this, list));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IView.Delegate
        /* renamed from: b */
        public void mo128448b(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            ((ISharingHistoryContract.IModel) SharingHistoryPresenter.this.getModel()).mo128427a(str, new C34805b(this, str));
        }
    }

    /* renamed from: b */
    public final void mo128489b() {
        ((ISharingHistoryContract.IView) getView()).mo128438c();
        ((ISharingHistoryContract.IModel) getModel()).mo128426a(new C34808c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter$loadInitData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.k$c */
    public static final class C34808c implements IGetDataCallback<List<? extends SharingHistoryViewData>> {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryPresenter f89920a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34808c(SharingHistoryPresenter kVar) {
            this.f89920a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(List<SharingHistoryViewData> list) {
            ((ISharingHistoryContract.IView) this.f89920a.getView()).mo128434a(list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ISharingHistoryContract.IView) this.f89920a.getView()).mo128441d();
            ((ISharingHistoryContract.IView) this.f89920a.getView()).mo128432a();
            Log.m165386e("SharingHistoryPresenter", errorResult);
        }
    }

    public SharingHistoryPresenter(Context context, View view, String str, boolean z, SharingHistoryView.ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f89907b = context;
        this.f89908c = view;
        this.f89909d = str;
        this.f89910e = z;
        this.f89911f = aVar;
        setModel(new SharingHistoryModel(str));
        setView(new SharingHistoryView(context, view, z, aVar));
        ((ISharingHistoryContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
