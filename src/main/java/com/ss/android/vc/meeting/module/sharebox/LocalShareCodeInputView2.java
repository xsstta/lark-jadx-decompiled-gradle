package com.ss.android.vc.meeting.module.sharebox;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.module.localshare.ILocalShareInput;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u000f\u0018\u0000 E2\u00020\u0001:\u0003DEFB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020$J\u0006\u00106\u001a\u000204J\u0010\u00107\u001a\u0002042\b\u00108\u001a\u0004\u0018\u000109J\u0006\u0010:\u001a\u000204J\u0010\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020$H\u0002J\u0010\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u0018H\u0002J\u0018\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u0007H\u0002J\u0006\u0010B\u001a\u000204J\u0012\u0010C\u001a\u0002042\b\u00108\u001a\u0004\u0018\u000109H\u0002R\u000e\u0010\t\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006G"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "GROUP_LENGTH", "MEETING_NUMBER_MAX_LEN", "SHARE_CODE_MAX_LEN", "codeInputRootView", "Landroid/view/View;", "codeTextWatcher", "com/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$codeTextWatcher$1", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$codeTextWatcher$1;", "dialogInterface", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "getDialogInterface", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "setDialogInterface", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "inputText", "", "getInputText", "()Ljava/lang/String;", "setInputText", "(Ljava/lang/String;)V", "inputType", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$InputType;", "getInputType", "()Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$InputType;", "setInputType", "(Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$InputType;)V", "keyboardIsShowing", "", "keyboardState", "Lcom/ss/android/vc/common/utils/SoftKeyboardState;", "localShareInputListener", "Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;", "getLocalShareInputListener", "()Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;", "setLocalShareInputListener", "(Lcom/ss/android/vc/meeting/module/localshare/ILocalShareInput;)V", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "getLocalSharePrepareView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "setLocalSharePrepareView", "(Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "hideKeyboard", "", "onBackPressed", "onCodeVerifyBegin", "onCodeVerifyFail", "failReason", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$CodeFailReason;", "onCodeVerifySuccess", "onTextInput", "isDeleting", "processTextInput", "text", "setInputAreaTxt", "txt", "cursorLocation", "showKeyboard", "updateInputArea", "CodeFailReason", "Companion", "InputType", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LocalShareCodeInputView2 extends FrameLayout {

    /* renamed from: c */
    public static final Companion f158803c = new Companion(null);

    /* renamed from: a */
    public View f158804a;

    /* renamed from: b */
    public boolean f158805b;

    /* renamed from: d */
    private String f158806d;

    /* renamed from: e */
    private AbstractC61222a f158807e;

    /* renamed from: f */
    private C60762k f158808f;

    /* renamed from: g */
    private ILocalShareInput f158809g;

    /* renamed from: h */
    private ILocalSharePrepareContract.IView f158810h;

    /* renamed from: i */
    private InputType f158811i;

    /* renamed from: j */
    private final int f158812j;

    /* renamed from: k */
    private final int f158813k;

    /* renamed from: l */
    private final int f158814l;

    /* renamed from: m */
    private C63019b f158815m;

    /* renamed from: n */
    private HashMap f158816n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$CodeFailReason;", "", "(Ljava/lang/String;I)V", "UNABLE_SHARE_TO_ROOM", "INVALID_SHARE_CODE", "NO_ROOM_IN_MEETING", GrsBaseInfo.CountryCodeSource.UNKNOWN, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CodeFailReason {
        UNABLE_SHARE_TO_ROOM,
        INVALID_SHARE_CODE,
        NO_ROOM_IN_MEETING,
        UNKNOWN
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$InputType;", "", "(Ljava/lang/String;I)V", "SHARE_CODE", "MEETING_NUMBER", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum InputType {
        SHARE_CODE,
        MEETING_NUMBER
    }

    public LocalShareCodeInputView2(Context context) {
        this(context, null, 0, 6, null);
    }

    public LocalShareCodeInputView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo217713a(int i) {
        if (this.f158816n == null) {
            this.f158816n = new HashMap();
        }
        View view = (View) this.f158816n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f158816n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo217714a() {
        mo217720d();
    }

    /* renamed from: b */
    public final void mo217717b() {
        mo217720d();
    }

    public final AbstractC61222a getDialogInterface() {
        return this.f158807e;
    }

    public final String getInputText() {
        return this.f158806d;
    }

    public final InputType getInputType() {
        return this.f158811i;
    }

    public final ILocalShareInput getLocalShareInputListener() {
        return this.f158809g;
    }

    public final ILocalSharePrepareContract.IView getLocalSharePrepareView() {
        return this.f158810h;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2$d */
    public static final class RunnableC63021d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeInputView2 f158823a;

        RunnableC63021d(LocalShareCodeInputView2 localShareCodeInputView2) {
            this.f158823a = localShareCodeInputView2;
        }

        public final void run() {
            this.f158823a.mo217715a((CodeFailReason) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2$c */
    public static final class RunnableC63020c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeInputView2 f158822a;

        RunnableC63020c(LocalShareCodeInputView2 localShareCodeInputView2) {
            this.f158822a = localShareCodeInputView2;
        }

        public final void run() {
            EditText editText = (EditText) this.f158822a.mo217713a(R.id.code_input_et);
            if (editText != null) {
                editText.requestFocus();
            }
            this.f158822a.mo217719c();
        }
    }

    /* renamed from: c */
    public final void mo217719c() {
        Boolean bool;
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (((EditText) mo217713a(R.id.code_input_et)) != null) {
                if (inputMethodManager != null) {
                    bool = Boolean.valueOf(inputMethodManager.showSoftInput((EditText) mo217713a(R.id.code_input_et), 0));
                } else {
                    bool = null;
                }
                bool.booleanValue();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: d */
    public final void mo217720d() {
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

    /* renamed from: e */
    public final boolean mo217721e() {
        if (this.f158805b) {
            C60700b.m235851b("LocalShareCodeInputView2", "[onPress]", "KEYCODE_BACK pressed, will hide keyboard");
            mo217720d();
            return true;
        }
        C60700b.m235851b("LocalShareCodeInputView2", "[onPress2]", "KEYCODE_BACK pressed, will dissmiss dialog");
        AbstractC61222a aVar = this.f158807e;
        if (aVar == null) {
            return true;
        }
        aVar.dismiss();
        return true;
    }

    public final void setDialogInterface(AbstractC61222a aVar) {
        this.f158807e = aVar;
    }

    public final void setInputType(InputType inputType) {
        this.f158811i = inputType;
    }

    public final void setLocalShareInputListener(ILocalShareInput aVar) {
        this.f158809g = aVar;
    }

    public final void setLocalSharePrepareView(ILocalSharePrepareContract.IView bVar) {
        this.f158810h = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$codeTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2$b */
    public static final class C63019b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeInputView2 f158821a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63019b(LocalShareCodeInputView2 localShareCodeInputView2) {
            this.f158821a = localShareCodeInputView2;
        }

        public void afterTextChanged(Editable editable) {
            LocalShareCodeInputView2 localShareCodeInputView2 = this.f158821a;
            String valueOf = String.valueOf(editable);
            if (valueOf != null) {
                localShareCodeInputView2.mo217716a(StringsKt.trim((CharSequence) valueOf).toString());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    public final void setInputText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f158806d = str;
    }

    /* renamed from: b */
    public final void mo217718b(CodeFailReason codeFailReason) {
        C60700b.m235851b("LocalShareCodeInputView2", "[onCodeVerifyFail]", "failReason = " + codeFailReason);
        mo217715a(codeFailReason);
        View view = this.f158804a;
        if (view != null) {
            view.postDelayed(new RunnableC63020c(this), 200);
        }
    }

    /* renamed from: a */
    public final void mo217715a(CodeFailReason codeFailReason) {
        String str;
        int i = R.color.ud_R500;
        if (codeFailReason != null) {
            View a = mo217713a(R.id.code_input_line);
            if (a != null) {
                a.setBackgroundColor(C60773o.m236126d(R.color.ud_R500));
            }
        } else {
            View a2 = mo217713a(R.id.code_input_line);
            if (a2 != null) {
                a2.setBackgroundColor(C60773o.m236126d(R.color.ud_B500));
            }
        }
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo217713a(R.id.code_input_title);
        if (codeFailReason == null) {
            i = R.color.ud_N600;
        }
        lineHeightTextView.setTextColor(C60773o.m236126d(i));
        if (codeFailReason == null) {
            LineHeightTextView lineHeightTextView2 = (LineHeightTextView) mo217713a(R.id.code_input_title);
            Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView2, "code_input_title");
            lineHeightTextView2.setText(UIHelper.getString(R.string.View_G_EnterSharingCodeOrMeetingID));
            return;
        }
        LineHeightTextView lineHeightTextView3 = (LineHeightTextView) mo217713a(R.id.code_input_title);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView3, "code_input_title");
        int i2 = C63024d.f158834b[codeFailReason.ordinal()];
        if (i2 == 1) {
            str = UIHelper.getString(R.string.View_G_UnableToShareScreenToThisRoom);
        } else if (i2 == 2) {
            str = UIHelper.getString(R.string.View_G_InvalidSharingCodeOrMeetingID);
        } else if (i2 == 3) {
            str = UIHelper.getString(R.string.View_MV_NoRoomSharingNow);
        } else if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        lineHeightTextView3.setText(str);
    }

    /* renamed from: a */
    private final void m246687a(boolean z) {
        int i;
        EditText editText = (EditText) mo217713a(R.id.code_input_et);
        if (editText != null) {
            i = editText.getSelectionStart();
        } else {
            i = 0;
        }
        if (z) {
            int i2 = this.f158812j;
            if (i == i2) {
                if (this.f158806d.length() > this.f158812j) {
                    StringBuilder sb = new StringBuilder();
                    String str = this.f158806d;
                    int i3 = this.f158812j - 1;
                    if (str != null) {
                        String substring = str.substring(0, i3);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        String str2 = this.f158806d;
                        int i4 = this.f158812j;
                        int length = str2.length();
                        if (str2 != null) {
                            String substring2 = str2.substring(i4, length);
                            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            sb.append(substring2);
                            this.f158806d = sb.toString();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    int length2 = this.f158806d.length();
                    int i5 = this.f158812j;
                    if (length2 > i5 - 1) {
                        String str3 = this.f158806d;
                        int i6 = i5 - 1;
                        if (str3 != null) {
                            String substring3 = str3.substring(0, i6);
                            Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            this.f158806d = substring3;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                i = this.f158812j - 1;
            } else if (i == (i2 * 2) + 1) {
                if (this.f158806d.length() > this.f158812j * 2) {
                    StringBuilder sb2 = new StringBuilder();
                    String str4 = this.f158806d;
                    int i7 = (this.f158812j * 2) - 1;
                    if (str4 != null) {
                        String substring4 = str4.substring(0, i7);
                        Intrinsics.checkExpressionValueIsNotNull(substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring4);
                        String str5 = this.f158806d;
                        int i8 = this.f158812j * 2;
                        int length3 = str5.length();
                        if (str5 != null) {
                            String substring5 = str5.substring(i8, length3);
                            Intrinsics.checkExpressionValueIsNotNull(substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            sb2.append(substring5);
                            this.f158806d = sb2.toString();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    int length4 = this.f158806d.length();
                    int i9 = this.f158812j;
                    if (length4 >= (i9 * 2) - 1) {
                        String str6 = this.f158806d;
                        int i10 = (i9 * 2) - 1;
                        if (str6 != null) {
                            String substring6 = str6.substring(0, i10);
                            Intrinsics.checkExpressionValueIsNotNull(substring6, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            this.f158806d = substring6;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                i = this.f158812j * 2;
            } else if (i >= i2 && i > i2) {
                int i11 = i2 * 2;
            }
        } else {
            int i12 = this.f158812j;
            if (i == i12 + 1 || i == (i12 * 2) + 2) {
                i++;
            }
        }
        StringBuilder sb3 = new StringBuilder(this.f158806d);
        int length5 = sb3.length();
        int i13 = this.f158812j;
        if (length5 <= i13) {
            String sb4 = sb3.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb4, "builder.toString()");
            m246686a(sb4, RangesKt.coerceAtMost(i, sb3.length()));
        } else {
            sb3.insert(i13, " ");
            int length6 = sb3.length();
            int i14 = this.f158812j;
            if (length6 <= (i14 * 2) + 1) {
                String sb5 = sb3.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb5, "builder.toString()");
                m246686a(sb5, RangesKt.coerceAtMost(i, sb3.length()));
            } else {
                sb3.insert((i14 * 2) + 1, " ");
                String sb6 = sb3.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb6, "builder.toString()");
                m246686a(sb6, RangesKt.coerceAtMost(i, sb3.length()));
            }
        }
        C60735ab.m236001a(new RunnableC63021d(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo217716a(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2.mo217716a(java.lang.String):void");
    }

    /* renamed from: a */
    private final void m246686a(String str, int i) {
        EditText editText = (EditText) mo217713a(R.id.code_input_et);
        if (editText != null) {
            editText.removeTextChangedListener(this.f158815m);
        }
        EditText editText2 = (EditText) mo217713a(R.id.code_input_et);
        if (editText2 != null) {
            editText2.setText(str);
        }
        EditText editText3 = (EditText) mo217713a(R.id.code_input_et);
        if (editText3 != null) {
            editText3.setSelection(i);
        }
        EditText editText4 = (EditText) mo217713a(R.id.code_input_et);
        if (editText4 != null) {
            editText4.addTextChangedListener(this.f158815m);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareCodeInputView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f158806d = "";
        this.f158812j = 3;
        this.f158813k = 9;
        this.f158814l = 6;
        this.f158815m = new C63019b(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.vc_layout_local_share_code2, (ViewGroup) this, true);
        this.f158804a = inflate;
        if (inflate != null) {
            inflate.post(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2.RunnableC630151 */

                /* renamed from: a */
                final /* synthetic */ LocalShareCodeInputView2 f158817a;

                {
                    this.f158817a = r1;
                }

                public final void run() {
                    View view = this.f158817a.f158804a;
                    if (view != null) {
                        view.postDelayed(new Runnable(this) {
                            /* class com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2.RunnableC630151.RunnableC630161 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC630151 f158818a;

                            {
                                this.f158818a = r1;
                            }

                            public final void run() {
                                EditText editText = (EditText) this.f158818a.f158817a.mo217713a(R.id.code_input_et);
                                if (editText != null) {
                                    editText.requestFocus();
                                }
                                this.f158818a.f158817a.mo217719c();
                            }
                        }, 200);
                    }
                }
            });
        }
        EditText editText = (EditText) mo217713a(R.id.code_input_et);
        if (editText != null) {
            editText.addTextChangedListener(this.f158815m);
        }
        EditText editText2 = (EditText) mo217713a(R.id.code_input_et);
        if (editText2 != null) {
            editText2.setOnKeyListener(View$OnKeyListenerC630172.f158819a);
        }
        C60762k kVar = new C60762k(this);
        this.f158808f = kVar;
        if (kVar != null) {
            kVar.mo208369a(new C60762k.AbstractC60764a(this) {
                /* class com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2.C630183 */

                /* renamed from: a */
                final /* synthetic */ LocalShareCodeInputView2 f158820a;

                {
                    this.f158820a = r1;
                }

                @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
                public final void onKeyboardStateChanged(boolean z, int i) {
                    this.f158820a.f158805b = z;
                    C60700b.m235851b("LocalShareCodeInputView2", "[onKeyboardStateChanged]", "isShown = " + z);
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalShareCodeInputView2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
