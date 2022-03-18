package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import android.os.IBinder;
import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.bear.abtest.service.C4158c;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4473d;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4474e;
import com.bytedance.ee.bear.basesdk.p253d.C4475f;
import com.bytedance.ee.bear.basesdk.p253d.C4478g;
import com.bytedance.ee.bear.basesdk.p253d.C4479h;
import com.bytedance.ee.bear.basesdk.services.C4502c;
import com.bytedance.ee.bear.basesdk.services.C4503d;
import com.bytedance.ee.bear.basesdk.services.C4508f;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.p279c.AbstractC5118a;
import com.bytedance.ee.bear.contract.p280d.AbstractC5125a;
import com.bytedance.ee.bear.contract.p284h.AbstractC5176a;
import com.bytedance.ee.bear.docshost.C5590g;
import com.bytedance.ee.bear.lark.aidl.DocCallbackImpl;
import com.bytedance.ee.bear.lark.aidl.IReminderImpl;
import com.bytedance.ee.bear.lark.p414b.AbstractC7989b;
import com.bytedance.ee.bear.list.AbstractC8454g;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.C9902e;
import com.bytedance.ee.bear.middleground.permission.callback.ISelectContactCallback;
import com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d;
import com.bytedance.ee.bear.more.p500a.AbstractC10195a;
import com.bytedance.ee.bear.more.p502c.AbstractC10204a;
import com.bytedance.ee.bear.p397h.AbstractC7826d;
import com.bytedance.ee.bear.p397h.C7821a;
import com.bytedance.ee.bear.service.remote.BinderParcel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13629i;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.b */
public abstract class AbstractC4396b {
    /* renamed from: a */
    private static boolean m18109a(Object obj) {
        return obj != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17099a(AbstractC5176a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17103a(AbstractC10195a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17104a(AbstractC10204a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17106b(IBinder iBinder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17101a(AbstractC8454g gVar) {
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31496a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17105a(boolean z) {
        C13479a.m54764b("DepImpl", "setIsAppInBackground()... process  = " + C13629i.m55303b((Context) null) + ",  isAppFront = " + z);
        C5102ai.m20869b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17100a(AbstractC7826d dVar) {
        C7821a.m31348a().mo30592a(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17102a(ISelectContactCallback aVar) {
        C9902e.m41219a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17098a(AbstractC5125a aVar) {
        C4511g.m18591a(aVar);
    }

    /* renamed from: a */
    public final void mo17089a() {
        IReminderImpl iReminderImpl = new IReminderImpl();
        DocCallbackImpl docCallbackImpl = new DocCallbackImpl();
        Boolean valueOf = Boolean.valueOf(((AbstractC7989b) KoinJavaComponent.m268610a(AbstractC7989b.class)).mo30981a());
        AbstractC5118a aVar = (AbstractC5118a) KoinJavaComponent.m268610a(AbstractC5118a.class);
        C4503d.AbstractC4505a aVar2 = (C4503d.AbstractC4505a) KoinJavaComponent.m268610a(C4503d.AbstractC4505a.class);
        AbstractC7826d dVar = (AbstractC7826d) KoinJavaComponent.m268610a(AbstractC7826d.class);
        AbstractC5125a aVar3 = (AbstractC5125a) KoinJavaComponent.m268610a(AbstractC5125a.class);
        AbstractC5176a aVar4 = (AbstractC5176a) KoinJavaComponent.m268610a(AbstractC5176a.class);
        AbstractC5080aa.AbstractC5081a aVar5 = (AbstractC5080aa.AbstractC5081a) KoinJavaComponent.m268610a(AbstractC5080aa.AbstractC5081a.class);
        AbstractC10195a aVar6 = (AbstractC10195a) KoinJavaComponent.m268610a(AbstractC10195a.class);
        AbstractC4156b.AbstractC4157a aVar7 = (AbstractC4156b.AbstractC4157a) KoinJavaComponent.m268610a(AbstractC4156b.AbstractC4157a.class);
        AbstractC10204a aVar8 = (AbstractC10204a) KoinJavaComponent.m268610a(AbstractC10204a.class);
        C4508f.AbstractC4509a aVar9 = (C4508f.AbstractC4509a) KoinJavaComponent.m268610a(C4508f.AbstractC4509a.class);
        AbstractC4474e eVar = (AbstractC4474e) KoinJavaComponent.m268610a(AbstractC4474e.class);
        AbstractC4473d dVar2 = (AbstractC4473d) KoinJavaComponent.m268610a(AbstractC4473d.class);
        AbstractC8454g gVar = (AbstractC8454g) KoinJavaComponent.m268610a(AbstractC8454g.class);
        ISelectContactCallback aVar10 = (ISelectContactCallback) KoinJavaComponent.m268610a(ISelectContactCallback.class);
        AbstractC9901d dVar3 = (AbstractC9901d) KoinJavaComponent.m268610a(AbstractC9901d.class);
        if (m18109a((Object) iReminderImpl)) {
            mo17090a((IBinder) iReminderImpl);
        }
        if (m18109a(valueOf)) {
            mo17105a(valueOf.booleanValue());
        }
        if (m18109a((Object) aVar4)) {
            mo17099a(aVar4);
        }
        if (m18109a((Object) aVar7)) {
            mo17091a(aVar7);
        }
        if (m18109a((Object) aVar)) {
            mo17097a(aVar);
        }
        if (m18109a((Object) aVar5)) {
            mo17096a(aVar5);
        }
        if (m18109a((Object) aVar2)) {
            mo17094a(aVar2);
        }
        if (m18109a((Object) dVar)) {
            mo17100a(dVar);
        }
        if (m18109a((Object) aVar9)) {
            mo17095a(aVar9);
        }
        if (m18109a((Object) docCallbackImpl)) {
            mo17106b(docCallbackImpl);
        }
        if (m18109a((Object) aVar6)) {
            mo17103a(aVar6);
        }
        if (m18109a((Object) aVar8)) {
            mo17104a(aVar8);
        }
        if (m18109a((Object) aVar3)) {
            mo17098a(aVar3);
        }
        if (m18109a((Object) eVar)) {
            mo17093a(eVar);
        }
        if (m18109a((Object) dVar2)) {
            mo17092a(dVar2);
        }
        if (m18109a((Object) gVar)) {
            mo17101a(gVar);
        }
        if (m18109a((Object) aVar10)) {
            mo17102a(aVar10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17091a(AbstractC4156b.AbstractC4157a aVar) {
        C4158c.m17271a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17090a(IBinder iBinder) {
        C4478g.m18488a(new BinderParcel(iBinder));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17092a(AbstractC4473d dVar) {
        C4475f.m18484a().mo17244a(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17093a(AbstractC4474e eVar) {
        C4479h.m18489b().mo17248a(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17094a(C4503d.AbstractC4505a aVar) {
        C4503d.m18563a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17095a(C4508f.AbstractC4509a aVar) {
        C4508f.m18584a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17096a(AbstractC5080aa.AbstractC5081a aVar) {
        if (C13629i.m55302a()) {
            C4502c.m18562a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17097a(AbstractC5118a aVar) {
        C5590g.m22627a(aVar);
    }
}
