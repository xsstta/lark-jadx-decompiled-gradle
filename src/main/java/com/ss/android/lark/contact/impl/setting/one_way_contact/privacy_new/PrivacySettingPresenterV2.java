package com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new;

import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u000b\u001a\u00020\tH\u0002J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingPresenterV2;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IModel;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IModel;Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView;)V", "create", "", "createViewDelegate", "getUserPhoneCheckSetting", "onActivityResult", "requestCode", "", "resultCode", "showBlockNumber", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.d */
public final class PrivacySettingPresenterV2 extends BasePresenter<IPrivacySettingContactV2.IModel, IPrivacySettingContactV2.IView, IPrivacySettingContactV2.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f93174a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingPresenterV2$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IPrivacySettingContactV2.IView.Delegate createViewDelegate() {
        return new C36047b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo132569b();
        m141380c();
    }

    /* renamed from: c */
    private final void m141380c() {
        ((IPrivacySettingContactV2.IView) getView()).mo132560a(((IPrivacySettingContactV2.IModel) getModel()).mo132557a());
    }

    /* renamed from: b */
    public final void mo132569b() {
        ((IPrivacySettingContactV2.IModel) getModel()).mo132555a(new C36049c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingPresenterV2$createViewDelegate$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView$Delegate;", "updateUserPhoneCheckSetting", "", "isChecked", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.d$b */
    public static final class C36047b implements IPrivacySettingContactV2.IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingPresenterV2 f93175a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36047b(PrivacySettingPresenterV2 dVar) {
            this.f93175a = dVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingPresenterV2$createViewDelegate$1$updateUserPhoneCheckSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.d$b$a */
        public static final class C36048a implements IGetDataCallback<UniversalUserSetting> {

            /* renamed from: a */
            final /* synthetic */ C36047b f93176a;

            /* renamed from: b */
            final /* synthetic */ boolean f93177b;

            /* renamed from: a */
            public void onSuccess(UniversalUserSetting universalUserSetting) {
                ((IPrivacySettingContactV2.IView) this.f93176a.f93175a.getView()).mo132560a(this.f93177b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("PrivacySettingV2", "update user phone check notification setting fail: " + errorResult.getMessage());
                ((IPrivacySettingContactV2.IView) this.f93176a.f93175a.getView()).mo132561b();
            }

            C36048a(C36047b bVar, boolean z) {
                this.f93176a = bVar;
                this.f93177b = z;
            }
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IView.Delegate
        /* renamed from: a */
        public void mo132562a(boolean z) {
            ((IPrivacySettingContactV2.IModel) this.f93175a.getModel()).mo132556a(z, new C36048a(this, z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingPresenterV2$showBlockNumber$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "number", "(Ljava/lang/Integer;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.d$c */
    public static final class C36049c implements IGetDataCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingPresenterV2 f93178a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36049c(PrivacySettingPresenterV2 dVar) {
            this.f93178a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(Integer num) {
            if (num != null) {
                ((IPrivacySettingContactV2.IView) this.f93178a.getView()).mo132559a(num.intValue());
                return;
            }
            Log.m165383e("PrivacySettingV2", "Succeed to get blocked contact but null");
            ((IPrivacySettingContactV2.IView) this.f93178a.getView()).mo132558a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("PrivacySettingV2", "Failed to get blocked contact: " + errorResult.getMessage());
            ((IPrivacySettingContactV2.IView) this.f93178a.getView()).mo132558a();
        }
    }

    public PrivacySettingPresenterV2(IPrivacySettingContactV2.IModel aVar, IPrivacySettingContactV2.IView bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public final void mo132568a(int i, int i2) {
        if (i == 10002 && i2 == -1) {
            mo132569b();
        }
    }
}
