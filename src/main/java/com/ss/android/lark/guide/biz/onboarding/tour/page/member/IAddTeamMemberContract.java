package com.ss.android.lark.guide.biz.onboarding.tour.page.member;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract;", "", "IAddTeamMemberModel", "IAddTeamMemberView", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.d */
public interface IAddTeamMemberContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel;", "Lcom/larksuite/framework/mvp/IModel;", "authTrustedMail", "", "auth", "", "hitFrom", "", "getTrustedMail", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;", "TrustedMail", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.d$a */
    public interface IAddTeamMemberModel extends IModel {
        /* renamed from: a */
        void mo141455a(IGetDataCallback<TrustedMail> iGetDataCallback);

        /* renamed from: a */
        void mo141453a(boolean z, String str);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;", "", "()V", "mailDomain", "", "getMailDomain", "()Ljava/lang/String;", "setMailDomain", "(Ljava/lang/String;)V", "show", "", "getShow", "()Ljava/lang/Boolean;", "setShow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.d$a$a */
        public static final class TrustedMail {

            /* renamed from: a */
            private String f99276a;

            /* renamed from: b */
            private Boolean f99277b;

            /* renamed from: a */
            public final String mo141482a() {
                return this.f99276a;
            }

            /* renamed from: b */
            public final Boolean mo141485b() {
                return this.f99277b;
            }

            /* renamed from: a */
            public final void mo141483a(Boolean bool) {
                this.f99277b = bool;
            }

            /* renamed from: a */
            public final void mo141484a(String str) {
                this.f99276a = str;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView$IDelegate;", "setAuthCheckbox", "", "isChecked", "", "showTrustedMail", "show", "mailDomain", "", "IDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.d$b */
    public interface IAddTeamMemberView extends IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "attachToParent", "", "view", "Landroid/view/View;", "finish", "getHitFrom", "", "getTenantName", "needShowTitleLeftBtn", "", "onAddBtnClick", "onItemChecked", "isChecked", "onSkipBtnClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.d$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo141463a(View view);

            /* renamed from: a */
            void mo141464a(boolean z);

            /* renamed from: b */
            String mo141465b();

            /* renamed from: c */
            void mo141466c();

            /* renamed from: d */
            String mo141467d();

            /* renamed from: e */
            boolean mo141468e();

            /* renamed from: f */
            void mo141469f();

            /* renamed from: g */
            void mo141470g();
        }

        /* renamed from: a */
        void mo141475a(boolean z, String str);
    }
}
