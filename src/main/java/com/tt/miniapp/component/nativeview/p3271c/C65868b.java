package com.tt.miniapp.component.nativeview.p3271c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
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
import android.widget.EditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.AbstractC65853c;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.IllegalColorException;
import com.tt.option.ext.WebEventCallback;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.c.b */
public class C65868b extends EditText implements AbstractC65853c, AbstractC65886f {

    /* renamed from: a */
    public int f166085a;

    /* renamed from: b */
    public int f166086b;

    /* renamed from: c */
    public C67257d f166087c;

    /* renamed from: d */
    public RenderViewManager.IRender f166088d;

    /* renamed from: e */
    public C65875a f166089e;

    /* renamed from: f */
    public boolean f166090f = false;

    /* renamed from: g */
    public boolean f166091g;

    /* renamed from: h */
    public int f166092h = 1;

    /* renamed from: i */
    public Stack<Integer> f166093i = new Stack<>();

    /* renamed from: j */
    int f166094j = -1;

    /* renamed from: k */
    int f166095k = -1;

    /* renamed from: l */
    int f166096l = -1;

    /* renamed from: m */
    int f166097m = C67590h.m263091e(getContext());

    /* renamed from: n */
    int f166098n = 0;

    /* renamed from: o */
    public IAppContext f166099o;

    /* renamed from: p */
    public Runnable f166100p = null;

    /* renamed from: q */
    private C67231a f166101q;

    /* renamed from: r */
    private View f166102r;

