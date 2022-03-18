package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureAdapter;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.List;

public class SelectEntSignatureView implements AbstractC43581g.AbstractC43583b {

    /* renamed from: a */
    private Context f110576a;

    /* renamed from: b */
    private AbstractC43560a f110577b;

    /* renamed from: c */
    private AbstractC43581g.AbstractC43583b.AbstractC43584a f110578c;

    /* renamed from: d */
    private SelectEntSignatureAdapter f110579d;
    @BindView(8782)
    CommonRecyclerView mSelectRv;
    @BindView(8783)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureView$a */
    public interface AbstractC43560a {
        /* renamed from: a */
        void mo155527a(SelectEntSignatureView selectEntSignatureView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110577b.mo155527a(this);
        m172948a();
    }

    /* renamed from: a */
    private void m172948a() {
        this.mSelectRv.setLayoutManager(new LinearLayoutManager(this.f110576a, 1, false));
        SelectEntSignatureAdapter selectEntSignatureAdapter = new SelectEntSignatureAdapter();
        this.f110579d = selectEntSignatureAdapter;
        selectEntSignatureAdapter.mo155531a(new SelectEntSignatureAdapter.AbstractC43559a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$SelectEntSignatureView$EiAAZvhLrbA3Fm4xRt7caVIr34g */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureAdapter.AbstractC43559a
            public final void onSignatureSelect(MailEntSignature mailEntSignature) {
                SelectEntSignatureView.this.m172949a((SelectEntSignatureView) mailEntSignature);
            }
        });
        this.mSelectRv.setAdapter(this.f110579d);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43581g.AbstractC43583b.AbstractC43584a aVar) {
        this.f110578c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m172949a(MailEntSignature mailEntSignature) {
        this.f110578c.mo155579a(mailEntSignature);
    }

    /* renamed from: a */
    public void mo155536a(boolean z) {
        String str;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (z) {
            str = C43819s.m173684a((int) R.string.Mail_Signature_UseForNewEmails_Header);
        } else {
            str = C43819s.m173684a((int) R.string.Mail_Signature_UseForForwardReply_Header);
        }
        commonTitleBar.setTitle(str);
    }

    public SelectEntSignatureView(Context context, AbstractC43560a aVar) {
        this.f110576a = context;
        this.f110577b = aVar;
    }

    /* renamed from: a */
    public void mo155535a(List<MailEntSignature> list, int i) {
        this.mSelectRv.setVisibility(0);
        this.f110579d.mo155532a(list, i);
    }
}
