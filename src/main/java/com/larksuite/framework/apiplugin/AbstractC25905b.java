package com.larksuite.framework.apiplugin;

import android.content.Context;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel;
import com.larksuite.framework.apiplugin.core.LKCallProxyActivityCallback;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;

/* renamed from: com.larksuite.framework.apiplugin.b */
public interface AbstractC25905b {
    /* renamed from: a */
    Context mo92207a();

    /* renamed from: a */
    <T> T mo92208a(String str, Class<T> cls);

    /* renamed from: a */
    <T> T mo92209a(String str, Object obj, AbstractC25897h<T> hVar, Class<T> cls);

    /* renamed from: a */
    <T> T mo92210a(String str, Object obj, Class<T> cls);

    /* renamed from: a */
    <T> T mo92211a(String str, Object obj, Object obj2, AbstractC25897h<T> hVar, Class<T> cls);

    /* renamed from: a */
    void mo92212a(OPMonitorReportModel.Request request);

    /* renamed from: a */
    void mo92213a(LKCallProxyActivityCallback lKCallProxyActivityCallback);

    /* renamed from: a */
    void mo92214a(String str, Object obj);

    /* renamed from: b */
    void mo92215b();

    /* renamed from: b */
    void mo92216b(String str, Object obj);

    /* renamed from: b */
    <T> void mo92217b(String str, Object obj, Class<T> cls);
}
