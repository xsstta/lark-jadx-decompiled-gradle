package com.ss.android.lark.setting.page.content.common.impl.font.chat;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IModel;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IModel;Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView;)V", "create", "", "createViewDelegate", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.c */
public final class ChatFontSettingPresenter extends BasePresenter<IChatFontSettingContract.IModel, IChatFontSettingContract.IView, IChatFontSettingContract.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f134134a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingPresenter$Companion;", "", "()V", "LOG_TAG", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingPresenter$createViewDelegate$1", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.c$c */
    public static final class C54178c implements IChatFontSettingContract.IView.Delegate {
        C54178c() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IChatFontSettingContract.IView.Delegate createViewDelegate() {
        return new C54178c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IChatFontSettingContract.IModel) getModel()).mo185446a(new C54177b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatter", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.c$b */
    public static final class C54177b implements IGetDataCallback<Chatter> {

        /* renamed from: a */
        final /* synthetic */ ChatFontSettingPresenter f134135a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54177b(ChatFontSettingPresenter cVar) {
            this.f134135a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("FontSettingPresenter", "get login chatter error");
            ((IChatFontSettingContract.IView) this.f134135a.getView()).mo185449a();
        }

        /* renamed from: a */
        public void onSuccess(Chatter chatter) {
            if (chatter == null) {
                Log.m165389i("FontSettingPresenter", "login chatter is null");
                ((IChatFontSettingContract.IView) this.f134135a.getView()).mo185449a();
                return;
            }
            ((IChatFontSettingContract.IView) this.f134135a.getView()).mo185451a(chatter);
        }
    }

    public ChatFontSettingPresenter(IChatFontSettingContract.IModel aVar, IChatFontSettingContract.IView bVar) {
        super(aVar, bVar);
    }
}
