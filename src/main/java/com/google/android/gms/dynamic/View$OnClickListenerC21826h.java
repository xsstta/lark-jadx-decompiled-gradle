package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;

/* renamed from: com.google.android.gms.dynamic.h */
final class View$OnClickListenerC21826h implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Context f53243a;

    /* renamed from: b */
    private final /* synthetic */ Intent f53244b;

    View$OnClickListenerC21826h(Context context, Intent intent) {
        this.f53243a = context;
        this.f53244b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f53243a.startActivity(this.f53244b);
        } catch (ActivityNotFoundException e) {
            Log.e(DeferredLifecycleHelper.f57986a, "Failed to start resolution intent", e);
        }
    }
}
