package com.ss.android.lark.ug.dyflow.steps.welcome.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract;", "", "IWelcomeModel", "IWelcomeView", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.a */
public interface IWelcomeContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeModel;", "Lcom/larksuite/framework/mvp/IModel;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.a$a */
    public interface IWelcomeModel extends IModel {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView$IDelegate;", "IDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.a$b */
    public interface IWelcomeView extends IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "getWelcomeAddition", "", "getWelcomeDetail", "getWelcomeEmoji", "getWelcomeExplore", "getWelcomeSubTitle", "getWelcomeTitle", "onClickWelcomeAddition", "", "onClickWelcomeExplore", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo195111a();

            /* renamed from: b */
            void mo195112b();

            /* renamed from: c */
            String mo195113c();

            /* renamed from: d */
            String mo195114d();

            /* renamed from: e */
            String mo195115e();

            /* renamed from: f */
            String mo195116f();

            /* renamed from: g */
            String mo195117g();

            /* renamed from: h */
            String mo195118h();
        }
    }
}
