package com.tt.miniapp.component.nativeview.p3271c;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.IKeyBoardStateChange;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.AbstractC65853c;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67033g;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.IllegalColorException;
import com.tt.option.ext.WebEventCallback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.c.a */
public class C65854a extends EditText implements AbstractC65853c, AbstractC65886f {

    /* renamed from: A */
    private boolean f166002A = true;

    /* renamed from: B */
    private int f166003B;

    /* renamed from: C */
    private boolean f166004C = true;

    /* renamed from: D */
    private View f166005D;

    /* renamed from: E */
    private int f166006E = -1;

    /* renamed from: a */
    public int f166007a;

    /* renamed from: b */
    public int f166008b;

    /* renamed from: c */
    public C67257d f166009c;

    /* renamed from: d */
    public RenderViewManager.IRender f166010d;

    /* renamed from: e */
    public boolean f166011e;

    /* renamed from: f */
    public C65867b f166012f;

    /* renamed from: g */
    public boolean f166013g;

    /* renamed from: h */
    public boolean f166014h;

    /* renamed from: i */
    public int f166015i = 1;

    /* renamed from: j */
    public Stack<Integer> f166016j = new Stack<>();

    /* renamed from: k */
    int f166017k = -1;

    /* renamed from: l */
    int f166018l = -1;

    /* renamed from: m */
    int f166019m = -1;

    /* renamed from: n */
    int f166020n = -1;

    /* renamed from: o */
    int f166021o = C67590h.m263091e(getContext());

    /* renamed from: p */
    int f166022p = 0;

    /* renamed from: q */
    public boolean f166023q = false;

    /* renamed from: r */
    public ViewTreeObserver.OnGlobalLayoutListener f166024r;

    /* renamed from: s */
    public IAppContext f166025s;

    /* renamed from: t */
    public boolean f166026t = false;

    /* renamed from: u */
    public RunnableC65866a f166027u;

    /* renamed from: v */
    boolean f166028v = false;

    /* renamed from: w */
    private String f166029w;

    /* renamed from: x */
    private C67231a f166030x;

    /* renamed from: y */
    private IKeyBoardStateChange f166031y;

