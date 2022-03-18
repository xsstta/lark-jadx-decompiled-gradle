package com.tt.miniapp.component.nativeview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.view.C67163c;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapp.view.webcore.p3351c.AbstractC67254c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.IllegalColorException;
import com.tt.option.ext.WebEventCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.b */
public class C65844b extends EditText implements AbstractC65853c, AbstractC65886f {

    /* renamed from: a */
    public int f165936a;

    /* renamed from: b */
    public int f165937b;

    /* renamed from: c */
    public RenderViewManager.IRender f165938c;

    /* renamed from: d */
    public boolean f165939d;

    /* renamed from: e */
    public int f165940e;

    /* renamed from: f */
    public C67257d f165941f;

    /* renamed from: g */
    public boolean f165942g = false;

    /* renamed from: h */
    public IAppContext f165943h;

    /* renamed from: i */
    public Runnable f165944i = null;

    /* renamed from: j */
    private C67231a f165945j;

    /* renamed from: k */
    private String f165946k;

    /* renamed from: l */
    private String f165947l;

    /* renamed from: m */
    private boolean f165948m;

    /* renamed from: n */
    private boolean f165949n = true;

    /* renamed from: o */
    private boolean f165950o = true;

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public boolean getConfirm() {
        return false;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getScrollTop() {
        return 0;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public String getType() {
        return "input";
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    /* renamed from: a */
    public boolean mo230588a() {
        return this.f165949n;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    /* renamed from: b */
    public boolean mo230589b() {
        return this.f165950o;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getCursor() {
        return getSelectionStart();
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public boolean hasFocus() {
        return super.hasFocus();
    }

    /* renamed from: d */
    private void m258014d() {
        if (this.f165942g) {
            post(new Runnable() {
                /* class com.tt.miniapp.component.nativeview.C65844b.RunnableC658451 */

                public void run() {
                    AbstractC67254c scroller = C65844b.this.f165941f.getScroller();
                    if (scroller != null) {
                        Rect rect = new Rect();
                        C65844b.this.f165941f.getGlobalVisibleRect(rect);
                        int a = scroller.mo233854a(C65844b.this, rect, 1);
                        if (a != 0) {
                            C65844b.this.f165941f.mo233863a(a, C65844b.this);
                        }
                    }
                }
            });
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public String getValue() {
        return getText().toString();
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getCursorSpacingHeight() {
        if (HostDependManager.getInst().getFeatureGating("gadget.input.cursorspacing")) {
            return Math.max(0, this.f165940e);
        }
        return 0;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getInputHeight() {
        if (HostDependManager.getInst().getFeatureGating("gadget.input.cursorspacing") || this.f165940e <= 0) {
            return getMeasuredHeight();
        }
        return getMeasuredHeight() + this.f165940e;
    }

    /* renamed from: c */
    public void mo230590c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", getValue());
            jSONObject.put("inputId", this.f165936a);
            jSONObject.put("cursor", getCursor());
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f165946k);
            C67432a.m262319a(this.f165943h).getJsBridge().sendMsgToJsCore("onKeyboardValueChange", jSONObject.toString(), this.f165937b);
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_Input", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(IAppContext iAppContext) {
        this.f165943h = iAppContext;
    }

    public void setValue(String str) {
        setText(str);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 3) {
            clearFocus();
        }
        return onTouchEvent;
    }

    public void setSelection(int i) {
        if (i <= getText().length()) {
            super.setSelection(i);
        }
    }

    /* renamed from: com.tt.miniapp.component.nativeview.b$a */
    public static class C65850a {

        /* renamed from: A */
        boolean f165956A;

        /* renamed from: B */
        int f165957B = -1;

        /* renamed from: C */
        int f165958C = -1;

        /* renamed from: D */
        int f165959D = -1;

        /* renamed from: E */
        int f165960E;

        /* renamed from: F */
        boolean f165961F;

        /* renamed from: G */
        boolean f165962G;

        /* renamed from: H */
        boolean f165963H;

        /* renamed from: I */
        boolean f165964I = true;

        /* renamed from: a */
        String f165965a;

        /* renamed from: b */
        int f165966b;

        /* renamed from: c */
        boolean f165967c;

        /* renamed from: d */
        boolean f165968d;

        /* renamed from: e */
        int f165969e;

        /* renamed from: f */
        int f165970f;

        /* renamed from: g */
        int f165971g;

        /* renamed from: h */
        int f165972h;

        /* renamed from: i */
        String f165973i;

        /* renamed from: j */
        int f165974j;

        /* renamed from: k */
        String f165975k;

        /* renamed from: l */
        public String f165976l;

        /* renamed from: m */
        String f165977m;

        /* renamed from: n */
        int f165978n;

        /* renamed from: o */
        String f165979o;

        /* renamed from: p */
        String f165980p;

        /* renamed from: q */
        boolean f165981q;

        /* renamed from: r */
        int f165982r;

        /* renamed from: s */
        String f165983s;

        /* renamed from: t */
        String f165984t;

        /* renamed from: u */
        String f165985u;

        /* renamed from: v */
        String f165986v;

        /* renamed from: w */
        String f165987w;

        /* renamed from: x */
        String f165988x;

        /* renamed from: y */
        String f165989y;

        /* renamed from: z */
        boolean f165990z;

        /* renamed from: a */
        public static C65850a m258021a(String str) {
            JSONObject jSONObject;
            C65850a aVar = new C65850a();
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                aVar.f165965a = jSONObject2.optString(ShareHitPoint.f121869d);
                aVar.f165966b = jSONObject2.optInt("maxLength");
                aVar.f165967c = jSONObject2.optBoolean("password");
                aVar.f165988x = jSONObject2.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                aVar.f165990z = jSONObject2.optBoolean("fixed", false);
                aVar.f165956A = jSONObject2.optBoolean("adjustPosition", true);
                JSONObject optJSONObject = jSONObject2.optJSONObject("style");
                if (optJSONObject != null) {
                    aVar.f165968d = true;
                    aVar.f165974j = optJSONObject.optInt("fontSize");
                    aVar.f165973i = optJSONObject.optString("fontFamily");
                    aVar.f165975k = optJSONObject.optString("fontWeight");
                    int optInt = optJSONObject.optInt("width");
                    aVar.f165969e = optInt;
                    jSONObject = jSONObject2;
                    if (optInt > 0) {
                        aVar.f165969e = C67589g.m263062a((double) optInt);
                    }
                    int optDouble = (int) optJSONObject.optDouble("height");
                    aVar.f165970f = optDouble;
                    if (optDouble > 0) {
                        aVar.f165970f = C67589g.m263062a(optJSONObject.optDouble("height"));
                    }
                    int optInt2 = optJSONObject.optInt("left");
                    aVar.f165971g = optInt2;
                    if (optInt2 > 0) {
                        aVar.f165971g = C67589g.m263062a((double) optInt2);
                    }
                    int optInt3 = optJSONObject.optInt("top");
                    aVar.f165972h = optInt3;
                    if (optInt3 > 0) {
                        aVar.f165972h = C67589g.m263062a((double) optInt3);
                    }
                    int optInt4 = optJSONObject.optInt("marginBottom");
                    aVar.f165978n = optInt4;
                    if (optInt4 > 0) {
                        aVar.f165978n = C67589g.m263062a((double) optInt4);
                    }
                    aVar.f165979o = optJSONObject.optString("textAlign");
                    aVar.f165977m = optJSONObject.optString("backgroundColor");
                    aVar.f165976l = optJSONObject.optString("color");
                } else {
                    jSONObject = jSONObject2;
                }
                aVar.f165980p = jSONObject.optString("placeholder");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholderStyle");
                if (optJSONObject2 != null) {
                    aVar.f165981q = true;
                    aVar.f165983s = optJSONObject2.optString("color");
                    aVar.f165982r = optJSONObject2.optInt("fontSize");
                    aVar.f165984t = optJSONObject2.optString("fontWeight");
                    aVar.f165985u = aVar.f165973i;
                }
                if (jSONObject.has("defaultValue")) {
                    aVar.f165986v = jSONObject.optString("defaultValue");
                } else {
                    aVar.f165987w = jSONObject.optString("value");
                }
                aVar.f165989y = jSONObject.optString("confirmType");
                if (jSONObject.has("selectionStart")) {
                    aVar.f165958C = jSONObject.optInt("selectionStart", -1);
                    if (jSONObject.has("selectionEnd")) {
                        int optInt5 = jSONObject.optInt("selectionEnd", -1);
                        aVar.f165959D = optInt5;
                        if (optInt5 <= aVar.f165958C) {
                            aVar.f165957B = optInt5;
                            aVar.f165958C = -1;
                            aVar.f165959D = -1;
                        }
                        int i = aVar.f165966b;
                        if (i != -1) {
                            aVar.f165959D = Math.min(aVar.f165959D, i);
                        }
                    }
                } else if (jSONObject.has("cursor")) {
                    int optInt6 = jSONObject.optInt("cursor", -1);
                    aVar.f165957B = optInt6;
                    int i2 = aVar.f165966b;
                    if (i2 != -1) {
                        aVar.f165957B = Math.min(optInt6, i2);
                    }
                }
                if (jSONObject.has("zIndex")) {
                    aVar.f165961F = true;
                    aVar.f165960E = jSONObject.optInt("zIndex");
                }
                if (jSONObject.has("fixed")) {
                    aVar.f165963H = true;
                    aVar.f165962G = jSONObject.optBoolean("fixed");
                }
                if (jSONObject.has("autoBlur")) {
                    aVar.f165964I = jSONObject.getBoolean("autoBlur");
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_Input", "", e);
            }
            return aVar;
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

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
        removeCallbacks(this.f165944i);
        AppbrandApplicationImpl.getInst(this.f165943h).getRenderViewManager().publish(this.f165937b, "onKeyboardComplete", new C67587d().mo234783a("value", getValue()).mo234783a("inputId", Integer.valueOf(this.f165936a)).mo234783a("cursor", Integer.valueOf(getCursor())).mo234784a().toString());
        if (ContextSingletonInstance.getInstance().input == this) {
            ContextSingletonInstance.getInstance().input = null;
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
        boolean z;
        RenderViewManager.IRender iRender;
        AppBrandLogger.m52830i("tma_Input", "update view");
        try {
            C65876d a = C65876d.m258063a(str);
            this.f165950o = a.f166169s;
            if (!a.f166153c || !a.f166151a || !TextUtils.isEmpty(a.f166154d) || !TextUtils.isEmpty(a.f166152b) || (iRender = this.f165938c) == null) {
                if (a.f166151a) {
                    setHint(a.f166152b);
                }
                if (a.f166153c && !TextUtils.equals(getValue(), a.f166154d)) {
                    this.f165939d = true;
                    setText(a.f166154d);
                    setSelection(CharacterUtils.length(a.f166154d));
                }
                C67231a.C67234b bVar = (C67231a.C67234b) getLayoutParams();
                if (a.f166156f) {
                    AppBrandLogger.m52828d("tma_Input", "width ", Integer.valueOf(a.f166157g), " height ", Integer.valueOf(a.f166158h), " x ", Integer.valueOf(a.f166159i), " y ", Integer.valueOf(a.f166160j));
                    bVar.f169721a = a.f166159i - this.f165945j.getCurScrollX();
                    bVar.f169722b = a.f166160j - this.f165945j.getCurScrollY();
                    this.f165945j.mo233795a(this.f165936a);
                    bVar.width = a.f166157g;
                    bVar.height = a.f166158h;
                    if (!TextUtils.isEmpty(a.f166162l)) {
                        try {
                            setTextColor(C67590h.m263082b(a.f166162l));
                        } catch (IllegalColorException e) {
                            AppBrandLogger.eWithThrowable("tma_Input", "input textColor color", e);
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (a.f166168r) {
                    bVar.f169724d = a.f166167q;
                }
                if (a.f166166p) {
                    bVar.f169723c = a.f166165o;
                    z = true;
                }
                if (z) {
                    requestLayout();
                }
                m258014d();
                return;
            }
            iRender.removeNativeView(a.f166155e, null);
        } catch (JSONException e2) {
            AppBrandLogger.m52829e("tma_Input", "updateView", e2);
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(String str, WebEventCallback webEventCallback) {
        String str2;
        C65850a a = C65850a.m258021a(str);
        this.f165948m = a.f165990z;
        this.f165949n = a.f165956A;
        this.f165946k = a.f165988x;
        RenderViewManager.IRender iRender = this.f165938c;
        if (!(iRender == null || iRender.getNativeViewManager() == null)) {
            this.f165938c.getNativeViewManager().setShowConfirmBar(false);
        }
        this.f165950o = a.f165964I;
        if (a.f165968d) {
            int i = a.f165969e;
            int i2 = a.f165970f;
            int i3 = a.f165971g;
            int i4 = a.f165972h;
            if (!this.f165948m) {
                i3 -= this.f165945j.getCurScrollX();
                i4 -= this.f165945j.getCurScrollY();
            }
            int i5 = a.f165966b;
            this.f165940e = a.f165978n;
            boolean z = a.f165967c;
            if (!TextUtils.isEmpty(a.f165977m)) {
                try {
                    setBackgroundColor(C67590h.m263082b(a.f165977m));
                } catch (IllegalColorException e) {
                    AppBrandLogger.eWithThrowable("tma_Input", "input backgroundColor error", e);
                }
                AppBrandLogger.m52830i("tma_Input", "addView: Color = " + a.f165977m);
            }
            if (!TextUtils.isEmpty(a.f165976l)) {
                try {
                    setTextColor(C67590h.m263082b(a.f165976l));
                } catch (IllegalColorException e2) {
                    AppBrandLogger.eWithThrowable("tma_Input", "input textColor color", e2);
                }
            }
            if (i5 > 0) {
                setFilters(new InputFilter[]{new InputFilter.LengthFilter(i5)});
            }
            if (a.f165974j > 0) {
                setTextSize((float) a.f165974j);
            }
            if (!TextUtils.isEmpty(a.f165975k)) {
                TextPaint paint = getPaint();
                if (TextUtils.equals(a.f165975k, "bold")) {
                    paint.setFakeBoldText(true);
                } else {
                    paint.setFakeBoldText(false);
                }
            }
            if (TextUtils.equals(a.f165979o, "center")) {
                setGravity(17);
            } else if (TextUtils.equals(a.f165979o, "left")) {
                setGravity(19);
            } else if (TextUtils.equals(a.f165979o, "right")) {
                setGravity(21);
            }
            AppBrandLogger.m52828d("tma_Input", "width ", Integer.valueOf(i), " height ", Integer.valueOf(i2), " x ", Integer.valueOf(i3), " y ", Integer.valueOf(i4));
            setSingleLine(true);
            setHint(a.f165980p);
            if (!TextUtils.isEmpty(a.f165986v)) {
                str2 = a.f165986v;
            } else {
                str2 = a.f165987w;
            }
            setText(str2);
            if (a.f165981q) {
                if (!TextUtils.isEmpty(a.f165983s)) {
                    try {
                        setHintTextColor(C67590h.m263082b(a.f165983s));
                    } catch (IllegalColorException e3) {
                        AppBrandLogger.eWithThrowable("tma_Input", "input placeHolderColor error", e3);
                    }
                }
                if (a.f165982r > 0) {
                    setTextSize((float) a.f165982r);
                }
                if (!TextUtils.isEmpty(a.f165984t)) {
                    TextPaint paint2 = getPaint();
                    if (TextUtils.equals(a.f165975k, "bold")) {
                        paint2.setFakeBoldText(true);
                    } else {
                        paint2.setFakeBoldText(false);
                    }
                }
            }
            C67231a.C67234b bVar = new C67231a.C67234b(i + 1, i2, i3 - 1, i4);
            if (a.f165961F) {
                bVar.f169723c = a.f165960E;
            }
            if (a.f165963H) {
                bVar.f169724d = a.f165962G;
            }
            this.f165945j.addView(this, bVar);
            setPadding(1, 0, 0, 0);
            if (!TextUtils.isEmpty(getText())) {
                setSelection(getText().length());
            }
            if (z) {
                setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (this.f165947l.equals("text")) {
                setInputType(1);
                setImeOptions(6);
            } else if (this.f165947l.equals("digit")) {
                setKeyListener(DigitsKeyListener.getInstance("0123456789,.-"));
                setImeOptions(6);
            } else if (this.f165947l.equals("number")) {
                setInputType(2);
                setImeOptions(6);
            } else if (this.f165947l.equals("idcard")) {
                setKeyListener(DigitsKeyListener.getInstance("0123456789X"));
                setRawInputType(1);
                setImeOptions(6);
            }
            if (a.f165958C != -1) {
                if (a.f165959D == -1) {
                    setSelection(a.f165958C, getText().length());
                } else {
                    if (a.f165959D > getText().length()) {
                        a.f165959D = getText().length();
                    }
                    setSelection(a.f165958C, a.f165959D);
                }
            }
            AppBrandLogger.m52828d("tma_Input", "inputMode.cursor = " + a.f165957B);
            if (a.f165957B != -1) {
                if (a.f165957B > getText().length()) {
                    a.f165957B = getText().length();
                }
                setSelection(a.f165957B);
            }
            addTextChangedListener(new C67163c() {
                /* class com.tt.miniapp.component.nativeview.C65844b.C658462 */

                @Override // com.tt.miniapp.view.C67163c
                public void afterTextChanged(Editable editable) {
                    if (C65844b.this.f165939d) {
                        C65844b.this.f165939d = false;
                    } else {
                        C65844b.this.mo230590c();
                    }
                }
            });
            setOnEditorActionListener(new TextView.OnEditorActionListener() {
                /* class com.tt.miniapp.component.nativeview.C65844b.C658473 */

                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    AppbrandApplicationImpl.getInst(C65844b.this.f165943h).getRenderViewManager().publish(C65844b.this.f165937b, "onKeyboardConfirm", new C67587d().mo234783a("value", C65844b.this.getValue()).mo234783a("inputId", Integer.valueOf(C65844b.this.f165936a)).mo234783a("cursor", Integer.valueOf(C65844b.this.getCursor())).mo234784a().toString());
                    return false;
                }
            });
            setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.tt.miniapp.component.nativeview.C65844b.View$OnFocusChangeListenerC658484 */

                public void onFocusChange(View view, boolean z) {
                    AppBrandLogger.m52830i("tma_Input", "focus change: " + z);
                    C65844b.this.f165942g = z;
                    if (!z) {
                        C65844b bVar = C65844b.this;
                        bVar.removeCallbacks(bVar.f165944i);
                        if (C66493a.m259858a(C65844b.this.f165943h) != 0) {
                            C67047m.m261306a((EditText) C65844b.this, (Context) AppbrandContext.getInst().getApplicationContext());
                        }
                        if (C65844b.this.f165938c != null && C65844b.this.f165938c.hasNativeView(C65844b.this.f165936a)) {
                            C65844b.this.f165938c.removeNativeView(C65844b.this.f165936a, null);
                        }
                    }
                }
            });
            RunnableC658495 r14 = new Runnable() {
                /* class com.tt.miniapp.component.nativeview.C65844b.RunnableC658495 */

                public void run() {
                    C67047m.m261305a((View) C65844b.this, (Context) AppbrandContext.getInst().getApplicationContext());
                    HostDependManager.getInst().triggerSoftKeyBoardShowEvent(C65844b.this.f165937b, C65844b.this.f165936a, C65844b.this.f165943h);
                }
            };
            this.f165944i = r14;
            postDelayed(r14, 100);
        }
    }

    private C65844b(int i, C67231a aVar, RenderViewManager.IRender iRender, int i2, String str, C67257d dVar) {
        super(aVar.getContext());
        this.f165936a = i;
        this.f165945j = aVar;
        this.f165938c = iRender;
        this.f165937b = i2;
        this.f165947l = str;
        this.f165941f = dVar;
    }

    /* renamed from: a */
    public static C65844b m258013a(int i, C67231a aVar, RenderViewManager.IRender iRender, int i2, String str, C67257d dVar) {
        RenderViewManager.IRender iRender2;
        C65844b bVar = ContextSingletonInstance.getInstance().input;
        if (!(bVar == null || (iRender2 = bVar.f165938c) == null || !iRender2.hasNativeView(bVar.f165936a))) {
            bVar.f165938c.removeNativeView(bVar.f165936a, null);
        }
        return new C65844b(i, aVar, iRender, i2, str, dVar);
    }
}
