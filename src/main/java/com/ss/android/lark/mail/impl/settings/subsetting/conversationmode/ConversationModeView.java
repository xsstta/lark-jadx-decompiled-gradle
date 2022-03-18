package com.ss.android.lark.mail.impl.settings.subsetting.conversationmode;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.AbstractC43514c;

public class ConversationModeView implements View.OnClickListener, AbstractC43514c.AbstractC43516b {

    /* renamed from: a */
    private Context f110477a;

    /* renamed from: b */
    private AbstractC43509a f110478b;

    /* renamed from: c */
    private AbstractC43514c.AbstractC43516b.AbstractC43517a f110479c;
    @BindView(9294)
    View mConvLayout;
    @BindView(9307)
    UDCheckBox mConvRadio;
    @BindView(9404)
    View mNonconvLayout;
    @BindView(9412)
    UDCheckBox mNonconvRadio;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.ConversationModeView$a */
    public interface AbstractC43509a {
        /* renamed from: a */
        void mo155380a(ConversationModeView conversationModeView);
    }

    /* renamed from: a */
    public void mo155381a() {
        ((Activity) this.f110477a).finish();
    }

    /* renamed from: b */
    public LifecycleOwner mo155384b() {
        return (ComponentActivity) this.f110477a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110479c = null;
        this.f110478b = null;
    }

    /* renamed from: c */
    private void m172734c() {
        this.mConvLayout.setOnClickListener(this);
        this.mNonconvLayout.setOnClickListener(this);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110478b.mo155380a(this);
        m172734c();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43514c.AbstractC43516b.AbstractC43517a aVar) {
        this.f110479c = aVar;
    }

    /* renamed from: a */
    public void mo155383a(boolean z) {
        this.mConvRadio.setChecked(z);
        this.mNonconvRadio.setChecked(!z);
    }

    public void onClick(View view) {
        boolean z;
        String str;
        int id = view.getId();
        if (id == R.id.mail_conversation_layout || id == R.id.mail_nonconversation_layout) {
            if (id == R.id.mail_conversation_layout) {
                z = true;
            } else {
                z = false;
            }
            this.f110479c.mo155390a(z);
            if (id == R.id.mail_conversation_layout) {
                str = C42330c.C42339h.f107777q;
            } else {
                str = C42330c.C42339h.f107776p;
            }
            C42330c.m169065b("conversation_switch", str);
        }
    }

    public ConversationModeView(Context context, AbstractC43509a aVar) {
        this.f110477a = context;
        this.f110478b = aVar;
    }
}
