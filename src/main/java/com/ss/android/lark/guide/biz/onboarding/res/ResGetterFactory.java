package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import com.ss.android.lark.guide.biz.onboarding.common.scene.SceneHelper;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/ResGetterFactory;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.n */
public final class ResGetterFactory {

    /* renamed from: a */
    public static final Companion f99165a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/ResGetterFactory$Companion;", "", "()V", "TAG", "", "get", "Lcom/ss/android/lark/guide/biz/onboarding/res/IResGetter;", "context", "Landroid/content/Context;", "scene", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.res.n$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final IResGetter mo141363a() {
            return mo141364a(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IResGetter mo141364a(Context context) {
            if (context == null) {
                context = UIHelper.getContext();
            }
            String a = SceneHelper.f99152a.mo141349a();
            Intrinsics.checkExpressionValueIsNotNull(context, "ctx");
            return mo141365a(context, a);
        }

        /* renamed from: a */
        public final IResGetter mo141365a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "scene");
            int hashCode = str.hashCode();
            if (hashCode != 3757) {
                if (hashCode != 110102) {
                    if (hashCode == 114096 && str.equals("spm")) {
                        return new SpmResGetter(context);
                    }
                } else if (str.equals("okr")) {
                    return new OkrResGetter(context);
                }
            } else if (str.equals("vc")) {
                return new VCResGetter(context);
            }
            return new DefaultResGetter(context);
        }
    }
}
