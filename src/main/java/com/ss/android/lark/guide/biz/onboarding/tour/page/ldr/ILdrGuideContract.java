package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract;", "", "Companion", "ILdrModel", "ILdrView", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.a */
public interface ILdrGuideContract {

    /* renamed from: a */
    public static final Companion f99192a = Companion.f99193a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrModel;", "Lcom/larksuite/framework/mvp/IModel;", "loadLdrData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "reportEvent", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.a$b */
    public interface ILdrModel extends IModel {
        /* renamed from: a */
        void mo141400a(IGetDataCallback<List<LdrServiceData>> iGetDataCallback);

        /* renamed from: a */
        void mo141401a(List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bJ\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView$IViewDelegate;", "updateLdrData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "IViewDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.a$c */
    public interface ILdrView extends IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBackClick", "", "onButtonClick", "eventKeyList", "", "", "onDoneClick", "openLdrLink", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.a$c$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo141403a();

            /* renamed from: a */
            void mo141404a(List<String> list);

            /* renamed from: b */
            void mo141405b();
        }

        /* renamed from: a */
        void mo141402a(List<LdrServiceData> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.a$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f99193a = new Companion();

        private Companion() {
        }
    }
}
