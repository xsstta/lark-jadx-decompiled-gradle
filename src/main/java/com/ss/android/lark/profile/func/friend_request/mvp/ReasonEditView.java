package com.ss.android.lark.profile.func.friend_request.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;

public class ReasonEditView implements AbstractC52283a.AbstractC52285b {

    /* renamed from: a */
    public Context f129662a;

    /* renamed from: b */
    public final C25707a[] f129663b = new C25707a[1];

    /* renamed from: c */
    private AbstractC52282a f129664c;

    /* renamed from: d */
    private AbstractC52283a.AbstractC52285b.AbstractC52286a f129665d;
    @BindView(6740)
    ImageView mReasonClearBtn;
    @BindView(6985)
    EditText mReasonET;
    @BindView(7885)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView$a */
    public interface AbstractC52282a {
        /* renamed from: a */
        void mo179098a(ReasonEditView reasonEditView);

        /* renamed from: a */
        void mo179099a(boolean z);
    }

    /* renamed from: d */
    private void m202873d() {
        m202874e();
        m202875f();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f129664c = null;
        this.f129665d = null;
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b
    /* renamed from: a */
    public void mo179100a() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView.RunnableC522814 */

            public void run() {
                ReasonEditView.this.f129663b[0] = LKUIToast.newGlobal(ReasonEditView.this.f129662a, UIHelper.getString(R.string.Lark_Legacy_FriendRequestSending));
                ReasonEditView.this.f129663b[0].mo90186a(R.drawable.ic_loading_oval, LKUIToast.getRotateAnimation());
                ReasonEditView.this.f129663b[0].mo90191c();
            }
        });
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b
    /* renamed from: b */
    public void mo179104b() {
        this.f129663b[0].mo90181a();
    }

    /* renamed from: f */
    private void m202875f() {
        this.mReasonET.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.mReasonClearBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView.View$OnClickListenerC522803 */

            public void onClick(View view) {
                ReasonEditView.this.mReasonET.setText("");
            }
        });
    }

    /* renamed from: c */
    public void mo179106c() {
        String obj = this.mReasonET.getText().toString();
        AbstractC52283a.AbstractC52285b.AbstractC52286a aVar = this.f129665d;
        if (aVar != null) {
            aVar.mo179116a(obj, this.f129662a);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f129664c.mo179098a(this);
        this.f129662a = this.mTitleBar.getContext();
        m202873d();
    }

    /* renamed from: e */
    private void m202874e() {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_ProfileFriendRequest);
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Send)) {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView.C522781 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                ReasonEditView.this.mo179106c();
            }
        });
        this.mTitleBar.getRightText().setTextColor(this.f129662a.getResources().getColor(R.color.lkui_B500));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.ReasonEditView.View$OnClickListenerC522792 */

            public void onClick(View view) {
                ReasonEditView.this.mo179103a(false);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC52283a.AbstractC52285b.AbstractC52286a aVar) {
        this.f129665d = aVar;
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b
    /* renamed from: b */
    public void mo179105b(String str) {
        LKUIToast.show(this.f129662a, str);
    }

    public ReasonEditView(AbstractC52282a aVar) {
        this.f129664c = aVar;
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b
    /* renamed from: a */
    public void mo179102a(String str) {
        this.mReasonET.setText(str);
        this.mReasonET.setSelection(str.length());
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b
    /* renamed from: a */
    public void mo179103a(boolean z) {
        KeyboardUtils.hideKeyboard(this.f129662a, this.mReasonET);
        AbstractC52282a aVar = this.f129664c;
        if (aVar != null) {
            aVar.mo179099a(z);
        }
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b
    /* renamed from: c */
    public void mo179107c(String str) {
        new C25639g(this.f129662a).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89238b(true).mo89239c();
    }
}
