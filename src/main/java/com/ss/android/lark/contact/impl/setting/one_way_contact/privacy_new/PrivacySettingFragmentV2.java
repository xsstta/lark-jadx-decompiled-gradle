package com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.PrivacySettingViewV2;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingFragmentV2;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingPresenterV2;", "mRootView", "Landroid/view/View;", "mSourceFragment", "mViewDependency", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$ViewDependency;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onViewCreated", "view", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.b */
public final class PrivacySettingFragmentV2 extends BaseFragment {

    /* renamed from: a */
    public final PrivacySettingFragmentV2 f93168a = this;

    /* renamed from: b */
    private View f93169b;

    /* renamed from: c */
    private PrivacySettingPresenterV2 f93170c;

    /* renamed from: d */
    private final PrivacySettingViewV2.ViewDependency f93171d = new C36046a(this);

    /* renamed from: e */
    private HashMap f93172e;

    /* renamed from: a */
    public void mo132563a() {
        HashMap hashMap = this.f93172e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo132563a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        PrivacySettingPresenterV2 dVar = this.f93170c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.destroy();
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        PrivacySettingPresenterV2 dVar = this.f93170c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.mo132569b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingFragmentV2$mViewDependency$1", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$ViewDependency;", "finishPage", "", "startAddMeWayPage", "startBlockListPage", "startSingleChatPage", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.b$a */
    public static final class C36046a implements PrivacySettingViewV2.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingFragmentV2 f93173a;

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.PrivacySettingViewV2.ViewDependency
        /* renamed from: a */
        public void mo132564a() {
            C35883b.m140625a().mo132103a(this.f93173a.mContext, this.f93173a.f93168a, UpdateDialogStatusCode.SHOW);
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.PrivacySettingViewV2.ViewDependency
        /* renamed from: b */
        public void mo132565b() {
            C35883b.m140625a().mo132111b(this.f93173a.mContext, this.f93173a.f93168a, UpdateDialogStatusCode.SHOW);
        }

        @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.PrivacySettingViewV2.ViewDependency
        /* renamed from: c */
        public void mo132566c() {
            C35883b.m140625a().mo132112c(this.f93173a.mContext, this.f93173a.f93168a, UpdateDialogStatusCode.SHOW);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36046a(PrivacySettingFragmentV2 bVar) {
            this.f93173a = bVar;
        }
    }

    /* renamed from: b */
    private final void m141372b() {
        PrivacySettingModelV2 cVar = new PrivacySettingModelV2();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        View view = this.f93169b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        PrivacySettingPresenterV2 dVar = new PrivacySettingPresenterV2(cVar, new PrivacySettingViewV2(context, view, this.f93171d));
        this.f93170c = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m141372b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrivacySettingPresenterV2 dVar = this.f93170c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.mo132568a(i, i2);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        int i;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        if (DesktopUtil.m144301a(context)) {
            i = R.layout.activity_setting_privacy_new_desktop;
        } else {
            i = R.layout.activity_setting_privacy_new;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(if (Des…        container, false)");
        this.f93169b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }
}
