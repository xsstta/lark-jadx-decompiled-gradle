package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C0424ac;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.d */
public class C0262d {

    /* renamed from: a */
    private static final Class<?>[] f702a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f703b = {16843375};

    /* renamed from: c */
    private static final String[] f704c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final SimpleArrayMap<String, Constructor<? extends View>> f705d = new SimpleArrayMap<>();

    /* renamed from: e */
    private final Object[] f706e = new Object[2];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo948a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.d$a */
    public static class View$OnClickListenerC0263a implements View.OnClickListener {

        /* renamed from: a */
        private final View f707a;

        /* renamed from: b */
        private final String f708b;

        /* renamed from: c */
        private Method f709c;

        /* renamed from: d */
        private Context f710d;

        public void onClick(View view) {
            if (this.f709c == null) {
                m938a(this.f707a.getContext());
            }
            try {
                this.f709c.invoke(this.f710d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a */
        private void m938a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f708b, View.class)) != null) {
                        this.f709c = method;
                        this.f710d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f707a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f707a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f708b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f707a.getClass() + str);
        }

        public View$OnClickListenerC0263a(View view, String str) {
            this.f707a = view;
            this.f708b = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AppCompatTextView mo950a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatImageView mo951b(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatButton mo952c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatEditText mo953d(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatSpinner mo954e(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatImageButton mo955f(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatCheckBox mo956g(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatRadioButton mo957h(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatCheckedTextView mo958i(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatAutoCompleteTextView mo959j(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatMultiAutoCompleteTextView mo960k(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppCompatRatingBar mo961l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatSeekBar mo962m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatToggleButton mo963n(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* renamed from: a */
    private void m919a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || ViewCompat.m4016J(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f703b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC0263a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m920a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* renamed from: b */
    private View m921b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f706e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f704c;
                    if (i < strArr.length) {
                        View a = m918a(context, str, strArr[i]);
                        if (a != null) {
                            return a;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f706e;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View a2 = m918a(context, str, (String) null);
                Object[] objArr3 = this.f706e;
                objArr3[0] = null;
                objArr3[1] = null;
                return a2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f706e;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: a */
    private View m918a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = f705d;
        Constructor<? extends View> constructor = simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f702a);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f706e);
    }

    /* renamed from: a */
    private static Context m917a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme}, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context).getThemeResId() != i) {
            return new ContextThemeWrapper(context, i);
        }
        return context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo949a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = m917a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0424ac.m1773a(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo961l(context2, attributeSet);
                m920a(view2, str);
                break;
            case 1:
                view2 = mo958i(context2, attributeSet);
                m920a(view2, str);
                break;
            case 2:
                view2 = mo960k(context2, attributeSet);
                m920a(view2, str);
                break;
            case 3:
                view2 = mo950a(context2, attributeSet);
                m920a(view2, str);
                break;
            case 4:
                view2 = mo955f(context2, attributeSet);
                m920a(view2, str);
                break;
            case 5:
                view2 = mo962m(context2, attributeSet);
                m920a(view2, str);
                break;
            case 6:
                view2 = mo954e(context2, attributeSet);
                m920a(view2, str);
                break;
            case 7:
                view2 = mo957h(context2, attributeSet);
                m920a(view2, str);
                break;
            case '\b':
                view2 = mo963n(context2, attributeSet);
                m920a(view2, str);
                break;
            case '\t':
                view2 = mo951b(context2, attributeSet);
                m920a(view2, str);
                break;
            case '\n':
                view2 = mo959j(context2, attributeSet);
                m920a(view2, str);
                break;
            case 11:
                view2 = mo956g(context2, attributeSet);
                m920a(view2, str);
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                view2 = mo953d(context2, attributeSet);
                m920a(view2, str);
                break;
            case '\r':
                view2 = mo952c(context2, attributeSet);
                m920a(view2, str);
                break;
            default:
                view2 = mo948a(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m921b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m919a(view2, attributeSet);
        }
        return view2;
    }
}
