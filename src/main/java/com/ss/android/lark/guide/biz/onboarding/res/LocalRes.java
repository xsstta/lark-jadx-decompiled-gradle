package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/LocalRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IRes;", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "getString", "context", "Landroid/content/Context;", "id", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.k */
public final class LocalRes implements IRes {
    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: b */
    public String mo141361b() {
        return "ResGetter_local_res";
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: a */
    public String mo141350a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            return context.getString(i);
        } catch (Resources.NotFoundException e) {
            ResLogUtils.f99169a.mo141371a(mo141361b(), "resId not found", i, e);
            return "";
        }
    }
}
