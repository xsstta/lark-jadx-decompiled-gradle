package com.ss.android.lark.phone.impl.phoneamountedit.mvp;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;

public class PhoneAmountEditView implements AbstractC51372a.AbstractC51374b {

    /* renamed from: a */
    public Activity f127889a;

    /* renamed from: b */
    public AbstractC51371a f127890b;

    /* renamed from: c */
    public AbstractC51372a.AbstractC51374b.AbstractC51375a f127891c;

    /* renamed from: d */
    public TextView f127892d;
    @BindView(6349)
    TextView mPhoneAmountCheckHintTV;
    @BindView(6347)
    ImageView mPhoneAmountClearIV;
    @BindView(6348)
    EditText mPhoneAmountET;
    @BindView(6350)
    ImageView mPhoneAmountEditIV;
    @BindView(6353)
    TextView mPhoneAmountTV;
    @BindView(6595)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView$a */
    public interface AbstractC51371a {
        /* renamed from: a */
        void mo176973a();

        /* renamed from: a */
        void mo176974a(PhoneAmountEditView phoneAmountEditView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f127890b = null;
    }

    /* renamed from: b */
    private void m199219b() {
        m199220c();
        m199221d();
    }

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51374b
    /* renamed from: a */
    public void mo176975a() {
        AbstractC51371a aVar = this.f127890b;
        if (aVar != null) {
            aVar.mo176973a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f127890b.mo176974a(this);
        m199219b();
    }

    /* renamed from: c */
    private void m199220c() {
        this.mTitleBar.setTitle(UIUtils.getString(this.f127889a, R.string.Lark_Legacy_ApplicationPhoneCallTimeSetPageTitle));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.View$OnClickListenerC513651 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(PhoneAmountEditView.this.f127889a, view);
                if (PhoneAmountEditView.this.f127890b != null) {
                    PhoneAmountEditView.this.f127890b.mo176973a();
                }
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_ApplicationPhoneCallTimeSetSave)) {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.C513662 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                KeyboardUtils.hideKeyboard(PhoneAmountEditView.this.f127889a, view);
                if (PhoneAmountEditView.this.f127891c != null) {
                    PhoneAmountEditView.this.f127891c.mo176988a(PhoneAmountEditView.this.mPhoneAmountET.getText().toString());
                }
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f127892d = rightText;
        rightText.setVisibility(8);
    }

    /* renamed from: d */
    private void m199221d() {
        this.mPhoneAmountEditIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.View$OnClickListenerC513673 */

            public void onClick(View view) {
                int i;
                PhoneAmountEditView.this.mPhoneAmountTV.setVisibility(8);
                PhoneAmountEditView.this.mPhoneAmountEditIV.setVisibility(8);
                PhoneAmountEditView.this.mPhoneAmountClearIV.setVisibility(0);
                PhoneAmountEditView.this.f127892d.setVisibility(0);
                PhoneAmountEditView.this.mo176980a(true);
                PhoneAmountEditView.this.mPhoneAmountET.setVisibility(0);
                PhoneAmountEditView.this.mPhoneAmountET.setText(PhoneAmountEditView.this.mPhoneAmountTV.getText());
                EditText editText = PhoneAmountEditView.this.mPhoneAmountET;
                if (TextUtils.isEmpty(PhoneAmountEditView.this.mPhoneAmountTV.getText())) {
                    i = 0;
                } else {
                    i = PhoneAmountEditView.this.mPhoneAmountTV.getText().length();
                }
                editText.setSelection(i);
                PhoneAmountEditView.this.mPhoneAmountET.requestFocus();
                PhoneAmountEditView.this.mPhoneAmountET.setVisibility(0);
            }
        });
        this.mPhoneAmountET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.View$OnFocusChangeListenerC513684 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    KeyboardUtils.showKeyboard(PhoneAmountEditView.this.f127889a);
                    PhoneAmountEditView.this.mPhoneAmountClearIV.setVisibility(0);
                    return;
                }
                PhoneAmountEditView.this.mPhoneAmountClearIV.setVisibility(8);
                KeyboardUtils.hideKeyboard(PhoneAmountEditView.this.f127889a, PhoneAmountEditView.this.mPhoneAmountET);
            }
        });
        this.mPhoneAmountClearIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.View$OnClickListenerC513695 */

            public void onClick(View view) {
                PhoneAmountEditView.this.mPhoneAmountET.setText("");
            }
        });
        this.mPhoneAmountET.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.C513706 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                PhoneAmountEditView.this.mPhoneAmountET.requestFocus();
                if (TextUtils.isEmpty(obj)) {
                    if (PhoneAmountEditView.this.f127891c != null) {
                        PhoneAmountEditView.this.f127891c.mo176989b("0");
                    }
                    PhoneAmountEditView.this.mPhoneAmountClearIV.setVisibility(8);
                    PhoneAmountEditView.this.mo176980a(false);
                    return;
                }
                if (PhoneAmountEditView.this.f127891c != null) {
                    PhoneAmountEditView.this.f127891c.mo176989b(obj);
                }
                PhoneAmountEditView.this.mo176980a(true);
                PhoneAmountEditView.this.mPhoneAmountClearIV.setVisibility(0);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC51372a.AbstractC51374b.AbstractC51375a aVar) {
        this.f127891c = aVar;
    }

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51374b
    /* renamed from: a */
    public void mo176978a(String str) {
        LKUIToast.show(this.f127889a, str);
    }

    /* renamed from: a */
    public void mo176980a(boolean z) {
        if (z) {
            this.f127892d.setTextColor(UIUtils.getColor(this.f127889a, R.color.lkui_B500));
            this.f127892d.setEnabled(true);
            return;
        }
        this.f127892d.setTextColor(UIUtils.getColor(this.f127889a, R.color.phone_amount_edit_title_right_un_enable_color));
        this.f127892d.setEnabled(false);
    }

    public PhoneAmountEditView(Activity activity, AbstractC51371a aVar) {
        this.f127889a = activity;
        this.f127890b = aVar;
    }

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51374b
    /* renamed from: a */
    public void mo176976a(int i, int i2) {
        this.mPhoneAmountTV.setText(String.valueOf(i));
        this.mPhoneAmountCheckHintTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ApplicationPhoneCallTimeSetPageMsg, "number", String.valueOf(i2)));
    }

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51374b
    /* renamed from: a */
    public void mo176979a(String str, String str2) {
        if (Integer.parseInt(str) > Integer.parseInt(str2)) {
            mo176980a(false);
            this.mPhoneAmountCheckHintTV.setTextColor(UIUtils.getColor(this.f127889a, R.color.lkui_R500));
            this.mPhoneAmountCheckHintTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ApplicationPhoneCallTimeSetErrorMsg, "number", str2));
            return;
        }
        mo176980a(true);
        this.mPhoneAmountCheckHintTV.setTextColor(UIUtils.getColor(this.f127889a, R.color.lkui_N500));
        this.mPhoneAmountCheckHintTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ApplicationPhoneCallTimeSetPageMsg, "number", str2));
    }
}
