package com.ss.android.lark.littleapp.util;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.littleapp.C41354g;
import com.tt.refer.impl.business.file.TTFileHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/littleapp/util/MainTTFileHelper;", "", "()V", "TAG", "", "isEnableStandardFeature", "", "feature", "littleapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.littleapp.f.b */
public final class MainTTFileHelper {

    /* renamed from: a */
    public static final MainTTFileHelper f105175a = new MainTTFileHelper();

    private MainTTFileHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m163936a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "feature");
        if (!C41354g.m163939a().getFgValue("ecosystem.sandbox.standardize.enable")) {
            AppBrandLogger.m52830i("MainTTFileHelper", "fg closed");
            return false;
        } else if (!TTFileHelper.TTFileSettingsHandler.f171067a.mo235594a()) {
            return TTFileHelper.TTFileSettingsHandler.f171067a.mo235595b().contains(str);
        } else {
            AppBrandLogger.m52830i("MainTTFileHelper", "apply all");
            return true;
        }
    }
}
