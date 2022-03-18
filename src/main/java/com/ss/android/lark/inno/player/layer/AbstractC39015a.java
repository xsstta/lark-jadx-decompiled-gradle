package com.ss.android.lark.inno.player.layer;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.player.core.AbstractC39001b;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1974b.p1976b.C38946a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.inno.player.layer.a */
public abstract class AbstractC39015a {

    /* renamed from: a */
    protected ViewGroup f100207a;

    /* renamed from: b */
    protected FrameLayout f100208b;

    /* renamed from: c */
    protected List<AbstractC39001b> f100209c = new ArrayList();

    /* renamed from: d */
    protected Set<Integer> f100210d = new HashSet();

    /* renamed from: e */
    protected FrameLayout f100211e;

    /* renamed from: f */
    protected FrameLayout f100212f;

    /* renamed from: g */
    protected FrameLayout f100213g;

    /* renamed from: h */
    public PlayerLayerMode f100214h = PlayerLayerMode.NORMAL;

    /* renamed from: i */
    protected C38946a f100215i;

    /* renamed from: b */
    public abstract FrameLayout mo142703b();

    /* renamed from: c */
    public abstract FrameLayout mo142704c();

    /* renamed from: d */
    public abstract FrameLayout mo142705d();

    /* renamed from: a */
    public Context mo142745a() {
        return this.f100208b.getContext();
    }

    /* renamed from: e */
    private void mo142693e() {
        if (mo142704c() != null) {
            mo142704c().setVisibility(0);
        }
        if (mo142703b() != null) {
            mo142703b().setVisibility(8);
        }
        if (mo142705d() != null) {
            mo142705d().setVisibility(8);
        }
    }

    /* renamed from: f */
    private void mo142694f() {
        if (mo142704c() != null) {
            mo142704c().setVisibility(8);
        }
        if (mo142703b() != null) {
            mo142703b().setVisibility(0);
        }
        if (mo142705d() != null) {
            mo142705d().setVisibility(8);
        }
    }

    /* renamed from: g */
    private void mo142695g() {
        if (mo142704c() != null) {
            mo142704c().setVisibility(8);
        }
        if (mo142703b() != null) {
            mo142703b().setVisibility(8);
        }
        if (mo142705d() != null) {
            mo142705d().setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo142746a(ViewGroup viewGroup) {
        this.f100207a = viewGroup;
    }

    /* renamed from: b */
    public void mo142749b(int i) {
        for (AbstractC39001b bVar : this.f100209c) {
            if (bVar.mo142706a(i)) {
                bVar.mo142590c(i);
            }
        }
    }

    /* renamed from: c */
    public void mo142751c(int i) {
        for (AbstractC39001b bVar : this.f100209c) {
            if (bVar.mo142706a(i)) {
                bVar.mo142591d(i);
            }
        }
    }

    /* renamed from: a */
    public void mo142748a(PlayerLayerMode playerLayerMode) {
        if (this.f100214h != playerLayerMode) {
            if (playerLayerMode == PlayerLayerMode.NORMAL) {
                mo142693e();
                if (this.f100214h == PlayerLayerMode.FULL) {
                    this.f100215i.mo142546a(this.f100207a);
                }
            } else if (playerLayerMode == PlayerLayerMode.FULL) {
                mo142694f();
                this.f100215i.mo142545a(mo142745a());
            } else if (playerLayerMode == PlayerLayerMode.MINI) {
                mo142695g();
            }
            this.f100214h = playerLayerMode;
            mo142751c(C38943b.f100077b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo142747a(AbstractC39001b bVar, FrameLayout frameLayout) {
        this.f100209c.add(bVar);
        frameLayout.addView(bVar.mo142710d(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: b */
    public void mo142750b(int i, Bundle bundle) {
        for (AbstractC39001b bVar : this.f100209c) {
            if (bVar.mo142706a(i)) {
                bVar.mo142656a(i, bundle);
            }
        }
    }

    /* renamed from: c */
    public void mo142752c(int i, Bundle bundle) {
        for (AbstractC39001b bVar : this.f100209c) {
            if (bVar.mo142706a(i)) {
                bVar.mo142596b(i, bundle);
            }
        }
    }
}
