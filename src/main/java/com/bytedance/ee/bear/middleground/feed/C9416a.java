package com.bytedance.ee.bear.middleground.feed;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.IFeed;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageConfig;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a;
import com.bytedance.ee.bear.middleground.feed.p457e.C9460b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.feed.a */
public class C9416a implements AbstractC9438a, IFeed {

    /* renamed from: a */
    private final AbstractC9438a f25310a;

    /* renamed from: b */
    private MessageConfig f25311b;

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: c */
    public MessageConfig mo35888c() {
        return this.f25311b;
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public void mo35879a() {
        this.f25310a.mo35879a();
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: b */
    public boolean mo35887b() {
        return this.f25310a.mo35887b();
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: d */
    public void mo35889d() {
        if (this.f25310a.mo35887b()) {
            this.f25310a.mo35879a();
        }
        this.f25310a.mo35889d();
    }

    /* renamed from: com.bytedance.ee.bear.middleground.feed.a$a */
    public static class C9418a {

        /* renamed from: a */
        private FragmentActivity f25312a;

        /* renamed from: b */
        private ViewGroup f25313b;

        /* renamed from: c */
        private AbstractC9492e f25314c;

        /* renamed from: d */
        private AbstractC9494g f25315d;

        /* renamed from: e */
        private C10917c f25316e;

        /* renamed from: f */
        private MessageConfig f25317f;

        /* renamed from: a */
        public C9416a mo35896a() {
            return new C9416a(this.f25312a, this.f25313b, this.f25314c, this.f25315d, this.f25316e, this.f25317f);
        }

        /* renamed from: a */
        public C9418a mo35890a(ViewGroup viewGroup) {
            this.f25313b = viewGroup;
            return this;
        }

        /* renamed from: a */
        public C9418a mo35891a(FragmentActivity fragmentActivity) {
            this.f25312a = fragmentActivity;
            return this;
        }

        /* renamed from: a */
        public C9418a mo35892a(MessageConfig messageConfig) {
            this.f25317f = messageConfig;
            return this;
        }

        /* renamed from: a */
        public C9418a mo35893a(AbstractC9492e eVar) {
            this.f25314c = eVar;
            return this;
        }

        /* renamed from: a */
        public C9418a mo35894a(AbstractC9494g gVar) {
            this.f25315d = gVar;
            return this;
        }

        /* renamed from: a */
        public C9418a mo35895a(C10917c cVar) {
            this.f25316e = cVar;
            return this;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: b */
    public void mo35885b(String str) {
        this.f25310a.mo35885b(str);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: b */
    public void mo35886b(boolean z) {
        this.f25310a.mo35886b(z);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public void mo35880a(MessageConfig messageConfig) {
        this.f25311b = messageConfig;
        this.f25310a.mo35880a(messageConfig);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public void mo35881a(MessageResultBean messageResultBean) {
        this.f25310a.mo35881a(messageResultBean);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public void mo35882a(String str) {
        this.f25310a.mo35882a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public void mo35883a(List<String> list) {
        this.f25310a.mo35883a(list);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public void mo35884a(boolean z) {
        this.f25310a.mo35884a(z);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.p457e.AbstractC9438a, com.bytedance.ee.bear.middleground.feed.export.bean.IFeed
    /* renamed from: a */
    public AbstractC68307f<String> mo35878a(boolean z, String str) {
        C13479a.m54764b("Feed", "pulldata");
        return this.f25310a.mo35878a(z, str);
    }

    private C9416a(FragmentActivity fragmentActivity, ViewGroup viewGroup, AbstractC9492e eVar, AbstractC9494g gVar, C10917c cVar, MessageConfig messageConfig) {
        this.f25311b = messageConfig;
        this.f25310a = new C9460b(fragmentActivity, viewGroup, eVar, gVar, cVar, messageConfig);
    }
}
