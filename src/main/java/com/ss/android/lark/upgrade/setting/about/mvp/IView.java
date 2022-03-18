package com.ss.android.lark.upgrade.setting.about.mvp;

import android.app.Activity;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IView$Delegate;", "displayUpgradeView", "", "visible", "", "hideApplicationPermissionDesc", "hideLoading", "hideSecurityWhitePaper", "hideThirdPartySDKList", "initUpdateShow", "openUrl", "url", "", "showCheckVersionLoading", "showLoading", "showToast", "content", "showVersionName", "updateApplicationPermissionDescUrl", "updateSecurityWhitePaperUrl", "updateThirdPartySDKListUrl", "Delegate", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.b.d */
public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onClickBestPractice", "", "onClickCheckNewVersion", "onClickLogo", "onClickPrivacyPolicy", "onClickReleaseNotes", "onClickSpecialFunction", "onClickUserAgreement", "onShowUpgradeDialog", "activity", "Landroid/app/Activity;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.d$a */
    public interface Delegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo195809a();

        /* renamed from: a */
        void mo195810a(Activity activity);

        /* renamed from: b */
        void mo195813b();

        /* renamed from: c */
        void mo195814c();

        /* renamed from: d */
        void mo195815d();

        /* renamed from: e */
        void mo195816e();

        /* renamed from: f */
        void mo195817f();

        /* renamed from: g */
        void mo195818g();
    }

    /* renamed from: a */
    void mo195822a();

    /* renamed from: a */
    void mo195823a(String str);

    /* renamed from: a */
    void mo195824a(boolean z);

    /* renamed from: b */
    void mo195825b();

    /* renamed from: b */
    void mo195826b(String str);

    /* renamed from: c */
    void mo195827c();

    /* renamed from: c */
    void mo195828c(String str);

    /* renamed from: d */
    void mo195829d();

    /* renamed from: d */
    void mo195830d(String str);

    /* renamed from: e */
    void mo195831e();

    /* renamed from: e */
    void mo195832e(String str);

    /* renamed from: f */
    void mo195833f();

    /* renamed from: g */
    void mo195834g();

    /* renamed from: h */
    void mo195835h();
}
