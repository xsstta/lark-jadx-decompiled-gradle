package com.ss.android.lark.invite_new_tenant.invite.single.email;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a;
import com.ss.android.lark.invite_new_tenant.p2066d.C40538a;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class InviteSingleByEmailView implements C40585a.AbstractC40587b {

    /* renamed from: a */
    public C40585a.AbstractC40587b.AbstractC40588a f103000a;

    /* renamed from: b */
    public Context f103001b;

    /* renamed from: c */
    private AbstractC40584a f103002c;
    @BindView(4745)
    EditText mMobileMumEt;
    @BindView(4953)
    KeyboardDetectorFrameLayout mRootView;
    @BindView(4744)
    Button mSubmitBtn;
    @BindView(4746)
    ImageView mTipIv;
    @BindView(4748)
    TextView mTipTextTv;

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.InviteSingleByEmailView$a */
    public interface AbstractC40584a {
        /* renamed from: a */
        void mo146712a(InviteSingleByEmailView inviteSingleByEmailView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40587b
    /* renamed from: d */
    public boolean mo146711d() {
        return C40538a.m160455a(this.f103001b);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40587b
    /* renamed from: a */
    public void mo146706a() {
        LKUIToast.show(this.f103001b, (int) R.string.Lark_UserGrowth_InviteTenantToastSent);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40587b
    /* renamed from: b */
    public void mo146709b() {
        EditText editText = this.mMobileMumEt;
        if (editText != null) {
            editText.setText("");
        }
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40587b
    /* renamed from: c */
    public void mo146710c() {
        LKUIToast.show(this.f103001b, (int) R.string.Lark_UserGrowth_InviteTenantToastExistingUser);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f103002c.mo146712a(this);
        this.mSubmitBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.email.InviteSingleByEmailView.C405811 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                String obj = InviteSingleByEmailView.this.mMobileMumEt.getText().toString();
                InviteSingleByEmailView.this.mMobileMumEt.clearFocus();
                KeyboardUtils.hideKeyboard(InviteSingleByEmailView.this.f103001b);
                InviteSingleByEmailView.this.f103000a.mo146714a(obj);
            }
        });
        this.mMobileMumEt.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.email.InviteSingleByEmailView.C405822 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                InviteSingleByEmailView.this.mSubmitBtn.setEnabled(!TextUtils.isEmpty(editable.toString()));
            }
        });
        m160554e();
    }

    /* renamed from: e */
    private void m160554e() {
        this.mMobileMumEt.setInputType(32);
        this.mSubmitBtn.setEnabled(false);
        this.mTipIv.setVisibility(0);
        this.mSubmitBtn.setVisibility(0);
        this.mTipIv.setImageResource(R.drawable.invite_for_teamwork);
        this.mRootView.mo197981a(new KeyboardDetectorFrameLayout.AbstractC58470a() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.email.InviteSingleByEmailView.C405833 */

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
            /* renamed from: b */
            public void mo101542b() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) InviteSingleByEmailView.this.mSubmitBtn.getLayoutParams();
                layoutParams.addRule(3, R.id.above_keyboard_layout);
                layoutParams.removeRule(12);
                InviteSingleByEmailView.this.mSubmitBtn.setAlpha(1.0f);
            }

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
            /* renamed from: a */
            public void mo101540a(int i) {
                int[] iArr = new int[2];
                InviteSingleByEmailView.this.mSubmitBtn.getLocationInWindow(iArr);
                int keyboardHeight = KeyboardUtils.getKeyboardHeight(InviteSingleByEmailView.this.f103001b);
                if (DeviceUtils.getScreenHeight(InviteSingleByEmailView.this.f103001b) - keyboardHeight < iArr[1] + InviteSingleByEmailView.this.mSubmitBtn.getHeight()) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) InviteSingleByEmailView.this.mSubmitBtn.getLayoutParams();
                    InviteSingleByEmailView.this.mSubmitBtn.setAlpha(0.2f);
                    layoutParams.removeRule(3);
                    layoutParams.addRule(12);
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C40585a.AbstractC40587b.AbstractC40588a aVar) {
        this.f103000a = aVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40587b
    /* renamed from: a */
    public void mo146708a(String str) {
        LKUIToast.show(this.f103001b, str);
    }

    public InviteSingleByEmailView(Context context, AbstractC40584a aVar) {
        this.f103001b = context;
        this.f103002c = aVar;
    }
}
