package com.ss.android.lark.calendar.impl.framework.components;

import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onPause", "", "onResume", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class CalendarBaseActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private HashMap f83309a;

    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f83309a == null) {
            this.f83309a = new HashMap();
        }
        View view = (View) this.f83309a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83309a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        C30022a.f74884c.mo108455b(false);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        C30022a.f74884c.mo108455b(true);
    }
}
