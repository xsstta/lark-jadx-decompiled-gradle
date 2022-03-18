package com.tt.miniapp.view.keyboard;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3371e.C67509b;
import org.json.JSONObject;

public class KeyboardInputView extends RelativeLayout {

    /* renamed from: a */
    public EditText f169491a;

    /* renamed from: b */
    private TextView f169492b;

    /* renamed from: c */
    private TextWatcher f169493c;

    public TextView getConfirmTextView() {
        return this.f169492b;
    }

    public EditText getEditText() {
        return this.f169491a;
    }

    public KeyboardInputView(Context context) {
        super(context);
    }

    public void setTextChangedListener(TextWatcher textWatcher) {
        TextWatcher textWatcher2 = this.f169493c;
        if (textWatcher2 != null) {
            this.f169491a.removeTextChangedListener(textWatcher2);
        }
        this.f169493c = textWatcher;
        if (textWatcher != null) {
            this.f169491a.addTextChangedListener(textWatcher);
        }
    }

    /* renamed from: a */
    public void mo233585a(IAppContext iAppContext) {
        try {
            View inflate = inflate(AppbrandContext.getInst().getApplicationContext(), R.layout.microapp_m_keyboard_input_layout, this);
            this.f169491a = (EditText) inflate.findViewById(R.id.microapp_m_keyboard_et);
            this.f169492b = (TextView) inflate.findViewById(R.id.microapp_m_confirm_textview);
        } catch (Throwable th) {
            AppBrandLogger.m52829e("KeyboardInputView", th);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "KeyboardInputView inflator fail ");
                jSONObject.put("throwable", th.toString());
                C67509b.m262587a("mp_start_error", 5001, jSONObject, iAppContext);
                Thread.sleep(200);
            } catch (Exception unused) {
                AppBrandLogger.m52829e("KeyboardInputView", th);
            }
        }
    }

    public KeyboardInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
