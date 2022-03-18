package com.ss.android.lark.eetroublecapture;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.eetroublebase.p1826a.C36963a;
import com.ss.android.lark.eetroublebase.p1826a.C36966c;
import com.ss.android.lark.eetroublecapture.entity.CaptureInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.eetroublecapture.k */
public class C36991k {

    /* renamed from: a */
    private AbstractC36974c f95092a;

    /* renamed from: a */
    public List<CaptureInfo> mo136504a() {
        ArrayList arrayList = new ArrayList();
        Activity a = this.f95092a.mo136463a();
        if (a != null) {
            arrayList.add(m145990a(a));
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<AbstractC36982d> mo136505b() {
        ArrayList arrayList = new ArrayList();
        Activity a = this.f95092a.mo136463a();
        if (a instanceof AbstractC36982d) {
            arrayList.add((AbstractC36982d) a);
        }
        if (a instanceof FragmentActivity) {
            m145991a(((FragmentActivity) a).getSupportFragmentManager(), arrayList);
        }
        return arrayList;
    }

    public C36991k(AbstractC36974c cVar) {
        this.f95092a = cVar;
    }

    /* renamed from: a */
    public static CaptureInfo m145990a(Activity activity) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        if (activity == null) {
            return null;
        }
        CaptureInfo captureInfo = new CaptureInfo();
        captureInfo.f95082n = C36966c.m145948a(activity.getClass());
        captureInfo.f95081k = C36963a.m145940a(activity);
        HashMap hashMap = new HashMap();
        if (!(!(activity instanceof FragmentActivity) || (supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null)) {
            for (Fragment fragment : fragments) {
                View view = fragment.getView();
                if (view != null) {
                    hashMap.put(view, C36963a.m145942a(fragment));
                }
            }
        }
        try {
            captureInfo.subs.add(new C36998o(activity.getWindow().getDecorView(), hashMap).mo136517a());
        } catch (Exception unused) {
        }
        return captureInfo;
    }

    /* renamed from: a */
    private void m145991a(FragmentManager fragmentManager, List<AbstractC36982d> list) {
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment instanceof AbstractC36982d) {
                list.add((AbstractC36982d) fragment);
            }
            if (fragment.isAdded()) {
                m145991a(fragment.getChildFragmentManager(), list);
            }
        }
    }
}
