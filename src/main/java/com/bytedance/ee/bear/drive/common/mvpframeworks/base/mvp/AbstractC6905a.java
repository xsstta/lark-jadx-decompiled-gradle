package com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6909e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.a */
public abstract class AbstractC6905a<V extends AbstractC6909e> implements AbstractC6908d<V> {

    /* renamed from: a */
    private V f18678a;

    /* renamed from: b */
    private Context f18679b;

    /* renamed from: c */
    private List<AbstractC6906b> f18680c = new ArrayList();

    /* renamed from: d */
    private List<AbstractC6907c> f18681d = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Context mo27152k() {
        return this.f18679b;
    }

    /* renamed from: m */
    public V mo27154m() {
        return this.f18678a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo27153l() {
        if (this.f18678a != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: f */
    public void mo25893f() {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27164e();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: g */
    public void mo27148g() {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27158a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: h */
    public void mo27149h() {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27161b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: i */
    public void mo27150i() {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27162c();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: j */
    public void mo27151j() {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27163d();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: b */
    public void mo26654b() {
        this.f18678a = null;
        if (!this.f18680c.isEmpty()) {
            for (AbstractC6906b bVar : this.f18680c) {
                bVar.mo27155a();
            }
        }
    }

    public AbstractC6905a(Context context) {
        this.f18679b = context;
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: a */
    public void mo27146a(Bundle bundle) {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27160a(bundle);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: a */
    public void mo27147a(V v) {
        this.f18678a = v;
        if (!this.f18680c.isEmpty()) {
            for (AbstractC6906b bVar : this.f18680c) {
                bVar.mo27157a(v);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: a */
    public void mo25880a(Bundle bundle, Bundle bundle2) {
        if (!this.f18680c.isEmpty()) {
            for (AbstractC6906b bVar : this.f18680c) {
                bVar.mo27156a(bundle, bundle2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d
    /* renamed from: a */
    public void mo27145a(int i, int i2, Intent intent) {
        if (!this.f18681d.isEmpty()) {
            for (AbstractC6907c cVar : this.f18681d) {
                cVar.mo27159a(i, i2, intent);
            }
        }
    }
}
