package com.ss.android.lark.desktopmode.p1788b.p1792d;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.AbstractC36518c;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1789a.C36533c;
import com.ss.android.lark.desktopmode.p1788b.p1789a.DialogInterface$OnCancelListenerC36531b;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.ss.android.lark.desktopmode.b.d.b */
public class C36548b implements AbstractC36551c {

    /* renamed from: a */
    public C36547a f94089a = new C36547a();

    /* renamed from: b */
    private FragmentManager f94090b;

    /* renamed from: c */
    private Map<ContainerType, Integer> f94091c;

    /* renamed from: d */
    private boolean f94092d;

    /* renamed from: c */
    private boolean m144197c() {
        if (this.f94092d) {
            return true;
        }
        Log.m165383e("FragmentManagerWrapper", "is not inited!");
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: a */
    public void mo134893a() {
        this.f94089a.mo134882a();
        this.f94092d = false;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: b */
    public void mo134898b() {
        if (m144197c()) {
            for (C36516a aVar : this.f94089a.mo134885b(ContainerType.Float)) {
                mo134902c(aVar.getFragmentInfoId());
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: b */
    public boolean mo134900b(String str) {
        return this.f94089a.mo134889d(str);
    }

    /* renamed from: e */
    private C36516a m144198e(String str) {
        if (!m144197c()) {
            return null;
        }
        return this.f94089a.mo134890e(str);
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: d */
    public C36516a mo134903d(String str) {
        if (!m144197c()) {
            return null;
        }
        return this.f94089a.mo134888c(str);
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: a */
    public String mo134892a(ContainerType containerType) {
        C36516a a;
        if (m144197c() && (a = this.f94089a.mo134881a(containerType)) != null) {
            return mo134901c(a);
        }
        return null;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: b */
    public C36516a mo134897b(ContainerType containerType) {
        if (!m144197c()) {
            return null;
        }
        Stack<C36516a> b = this.f94089a.mo134885b(containerType);
        if (b.size() > 0) {
            return b.peek();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m144199i(C36516a aVar) {
        C36516a a = this.f94089a.mo134881a(aVar.getFragmentParams().getContainerType());
        if (a == null || !a.getClass().getName().equals(aVar.getClass().getName()) || !a.onNewArguments(aVar.getArguments())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: a */
    public void mo134894a(AbstractC36551c.AbstractC36552a aVar) {
        this.f94090b = aVar.mo134828a();
        this.f94091c = aVar.mo134829b();
        this.f94092d = true;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: c */
    public String mo134901c(C36516a aVar) {
        if (!m144197c()) {
            return null;
        }
        this.f94089a.mo134884a(aVar.getFragmentInfoId());
        this.f94090b.beginTransaction().remove(aVar).commitNowAllowingStateLoss();
        return aVar.getFragmentInfoId();
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: e */
    public void mo134905e(C36516a aVar) {
        ContainerType containerType = aVar.getFragmentParams().getContainerType();
        if (containerType == ContainerType.ALL) {
            m144196a(aVar, ContainerType.Left);
            m144196a(aVar, ContainerType.Right);
            m144196a(aVar, ContainerType.ALL);
        } else if (containerType == ContainerType.Left || containerType == ContainerType.Right) {
            m144196a(aVar, containerType);
            m144196a(aVar, ContainerType.ALL);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: f */
    public void mo134906f(final C36516a aVar) {
        if (m144197c()) {
            this.f94089a.mo134883a(aVar);
            final DialogInterface$OnCancelListenerC36531b bVar = new DialogInterface$OnCancelListenerC36531b(aVar);
            bVar.mo134848a(this.f94090b, aVar.getFragmentInfoId());
            bVar.mo134849a(new DialogInterface$OnCancelListenerC36531b.AbstractC36532a() {
                /* class com.ss.android.lark.desktopmode.p1788b.p1792d.C36548b.C365491 */

                @Override // com.ss.android.lark.desktopmode.p1788b.p1789a.DialogInterface$OnCancelListenerC36531b.AbstractC36532a
                /* renamed from: a */
                public void mo134856a() {
                    C36548b.this.f94089a.mo134884a(aVar.getFragmentInfoId());
                    String floatTag = ((FloatWindowParams) aVar.getFragmentParams()).getFloatTag();
                    if (floatTag != null) {
                        C36548b.this.f94089a.mo134891f(floatTag);
                    }
                    bVar.mo134849a((DialogInterface$OnCancelListenerC36531b.AbstractC36532a) null);
                }
            });
            this.f94090b.executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: h */
    public void mo134908h(C36516a aVar) {
        C36516a e;
        if (m144197c() && (e = m144198e(((FloatWindowParams) aVar.getFragmentParams()).getFloatTag())) != null && e.isAdded() && e.isVisible()) {
            C36533c cVar = (C36533c) e;
            cVar.mo134860b(aVar);
            this.f94089a.mo134884a(aVar.getFragmentInfoId());
            Fragment a = cVar.mo134857a();
            if (a != null) {
                a.onResume();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: b */
    public boolean mo134899b(C36516a aVar) {
        if (!m144197c() || m144199i(aVar)) {
            return false;
        }
        ContainerType containerType = aVar.getFragmentParams().getContainerType();
        C36516a a = this.f94089a.mo134881a(containerType);
        if (aVar.equals(a)) {
            return false;
        }
        this.f94089a.mo134886b(aVar);
        Integer num = this.f94091c.get(containerType);
        if (num == null) {
            return true;
        }
        this.f94090b.beginTransaction().add(num.intValue(), aVar).commitNowAllowingStateLoss();
        if (a == null) {
            return true;
        }
        this.f94090b.beginTransaction().remove(a).commitNowAllowingStateLoss();
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: c */
    public void mo134902c(String str) {
        C36516a d;
        if (m144197c() && (d = mo134903d(str)) != null) {
            this.f94089a.mo134884a(str);
            AbstractC36518c lifecycleCallback = d.getLifecycleCallback();
            if (lifecycleCallback instanceof DialogInterface$OnCancelListenerC36531b) {
                ((DialogInterface$OnCancelListenerC36531b) lifecycleCallback).mo134851e();
            }
            C36516a b = mo134897b(ContainerType.Float);
            if (b != null) {
                b.onResume();
            }
        }
    }

    /* renamed from: d */
    public void mo134904d(C36516a aVar) {
        if (m144197c()) {
            ContainerType containerType = aVar.getFragmentParams().getContainerType();
            if (!this.f94089a.mo134885b(containerType).contains(aVar)) {
                if (aVar.getFragmentParams().getContainerType() == ContainerType.Left || aVar.getFragmentParams().getContainerType() == ContainerType.ALL) {
                    mo134896a(aVar);
                } else {
                    mo134899b(aVar);
                }
                mo134905e(aVar);
                return;
            }
            mo134905e(aVar);
            if (!TextUtils.equals(this.f94089a.mo134881a(containerType).getFragmentInfoId(), aVar.getFragmentInfoId())) {
                this.f94089a.mo134887b(aVar.getFragmentInfoId());
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: g */
    public void mo134907g(C36516a aVar) {
        if (m144197c()) {
            FloatWindowParams floatWindowParams = (FloatWindowParams) aVar.getFragmentParams();
            C36516a e = m144198e(floatWindowParams.getFloatTag());
            if (e == null) {
                e = new C36533c();
                FloatWindowParams floatWindowParams2 = new FloatWindowParams(floatWindowParams);
                floatWindowParams2.setFloatStackBase(true);
                e.setFragmentParams(floatWindowParams2);
                mo134906f(e);
                final String fragmentInfoId = e.getFragmentInfoId();
                ((C36533c) e).mo134859a(new C36533c.AbstractC36534a() {
                    /* class com.ss.android.lark.desktopmode.p1788b.p1792d.C36548b.C365502 */

                    @Override // com.ss.android.lark.desktopmode.p1788b.p1789a.C36533c.AbstractC36534a
                    /* renamed from: a */
                    public void mo134861a() {
                        C36548b.this.mo134902c(fragmentInfoId);
                    }
                });
            }
            ((C36533c) e).mo134858a(aVar);
            this.f94089a.mo134883a(aVar);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: a */
    public void mo134895a(String str) {
        C36516a c;
        if (m144197c() && (c = this.f94089a.mo134888c(str)) != null) {
            mo134904d(c);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c
    /* renamed from: a */
    public boolean mo134896a(C36516a aVar) {
        if (!m144197c() || m144199i(aVar)) {
            return false;
        }
        this.f94089a.mo134883a(aVar);
        Integer num = this.f94091c.get(aVar.getFragmentParams().getContainerType());
        if (num == null) {
            return true;
        }
        this.f94090b.beginTransaction().add(num.intValue(), aVar).commitNowAllowingStateLoss();
        return true;
    }

    /* renamed from: a */
    private void m144196a(C36516a aVar, ContainerType containerType) {
        for (C36516a aVar2 : this.f94089a.mo134885b(containerType)) {
            if (TextUtils.equals(aVar2.getFragmentInfoId(), aVar.getFragmentInfoId())) {
                this.f94090b.beginTransaction().show(aVar2).commitNowAllowingStateLoss();
            } else {
                this.f94090b.beginTransaction().hide(aVar2).commitNowAllowingStateLoss();
            }
        }
    }
}
