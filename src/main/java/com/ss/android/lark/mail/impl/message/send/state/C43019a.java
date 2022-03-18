package com.ss.android.lark.mail.impl.message.send.state;

import androidx.lifecycle.C1177w;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.send.state.a */
public class C43019a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.send.state.a$a */
    public interface AbstractC43020a extends IModel {
        /* renamed from: a */
        C1177w<Integer> mo154191a();

        /* renamed from: b */
        C1177w<List<SendStatusDetail>> mo154192b();

        /* renamed from: c */
        void mo154193c();
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.send.state.a$b */
    interface AbstractC43021b extends IView<AbstractC43022a> {

        /* renamed from: com.ss.android.lark.mail.impl.message.send.state.a$b$a */
        public interface AbstractC43022a extends IView.IViewDelegate {
            /* renamed from: a */
            C1177w<Integer> mo154194a();

            /* renamed from: b */
            C1177w<List<SendStatusDetail>> mo154195b();

            /* renamed from: c */
            void mo154196c();
        }
    }
}
