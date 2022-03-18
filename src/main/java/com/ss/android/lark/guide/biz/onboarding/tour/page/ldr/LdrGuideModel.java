package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.C25970d;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.guide.biz.onboarding.tour.p1926a.C38600b;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrModel;", "()V", "loadLdrData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "reportEvent", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.e */
public final class LdrGuideModel extends BaseModel implements ILdrGuideContract.ILdrModel {
    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract.ILdrModel
    /* renamed from: a */
    public void mo141401a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C38600b.m152249a().mo141375a(list, (Map<String, String>) null);
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract.ILdrModel
    /* renamed from: a */
    public void mo141400a(IGetDataCallback<List<LdrServiceData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C25970d dVar = new C25970d(iGetDataCallback);
        getCallbackManager().addCancelableCallback(dVar);
        C38600b.m152249a().mo141376b(dVar);
    }
}
