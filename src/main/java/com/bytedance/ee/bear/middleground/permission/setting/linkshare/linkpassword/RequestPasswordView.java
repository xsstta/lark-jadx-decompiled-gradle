package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.suite.R;

public class RequestPasswordView extends FrameLayout {

    /* renamed from: a */
    public TextView f27145a;

    /* renamed from: b */
    private SpaceEmptyState f27146b;

    /* renamed from: c */
    private SpaceEditText f27147c;

    /* renamed from: d */
    private AbstractC10044a f27148d;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView$a */
    public interface AbstractC10044a {
        void onActionDone(String str);
    }

    /* renamed from: a */
    public void mo38368a() {
        this.f27147c.clearFocus();
    }

    /* renamed from: b */
    public void mo38370b() {
        mo38369a(R.string.Doc_Permission_PasswordError);
    }

    /* renamed from: c */
    private void m41798c() {
        if (this.f27148d != null && !TextUtils.isEmpty(this.f27147c.getText().toString()) && C13737d.m55692a()) {
            this.f27148d.onActionDone(this.f27147c.getText().toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41796a(View view) {
        m41798c();
    }

    public void setOnInputPasswordListener(AbstractC10044a aVar) {
        this.f27148d = aVar;
    }

    public RequestPasswordView(Context context) {
        super(context);
        m41795a(context);
    }

    public void setConfirmBtnVisibility(int i) {
        this.f27145a.setVisibility(i);
    }

    public void setEditTextHint(int i) {
        this.f27147c.setHint(i);
    }

    public void setInputVisibility(int i) {
        this.f27147c.setVisibility(i);
    }

    public void setTips(String str) {
        this.f27146b.setTitle(str);
    }

    public void setTips(int i) {
        this.f27146b.setTitle(getContext().getString(i));
    }

    /* renamed from: a */
    public void mo38369a(int i) {
        Toast.showFailureText(getContext(), getResources().getString(i), 0);
        this.f27147c.mo90934l();
    }

    /* renamed from: a */
    private void m41795a(Context context) {
        View.inflate(context, R.layout.request_password_layout, this);
        this.f27146b = (SpaceEmptyState) findViewById(R.id.password_empty_state);
        this.f27147c = (SpaceEditText) findViewById(R.id.password_locked_edit_password);
        this.f27145a = (TextView) findViewById(R.id.btn_confirm_password);
        this.f27147c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$RequestPasswordView$Gxaha_9n1Wg1rMgjZOhethnMis */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return RequestPasswordView.this.m41797a(textView, i, keyEvent);
            }
        });
        this.f27145a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$RequestPasswordView$6c99aYGvw_D9qSEQ9wllP2VcMg */

            public final void onClick(View view) {
                RequestPasswordView.this.m41796a((RequestPasswordView) view);
            }
        });
        this.f27147c.addTextChangedListener(new TextWatcher() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.RequestPasswordView.C100431 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(editable.toString())) {
                    RequestPasswordView.this.f27145a.setBackgroundResource(R.drawable.password_view_encrypt_confirm);
                    RequestPasswordView.this.f27145a.setEnabled(true);
                    return;
                }
                RequestPasswordView.this.f27145a.setBackgroundResource(R.drawable.password_view_encrypt_confirm_disable);
                RequestPasswordView.this.f27145a.setEnabled(false);
            }
        });
    }

    public RequestPasswordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41795a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m41797a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        m41798c();
        return true;
    }
}
