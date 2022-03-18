package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import com.ss.android.lark.utils.DyResUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/SettingsRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/BaseDyRes;", "context", "Landroid/content/Context;", "domainKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "domainRes", "Lcom/ss/android/lark/guide/biz/onboarding/res/DomainRes;", "getString", "resKey", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.q */
public final class SettingsRes extends BaseDyRes {

    /* renamed from: a */
    private DomainRes f99170a;

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IDyRes
    /* renamed from: a */
    public String mo141360a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "resKey");
        DomainRes eVar = this.f99170a;
        if (eVar != null) {
            return eVar.mo141355a(str, mo141354a());
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsRes(Context context, String str) {
        super(context);
        String str2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "domainKey");
        DyResUtils.DyResDependencyAPi a = DyResUtils.DyResDependencyAPi.f142246a.mo195942a();
        if (a != null) {
            str2 = a.getDyResJson(str);
        } else {
            str2 = null;
        }
        this.f99170a = DomainResParser.f99163a.mo141358a(str2);
    }
}
