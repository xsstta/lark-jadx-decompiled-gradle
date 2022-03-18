package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.C21700b;
import com.google.android.gms.common.util.C21810d;
import com.google.android.gms.common.wrappers.Wrappers;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C21743d {

    /* renamed from: a */
    private static final SimpleArrayMap<String, String> f53071a = new SimpleArrayMap<>();

    /* renamed from: a */
    public static String m78966a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m78967a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m78967a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m78967a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m78967a(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: b */
    public static String m78970b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m78967a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m78966a(context, i);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: c */
    public static String m78971c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m78965a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a);
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, a);
            } else if (i == 5) {
                return m78968a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m78968a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, a);
                } else if (i == 20) {
                    return m78968a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m78968a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m78968a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, a);
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, a);
                    }
                }
            }
        } else if (C21810d.m79085b(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, a);
        }
    }

    /* renamed from: d */
    public static String m78972d(Context context, int i) {
        if (i == 6) {
            return m78968a(context, "common_google_play_services_resolution_required_text", m78965a(context));
        }
        return m78971c(context, i);
    }

    /* renamed from: e */
    public static String m78973e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }

    /* renamed from: a */
    public static String m78965a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m78968a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m78967a(context, str);
        if (a == null) {
            a = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, str2);
    }

    /* renamed from: a */
    private static String m78967a(Context context, String str) {
        SimpleArrayMap<String, String> simpleArrayMap = f53071a;
        synchronized (simpleArrayMap) {
            String str2 = simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources a = C21700b.m78851a(context);
            if (a == null) {
                return null;
            }
            int identifier = a.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = a.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }

    /* renamed from: b */
    public static String m78969b(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }
}
