package com.ss.android.vc.meeting.module.follow.share;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.module.localshare.ILocalShareInput;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Deprecated(level = DeprecationLevel.ERROR, message = "should use LocalShareCodeInputView2")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 92\u00020\u0001:\u000289B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0007H\u0002J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0010\u0010-\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010/J\u0006\u00100\u001a\u00020+J\u0010\u00101\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u00102\u001a\u00020+H\u0002J\u0018\u00103\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0012H\u0002J\u0018\u00105\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0012H\u0002J\u001a\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010/H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/share/LocalShareCodeInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "codeInputView", "Landroid/view/View;", "dialogInterface", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "getDialogInterface", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "setDialogInterface", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "inputText", "", "getInputText", "()Ljava/lang/String;", "setInputText", "(Ljava/lang/String;)V", "keyboardIsShowing", "", "keyboardState", "Lcom/ss/android/vc/common/utils/SoftKeyboardState;", "localShareInputListener", "Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;", "getLocalShareInputListener", "()Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;", "setLocalShareInputListener", "(Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;)V", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "getLocalSharePrepareView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "setLocalSharePrepareView", "(Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "getCodeEditTextFromIndex", "Landroid/widget/EditText;", "index", "hideKeyboard", "", "onCodeVerifyBegin", "onCodeVerifyFail", "failReason", "Lcom/ss/android/vc/meeting/module/follow/share/LocalShareCodeInputView$CodeFailReason;", "onCodeVerifySuccess", "onDeletePressed", "onTextInput", "processTextInput", "text", "updateEditTextCursor", "updateInputArea", "focusNum", "CodeFailReason", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LocalShareCodeInputView extends FrameLayout {

    /* renamed from: c */
    public static final Companion f155141c = new Companion(null);

    /* renamed from: a */
    public View f155142a;

    /* renamed from: b */
    public boolean f155143b;

    /* renamed from: d */
    private String f155144d;

    /* renamed from: e */
    private AbstractC61222a f155145e;

    /* renamed from: f */
    private C60762k f155146f;

    /* renamed from: g */
    private ILocalShareInput f155147g;

    /* renamed from: h */
    private ILocalSharePrepareContract.IView f155148h;

    /* renamed from: i */
    private HashMap f155149i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/share/LocalShareCodeInputView$CodeFailReason;", "", "(Ljava/lang/String;I)V", "UNABLE_SHARE_TO_ROOM", "INVALID_SHARE_CODE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CodeFailReason {
        UNABLE_SHARE_TO_ROOM,
        INVALID_SHARE_CODE,
        UNKNOWN
    }

    public LocalShareCodeInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LocalShareCodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public View mo214108b(int i) {
        if (this.f155149i == null) {
            this.f155149i = new HashMap();
        }
        View view = (View) this.f155149i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f155149i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/share/LocalShareCodeInputView$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC61222a getDialogInterface() {
        return this.f155145e;
    }

    public final String getInputText() {
        return this.f155144d;
    }

    public final ILocalShareInput getLocalShareInputListener() {
        return this.f155147g;
    }

    public final ILocalSharePrepareContract.IView getLocalSharePrepareView() {
        return this.f155148h;
    }

    /* renamed from: a */
    public final void mo214105a() {
        int min = Math.min(this.f155144d.length() + 1, 6);
        EditText c = m241483c(min);
        if (c != null) {
            c.requestFocus();
        }
        m241481a(min, (CodeFailReason) null);
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(c, 2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: b */
    public final void mo214109b() {
        IBinder iBinder;
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                View rootView = getRootView();
                if (rootView != null) {
                    iBinder = rootView.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public final void setDialogInterface(AbstractC61222a aVar) {
        this.f155145e = aVar;
    }

    public final void setLocalShareInputListener(ILocalShareInput aVar) {
        this.f155147g = aVar;
    }

    public final void setLocalSharePrepareView(ILocalSharePrepareContract.IView bVar) {
        this.f155148h = bVar;
    }

    public final void setInputText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f155144d = str;
    }

    /* renamed from: c */
    private final EditText m241483c(int i) {
        switch (i) {
            case 1:
                return (EditText) mo214108b(R.id.share_screen_code_1);
            case 2:
                return (EditText) mo214108b(R.id.share_screen_code_2);
            case 3:
                return (EditText) mo214108b(R.id.share_screen_code_3);
            case 4:
                return (EditText) mo214108b(R.id.share_screen_code_4);
            case 5:
                return (EditText) mo214108b(R.id.share_screen_code_5);
            case 6:
                return (EditText) mo214108b(R.id.share_screen_code_6);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final boolean mo214107a(int i) {
        CharSequence text;
        CharSequence text2;
        EditText c = m241483c(i);
        EditText editText = null;
        if (!(c instanceof TextView)) {
            c = null;
        }
        EditText editText2 = c;
        if (i != 6 && (editText2 == null || (text2 = editText2.getText()) == null || text2.length() != 0)) {
            return false;
        }
        if (i != 6 || (editText2 != null && (text = editText2.getText()) != null && text.length() == 0)) {
            EditText c2 = m241483c(i - 1);
            if (c2 instanceof TextView) {
                editText = c2;
            }
            EditText editText3 = editText;
            if (editText3 != null) {
                editText3.setText("");
            }
        } else if (editText2 != null) {
            editText2.setText("");
        }
        mo214105a();
        return true;
    }

    /* renamed from: b */
    private final void m241482b(int i, String str) {
        EditText c;
        if (i == 6 && (c = m241483c(i)) != null) {
            boolean z = true;
            if (!TextUtils.isEmpty(str) && str.length() == 1) {
                z = false;
            }
            c.setCursorVisible(z);
        }
    }

    /* renamed from: a */
    private final void m241481a(int i, CodeFailReason codeFailReason) {
        int i2;
        String str;
        int i3;
        for (int i4 = 1; i4 <= 6; i4++) {
            if (codeFailReason != null) {
                EditText c = m241483c(i4);
                if (c != null) {
                    c.setBackgroundResource(R.drawable.bg_local_share_code_red);
                }
            } else {
                EditText c2 = m241483c(i4);
                if (c2 != null) {
                    if (i >= i4) {
                        i3 = R.drawable.bg_local_share_code_blue;
                    } else {
                        i3 = R.drawable.bg_local_share_code_grey;
                    }
                    c2.setBackgroundResource(i3);
                }
            }
        }
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo214108b(R.id.code_input_title);
        if (codeFailReason != null) {
            i2 = R.color.ud_R500;
        } else {
            i2 = R.color.ud_N600;
        }
        lineHeightTextView.setTextColor(C60773o.m236126d(i2));
        if (codeFailReason == null) {
            LineHeightTextView lineHeightTextView2 = (LineHeightTextView) mo214108b(R.id.code_input_title);
            Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView2, "code_input_title");
            lineHeightTextView2.setText(UIHelper.getString(R.string.Lark_View_EnterSharingCode));
            return;
        }
        LineHeightTextView lineHeightTextView3 = (LineHeightTextView) mo214108b(R.id.code_input_title);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView3, "code_input_title");
        int i5 = C61840e.f155256a[codeFailReason.ordinal()];
        if (i5 == 1) {
            str = UIHelper.getString(R.string.View_G_UnableToShareScreenToThisRoom);
        } else if (i5 == 2) {
            str = UIHelper.getString(R.string.View_M_InvalidSharingCode);
        } else if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        lineHeightTextView3.setText(str);
    }

    /* renamed from: a */
    public final void mo214106a(int i, String str) {
        String str2;
        ILocalShareInput aVar;
        String str3;
        boolean z = true;
        if (str.length() == 1) {
            if (Character.isLowerCase(str.charAt(0))) {
                str2 = String.valueOf(Character.toUpperCase(str.charAt(0)));
                EditText c = m241483c(i);
                if (!(c instanceof TextView)) {
                    c = null;
                }
                EditText editText = c;
                if (editText != null) {
                    editText.setText(str2);
                }
            } else {
                str2 = str;
            }
            if (i <= 1) {
                str3 = str2;
            } else {
                int i2 = i - 1;
                if (this.f155144d.length() >= i2) {
                    str3 = this.f155144d.subSequence(0, i2).toString() + str2;
                } else {
                    str3 = this.f155144d + str2;
                }
            }
            this.f155144d = str3;
            C60700b.m235851b("LocalShareCodeInputView@", "[processTextInput]", "inputCharacter input, index: " + i + ", inputCharacter: " + str + ", all inputCharacter: " + this.f155144d);
        } else {
            if (str.length() != 0) {
                z = false;
            }
            if (z && this.f155144d.length() >= i) {
                this.f155144d = this.f155144d.subSequence(0, i - 1).toString();
                C60700b.m235851b("LocalShareCodeInputView@", "[processTextInput2]", "inputCharacter delete, index: " + i + ", all inputCharacter: " + this.f155144d);
            }
            str2 = str;
        }
        m241482b(i, str2);
        if ((TextUtils.isEmpty(str) || Character.isUpperCase(str.charAt(0))) && (aVar = this.f155147g) != null) {
            aVar.mo215026a(false);
        }
        mo214105a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareCodeInputView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f155144d = "";
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_local_share_code, (ViewGroup) this, true);
        this.f155142a = inflate;
        if (inflate != null) {
            inflate.post(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView.RunnableC618081 */

                /* renamed from: a */
                final /* synthetic */ LocalShareCodeInputView f155150a;

                {
                    this.f155150a = r1;
                }

                public final void run() {
                    int i;
                    FrameLayout frameLayout = new FrameLayout(context);
                    LocalShareCodeInputView localShareCodeInputView = this.f155150a;
                    FrameLayout frameLayout2 = frameLayout;
                    View view = this.f155150a.f155142a;
                    int i2 = 0;
                    if (view != null) {
                        i = view.getWidth();
                    } else {
                        i = 0;
                    }
                    View view2 = this.f155150a.f155142a;
                    if (view2 != null) {
                        i2 = view2.getHeight();
                    }
                    localShareCodeInputView.addView(frameLayout2, new FrameLayout.LayoutParams(i, i2));
                    frameLayout.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView.RunnableC618081.View$OnClickListenerC618091 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC618081 f155152a;

                        {
                            this.f155152a = r1;
                        }

                        public final void onClick(View view) {
                            this.f155152a.f155150a.mo214105a();
                        }
                    });
                    View view3 = this.f155150a.f155142a;
                    if (view3 != null) {
                        view3.post(new Runnable(this) {
                            /* class com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView.RunnableC618081.RunnableC618102 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC618081 f155153a;

                            {
                                this.f155153a = r1;
                            }

                            public final void run() {
                                this.f155153a.f155150a.mo214105a();
                            }
                        });
                    }
                }
            });
        }
        for (final int i2 = 1; i2 <= 6; i2++) {
            EditText c = m241483c(i2);
            if (c != null) {
                c.addTextChangedListener(new TextWatcher(this) {
                    /* class com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView.C618112 */

                    /* renamed from: a */
                    final /* synthetic */ LocalShareCodeInputView f155154a;

                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public void afterTextChanged(Editable editable) {
                        LocalShareCodeInputView localShareCodeInputView = this.f155154a;
                        int i = i2;
                        String valueOf = String.valueOf(editable);
                        if (valueOf != null) {
                            localShareCodeInputView.mo214106a(i, StringsKt.trim((CharSequence) valueOf).toString());
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }

                    {
                        this.f155154a = r1;
                    }
                });
            }
        }
        for (final int i3 = 1; i3 <= 6; i3++) {
            EditText c2 = m241483c(i3);
            if (c2 != null) {
                c2.setOnKeyListener(new View.OnKeyListener(this) {
                    /* class com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView.View$OnKeyListenerC618123 */

                    /* renamed from: a */
                    final /* synthetic */ LocalShareCodeInputView f155156a;

                    {
                        this.f155156a = r1;
                    }

                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        if (i == 67) {
                            Intrinsics.checkExpressionValueIsNotNull(keyEvent, "event");
                            if (keyEvent.getAction() == 0) {
                                return this.f155156a.mo214107a(i3);
                            }
                        }
                        if (i != 4) {
                            return false;
                        }
                        if (this.f155156a.f155143b) {
                            C60700b.m235851b("LocalShareCodeInputView@", "[onPress]", "KEYCODE_BACK pressed, will hide keyboard");
                            this.f155156a.mo214109b();
                            return true;
                        }
                        C60700b.m235851b("LocalShareCodeInputView@", "[onPress2]", "KEYCODE_BACK pressed, will dissmiss dialog");
                        AbstractC61222a dialogInterface = this.f155156a.getDialogInterface();
                        if (dialogInterface == null) {
                            return true;
                        }
                        dialogInterface.dismiss();
                        return true;
                    }
                });
            }
        }
        C60762k kVar = new C60762k(this);
        this.f155146f = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a(this) {
            /* class com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView.C618134 */

            /* renamed from: a */
            final /* synthetic */ LocalShareCodeInputView f155158a;

            {
                this.f155158a = r1;
            }

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public final void onKeyboardStateChanged(boolean z, int i) {
                this.f155158a.f155143b = z;
                C60700b.m235851b("LocalShareCodeInputView@", "[onKeyboardStateChanged]", "isShown = " + z);
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalShareCodeInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
