package com.ss.android.lark.guide.biz.onboarding.common.scene;

import com.ss.android.lark.ug.attribution.C57347a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/common/scene/SceneHelper;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.common.scene.a */
public final class SceneHelper {

    /* renamed from: a */
    public static final Companion f99152a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/common/scene/SceneHelper$Companion;", "", "()V", "getUgColdScene", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.common.scene.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo141349a() {
            C57347a a = C57347a.m222308a();
            Intrinsics.checkExpressionValueIsNotNull(a, "AttributionFacade.getInstance()");
            String c = a.mo194493c();
            if (c != null) {
                int hashCode = c.hashCode();
                if (hashCode != 3757) {
                    if (hashCode != 110102) {
                        if (hashCode == 114096 && c.equals("spm")) {
                            return "spm";
                        }
                    } else if (c.equals("okr")) {
                        return "okr";
                    }
                } else if (c.equals("vc")) {
                    return "vc";
                }
            }
            return "default";
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
