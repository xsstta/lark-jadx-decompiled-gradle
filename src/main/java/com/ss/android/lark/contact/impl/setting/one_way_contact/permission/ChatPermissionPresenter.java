package com.ss.android.lark.contact.impl.setting.one_way_contact.permission;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IModel;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IModel;Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView;)V", "create", "", "createViewDelegate", "initData", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.c */
public final class ChatPermissionPresenter extends BasePresenter<IChatPermissionContract.IModel, IChatPermissionContract.IView, IChatPermissionContract.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f93153a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionPresenter$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IChatPermissionContract.IView.Delegate createViewDelegate() {
        return new C36039b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m141331b();
    }

    /* renamed from: b */
    private final void m141331b() {
        ((IChatPermissionContract.IModel) getModel()).mo132539a(new C36041c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionPresenter$createViewDelegate$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;", "onCoordinationSelect", "", "coordinationType", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.c$b */
    public static final class C36039b implements IChatPermissionContract.IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionPresenter f93154a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36039b(ChatPermissionPresenter cVar) {
            this.f93154a = cVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionPresenter$createViewDelegate$1$onCoordinationSelect$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "boolean", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.c$b$a */
        public static final class C36040a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C36039b f93155a;

            /* renamed from: b */
            final /* synthetic */ int f93156b;

            /* renamed from: a */
            public void mo132542a(boolean z) {
                ((IChatPermissionContract.IView) this.f93155a.f93154a.getView()).mo132545a(this.f93156b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo132542a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ChatPermissionPresenter", "set coordination auth fail: " + errorResult.getMessage());
                ((IChatPermissionContract.IView) this.f93155a.f93154a.getView()).mo132547b();
            }

            C36040a(C36039b bVar, int i) {
                this.f93155a = bVar;
                this.f93156b = i;
            }
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract.IView.Delegate
        /* renamed from: a */
        public void mo132541a(int i) {
            ((IChatPermissionContract.IModel) this.f93154a.getModel()).mo132538a(i, new C36040a(this, i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionPresenter$initData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "coordinationType", "(Ljava/lang/Integer;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.c$c */
    public static final class C36041c implements IGetDataCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionPresenter f93157a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36041c(ChatPermissionPresenter cVar) {
            this.f93157a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(Integer num) {
            if (num != null) {
                ((IChatPermissionContract.IView) this.f93157a.getView()).mo132545a(num.intValue());
                return;
            }
            Log.m165383e("ChatPermissionPresenter", "get coordination auth success but null");
            ((IChatPermissionContract.IView) this.f93157a.getView()).mo132545a(0);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatPermissionPresenter", "get coordination auth fail: " + errorResult.getMessage());
            ((IChatPermissionContract.IView) this.f93157a.getView()).mo132545a(0);
        }
    }

    public ChatPermissionPresenter(IChatPermissionContract.IModel aVar, IChatPermissionContract.IView bVar) {
        super(aVar, bVar);
    }
}
