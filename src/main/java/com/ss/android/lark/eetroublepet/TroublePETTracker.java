package com.ss.android.lark.eetroublepet;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.ss.android.lark.eetroublebase.Log;

public class TroublePETTracker {
    private static AbstractC36999a sDependency;

    /* renamed from: com.ss.android.lark.eetroublepet.TroublePETTracker$a */
    public interface AbstractC36999a {
        /* renamed from: a */
        boolean mo103083a();
    }

    public static void onActivityStarted(Activity activity) {
        AbstractC36999a aVar = sDependency;
        if (aVar != null && aVar.mo103083a()) {
            Log.m145908c(JSON.toJSONString(C37000a.m146027a(activity)));
        }
    }

    public static void show(Toast toast) {
        View view;
        AbstractC36999a aVar = sDependency;
        if (aVar != null && aVar.mo103083a() && (view = toast.getView()) != null) {
            Log.m145909d(JSON.toJSONString(C37000a.m146029a(findDomainKey(view))));
        }
    }

    private static String findDomainKey(View view) {
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        if (!(view instanceof ViewGroup)) {
            return "";
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            String findDomainKey = findDomainKey(viewGroup.getChildAt(i));
            if (!TextUtils.isEmpty(findDomainKey)) {
                return findDomainKey;
            }
        }
        return "";
    }

    public static void onResume(Fragment fragment) {
        AbstractC36999a aVar = sDependency;
        if (aVar != null && aVar.mo103083a() && fragment.getUserVisibleHint() && !fragment.isHidden()) {
            Log.m145908c(JSON.toJSONString(C37000a.m146028a(fragment)));
        }
    }

    public static void init(Application application, AbstractC36999a aVar) {
        application.registerActivityLifecycleCallbacks(new C37001b());
        sDependency = aVar;
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        AbstractC36999a aVar = sDependency;
        if (aVar != null && aVar.mo103083a() && !z) {
            Log.m145908c(JSON.toJSONString(C37000a.m146028a(fragment)));
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        AbstractC36999a aVar = sDependency;
        if (aVar != null && aVar.mo103083a() && z && fragment.isResumed()) {
            Log.m145908c(JSON.toJSONString(C37000a.m146028a(fragment)));
        }
    }
}
