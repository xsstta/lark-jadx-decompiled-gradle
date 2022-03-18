package com.larksuite.component.openplatform.core.plugin.op;

import android.app.Activity;
import android.os.ResultReceiver;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.view.keyboard.KeyboardInputView;
import com.tt.miniapp.view.keyboard.KeyboardLayout;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.v */
public class C25424v extends ApiHandler {

    /* renamed from: a */
    private String f61970a;

    /* renamed from: b */
    private TextView f61971b;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return this.f61970a;
    }

    /* renamed from: a */
    private ResultReceiver m90940a() {
        return new ApiKeyboardCtrl$2(this, null);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiKeyboardCtrl", "ApiKeyboardCtrl ", this.f61970a, ",", this.mArgs);
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail("activity is null");
            return;
        }
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo();
        if (appInfo == null) {
            callbackFail("app info is null");
            return;
        }
        try {
            if (appInfo.isGame()) {
                m90947e(currentActivity);
            } else {
                m90946d(currentActivity);
            }
        } catch (Throwable th) {
            callbackFail(th);
        }
    }

    /* renamed from: j */
    private View m90952j(Activity activity) {
        return activity.findViewById(16908290);
    }

    /* renamed from: g */
    private void m90949g(final Activity activity) {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25424v.RunnableC254251 */

            public void run() {
                try {
                    C25424v.this.mo88552b(activity);
                    C25424v.this.mo88549a(activity);
                    C25424v.this.mo88553c(activity);
                } catch (Exception e) {
                    C25424v.this.callbackFail(e);
                    AppBrandLogger.stacktrace(6, "tma_ApiKeyboardCtrl", e.getStackTrace());
                }
            }
        });
    }

    /* renamed from: i */
    private KeyboardInputView m90951i(Activity activity) {
        View j = m90952j(activity);
        if (j instanceof ViewGroup) {
            return (KeyboardInputView) m90942a((ViewGroup) j, KeyboardInputView.class);
        }
        return null;
    }

    /* renamed from: k */
    private boolean m90953k(Activity activity) {
        View a = m90942a(m90952j(activity), KeyboardLayout.class);
        if (a == null || !(a instanceof KeyboardLayout)) {
            return false;
        }
        KeyboardLayout keyboardLayout = (KeyboardLayout) a;
        keyboardLayout.setActivity(activity);
        if (!keyboardLayout.mo233589a()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m90947e(Activity activity) {
        if (TextUtils.equals(this.f61970a, "hideKeyboard")) {
            m90948f(activity);
        } else if (TextUtils.equals(this.f61970a, "showKeyboard")) {
            m90949g(activity);
        } else if (TextUtils.equals(this.f61970a, "updateKeyboard")) {
            m90950h(activity);
        }
    }

    /* renamed from: f */
    private void m90948f(Activity activity) {
        EditText editText;
        KeyboardInputView i = m90951i(activity);
        if (i != null) {
            i.mo233585a(getAppContext());
        }
        if (i == null) {
            editText = null;
        } else {
            editText = i.getEditText();
        }
        if (mo88551a(editText, activity)) {
            callbackOk();
        } else {
            callbackFail("close keyboard fail");
        }
    }

    /* renamed from: c */
    public boolean mo88553c(Activity activity) {
        KeyboardInputView i = m90951i(activity);
        if (i != null) {
            i.mo233585a(getAppContext());
        }
        if (i == null || i.f169491a == null) {
            return false;
        }
        i.f169491a.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            return inputMethodManager.showSoftInput(i.f169491a, 2, m90940a());
        }
        return false;
    }

    /* renamed from: a */
    private int m90939a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    c = 0;
                    break;
                }
                break;
            case 3304:
                if (str.equals("go")) {
                    c = 1;
                    break;
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    c = 2;
                    break;
                }
                break;
            case 3526536:
                if (str.equals("send")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R.string.microapp_m_keyboard_search;
            case 1:
                return R.string.microapp_m_keyboard_go;
            case 2:
                return R.string.microapp_m_keyboard_next;
            case 3:
                return R.string.microapp_m_keyboard_send;
            default:
                return R.string.microapp_m_keyboard_done;
        }
    }

    /* renamed from: b */
    private int m90945b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    c = 0;
                    break;
                }
                break;
            case 3304:
                if (str.equals("go")) {
                    c = 1;
                    break;
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    c = 2;
                    break;
                }
                break;
            case 3526536:
                if (str.equals("send")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 4;
            default:
                return 6;
        }
    }

    /* renamed from: d */
    private void m90946d(Activity activity) {
        if (TextUtils.equals(this.f61970a, "hideKeyboard")) {
            RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager().getCurrentIRender();
            if (currentIRender != null) {
                NativeViewManager nativeViewManager = currentIRender.getNativeViewManager();
                if (nativeViewManager != null) {
                    View focusedInput = nativeViewManager.getFocusedInput();
                    if (focusedInput == null) {
                        callbackFail("focused input is null");
                    } else if (mo88551a(focusedInput, activity)) {
                        callbackOk();
                    } else {
                        callbackFail("close keyboard fail");
                    }
                } else {
                    callbackFail("native view manager is null");
                }
            } else {
                callbackFail("current render is null");
            }
        }
    }

    /* renamed from: h */
    private void m90950h(Activity activity) {
        KeyboardInputView i = m90951i(activity);
        if (i != null) {
            i.mo233585a(getAppContext());
        }
        if (i != null) {
            try {
                final String optString = new JSONObject(this.mArgs).optString("value");
                final EditText editText = i.getEditText();
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.C25424v.RunnableC254284 */

                    public void run() {
                        editText.setText(optString);
                        EditText editText = editText;
                        editText.setSelection(editText.getText().length());
                        C25424v.this.callbackOk();
                    }
                });
            } catch (JSONException e) {
                AppBrandLogger.m52829e("tma_ApiKeyboardCtrl", e);
                callbackFail(e);
            }
        } else {
            callbackFail("keyboard layout is null");
        }
    }

    /* renamed from: b */
    public void mo88552b(Activity activity) throws JSONException {
        TextView textView;
        JSONObject jSONObject = new JSONObject(this.mArgs);
        boolean optBoolean = jSONObject.optBoolean("confirmHold");
        String optString = jSONObject.optString("confirmType");
        KeyboardInputView i = m90951i(activity);
        if (i != null) {
            i.mo233585a(getAppContext());
        }
        if (i == null) {
            textView = null;
        } else {
            textView = i.getConfirmTextView();
        }
        this.f61971b = textView;
        if (textView != null) {
            textView.setText(m90939a(optString));
            this.f61971b.setOnClickListener(m90941a(i.getEditText(), optBoolean, activity));
            this.f61971b.measure(0, 0);
        }
    }

    /* renamed from: a */
    public void mo88549a(Activity activity) throws JSONException {
        EditText editText;
        JSONObject jSONObject = new JSONObject(this.mArgs);
        String optString = jSONObject.optString("defaultValue");
        long optLong = jSONObject.optLong("maxLength", 2147483647L);
        boolean optBoolean = jSONObject.optBoolean("multiple");
        boolean optBoolean2 = jSONObject.optBoolean("confirmHold");
        String optString2 = jSONObject.optString("confirmType");
        KeyboardInputView i = m90951i(activity);
        if (i != null) {
            i.mo233585a(getAppContext());
        }
        if (i == null) {
            editText = null;
        } else {
            editText = i.getEditText();
        }
        if (editText != null) {
            AppBrandLogger.m52830i("tma_ApiKeyboardCtrl", optString);
            editText.setImeOptions(m90945b(optString2) | 268435456);
            editText.setSingleLine(!optBoolean);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) optLong)});
            editText.setText(optString);
            editText.setSelection(editText.getText().length());
            editText.setMaxHeight((int) C67590h.m263065a(activity, 55.0f));
            editText.setOnEditorActionListener(m90943a(optBoolean2, !optBoolean, editText));
            m90944a(activity, editText);
        }
    }

    /* renamed from: a */
    public void mo88550a(EditText editText) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", editText.getText().toString());
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_ApiKeyboardCtrl", e.getStackTrace());
        }
        C67432a.m262319a(getAppContext()).getJsBridge().sendMsgToJsCore("onKeyboardConfirm", jSONObject.toString());
    }

    /* renamed from: a */
    private View m90942a(View view, Class cls) {
        if (view == null) {
            return null;
        }
        if (TextUtils.equals(view.getClass().getName(), cls.getName())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View a = m90942a(viewGroup.getChildAt(i), cls);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m90944a(Activity activity, EditText editText) {
        if (editText != null && this.f61971b != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            layoutParams.width = (C67590h.m263066a(activity) - this.f61971b.getMeasuredWidth()) - this.f61971b.getPaddingStart();
            editText.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public boolean mo88551a(View view, Activity activity) {
        if (m90953k(activity)) {
            AppBrandLogger.m52830i("tma_ApiKeyboardCtrl", "close keyboard is closed");
            return true;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (view != null && inputMethodManager != null) {
            return inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        AppBrandLogger.m52829e("tma_ApiKeyboardCtrl", "close keyboard is fail");
        return false;
    }

    /* renamed from: a */
    private View.OnClickListener m90941a(final EditText editText, final boolean z, final Activity activity) {
        return new View.OnClickListener() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25424v.View$OnClickListenerC254262 */

            public void onClick(View view) {
                AppBrandLogger.m52830i("tma_ApiKeyboardCtrl", "键盘确认按钮点击");
                C25424v.this.mo88550a(editText);
                if (!z) {
                    C25424v.this.mo88551a(editText, activity);
                }
            }
        };
    }

    /* renamed from: a */
    private TextView.OnEditorActionListener m90943a(final boolean z, final boolean z2, final EditText editText) {
        return new TextView.OnEditorActionListener() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25424v.C254273 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (!z2) {
                    return false;
                }
                if (i == 6 || i == 5 || i == 3 || i == 2 || i == 4) {
                    C25424v.this.mo88550a(editText);
                }
                return z;
            }
        };
    }

    public C25424v(String str, String str2, int i, AbstractC67619e eVar) {
        super(str2, i, eVar);
        this.f61970a = str;
    }
}
