package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import android.content.res.Resources;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H&R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/SpecialRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IRes;", "()V", "resIdMap", "", "", "getString", "", "context", "Landroid/content/Context;", "id", "initResIdMappingMap", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.s */
public abstract class SpecialRes implements IRes {

    /* renamed from: a */
    private Map<Integer, Integer> f99172a;

    /* renamed from: a */
    public abstract Map<Integer, Integer> mo141362a();

    public SpecialRes() {
        if (this.f99172a == null) {
            this.f99172a = mo141362a();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: a */
    public String mo141350a(Context context, int i) {
        Integer num;
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Map<Integer, Integer> map = this.f99172a;
        if (map == null || (num = map.get(Integer.valueOf(i))) == null) {
            return null;
        }
        boolean z2 = true;
        if (num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        try {
            String string = context.getString(intValue);
            Intrinsics.checkExpressionValueIsNotNull(string, "it");
            if (string.length() <= 0) {
                z2 = false;
            }
            if (!z2) {
                string = null;
            }
            if (string == null) {
                return null;
            }
            ResLogUtils.f99169a.mo141369a(mo141361b(), "use special resId", intValue, i);
            return string;
        } catch (Resources.NotFoundException e) {
            ResLogUtils.f99169a.mo141370a(mo141361b(), "resId not found", intValue, i, e);
            return null;
        }
    }
}
