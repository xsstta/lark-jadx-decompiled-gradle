package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.e */
public interface AbstractC21667e {
    /* renamed from: a */
    Activity mo73470a();

    /* renamed from: a */
    <T extends LifecycleCallback> T mo73471a(String str, Class<T> cls);

    /* renamed from: a */
    void mo73472a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
