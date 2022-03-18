package com.ss.android.vc.meeting.module.preview.p3154c;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract;

/* renamed from: com.ss.android.vc.meeting.module.preview.c.d */
public class C62688d extends AbstractC62712e<IVCPreviewOpenPlatformContract.IModel, IVCPreviewOpenPlatformContract.IView, IVCPreviewOpenPlatformContract.IView.Delegate, IVCPreviewOpenPlatformContract.IModel.Delegate> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public IVCPreviewOpenPlatformContract.IView.Delegate mo216568e() {
        return new C62691b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public IVCPreviewOpenPlatformContract.IModel.Delegate mo216569f() {
        return new C62690a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IVCPreviewOpenPlatformContract.IModel mo216567d() {
        return new MeetingPreviewOpenPlatformModel();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.d$a */
    public class C62690a extends AbstractC62712e.C62713a implements IVCPreviewOpenPlatformContract.IModel.Delegate {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e.C62713a, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public boolean mo216517a() {
            return ((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView()).mo216530c();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e.C62713a, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: b */
        public boolean mo216518b() {
            return ((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView()).mo216532e();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e.C62713a, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: c */
        public boolean mo216519c() {
            return ((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView()).mo216533f();
        }

        private C62690a() {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.d$b */
    public class C62691b extends AbstractC62712e.AbstractC62714b implements IVCPreviewOpenPlatformContract.IView.Delegate {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
            new OpenPlatformGotoMeetingManager((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView(), (IVCPreviewOpenPlatformContract.IModel) C62688d.this.getModel()).mo216632a(null, null);
        }

        @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IView.Delegate
        /* renamed from: e */
        public void mo216612e() {
            ((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView()).p_(((MeetingPreviewOpenPlatformModel) C62688d.this.getModel()).mo216621h());
            ((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView()).q_(((MeetingPreviewOpenPlatformModel) C62688d.this.getModel()).mo216622i());
            ((IVCPreviewOpenPlatformContract.IView) C62688d.this.getView()).r_(((MeetingPreviewOpenPlatformModel) C62688d.this.getModel()).mo216623j());
        }

        private C62691b() {
            super();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e
    /* renamed from: a */
    public void mo216590a(boolean z) {
        super.mo216590a(z);
        ((IVCPreviewOpenPlatformContract.IModel) getModel()).mo216606c(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IVCPreviewOpenPlatformContract.IView mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new MeetingPreviewOpenPlatformView(baseFragment, hVar);
    }

    public C62688d(BaseFragment baseFragment, AbstractC62746h hVar, boolean z, boolean z2, boolean z3, String str) {
        super(baseFragment, hVar);
        ((MeetingPreviewOpenPlatformModel) getModel()).mo216618d(z);
        ((MeetingPreviewOpenPlatformModel) getModel()).mo216619e(z2);
        ((MeetingPreviewOpenPlatformModel) getModel()).mo216620f(z3);
        ((MeetingPreviewOpenPlatformModel) getModel()).mo216615a(str);
        C60700b.m235851b("MeetingPreviewOpenPlatformPresenter@", "[MeetingPreviewOpenPlatformPresenter]", "micMute = " + z + ", cameraMute = " + z2 + ", speaker = " + z3 + ", reserveID = " + str);
    }
}
