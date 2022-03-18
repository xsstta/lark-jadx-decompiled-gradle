package com.ss.android.lark.inv.export.ui;

import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40129q;

public class InvBaseFragmentActivity extends BaseFragmentActivity {
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        C40129q.m159107a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C40129q.m159107a(this);
    }
}
