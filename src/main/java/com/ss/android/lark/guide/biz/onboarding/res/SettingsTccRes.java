package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/SettingsTccRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IRes;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dyRes", "Lcom/ss/android/lark/guide/biz/onboarding/res/IDyRes;", "tag", "", "getTag", "()Ljava/lang/String;", "getResourceEntryName", "id", "", "getString", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.r */
public final class SettingsTccRes implements IRes {

    /* renamed from: a */
    private final IDyRes f99171a;

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: b */
    public String mo141361b() {
        return "ResGetter_settings_tcc_res";
    }

    public SettingsTccRes(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f99171a = DyResHelper.f99164a.mo141359a(context, "all_new_onboarding_guide");
    }

    /* renamed from: b */
    private final String m152234b(Context context, int i) {
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Resources.NotFoundException e) {
            ResLogUtils.f99169a.mo141371a(mo141361b(), "resource entry name not found", i, e);
            return null;
        }
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: a */
    public String mo141350a(Context context, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        String b = m152234b(context, i);
        if (b == null) {
            return null;
        }
        String a = this.f99171a.mo141360a(b);
        if (a == null) {
            return null;
        }
        if (a.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a = null;
        }
        if (a == null) {
            return null;
        }
        ResLogUtils.f99169a.mo141368a(mo141361b(), "use settings tcc res", i);
        return a;
    }
}
