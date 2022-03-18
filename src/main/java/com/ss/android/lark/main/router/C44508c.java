package com.ss.android.lark.main.router;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.aj;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.router.AbstractC40091a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44238f;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.main.router.loader.TargetPageLoader;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import kotlin.collections.CollectionsKt;

/* renamed from: com.ss.android.lark.main.router.c */
public class C44508c {
    /* renamed from: c */
    private static boolean m176571c(Context context, Uri uri) {
        return false;
    }

    /* renamed from: a */
    public static boolean m176559a(Context context, String str, Bundle bundle, boolean z) {
        if (!C44134a.m174959a().mo133270z().mo133361a("lark.android.offline_push_schema_wake") || TextUtils.isEmpty(str) || bundle == null || !str.contains(m176549a((Activity) context)) || !C44134a.m174959a().mo133257m().mo133348a()) {
            return false;
        }
        String string = bundle.getString("open_url");
        if (!TextUtils.isEmpty(string) && string.startsWith("http://")) {
            C44134a.m174959a().mo133235b(context, string.substring(7));
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m176560a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        C44134a.m174959a().mo133181A().mo143222a(context, str, str2);
        return true;
    }

    /* renamed from: a */
    public static boolean m176561a(Context context, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        return C44134a.m174959a().mo133181A().mo143223a(context, str, str2, str3, str4);
    }

    /* renamed from: a */
    public static boolean m176557a(final Context context, final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C44134a.m174959a().mo133261q().mo133332a(str)) {
            m176565b(context, str, i);
            return true;
        }
        C44134a.m174959a().mo133261q().mo133331a(Collections.singletonList(str), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.main.router.C44508c.C445091 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C44508c.m176551a(context);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    C44508c.m176565b(context, str, i);
                } else {
                    C44508c.m176551a(context);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public static boolean m176562a(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (aj.m95019a(str)) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.m165382e(e.getMessage());
            } catch (IllegalArgumentException e2) {
                Log.m165382e(e2.getMessage());
            }
        }
        C44134a.m174959a().mo133183C().mo133367a();
        C44134a.m174959a().mo133218a(context, str, str2, z);
        return true;
    }

