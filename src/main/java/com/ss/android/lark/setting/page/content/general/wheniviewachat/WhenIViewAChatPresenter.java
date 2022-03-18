package com.ss.android.lark.setting.page.content.general.wheniviewachat;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IModel;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IModel;Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView;)V", "viewDelegate", "create", "", "createViewDelegate", "WhenIViewAChatViewDelegate", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.c */
public final class WhenIViewAChatPresenter extends BasePresenter<IWhenIViewAChatContract.IModel, IWhenIViewAChatContract.IView, IWhenIViewAChatContract.IView.Delegate> {

    /* renamed from: a */
    private IWhenIViewAChatContract.IView.Delegate f134818a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IWhenIViewAChatContract.IView.Delegate createViewDelegate() {
        WhenIViewAChatViewDelegate aVar = new WhenIViewAChatViewDelegate();
        this.f134818a = aVar;
        if (aVar != null) {
            return aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatPresenter.WhenIViewAChatViewDelegate");
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IWhenIViewAChatContract.IView) getView()).mo186348a(((IWhenIViewAChatContract.IModel) getModel()).mo186355a());
        ((IWhenIViewAChatContract.IView) getView()).mo186347a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatPresenter$WhenIViewAChatViewDelegate;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView$Delegate;", "(Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatPresenter;)V", "onToggleMessagePosition", "", "messagePosition", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.c$a */
    public final class WhenIViewAChatViewDelegate implements IWhenIViewAChatContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public WhenIViewAChatViewDelegate() {
        }

        @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract.IView.Delegate
        /* renamed from: a */
        public void mo186357a(Chat.MessagePosition messagePosition) {
            Intrinsics.checkParameterIsNotNull(messagePosition, "messagePosition");
            ((IWhenIViewAChatContract.IModel) WhenIViewAChatPresenter.this.getModel()).mo186356a(messagePosition, new C54531a(this, messagePosition));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatPresenter$WhenIViewAChatViewDelegate$onToggleMessagePosition$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "messagePosition", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.c$a$a */
        public static final class C54531a implements IGetDataCallback<Chat.MessagePosition> {

            /* renamed from: a */
            final /* synthetic */ WhenIViewAChatViewDelegate f134820a;

            /* renamed from: b */
            final /* synthetic */ Chat.MessagePosition f134821b;

            /* renamed from: a */
            public void onSuccess(Chat.MessagePosition messagePosition) {
                Intrinsics.checkParameterIsNotNull(messagePosition, "messagePosition");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Chat.MessagePosition messagePosition;
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                IWhenIViewAChatContract.IView bVar = (IWhenIViewAChatContract.IView) WhenIViewAChatPresenter.this.getView();
                if (C54532d.f134822a[this.f134821b.ordinal()] != 1) {
                    messagePosition = Chat.MessagePosition.RECENT_LEFT;
                } else {
                    messagePosition = Chat.MessagePosition.NEWEST_UNREAD;
                }
                bVar.mo186348a(messagePosition);
                IWhenIViewAChatContract.IView bVar2 = (IWhenIViewAChatContract.IView) WhenIViewAChatPresenter.this.getView();
                String displayMsg = errorResult.getDisplayMsg();
                if (displayMsg == null) {
                    displayMsg = UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry);
                    Intrinsics.checkExpressionValueIsNotNull(displayMsg, "UIHelper.getString(R.str…Legacy_NetworkErrorRetry)");
                }
                bVar2.mo186350a(displayMsg);
            }

            C54531a(WhenIViewAChatViewDelegate aVar, Chat.MessagePosition messagePosition) {
                this.f134820a = aVar;
                this.f134821b = messagePosition;
            }
        }
    }

    public WhenIViewAChatPresenter(IWhenIViewAChatContract.IModel aVar, IWhenIViewAChatContract.IView bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        setModel(aVar);
        setView(bVar);
        ((IWhenIViewAChatContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
