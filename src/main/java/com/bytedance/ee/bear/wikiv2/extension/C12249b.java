package com.bytedance.ee.bear.wikiv2.extension;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13741f;

/* renamed from: com.bytedance.ee.bear.wikiv2.extension.b */
public class C12249b extends C7661a {
    @Override // com.bytedance.ee.bear.facade.common.C7661a
    /* renamed from: a */
    public boolean mo22318a() {
        FragmentManager supportFragmentManager = this.f20780b.getSupportFragmentManager();
        boolean a = m50988a(supportFragmentManager);
        C13479a.m54764b("DocumentFragmentBackHandler", "onDispatchFragmentBackPress , documentAtTopBackStack:" + a);
        if (!a) {
            return super.mo22318a();
        }
        C13741f.m55704a(supportFragmentManager);
        supportFragmentManager.popBackStack();
        return true;
    }

    public C12249b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    /* renamed from: a */
    private boolean m50988a(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (backStackEntryCount > 0) {
            return "document_stack".equals(fragmentManager.getBackStackEntryAt(backStackEntryCount - 1).mo5399d());
        }
        return false;
    }
}
