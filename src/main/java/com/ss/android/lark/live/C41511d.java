package com.ss.android.lark.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.ss.android.lark.live.d */
public class C41511d {
    /* renamed from: a */
    public static void m164742a(Context context, VcLiveUrlParam vcLiveUrlParam) {
        Intent intent = new Intent();
        intent.setClass(context, VcLiveWebActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("bundle_live_url_param", vcLiveUrlParam);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
