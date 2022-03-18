package com.ss.android.lark.setting.page.content.general.enterprisetopic;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.setting.service.usersetting.p2674b.C54655a;

/* renamed from: com.ss.android.lark.setting.page.content.general.enterprisetopic.a */
public class C54451a {

    /* renamed from: a */
    private final LifecycleOwner f134661a;

    /* renamed from: b */
    private final EntityWordView f134662b = new EntityWordView();

    /* renamed from: c */
    private final C54452b f134663c = new C54452b(C54655a.m212173a());

    /* renamed from: a */
    public void mo186137a() {
        this.f134663c.unInit();
    }

    public C54451a(LifecycleOwner lifecycleOwner) {
        this.f134661a = lifecycleOwner;
    }

    /* renamed from: a */
    public void mo186138a(ViewGroup viewGroup) {
        if (!C54655a.m212173a().mo186718e() || EntityWordScope.isAllFgClosed()) {
            viewGroup.setVisibility(8);
        }
        this.f134662b.mo186129a(this.f134663c, viewGroup, this.f134661a);
        this.f134663c.init();
    }
}
