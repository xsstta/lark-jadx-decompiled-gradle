package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.app.ComponentActivity;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;

public class EditSignatureView implements AbstractC43573e.AbstractC43575b {

    /* renamed from: a */
    public boolean f110512a;

    /* renamed from: b */
    private Context f110513b;

    /* renamed from: c */
    private AbstractC43547a f110514c;

    /* renamed from: d */
    private AbstractC43573e.AbstractC43575b.AbstractC43576a f110515d;

    /* renamed from: e */
    private C43909a f110516e;

    /* renamed from: f */
    private EmailSignature f110517f;
    View mCloseView;
    UDEditText mMobileContent;
    View mSaveView;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureView$a */
    public interface AbstractC43547a {
        /* renamed from: a */
        void mo155458a(EditSignatureView editSignatureView);
    }

    /* renamed from: b */
    public void mo155462b() {
        ((ComponentActivity) this.f110513b).finish();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110515d = null;
        this.f110514c = null;
    }

    /* renamed from: c */
    public void mo155463c() {
        C43909a aVar = this.f110516e;
        if (aVar != null && aVar.mo156328b()) {
            this.f110516e.mo156326a();
        }
    }

    /* renamed from: e */
    private void m172851e() {
        C43909a aVar = this.f110516e;
        if (aVar == null || !aVar.mo156328b()) {
            this.f110516e = new C43909a(this.f110513b);
        }
        this.f110516e.mo156327a(C43819s.m173684a((int) R.string.Mail_OOO_Saving));
    }

    /* renamed from: a */
    public void mo155459a() {
        if (this.f110512a) {
            m172842a(this.f110513b, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EditSignatureView$PCyABhDqWKe2xpP5acEX_Abd6A */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditSignatureView.m270782lambda$PCyABhDqWKe2xpP5acEX_Abd6A(EditSignatureView.this, dialogInterface, i);
                }
            });
        } else {
            mo155462b();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110514c.mo155458a(this);
        mo155460a(this.f110515d.mo155556a());
        this.mMobileContent.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureView.C435441 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EditSignatureView.this.f110512a = true;
            }
        });
        this.mCloseView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EditSignatureView$Bf06CzPu5MpgNWYOyVMgXyjJClg */

            public final void onClick(View view) {
                EditSignatureView.lambda$Bf06CzPu5MpgNWYOyVMgXyjJClg(EditSignatureView.this, view);
            }
        });
        this.mSaveView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EditSignatureView$6VFgEfjgHAYnRerB5P36d6oshI */

            public final void onClick(View view) {
                EditSignatureView.m270783lambda$6VFgEfjgHAYnRerB5P36d6oshI(EditSignatureView.this, view);
            }
        });
        m172846a((EditText) this.mMobileContent, true);
    }

    /* renamed from: d */
    private void m172850d() {
        m172851e();
        m172846a((EditText) this.mMobileContent, false);
        final String obj = this.mMobileContent.getText().toString();
        final int length = obj.split("\\r?\\n").length;
        final EmailSignature a = new EmailSignature.C43549a().mo155484a(this.f110517f).mo155490b(true).mo155487a(false).mo155485a(obj).mo155488a();
        this.f110515d.mo155557a(a, new AbstractC41870b<MailUpdateAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureView.C435452 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                EditSignatureView.this.mo155463c();
                MailToast.m173697a((int) R.string.Mail_OOO_failed);
            }

            /* renamed from: a */
            public void mo150435a(MailUpdateAccountResponse mailUpdateAccountResponse) {
                EditSignatureView.this.mo155463c();
                MailToast.m173697a((int) R.string.Mail_OOO_Saved);
                EditSignatureView.this.f110512a = false;
                C42187a.m168495a(!a.mo155474e().isEmpty(), !TextUtils.isEmpty(obj), length);
                EditSignatureView.this.mo155462b();
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172844a(View view) {
        m172850d();
    }

    /* renamed from: b */
    private void m172849b(EmailSignature emailSignature) {
        this.mMobileContent.setText(emailSignature.mo155472d());
    }

    /* renamed from: a */
    public void mo155460a(EmailSignature emailSignature) {
        this.f110517f = emailSignature;
        m172849b(emailSignature);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m172848b(View view) {
        if (this.f110512a) {
            m172842a(this.f110513b, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EditSignatureView$HwCTfUq_0x8IWBRAZ9JF2swEtg8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditSignatureView.lambda$HwCTfUq_0x8IWBRAZ9JF2swEtg8(EditSignatureView.this, dialogInterface, i);
                }
            });
        } else {
            mo155462b();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172845a(EditText editText) {
        editText.requestFocus();
        editText.setSelection(editText.getText().toString().length());
        ((InputMethodManager) this.f110513b.getSystemService("input_method")).showSoftInput(editText, 1);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43573e.AbstractC43575b.AbstractC43576a aVar) {
        this.f110515d = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172843a(DialogInterface dialogInterface, int i) {
        m172850d();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m172847b(DialogInterface dialogInterface, int i) {
        m172850d();
    }

    public EditSignatureView(Context context, AbstractC43547a aVar) {
        this.f110513b = context;
        this.f110514c = aVar;
    }

    /* renamed from: a */
    private void m172846a(EditText editText, boolean z) {
        if (editText == null) {
            return;
        }
        if (z) {
            editText.postDelayed(new Runnable(editText) {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EditSignatureView$oxpyl0lvNFJ7aXO47llB3Uvvj3g */
                public final /* synthetic */ EditText f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    EditSignatureView.lambda$oxpyl0lvNFJ7aXO47llB3Uvvj3g(EditSignatureView.this, this.f$1);
                }
            }, 300);
        } else {
            ((InputMethodManager) this.f110513b.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private void m172842a(Context context, DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89237b(context.getResources().getString(R.string.Mail_Signature_DraftConfirmTitle)).mo89253l(3).mo89242c(context.getResources().getString(R.string.Mail_Signature_DraftConfirmtxt)).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getResources().getString(R.string.Mail_Signature_DraftConfirmAction));
        aVar.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar.mo89270c(17);
        aVar.mo89267a(onClickListener);
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_left);
        aVar2.mo89268a(context.getResources().getString(R.string.Mail_Alert_Discard));
        aVar2.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureView.DialogInterface$OnClickListenerC435463 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                EditSignatureView.this.mo155462b();
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        gVar.mo89239c();
    }
}
