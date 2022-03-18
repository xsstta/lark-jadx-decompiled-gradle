package com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse;

import android.content.Context;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract;", "", "ITeamUseModel", "ITeamUseView", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.a */
public interface ITeamUseContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseModel;", "Lcom/larksuite/framework/mvp/IModel;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.a$a */
    public interface ITeamUseModel extends IModel {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView$IDelegate;", "IDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.a$b */
    public interface ITeamUseView extends IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onJoinTeamClick", "", "context", "Landroid/content/Context;", "onUpgradeTeamClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo141509a();

            /* renamed from: a */
            void mo141510a(Context context);
        }
    }
}
