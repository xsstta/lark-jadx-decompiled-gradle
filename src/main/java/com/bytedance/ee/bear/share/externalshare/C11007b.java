package com.bytedance.ee.bear.share.externalshare;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.share.export.AbstractC11005b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13674e;
import com.bytedance.ee.util.io.C13681h;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.utils.ApiUtils;
import java.io.File;
import java.util.Collections;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.share.externalshare.b */
public class C11007b {
    /* renamed from: a */
    public static void m45861a(boolean z, Context context, ShareType shareType, String str, String str2, String str3) {
        if (m45864a(context, shareType)) {
            m45865a(z, context, new ShareEntity.C55696a(str, str2, str3).mo189768a(Collections.singletonList(m45852a(shareType))).mo189767a(OnIpcShareCallback.class).mo189769a());
        }
    }

    /* renamed from: a */
    public static void m45859a(boolean z, Context context, ShareType shareType, File file, AbstractC11005b bVar) {
        if (!m45864a(context, shareType)) {
            if (bVar != null) {
                bVar.mo42004a("App isn't installed.");
            }
        } else if (!C13674e.m55485b(file)) {
            if (bVar != null) {
                bVar.mo42004a("File isn't image type.");
            }
            C13479a.m54758a("ExternalShareHelper", "the file is not image type");
        } else {
            ShareEntity a = new ShareEntity.C55696a(file).mo189768a(Collections.singletonList(m45852a(shareType))).mo189767a(OnIpcShareCallback.class).mo189769a();
            if (bVar != null) {
                bVar.mo42003a();
            }
            m45865a(z, context, a);
        }
    }

    /* renamed from: a */
    public static void m45860a(boolean z, Context context, ShareType shareType, String str, AbstractC11005b bVar) {
        if (m45864a(context, shareType)) {
            boolean a = m45865a(z, context, new ShareEntity.C55696a(str).mo189768a(Collections.singletonList(m45852a(shareType))).mo189767a(OnIpcShareCallback.class).mo189769a());
            if (bVar == null) {
                return;
            }
            if (a) {
                bVar.mo42003a();
            } else {
                bVar.mo42004a(context.getResources().getString(R.string.Doc_Facade_OperateFailed));
            }
        } else if (bVar != null) {
            bVar.mo42004a("App not installed.");
        }
    }

    /* renamed from: a */
    public static void m45862a(boolean z, Context context, String str, String str2, int i, String str3, String str4) {
        if (m45864a(context, ShareType.Wechat)) {
            String a = WxMiniAppShareHelper.f29629a.mo42009a(i, str4);
            Bitmap a2 = WxMiniAppShareHelper.f29629a.mo42008a(context, i, str3);
            if (a2 == null) {
                C13479a.m54758a("ExternalShareHelper", "performSdkShareMiniApp()... bitmap is null");
            } else {
                m45865a(z, context, new ShareEntity.C55696a("gh_20e9bd4e2241", a, str, a2, str2).mo189768a(Collections.singletonList(ShareActionType.WX)).mo189767a(OnIpcShareCallback.class).mo189769a());
            }
        }
    }

