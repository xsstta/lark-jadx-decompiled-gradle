package com.ss.android.lark.mail.impl.settings.component.p2220a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.mvp.ILifecycle;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.client.AbstractC41895c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.a.a */
public class C43397a extends AbstractC1142af implements ILifecycle {
    protected Context mContext;
    protected LifecycleOwner mLifecycleOwner;
    protected View mMailDelinkAccount;
    protected AbstractC43400b mModel;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    public View getView() {
        return this.mMailDelinkAccount;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.mail_view_delink_account, (ViewGroup) null);
        this.mMailDelinkAccount = inflate;
        inflate.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.component.p2220a.C43397a.C433981 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m172323a() {
                MailToast.m173697a((int) R.string.Mail_Client_Delinkerror);
                C42209j.m168612a("mailclient_oauth_access_denied_deleting", "toast");
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C42699a.m170248a(C43397a.this.mContext, false, (AbstractC41895c) $$Lambda$a$1$i9wazrEouEFPkt5pJmagCYRUtHA.INSTANCE);
            }
        });
        this.mModel.mo155181a().mo5923a(this.mLifecycleOwner, new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.mail.impl.settings.component.p2220a.C43397a.C433992 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    C43397a.this.mMailDelinkAccount.setVisibility(0);
                } else {
                    C43397a.this.mMailDelinkAccount.setVisibility(8);
                }
            }
        });
    }

    public C43397a(Context context, LifecycleOwner lifecycleOwner, AbstractC43400b bVar) {
        this.mContext = context;
        this.mLifecycleOwner = lifecycleOwner;
        this.mModel = bVar;
    }
}
