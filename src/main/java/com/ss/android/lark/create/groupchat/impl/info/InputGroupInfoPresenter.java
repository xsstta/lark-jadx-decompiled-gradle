package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract;
import com.ss.android.lark.create.groupchat.impl.statistics.PublicGroupHitPoint;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0011\u0012B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\u00060\u000fR\u00020\u0000H\u0014J\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IModel;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView$Delegate;", "model", "view", "startEditTime", "", "(Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IModel;Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView;J)V", "createGroup", "", "context", "Landroid/content/Context;", "createViewDelegate", "Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter$Delegate;", "initView", "Companion", "Delegate", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.info.e */
public final class InputGroupInfoPresenter extends BasePresenter<IInputGroupInfoContract.IModel, IInputGroupInfoContract.IView, IInputGroupInfoContract.IView.Delegate> {

    /* renamed from: d */
    public static final Companion f93711d = new Companion(null);

    /* renamed from: a */
    public final IInputGroupInfoContract.IModel f93712a;

    /* renamed from: b */
    public final IInputGroupInfoContract.IView f93713b;

    /* renamed from: c */
    public final long f93714c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter$Companion;", "", "()V", "ERROR_CODE_NAME_SINGLE_LETTER", "", "ERROR_CODE_NOT_IN_SAME_TENANT", "ERROR_CODE_PUBLIC_CHAT_NAMED_EXISTED", "TAG", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Delegate createViewDelegate() {
        return new Delegate();
    }

    /* renamed from: a */
    public final void mo133994a() {
        this.f93713b.mo133985a(this.f93712a.mo133980a().getName(), this.f93712a.mo133980a().getDescription());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter$Delegate;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView$Delegate;", "(Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter;)V", "onCreateGroupBtnClicked", "", "context", "Landroid/content/Context;", "name", "", "desc", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.e$b */
    public final class Delegate implements IInputGroupInfoContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter$Delegate$onCreateGroupBtnClicked$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "p0", "(Ljava/lang/Boolean;)V", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.info.e$b$a */
        public static final class C36315a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ Delegate f93716a;

            /* renamed from: b */
            final /* synthetic */ String f93717b;

            /* renamed from: c */
            final /* synthetic */ String f93718c;

            /* renamed from: d */
            final /* synthetic */ Context f93719d;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String displayMsg = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Group_CreateGroup_TypePublic_SetName_NameTaken));
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(UIHelp…ublic_SetName_NameTaken))");
                ((IInputGroupInfoContract.IView) InputGroupInfoPresenter.this.getView()).mo133984a(displayMsg);
                ((IInputGroupInfoContract.IView) InputGroupInfoPresenter.this.getView()).mo133986a(true);
                PublicGroupHitPoint.f93891a.mo134222a();
                Log.m165386e("InputGroupInfoPresenter", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    IInputGroupInfoContract.IView bVar = InputGroupInfoPresenter.this.f93713b;
                    String string = UIHelper.getString(R.string.Lark_Group_CreateGroup_TypePublic_SetName_NameTaken);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Public_SetName_NameTaken)");
                    bVar.mo133984a(string);
                    InputGroupInfoPresenter.this.f93713b.mo133986a(true);
                    return;
                }
                InputGroupInfoPresenter.this.f93712a.mo133980a().setDescription(this.f93717b);
                InputGroupInfoPresenter.this.f93712a.mo133980a().setName(this.f93718c);
                InputGroupInfoPresenter.this.mo133995a(this.f93719d);
            }

            C36315a(Delegate bVar, String str, String str2, Context context) {
                this.f93716a = bVar;
                this.f93717b = str;
                this.f93718c = str2;
                this.f93719d = context;
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IView.Delegate
        /* renamed from: a */
        public void mo133987a(Context context, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "name");
            Intrinsics.checkParameterIsNotNull(str2, "desc");
            long currentTimeMillis = (System.currentTimeMillis() - InputGroupInfoPresenter.this.f93714c) / ((long) 1000);
            if (currentTimeMillis > 0) {
                AbstractC36248c dependency = CreateGroupChatModule.getDependency();
                Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
                dependency.getChatDependency().mo133735c(String.valueOf(currentTimeMillis));
            }
            InputGroupInfoPresenter.this.f93712a.mo133982a(str, new C36315a(this, str2, str, context));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter$createGroup$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.e$c */
    public static final class C36316c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoPresenter f93720a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36316c(InputGroupInfoPresenter eVar) {
            this.f93720a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            this.f93720a.f93713b.mo133983a(chat);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f93720a.f93713b.mo133986a(true);
        }
    }

    /* renamed from: a */
    public final void mo133995a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f93712a.mo133981a(context, new C36316c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputGroupInfoPresenter(IInputGroupInfoContract.IModel aVar, IInputGroupInfoContract.IView bVar, long j) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f93712a = aVar;
        this.f93713b = bVar;
        this.f93714c = j;
    }
}
