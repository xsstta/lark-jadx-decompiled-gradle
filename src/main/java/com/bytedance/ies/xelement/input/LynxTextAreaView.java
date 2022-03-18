package com.bytedance.ies.xelement.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.bytedance.ies.xelement.input.LynxInputConnectionWrapper;
import com.bytedance.ies.xelement.text.emoji.DummyEmojiAdapter;
import com.bytedance.ies.xelement.text.emoji.ILynxEmojiAdapter;
import com.bytedance.ies.xelement.text.emoji.LynxEmojiResHelper;
import com.bytedance.ies.xelement.text.emoji.LynxEmojiSpan;
import com.bytedance.ies.xelement.text.emoji.LynxEmojiViewHelper;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import com.lynx.tasm.utils.C26960n;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\u0016\u0018\u0000 ¤\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004¤\u0001¥\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0007J\u0010\u0010L\u001a\u00020G2\u0006\u0010M\u001a\u00020\u0013H\u0002J\u0012\u0010N\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010P\u001a\u00020G2\u0006\u0010Q\u001a\u00020\u0002H\u0016J\u001a\u0010R\u001a\u00020G2\u0006\u0010Q\u001a\u00020\u00022\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u0013H\u0016J\u0010\u0010V\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\u0013H\u0002J\u001a\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u0013H\u0002J\b\u0010[\u001a\u00020GH\u0004J\b\u0010\\\u001a\u00020]H\u0002J\u0006\u0010^\u001a\u00020\u0013J\b\u0010_\u001a\u00020\u0015H\u0002J\b\u0010`\u001a\u00020\u0015H\u0016J\b\u0010a\u001a\u00020\u0015H\u0002J\b\u0010b\u001a\u00020GH\u0016J\b\u0010c\u001a\u00020GH\u0004J\u0018\u0010d\u001a\u00020G2\u0006\u0010e\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u0015H\u0016J\b\u0010g\u001a\u00020GH\u0002J\b\u0010h\u001a\u00020GH\u0007J\b\u0010i\u001a\u00020GH\u0002J\b\u0010j\u001a\u00020GH\u0002J\u0018\u0010k\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0007J\u0010\u0010l\u001a\u00020G2\u0006\u0010m\u001a\u00020\u0011H\u0007J\u0010\u0010n\u001a\u00020G2\u0006\u0010o\u001a\u00020\u0015H\u0007J\u0010\u0010p\u001a\u00020G2\u0006\u0010q\u001a\u00020\u0011H\u0007J\u0012\u0010r\u001a\u00020G2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010s\u001a\u00020G2\b\u0010t\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010u\u001a\u00020G2\u0006\u0010Q\u001a\u00020v2\u0006\u0010t\u001a\u00020\u0013H\u0002J\u0010\u0010w\u001a\u00020G2\u0006\u0010x\u001a\u00020\u0015H\u0007J\u0012\u0010y\u001a\u00020G2\b\u0010z\u001a\u0004\u0018\u00010\u0011H\u0002J\u001e\u0010{\u001a\u00020G2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020}\u0018\u00010|H\u0016J\u0010\u0010~\u001a\u00020G2\u0006\u0010\u001a\u00020\u0015H\u0007J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010t\u001a\u00030\u0001H\u0007J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010\u0001\u001a\u00020BH\u0007J\u0013\u0010\u0001\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0007J\u0013\u0010\u0001\u001a\u00020G2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0007J\u0014\u0010\u0001\u001a\u00020G2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010\u0001\u001a\u00020\u0015H\u0007J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010\u0001\u001a\u00020\u0015H\u0007J\u0014\u0010\u0001\u001a\u00020G2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0011H\u0007J\u0015\u0010\u0001\u001a\u00020G2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0007J\u001a\u0010\u0001\u001a\u00020G2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0003\u0010\u0001J\u0014\u0010\u0001\u001a\u00020G2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010\u0001\u001a\u00020IH\u0007J\u0014\u0010\u0001\u001a\u00020G2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010t\u001a\u00030\u0001H\u0007J\u0013\u0010\u0001\u001a\u00020G2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0011\u0010\u0001\u001a\u00020G2\u0006\u0010S\u001a\u00020\u0011H\u0007J\u001a\u0010\u0001\u001a\u00020G2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u00020G2\u0007\u0010\u0001\u001a\u00020\u0015H\u0007J\u0011\u0010\u0001\u001a\u00020G2\u0006\u0010U\u001a\u00020\u0013H\u0007J\u0013\u0010\u0001\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0007J\u001a\u0010 \u0001\u001a\u00020Y2\u0007\u0010¡\u0001\u001a\u00020Y2\u0006\u0010t\u001a\u00020\u0013H\u0002J\t\u0010¢\u0001\u001a\u00020GH\u0002J\t\u0010£\u0001\u001a\u00020GH\u0002R5\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u000b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\u000e\u00100\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010;\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0004\n\u0002\u0010<R\u000e\u0010=\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006¦\u0001"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxTextAreaView;", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "Landroid/widget/EditText;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "adapterProvider", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "Lcom/bytedance/ies/xelement/text/emoji/ILynxEmojiAdapter;", "getAdapterProvider", "()Lkotlin/jvm/functions/Function1;", "setAdapterProvider", "(Lkotlin/jvm/functions/Function1;)V", "mAdjustMode", "", "mAdjustedScrollViewSize", "", "mAutoFit", "", "mBottomInset", "mDeferToNextLayout", "mEditText", "Lcom/bytedance/ies/xelement/input/LynxEditText;", "mInitEmoji", "mInputFilter", "Lcom/bytedance/ies/xelement/input/LynxInputFilter;", "mInputTypeStash", "getMInputTypeStash", "()I", "setMInputTypeStash", "(I)V", "mIsBindBlur", "getMIsBindBlur", "()Z", "setMIsBindBlur", "(Z)V", "mIsBindConfirm", "getMIsBindConfirm", "setMIsBindConfirm", "mIsBindFocus", "getMIsBindFocus", "setMIsBindFocus", "mIsBindInput", "getMIsBindInput", "setMIsBindInput", "mIsBindLine", "mIsChangeFromLynx", "mIsFocus", "mIsKeyboadVisible", "mIsLineFilterLoop", "mIsScrolled", "mIsSmartScroll", "mKeyboardHeight", "mMaxLengthValue", "mMaxLines", "mPlaceHolder", "mPlaceHolderTextSize", "Ljava/lang/Integer;", "mRichType", "mStartScrollY", "mStashChangeStateInFilterLoop", "mTextHeight", "mTouchStartX", "", "mTouchStartY", "mUseCustomKeyboard", "viewIsCreated", "addText", "", "params", "Lcom/lynx/react/bridge/ReadableMap;", "callback", "Lcom/lynx/react/bridge/Callback;", "changeSize", C14002h.f36692e, "createView", "p0", "customConfig", "editText", "customInputTypeSetting", ShareHitPoint.f121869d, "customTextAlignSetting", "align", "getAdjustedScrollViewSize", "displayHeight", "getDrawable", "Landroid/graphics/drawable/Drawable;", "id", "getFocus", "getScrollDistanceAlgorithm", "Lcom/bytedance/ies/xelement/input/LynxTextAreaView$SCROLL_ALGORITHM;", "getTextHeight", "isAdjustResize", "isFocusable", "isImmserive", "layout", "lostFocus", "onFocusChanged", "hasFocus", "isFocusTransition", "resetPlaceHolder", "resetSelectionMenu", "restoreBottomPadding", "scrollIntoInputView", "sendDelEvent", "setAdjustMode", "mode", "setAutoFit", "autoFit", "setBottomInset", "bottomInset", "setConfirmType", "setCursorColor", "color", "setCursorDrawableColor", "Landroid/widget/TextView;", "setDisable", "disabled", "setEditTextColorWithColorString", "colorString", "setEvents", "", "Lcom/lynx/tasm/event/EventsListener;", "setFocus", "isFocused", "setFontColor", "Lcom/lynx/react/bridge/Dynamic;", "setFontTextSize", "fontSize", "setInputFilter", "setInputType", "setInputValue", "value", "setIsPassword", "isPassword", "setKeyBoardFullscreenMode", "isFullscreenMode", "setMaxHeight", "setMaxLength", "maxLength", "setMaxLines", "(Ljava/lang/Integer;)V", "setMinHeight", "setPlaceHolderStyle", "map", "setPlaceholder", "placeHolder", "setPlaceholderColor", "setPlaceholderTextSize", "size", "setRichType", "setShowSoftInputOnFocus", "(Ljava/lang/Boolean;)V", "setSmartScroll", "isSmartScroll", "setTextAlign", "setValue", "tintDrawable", "drawable", "transEmoji", "updateSizeIfNeeded", "Companion", "SCROLL_ALGORITHM", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
public class LynxTextAreaView extends LynxUI<EditText> {
    private static Field au;

    /* renamed from: r */
    public static final Companion f38169r = new Companion(null);

    /* renamed from: a */
    public LynxEditText f38170a;
    private int ad = 140;
    private String ae;
    private Integer af;
    private boolean ag;
    private String ah = "none";

    /* renamed from: ai  reason: collision with root package name */
    private boolean f175424ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private int am;
    private boolean an;
    private LynxInputFilter ao;
    private boolean ap;
    private boolean aq;
    private int ar = 1;
    private int as;
    private Function1<? super Context, ? extends ILynxEmojiAdapter> at = C14465c.INSTANCE;

    /* renamed from: b */
    public boolean f38171b;

    /* renamed from: c */
    public boolean f38172c;

    /* renamed from: d */
    public float f38173d;

    /* renamed from: e */
    public float f38174e;

    /* renamed from: f */
    public int f38175f;

    /* renamed from: g */
    public boolean f38176g;

    /* renamed from: h */
    public int f38177h = Integer.MAX_VALUE;

    /* renamed from: i */
    public boolean f38178i;

    /* renamed from: j */
    public boolean f38179j;

    /* renamed from: k */
    public String f38180k = "end";

    /* renamed from: l */
    public boolean f38181l = true;

    /* renamed from: m */
    public boolean f38182m;

    /* renamed from: n */
    public int f38183n = -1;

    /* renamed from: o */
    public int f38184o = -1;

    /* renamed from: p */
    public boolean f38185p = true;

    /* renamed from: q */
    public boolean f38186q;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxTextAreaView$SCROLL_ALGORITHM;", "", "(Ljava/lang/String;I)V", "NONE", "IMMERSIVE", "NORMAL", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$b */
    public enum SCROLL_ALGORITHM {
        NONE,
        IMMERSIVE,
        NORMAL
    }

    /* renamed from: a */
    public int mo53288a(int i) {
        return 0;
    }

    /* renamed from: a */
    public void mo53291a(EditText editText, String str) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
    }

    @LynxUIMethod
    public final void resetSelectionMenu() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxTextAreaView$Companion;", "", "()V", "CONFIRM_TYPE_DONE", "", "CONFIRM_TYPE_GO", "CONFIRM_TYPE_NEXT", "CONFIRM_TYPE_SEARCH", "CONFIRM_TYPE_SEND", "DEFAULT_MAX_LENGTH", "", "EMOJI_PATTERN", "EVENT_BIND_BLUR", "EVENT_BIND_CONFIRM", "EVENT_BIND_FOCUS", "EVENT_BIND_INPUT", "EVENT_BIND_LINE", "RICH_TYPE_NONE", "RICH_TYPE_REPLY", "SCROLL_THRESHOLD", "TAG", "TYPE_DIGIT", "TYPE_EMAIL", "TYPE_NUMBER", "TYPE_PASSWORD", "TYPE_TEL", "TYPE_TEXT", "sLayoutField", "Ljava/lang/reflect/Field;", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean S_() {
        return this.f175424ai;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo53299c() {
        return this.aj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo53300d() {
        return this.ak;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo53301e() {
        return this.al;
    }

    /* renamed from: o */
    public final int mo53311o() {
        return this.am;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: a */
    public void mo53295a(boolean z, boolean z2) {
        if (z2 && !this.ap) {
            return;
        }
        if (!z || this.f38176g) {
            mo53308l();
        } else {
            mo53307k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"com/bytedance/ies/xelement/input/LynxTextAreaView$createView$1", "Lcom/bytedance/ies/xelement/input/LynxInputFilter;", "mFilterPattern", "", "mMax", "", "filter", ShareHitPoint.f121868c, "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "getMax", "setFilterPattern", "pattern", "", "setMax", "max", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$g */
    public static final class C14469g implements LynxInputFilter {

        /* renamed from: a */
        private int f38194a = 140;

        /* renamed from: b */
        private CharSequence f38195b = "";

        C14469g() {
        }

        @Override // com.bytedance.ies.xelement.input.LynxInputFilter
        /* renamed from: a */
        public LynxInputFilter mo53348a(int i) {
            this.f38194a = i;
            return this;
        }

        @Override // com.bytedance.ies.xelement.input.LynxInputFilter
        /* renamed from: a */
        public LynxInputFilter mo53349a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pattern");
            this.f38195b = str;
            return this;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(spanned, "dest");
            if (!StringsKt.isBlank(this.f38195b)) {
                charSequence = new Regex(this.f38195b.toString()).replace(charSequence, "");
            }
            int length = this.f38194a - (spanned.length() - (i4 - i3));
            if (length <= 0) {
                return "";
            }
            if (length >= i2 - i) {
                return charSequence;
            }
            Iterator a = Regex.findAll$default(new Regex("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-🛿]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)"), charSequence, 0, 2, null).mo4717a();
            while (a.hasNext()) {
                MatchResult jVar = (MatchResult) a.next();
                if (jVar.mo242580a().mo239399a() + jVar.mo242581b().length() > length + i) {
                    return charSequence.subSequence(i, jVar.mo242580a().mo239399a());
                }
            }
            return charSequence.subSequence(i, length + i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: m */
    public boolean mo53309m() {
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        return lynxEditText.isFocusable();
    }

    /* renamed from: g */
    public final SCROLL_ALGORITHM mo53303g() {
        if (!mo53302f()) {
            return SCROLL_ALGORITHM.NONE;
        }
        if (aE()) {
            return SCROLL_ALGORITHM.IMMERSIVE;
        }
        return SCROLL_ALGORITHM.NORMAL;
    }

    /* renamed from: p */
    public final void mo53312p() {
        if (this.an) {
            LynxEmojiViewHelper eVar = LynxEmojiViewHelper.f38521a;
            View view = this.f66253Z;
            Intrinsics.checkExpressionValueIsNotNull(view, "mView");
            eVar.mo53624a((TextView) view);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$j */
    public static final class RunnableC14472j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f38199a;

        RunnableC14472j(LynxTextAreaView lynxTextAreaView) {
            this.f38199a = lynxTextAreaView;
        }

        public final void run() {
            Object systemService = this.f38199a.mo95039u().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(LynxTextAreaView.m58563a(this.f38199a), 1);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$k */
    public static final class RunnableC14473k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f38200a;

        RunnableC14473k(LynxTextAreaView lynxTextAreaView) {
            this.f38200a = lynxTextAreaView;
        }

        public final void run() {
            Object systemService = this.f38200a.mo95039u().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(LynxTextAreaView.m58563a(this.f38200a).getWindowToken(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ies/xelement/input/LynxTextAreaView$setRichType$1", "Lcom/bytedance/ies/xelement/input/LynxInputConnectionWrapper$BackspaceListener;", "onBackspace", "", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$l */
    public static final class C14474l implements LynxInputConnectionWrapper.BackspaceListener {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f38201a;

        @Override // com.bytedance.ies.xelement.input.LynxInputConnectionWrapper.BackspaceListener
        /* renamed from: a */
        public boolean mo53355a() {
            Editable text = LynxTextAreaView.m58563a(this.f38201a).getText();
            if (text != null && text.length() == 0) {
                return false;
            }
            KeyCodeDeleteHelper aVar = KeyCodeDeleteHelper.f38202a;
            Editable text2 = LynxTextAreaView.m58563a(this.f38201a).getText();
            if (text2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(text2, "mEditText.text!!");
            return aVar.mo53357a(text2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14474l(LynxTextAreaView lynxTextAreaView) {
            this.f38201a = lynxTextAreaView;
        }
    }

    private final boolean aE() {
        AbstractC26684l lVar = this.f66239t;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "mContext");
        Context baseContext = lVar.getBaseContext();
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (baseContext != null) {
            Window window = ((Activity) baseContext).getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "(context as Activity).window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "(context as Activity).window.decorView");
            if ((decorView.getSystemUiVisibility() & 1024) != 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: f */
    public final boolean mo53302f() {
        AbstractC26684l lVar = this.f66239t;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "mContext");
        Context baseContext = lVar.getBaseContext();
        if (!(baseContext instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) baseContext).getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "context.window");
        if ((window.getAttributes().softInputMode & 240 & 240) == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo53305i() {
        for (LynxBaseUI ar2 = ar(); ar2 != null; ar2 = ar2.ar()) {
            if (ar2 instanceof AbsLynxUIScroll) {
                AbsLynxUIScroll absLynxUIScroll = (AbsLynxUIScroll) ar2;
                View childAt = ((ViewGroup) absLynxUIScroll.av()).getChildAt(0);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "parentUI.view.getChildAt(0)");
                if (childAt.getPaddingBottom() != 0) {
                    ((ViewGroup) absLynxUIScroll.av()).getChildAt(0).setPadding(0, 0, 0, 0);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: j */
    public void mo53306j() {
        super.mo53306j();
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText.setPadding(this.f66203I + this.f66245z, this.f66202H + this.f66196B, this.f66204J + this.f66195A, this.f66205K + this.f66197C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo53307k() {
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText.requestFocus();
        if (!this.ap) {
            if (mo95039u() != null) {
                LynxEditText lynxEditText2 = this.f38170a;
                if (lynxEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText2.post(new RunnableC14472j(this));
            }
        } else if (mo95039u() != null) {
            LynxEditText lynxEditText3 = this.f38170a;
            if (lynxEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText3.post(new RunnableC14473k(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo53308l() {
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText.clearFocus();
        if (!this.ap && mo95039u() != null) {
            Object systemService = mo95039u().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LynxEditText lynxEditText2 = this.f38170a;
                if (lynxEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                inputMethodManager.hideSoftInputFromWindow(lynxEditText2.getWindowToken(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    private final void aF() {
        String str = this.ae;
        if (str == null) {
            return;
        }
        if (this.af == null) {
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText.setHint(this.ae);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        Integer num = this.af;
        if (num != null) {
            spannableString.setSpan(new AbsoluteSizeSpan(num.intValue(), false), 0, spannableString.length(), 33);
            LynxEditText lynxEditText2 = this.f38170a;
            if (lynxEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText2.setHint(spannableString);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: n */
    public final void mo53310n() {
        if (this.aq) {
            if (au == null) {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mLayout");
                    au = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                } catch (Exception e) {
                    LLog.m96429e("LynxTextAreaView", Log.getStackTraceString(e));
                    return;
                }
            }
            try {
                Field field = au;
                if (field == null) {
                    Intrinsics.throwNpe();
                }
                Layout layout = (Layout) field.get(this.f66253Z);
                int i = 0;
                if (layout != null) {
                    i = layout.getHeight();
                }
                View view = this.f66253Z;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                int minHeight = ((EditText) view).getMinHeight();
                View view2 = this.f66253Z;
                if (view2 == null) {
                    Intrinsics.throwNpe();
                }
                int maxHeight = ((EditText) view2).getMaxHeight();
                if (i < minHeight) {
                    m58566j(minHeight);
                } else if (i > maxHeight) {
                    m58566j(maxHeight);
                } else {
                    m58566j(i);
                }
            } catch (Exception e2) {
                LLog.m96429e("LynxTextAreaView", Log.getStackTraceString(e2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$i */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC14471i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f38197a;

        /* renamed from: b */
        final /* synthetic */ Context f38198b;

        ViewTreeObserver$OnGlobalLayoutListenerC14471i(LynxTextAreaView lynxTextAreaView, Context context) {
            this.f38197a = lynxTextAreaView;
            this.f38198b = context;
        }

        public final void onGlobalLayout() {
            int i;
            int i2;
            boolean z;
            if (this.f38197a.f38185p && !TextUtils.equals(this.f38197a.f38180k, "none")) {
                Rect rect = new Rect();
                Window window = ((Activity) this.f38198b).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "context.window");
                window.getDecorView().getWindowVisibleDisplayFrame(rect);
                if (this.f38197a.mo53303g() == SCROLL_ALGORITHM.IMMERSIVE) {
                    i2 = rect.bottom;
                    Window window2 = ((Activity) this.f38198b).getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window2, "context.window");
                    View decorView = window2.getDecorView();
                    Intrinsics.checkExpressionValueIsNotNull(decorView, "context.window.decorView");
                    i = decorView.getBottom();
                } else {
                    int i3 = rect.bottom - rect.top;
                    Window window3 = ((Activity) this.f38198b).getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window3, "context.window");
                    View decorView2 = window3.getDecorView();
                    Intrinsics.checkExpressionValueIsNotNull(decorView2, "context.window.decorView");
                    i = decorView2.getBottom() - rect.top;
                    i2 = i3;
                }
                if (((double) i2) / ((double) i) < 0.8d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.f38197a.f38182m || this.f38197a.f38186q) {
                    if (z) {
                        this.f38197a.f38183n = i - i2;
                        if (LynxTextAreaView.m58563a(this.f38197a).isFocused()) {
                            LynxTextAreaView lynxTextAreaView = this.f38197a;
                            lynxTextAreaView.f38184o = lynxTextAreaView.mo53298c(i2);
                            if (this.f38197a.f38186q) {
                                this.f38197a.f38186q = false;
                            }
                            this.f38197a.mo53304h();
                        }
                    } else if (this.f38197a.f38181l) {
                        this.f38197a.mo53305i();
                    }
                }
                this.f38197a.f38182m = z;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02f6  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53304h() {
        /*
        // Method dump skipped, instructions count: 790
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxTextAreaView.mo53304h():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo53297b(int i) {
        this.ar = i;
    }

    @LynxProp(name = "auto-fit")
    public final void setAutoFit(boolean z) {
        this.f38181l = z;
    }

    @LynxProp(name = "smart-scroll")
    public final void setSmartScroll(boolean z) {
        this.f38185p = z;
    }

    @LynxProp(name = "adjust-mode")
    public final void setAdjustMode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mode");
        this.f38180k = str;
    }

    @LynxProp(name = "placeholder")
    public final void setPlaceholder(String str) {
        this.ae = str;
        aF();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/xelement/text/emoji/DummyEmojiAdapter;", "it", "Landroid/content/Context;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$c */
    static final class C14465c extends Lambda implements Function1<Context, DummyEmojiAdapter> {
        public static final C14465c INSTANCE = new C14465c();

        C14465c() {
            super(1);
        }

        public final DummyEmojiAdapter invoke(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "it");
            return new DummyEmojiAdapter();
        }
    }

    @LynxProp(name = "bottom-inset")
    public final void setBottomInset(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bottomInset");
        this.as = (int) C26960n.m97974a(str);
    }

    @LynxProp(name = "font-size")
    public final void setFontTextSize(float f) {
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText.setTextSize(0, f);
    }

    @LynxProp(name = "maxlines")
    public final void setMaxLines(Integer num) {
        if (num != null) {
            this.f38177h = num.intValue();
        }
    }

    @LynxUIMethod
    public final void setValue(ReadableMap readableMap) {
        String str;
        if (readableMap != null) {
            str = readableMap.getString("value");
        } else {
            str = null;
        }
        setInputValue(str);
    }

    /* renamed from: j */
    private final void m58566j(int i) {
        if (this.am != i) {
            this.am = i;
            ShadowNode b = mo95039u().mo94674b(mo94576q());
            if (b != null) {
                b.mo94787d();
            }
        }
    }

    @LynxUIMethod
    public final void setInputFilter(ReadableMap readableMap) {
        LynxInputFilter cVar;
        if (readableMap != null && (cVar = this.ao) != null) {
            String string = readableMap.getString("pattern");
            Intrinsics.checkExpressionValueIsNotNull(string, "params.getString(\"pattern\")");
            cVar.mo53349a(string);
        }
    }

    @LynxProp(name = ShareHitPoint.f121869d)
    public final void setInputType(String str) {
        if (str != null) {
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            mo53291a(lynxEditText, str);
        }
    }

    @LynxProp(name = "max-height")
    public final void setMaxHeight(String str) {
        if (str != null) {
            float a = C26960n.m97974a(str);
            View view = this.f66253Z;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            ((EditText) view).setMaxHeight((int) (((double) a) + 0.5d));
            mo53310n();
        }
    }

    @LynxProp(name = "min-height")
    public final void setMinHeight(String str) {
        if (str != null) {
            float a = C26960n.m97974a(str);
            View view = this.f66253Z;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            ((EditText) view).setMinHeight((int) (((double) a) + 0.5d));
            mo53310n();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxTextAreaView(AbstractC26684l lVar) {
        super(lVar);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ LynxEditText m58563a(LynxTextAreaView lynxTextAreaView) {
        LynxEditText lynxEditText = lynxTextAreaView.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        return lynxEditText;
    }

    /* renamed from: c */
    public final int mo53298c(int i) {
        for (LynxBaseUI ar2 = ar(); ar2 != null; ar2 = ar2.ar()) {
            if (ar2 instanceof AbsLynxUIScroll) {
                ViewGroup viewGroup = (ViewGroup) ((AbsLynxUIScroll) ar2).av();
                Intrinsics.checkExpressionValueIsNotNull(viewGroup, "parentUI.view");
                return i - viewGroup.getTop();
            }
        }
        return i;
    }

    @LynxProp(name = "disabled")
    public final void setDisable(boolean z) {
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText.setEnabled(!z);
        LynxEditText lynxEditText2 = this.f38170a;
        if (lynxEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText2.setFocusable(!z);
        LynxEditText lynxEditText3 = this.f38170a;
        if (lynxEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText3.setFocusableInTouchMode(!z);
    }

    @LynxProp(name = "focus")
    public final void setFocus(boolean z) {
        this.ag = z;
        if (z) {
            mo53307k();
        } else {
            mo53308l();
        }
        if (z) {
            AbstractC26684l u = mo95039u();
            Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
            u.mo94684g().mo94916b(this);
        }
    }

    @LynxProp(name = "fullscreen-mode")
    public final void setKeyBoardFullscreenMode(boolean z) {
        if (!z) {
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            LynxEditText lynxEditText2 = this.f38170a;
            if (lynxEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText.setImeOptions(lynxEditText2.getImeOptions() | 33554432 | 268435456);
            return;
        }
        LynxEditText lynxEditText3 = this.f38170a;
        if (lynxEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText3.setImeOptions(1);
    }

    @LynxProp(name = "placeholder-style")
    public final void setPlaceHolderStyle(ReadableMap readableMap) {
        AbstractC26517a dynamic;
        Intrinsics.checkParameterIsNotNull(readableMap, "map");
        if (readableMap.hasKey("color")) {
            AbstractC26517a dynamic2 = readableMap.getDynamic("color");
            Intrinsics.checkExpressionValueIsNotNull(dynamic2, "colorValue");
            setPlaceholderColor(dynamic2);
        }
        if (readableMap.hasKey("font-size") && (dynamic = readableMap.getDynamic("font-size")) != null) {
            setPlaceholderTextSize(dynamic);
        }
    }

    @LynxProp(name = "caret-color")
    public final void setCursorColor(String str) {
        if (str != null) {
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            m58564a(lynxEditText, ColorUtils.m97896a(str));
            if (Intrinsics.areEqual(str, "transparent")) {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mTextSelectHandleRes");
                    Intrinsics.checkExpressionValueIsNotNull(declaredField, "fTextSelectHandleRes");
                    declaredField.setAccessible(true);
                    LynxEditText lynxEditText2 = this.f38170a;
                    if (lynxEditText2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                    }
                    declaredField.setInt(lynxEditText2, 17170445);
                } catch (Throwable unused) {
                    Log.w("LynxTextAreaView", "Failed to set transparent text select handle");
                }
            }
        }
    }

    @LynxProp(name = "color")
    public final void setFontColor(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "color");
        ReadableType g = aVar.mo94071g();
        if (g != null) {
            int i = C14475d.f38204a[g.ordinal()];
            if (i == 1) {
                LynxEditText lynxEditText = this.f38170a;
                if (lynxEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText.setTextColor(aVar.mo94068d());
                return;
            } else if (i == 2) {
                LynxEditText lynxEditText2 = this.f38170a;
                if (lynxEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText2.setTextColor(aVar.mo94068d());
                return;
            } else if (i == 3) {
                LynxEditText lynxEditText3 = this.f38170a;
                if (lynxEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText3.setTextColor(ColorUtils.m97896a(aVar.mo94069e()));
                return;
            }
        }
        Log.w("LynxTextAreaView", "Not supported color type: " + aVar.mo94071g().name());
    }

    @LynxProp(name = "value")
    public final void setInputValue(String str) {
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        if (!Intrinsics.areEqual(str, String.valueOf(lynxEditText.getText()))) {
            if (!Intrinsics.areEqual(str, "")) {
                this.f38172c = true;
            }
            LynxEditText lynxEditText2 = this.f38170a;
            if (lynxEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            Editable text = lynxEditText2.getText();
            if (text != null) {
                LynxEditText lynxEditText3 = this.f38170a;
                if (lynxEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                Editable text2 = lynxEditText3.getText();
                if (text2 == null) {
                    Intrinsics.throwNpe();
                }
                text.replace(0, text2.length(), str);
            }
            LynxEditText lynxEditText4 = this.f38170a;
            if (lynxEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            Editable text3 = lynxEditText4.getText();
            if (text3 != null) {
                LynxEditText lynxEditText5 = this.f38170a;
                if (lynxEditText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText5.setSelection(text3.toString().length());
            }
        }
    }

    @LynxProp(name = "password")
    public final void setIsPassword(boolean z) {
        if (z) {
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            int selectionStart = lynxEditText.getSelectionStart();
            LynxEditText lynxEditText2 = this.f38170a;
            if (lynxEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText2.setInputType(SmActions.ACTION_ONTHECALL_EXIT);
            LynxEditText lynxEditText3 = this.f38170a;
            if (lynxEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
            LynxEditText lynxEditText4 = this.f38170a;
            if (lynxEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText4.setSelection(selectionStart);
            return;
        }
        LynxEditText lynxEditText5 = this.f38170a;
        if (lynxEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        int selectionStart2 = lynxEditText5.getSelectionStart();
        LynxEditText lynxEditText6 = this.f38170a;
        if (lynxEditText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText6.setInputType(this.ar);
        LynxEditText lynxEditText7 = this.f38170a;
        if (lynxEditText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText7.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        LynxEditText lynxEditText8 = this.f38170a;
        if (lynxEditText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        lynxEditText8.setSelection(selectionStart2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @com.lynx.tasm.behavior.LynxProp(name = "maxlength")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMaxLength(com.lynx.react.bridge.AbstractC26517a r3) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxTextAreaView.setMaxLength(com.lynx.react.bridge.a):void");
    }

    @LynxProp(name = "placeholder-color")
    public final void setPlaceholderColor(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "color");
        ReadableType g = aVar.mo94071g();
        if (g != null) {
            int i = C14475d.f38206c[g.ordinal()];
            if (i == 1) {
                LynxEditText lynxEditText = this.f38170a;
                if (lynxEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText.setHintTextColor(aVar.mo94068d());
                return;
            } else if (i == 2) {
                LynxEditText lynxEditText2 = this.f38170a;
                if (lynxEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText2.setHintTextColor(aVar.mo94068d());
                return;
            } else if (i == 3) {
                m58565a(aVar.mo94069e());
                return;
            }
        }
        Log.w("LynxTextAreaView", "Not supported color type: " + aVar.mo94071g().name());
    }

    @LynxProp(name = "placeholder-font-size")
    public final void setPlaceholderTextSize(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        ReadableType g = aVar.mo94071g();
        if (g != null) {
            int i = C14475d.f38207d[g.ordinal()];
            if (i == 1) {
                this.af = Integer.valueOf(aVar.mo94068d());
            } else if (i == 2) {
                this.af = Integer.valueOf(aVar.mo94068d());
            } else if (i == 3) {
                this.af = Integer.valueOf((int) aVar.mo94067c());
            } else if (i == 4) {
                this.af = Integer.valueOf((int) C26960n.m97974a(aVar.mo94069e()));
            }
            aF();
        }
        Log.w("LynxTextAreaView", "Not supported font-size type: " + aVar.mo94071g().name());
        aF();
    }

    @LynxProp(name = "richtype")
    public final void setRichType(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        this.ah = str;
        if (Intrinsics.areEqual(str, "bracket")) {
            LynxEmojiResHelper a = LynxEmojiResHelper.f38515c.mo53619a();
            Function1<? super Context, ? extends ILynxEmojiAdapter> function1 = this.at;
            AbstractC26684l lVar = this.f66239t;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "mContext");
            a.mo53618a((ILynxEmojiAdapter) function1.invoke(lVar));
            this.an = true;
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText.setBackSpaceListener(new C14474l(this));
            return;
        }
        this.an = false;
    }

    @LynxProp(defaultInt = 0, name = "text-align")
    public final void setTextAlign(int i) {
        int a = mo53288a(i);
        if (i == 0) {
            LynxEditText lynxEditText = this.f38170a;
            if (lynxEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText.setGravity(a | 3);
        } else if (i == 1) {
            LynxEditText lynxEditText2 = this.f38170a;
            if (lynxEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText2.setGravity(a | 17);
        } else if (i == 2) {
            LynxEditText lynxEditText3 = this.f38170a;
            if (lynxEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText3.setGravity(a | 5);
        } else if (i == 3) {
            LynxEditText lynxEditText4 = this.f38170a;
            if (lynxEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText4.setGravity(a | 3);
        }
    }

    /* renamed from: a */
    private final void m58565a(String str) {
        if (str != null) {
            boolean z = false;
            if ((str.length() == 7 || str.length() == 9) && StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
                z = true;
            }
            if (!z) {
                str = null;
            }
            if (str != null) {
                int a = ColorUtils.m97896a(str);
                LynxEditText lynxEditText = this.f38170a;
                if (lynxEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                lynxEditText.setHintTextColor(a);
            }
        }
    }

    @LynxProp(name = "confirm-type")
    public final void setConfirmType(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -906336856:
                    if (str.equals("search")) {
                        LynxEditText lynxEditText = this.f38170a;
                        if (lynxEditText == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                        }
                        lynxEditText.setImeOptions(3);
                        return;
                    }
                    return;
                case 3304:
                    if (str.equals("go")) {
                        LynxEditText lynxEditText2 = this.f38170a;
                        if (lynxEditText2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                        }
                        lynxEditText2.setImeOptions(2);
                        return;
                    }
                    return;
                case 3089282:
                    if (str.equals("done")) {
                        LynxEditText lynxEditText3 = this.f38170a;
                        if (lynxEditText3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                        }
                        lynxEditText3.setImeOptions(6);
                        return;
                    }
                    return;
                case 3377907:
                    if (str.equals("next")) {
                        LynxEditText lynxEditText4 = this.f38170a;
                        if (lynxEditText4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                        }
                        lynxEditText4.setImeOptions(5);
                        return;
                    }
                    return;
                case 3526536:
                    if (str.equals("send")) {
                        LynxEditText lynxEditText5 = this.f38170a;
                        if (lynxEditText5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                        }
                        lynxEditText5.setImeOptions(4);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @LynxProp(name = "show-soft-input-onfocus")
    public final void setShowSoftInputOnFocus(Boolean bool) {
        if (bool != null) {
            Method method = null;
            try {
                method = LynxEditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
                method.setAccessible(true);
            } catch (Exception unused) {
            }
            if (!bool.booleanValue()) {
                this.ap = true;
                AbstractC26684l u = mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                Context baseContext = u.getBaseContext();
                if (baseContext != null) {
                    ((Activity) baseContext).getWindow().setSoftInputMode(3);
                    if (method != null) {
                        LynxEditText lynxEditText = this.f38170a;
                        if (lynxEditText == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                        }
                        method.invoke(lynxEditText, false);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            this.ap = false;
            AbstractC26684l u2 = mo95039u();
            Intrinsics.checkExpressionValueIsNotNull(u2, "lynxContext");
            Context baseContext2 = u2.getBaseContext();
            if (baseContext2 != null) {
                ((Activity) baseContext2).getWindow().setSoftInputMode(0);
                if (method != null) {
                    LynxEditText lynxEditText2 = this.f38170a;
                    if (lynxEditText2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                    }
                    method.invoke(lynxEditText2, true);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/bytedance/ies/xelement/input/LynxTextAreaView$createView$2$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$d */
    public static final class C14466d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LynxEditText f38188a;

        /* renamed from: b */
        final /* synthetic */ LynxTextAreaView f38189b;

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            boolean z = this.f38189b.f38172c;
            this.f38189b.f38172c = true;
            this.f38189b.mo53312p();
            this.f38189b.f38172c = z;
            if (this.f38189b.f38177h != Integer.MAX_VALUE) {
                if (LynxTextAreaView.m58563a(this.f38189b).getLayout() != null) {
                    Layout layout = LynxTextAreaView.m58563a(this.f38189b).getLayout();
                    Intrinsics.checkExpressionValueIsNotNull(layout, "mEditText.layout");
                    if (layout.getLineCount() > this.f38189b.f38177h) {
                        if (!this.f38189b.f38178i) {
                            this.f38189b.f38178i = true;
                            LynxTextAreaView lynxTextAreaView = this.f38189b;
                            lynxTextAreaView.f38179j = lynxTextAreaView.f38172c;
                        }
                        this.f38189b.f38172c = true;
                        LynxInputConnectionWrapper a = LynxTextAreaView.m58563a(this.f38189b).mo53286a();
                        if (a != null) {
                            a.deleteSurroundingText(1, 0);
                            return;
                        }
                        return;
                    }
                }
                if (this.f38189b.f38178i) {
                    if (this.f38189b.f38171b && editable != null) {
                        AbstractC26684l u = this.f38189b.mo95039u();
                        Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                        u.mo94687i().mo94075a(new C26547c(this.f38189b.mo94576q(), "line"));
                    }
                    this.f38189b.f38178i = false;
                    LynxTextAreaView lynxTextAreaView2 = this.f38189b;
                    lynxTextAreaView2.f38172c = lynxTextAreaView2.f38179j;
                }
            }
            if (this.f38189b.S_() && !this.f38189b.f38172c && editable != null) {
                AbstractC26684l u2 = this.f38189b.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u2, "lynxContext");
                EventEmitter i = u2.mo94687i();
                C26547c cVar = new C26547c(this.f38189b.mo94576q(), "input");
                cVar.mo94347a("value", editable.toString());
                cVar.mo94347a("cursor", Integer.valueOf(editable.toString().length()));
                cVar.mo94347a("textLength", Integer.valueOf(editable.toString().length()));
                i.mo94075a(cVar);
            }
            if (this.f38189b.f38172c) {
                this.f38189b.f38172c = false;
            }
            this.f38189b.mo53310n();
        }

        C14466d(LynxEditText lynxEditText, LynxTextAreaView lynxTextAreaView) {
            this.f38188a = lynxEditText;
            this.f38189b = lynxTextAreaView;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LynxEmojiSpan dVar;
            boolean z;
            if (!this.f38189b.f38172c && i3 != 0) {
                int i4 = i2 + i;
                Object[] spans = this.f38188a.getEditableText().getSpans(i, i4, LynxEmojiSpan.class);
                Intrinsics.checkExpressionValueIsNotNull(spans, "editableText.getSpans(st…ynxEmojiSpan::class.java)");
                int length = spans.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = spans[i5];
                    LynxEmojiSpan dVar2 = (LynxEmojiSpan) dVar;
                    if (this.f38188a.getEditableText().getSpanStart(dVar2) == i && this.f38188a.getEditableText().getSpanEnd(dVar2) == i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i5++;
                }
                LynxEmojiSpan dVar3 = dVar;
                if (dVar3 != null) {
                    this.f38188a.getEditableText().removeSpan(dVar3);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LynxEditText mo33942b(Context context) {
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f38170a = new LynxEditText(context);
        this.ao = new C14469g();
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        InputFilter[] inputFilterArr = new InputFilter[1];
        LynxInputFilter cVar = this.ao;
        if (cVar != null) {
            inputFilterArr[0] = cVar;
            lynxEditText.setFilters(inputFilterArr);
            lynxEditText.addTextChangedListener(new C14466d(lynxEditText, this));
            lynxEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC14467e(lynxEditText, this));
            lynxEditText.setOnEditorActionListener(new C14468f(lynxEditText, this));
            lynxEditText.setBackground(null);
            lynxEditText.setImeOptions(1);
            LynxEditText lynxEditText2 = this.f38170a;
            if (lynxEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            mo53290a((EditText) lynxEditText2);
            LynxEditText lynxEditText3 = this.f38170a;
            if (lynxEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            lynxEditText3.setOnTouchListener(new View$OnTouchListenerC14470h(this));
            AbstractC26684l lVar = this.f66239t;
            Intrinsics.checkExpressionValueIsNotNull(lVar, "mContext");
            Context baseContext = lVar.getBaseContext();
            if ((baseContext instanceof Activity) && mo53303g() != SCROLL_ALGORITHM.NONE) {
                Window window = ((Activity) baseContext).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "context.window");
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "context.window.decorView");
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC14471i(this, baseContext));
            }
            this.aq = true;
            LynxEditText lynxEditText4 = this.f38170a;
            if (lynxEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEditText");
            }
            return lynxEditText4;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.xelement.input.LynxInputFilter");
    }

    /* renamed from: a */
    public void mo53290a(EditText editText) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        editText.setHorizontallyScrolling(false);
        editText.setSingleLine(false);
        editText.setGravity(48);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        if (map != null) {
            this.ak = map.containsKey("blur");
            this.al = map.containsKey("confirm");
            this.aj = map.containsKey("focus");
            this.f175424ai = map.containsKey("input");
            this.f38171b = map.containsKey("line");
        }
    }

    /* renamed from: a */
    private final Drawable m58562a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        return drawable;
    }

    /* renamed from: a */
    private final Drawable m58561a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m58564a(android.widget.TextView r6, int r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxTextAreaView.m58564a(android.widget.TextView, int):void");
    }

    @LynxUIMethod
    public final void addText(ReadableMap readableMap, Callback callback) {
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        String string = readableMap.getString("text");
        LynxEditText lynxEditText = this.f38170a;
        if (lynxEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        LynxInputConnectionWrapper a = lynxEditText.mo53286a();
        if (a != null) {
            a.finishComposingText();
        }
        LynxEditText lynxEditText2 = this.f38170a;
        if (lynxEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        LynxInputConnectionWrapper a2 = lynxEditText2.mo53286a();
        if (a2 != null) {
            a2.commitText(string, 1);
        }
        callback.invoke(0);
    }

    @LynxUIMethod
    public final void sendDelEvent(ReadableMap readableMap, Callback callback) {
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        try {
            int i = readableMap.getInt("action");
            if (i == 0) {
                int i2 = readableMap.getInt("length");
                LynxEditText lynxEditText = this.f38170a;
                if (lynxEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditText");
                }
                LynxInputConnectionWrapper a = lynxEditText.mo53286a();
                if (a != null) {
                    a.deleteSurroundingText(i2, 0);
                }
            } else if (i == 1) {
                ((EditText) this.f66253Z).dispatchKeyEvent(new KeyEvent(0, 67));
            }
            callback.invoke(0);
        } catch (Throwable th) {
            callback.invoke(1, th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/bytedance/ies/xelement/input/LynxTextAreaView$createView$2$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$e */
    public static final class View$OnFocusChangeListenerC14467e implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxEditText f38190a;

        /* renamed from: b */
        final /* synthetic */ LynxTextAreaView f38191b;

        View$OnFocusChangeListenerC14467e(LynxEditText lynxEditText, LynxTextAreaView lynxTextAreaView) {
            this.f38190a = lynxEditText;
            this.f38191b = lynxTextAreaView;
        }

        public final void onFocusChange(View view, boolean z) {
            String str = null;
            if (z) {
                if (this.f38191b.mo53299c()) {
                    AbstractC26684l u = this.f38191b.mo95039u();
                    Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                    EventEmitter i = u.mo94687i();
                    C26547c cVar = new C26547c(this.f38191b.mo94576q(), "focus");
                    Editable text = this.f38190a.getText();
                    if (text != null) {
                        str = text.toString();
                    }
                    cVar.mo94347a("value", str);
                    i.mo94075a(cVar);
                }
                if (this.f38191b.f38185p && this.f38191b.mo53302f() && (!Intrinsics.areEqual(this.f38191b.f38180k, "none"))) {
                    this.f38191b.mo53304h();
                    return;
                }
                return;
            }
            if (this.f38191b.mo53300d()) {
                AbstractC26684l u2 = this.f38191b.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u2, "lynxContext");
                EventEmitter i2 = u2.mo94687i();
                C26547c cVar2 = new C26547c(this.f38191b.mo94576q(), "blur");
                Editable text2 = this.f38190a.getText();
                if (text2 != null) {
                    str = text2.toString();
                }
                cVar2.mo94347a("value", str);
                i2.mo94075a(cVar2);
            }
            this.f38191b.f38183n = -1;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$h */
    public static final class View$OnTouchListenerC14470h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f38196a;

        View$OnTouchListenerC14470h(LynxTextAreaView lynxTextAreaView) {
            this.f38196a = lynxTextAreaView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                view.getParent().requestDisallowInterceptTouchEvent(true);
                this.f38196a.f38173d = motionEvent.getX();
                this.f38196a.f38174e = motionEvent.getY();
                this.f38196a.f38175f = view.getScrollY();
            } else if (action == 1) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.f38196a.f38173d = BitmapDescriptorFactory.HUE_RED;
                this.f38196a.f38174e = BitmapDescriptorFactory.HUE_RED;
                LynxTextAreaView lynxTextAreaView = this.f38196a;
                if (Math.abs(view.getScrollY() - this.f38196a.f38175f) <= 10) {
                    z = false;
                }
                lynxTextAreaView.f38176g = z;
            } else if (action != 2) {
                if (action == 3) {
                    Intrinsics.checkExpressionValueIsNotNull(view, "view");
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    this.f38196a.f38173d = BitmapDescriptorFactory.HUE_RED;
                    this.f38196a.f38174e = BitmapDescriptorFactory.HUE_RED;
                    LynxTextAreaView lynxTextAreaView2 = this.f38196a;
                    if (Math.abs(view.getScrollY() - this.f38196a.f38175f) <= 10) {
                        z = false;
                    }
                    lynxTextAreaView2.f38176g = z;
                }
            } else if ((!LynxTextAreaView.m58563a(this.f38196a).canScrollVertically(1) && motionEvent.getY() < this.f38196a.f38174e) || (!LynxTextAreaView.m58563a(this.f38196a).canScrollVertically(-1) && motionEvent.getY() > this.f38196a.f38174e)) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction", "com/bytedance/ies/xelement/input/LynxTextAreaView$createView$2$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$f */
    public static final class C14468f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ LynxEditText f38192a;

        /* renamed from: b */
        final /* synthetic */ LynxTextAreaView f38193b;

        C14468f(LynxEditText lynxEditText, LynxTextAreaView lynxTextAreaView) {
            this.f38192a = lynxEditText;
            this.f38193b = lynxTextAreaView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if ((i != 6 && i != 2 && i != 3 && i != 4 && i != 5 && i != 0) || !this.f38193b.mo53301e()) {
                return false;
            }
            AbstractC26684l u = this.f38193b.mo95039u();
            Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
            EventEmitter i2 = u.mo94687i();
            C26547c cVar = new C26547c(this.f38193b.mo94576q(), "confirm");
            Editable text = this.f38192a.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            cVar.mo94347a("value", str);
            i2.mo94075a(cVar);
            return false;
        }
    }
}