    /* renamed from: a */
    public static boolean m176558a(Context context, String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(C57744a.m224104a().getString("sso_sdk_url")) && C57744a.m224104a().getString("sso_sdk_url").equals(str)) {
            return false;
        }
        C57744a.m224104a().putString("sso_sdk_url", str);
        if (aj.m95019a(str)) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.m165382e(e.getMessage());
            } catch (IllegalArgumentException e2) {
                Log.m165382e(e2.getMessage());
            }
        }
        C44134a.m174959a().mo133257m().mo133345a(context, str, bundle);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m176548a(PostLaunchAction postLaunchAction) {
        return Boolean.valueOf(postLaunchAction instanceof OpenUriPostLaunchAction);
    }

    /* renamed from: c */
    private static boolean m176575c(Uri uri) {
        return C44134a.m174959a().mo133200T().mo133282a(uri);
    }

    /* renamed from: d */
    private static boolean m176580d(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("/web/");
    }

    /* renamed from: e */
    private static boolean m176584e(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("/contact/add_friend");
    }

    /* renamed from: a */
    public static void m176551a(Context context) {
        new C44238f().mo157267a(context, 335544320, Collections.singletonMap("extra_tips_toast_text", context.getString(R.string.Lark_Legacy_ChatInexistent)));
    }

    /* renamed from: b */
    public static String m176564b(String str) {
        if (!TextUtils.isEmpty(str) && m176576c(str)) {
            return str.substring(6, str.length());
        }
        return null;
    }

    /* renamed from: a */
    public static String m176549a(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), SmActions.ACTION_ONTHECALL_EXIT);
            if (activityInfo.metaData != null) {
                return activityInfo.metaData.getString("BDPushSchema");
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static String m176563b(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString()) || !m176584e(uri.getPath())) {
            return null;
        }
        return uri.getQueryParameter("token");
    }

    /* renamed from: a */
    public static String m176550a(Uri uri) {
        if (uri != null && !TextUtils.isEmpty(uri.toString())) {
            String uri2 = uri.toString();
            if (uri2.startsWith("lark://client/web/")) {
                return uri2.substring(18);
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m176576c(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("/chat/");
    }

    /* renamed from: a */
    public static void m176553a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C44134a.m174959a().mo133257m().mo133347a(str);
        }
    }

    /* renamed from: c */
    public static boolean m176573c(Context context, String str) {
        return m176557a(context, str, -1);
    }

    /* renamed from: d */
    private static boolean m176578d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C44134a.m174959a().mo133214a(context, str, 335544320);
        return true;
    }

    /* renamed from: e */
    private static boolean m176582e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C44134a.m174959a().mo133257m().mo133344a(context, str);
        return true;
    }

    /* renamed from: f */
    private static boolean m176586f(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C44134a.m174959a().mo133245c(context, str);
    }

    /* renamed from: g */
    private static boolean m176587g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        C44134a.m174959a().mo133247d(context, str);
        return true;
    }

    /* renamed from: b */
    public static boolean m176566b(Context context, Uri uri) {
        String path = uri.getPath();
        boolean z = false;
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (m176576c(path)) {
            z = m176573c(context, m176564b(path));
        }
        if (m176580d(path)) {
            return m176570b(context, m176550a(uri), (String) null);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m176554a(Context context, Uri uri) {
        int i;
        if ("/chat".equals(uri.getPath())) {
            String queryParameter = uri.getQueryParameter("chatId");
            int i2 = -1;
            String queryParameter2 = uri.getQueryParameter("position");
            if (!TextUtils.isEmpty(queryParameter2) && TextUtils.isDigitsOnly(queryParameter2)) {
                i2 = Integer.parseInt(queryParameter2);
            }
            if (m176557a(context, queryParameter, i2)) {
                return true;
            }
        } else if ("/web".equals(uri.getPath())) {
            if (m176570b(context, uri.getQueryParameter("url"), uri.getQueryParameter("app_id"))) {
                return true;
            }
        } else if (m176584e(uri.getPath())) {
            if (m176578d(context, m176563b(uri))) {
                return true;
            }
        } else if ("/verify".equals(uri.getPath())) {
            if (m176556a(context, uri.getQueryParameter("qr_code"))) {
                return true;
            }
        } else if ("/microapp".equals(uri.getPath())) {
            if (m176583e(context, uri.getQueryParameter("app_id"), uri.getQueryParameter("path"))) {
                return true;
            }
        } else if ("/openthread".equals(uri.getPath())) {
            if (m176574c(context, uri.getQueryParameter("chatid"), uri.getQueryParameter("threadid"))) {
                return true;
            }
        } else if ("/helpdesk".equals(uri.getPath())) {
            if (m176579d(context, uri.getQueryParameter("id"), uri.getQueryParameter("extra"))) {
                return true;
            }
        } else if (C44134a.m174959a().mo133195O().mo133375a().containsKey(uri.getPath())) {
            C44134a.m174959a().mo133195O().mo133375a().get(uri.getPath()).mo145603b(context, AbstractC40091a.m158938a(uri));
            return true;
        } else if ("/videochat/meetingno/join".equals(uri.getPath())) {
            if (m176569b(context, uri.getQueryParameter("no"))) {
                return true;
            }
        } else if ("/videochat/interview/join".equals(uri.getPath())) {
            if (m176560a(context, uri.getQueryParameter("id"), uri.getQueryParameter("role"))) {
                return true;
            }
        } else if ("/videochat/xiaomivoip".equals(uri.getPath())) {
            if (m176561a(context, uri.getQueryParameter("id"), uri.getQueryParameter("action"), uri.getQueryParameter(ShareHitPoint.f121869d), uri.getQueryParameter("interactiveid"))) {
                return true;
            }
        } else if (uri.toString().startsWith("sslocal://microapp")) {
            if (m176586f(context, uri.toString())) {
                return true;
            }
        } else if (!TextUtils.isEmpty(uri.getPath()) && uri.getPath().contains("/passport")) {
            return m176582e(context, uri.getPath());
        } else {
            if (!TextUtils.isEmpty(uri.getPath()) && uri.getPath().contains("/tenant")) {
                return m176582e(context, uri.getPath());
            }
            if ("/stickerSet".equals(uri.getPath())) {
                if (m176587g(context, uri.getQueryParameter("id"))) {
                    return true;
                }
            } else if (m176566b(context, uri)) {
                return true;
            } else {
                if ("/chatSetting".equals(uri.getPath())) {
                    return TargetPageLoader.m176590a().mo157957a(context, uri.getQueryParameter("id"));
                } else if (!TextUtils.isEmpty(uri.getPath()) && uri.getPath().startsWith("/guide/")) {
                    return m176575c(uri);
                } else {
                    if (C44134a.m174959a().mo133270z().mo133361a("lark.android.offline_push_schema_wake") && (context instanceof Activity) && TextUtils.equals(m176549a((Activity) context), uri.getScheme())) {
                        try {
                            String uri2 = uri.toString();
                            C44134a.m174959a().mo133235b(context, uri2.substring((m176549a((Activity) context) + "://").length()));
                            return true;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return false;
                        }
                    } else if ("/calendar/freebusy".equals(uri.getPath())) {
                        C44134a.m174959a().mo133192L().mo133377a(context, uri.getQueryParameter("uid"));
                        return true;
                    } else if ("/profile".equals(uri.getPath())) {
                        String queryParameter3 = uri.getQueryParameter("uid");
                        String queryParameter4 = uri.getQueryParameter("token");
                        String queryParameter5 = uri.getQueryParameter("chatId");
                        String queryParameter6 = uri.getQueryParameter("sender");
                        try {
                            i = Integer.parseInt(uri.getQueryParameter(ShareHitPoint.f121868c));
                        } catch (NumberFormatException e2) {
                            Log.m165383e("RouterUtil", "sourceType parseInt failed: " + e2.getMessage());
                            e2.printStackTrace();
                            i = 0;
                        }
                        boolean parseBoolean = Boolean.parseBoolean(uri.getQueryParameter("fromProfile"));
                        String queryParameter7 = uri.getQueryParameter("name");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            C44134a.m174959a().mo133217a(context, queryParameter3, queryParameter5, queryParameter6, queryParameter7, i, parseBoolean);
                        } else {
                            C44134a.m174959a().mo133216a(context, queryParameter4, queryParameter6, queryParameter7, i);
                        }
                        return true;
                    } else if ("/contact/share".equals(uri.getPath())) {
                        C44134a.m174959a().mo133212a(context);
                        return true;
                    } else if (!TextUtils.isEmpty(uri.getPath()) && uri.getPath().startsWith("/dynamicFlow/1/")) {
                        C44134a.m174959a().mo133224a(context, uri);
                        return true;
                    } else if (!TextUtils.isEmpty(uri.getPath()) && uri.getPath().startsWith("/onboarding/jump/")) {
                        return C44134a.m174959a().mo133237b(context, uri);
                    } else {
                        if ("/install_certificate".equals(uri.getPath())) {
                            if (!C44134a.m174959a().mo133270z().mo133361a("lark.browser.security.sealcert")) {
                                Log.m165389i("RouterUtil", "seal cert fg is not on.");
                                return false;
                            }
                            try {
                                TextUtils.isEmpty(uri.getQueryParameter("redirect_uri"));
                            } catch (Exception e3) {
                                Log.m165398w("RouterUtil", "parse seal redirect_uri failed", e3);
                            }
                            return C44134a.m174959a().mo133243c(context, uri);
                        } else if ("/back".equals(uri.getPath())) {
                            if (C44134a.m174959a().mo133256l() <= 1) {
                                return false;
                            }
                            return true;
                        } else if ("/core/copy".equals(uri.getPath())) {
                            String queryParameter8 = uri.getQueryParameter("value");
                            if (!TextUtils.isEmpty(queryParameter8)) {
                                try {
                                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", C57814c.m224352c(queryParameter8)));
                                } catch (Exception e4) {
                                    Log.m165385e("RouterUtil", "Copy failed", e4, true);
                                }
                                LKUIToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        C24258a v = C44134a.m174959a().mo133266v();
        if (v != null) {
            return v.mo86896b(context, uri.toString(), null);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m176569b(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        C44134a.m174959a().mo133181A().mo143221a(context, str);
        return true;
    }

    /* renamed from: a */
    public static boolean m176556a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        C44134a.m174959a().mo133257m().mo133351b(context, str);
        return true;
    }

    /* renamed from: b */
    public static boolean m176570b(Context context, String str, String str2) {
        return m176562a(context, str, str2, true);
    }

    /* renamed from: b */
    public static void m176565b(Context context, String str, int i) {
        C44134a.m174959a().mo133261q().mo133328a(context, str, i);
    }

    /* renamed from: c */
    private static boolean m176574c(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        C44134a.m174959a().mo133261q().mo133329a(context, str, str2);
        return true;
    }

    /* renamed from: d */
    private static boolean m176579d(final Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        C44134a.m174959a().mo133221a(C44134a.m174959a().mo133257m().mo133350b(), str, str2, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.main.router.C44508c.C445102 */

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("RouterUtil", "openHelpDeskById getChatId success");
                C44134a.m174959a().mo133261q().mo133327a(context, str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("RouterUtil", "openHelpDeskById getOnCallChatId error:" + errorResult.toString());
            }
        });
        return true;
    }

    /* renamed from: e */
    private static boolean m176583e(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C44134a.m174959a().mo133227a(context, str, str2);
    }

    /* renamed from: a */
    private static void m176552a(Context context, Uri uri, Bundle bundle) {
        if ("/web".equals(uri.getPath())) {
            String queryParameter = uri.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && queryParameter.contains("/suite/passport/sdk/oauth")) {
                String string = bundle.getString("extra_calling_activity_package_name");
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString("package_id", string);
                }
                String string2 = bundle.getString("extra_calling_activity_class_name");
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("class_name", string2);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getCallingActivity() != null) {
                        String packageName = activity.getCallingActivity().getPackageName();
                        String className = activity.getCallingActivity().getClassName();
                        bundle.putString("package_id", packageName);
                        bundle.putString("class_name", className);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m176567b(Context context, Uri uri, Bundle bundle) {
        if (!TextUtils.isEmpty(uri.getPath()) && "/lkp/qrcode".equals(uri.getPath())) {
            return C44134a.m174959a().mo133205Y().mo133306a(context, bundle);
        }
        C24258a v = C44134a.m174959a().mo133266v();
        if (v != null) {
            return v.mo86896b(context, uri.toString(), null);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m176572c(Context context, Uri uri, boolean z, Bundle bundle) {
        m176552a(context, uri, bundle);
        if (!DesktopUtil.m144301a(context)) {
            return m176577d(context, uri, z, bundle);
        }
        return m176581e(context, uri, z, bundle);
    }

    /* renamed from: e */
    private static boolean m176581e(Context context, Uri uri, boolean z, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("uri_lkp", uri);
        bundle.putBoolean("internal_lkp", z);
        C57858o.m224559a(MainActivity.class).mo196050a(335544320).mo196055a("bundle_lkp", bundle).mo196064a(context);
        return true;
    }

    /* renamed from: d */
    public static boolean m176577d(Context context, Uri uri, boolean z, Bundle bundle) {
        if (!C44134a.m174959a().mo133238b(context, uri, false)) {
            return m176585f(context, uri, z, bundle);
        }
        int l = C44134a.m174959a().mo133256l();
        if (!C44134a.m174959a().mo133228a(uri) || l > 1) {
            C44134a.m174959a().mo133225a(context, uri, false);
        } else {
            C57858o.m224559a(MainActivity.class).mo196050a(335544320).mo196056a("extra_uri_from_link", uri).mo196064a(context);
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m176585f(Context context, Uri uri, boolean z, Bundle bundle) {
        Log.m165389i("RouterUtil", "uriRoute uri: " + uri.toString());
        if ("/web".equals(uri.getPath())) {
            String queryParameter = uri.getQueryParameter("url");
            String queryParameter2 = uri.getQueryParameter("app_id");
            if (TextUtils.isEmpty(queryParameter) || !queryParameter.contains("/suite/passport/sdk/oauth")) {
                return m176562a(context, queryParameter, queryParameter2, z);
            }
            return m176558a(context, queryParameter, bundle);
        } else if (C44134a.m174959a().mo133229a(uri, context) || m176554a(context, uri)) {
            return true;
        } else {
            if ("mailto".equals(uri.getScheme())) {
                C44134a.m174959a().mo133249e(context, uri.toString().replace("mailto:", ""));
                return true;
            } else if (m176567b(context, uri, bundle)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: b */
    public static boolean m176568b(Context context, Uri uri, boolean z, Bundle bundle) {
        m176552a(context, uri, bundle);
        if (uri == null) {
            return false;
        }
        if (C44134a.m174959a().mo133238b(context, uri, true) && C44134a.m174959a().mo133225a(context, uri, true)) {
            Log.m165389i("RouterUtil", "appLink handle block login");
            return true;
        } else if (m176571c(context, uri)) {
            return true;
        } else {
            CollectionsKt.removeAll(OnPostLaunchActionRegistry.f112857a, $$Lambda$c$aAKpIz4EOtgeChpyORzE68f7mM.INSTANCE);
            OnPostLaunchActionRegistry.m176546a(new OpenUriPostLaunchAction(uri, z, bundle));
            Log.m165383e("RouterUtil", "User does not login in SplashActivity");
            C44134a.m174959a().mo133257m().mo133341a(context);
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m176555a(Context context, Uri uri, boolean z, Bundle bundle) {
        if (uri == null) {
            return false;
        }
        if (!C44134a.m174959a().mo133257m().mo133348a()) {
            return m176568b(context, uri, z, bundle);
        }
        return m176572c(context, uri, z, bundle);
    }
}
