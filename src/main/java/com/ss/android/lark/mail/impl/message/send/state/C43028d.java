package com.ss.android.lark.mail.impl.message.send.state;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import com.ss.android.lark.mail.impl.message.send.state.C43019a;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.send.state.d */
public class C43028d extends BasePresenter<C43019a.AbstractC43020a, SendStatusDetailView, C43019a.AbstractC43021b.AbstractC43022a> {
    /* renamed from: c */
    public void mo154203c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C43019a.AbstractC43021b.AbstractC43022a createViewDelegate() {
        return new C43019a.AbstractC43021b.AbstractC43022a() {
            /* class com.ss.android.lark.mail.impl.message.send.state.C43028d.C430302 */

            @Override // com.ss.android.lark.mail.impl.message.send.state.C43019a.AbstractC43021b.AbstractC43022a
            /* renamed from: c */
            public void mo154196c() {
                C43028d.this.mo154202b();
            }

            @Override // com.ss.android.lark.mail.impl.message.send.state.C43019a.AbstractC43021b.AbstractC43022a
            /* renamed from: a */
            public C1177w<Integer> mo154194a() {
                return ((C43019a.AbstractC43020a) C43028d.this.getModel()).mo154191a();
            }

            @Override // com.ss.android.lark.mail.impl.message.send.state.C43019a.AbstractC43021b.AbstractC43022a
            /* renamed from: b */
            public C1177w<List<SendStatusDetail>> mo154195b() {
                return ((C43019a.AbstractC43020a) C43028d.this.getModel()).mo154192b();
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo154203c();
        super.destroy();
    }

    /* renamed from: b */
    public void mo154202b() {
        ((C43019a.AbstractC43020a) getModel()).mo154193c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C43019a.AbstractC43020a) getModel()).mo154191a().mo5923a(((SendStatusDetailView) getView()).mo154185a(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.message.send.state.C43028d.C430291 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num.intValue() == -1) {
                    C43028d.this.mo154203c();
                }
            }
        });
        mo154202b();
    }

    public C43028d(C43019a.AbstractC43020a aVar, SendStatusDetailView sendStatusDetailView) {
        super(aVar, sendStatusDetailView);
    }
}
