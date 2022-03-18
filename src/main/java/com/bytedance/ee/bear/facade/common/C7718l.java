package com.bytedance.ee.bear.facade.common;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: com.bytedance.ee.bear.facade.common.l */
public class C7718l extends Fragment implements AbstractC7717k {

    /* renamed from: a */
    private boolean f20829a;

    /* renamed from: n */
    public boolean mo30190n() {
        return this.f20829a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f20829a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20829a = true;
    }
}
