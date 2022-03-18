package com.ss.android.vc.meeting.module.preview;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a;

/* renamed from: com.ss.android.vc.meeting.module.preview.e */
public abstract class AbstractC62712e<M extends AbstractC62650a.AbstractC62651a, V extends AbstractC62650a.AbstractC62653b<VD>, VD extends AbstractC62650a.AbstractC62653b.AbstractC62654a, MD extends AbstractC62650a.AbstractC62651a.AbstractC62652a> extends BasePresenter<M, V, VD> {

    /* renamed from: a */
    public String f157794a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo216565a(BaseFragment baseFragment, AbstractC62746h hVar);

    /* renamed from: a */
    public void mo216590a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract M mo216567d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract VD createViewDelegate();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract MD mo216569f();

    /* renamed from: g */
    public String mo216666g() {
        return this.f157794a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.preview.e$a */
    public class C62713a implements AbstractC62650a.AbstractC62651a.AbstractC62652a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: h */
        public String mo216524h() {
            return AbstractC62712e.this.f157794a;
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: b */
        public boolean mo216518b() {
            return ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216532e();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: c */
        public boolean mo216519c() {
            return ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216533f();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: d */
        public boolean mo216520d() {
            return ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216531d();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: e */
        public void mo216521e() {
            ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216535h();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: f */
        public void mo216522f() {
            ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216536i();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: g */
        public String mo216523g() {
            return ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216539l();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public boolean mo216517a() {
            return ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216530c();
        }

        protected C62713a() {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216513a(OpenChatter openChatter) {
            ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216525a(openChatter);
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216514a(VideoChat videoChat) {
            ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216526a(videoChat);
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216516a(String str) {
            ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216529a(str);
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216515a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, boolean z3, String str) {
            ((AbstractC62650a.AbstractC62653b) AbstractC62712e.this.getView()).mo216527a(audioType, z, audioType2, z2, z3, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.preview.e$b */
    public abstract class AbstractC62714b implements AbstractC62650a.AbstractC62653b.AbstractC62654a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: a */
        public void mo216545a() {
            ((AbstractC62650a.AbstractC62651a) AbstractC62712e.this.getModel()).mo216505a();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: c */
        public MeetingAudioManager mo216547c() {
            return ((AbstractC62650a.AbstractC62651a) AbstractC62712e.this.getModel()).mo216510b();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: d */
        public boolean mo216548d() {
            return ((AbstractC62650a.AbstractC62651a) AbstractC62712e.this.getModel()).mo216511c();
        }

        protected AbstractC62714b() {
        }
    }

    /* renamed from: a */
    public void mo216662a() {
        ((AbstractC62650a.AbstractC62653b) getView()).mo216543p();
    }

    /* renamed from: c */
    public void mo216665c() {
        ((AbstractC62650a.AbstractC62653b) getView()).mo216544q();
    }

    /* renamed from: h */
    public boolean mo216667h() {
        return ((AbstractC62650a.AbstractC62651a) getModel()).mo216511c();
    }

    /* renamed from: i */
    public boolean mo216668i() {
        return ((AbstractC62650a.AbstractC62651a) getModel()).mo216512d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo216669j() {
        ((AbstractC62650a.AbstractC62653b) getView()).mo216540m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo216670k() {
        ((AbstractC62650a.AbstractC62653b) getView()).mo216541n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo216671l() {
        ((AbstractC62650a.AbstractC62653b) getView()).mo216542o();
    }

    /* renamed from: b */
    public void mo216664b() {
        C60700b.m235851b("MeetingPreviewBasePresenter", "[startPreviewIfNeed]", "cameraOn = " + ((AbstractC62650a.AbstractC62653b) getView()).mo216532e());
        ((AbstractC62650a.AbstractC62653b) getView()).mo216534g();
    }

    /* renamed from: a */
    public void mo216663a(String str) {
        this.f157794a = str;
    }

    public AbstractC62712e(BaseFragment baseFragment, AbstractC62746h hVar) {
        V a = mo216565a(baseFragment, hVar);
        M d = mo216567d();
        setModel(d);
        setView(a);
        a.setViewDelegate(createViewDelegate());
        d.mo216508a(mo216569f());
    }
}
