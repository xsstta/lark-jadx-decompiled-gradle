package com.larksuite.component.openplatform.api;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1103b.AbstractC24366a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.api.a */
public interface AbstractC24361a extends AbstractC24366a, AbstractC25891b {
    /* renamed from: a */
    void mo87106a(int i, String[] strArr, int[] iArr);

    /* renamed from: a */
    void mo87107a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo87108a(OPContainerLifecycleEventEnum oPContainerLifecycleEventEnum, Object... objArr);

    /* renamed from: a */
    void mo87109a(Class cls, Object obj);

    /* renamed from: a */
    void mo87110a(String str, JSONObject jSONObject);

    /* renamed from: a */
    boolean mo87111a(int i, int i2, Intent intent);

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    Context mo49749b();

    /* renamed from: c */
    boolean mo87112c();

    /* renamed from: d */
    IAppContext mo87113d();

    /* renamed from: e */
    void mo87114e();
}
