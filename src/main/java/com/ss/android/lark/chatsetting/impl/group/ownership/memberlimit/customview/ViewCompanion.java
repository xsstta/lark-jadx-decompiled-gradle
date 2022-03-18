package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0016J\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0016J\f\u0010\t\u001a\u00020\u0006*\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/ViewCompanion;", "", "getContextCompat", "Landroid/content/Context;", "requestContext", "dp", "", "dpF", "", "toColor", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.a */
public interface ViewCompanion {
    Context ay_();

    /* renamed from: b */
    float mo128336b(int i);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.a$a */
    public static final class C34764a {
        /* renamed from: a */
        public static Context m135160a(ViewCompanion aVar) {
            Context b = m135162b(aVar);
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Currently no implementation found");
        }

        /* renamed from: b */
        private static Context m135162b(ViewCompanion aVar) {
            if (aVar instanceof Fragment) {
                return ((Fragment) aVar).requireActivity();
            }
            if (aVar instanceof View) {
                return ((View) aVar).getContext();
            }
            if (aVar instanceof Activity) {
                return (Context) aVar;
            }
            return null;
        }

        /* renamed from: a */
        public static int m135159a(ViewCompanion aVar, int i) {
            return C69029a.m265653a(aVar.mo128336b(i));
        }

        /* renamed from: c */
        public static int m135163c(ViewCompanion aVar, int i) {
            return ContextCompat.getColor(aVar.ay_(), i);
        }

        /* renamed from: b */
        public static float m135161b(ViewCompanion aVar, int i) {
            Resources resources = aVar.ay_().getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "requestContext().resources");
            return TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
        }
    }
}
