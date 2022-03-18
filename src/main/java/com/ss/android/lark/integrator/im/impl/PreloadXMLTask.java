package com.ss.android.lark.integrator.im.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.abtest.ExperimentConfig;
import com.ss.android.lark.dependency.C36469c;
import com.ss.android.lark.dependency.as;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.p1786d.AbstractC36428b;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.utils.DevicePerfUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PreloadXMLTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: d */
    public boolean mo92546d() {
        return true;
    }

    /* renamed from: h */
    private List<as.C36467a> m157571h() {
        return as.m143784a();
    }

    /* renamed from: g */
    private Map<Integer, Integer> m157570g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C36469c.m143790a());
        linkedHashMap.putAll(C39603g.m157159a().getCCMDependency().mo143307g());
        return linkedHashMap;
    }

    /* renamed from: i */
    private boolean m157572i() {
        if (!C37239a.m146648b().mo136952a("chat.enter.async.load.xml", false) || !ExperimentConfig.f71633b.mo101365c()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        DevicePerfUtils.DevicePerfLevel b = DevicePerfUtils.m224113b();
        if (b == DevicePerfUtils.DevicePerfLevel.LOW || b == DevicePerfUtils.DevicePerfLevel.ULTRALOW) {
            return 20;
        }
        return super.mo43824b();
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (m157572i()) {
            C36443k a = C36443k.m143598a(context);
            AbstractC36428b.C36430b a2 = a.mo134295a();
            for (Map.Entry<Integer, Integer> entry : m157570g().entrySet()) {
                a2.mo134297a(entry.getKey().intValue(), entry.getValue().intValue());
            }
            a2.mo134298a(new FrameLayout(context));
            a2.mo134299a();
            for (as.C36467a aVar : m157571h()) {
                a.mo134317a(aVar.f94022a, aVar.f94023b, aVar.f94024c);
            }
        }
    }
}
