package com.ss.android.lark.calendar.impl.features.common.widget.p1500b;

import android.content.Context;
import com.bytedance.ee.bear.middleground.calendar.C8890a;
import com.bytedance.ee.bear.middleground.calendar.bean.C8918a;
import com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.b.a */
public class C31164a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.b.a$a */
    public static class C31166a {

        /* renamed from: a */
        public static final C31164a f78756a = new C31164a();
    }

    private C31164a() {
    }

    /* renamed from: a */
    public static C31164a m116337a() {
        return C31166a.f78756a;
    }

    /* renamed from: b */
    private C8918a m116339b() {
        return new C8918a(C30022a.f74882a.dynamicConfigModuleDependency().mo108234a(DomainSettings.Alias.DOCS_PEER), C30022a.f74882a.dynamicConfigModuleDependency().mo108234a(DomainSettings.Alias.DOCS_API), C30022a.f74882a.dynamicConfigModuleDependency().mo108233a(C30022a.f74882a.loginDependency().mo108273e()));
    }

    /* renamed from: a */
    public void mo112895a(Context context) {
        C8890a.m37285a(context, m116339b());
    }

    /* renamed from: b */
    public WebEditorWrapper mo112896b(Context context) {
        boolean z;
        WebEditorWrapper a = C8890a.m37284a();
        if (a == null) {
            Log.m165389i("WebEditorManager", C32673y.m125377c("v2 WebEditor not init"));
            mo112895a(context);
            a = C8890a.m37284a();
            a.setAnalyticCallback($$Lambda$a$RaBsr4NEGXwj568m2nQ4z6j8Otg.INSTANCE);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("v2 webEditor is null: ");
        if (a == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("WebEditorManager", C32673y.m125377c(sb.toString()));
        a.setCustomStyle(new WebEditorStyle.C8917a().mo34205a());
        a.setBodyBackgroundColor(C32634ae.m125178a(R.color.bg_body));
        return a;
    }
}
