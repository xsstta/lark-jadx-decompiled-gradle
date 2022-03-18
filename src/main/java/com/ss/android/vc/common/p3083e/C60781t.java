package com.ss.android.vc.common.p3083e;

import com.ss.android.lark.diskmanage.storage.StorageManager;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.diskmanage.IVideoChatStorage;

/* renamed from: com.ss.android.vc.common.e.t */
public class C60781t {

    /* renamed from: a */
    private static volatile IVideoChatStorage f151984a;

    /* renamed from: a */
    public static String m236220a() {
        return m236221b().mo210458a();
    }

    /* renamed from: b */
    private static IVideoChatStorage m236221b() {
        if (f151984a == null) {
            f151984a = (IVideoChatStorage) StorageManager.m145313a(ar.m236694a(), "vc", IVideoChatStorage.class);
        }
        return f151984a;
    }
}
