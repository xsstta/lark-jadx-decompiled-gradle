package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.BlockListInfo;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\tH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IModel;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IModel;Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView;)V", "create", "", "createViewDelegate", "onActivityResult", "requestCode", "", "resultCode", "showData", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.c */
public final class PrivacyBlockListPresenter extends BasePresenter<IPrivacyBlockListContract.IModel, IPrivacyBlockListContract.IView, IPrivacyBlockListContract.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f93129a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListPresenter$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListPresenter$createViewDelegate$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;", "isHasMore", "", "onItemDelete", "", "userId", "", "onReloadData", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.c$b */
    public static final class C36030b implements IPrivacyBlockListContract.IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListPresenter f93130a;

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView.Delegate
        /* renamed from: a */
        public void mo132481a() {
            this.f93130a.mo132503a();
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView.Delegate
        /* renamed from: b */
        public boolean mo132483b() {
            return ((IPrivacyBlockListContract.IModel) this.f93130a.getModel()).mo132474b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36030b(PrivacyBlockListPresenter cVar) {
            this.f93130a = cVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListPresenter$createViewDelegate$1$onItemDelete$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "boolean", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.c$b$a */
        public static final class C36031a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C36030b f93131a;

            /* renamed from: b */
            final /* synthetic */ String f93132b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo132506a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo132506a(boolean z) {
                ((IPrivacyBlockListContract.IView) this.f93131a.f93130a.getView()).mo132476a(this.f93132b);
                ((IPrivacyBlockListContract.IView) this.f93131a.f93130a.getView()).mo132478a(true);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IPrivacyBlockListContract.IView) this.f93131a.f93130a.getView()).mo132478a(false);
                Log.m165383e("PrivacyContactList", "delete user fail: " + errorResult.getMessage());
            }

            C36031a(C36030b bVar, String str) {
                this.f93131a = bVar;
                this.f93132b = str;
            }
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IView.Delegate
        /* renamed from: a */
        public void mo132482a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            ((IPrivacyBlockListContract.IModel) this.f93130a.getModel()).mo132473a(str, false, new C36031a(this, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IPrivacyBlockListContract.IView.Delegate createViewDelegate() {
        return new C36030b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo132503a();
    }

    /* renamed from: a */
    public final void mo132503a() {
        ((IPrivacyBlockListContract.IModel) getModel()).mo132471a(((IPrivacyBlockListContract.IModel) getModel()).mo132470a(), new C36032c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListPresenter$showData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/BlockListInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockListInfo", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.c$c */
    public static final class C36032c implements IGetDataCallback<BlockListInfo> {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListPresenter f93133a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36032c(PrivacyBlockListPresenter cVar) {
            this.f93133a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IPrivacyBlockListContract.IView) this.f93133a.getView()).mo132475a();
        }

        /* renamed from: a */
        public void onSuccess(BlockListInfo aVar) {
            if (aVar == null) {
                ((IPrivacyBlockListContract.IView) this.f93133a.getView()).mo132479b();
            } else if (aVar.mo132528c() == null || aVar.mo132527b() == null || aVar.mo132526a() == null) {
                ((IPrivacyBlockListContract.IView) this.f93133a.getView()).mo132475a();
            } else {
                ((IPrivacyBlockListContract.IModel) this.f93133a.getModel()).mo132472a(aVar.mo132527b(), aVar.mo132528c().booleanValue());
                ((IPrivacyBlockListContract.IView) this.f93133a.getView()).mo132477a(aVar.mo132526a());
            }
        }
    }

    public PrivacyBlockListPresenter(IPrivacyBlockListContract.IModel aVar, IPrivacyBlockListContract.IView bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public final void mo132504a(int i, int i2) {
        if (i2 == -1 && i == 10001) {
            ((IPrivacyBlockListContract.IView) getView()).mo132480c();
            ((IPrivacyBlockListContract.IModel) getModel()).mo132472a("0", true);
            mo132503a();
        }
    }
}
