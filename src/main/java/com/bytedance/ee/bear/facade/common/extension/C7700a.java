package com.bytedance.ee.bear.facade.common.extension;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.facade.common.extension.a */
public class C7700a extends C7661a implements AbstractC7665c {

    /* renamed from: a */
    private final List<AbstractC7666d> f20816a = new ArrayList();

    @Override // com.bytedance.ee.bear.facade.common.C7661a
    /* renamed from: a */
    public boolean mo22318a() {
        if (m30808b() || m30809c()) {
            return true;
        }
        C10548d.m43696a((Context) this.f20780b);
        return super.mo22318a();
    }

    /* renamed from: b */
    private boolean m30808b() {
        for (int size = this.f20816a.size() - 1; size >= 0; size--) {
            if (this.f20816a.get(size).onBackPressed()) {
                C13479a.m54764b("ActivityBackPressDispatcher", "onBackPressed intercept ");
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m30809c() {
        List<Fragment> fragments = this.f20780b.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            return false;
        }
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if ((fragment instanceof AbstractC7666d) && ((AbstractC7666d) fragment).onBackPressed()) {
                C13479a.m54764b("ActivityBackPressDispatcher", "Back press consumed by :" + fragment);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7665c
    /* renamed from: b */
    public void mo30122b(AbstractC7666d dVar) {
        this.f20816a.remove(dVar);
    }

    public C7700a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7665c
    /* renamed from: a */
    public void mo30121a(AbstractC7666d dVar) {
        if (!this.f20816a.contains(dVar)) {
            this.f20816a.add(dVar);
        }
    }
}
