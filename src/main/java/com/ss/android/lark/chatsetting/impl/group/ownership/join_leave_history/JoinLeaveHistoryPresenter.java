package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryView;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0013\u0014B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView$IDelegate;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "chatId", "", "isThread", "", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;ZLcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryView$ViewDependency;)V", "create", "", "createViewDelegate", "Companion", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.e */
public final class JoinLeaveHistoryPresenter extends BasePresenter<IJoinLeaveHistoryContract.IJoinLeaveHistoryModel, IJoinLeaveHistoryContract.IJoinLeaveHistoryView, IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate> {

    /* renamed from: a */
    public static final Companion f89713a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate createViewDelegate() {
        return new Delegate();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter$Delegate;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryView$IDelegate;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter;)V", "contentCanLoadMore", "", "onChatClick", "", "chatId", "", "onContentLoadMore", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.e$b */
    public final class Delegate implements IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate
        /* renamed from: a */
        public boolean mo128226a() {
            return ((IJoinLeaveHistoryContract.IJoinLeaveHistoryModel) JoinLeaveHistoryPresenter.this.getModel()).mo128217a();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate
        /* renamed from: b */
        public void mo128227b() {
            ((IJoinLeaveHistoryContract.IJoinLeaveHistoryModel) JoinLeaveHistoryPresenter.this.getModel()).mo128215a(new C34731b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter$Delegate$onContentLoadMore$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.e$b$b */
        public static final class C34731b implements IGetDataCallback<List<? extends JoinLeaveViewData>> {

            /* renamed from: a */
            final /* synthetic */ Delegate f89717a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34731b(Delegate bVar) {
                this.f89717a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(List<JoinLeaveViewData> list) {
                IJoinLeaveHistoryContract.IJoinLeaveHistoryView bVar = (IJoinLeaveHistoryContract.IJoinLeaveHistoryView) JoinLeaveHistoryPresenter.this.getView();
                if (list == null) {
                    list = new ArrayList();
                }
                bVar.mo128223b(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IJoinLeaveHistoryContract.IJoinLeaveHistoryView) JoinLeaveHistoryPresenter.this.getView()).mo128221b();
                Log.m165383e("JoinLeaveHistoryPresenter", errorResult.getDebugMsg());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter$Delegate$onChatClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.e$b$a */
        public static final class C34730a implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ Delegate f89715a;

            /* renamed from: b */
            final /* synthetic */ String f89716b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("JoinLeaveHistoryPresenter", errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat == null) {
                    Log.m165383e("JoinLeaveHistoryPresenter", "get chat is null");
                } else if (chat.getRole() == Chat.Role.VISITOR) {
                    ((IJoinLeaveHistoryContract.IJoinLeaveHistoryView) JoinLeaveHistoryPresenter.this.getView()).mo128219a(this.f89716b);
                } else {
                    ((IJoinLeaveHistoryContract.IJoinLeaveHistoryView) JoinLeaveHistoryPresenter.this.getView()).mo128222b(this.f89716b);
                }
            }

            C34730a(Delegate bVar, String str) {
                this.f89715a = bVar;
                this.f89716b = str;
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryView.IDelegate
        /* renamed from: a */
        public void mo128225a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            ((IJoinLeaveHistoryContract.IJoinLeaveHistoryModel) JoinLeaveHistoryPresenter.this.getModel()).mo128216a(str, new C34730a(this, str));
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IJoinLeaveHistoryContract.IJoinLeaveHistoryView) getView()).mo128218a();
        ((IJoinLeaveHistoryContract.IJoinLeaveHistoryModel) getModel()).mo128215a(new C34732c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.e$c */
    public static final class C34732c implements IGetDataCallback<List<? extends JoinLeaveViewData>> {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveHistoryPresenter f89718a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34732c(JoinLeaveHistoryPresenter eVar) {
            this.f89718a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(List<JoinLeaveViewData> list) {
            IJoinLeaveHistoryContract.IJoinLeaveHistoryView bVar = (IJoinLeaveHistoryContract.IJoinLeaveHistoryView) this.f89718a.getView();
            if (list == null) {
                list = new ArrayList();
            }
            bVar.mo128220a(list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IJoinLeaveHistoryContract.IJoinLeaveHistoryView) this.f89718a.getView()).mo128224c();
            Log.m165383e("JoinLeaveHistoryPresenter", errorResult.getDebugMsg());
        }
    }

    public JoinLeaveHistoryPresenter(Context context, View view, String str, boolean z, JoinLeaveHistoryView.ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        setView(new JoinLeaveHistoryView(context, view, aVar, z));
        setModel(new JoinLeaveHistoryModel(str));
        ((IJoinLeaveHistoryContract.IJoinLeaveHistoryView) getView()).setViewDelegate(createViewDelegate());
    }
}
