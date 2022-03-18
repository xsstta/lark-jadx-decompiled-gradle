package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.text.C0824c;
import androidx.core.util.C0845f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class TextViewCompat {

    /* renamed from: a */
    private static Field f3522a;

    /* renamed from: b */
    private static boolean f3523b;

    /* renamed from: c */
    private static Field f3524c;

    /* renamed from: d */
    private static boolean f3525d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    /* renamed from: a */
    public static void m4493a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: a */
    public static void m4494a(TextView textView, C0824c.C0825a aVar) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m4485a(aVar.mo4457b()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo4455a().getTextScaleX();
            textView.getPaint().set(aVar.mo4455a());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo4455a());
        textView.setBreakStrategy(aVar.mo4458c());
        textView.setHyphenationFrequency(aVar.mo4459d());
    }

    /* renamed from: a */
    public static void m4495a(TextView textView, C0824c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(cVar.mo4442a());
        } else if (m4502e(textView).mo4456a(cVar.mo4443b())) {
            textView.setText(cVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: a */
    public static void m4492a(TextView textView, PorterDuff.Mode mode) {
        C0845f.m3991a(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof AbstractC0949l) {
            ((AbstractC0949l) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.TextViewCompat$a */
    public static class ActionMode$CallbackC0935a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3526a;

        /* renamed from: b */
        private final TextView f3527b;

        /* renamed from: c */
        private Class<?> f3528c;

        /* renamed from: d */
        private Method f3529d;

        /* renamed from: e */
        private boolean f3530e;

        /* renamed from: f */
        private boolean f3531f;

        /* renamed from: a */
        private Intent m4504a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3526a.onDestroyActionMode(actionMode);
        }

        /* renamed from: a */
        private void m4507a(Menu menu) {
            Method method;
            Context context = this.f3527b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3531f) {
                this.f3531f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3528c = cls;
                    this.f3529d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3530e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3528c = null;
                    this.f3529d = null;
                    this.f3530e = false;
                }
            }
            try {
                if (!this.f3530e || !this.f3528c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    method = this.f3529d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> a = m4506a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m4505a(resolveInfo, this.f3527b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: a */
        private boolean m4509a(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        ActionMode$CallbackC0935a(ActionMode.Callback callback, TextView textView) {
            this.f3526a = callback;
            this.f3527b = textView;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3526a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3526a.onCreateActionMode(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m4507a(menu);
            return this.f3526a.onPrepareActionMode(actionMode, menu);
        }

        /* renamed from: a */
        private Intent m4505a(ResolveInfo resolveInfo, TextView textView) {
            return m4504a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m4509a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private List<ResolveInfo> m4506a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m4504a(), 0)) {
                if (m4508a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private boolean m4508a(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            if (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public static int m4498c(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: d */
    public static int m4500d(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: a */
    private static int m4485a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public static int m4486a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f3525d) {
            f3524c = m4489a("mMaxMode");
            f3525d = true;
        }
        Field field = f3524c;
        if (field == null || m4487a(field, textView) != 1) {
            return -1;
        }
        if (!f3523b) {
            f3522a = m4489a("mMaximum");
            f3523b = true;
        }
        Field field2 = f3522a;
        if (field2 != null) {
            return m4487a(field2, textView);
        }
        return -1;
    }

    /* renamed from: b */
    public static Drawable[] m4497b(TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: e */
    public static C0824c.C0825a m4502e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0824c.C0825a(textView.getTextMetricsParams());
        }
        C0824c.C0825a.C0826a aVar = new C0824c.C0825a.C0826a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            aVar.mo4463a(textView.getBreakStrategy());
            aVar.mo4466b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            aVar.mo4464a(m4503f(textView));
        }
        return aVar.mo4465a();
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m4503f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: a */
    private static Field m4489a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e("TextViewCompat", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: a */
    public static ActionMode.Callback m4488a(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof ActionMode$CallbackC0935a)) {
            return callback;
        }
        return new ActionMode$CallbackC0935a(callback, textView);
    }

    /* renamed from: d */
    public static void m4501d(TextView textView, int i) {
        C0845f.m3989a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: b */
    public static void m4496b(TextView textView, int i) {
        int i2;
        C0845f.m3989a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m4499c(TextView textView, int i) {
        int i2;
        C0845f.m3989a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: a */
    private static int m4487a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: a */
    public static void m4490a(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: a */
    public static void m4491a(TextView textView, ColorStateList colorStateList) {
        C0845f.m3991a(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof AbstractC0949l) {
            ((AbstractC0949l) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }
}
