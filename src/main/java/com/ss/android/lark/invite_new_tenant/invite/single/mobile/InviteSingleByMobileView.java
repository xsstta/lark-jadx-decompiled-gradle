package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

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
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c;
import com.ss.android.lark.invite_new_tenant.p2066d.C40538a;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class InviteSingleByMobileView implements C40605c.AbstractC40608c {

    /* renamed from: a */
    public C40605c.AbstractC40608c.AbstractC40609a f103011a;

    /* renamed from: b */
    public Context f103012b;

    /* renamed from: c */
    private AbstractC40599a f103013c;
    @BindView(4749)
    TextView mMobileCodeTv;
    @BindView(4753)
    EditText mMobileMumEt;
    @BindView(4953)
    KeyboardDetectorFrameLayout mRootView;
    @BindView(4751)
    Button mSubmitBtn;
    @BindView(4754)
    ImageView mTipIv;
    @BindView(4756)
    TextView mTipTextTv;

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView$a */
    public interface AbstractC40599a {
        /* renamed from: a */
        void mo146725a(InviteSingleByMobileView inviteSingleByMobileView);

        /* renamed from: a */
        void mo146726a(IInviteNewTenantService.C40630a aVar);

        /* renamed from: a */
        boolean mo146727a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: d */
    public boolean mo146724d() {
        return C40538a.m160455a(this.f103012b);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: a */
    public void mo146717a() {
        EditText editText = this.mMobileMumEt;
        if (editText != null) {
            editText.setText("");
        }
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: b */
    public void mo146721b() {
        LKUIToast.show(this.f103012b, (int) R.string.Lark_UserGrowth_InviteTenantToastSent);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: c */
    public void mo146723c() {
        LKUIToast.show(this.f103012b, (int) R.string.Lark_UserGrowth_InviteTenantToastExistingUser);
    }

    /* renamed from: e */
    private void m160578e() {
        this.mMobileMumEt.setInputType(3);
        this.mSubmitBtn.setEnabled(false);
        this.mTipIv.setVisibility(0);
        this.mSubmitBtn.setVisibility(0);
        this.mTipIv.setImageResource(R.drawable.invite_for_teamwork);
        this.mRootView.mo197981a(new KeyboardDetectorFrameLayout.AbstractC58470a() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.C405984 */

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
            /* renamed from: b */
            public void mo101542b() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) InviteSingleByMobileView.this.mSubmitBtn.getLayoutParams();
                layoutParams.addRule(3, R.id.above_keyboard_layout);
                layoutParams.removeRule(12);
                InviteSingleByMobileView.this.mSubmitBtn.setAlpha(1.0f);
            }

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
            /* renamed from: a */
            public void mo101540a(int i) {
                int[] iArr = new int[2];
                InviteSingleByMobileView.this.mSubmitBtn.getLocationInWindow(iArr);
                int keyboardHeight = KeyboardUtils.getKeyboardHeight(InviteSingleByMobileView.this.f103012b);
                if (DeviceUtils.getScreenHeight(InviteSingleByMobileView.this.f103012b) - keyboardHeight < iArr[1] + InviteSingleByMobileView.this.mSubmitBtn.getHeight()) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) InviteSingleByMobileView.this.mSubmitBtn.getLayoutParams();
                    InviteSingleByMobileView.this.mSubmitBtn.setAlpha(0.2f);
                    layoutParams.removeRule(3);
                    layoutParams.addRule(12);
                }
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f103013c.mo146725a(this);
        this.mMobileCodeTv.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.C405951 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C40531a.m160431a().mo143859b() || C40531a.m160431a().mo143858a("invite.abroadphone.enable")) {
                    InviteSingleByMobileView.this.f103011a.mo146738a();
                }
            }
        });
        this.mSubmitBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.C405962 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                String obj = InviteSingleByMobileView.this.mMobileMumEt.getText().toString();
                String charSequence = InviteSingleByMobileView.this.mMobileCodeTv.getText().toString();
                InviteSingleByMobileView.this.mMobileMumEt.clearFocus();
                KeyboardUtils.hideKeyboard(InviteSingleByMobileView.this.f103012b);
                C40605c.AbstractC40608c.AbstractC40609a aVar = InviteSingleByMobileView.this.f103011a;
                aVar.mo146739a(charSequence + obj);
            }
        });
        this.mMobileMumEt.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.C405973 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                InviteSingleByMobileView.this.mSubmitBtn.setEnabled(!TextUtils.isEmpty(editable.toString()));
            }
        });
        m160578e();
    }

    /* renamed from: a */
    public void setViewDelegate(C40605c.AbstractC40608c.AbstractC40609a aVar) {
        this.f103011a = aVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: a */
    public void mo146720a(String str) {
        this.mMobileCodeTv.setText(str);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: b */
    public void mo146722b(String str) {
        LKUIToast.show(this.f103012b, str);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40608c
    /* renamed from: a */
    public void mo146719a(IInviteNewTenantService.C40630a aVar) {
        if (this.f103013c.mo146727a()) {
            this.f103013c.mo146726a(aVar);
        }
    }

    public InviteSingleByMobileView(Context context, AbstractC40599a aVar) {
        this.f103012b = context;
        this.f103013c = aVar;
    }
}
