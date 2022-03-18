package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0547a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {

    /* renamed from: a */
    String f2765a;

    /* renamed from: b */
    boolean f2766b;

    /* renamed from: c */
    private AttributeType f2767c;

    /* renamed from: d */
    private int f2768d;

    /* renamed from: e */
    private float f2769e;

    /* renamed from: f */
    private String f2770f;

    /* renamed from: g */
    private int f2771g;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    /* renamed from: a */
    private static int m3336a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: a */
    public AttributeType mo3794a() {
        return this.f2767c;
    }

    /* renamed from: a */
    public void mo3797a(float[] fArr) {
        switch (C06821.f2772a[this.f2767c.ordinal()]) {
            case 1:
            case 2:
                int i = this.f2771g;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case 3:
                fArr[0] = (float) this.f2768d;
                return;
            case 4:
                fArr[0] = this.f2769e;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f2766b ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                return;
            case 7:
                fArr[0] = this.f2769e;
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public int mo3798b() {
        int i = C06821.f2772a[this.f2767c.ordinal()];
        if (i == 1 || i == 2) {
            return 4;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1 */
    public static /* synthetic */ class C06821 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2772a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C06821.f2772a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.C06821.<clinit>():void");
        }
    }

    /* renamed from: c */
    public float mo3799c() {
        switch (C06821.f2772a[this.f2767c.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return (float) this.f2768d;
            case 4:
                return this.f2769e;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                if (this.f2766b) {
                    return 1.0f;
                }
                return BitmapDescriptorFactory.HUE_RED;
            case 7:
                return this.f2769e;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: a */
    public void mo3796a(Object obj) {
        switch (C06821.f2772a[this.f2767c.ordinal()]) {
            case 1:
            case 2:
                this.f2771g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f2768d = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2769e = ((Float) obj).floatValue();
                return;
            case 5:
                this.f2770f = (String) obj;
                return;
            case 6:
                this.f2766b = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f2769e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f2765a = constraintAttribute.f2765a;
        this.f2767c = constraintAttribute.f2767c;
        mo3796a(obj);
    }

    /* renamed from: a */
    public static HashMap<String, ConstraintAttribute> m3337a(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: a */
    public static void m3339a(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C06821.f2772a[constraintAttribute.f2767c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f2771g));
                        continue;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f2771g);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f2768d));
                        continue;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f2769e));
                        continue;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, constraintAttribute.f2770f);
                        continue;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f2766b));
                        continue;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f2769e));
                        continue;
                    default:
                        continue;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo3795a(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f2765a;
        try {
            boolean z = true;
            switch (C06821.f2772a[this.f2767c.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m3336a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m3336a((int) (fArr[3] * 255.0f)) << 24) | (m3336a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m3336a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(str, Drawable.class);
                    int a = m3336a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a2 = m3336a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a << 16) | (m3336a((int) (fArr[3] * 255.0f)) << 24) | (a2 << 8) | m3336a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f2765a);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            Log.e("TransitionLayout", "no method " + str + "on View \"" + C0547a.m2559a(view) + "\"");
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            Log.e("TransitionLayout", "cannot access method " + str + "on View \"" + C0547a.m2559a(view) + "\"");
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
        this.f2765a = str;
        this.f2767c = attributeType;
        mo3796a(obj);
    }

    /* renamed from: a */
    public static void m3338a(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customStringValue});
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 5) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    attributeType = AttributeType.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    attributeType = AttributeType.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                attributeType2 = attributeType;
                obj = string;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj));
        }
        obtainStyledAttributes.recycle();
    }
}
