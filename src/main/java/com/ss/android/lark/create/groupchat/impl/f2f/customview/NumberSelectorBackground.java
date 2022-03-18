package com.ss.android.lark.create.groupchat.impl.f2f.customview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberSelectorBackground;", "Landroid/graphics/drawable/StateListDrawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.a */
public final class NumberSelectorBackground extends StateListDrawable {

    /* renamed from: a */
    private final Context f93700a;

    public NumberSelectorBackground(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f93700a = context;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = C25653b.m91892a(this.f93700a, 4.0f);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(this.f93700a, R.color.bg_body));
        gradientDrawable.setCornerRadii(fArr);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(C57582a.m223616d(this.f93700a, R.color.fill_pressed));
        gradientDrawable2.setCornerRadii(fArr);
        addState(new int[]{16842919}, gradientDrawable2);
        addState(new int[0], gradientDrawable);
    }
}