    /* renamed from: s */
    private int f166103s;

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public String getType() {
        return "textarea";
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    /* renamed from: a */
    public boolean mo230588a() {
        return this.f166089e.f166111A;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    /* renamed from: b */
    public boolean mo230589b() {
        return this.f166089e.f166120J;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public boolean getConfirm() {
        return this.f166089e.f166148x;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getCursor() {
        return getSelectionStart();
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getScrollTop() {
        return getScrollY();
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public boolean hasFocus() {
        return super.hasFocus();
    }

    /* renamed from: g */
    public boolean mo230646g() {
        C65875a aVar = this.f166089e;
        if (aVar == null || !aVar.f166147w) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public int getCursorSpacingHeight() {
        return Math.max(this.f166089e.f166140p, 0);
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65853c
    public String getValue() {
        return getText().toString();
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
    public int getInputHeight() {
        if (getCurrentCursorLine() == getLineCount()) {
            return getMeasuredHeight();
        }
        return getCurrentCursorLine() * getLineHeight();
    }

    /* renamed from: c */
    public void mo230642c() {
        final int i;
        if (getText().length() == 0) {
            i = 0;
        } else {
            i = getLineCount();
        }
        if (i != this.f166092h) {
            mo230644e();
            postDelayed(new Runnable() {
                /* class com.tt.miniapp.component.nativeview.p3271c.C65868b.RunnableC658745 */

                public void run() {
                    if ((C65868b.this.mo230646g() || C65868b.this.getLayoutParams().height == -2) && C65868b.this.f166098n > C65868b.this.f166089e.f166129e && C65868b.this.f166089e.f166129e > 0) {
                        C65868b bVar = C65868b.this;
                        bVar.f166098n = bVar.f166089e.f166129e;
                    } else if (C65868b.this.mo230646g() && C65868b.this.f166098n < C65868b.this.f166089e.f166128d) {
                        C65868b bVar2 = C65868b.this;
                        bVar2.f166098n = bVar2.f166089e.f166128d;
                    }
                    int scrollY = C65868b.this.getCursorRect().bottom - C65868b.this.getScrollY();
                    int a = C66493a.m259858a(C65868b.this.f166099o);
                    int[] iArr = new int[2];
                    C65868b.this.getLocationOnScreen(iArr);
                    int i = iArr[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("textArea bottom y:");
                    int i2 = scrollY + i;
                    sb.append(i2);
                    AppBrandLogger.m52830i("tma_TextArea2", sb.toString(), " keyboard y: ", Integer.valueOf(C65868b.this.f166097m - a));
                    if (C65868b.this.mo230643d() && i > C65868b.this.f166092h && i2 > C65868b.this.f166097m - a) {
                        int i3 = ((C65868b.this.f166097m - a) - scrollY) - i;
                        AppBrandLogger.m52830i("tma_TextArea2", "offset: ", Integer.valueOf(i3));
                        C65868b.this.f166093i.push(Integer.valueOf(i3));
                        C65868b.this.f166087c.mo233864a(i3, true, C65868b.this);
                    } else if (!C65868b.this.f166093i.empty() && i < C65868b.this.f166092h && i2 < C65868b.this.f166097m - a) {
                        C65868b.this.f166087c.mo233864a(-C65868b.this.f166093i.pop().intValue(), true, C65868b.this);
                    }
                }
            }, 60);
        }
    }

    /* renamed from: d */
    public boolean mo230643d() {
        int a = C66493a.m259858a(this.f166099o);
        int i = getCursorRect().bottom;
        if (mo230646g()) {
            if (i < this.f166089e.f166128d) {
                i = getCursorRect().bottom;
            } else if (i > this.f166089e.f166129e && this.f166089e.f166129e > 0) {
                i = this.f166089e.f166129e;
            }
        } else if (i > getMeasuredHeight()) {
            i = getMeasuredHeight();
        }
        int i2 = this.f166098n;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i3 = iArr[1] + i2;
        int i4 = this.f166097m;
        if (i3 <= i4 - a || i + iArr[1] <= i4 - a) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo230645f() {
        AppBrandLogger.m52830i("tma_TextArea2", "sync value change to js, cursor: " + getCursor());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", getValue());
            jSONObject.put("inputId", this.f166085a);
            jSONObject.put("cursor", getCursor());
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f166089e.f166114D);
            C67432a.m262319a(this.f166099o).getJsBridge().sendMsgToJsCore("onKeyboardValueChange", jSONObject.toString(), this.f166086b);
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_TextArea2", e.getStackTrace());
        }
    }

    /* renamed from: e */
    public void mo230644e() {
        try {
            int i = getCursorRect().bottom;
            int i2 = 0;
            if (mo230646g()) {
                if (i < this.f166089e.f166128d) {
                    AppBrandLogger.m52830i("tma_TextArea2", "textAreaHeight < minHeight");
                    i = this.f166089e.f166128d;
                } else {
                    i = getLayout().getHeight();
                }
            }
            AppBrandLogger.m52830i("tma_TextArea2", "sync Height change to js, textArea height: " + i + "px - " + C67589g.m263064a(i) + "rpx");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C67589g.m263064a(i));
            jSONObject.put("inputId", this.f166085a);
            if (getText().length() != 0) {
                i2 = getLineCount();
            }
            jSONObject.put("lineCount", i2);
            AppbrandApplicationImpl.getInst(this.f166099o).getRenderViewManager().publish(this.f166086b, "onTextAreaHeightChange", jSONObject.toString());
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_TextArea2", e.getStackTrace());
        }
    }

    /* renamed from: com.tt.miniapp.component.nativeview.c.b$a */
    public static class C65875a {

        /* renamed from: A */
        boolean f166111A;

        /* renamed from: B */
        String f166112B;

        /* renamed from: C */
        boolean f166113C;

        /* renamed from: D */
        String f166114D;

        /* renamed from: E */
        boolean f166115E;

        /* renamed from: F */
        int f166116F;

        /* renamed from: G */
        String f166117G;

        /* renamed from: H */
        String f166118H;

        /* renamed from: I */
        String f166119I;

        /* renamed from: J */
        boolean f166120J = true;

        /* renamed from: K */
        int f166121K;

        /* renamed from: L */
        boolean f166122L;

        /* renamed from: M */
        public boolean f166123M;

        /* renamed from: N */
        int f166124N;

        /* renamed from: a */
        int f166125a;

        /* renamed from: b */
        int f166126b;

        /* renamed from: c */
        int f166127c;

        /* renamed from: d */
        int f166128d;

        /* renamed from: e */
        int f166129e;

        /* renamed from: f */
        int f166130f;

        /* renamed from: g */
        boolean f166131g;

        /* renamed from: h */
        String f166132h;

        /* renamed from: i */
        String f166133i;

        /* renamed from: j */
        int f166134j;

        /* renamed from: k */
        int f166135k;

        /* renamed from: l */
        String f166136l;

        /* renamed from: m */
        String f166137m;

        /* renamed from: n */
        String f166138n;

        /* renamed from: o */
        boolean f166139o;

        /* renamed from: p */
        int f166140p;

        /* renamed from: q */
        int f166141q;

        /* renamed from: r */
        int f166142r;

        /* renamed from: s */
        boolean f166143s;

        /* renamed from: t */
        String f166144t;

        /* renamed from: u */
        boolean f166145u;

        /* renamed from: v */
        boolean f166146v;

        /* renamed from: w */
        boolean f166147w;

        /* renamed from: x */
        boolean f166148x;

        /* renamed from: y */
        boolean f166149y;

        /* renamed from: z */
        boolean f166150z;

        public String toString() {
            return "TextAreaMode{parentId=" + this.f166125a + ", width=" + this.f166126b + ", left=" + this.f166127c + ", minHeight=" + this.f166128d + ", maxHeight=" + this.f166129e + ", top=" + this.f166130f + ", hasStyle=" + this.f166131g + ", fontWeight='" + this.f166132h + '\'' + ", fontFamily='" + this.f166133i + '\'' + ", fontSize=" + this.f166134j + ", lineSpace=" + this.f166135k + ", textAlign='" + this.f166136l + '\'' + ", color='" + this.f166137m + '\'' + ", marginBottom=" + this.f166140p + ", height=" + this.f166141q + ", maxLength=" + this.f166142r + ", hasPlaceHolder=" + this.f166143s + ", placeHolder='" + this.f166144t + '\'' + ", disabled=" + this.f166145u + ", hidden=" + this.f166146v + ", autoSize=" + this.f166147w + ", confirm=" + this.f166148x + ", fixed=" + this.f166149y + ", value='" + this.f166112B + '\'' + ", hasValue=" + this.f166113C + ", dataObject='" + this.f166114D + '\'' + ", hasPlaceHolderStyle=" + this.f166115E + ", placeHolderFontSize=" + this.f166116F + ", placeHolderFontWeight='" + this.f166117G + '\'' + ", placeHolderontFaFmily='" + this.f166118H + '\'' + ", placeHolderColor='" + this.f166119I + '\'' + '}';
        }

        /* renamed from: a */
        static C65875a m258062a(String str) {
            C65875a aVar = new C65875a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("confirm")) {
                    aVar.f166148x = jSONObject.optBoolean("confirm");
                }
                aVar.f166125a = jSONObject.optInt("parentId");
                aVar.f166114D = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (jSONObject.has("fixed")) {
                    aVar.f166150z = true;
                    aVar.f166149y = jSONObject.optBoolean("fixed");
                }
                aVar.f166111A = jSONObject.optBoolean("adjustPosition", true);
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                if (optJSONObject != null) {
                    aVar.f166131g = true;
                    int optInt = optJSONObject.optInt("lineHeight");
                    aVar.f166124N = optInt;
                    if (optInt > 0) {
                        aVar.f166124N = C67589g.m263062a((double) optInt);
                    }
                    int optInt2 = optJSONObject.optInt("width");
                    aVar.f166126b = optInt2;
                    if (optInt2 > 0) {
                        aVar.f166126b = C67589g.m263062a((double) optInt2);
                    }
                    int optInt3 = optJSONObject.optInt("left");
                    aVar.f166127c = optInt3;
                    if (optInt3 != 0) {
                        aVar.f166127c = C67589g.m263062a((double) optInt3);
                    }
                    int optInt4 = optJSONObject.optInt("minHeight");
                    aVar.f166128d = optInt4;
                    if (optInt4 > 0) {
                        aVar.f166128d = C67589g.m263062a((double) optInt4);
                    }
                    int optInt5 = optJSONObject.optInt("maxHeight");
                    aVar.f166129e = optInt5;
                    if (optInt5 > 0) {
                        aVar.f166129e = C67589g.m263062a((double) optInt5);
                    }
                    int optInt6 = optJSONObject.optInt("top");
                    aVar.f166130f = optInt6;
                    if (optInt6 != 0) {
                        aVar.f166130f = C67589g.m263062a((double) optInt6);
                    }
                    aVar.f166132h = optJSONObject.optString("fontWeight");
                    aVar.f166133i = optJSONObject.optString("fontFamily");
                    aVar.f166134j = optJSONObject.optInt("fontSize");
                    int optInt7 = optJSONObject.optInt("lineSpace");
                    aVar.f166135k = optInt7;
                    if (optInt7 > 0) {
                        aVar.f166135k = C67589g.m263062a((double) optInt7);
                    }
                    aVar.f166136l = optJSONObject.optString("textAlign");
                    aVar.f166137m = optJSONObject.optString("color");
                    aVar.f166138n = optJSONObject.optString("backgroundColor", "#00000000");
                    int optInt8 = optJSONObject.optInt("marginBottom");
                    aVar.f166140p = optInt8;
                    if (optInt8 > 0) {
                        aVar.f166140p = C67589g.m263062a((double) optInt8);
                    }
                    int optInt9 = optJSONObject.optInt("height");
                    aVar.f166141q = optInt9;
                    if (optInt9 > 0) {
                        aVar.f166141q = C67589g.m263062a((double) optInt9);
                    }
                }
                aVar.f166142r = jSONObject.optInt("maxLength");
                if (jSONObject.has("placeholder") && !TextUtils.isEmpty(jSONObject.optString("placeholder"))) {
                    aVar.f166143s = true;
                    aVar.f166144t = jSONObject.optString("placeholder");
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholderStyle");
                if (optJSONObject2 != null) {
                    aVar.f166115E = true;
                    aVar.f166119I = optJSONObject2.optString("color");
                    aVar.f166116F = optJSONObject2.optInt("fontSize");
                    aVar.f166117G = optJSONObject2.optString("fontWeight");
                    aVar.f166118H = optJSONObject2.optString("fontFamily");
                }
                aVar.f166145u = jSONObject.optBoolean("disabled");
                aVar.f166146v = jSONObject.optBoolean("hidden");
                aVar.f166147w = jSONObject.optBoolean("autoSize");
                if (jSONObject.has("value") && !TextUtils.isEmpty(jSONObject.optString("value"))) {
                    aVar.f166113C = true;
                    aVar.f166112B = jSONObject.optString("value");
                }
                if (jSONObject.has("autoBlur")) {
                    aVar.f166120J = jSONObject.getBoolean("autoBlur");
                }
                if (jSONObject.has("zIndex")) {
                    aVar.f166122L = true;
                    aVar.f166121K = jSONObject.optInt("zIndex");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return aVar;
        }

        /* renamed from: a */
        static C65875a m258061a(C65875a aVar, String str) {
            String str2;
            String str3;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("confirm")) {
                    aVar.f166148x = jSONObject.optBoolean("confirm");
                }
                if (jSONObject.has("parentId")) {
                    aVar.f166125a = jSONObject.optInt("parentId");
                }
                if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    aVar.f166114D = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                }
                if (jSONObject.has("fixed")) {
                    aVar.f166150z = true;
                    aVar.f166149y = jSONObject.optBoolean("fixed");
                } else {
                    aVar.f166150z = false;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                if (optJSONObject != null) {
                    aVar.f166131g = true;
                    int optInt = optJSONObject.optInt("width");
                    aVar.f166126b = optInt;
                    str3 = "autoSize";
                    str2 = "hidden";
                    if (optInt > 0) {
                        aVar.f166126b = C67589g.m263062a((double) optInt);
                    }
                    if (optJSONObject.has("left")) {
                        aVar.f166127c = C67589g.m263062a((double) optJSONObject.optInt("left"));
                    }
                    int optInt2 = optJSONObject.optInt("minHeight");
                    aVar.f166128d = optInt2;
                    if (optInt2 > 0) {
                        aVar.f166128d = C67589g.m263062a((double) optInt2);
                    }
                    int optInt3 = optJSONObject.optInt("maxHeight");
                    aVar.f166129e = optInt3;
                    if (optInt3 > 0) {
                        aVar.f166129e = C67589g.m263062a((double) optInt3);
                    }
                    if (optJSONObject.has("top")) {
                        aVar.f166130f = C67589g.m263062a((double) optJSONObject.optInt("top"));
                    }
                    aVar.f166132h = optJSONObject.optString("fontWeight");
                    aVar.f166133i = optJSONObject.optString("fontFamily");
                    aVar.f166134j = optJSONObject.optInt("fontSize");
                    int optInt4 = optJSONObject.optInt("lineSpace");
                    aVar.f166135k = optInt4;
                    if (optInt4 > 0) {
                        aVar.f166135k = C67589g.m263062a((double) optInt4);
                    }
                    aVar.f166136l = optJSONObject.optString("textAlign");
                    aVar.f166137m = optJSONObject.optString("color");
                    if (optJSONObject.has("backgroundColor")) {
                        aVar.f166139o = true;
                        aVar.f166138n = optJSONObject.optString("backgroundColor");
                    }
                    int optInt5 = optJSONObject.optInt("marginBottom");
                    aVar.f166140p = optInt5;
                    if (optInt5 > 0) {
                        aVar.f166140p = C67589g.m263062a((double) optInt5);
                    }
                    int optInt6 = optJSONObject.optInt("height");
                    aVar.f166141q = optInt6;
                    if (optInt6 > 0) {
                        aVar.f166141q = C67589g.m263062a((double) optInt6);
                    }
                } else {
                    str3 = "autoSize";
                    str2 = "hidden";
                    aVar.f166131g = false;
                }
                if (jSONObject.has("maxLength")) {
                    aVar.f166142r = jSONObject.optInt("maxLength");
                }
                if (jSONObject.has("placeholder")) {
                    aVar.f166143s = true;
                    aVar.f166144t = jSONObject.optString("placeholder");
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholderStyle");
                if (optJSONObject2 != null) {
                    aVar.f166115E = true;
                    aVar.f166119I = optJSONObject2.optString("color");
                    aVar.f166116F = optJSONObject2.optInt("fontSize");
                    aVar.f166117G = optJSONObject2.optString("fontWeight");
                    aVar.f166118H = optJSONObject2.optString("fontFamily");
                }
                if (jSONObject.has("disabled")) {
                    aVar.f166145u = jSONObject.optBoolean("disabled");
                }
                if (jSONObject.has(str2)) {
                    aVar.f166146v = jSONObject.optBoolean(str2);
                }
                if (jSONObject.has(str3)) {
                    aVar.f166147w = jSONObject.optBoolean(str3);
                }
                if (jSONObject.has("value")) {
                    aVar.f166123M = true;
                    aVar.f166113C = true;
                    aVar.f166112B = jSONObject.optString("value");
                }
                if (jSONObject.has("autoBlur")) {
                    aVar.f166120J = jSONObject.getBoolean("autoBlur");
                }
                if (jSONObject.has("zIndex")) {
                    aVar.f166122L = true;
                    aVar.f166121K = jSONObject.optInt("zIndex");
                } else {
                    aVar.f166122L = false;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return aVar;
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(IAppContext iAppContext) {
        this.f166099o = iAppContext;
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
    private String m258048b(String str) {
        if (TextUtils.isEmpty(str) || str.charAt(0) != '#' || str.length() != 9) {
            return str;
        }
        return "#" + str.substring(7) + str.substring(1, 7);
    }

    /* renamed from: a */
    public void mo230640a(int i) {
        if (this.f166102r == null) {
            View offsetTargetView = this.f166087c.getOffsetTargetView();
            this.f166102r = offsetTargetView;
            this.f166103s = offsetTargetView.getMeasuredHeight();
        }
        int measuredHeight = getMeasuredHeight() + getTop();
        if (measuredHeight > this.f166103s) {
            ViewGroup.LayoutParams layoutParams = this.f166102r.getLayoutParams();
            layoutParams.height = measuredHeight;
            this.f166102r.setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f166102r.getLayoutParams();
        layoutParams2.height = this.f166103s;
        this.f166102r.setLayoutParams(layoutParams2);
    }

    public void setUpHintStyle(C65875a aVar) {
        if (aVar.f166116F > 0) {
            setTextSize((float) aVar.f166116F);
        }
        if (C67043j.m261284f()) {
            setTextScaleX(1.02f);
        }
        if (TextUtils.equals(aVar.f166117G, "bold")) {
            getPaint().setFakeBoldText(true);
        } else {
            getPaint().setFakeBoldText(false);
        }
    }

    public void setUpTextStyle(C65875a aVar) {
        setTextSize((float) aVar.f166134j);
        if (C67043j.m261284f()) {
            setTextScaleX(1.02f);
        }
        if (TextUtils.equals(aVar.f166132h, "bold")) {
            getPaint().setFakeBoldText(true);
        } else {
            getPaint().setFakeBoldText(false);
        }
    }

    /* renamed from: a */
    private boolean m258047a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("cursor") || jSONObject.has("selectionStart") || jSONObject.has("selectionEnd")) {
                if (jSONObject.has("selectionStart")) {
                    this.f166095k = jSONObject.optInt("selectionStart", -1);
                    if (jSONObject.has("selectionEnd")) {
                        int optInt = jSONObject.optInt("selectionEnd", -1);
                        this.f166096l = optInt;
                        if (optInt <= this.f166095k) {
                            this.f166094j = optInt;
                            this.f166095k = -1;
                            this.f166096l = -1;
                        }
                        if (this.f166089e.f166142r != -1) {
                            this.f166096l = Math.min(this.f166096l, this.f166089e.f166142r);
                        }
                    }
                } else if (jSONObject.has("cursor")) {
                    this.f166094j = jSONObject.optInt("cursor", -1);
                    if (this.f166089e.f166142r != -1) {
                        this.f166094j = Math.min(this.f166094j, this.f166089e.f166142r);
                    }
                }
                return true;
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_TextArea2", "", e);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo230641a(EditText editText) {
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
            AppBrandLogger.m52829e("tma_TextArea2", e);
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

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
        View view;
        removeCallbacks(this.f166100p);
        if (this.f166089e.f166148x) {
            this.f166088d.hideConfirmBar();
        }
        clearFocus();
        AppbrandApplicationImpl.getInst(this.f166099o).getRenderViewManager().publish(this.f166086b, "onKeyboardComplete", new C67587d().mo234783a("inputId", Integer.valueOf(this.f166085a)).mo234783a("cursor", Integer.valueOf(getCursor())).mo234783a("value", getValue()).mo234783a("scrollTop", Integer.valueOf(getScrollTop())).mo234784a().toString());
        if (this.f166103s != -1 && (view = this.f166102r) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f166103s;
            this.f166102r.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
        boolean z;
        int i;
        AppBrandLogger.m52830i("tma_TextArea2", "update view: " + str);
        if (m258047a(str)) {
            int i2 = this.f166095k;
            if (i2 != -1) {
                int i3 = this.f166096l;
                if (i3 == -1) {
                    setSelection(i2, getText().length());
                } else {
                    if (i3 > getText().length()) {
                        this.f166096l = getText().length();
                    }
                    setSelection(this.f166095k, this.f166096l);
                }
            }
            int i4 = this.f166094j;
            if (i4 != -1) {
                if (i4 > getText().length()) {
                    this.f166094j = getText().length();
                }
                setSelection(this.f166094j);
                return;
            }
            return;
        }
        C65875a a = C65875a.m258061a(this.f166089e, str);
        if (a.f166143s) {
            setHint(a.f166144t);
        }
        if (a.f166139o) {
            try {
                setBackgroundColor(Color.parseColor(m258048b(a.f166138n)));
            } catch (IllegalArgumentException unused) {
                AppBrandLogger.m52829e("tma_TextArea2", "TextArea parse backgroundColor failed");
            }
        }
        if (a.f166115E) {
            if (!TextUtils.isEmpty(a.f166119I)) {
                try {
                    setHintTextColor(C67590h.m263082b(a.f166119I));
                } catch (IllegalColorException e) {
                    AppBrandLogger.eWithThrowable("tma_TextArea2", "textarea placeHolderColor error", e);
                }
            }
            if (a.f166116F > 0 && TextUtils.isEmpty(a.f166112B)) {
                setTextSize((float) a.f166116F);
            }
        }
        if (a.f166142r > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(a.f166142r)});
        }
        if (a.f166113C && !TextUtils.equals(getValue(), a.f166112B) && a.f166123M) {
            this.f166091g = true;
            setText(a.f166112B);
            setSelection(CharacterUtils.length(a.f166112B));
        }
        C67231a.C67234b bVar = (C67231a.C67234b) getLayoutParams();
        if (a.f166131g) {
            int curScrollX = this.f166101q.getCurScrollX();
            int curScrollY = this.f166101q.getCurScrollY();
            if (a.f166149y) {
                curScrollX = 0;
                curScrollY = 0;
            }
            bVar.f169721a = a.f166127c - curScrollX;
            bVar.f169722b = a.f166130f - curScrollY;
            this.f166101q.mo233795a(this.f166085a);
            bVar.width = a.f166126b;
            if (a.f166141q <= 0 || mo230646g()) {
                i = -2;
            } else {
                i = a.f166141q;
            }
            bVar.height = i;
            try {
                setTextColor(C67590h.m263082b(a.f166137m));
            } catch (IllegalColorException e2) {
                AppBrandLogger.eWithThrowable("tma_TextArea2", "textArea color error", e2);
            }
            z = true;
        } else {
            z = false;
        }
        if (a.f166122L) {
            bVar.f169723c = a.f166121K;
            z = true;
        }
        if (a.f166150z) {
            bVar.f169724d = a.f166149y;
        }
        setEnabled(true ^ a.f166145u);
        if (a.f166146v) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        if (z) {
            requestLayout();
        }
        a.f166123M = false;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(String str, WebEventCallback webEventCallback) {
        int i;
        AppBrandLogger.m52830i("tma_TextArea2", "addView : ", str);
        C65875a a = C65875a.m258062a(str);
        this.f166089e = a;
        if (a.f166146v) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        int i2 = a.f166130f;
        int i3 = a.f166127c;
        if (!a.f166149y) {
            i2 -= this.f166101q.getCurScrollY();
            i3 -= this.f166101q.getCurScrollX();
        }
        int i4 = a.f166126b;
        String str2 = a.f166144t;
        int i5 = a.f166128d;
        if (i5 >= 0) {
            setMinHeight(i5);
        }
        int i6 = a.f166129e;
        if (i6 > 0) {
            setMaxHeight(i6);
        }
        setPadding(0, 0, 0, 0);
        try {
            setBackgroundColor(Color.parseColor(m258048b(a.f166138n)));
        } catch (IllegalArgumentException unused) {
            setBackgroundColor(Color.parseColor("#00000000"));
        }
        if (a.f166142r > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(a.f166142r)});
        }
        setGravity(3);
        setHint(str2);
        setText(a.f166112B);
        setUpTextStyle(a);
        setIncludeFontPadding(false);
        if (a.f166124N > 0) {
            AppBrandLogger.m52830i("tma_TextArea2", "Use web lineHeight: " + a.f166124N + " textSize: " + getTextSize() + " extra spacing:" + ((((float) a.f166124N) - getTextSize()) / 2.0f));
            setLineSpacing((((float) a.f166124N) - getTextSize()) / 2.0f, 1.0f);
        } else if (a.f166135k > 0) {
            setLineSpacing((float) a.f166135k, 1.0f);
        }
        if (a.f166115E) {
            if (!TextUtils.isEmpty(a.f166119I)) {
                try {
                    setHintTextColor(C67590h.m263082b(a.f166119I));
                } catch (IllegalColorException e) {
                    AppBrandLogger.eWithThrowable("tma_TextArea2", "textArea placeHolderColor error", e);
                }
            }
            this.f166090f = true;
            if (TextUtils.isEmpty(a.f166112B)) {
                setUpHintStyle(a);
            }
        }
        try {
            setTextColor(C67590h.m263082b(a.f166137m));
        } catch (IllegalColorException e2) {
            AppBrandLogger.eWithThrowable("tma_TextArea2", "textArea color error", e2);
        }
        if (a.f166141q <= 0 || a.f166147w) {
            i = -2;
        } else {
            i = a.f166141q;
        }
        C67231a.C67234b bVar = new C67231a.C67234b(i4 + 1, i, i3 - 1, i2);
        if (a.f166122L) {
            bVar.f169723c = a.f166121K;
        }
        bVar.f169724d = a.f166149y;
        this.f166101q.addView(this, bVar);
        setPadding(1, 0, 0, 0);
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65868b.View$OnTouchListenerC658691 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                C65868b bVar = C65868b.this;
                if (bVar.mo230641a(bVar)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 1) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            }
        });
        setEnabled(!a.f166145u);
        if (this.f166089e.f166148x) {
            this.f166088d.showConfirmBar();
        }
        if (!TextUtils.isEmpty(getText())) {
            setSelection(getText().length());
        }
        addTextChangedListener(new TextWatcher() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65868b.C658702 */

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.length() == 0 && C65868b.this.f166090f) {
                    C65868b bVar = C65868b.this;
                    bVar.setUpHintStyle(bVar.f166089e);
                } else if (C65868b.this.f166090f) {
                    C65868b bVar2 = C65868b.this;
                    bVar2.setUpTextStyle(bVar2.f166089e);
                }
                C65868b.this.post(new Runnable() {
                    /* class com.tt.miniapp.component.nativeview.p3271c.C65868b.C658702.RunnableC658711 */

                    public void run() {
                        int i;
                        if (C65868b.this.f166091g) {
                            C65868b.this.f166091g = false;
                        } else {
                            C65868b.this.mo230645f();
                        }
                        C65868b.this.f166098n = C65868b.this.getCursorRect().bottom;
                        if (!C65868b.this.mo230646g()) {
                            C65868b.this.f166098n = C65868b.this.getMeasuredHeight();
                        }
                        if (C65868b.this.getText().length() == 0) {
                            i = 0;
                        } else {
                            i = C65868b.this.getLineCount();
                        }
                        if (i == C65868b.this.f166092h) {
                            return;
                        }
                        if (C65868b.this.mo230646g() || C65868b.this.getLayoutParams().height == -2) {
                            C65868b.this.mo230642c();
                            return;
                        }
                        C65868b.this.mo230644e();
                        int i2 = C65868b.this.getCursorRect().bottom;
                        if (i2 > C65868b.this.f166098n && !C65868b.this.mo230646g()) {
                            i2 = C65868b.this.f166098n;
                        }
                        int a = C66493a.m259858a(C65868b.this.f166099o);
                        int[] iArr = new int[2];
                        C65868b.this.getLocationOnScreen(iArr);
                        int i3 = iArr[1];
                        if (C65868b.this.mo230643d() && i > C65868b.this.f166092h && i2 + i3 > C65868b.this.f166097m - a) {
                            int i4 = ((C65868b.this.f166097m - a) - i2) - i3;
                            AppBrandLogger.m52829e("tma_TextArea2", "offset:" + i4);
                            C65868b.this.f166093i.push(Integer.valueOf(i4));
                            C65868b.this.f166087c.mo233864a(i4, true, C65868b.this);
                        } else if (!C65868b.this.f166093i.empty() && i < C65868b.this.f166092h && i2 + i3 < C65868b.this.f166097m - a) {
                            C65868b.this.f166087c.mo233864a(-C65868b.this.f166093i.pop().intValue(), true, C65868b.this);
                        }
                    }
                });
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4;
                C65868b bVar = C65868b.this;
                if (bVar.getText().length() == 0) {
                    i4 = 0;
                } else {
                    i4 = C65868b.this.getLineCount();
                }
                bVar.f166092h = i4;
            }
        });
        if (m258047a(str)) {
            int i7 = this.f166095k;
            if (i7 != -1) {
                int i8 = this.f166096l;
                if (i8 == -1) {
                    setSelection(i7, getText().length());
                } else {
                    if (i8 > getText().length()) {
                        this.f166096l = getText().length();
                    }
                    setSelection(this.f166095k, this.f166096l);
                }
            }
            int i9 = this.f166094j;
            if (i9 != -1) {
                if (i9 > getText().length()) {
                    this.f166094j = getText().length();
                }
                setSelection(this.f166094j);
            }
        }
        setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65868b.View$OnFocusChangeListenerC658723 */

            public void onFocusChange(View view, boolean z) {
                AppBrandLogger.m52830i("tma_TextArea2", "onFocusChange, hasFocus: " + z);
                if (!z) {
                    C65868b bVar = C65868b.this;
                    bVar.removeCallbacks(bVar.f166100p);
                    if (C66493a.m259858a(C65868b.this.f166099o) != 0) {
                        C67047m.m261306a((EditText) C65868b.this, (Context) AppbrandContext.getInst().getApplicationContext());
                    }
                    if (C65868b.this.f166088d != null && C65868b.this.f166088d.hasNativeView(C65868b.this.f166085a)) {
                        C65868b.this.f166088d.removeNativeView(C65868b.this.f166085a, null);
                    }
                }
            }
        });
        RunnableC658734 r12 = new Runnable() {
            /* class com.tt.miniapp.component.nativeview.p3271c.C65868b.RunnableC658734 */

            public void run() {
                C65868b.this.mo230644e();
                C67047m.m261305a((View) C65868b.this, (Context) AppbrandContext.getInst().getApplicationContext());
                HostDependManager.getInst().triggerSoftKeyBoardShowEvent(C65868b.this.f166086b, C65868b.this.f166085a, C65868b.this.f166099o);
            }
        };
        this.f166100p = r12;
        postDelayed(r12, 100);
    }

    public C65868b(int i, C67231a aVar, RenderViewManager.IRender iRender, int i2, C67257d dVar) {
        super(aVar.getContext());
        this.f166085a = i;
        this.f166101q = aVar;
        this.f166088d = iRender;
        this.f166086b = i2;
        this.f166087c = dVar;
    }
}
