package com.bytedance.ee.bear.facade.common.extension;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7661a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.facade.common.extension.e */
public class C7704e extends C7661a {
    public C7704e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7661a
    /* renamed from: a */
    public void mo30103a(int i, int i2, Intent intent) {
        super.mo30103a(i, i2, intent);
        List<Fragment> fragments = this.f20780b.getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof AbstractC7664b) {
                    fragment.onActivityResult(i, i2, intent);
                }
            }
        }
    }
}
