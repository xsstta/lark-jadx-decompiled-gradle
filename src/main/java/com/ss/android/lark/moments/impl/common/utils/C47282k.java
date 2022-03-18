package com.ss.android.lark.moments.impl.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0775b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.impl.PerfLoadPicMonitor;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004\u001a4\u0010\u0010\u001a\u00020\u0011*\u00020\u00122%\b\u0004\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0014H\b\u001a8\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u001a:\u0010!\u001a\u00020\u0011*\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$\u001a\u0012\u0010(\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e¨\u0006)"}, d2 = {"getFixedSizeDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/content/Context;", "vectorResId", "", "dpWidth", "", "dpHeight", "colorRes", "(Landroid/content/Context;IFFLjava/lang/Integer;)Landroid/graphics/drawable/BitmapDrawable;", "judgeToStartActivityForResult", "", "Landroidx/fragment/app/Fragment;", "intent", "Landroid/content/Intent;", "requestCode", "onSingleClickListener", "", "Landroid/view/View;", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "perfListener", "Lcom/ss/android/lark/image/api/IRequestCreator;", "fromType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "w", C14002h.f36692e, "isThumbnail", "requestListener", "Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "setDrawables", "Landroid/widget/TextView;", "left", "Landroid/graphics/drawable/Drawable;", "top", "right", "bottom", "startActivityByContext", "im_moments-wrapper_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.k */
public final class C47282k {
    /* renamed from: a */
    public static final void m187257a(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "$this$startActivityByContext");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static final boolean m187260a(Fragment fragment, Intent intent, int i) {
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (fragment == null || !fragment.isAdded() || fragment.getActivity() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment?.judgeToStartActivityForResult ");
            sb.append("fragment=");
            sb.append(fragment);
            sb.append(' ');
            sb.append("isAdded=");
            FragmentActivity fragmentActivity = null;
            if (fragment != null) {
                bool = Boolean.valueOf(fragment.isAdded());
            } else {
                bool = null;
            }
            sb.append(bool);
            sb.append(' ');
            sb.append("activity=");
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            }
            sb.append(fragmentActivity);
            Log.m165383e("MomentsUtils", sb.toString());
            return false;
        }
        fragment.startActivityForResult(intent, i);
        return true;
    }

    /* renamed from: a */
    public static final BitmapDrawable m187253a(Context context, int i, float f, float f2, Integer num) {
        Bitmap a;
        Intrinsics.checkParameterIsNotNull(context, "$this$getFixedSizeDrawable");
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null || (a = C0775b.m3783a(drawable, UIUtils.dp2px(context, f), UIUtils.dp2px(context, f2), null, 4, null)) == null) {
            return null;
        }
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, a);
        if (num == null) {
            return bitmapDrawable;
        }
        bitmapDrawable.setTint(UIUtils.getColor(context, num.intValue()));
        return bitmapDrawable;
    }

    /* renamed from: a */
    public static final void m187258a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setDrawables");
        textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static final IRequestCreator m187255a(IRequestCreator iRequestCreator, ListenerParams.FromType fromType, int i, int i2, boolean z, ListenerParams.RequestListener bVar) {
        Intrinsics.checkParameterIsNotNull(iRequestCreator, "$this$perfListener");
        Intrinsics.checkParameterIsNotNull(fromType, "fromType");
        IRequestCreator listener = iRequestCreator.listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Moments).mo105397a(Scene.Moments).mo105398a(fromType).mo105405b(z).mo105395a(i).mo105403b(i2).mo105399a(bVar).mo105402a()));
        Intrinsics.checkExpressionValueIsNotNull(listener, "this.listener(PerfLoadPi…r)\n            .build()))");
        return listener;
    }

    /* renamed from: a */
    public static /* synthetic */ BitmapDrawable m187254a(Context context, int i, float f, float f2, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        return m187253a(context, i, f, f2, num);
    }

    /* renamed from: a */
    public static /* synthetic */ void m187259a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 2) != 0) {
            drawable2 = null;
        }
        if ((i & 4) != 0) {
            drawable3 = null;
        }
        if ((i & 8) != 0) {
            drawable4 = null;
        }
        m187258a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static /* synthetic */ IRequestCreator m187256a(IRequestCreator iRequestCreator, ListenerParams.FromType fromType, int i, int i2, boolean z, ListenerParams.RequestListener bVar, int i3, Object obj) {
        boolean z2;
        if ((i3 & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 16) != 0) {
            bVar = null;
        }
        return m187255a(iRequestCreator, fromType, i, i2, z2, bVar);
    }
}
