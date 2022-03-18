package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.common.internal.af */
public final class C21735af {

    /* renamed from: a */
    private static final Uri f53040a;

    /* renamed from: b */
    private static final Uri f53041b;

    /* renamed from: a */
    public static Intent m78936a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: a */
    public static Intent m78937a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: a */
    public static Intent m78935a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f53040a = parse;
        f53041b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
