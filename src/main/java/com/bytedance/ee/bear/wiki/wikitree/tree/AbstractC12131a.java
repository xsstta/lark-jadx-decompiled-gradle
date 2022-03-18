package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.framework.mvp.BasePresenter;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a */
public abstract class AbstractC12131a extends BasePresenter<AbstractC12132a, AbstractC12177b, AbstractC12177b.AbstractC12178a> {

    /* renamed from: a */
    protected String f32679a = "Wiki_BaseTreePresenter";

    /* renamed from: b */
    private final FragmentActivity f32680b;

    /* renamed from: c */
    private final C10917c f32681c;

    /* renamed from: d */
    private final LifecycleOwner f32682d;

    /* renamed from: e */
    private boolean f32683e;

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo46352h() {
        return this.f32683e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public FragmentActivity mo46355k() {
        return this.f32680b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public LifecycleOwner mo46356l() {
        return this.f32682d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C10917c mo46357m() {
        return this.f32681c;
    }

    /* renamed from: f */
    public AbstractC12177b getView() {
        return (AbstractC12177b) super.getView();
    }

    /* renamed from: g */
    public AbstractC12132a getModel() {
        return (AbstractC12132a) super.getModel();
    }

    /* renamed from: e */
    public boolean mo46349e() {
        String str = this.f32679a;
        C13479a.m54764b(str, getClass().getSimpleName() + ".onBackPress. ");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo46353i() {
        if (mo46355k() == null || !C13726a.m55673a((Activity) mo46355k())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo46354j() {
        if (mo46355k() != null && C13726a.m55676b(mo46355k())) {
            mo46355k().finish();
        }
    }

    /* renamed from: a */
    public void mo46344a() {
        String str = this.f32679a;
        C13479a.m54764b(str, getClass().getSimpleName() + ".onCreate. ");
        create();
    }

    /* renamed from: b */
    public void mo46346b() {
        String str = this.f32679a;
        C13479a.m54764b(str, getClass().getSimpleName() + ".onAttachToWindow. ");
        this.f32683e = true;
    }

    /* renamed from: c */
    public void mo46347c() {
        String str = this.f32679a;
        C13479a.m54764b(str, getClass().getSimpleName() + ".onDetachFromWindow. ");
        this.f32683e = false;
    }

    /* renamed from: d */
    public void mo46348d() {
        String str = this.f32679a;
        C13479a.m54764b(str, getClass().getSimpleName() + ".onDestroy. ");
        this.f32683e = false;
        destroy();
    }

    /* renamed from: a */
    public void mo46345a(int i, int i2, Intent intent) {
        String str = this.f32679a;
        C13479a.m54764b(str, getClass().getSimpleName() + ".onResult. ");
    }

    AbstractC12131a(FragmentActivity fragmentActivity, C10917c cVar, LifecycleOwner lifecycleOwner, AbstractC12177b bVar, AbstractC12132a aVar) {
        super(aVar, bVar);
        this.f32680b = fragmentActivity;
        this.f32681c = cVar;
        this.f32682d = lifecycleOwner;
    }
}
