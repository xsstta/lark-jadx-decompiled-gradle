package com.ss.android.appcenter.common.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.samskivert.mustache.C27035d;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.shadow.C28158l;
import com.ss.android.appcenter.common.shadow.C28160n;
import com.ss.android.appcenter.common.shadow.C28175q;
import com.ss.android.appcenter.common.shadow.MaterialShapeDrawable;
import java.util.HashMap;

/* renamed from: com.ss.android.appcenter.common.util.p */
public class C28209p {

    /* renamed from: a */
    private static int f70714a = -1;

    /* renamed from: a */
    public static void m103301a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        } else if (!(marginLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
        marginLayoutParams.bottomMargin = i4;
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public static Resources m103295a(Context context) {
        return context.getResources();
    }

    /* renamed from: a */
    public static int m103291a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static int m103292a(int i) {
        return (int) ((((float) i) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static String m103297a(Context context, int i) {
        return m103295a(context).getString(i);
    }

    /* renamed from: b */
    public static Drawable m103302b(Context context, int i) {
        return m103296a(context, i, (int) R.color.bg_float, false);
    }

    /* renamed from: a */
    public static int m103293a(Context context, float f) {
        if (context == null) {
            C27528a.m100471a();
            context = C27528a.m100471a().mo98143b();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static Context m103294a(Context context, boolean z) {
        int i;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (z) {
            i = 32;
        } else {
            i = 16;
        }
        configuration.uiMode = i;
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public static void m103299a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(-2, i);
        } else {
            layoutParams.height = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static void m103300a(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(i, i2);
        } else {
            layoutParams.height = i2;
            layoutParams.width = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static Drawable m103296a(Context context, int i, int i2, boolean z) {
        C28175q qVar = new C28175q();
        qVar.f70674b = UDColorUtils.getColorStateList(context, R.color.line_divider_default);
        qVar.f70673a = 1;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new C28160n.C28162a().mo100350a(new C28158l()).mo100348a((float) i).mo100351a(qVar).mo100352a());
        materialShapeDrawable.setTint(UDColorUtils.getColor(context, i2));
        if (z) {
            materialShapeDrawable.mo100279a(Paint.Style.FILL_AND_STROKE);
        } else {
            materialShapeDrawable.mo100279a(Paint.Style.FILL);
        }
        materialShapeDrawable.mo100277a(2);
        materialShapeDrawable.mo100278a(context);
        materialShapeDrawable.mo100282b(m103293a(context, 12.0f));
        materialShapeDrawable.mo100284c(UDColorUtils.getColor(context, R.color.workplace_card_shadow_color));
        materialShapeDrawable.mo100286d(m103293a(context, 2.0f));
        return materialShapeDrawable;
    }

    /* renamed from: a */
    public static String m103298a(Context context, int i, String str, String str2) {
        String string = UIUtils.getString(context, i);
        if (str == null || str2 == null) {
            return string;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        return C27035d.m98270a().mo96186a(string).mo96212a(hashMap);
    }
}
