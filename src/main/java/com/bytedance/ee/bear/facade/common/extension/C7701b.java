package com.bytedance.ee.bear.facade.common.extension;

import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.AbstractC7712i;
import com.bytedance.ee.bear.facade.common.AbstractC7716j;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.facade.common.extension.b */
public class C7701b extends C7661a implements AbstractC7712i {

    /* renamed from: a */
    private final List<AbstractC7716j> f20817a = new ArrayList();

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7712i
    /* renamed from: b */
    public void mo30181b(AbstractC7716j jVar) {
        this.f20817a.remove(jVar);
    }

    public C7701b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7712i
    /* renamed from: a */
    public void mo30180a(AbstractC7716j jVar) {
        if (!this.f20817a.contains(jVar)) {
            this.f20817a.add(jVar);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7661a
    /* renamed from: a */
    public boolean mo30105a(KeyEvent keyEvent) {
        if (m30813b(keyEvent)) {
            return true;
        }
        for (int size = this.f20817a.size() - 1; size >= 0; size--) {
            if (this.f20817a.get(size).dispatchKeyEvent(keyEvent)) {
                C13479a.m54764b("ActivityKeyEventDispatcher", "KeyEvent intercept.");
                return true;
            }
        }
        return super.mo30105a(keyEvent);
    }

    /* renamed from: b */
    private boolean m30813b(KeyEvent keyEvent) {
        List<Fragment> fragments = this.f20780b.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            return false;
        }
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if ((fragment instanceof AbstractC7716j) && ((AbstractC7716j) fragment).dispatchKeyEvent(keyEvent)) {
                C13479a.m54764b("ActivityKeyEventDispatcher", "Key Event consumed by :" + fragment);
                return true;
            }
        }
        return false;
    }
}
