package com.ss.android.lark.chatsetting.impl.group.ownership.mail;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.ownership.mail.GroupMailSettingView;
import com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0014¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView$Delegate;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;", "chatId", "", "ownerId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "isThread", "", "mailEnable", "(Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;ZZ)V", "create", "", "createViewDelegate", "ViewDelegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.c */
public final class GroupMailSettingPresenter extends BasePresenter<IGroupMailSettingContract.IModel, IGroupMailSettingContract.IView, IGroupMailSettingContract.IView.Delegate> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IGroupMailSettingContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingPresenter$ViewDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IView$Delegate;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingPresenter;)V", "confirm", "", "getChatId", "", "getIsThread", "", "onSetGroupMailSendType", "enable", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.c$a */
    public final class ViewDelegate implements IGroupMailSettingContract.IView.Delegate {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IView.Delegate
        /* renamed from: a */
        public boolean mo128283a() {
            return ((IGroupMailSettingContract.IModel) GroupMailSettingPresenter.this.getModel()).mo128279b();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IView.Delegate
        /* renamed from: b */
        public void mo128284b() {
            ((IGroupMailSettingContract.IModel) GroupMailSettingPresenter.this.getModel()).mo128277a(new C34739a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingPresenter$ViewDelegate$confirm$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.c$a$a */
        public static final class C34739a extends UIGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89748a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34739a(ViewDelegate aVar) {
                this.f89748a = aVar;
            }

            /* renamed from: a */
            public void onSuccessed(Chat chat) {
                super.onSuccessed(chat);
                ((IGroupMailSettingContract.IView) GroupMailSettingPresenter.this.getView()).mo128286a();
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                super.onErrored(errorResult);
                ((IGroupMailSettingContract.IView) GroupMailSettingPresenter.this.getView()).mo128287a(errorResult);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IView.Delegate
        /* renamed from: a */
        public void mo128282a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
            Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, ShareHitPoint.f121869d);
            ((IGroupMailSettingContract.IModel) GroupMailSettingPresenter.this.getModel()).mo128278a(z, groupMailSendPermissionType);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IGroupMailSettingContract.IView) getView()).mo128288a(((IGroupMailSettingContract.IModel) getModel()).mo128276a());
    }

    public GroupMailSettingPresenter(View view, GroupMailSettingView.ViewDependency bVar, String str, String str2, Chat.GroupMailSendPermissionType groupMailSendPermissionType, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "ownerId");
        Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, ShareHitPoint.f121869d);
        GroupMailSettingModel bVar2 = new GroupMailSettingModel(str, str2, groupMailSendPermissionType, z, z2);
        GroupMailSettingView dVar = new GroupMailSettingView(view, bVar);
        setModel(bVar2);
        setView(dVar);
        dVar.setViewDelegate(createViewDelegate());
    }
}
