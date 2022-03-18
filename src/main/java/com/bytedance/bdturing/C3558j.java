package com.bytedance.bdturing;

import com.bytedance.bdturing.p207c.C3534c;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.j */
public class C3558j {

    /* renamed from: a */
    private static ReentrantLock f11245a = new ReentrantLock();

    /* renamed from: b */
    private static List<JSONObject> f11246b = new LinkedList();

    /* renamed from: a */
    public static void m15007a() {
        try {
            f11245a.lockInterruptibly();
            f11246b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            f11245a.unlock();
            throw th;
        }
        f11245a.unlock();
    }

    /* renamed from: a */
    public static void m15009a(C3534c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os_name", "android");
            f11245a.lockInterruptibly();
            jSONObject.put("touch", new JSONArray((Collection) f11246b));
            LogUtil.m14899d("onTouch", "responseGetTouchToJs motion list size " + f11246b.size());
            f11246b.clear();
            LogUtil.m14899d("onTouch", "responseGetTouchToJs end motion list size " + f11246b.size());
        } catch (Exception unused) {
        } catch (Throwable th) {
            f11245a.unlock();
            throw th;
        }
        f11245a.unlock();
        try {
            cVar.mo14311a(1, jSONObject);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static void m15008a(long j, float f, float f2, int i, float f3, float f4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", j);
            jSONObject.put("force", (double) f);
            jSONObject.put("majorRadius", (double) f2);
            jSONObject.put("phase", i);
            jSONObject.put("x", (double) f3);
            jSONObject.put("y", (double) f4);
            try {
                f11245a.lockInterruptibly();
                f11246b.add(jSONObject);
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                f11245a.unlock();
                throw th;
            }
            f11245a.unlock();
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }
}
