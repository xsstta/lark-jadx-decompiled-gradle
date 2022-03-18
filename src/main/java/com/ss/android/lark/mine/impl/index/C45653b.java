package com.ss.android.lark.mine.impl.index;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.biz.core.api.IMineController;
import com.ss.android.lark.mine.impl.index.v2.MineFragment2;

/* renamed from: com.ss.android.lark.mine.impl.index.b */
public class C45653b implements IMineController {
    @Override // com.ss.android.lark.biz.core.api.IMineController
    /* renamed from: a */
    public Fragment mo105902a() {
        return new MineFragment2();
    }

    @Override // com.ss.android.lark.biz.core.api.IMineController
    /* renamed from: a */
    public void mo105903a(Fragment fragment) {
        if (fragment instanceof IMineFragment) {
            ((IMineFragment) fragment).mo160769b();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IMineController
    /* renamed from: b */
    public void mo105905b(Fragment fragment) {
        if (fragment instanceof IMineFragment) {
            ((IMineFragment) fragment).mo160766a();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IMineController
    /* renamed from: a */
    public void mo105904a(Fragment fragment, boolean z) {
        if (fragment instanceof IMineFragment) {
            ((IMineFragment) fragment).mo160768a(z);
        }
    }
}
