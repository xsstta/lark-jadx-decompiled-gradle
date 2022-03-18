package com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract;", "", "IInviteGuideModel", "IInviteGuideView", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.a */
public interface IInviteGuideContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideModel;", "Lcom/larksuite/framework/mvp/IModel;", "authTrustedMail", "", "auth", "", "mailDomain", "", "hitFrom", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.a$a */
    public interface IInviteGuideModel extends IModel {
        /* renamed from: a */
        void mo195013a(boolean z, String str, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView$IDelegate;", "IDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.a$b */
    public interface IInviteGuideView extends IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "finish", "", "getHitFrom", "", "getInviteGuideAddBtnText", "getInviteGuideDetail", "getInviteGuideSkipBtnText", "getInviteGuideTitle", "getInviteGuideTrustedMail", "needShowTitleLeftBtn", "", "onAddBtnClick", "onItemChecked", "isChecked", "onSkipBtnClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo195014a(boolean z);

            /* renamed from: a */
            boolean mo195015a();

            /* renamed from: b */
            void mo195016b();

            /* renamed from: c */
            void mo195017c();

            /* renamed from: d */
            void mo195018d();

            /* renamed from: e */
            String mo195019e();

            /* renamed from: f */
            String mo195020f();

            /* renamed from: g */
            String mo195021g();

            /* renamed from: h */
            String mo195022h();

            /* renamed from: i */
            String mo195023i();

            /* renamed from: j */
            String mo195024j();
        }
    }
}
