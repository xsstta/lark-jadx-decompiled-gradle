package com.ss.android.lark.mail.impl.settings.component.p2221b;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.ILifecycle;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.b.b */
public class C43406b extends AbstractC1142af implements ILifecycle {
    protected C43909a loadingToast;
    protected Context mContext;
    protected AbstractC43411a mDependency;
    protected LifecycleOwner mLifecycleOwner;
    protected View mMailUnlinkAccount;
    protected AbstractC43405a mModel;

    /* renamed from: com.ss.android.lark.mail.impl.settings.component.b.b$a */
    public interface AbstractC43411a {
        /* renamed from: a */
        void mo155201a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        finishLoading();
    }

    public View getView() {
        return this.mMailUnlinkAccount;
    }

    public void finishLoading() {
        C43909a aVar = this.loadingToast;
        if (aVar != null) {
            aVar.mo156326a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.mail_view_unlink_account, (ViewGroup) null);
        this.mMailUnlinkAccount = inflate;
        inflate.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b.C434071 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m172337a(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C43406b bVar = C43406b.this;
                bVar.showSureUnbindMailDialog(bVar.mContext, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.settings.component.p2221b.$$Lambda$b$1$6Lp2CbPla34DJz86JpKz9Bwv98w */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C43406b.C434071.this.m172338b(dialogInterface, i);
                    }
                }, $$Lambda$b$1$ELdF8R2XeewRiCXoFpolX9AamJ0.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m172338b(DialogInterface dialogInterface, int i) {
                C43406b.this.showLoading();
                C43406b.this.mModel.mo155192a(new AbstractC41870b<C42093e>() {
                    /* class com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b.C434071.C434081 */

                    @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                    /* renamed from: a */
                    public void mo150434a(ErrorResult errorResult) {
                        C43406b.this.finishLoading();
                        MailToast.m173697a((int) R.string.Mail_Setting_UnbindFailed);
                        C42209j.m168612a("mailclient_unbind_fail", "toast");
                        Log.m165389i("toggleOpenMail", "error onToggleOpenMail");
                    }

                    /* renamed from: a */
                    public void mo150435a(C42093e eVar) {
                        C43406b.this.finishLoading();
                        if (eVar != null) {
                            MailToast.m173697a((int) R.string.Mail_Setting_UnbindSuccess);
                            if (C43406b.this.mDependency != null) {
                                C43406b.this.mDependency.mo155201a();
                            }
                        }
                    }
                });
            }
        });
        this.mModel.mo155193b().mo5923a(this.mLifecycleOwner, new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b.C434092 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    C43406b.this.mMailUnlinkAccount.setVisibility(0);
                } else {
                    C43406b.this.mMailUnlinkAccount.setVisibility(8);
                }
            }
        });
    }

    public void showLoading() {
        if (this.loadingToast == null) {
            this.loadingToast = new C43909a(this.mContext);
        }
        if (!this.loadingToast.mo156328b()) {
            this.loadingToast.mo156327a(C43819s.m173684a((int) R.string.Mail_Setting_Unbinding));
        }
    }

    public void showSureUnbindMailDialog(Context context, DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89248g(R.string.Mail_Setting_UnbindConfirmTitle).mo89238b(true).mo89253l(3).mo89242c(C43819s.m173690b((int) R.string.Mail_Setting_UnbindConfirmBody)).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getString(R.string.Mail_Setting_UnbindConfirmAction));
        aVar.mo89272e(context.getResources().getColor(R.color.function_danger_500));
        aVar.mo89270c(17);
        aVar.mo89267a(onClickListener);
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_left);
        aVar2.mo89268a(context.getString(R.string.Mail_Client_MailCloseCancel));
        aVar2.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b.DialogInterface$OnClickListenerC434103 */

            public void onClick(DialogInterface dialogInterface, int i) {
                onClickListener2.onClick(dialogInterface, i);
                dialogInterface.dismiss();
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        gVar.mo89239c();
    }

    public C43406b(Context context, LifecycleOwner lifecycleOwner, AbstractC43411a aVar, AbstractC43405a aVar2) {
        this.mContext = context;
        this.mLifecycleOwner = lifecycleOwner;
        this.mDependency = aVar;
        this.mModel = aVar2;
    }
}
