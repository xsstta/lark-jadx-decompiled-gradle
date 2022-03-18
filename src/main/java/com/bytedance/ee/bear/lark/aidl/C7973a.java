package com.bytedance.ee.bear.lark.aidl;

import android.os.RemoteCallbackList;
import com.ss.android.lark.doc.IRemindStateChangeListener;

/* renamed from: com.bytedance.ee.bear.lark.aidl.a */
public class C7973a {

    /* renamed from: b */
    private static C7973a f21426b;

    /* renamed from: a */
    RemoteCallbackList<IRemindStateChangeListener> f21427a = new RemoteCallbackList<>();

    /* renamed from: a */
    public static C7973a m31833a() {
        if (f21426b == null) {
            synchronized (C7973a.class) {
                if (f21426b == null) {
                    f21426b = new C7973a();
                }
            }
        }
        return f21426b;
    }

    /* renamed from: a */
    public void mo30905a(IRemindStateChangeListener iRemindStateChangeListener) {
        RemoteCallbackList<IRemindStateChangeListener> remoteCallbackList = this.f21427a;
        if (remoteCallbackList != null && iRemindStateChangeListener != null) {
            remoteCallbackList.register(iRemindStateChangeListener);
        }
    }

    /* renamed from: b */
    public void mo30906b(IRemindStateChangeListener iRemindStateChangeListener) {
        RemoteCallbackList<IRemindStateChangeListener> remoteCallbackList = this.f21427a;
        if (remoteCallbackList != null && iRemindStateChangeListener != null) {
            remoteCallbackList.unregister(iRemindStateChangeListener);
        }
    }
}