    /* renamed from: z */
    private boolean f166032z;

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getScrollTop() {
        return 0;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public String getType() {
        return "textarea";
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    /* renamed from: a */
    public boolean mo230588a() {
        return this.f166002A;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    /* renamed from: b */
    public boolean mo230589b() {
        return this.f166004C;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public boolean getConfirm() {
        return this.f166011e;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public boolean hasFocus() {
        return this.f166028v;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getCursor() {
        return getSelectionStart();
    }

    /* renamed from: c */
    public void mo230612c() {
        post(new Runnable() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.RunnableC658648 */

            public void run() {
                C65854a.this.mo230616g();
            }
        });
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public String getValue() {
        return getText().toString();
    }

    /* renamed from: i */
    public boolean mo230619i() {
        C65867b bVar = this.f166012f;
        if (bVar == null || !bVar.f166081w) {
            return false;
        }
        return true;
    }

    /* renamed from: com.tt.miniapp.component.nativeview.c.a$a */
    class RunnableC65866a implements Runnable {
        public void run() {
            AppBrandLogger.m52830i("tma_Textarea", "internal time out");
            C65854a.this.f166026t = false;
        }

        RunnableC65866a() {
        }
    }

    private int getCurrentCursorLine() {
        int selectionStart = Selection.getSelectionStart(getText());
        Layout layout = getLayout();
        if (selectionStart != -1) {
            return layout.getLineForOffset(selectionStart) + 1;
        }
        return -1;
    }

    public Rect getCursorRect() {
        Rect rect = new Rect();
        int selectionStart = getSelectionStart();
        Layout layout = getLayout();
        layout.getLineBounds(layout.getLineForOffset(selectionStart), rect);
        return rect;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getCursorSpacingHeight() {
        if (HostDependManager.getInst().getFeatureGating("gadget.input.cursorspacing")) {
            return Math.max(this.f166003B, 0);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean mo230620j() {
        if (getLocalVisibleRect(new Rect(0, 0, C67043j.m261275b(getContext()), C67043j.m261267a(getContext())))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo230613d() {
        AppbrandApplicationImpl.getInst(this.f166025s).getRenderViewManager().publish(this.f166008b, "onKeyboardShow", new C67587d().mo234783a("inputId", Integer.valueOf(this.f166007a)).mo234783a("height", Integer.valueOf(C67589g.m263064a(C66493a.m259858a(this.f166025s)))).mo234784a().toString());
    }

    /* renamed from: e */
    public void mo230614e() {
        final int i;
        if (getText().length() == 0) {
            i = 0;
        } else {
            i = getLineCount();
        }
        if (i != this.f166015i) {
            mo230616g();
            postDelayed(new Runnable() {
                /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.RunnableC658659 */

                public void run() {
                    if ((C65854a.this.mo230619i() || C65854a.this.getLayoutParams().height == -2) && C65854a.this.f166022p > C65854a.this.f166012f.f166063e && C65854a.this.f166012f.f166063e > 0) {
                        C65854a aVar = C65854a.this;
                        aVar.f166022p = aVar.f166012f.f166063e;
                    } else if (C65854a.this.mo230619i() && C65854a.this.f166022p < C65854a.this.f166012f.f166062d) {
                        C65854a aVar2 = C65854a.this;
                        aVar2.f166022p = aVar2.f166012f.f166062d;
                    }
                    int scrollY = C65854a.this.getCursorRect().bottom - C65854a.this.getScrollY();
                    int a = C66493a.m259858a(C65854a.this.f166025s);
                    int[] iArr = new int[2];
                    C65854a.this.getLocationOnScreen(iArr);
                    int i = iArr[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("当前TextArea底部坐标");
                    int i2 = scrollY + i;
                    sb.append(i2);
                    AppBrandLogger.m52829e("tma_Textarea", sb.toString(), "键盘顶部坐标", Integer.valueOf(C65854a.this.f166021o - a));
                    if (C65854a.this.mo230615f() && i > C65854a.this.f166015i && i2 > C65854a.this.f166021o - a) {
                        int i3 = ((C65854a.this.f166021o - a) - scrollY) - i;
                        AppBrandLogger.m52829e("tma_Textarea", "偏移量", Integer.valueOf(i3));
                        C65854a.this.f166016j.push(Integer.valueOf(i3));
                        C65854a.this.f166009c.mo233864a(i3, true, C65854a.this);
                    } else if (!C65854a.this.f166016j.empty() && i < C65854a.this.f166015i && i2 < C65854a.this.f166021o - a) {
                        C65854a.this.f166009c.mo233864a(-C65854a.this.f166016j.pop().intValue(), true, C65854a.this);
                    }
                }
            }, 60);
        }
    }

    /* renamed from: f */
    public boolean mo230615f() {
        int a = C66493a.m259858a(this.f166025s);
        int i = getCursorRect().bottom;
        if (mo230619i()) {
            if (i < this.f166012f.f166062d) {
                i = getCursorRect().bottom;
            } else if (i > this.f166012f.f166063e && this.f166012f.f166063e > 0) {
                i = this.f166012f.f166063e;
            }
        } else if (i > getMeasuredHeight()) {
            i = getMeasuredHeight();
        }
        int i2 = this.f166022p;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i3 = iArr[1] + i2;
        int i4 = this.f166021o;
        if (i3 <= i4 - a || i + iArr[1] <= i4 - a) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getInputHeight() {
        int i;
        int i2;
        int i3;
        if (getCurrentCursorLine() * getLineHeight() > getMeasuredHeight()) {
            i = getMeasuredHeight();
        } else {
            i = getCurrentCursorLine() * getLineHeight();
        }
        if (HostDependManager.getInst().getFeatureGating("gadget.input.cursorspacing") || (i2 = this.f166003B) <= 0) {
            return i;
        }
        if (i2 >= (getBottom() - getTop()) - i) {
            i3 = (getBottom() - getTop()) - i;
        } else {
            i3 = this.f166003B;
        }
        this.f166003B = i3;
        return i + i3;
    }

    /* renamed from: h */
    public void mo230618h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", getValue());
            jSONObject.put("inputId", this.f166007a);
            jSONObject.put("cursor", getCursor());
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f166029w);
            C67432a.m262319a(this.f166025s).getJsBridge().sendMsgToJsCore("onKeyboardValueChange", jSONObject.toString(), this.f166008b);
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_Textarea", e.getStackTrace());
        }
    }

    private float[] getCursorCoordinate() {
        int i;
        int i2;
        NoSuchMethodException e;
        InvocationTargetException e2;
        IllegalAccessException e3;
        NoSuchFieldException e4;
        ClassNotFoundException e5;
        Class superclass = EditText.class.getSuperclass();
        try {
            Field declaredField = superclass.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Field declaredField2 = Class.forName("android.widget.Editor").getDeclaredField("mCursorDrawable");
            declaredField2.setAccessible(true);
            Drawable[] drawableArr = (Drawable[]) declaredField2.get(obj);
            Method declaredMethod = superclass.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
            Method declaredMethod2 = superclass.getDeclaredMethod("getCompoundPaddingLeft", new Class[0]);
            Method declaredMethod3 = superclass.getDeclaredMethod("getExtendedPaddingTop", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            declaredMethod3.setAccessible(true);
            if (drawableArr != null) {
                Rect bounds = drawableArr[0].getBounds();
                AppBrandLogger.m52829e("tma_Textarea", bounds.toString());
                i = ((Integer) declaredMethod2.invoke(this, new Object[0])).intValue() + bounds.left;
                try {
                    i2 = ((Integer) declaredMethod3.invoke(this, new Object[0])).intValue() + ((Integer) declaredMethod.invoke(this, false)).intValue() + bounds.bottom;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    e.printStackTrace();
                    i2 = 0;
                    return new float[]{getX() + ((float) i), getY() + ((float) i2)};
                } catch (InvocationTargetException e7) {
                    e2 = e7;
                    e2.printStackTrace();
                    i2 = 0;
                    return new float[]{getX() + ((float) i), getY() + ((float) i2)};
                } catch (IllegalAccessException e8) {
                    e3 = e8;
                    e3.printStackTrace();
                    i2 = 0;
                    return new float[]{getX() + ((float) i), getY() + ((float) i2)};
                } catch (NoSuchFieldException e9) {
                    e4 = e9;
                    e4.printStackTrace();
                    i2 = 0;
                    return new float[]{getX() + ((float) i), getY() + ((float) i2)};
                } catch (ClassNotFoundException e10) {
                    e5 = e10;
                    e5.printStackTrace();
                    i2 = 0;
                    return new float[]{getX() + ((float) i), getY() + ((float) i2)};
                }
            } else {
                i2 = 0;
                i = 0;
            }
        } catch (NoSuchMethodException e11) {
            e = e11;
            i = 0;
            e.printStackTrace();
            i2 = 0;
            return new float[]{getX() + ((float) i), getY() + ((float) i2)};
        } catch (InvocationTargetException e12) {
            e2 = e12;
            i = 0;
            e2.printStackTrace();
            i2 = 0;
            return new float[]{getX() + ((float) i), getY() + ((float) i2)};
        } catch (IllegalAccessException e13) {
            e3 = e13;
            i = 0;
            e3.printStackTrace();
            i2 = 0;
            return new float[]{getX() + ((float) i), getY() + ((float) i2)};
        } catch (NoSuchFieldException e14) {
            e4 = e14;
            i = 0;
            e4.printStackTrace();
            i2 = 0;
            return new float[]{getX() + ((float) i), getY() + ((float) i2)};
        } catch (ClassNotFoundException e15) {
            e5 = e15;
            i = 0;
            e5.printStackTrace();
            i2 = 0;
            return new float[]{getX() + ((float) i), getY() + ((float) i2)};
        }
        return new float[]{getX() + ((float) i), getY() + ((float) i2)};
    }

    /* renamed from: g */
    public void mo230616g() {
        try {
            int i = getCursorRect().bottom;
            if (mo230619i() && (i = getLayout().getHeight()) < getMinHeight()) {
                i = getMinHeight();
            }
            int i2 = 0;
            AppBrandLogger.m52829e("tma_Textarea", "文本内容高度: " + i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C67589g.m263064a(i));
            jSONObject.put("inputId", this.f166007a);
            if (getText().length() != 0) {
                i2 = getLineCount();
            }
            jSONObject.put("lineCount", i2);
            AppbrandApplicationImpl.getInst(this.f166025s).getRenderViewManager().publish(this.f166008b, "onTextAreaHeightChange", jSONObject.toString());
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_Textarea", e.getStackTrace());
        }
    }

    /* renamed from: com.tt.miniapp.component.nativeview.c.a$b */
    public static class C65867b {

        /* renamed from: A */
        boolean f166046A;

        /* renamed from: B */
        String f166047B;

        /* renamed from: C */
        boolean f166048C;

        /* renamed from: D */
        String f166049D;

        /* renamed from: E */
        boolean f166050E;

        /* renamed from: F */
        int f166051F;

        /* renamed from: G */
        String f166052G;

        /* renamed from: H */
        String f166053H;

        /* renamed from: I */
        String f166054I;

        /* renamed from: J */
        boolean f166055J = true;

        /* renamed from: K */
        int f166056K;

        /* renamed from: L */
        boolean f166057L;

        /* renamed from: M */
        public boolean f166058M;

        /* renamed from: a */
        int f166059a;

        /* renamed from: b */
        int f166060b;

        /* renamed from: c */
        int f166061c;

        /* renamed from: d */
        int f166062d;

        /* renamed from: e */
        int f166063e;

        /* renamed from: f */
        int f166064f;

        /* renamed from: g */
        boolean f166065g;

        /* renamed from: h */
        String f166066h;

        /* renamed from: i */
        String f166067i;

        /* renamed from: j */
        int f166068j;

        /* renamed from: k */
        int f166069k;

        /* renamed from: l */
        String f166070l;

        /* renamed from: m */
        String f166071m;

        /* renamed from: n */
        String f166072n;

        /* renamed from: o */
        boolean f166073o;

        /* renamed from: p */
        int f166074p;

        /* renamed from: q */
        int f166075q;

        /* renamed from: r */
        int f166076r;

        /* renamed from: s */
        boolean f166077s;

        /* renamed from: t */
        String f166078t;

        /* renamed from: u */
        boolean f166079u;

        /* renamed from: v */
        boolean f166080v;

        /* renamed from: w */
        boolean f166081w;

        /* renamed from: x */
        boolean f166082x;

        /* renamed from: y */
        boolean f166083y;

        /* renamed from: z */
        boolean f166084z;

        public String toString() {
            return "TextAreaMode{parentId=" + this.f166059a + ", width=" + this.f166060b + ", left=" + this.f166061c + ", minHeight=" + this.f166062d + ", maxHeight=" + this.f166063e + ", top=" + this.f166064f + ", hasStyle=" + this.f166065g + ", fontWeight='" + this.f166066h + '\'' + ", fontFamily='" + this.f166067i + '\'' + ", fontSize=" + this.f166068j + ", lineSpace=" + this.f166069k + ", textAlign='" + this.f166070l + '\'' + ", color='" + this.f166071m + '\'' + ", marginBottom=" + this.f166074p + ", height=" + this.f166075q + ", maxLength=" + this.f166076r + ", hasPlaceHolder=" + this.f166077s + ", placeHolder='" + this.f166078t + '\'' + ", disabled=" + this.f166079u + ", hidden=" + this.f166080v + ", autoSize=" + this.f166081w + ", confirm=" + this.f166082x + ", fixed=" + this.f166083y + ", value='" + this.f166047B + '\'' + ", hasValue=" + this.f166048C + ", dataObject='" + this.f166049D + '\'' + ", hasPlaceHolderStyle=" + this.f166050E + ", placeHolderFontSize=" + this.f166051F + ", placeHolderFontWeight='" + this.f166052G + '\'' + ", placeHolderontFaFmily='" + this.f166053H + '\'' + ", placeHolderColor='" + this.f166054I + '\'' + '}';
        }

        /* renamed from: a */
        static C65867b m258046a(String str) {
            C65867b bVar = new C65867b();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("confirm")) {
                    bVar.f166082x = jSONObject.optBoolean("confirm");
                }
                bVar.f166059a = jSONObject.optInt("parentId");
                bVar.f166049D = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (jSONObject.has("fixed")) {
                    bVar.f166084z = true;
                    bVar.f166083y = jSONObject.optBoolean("fixed");
                }
                bVar.f166046A = jSONObject.optBoolean("adjustPosition", true);
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                if (optJSONObject != null) {
                    bVar.f166065g = true;
                    int optInt = optJSONObject.optInt("width");
                    bVar.f166060b = optInt;
                    if (optInt > 0) {
                        bVar.f166060b = C67589g.m263062a((double) optInt);
                    }
                    int optInt2 = optJSONObject.optInt("left");
                    bVar.f166061c = optInt2;
                    if (optInt2 != 0) {
                        bVar.f166061c = C67589g.m263062a((double) optInt2);
                    }
                    int optInt3 = optJSONObject.optInt("minHeight");
                    bVar.f166062d = optInt3;
                    if (optInt3 > 0) {
                        bVar.f166062d = C67589g.m263062a((double) optInt3);
                    }
                    int optInt4 = optJSONObject.optInt("maxHeight");
                    bVar.f166063e = optInt4;
                    if (optInt4 > 0) {
                        bVar.f166063e = C67589g.m263062a((double) optInt4);
                    }
                    int optInt5 = optJSONObject.optInt("top");
                    bVar.f166064f = optInt5;
                    if (optInt5 != 0) {
                        bVar.f166064f = C67589g.m263062a((double) optInt5);
                    }
                    bVar.f166066h = optJSONObject.optString("fontWeight");
                    bVar.f166067i = optJSONObject.optString("fontFamily");
                    bVar.f166068j = optJSONObject.optInt("fontSize");
                    int optInt6 = optJSONObject.optInt("lineSpace");
                    bVar.f166069k = optInt6;
                    if (optInt6 > 0) {
                        bVar.f166069k = C67589g.m263062a((double) optInt6);
                    }
                    bVar.f166070l = optJSONObject.optString("textAlign");
                    bVar.f166071m = optJSONObject.optString("color");
                    bVar.f166072n = optJSONObject.optString("backgroundColor", "#00000000");
                    int optInt7 = optJSONObject.optInt("marginBottom");
                    bVar.f166074p = optInt7;
                    if (optInt7 > 0) {
                        bVar.f166074p = C67589g.m263062a((double) optInt7);
                    }
                    int optInt8 = optJSONObject.optInt("height");
                    bVar.f166075q = optInt8;
                    if (optInt8 > 0) {
                        bVar.f166075q = C67589g.m263062a((double) optInt8);
                    }
                }
                bVar.f166076r = jSONObject.optInt("maxLength");
                if (jSONObject.has("placeholder") && !TextUtils.isEmpty(jSONObject.optString("placeholder"))) {
                    bVar.f166077s = true;
                    bVar.f166078t = jSONObject.optString("placeholder");
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholderStyle");
                if (optJSONObject2 != null) {
                    bVar.f166050E = true;
                    bVar.f166054I = optJSONObject2.optString("color");
                    bVar.f166051F = optJSONObject2.optInt("fontSize");
                    bVar.f166052G = optJSONObject2.optString("fontWeight");
                    bVar.f166053H = optJSONObject2.optString("fontFamily");
                }
                bVar.f166079u = jSONObject.optBoolean("disabled");
                bVar.f166080v = jSONObject.optBoolean("hidden");
                bVar.f166081w = jSONObject.optBoolean("autoSize");
                if (jSONObject.has("value") && !TextUtils.isEmpty(jSONObject.optString("value"))) {
                    bVar.f166048C = true;
                    bVar.f166047B = jSONObject.optString("value");
                }
                if (jSONObject.has("autoBlur")) {
                    bVar.f166055J = jSONObject.getBoolean("autoBlur");
                }
                if (jSONObject.has("zIndex")) {
                    bVar.f166057L = true;
                    bVar.f166056K = jSONObject.optInt("zIndex");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return bVar;
        }

        /* renamed from: a */
        static C65867b m258045a(C65867b bVar, String str) {
            String str2;
            String str3;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("confirm")) {
                    bVar.f166082x = jSONObject.optBoolean("confirm");
                }
                if (jSONObject.has("parentId")) {
                    bVar.f166059a = jSONObject.optInt("parentId");
                }
                if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    bVar.f166049D = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                }
                if (jSONObject.has("fixed")) {
                    bVar.f166084z = true;
                    bVar.f166083y = jSONObject.optBoolean("fixed");
                } else {
                    bVar.f166084z = false;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                if (optJSONObject != null) {
                    bVar.f166065g = true;
                    int optInt = optJSONObject.optInt("width");
                    bVar.f166060b = optInt;
                    str3 = "autoSize";
                    str2 = "hidden";
                    if (optInt > 0) {
                        bVar.f166060b = C67589g.m263062a((double) optInt);
                    }
                    if (optJSONObject.has("left")) {
                        bVar.f166061c = C67589g.m263062a((double) optJSONObject.optInt("left"));
                    }
                    int optInt2 = optJSONObject.optInt("minHeight");
                    bVar.f166062d = optInt2;
                    if (optInt2 > 0) {
                        bVar.f166062d = C67589g.m263062a((double) optInt2);
                    }
                    int optInt3 = optJSONObject.optInt("maxHeight");
                    bVar.f166063e = optInt3;
                    if (optInt3 > 0) {
                        bVar.f166063e = C67589g.m263062a((double) optInt3);
                    }
                    if (optJSONObject.has("top")) {
                        bVar.f166064f = C67589g.m263062a((double) optJSONObject.optInt("top"));
                    }
                    bVar.f166066h = optJSONObject.optString("fontWeight");
                    bVar.f166067i = optJSONObject.optString("fontFamily");
                    bVar.f166068j = optJSONObject.optInt("fontSize");
                    int optInt4 = optJSONObject.optInt("lineSpace");
                    bVar.f166069k = optInt4;
                    if (optInt4 > 0) {
                        bVar.f166069k = C67589g.m263062a((double) optInt4);
                    }
                    bVar.f166070l = optJSONObject.optString("textAlign");
                    bVar.f166071m = optJSONObject.optString("color");
                    if (optJSONObject.has("backgroundColor")) {
                        bVar.f166073o = true;
                        bVar.f166072n = optJSONObject.optString("backgroundColor");
                    }
                    int optInt5 = optJSONObject.optInt("marginBottom");
                    bVar.f166074p = optInt5;
                    if (optInt5 > 0) {
                        bVar.f166074p = C67589g.m263062a((double) optInt5);
                    }
                    int optInt6 = optJSONObject.optInt("height");
                    bVar.f166075q = optInt6;
                    if (optInt6 > 0) {
                        bVar.f166075q = C67589g.m263062a((double) optInt6);
                    }
                } else {
                    str3 = "autoSize";
                    str2 = "hidden";
                    bVar.f166065g = false;
                }
                if (jSONObject.has("maxLength")) {
                    bVar.f166076r = jSONObject.optInt("maxLength");
                }
                if (jSONObject.has("placeholder")) {
                    bVar.f166077s = true;
                    bVar.f166078t = jSONObject.optString("placeholder");
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholderStyle");
                if (optJSONObject2 != null) {
                    bVar.f166050E = true;
                    bVar.f166054I = optJSONObject2.optString("color");
                    bVar.f166051F = optJSONObject2.optInt("fontSize");
                    bVar.f166052G = optJSONObject2.optString("fontWeight");
                    bVar.f166053H = optJSONObject2.optString("fontFamily");
                }
                if (jSONObject.has("disabled")) {
                    bVar.f166079u = jSONObject.optBoolean("disabled");
                }
                if (jSONObject.has(str2)) {
                    bVar.f166080v = jSONObject.optBoolean(str2);
                }
                if (jSONObject.has(str3)) {
                    bVar.f166081w = jSONObject.optBoolean(str3);
                }
                if (jSONObject.has("value")) {
                    bVar.f166058M = true;
                    bVar.f166048C = true;
                    bVar.f166047B = jSONObject.optString("value");
                }
                if (jSONObject.has("autoBlur")) {
                    bVar.f166055J = jSONObject.getBoolean("autoBlur");
                }
                if (jSONObject.has("zIndex")) {
                    bVar.f166057L = true;
                    bVar.f166056K = jSONObject.optInt("zIndex");
                } else {
                    bVar.f166057L = false;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return bVar;
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(IAppContext iAppContext) {
        this.f166025s = iAppContext;
    }

    public void setValue(String str) {
        setText(str);
    }

    public void setSelection(int i) {
        if (i <= getText().length()) {
            super.setSelection(i);
        }
    }

    /* renamed from: b */
    private String m258029b(String str) {
        if (TextUtils.isEmpty(str) || str.charAt(0) != '#' || str.length() != 9) {
            return str;
        }
        return "#" + str.substring(7) + str.substring(1, 7);
    }

    /* renamed from: a */
    public void mo230610a(int i) {
        if (this.f166005D == null) {
            View offsetTargetView = this.f166009c.getOffsetTargetView();
            this.f166005D = offsetTargetView;
            this.f166006E = offsetTargetView.getMeasuredHeight();
        }
        int measuredHeight = getMeasuredHeight() + getTop();
        if (measuredHeight > this.f166006E) {
            ViewGroup.LayoutParams layoutParams = this.f166005D.getLayoutParams();
            layoutParams.height = measuredHeight;
            this.f166005D.setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f166005D.getLayoutParams();
        layoutParams2.height = this.f166006E;
        this.f166005D.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private boolean m258028a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("cursor") || jSONObject.has("selectionStart") || jSONObject.has("selectionEnd")) {
                if (jSONObject.has("selectionStart")) {
                    this.f166018l = jSONObject.optInt("selectionStart", -1);
                    if (jSONObject.has("selectionEnd")) {
                        int optInt = jSONObject.optInt("selectionEnd", -1);
                        this.f166019m = optInt;
                        if (optInt <= this.f166018l) {
                            this.f166017k = optInt;
                            this.f166018l = -1;
                            this.f166019m = -1;
                        }
                        int i = this.f166020n;
                        if (i != -1) {
                            this.f166019m = Math.min(this.f166019m, i);
                        }
                    }
                } else if (jSONObject.has("cursor")) {
                    int optInt2 = jSONObject.optInt("cursor", -1);
                    this.f166017k = optInt2;
                    int i2 = this.f166020n;
                    if (i2 != -1) {
                        this.f166017k = Math.min(optInt2, i2);
                    }
                }
                return true;
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_Textarea", "", e);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo230611a(EditText editText) {
        try {
            int scrollY = editText.getScrollY();
            int height = editText.getLayout().getHeight() - ((editText.getHeight() - editText.getCompoundPaddingTop()) - editText.getCompoundPaddingBottom());
            if (height == 0) {
                return false;
            }
            if (scrollY > 0 || scrollY < height - 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_Textarea", e);
            return false;
        }
    }

    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        if (Build.VERSION.SDK_INT >= 17 && Build.VERSION.SDK_INT <= 23) {
            rect.offset(-getScrollX(), -getScrollY());
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    public void setSelection(int i, int i2) {
        int length = getText().length();
        if (i2 <= length && i < length) {
            super.setSelection(i, i2);
        } else if (length < i2 && length > i) {
            super.setSelection(i, length);
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        View focusedChild = this.f166030x.getFocusedChild();
        AppBrandLogger.m52830i("tma_Textarea", "pre focused view: " + focusedChild);
        if (focusedChild instanceof AbstractC65853c) {
            this.f166026t = true;
            RunnableC65866a aVar = this.f166027u;
            if (aVar != null) {
                postDelayed(aVar, 100);
            }
        }
        return super.requestFocus(i, rect);
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
        View view;
        if (this.f166024r != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f166024r);
            this.f166024r = null;
        }
        IKeyBoardStateChange iKeyBoardStateChange = this.f166031y;
        if (iKeyBoardStateChange != null) {
            this.f166010d.unregisterKeyBoardStateChange(iKeyBoardStateChange);
        }
        if (this.f166006E != -1 && (view = this.f166005D) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f166006E;
            this.f166005D.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
        boolean z;
        int i;
        if (m258028a(str)) {
            if (!hasFocus()) {
                post(new Runnable() {
                    /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.RunnableC658551 */

                    public void run() {
                        int[] iArr = new int[2];
                        C65854a.this.getLocationInWindow(iArr);
                        int a = C67043j.m261267a(C65854a.this.getContext()) - iArr[1];
                        if (a < 0) {
                            C65854a.this.f166009c.mo233862a(0, -a);
                        }
                    }
                });
                requestFocus();
            }
            if (this.f166024r != null) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this.f166024r);
                this.f166024r = null;
            }
            this.f166024r = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.ViewTreeObserver$OnGlobalLayoutListenerC658562 */

                public void onGlobalLayout() {
                    if ((C65854a.this.mo230620j() && C65854a.this.f166028v) && !C65854a.this.f166023q) {
                        C65854a.this.postDelayed(new Runnable() {
                            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.ViewTreeObserver$OnGlobalLayoutListenerC658562.RunnableC658571 */

                            public void run() {
                                if (C65854a.this.f166010d != null) {
                                    C65854a.this.f166010d.showKeyboard(C65854a.this.f166007a);
                                }
                            }
                        }, 100);
                        C65854a.this.mo230616g();
                        C65854a.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        C65854a.this.f166024r = null;
                    }
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.f166024r);
            if (this.f166018l != -1) {
                if (!hasFocus()) {
                    requestFocus();
                }
                int i2 = this.f166019m;
                if (i2 == -1) {
                    setSelection(this.f166018l, getText().length());
                } else {
                    if (i2 > getText().length()) {
                        this.f166019m = getText().length();
                    }
                    setSelection(this.f166018l, this.f166019m);
                }
            }
            int i3 = this.f166017k;
            if (i3 != -1) {
                if (i3 > getText().length()) {
                    this.f166017k = getText().length();
                }
                setSelection(this.f166017k);
                return;
            }
            return;
        }
        C65867b a = C65867b.m258045a(this.f166012f, str);
        if (a.f166077s) {
            setHint(a.f166078t);
        }
        if (a.f166073o) {
            try {
                setBackgroundColor(Color.parseColor(m258029b(a.f166072n)));
            } catch (IllegalArgumentException unused) {
                AppBrandLogger.m52829e("tma_Textarea", "TextArea parse backgroundColor failed");
            }
        }
        if (a.f166050E) {
            if (!TextUtils.isEmpty(a.f166054I)) {
                try {
                    setHintTextColor(C67590h.m263082b(a.f166054I));
                } catch (IllegalColorException e) {
                    AppBrandLogger.eWithThrowable("tma_Textarea", "textarea placeHolderColor error", e);
                }
            }
            if (a.f166051F > 0) {
                setTextSize((float) a.f166051F);
            }
        }
        if (a.f166076r > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(a.f166076r)});
        }
        if (a.f166048C && !TextUtils.equals(getValue(), a.f166047B) && a.f166058M) {
            this.f166013g = true;
            setText(a.f166047B);
            setSelection(CharacterUtils.length(a.f166047B));
        }
        C67231a.C67234b bVar = (C67231a.C67234b) getLayoutParams();
        if (a.f166065g) {
            int curScrollX = this.f166030x.getCurScrollX();
            int curScrollY = this.f166030x.getCurScrollY();
            if (a.f166083y) {
                curScrollX = 0;
                curScrollY = 0;
            }
            bVar.f169721a = a.f166061c - curScrollX;
            bVar.f169722b = a.f166064f - curScrollY;
            this.f166030x.mo233795a(this.f166007a);
            bVar.width = a.f166060b;
            if (a.f166075q <= 0 || mo230619i()) {
                i = -2;
            } else {
                i = a.f166075q;
            }
            bVar.height = i;
            try {
                setTextColor(C67590h.m263082b(a.f166071m));
            } catch (IllegalColorException e2) {
                AppBrandLogger.eWithThrowable("tma_Textarea", "textArea color error", e2);
            }
            z = true;
        } else {
            z = false;
        }
        if (a.f166057L) {
            bVar.f169723c = a.f166056K;
            z = true;
        }
        if (a.f166084z) {
            bVar.f169724d = a.f166083y;
        }
        setEnabled(!a.f166079u);
        if (a.f166080v) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        this.f166004C = a.f166055J;
        if (z) {
            requestLayout();
        }
        a.f166058M = false;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(String str, WebEventCallback webEventCallback) {
        int i;
        AppBrandLogger.m52830i("tma_Textarea", "addView : ", str);
        C65867b a = C65867b.m258046a(str);
        this.f166032z = a.f166083y;
        this.f166002A = a.f166046A;
        this.f166012f = a;
        this.f166029w = a.f166049D;
        this.f166011e = a.f166082x;
        if (a.f166080v) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        int i2 = a.f166064f;
        int i3 = a.f166061c;
        if (!this.f166032z) {
            i2 -= this.f166030x.getCurScrollY();
            i3 -= this.f166030x.getCurScrollX();
        }
        int i4 = a.f166060b;
        String str2 = a.f166078t;
        this.f166004C = a.f166055J;
        int i5 = a.f166062d;
        if (mo230619i() && i5 < a.f166075q) {
            i5 = a.f166075q;
        }
        if (i5 >= 0) {
            setMinHeight(i5);
        }
        int i6 = a.f166063e;
        if (i6 > 0) {
            setMaxHeight(i6);
        }
        this.f166003B = a.f166074p;
        setPadding(0, 0, 0, 0);
        try {
            setBackgroundColor(Color.parseColor(m258029b(a.f166072n)));
        } catch (IllegalArgumentException unused) {
            setBackgroundColor(Color.parseColor("#00000000"));
        }
        setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.View$OnFocusChangeListenerC658583 */

            public void onFocusChange(View view, boolean z) {
                C65854a.this.f166028v = z;
                if (C65854a.this.f166028v) {
                    if ((C65854a.this.mo230620j() && C65854a.this.f166028v) && !C65854a.this.f166023q) {
                        C65854a.this.postDelayed(new Runnable() {
                            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.View$OnFocusChangeListenerC658583.RunnableC658591 */

                            public void run() {
                                if (C65854a.this.f166010d != null) {
                                    C65854a.this.f166010d.showKeyboard(C65854a.this.f166007a);
                                }
                            }
                        }, 100);
                    }
                    if (C65854a.this.f166023q) {
                        C65854a.this.mo230613d();
                        return;
                    }
                    return;
                }
                AppbrandApplicationImpl.getInst(C65854a.this.f166025s).getRenderViewManager().publish(C65854a.this.f166008b, "onKeyboardComplete", new C67587d().mo234783a("value", C65854a.this.getValue()).mo234783a("inputId", Integer.valueOf(C65854a.this.f166007a)).mo234783a("cursor", Integer.valueOf(C65854a.this.getCursor())).mo234784a().toString());
            }
        });
        int i7 = a.f166076r;
        this.f166020n = i7;
        if (i7 > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(a.f166076r)});
        }
        setGravity(3);
        setHint(str2);
        setText(a.f166047B);
        if (a.f166069k > 0) {
            setLineSpacing((float) a.f166069k, 1.0f);
        }
        setTextSize((float) a.f166068j);
        if (TextUtils.equals(a.f166066h, "bold")) {
            getPaint().setFakeBoldText(true);
        } else {
            getPaint().setFakeBoldText(false);
        }
        if (a.f166050E) {
            if (!TextUtils.isEmpty(a.f166054I)) {
                try {
                    setHintTextColor(C67590h.m263082b(a.f166054I));
                } catch (IllegalColorException e) {
                    AppBrandLogger.eWithThrowable("tma_Textarea", "textArea placeHolderColor error", e);
                }
            }
            if (a.f166051F > 0) {
                setTextSize((float) a.f166051F);
            }
            if (TextUtils.equals(a.f166052G, "bold")) {
                getPaint().setFakeBoldText(true);
            } else {
                getPaint().setFakeBoldText(false);
            }
        }
        try {
            setTextColor(C67590h.m263082b(a.f166071m));
        } catch (IllegalColorException e2) {
            AppBrandLogger.eWithThrowable("tma_Textarea", "textArea color error", e2);
        }
        if (a.f166075q <= 0 || a.f166081w) {
            i = -2;
        } else {
            i = a.f166075q;
        }
        C67231a.C67234b bVar = new C67231a.C67234b(i4 + 1, i, i3 - 1, i2);
        if (a.f166057L) {
            bVar.f169723c = a.f166056K;
        }
        bVar.f169724d = this.f166032z;
        this.f166030x.addView(this, bVar);
        setPadding(1, 0, 0, 0);
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.View$OnTouchListenerC658604 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                C65854a aVar = C65854a.this;
                if (aVar.mo230611a(aVar)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 1) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            }
        });
        setEnabled(!a.f166079u);
        this.f166031y = new IKeyBoardStateChange() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.C658615 */

            @Override // com.tt.miniapp.IKeyBoardStateChange
            public void onKeyboardHide() {
                C65854a.this.f166023q = false;
                AppBrandLogger.m52830i("tma_Textarea", "keyboard hide, switch from input component: " + C65854a.this.f166026t);
                if (C67033g.m261251a()) {
                    if (C65854a.this.f166011e) {
                        C65854a.this.f166010d.hideConfirmBar();
                    }
                    if (C65854a.this.f166026t) {
                        C65854a.this.f166026t = false;
                    } else {
                        C65854a.this.clearFocus();
                    }
                    AppBrandLogger.m52829e("tma_Textarea", "onKeyboardShow onKeyboardHide ", new C67587d().mo234783a("inputId", Integer.valueOf(C65854a.this.f166007a)).mo234783a("cursor", Integer.valueOf(C65854a.this.getCursor())).mo234783a("value", C65854a.this.getValue()).mo234784a().toString());
                }
                while (!C65854a.this.f166016j.empty()) {
                    C65854a.this.f166016j.pop();
                }
                if (C65854a.this.f166011e) {
                    C65854a.this.f166010d.hideConfirmBar();
                }
                if (C65854a.this.f166026t) {
                    C65854a.this.f166026t = false;
                } else {
                    C65854a.this.clearFocus();
                }
                if (C65854a.this.f166027u != null) {
                    C65854a aVar = C65854a.this;
                    aVar.removeCallbacks(aVar.f166027u);
                }
            }

            @Override // com.tt.miniapp.IKeyBoardStateChange
            public void onKeyboardShow(int i, int i2) {
                AppBrandLogger.m52830i("tma_Textarea", "keyboard show, hasFocus: " + C65854a.this.f166028v);
                C65854a.this.f166023q = true;
                if (C65854a.this.f166011e) {
                    C65854a.this.f166010d.showConfirmBar();
                }
                if (C65854a.this.f166028v) {
                    C65854a.this.mo230613d();
                }
            }
        };
        if (a.f166082x) {
            this.f166011e = true;
        }
        this.f166010d.registerKeyBoardStateChange(this.f166031y);
        if (!TextUtils.isEmpty(getText())) {
            setSelection(getText().length());
        }
        addTextChangedListener(new TextWatcher() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.C658626 */

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int i;
                if (C65854a.this.f166013g) {
                    C65854a.this.f166013g = false;
                } else {
                    C65854a.this.mo230618h();
                }
                if (!C65854a.this.f166014h) {
                    C65854a.this.f166014h = true;
                    try {
                        C65854a aVar = C65854a.this;
                        aVar.f166022p = aVar.getCursorRect().bottom;
                        if (!C65854a.this.mo230619i()) {
                            C65854a aVar2 = C65854a.this;
                            aVar2.f166022p = aVar2.getMeasuredHeight();
                        }
                        AppBrandLogger.m52829e("tma_Textarea", "mTextAreaHeight = " + C65854a.this.f166022p);
                        if (C65854a.this.getText().length() == 0) {
                            i = 0;
                        } else {
                            i = C65854a.this.getLineCount();
                        }
                        if (i != C65854a.this.f166015i) {
                            if (!C65854a.this.mo230619i()) {
                                if (C65854a.this.getLayoutParams().height != -2) {
                                    C65854a.this.mo230616g();
                                    int i2 = C65854a.this.getCursorRect().bottom;
                                    if (i2 > C65854a.this.f166022p && !C65854a.this.mo230619i()) {
                                        i2 = C65854a.this.f166022p;
                                    }
                                    int a = C66493a.m259858a(C65854a.this.f166025s);
                                    int[] iArr = new int[2];
                                    C65854a.this.getLocationOnScreen(iArr);
                                    int i3 = iArr[1];
                                    if (C65854a.this.mo230615f() && i > C65854a.this.f166015i && i2 + i3 > C65854a.this.f166021o - a) {
                                        int i4 = ((C65854a.this.f166021o - a) - i2) - i3;
                                        C65854a.this.f166016j.push(Integer.valueOf(i4));
                                        C65854a.this.f166009c.mo233864a(i4, true, C65854a.this);
                                    } else if (!C65854a.this.f166016j.empty() && i < C65854a.this.f166015i && i2 + i3 < C65854a.this.f166021o - a) {
                                        C65854a.this.f166009c.mo233864a(-C65854a.this.f166016j.pop().intValue(), true, C65854a.this);
                                    }
                                }
                            }
                            C65854a.this.mo230614e();
                            C65854a.this.f166014h = false;
                            return;
                        }
                        C65854a.this.f166014h = false;
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("tma_Textarea", "exception happen after text changed e = " + e.getMessage());
                    }
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4;
                C65854a aVar = C65854a.this;
                if (aVar.getText().length() == 0) {
                    i4 = 0;
                } else {
                    i4 = C65854a.this.getLineCount();
                }
                aVar.f166015i = i4;
            }
        });
        this.f166024r = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65854a.ViewTreeObserver$OnGlobalLayoutListenerC658637 */

            public void onGlobalLayout() {
                C65854a.this.mo230612c();
                C65854a.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C65854a.this.f166024r = null;
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.f166024r);
    }

    public C65854a(int i, C67231a aVar, RenderViewManager.IRender iRender, int i2, C67257d dVar) {
        super(aVar.getContext());
        this.f166007a = i;
        this.f166030x = aVar;
        this.f166010d = iRender;
        this.f166008b = i2;
        this.f166009c = dVar;
        this.f166027u = new RunnableC65866a();
    }
}
