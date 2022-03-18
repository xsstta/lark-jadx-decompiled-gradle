package com.ss.android.lark.calendar.impl.framework.components;

import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragment;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.components.a */
public class CalendarBaseFragment extends BaseFragment {

    /* renamed from: a */
    private HashMap f83310a;

    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f83310a == null) {
            this.f83310a = new HashMap();
        }
        View view = (View) this.f83310a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f83310a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f83310a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }
}