    /* renamed from: a */
    private static boolean m45865a(boolean z, Context context, ShareEntity shareEntity) {
        if (z) {
            try {
                ((AbstractC11010e) KoinJavaComponent.m268610a(AbstractC11010e.class)).mo42007a(context, shareEntity);
                return true;
            } catch (Exception e) {
                Toast.showFailureText(context, context.getResources().getString(R.string.Doc_Facade_OperateFailed), 0);
                C13479a.m54758a("ExternalShareHelper", "performSdkShare fail, exception : " + e);
                return false;
            }
        } else {
            ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(context, shareEntity);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45864a(android.content.Context r3, com.bytedance.ee.bear.bizwidget.shareview.ShareType r4) {
        /*
            android.content.ComponentName r4 = com.bytedance.ee.bear.share.externalshare.ExternalShareSysConfig.m45867a(r4)
            r0 = 0
            if (r3 == 0) goto L_0x004f
            if (r4 != 0) goto L_0x000a
            goto L_0x004f
        L_0x000a:
            java.lang.String r4 = r4.getPackageName()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x003d
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ Exception -> 0x0026 }
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r0)     // Catch:{ Exception -> 0x0026 }
            if (r4 == 0) goto L_0x003d
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch:{ Exception -> 0x0026 }
            boolean r4 = r4.enabled     // Catch:{ Exception -> 0x0026 }
            if (r4 == 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x0026:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isInstalledApp()... error = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "ExternalShareHelper"
            com.bytedance.ee.log.C13479a.m54758a(r1, r4)
        L_0x003d:
            r4 = 0
        L_0x003e:
            if (r4 != 0) goto L_0x004e
            android.content.res.Resources r1 = r3.getResources()
            r2 = 2131826120(0x7f1115c8, float:1.9285115E38)
            java.lang.String r1 = r1.getString(r2)
            com.bytedance.ee.bear.facade.common.widget.Toast.showFailureText(r3, r1, r0)
        L_0x004e:
            return r4
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.share.externalshare.C11007b.m45864a(android.content.Context, com.bytedance.ee.bear.bizwidget.shareview.ShareType):boolean");
    }

    /* renamed from: a */
    public static boolean m45863a() {
        boolean z;
        try {
            z = ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).getDep().isGooglePlay();
        } catch (Exception e) {
            C13479a.m54758a("ExternalShareHelper", "ThirdShareModule should be initialized in Lark App. error = " + e);
            z = false;
        }
        C13479a.m54772d("ExternalShareHelper", "IsGooglePlay = " + z);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.share.externalshare.b$1 */
    public static /* synthetic */ class C110081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29626a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.bizwidget.shareview.ShareType[] r0 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.share.externalshare.C11007b.C110081.f29626a = r0
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Wechat     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.share.externalshare.C11007b.C110081.f29626a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.WechatMoments     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.share.externalshare.C11007b.C110081.f29626a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.QQ     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.share.externalshare.C11007b.C110081.f29626a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Weibo     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.share.externalshare.C11007b.C110081.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static ShareActionType m45852a(ShareType shareType) {
        int i = C110081.f29626a[shareType.ordinal()];
        if (i == 1) {
            return ShareActionType.WX;
        }
        if (i == 2) {
            return ShareActionType.WX_TIMELINE;
        }
        if (i == 3) {
            return ShareActionType.QQ;
        }
        if (i != 4) {
            return null;
        }
        return ShareActionType.WB;
    }

    /* renamed from: a */
    public static void m45854a(Context context) {
        if (m45864a(context, ShareType.Wechat)) {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.addFlags(268435456);
                intent.setComponent(componentName);
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                C13479a.m54758a("ExternalShareHelper", "jumpToWechat, error = " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m45853a(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            activity.startActivity(Intent.createChooser(intent, activity.getResources().getString(R.string.Doc_Facade_LinkShare)));
        } catch (Exception unused) {
            Toast.showFailureText(activity, activity.getResources().getString(R.string.Doc_Facade_OperateFailed), 0);
        }
    }

    /* renamed from: b */
    public static String m45866b(Context context, ShareType shareType) {
        int i = C110081.f29626a[shareType.ordinal()];
        if (i == 1) {
            return context.getResources().getString(R.string.Doc_Share_WeChat);
        }
        if (i == 2) {
            return context.getResources().getString(R.string.Doc_Share_Moments);
        }
        if (i == 3) {
            return context.getResources().getString(R.string.Doc_Share_QQ);
        }
        if (i != 4) {
            return null;
        }
        return context.getResources().getString(R.string.Doc_Share_Weibo);
    }

    /* renamed from: a */
    public static void m45857a(Context context, File file, AbstractC11005b bVar) {
        Uri a = C13681h.m55559a(context, file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", a);
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.Doc_Doc_SharePic)));
            if (bVar != null) {
                bVar.mo42003a();
            }
        } catch (Exception e) {
            if (bVar != null) {
                bVar.mo42004a("Share failed. msg: " + e.getMessage());
            }
            Toast.showFailureText(context, context.getString(R.string.Doc_Facade_OperateFailed), 0);
        }
    }

    /* renamed from: a */
    public static void m45858a(Context context, String str, AbstractC11005b bVar) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        try {
            context.startActivity(Intent.createChooser(intent, context.getResources().getString(R.string.Doc_Facade_Share)));
            if (bVar != null) {
                bVar.mo42003a();
            }
        } catch (Exception e) {
            if (bVar != null) {
                bVar.mo42004a("Share failed. msg: " + e.getMessage());
            }
            Toast.showFailureText(context, context.getString(R.string.Doc_Facade_OperateFailed), 0);
        }
    }

    /* renamed from: a */
    public static void m45856a(Context context, ShareType shareType, String str, AbstractC11005b bVar) {
        if (m45864a(context, shareType)) {
            Intent intent = new Intent();
            intent.setComponent(ExternalShareSysConfig.m45867a(shareType));
            intent.setAction("android.intent.action.SEND");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                String string = context.getResources().getString(R.string.Doc_Facade_OperateFailed);
                if (bVar != null) {
                    bVar.mo42004a(string);
                }
                Toast.showFailureText(context, string, 0);
            }
            if (bVar != null) {
                bVar.mo42003a();
            }
        } else if (bVar != null) {
            bVar.mo42004a("App not installed.");
        }
    }

    /* renamed from: a */
    public static void m45855a(Context context, ShareType shareType, File file, String str, AbstractC11005b bVar) {
        String str2;
        if (!m45864a(context, shareType)) {
            if (bVar != null) {
                bVar.mo42004a("App isn't installed.");
            }
        } else if (!C13674e.m55485b(file)) {
            if (bVar != null) {
                bVar.mo42004a("File isn't image type.");
            }
            C13479a.m54758a("ExternalShareHelper", "the file is not image type");
        } else {
            Intent intent = new Intent();
            intent.setComponent(ExternalShareSysConfig.m45867a(shareType));
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", C13681h.m55559a(context, file));
            if (TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                str2 = str;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("Kdescription", str);
            intent.setType("image/*");
            try {
                context.startActivity(intent);
                if (bVar != null) {
                    bVar.mo42003a();
                }
            } catch (Exception unused) {
                if (bVar != null) {
                    bVar.mo42004a("File isn't image type.");
                }
                Toast.showFailureText(context, context.getResources().getString(R.string.Doc_Facade_OperateFailed), 0);
            }
        }
    }
}
