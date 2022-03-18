package com.ss.android.lark.guidemgr;

import com.ss.android.lark.guidemgr.p1934a.AbstractC38701a;
import com.ss.android.lark.guidemgr.p1935b.C38702a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.guidemgr.p1935b.p1941f.C38720a;
import com.ss.android.lark.guidemgr.p1943c.C38724a;
import com.ss.android.lark.guidemgr.upgrade.GuideUpgrade;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.guidemgr.a */
public class C38700a {

    /* renamed from: a */
    private static volatile AbstractC38701a f99563a;

    /* renamed from: b */
    private static volatile boolean f99564b;

    /* renamed from: a */
    public static AbstractC38701a m152832a() {
        return f99563a;
    }

    /* renamed from: g */
    private boolean m152834g() {
        return !f99564b;
    }

    /* renamed from: c */
    public void mo141823c() {
        if (!m152834g()) {
            C38702a.m152865f().mo141849b();
        }
    }

    /* renamed from: e */
    public void mo141827e() {
        if (!m152834g()) {
            C38702a.m152865f().mo141853d();
        }
    }

    /* renamed from: f */
    public boolean mo141829f() {
        if (C38720a.m152926c().mo141886a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo141821b() {
        if (m152834g()) {
            C38702a.m152865f().mo141843a();
            f99564b = true;
        }
    }

    /* renamed from: d */
    public void mo141825d() {
        if (!m152834g()) {
            C38702a.m152865f().mo141855e();
            f99564b = false;
        }
    }

    public C38700a(AbstractC38701a aVar) {
        f99563a = aVar;
    }

    /* renamed from: a */
    public static boolean m152833a(String str) {
        return C38724a.m152937a(str);
    }

    /* renamed from: i */
    public boolean mo141833i(String str) {
        return GuideUpgrade.f99623a.mo141920a(str);
    }

    /* renamed from: a */
    public void mo141818a(List<String> list) {
        if (!m152834g()) {
            C38702a.m152865f().mo141844a(list);
        }
    }

    /* renamed from: h */
    public void mo141832h(String str) {
        if (!m152834g()) {
            C38702a.m152865f().mo141857f(str);
        }
    }

    /* renamed from: c */
    public boolean mo141824c(String str) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141850b(str);
    }

    /* renamed from: f */
    public boolean mo141830f(String str) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141850b(str);
    }

    /* renamed from: g */
    public boolean mo141831g(String str) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141856e(str);
    }

    /* renamed from: b */
    public boolean mo141822b(String str) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141852c(str);
    }

    /* renamed from: d */
    public boolean mo141826d(String str) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141846a(str);
    }

    /* renamed from: e */
    public boolean mo141828e(String str) {
        if (m152834g()) {
            return false;
        }
        boolean a = C38702a.m152865f().mo141846a(str);
        Log.m165389i("GuideMgrModule", "checkToShow: key:" + str + ", show:" + a);
        return a;
    }

    /* renamed from: a */
    public boolean mo141819a(String str, C38708a aVar) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141847a(str, aVar);
    }

    /* renamed from: a */
    public boolean mo141820a(List<String> list, C38708a aVar) {
        if (m152834g()) {
            return false;
        }
        return C38702a.m152865f().mo141848a(list, aVar);
    }
}
