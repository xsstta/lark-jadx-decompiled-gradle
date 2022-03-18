package com.ss.android.lark.voip.service.impl.app;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.app.d */
public interface AbstractC58041d {

    /* renamed from: com.ss.android.lark.voip.service.impl.app.d$a */
    public interface AbstractC58042a extends IModel {

        /* renamed from: com.ss.android.lark.voip.service.impl.app.d$a$a */
        public interface AbstractC58043a {
            /* renamed from: a */
            void mo196786a(VoiceCall voiceCall);

            /* renamed from: a */
            void mo196787a(String str);

            /* renamed from: a */
            void mo196788a(boolean z);

            /* renamed from: a */
            void mo196789a(boolean z, boolean z2);
        }

        /* renamed from: a */
        Chatter mo196718a();

        /* renamed from: a */
        void mo196719a(AbstractC58043a aVar);

        /* renamed from: a */
        void mo196720a(String str, String str2, IGetDataCallback<VoiceCall> iGetDataCallback);

        /* renamed from: a */
        void mo196721a(boolean z);

        /* renamed from: b */
        boolean mo196722b();

        /* renamed from: c */
        boolean mo196723c();

        /* renamed from: d */
        boolean mo196724d();

        /* renamed from: e */
        VoiceCall.Status mo196725e();

        /* renamed from: f */
        VoiceCall mo196726f();

        /* renamed from: g */
        String mo196727g();

        /* renamed from: h */
        void mo196728h();

        /* renamed from: i */
        void mo196729i();

        /* renamed from: j */
        void mo196730j();

        /* renamed from: k */
        void mo196731k();

        /* renamed from: l */
        void mo196732l();

        /* renamed from: m */
        void mo196733m();

        /* renamed from: n */
        C58136v mo196734n();

        /* renamed from: o */
        void mo196735o();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.d$b */
    public interface AbstractC58044b extends IView<AbstractC58045a> {

        /* renamed from: com.ss.android.lark.voip.service.impl.app.d$b$a */
        public interface AbstractC58045a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo196790a();

            /* renamed from: a */
            void mo196791a(boolean z);

            /* renamed from: b */
            void mo196792b();

            /* renamed from: c */
            void mo196793c();

            /* renamed from: d */
            void mo196794d();

            /* renamed from: e */
            void mo196795e();

            /* renamed from: f */
            void mo196796f();

            /* renamed from: g */
            boolean mo196797g();

            /* renamed from: h */
            void mo196798h();

            /* renamed from: i */
            boolean mo196799i();

            /* renamed from: j */
            VoiceCall mo196800j();

            /* renamed from: k */
            boolean mo196801k();
        }

        /* renamed from: a */
        void mo196742a();

        /* renamed from: a */
        void mo196743a(int i);

        /* renamed from: a */
        void mo196744a(Chatter chatter);

        /* renamed from: a */
        void mo196746a(VoiceCall voiceCall);

        /* renamed from: a */
        void mo196747a(String str);

        /* renamed from: a */
        void mo196748a(boolean z);

        /* renamed from: a */
        void mo196749a(boolean z, boolean z2, Chatter chatter, int i);

        /* renamed from: b */
        void mo196750b();

        /* renamed from: b */
        void mo196751b(boolean z);

        void bq_();

        void br_();

        void bs_();

        /* renamed from: c */
        void mo196755c(boolean z);

        /* renamed from: f */
        void mo196756f();

        /* renamed from: g */
        void mo196757g();
    }
}
