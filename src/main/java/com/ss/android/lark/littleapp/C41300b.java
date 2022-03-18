package com.ss.android.lark.littleapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.entity.ChooseLocationModel;
import com.ss.android.lark.littleapp.entity.OpenUrlByLarkModel;
import com.ss.android.lark.littleapp.entity.OpenWebModel;
import com.ss.android.lark.littleapp.entity.ParseQRCodeModel;
import com.ss.android.lark.littleapp.entity.RouteDriveSDKModel;
import com.ss.android.lark.littleapp.entity.RouteFileDetailModel;
import com.ss.android.lark.littleapp.entity.RouteOpenCameraModel;
import com.ss.android.lark.littleapp.entity.RoutePhotoPickerModel;
import com.ss.android.lark.littleapp.entity.RouteProfileModel;
import com.ss.android.lark.littleapp.entity.RouteQRModel;
import com.ss.android.lark.littleapp.entity.RouteShareModel;
import com.ss.android.lark.littleapp.entity.RouterChooseChatModel;
import com.ss.android.lark.littleapp.entity.RouterShareAppModel;
import java.util.List;

/* renamed from: com.ss.android.lark.littleapp.b */
public class C41300b {
    /* renamed from: a */
    public static boolean m163752a(String str, Activity activity) {
        if (activity == null) {
            AppBrandLogger.m52828d("LarkNativeRouter", "parseQRCode failed, activity is null");
            return false;
        }
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        ParseQRCodeModel parseQRCodeModel = new ParseQRCodeModel();
        parseQRCodeModel.mo148818b(str);
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, parseQRCodeModel);
        return m163748a(a, activity);
    }

    /* renamed from: a */
    public static boolean m163750a(IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        AbstractC12888c i = C25529d.m91168i(iAppContext);
        Intent a = m163738a(currentActivity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        BaseRouteModel baseRouteModel = new BaseRouteModel();
        baseRouteModel.mo148767a("security_verify");
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, baseRouteModel);
        if (i != null) {
            try {
                i.startActivityForResult(a, 30004);
            } catch (ActivityNotFoundException e) {
                AppBrandLogger.m52829e("LarkNativeRouter", "startActivity fail: " + e);
                return false;
            }
        } else {
            currentActivity.startActivityForResult(a, 30004);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m163753a(String str, String str2, boolean z, Activity activity) {
        if (activity == null) {
            AppBrandLogger.m52828d("LarkNativeRouter", "startQRCodeActivity failed, activity is null");
            return false;
        }
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        RouteQRModel routeQRModel = new RouteQRModel();
        routeQRModel.mo148865b(str);
        routeQRModel.mo148867c(str2);
        routeQRModel.mo148863a(z);
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, routeQRModel);
        return m163748a(a, activity);
    }

    /* renamed from: a */
    public static boolean m163754a(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52828d("LarkNativeRouter", "startShareActivity failed, activity is null");
            return false;
        }
        Intent a = m163738a(currentActivity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        if (z) {
            a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new RouteShareModel(str2, str3, str4));
        } else {
            a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new RouterShareAppModel(str, str2, str4, str5, str5, !z2 ? "" : str5, str6, true));
        }
        try {
            AbstractC12888c i = C25529d.m91168i(iAppContext);
            if (i != null) {
                i.startActivityForResult(a, 20008);
            } else {
                currentActivity.startActivityForResult(a, 20008);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            AppBrandLogger.m52829e("LarkNativeRouter", "startActivity fail: " + e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m163748a(Intent intent, Activity activity) {
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            AppBrandLogger.m52829e("LarkNativeRouter", "startActivity fail: " + e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m163749a(Bundle bundle, IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52828d("LarkNativeRouter", "choose chat failed, activity is null");
            return false;
        }
        Intent a = m163738a(currentActivity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new RouterChooseChatModel(bundle));
        AbstractC12888c i = C25529d.m91168i(iAppContext);
        if (i != null) {
            i.startActivityForResult(a, 20009);
        } else {
            currentActivity.startActivityForResult(a, 20009);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m163751a(IAppContext iAppContext, String str, int i) {
        try {
            Activity currentActivity = iAppContext.getCurrentActivity();
            Intent a = m163738a(currentActivity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
            ChooseLocationModel chooseLocationModel = new ChooseLocationModel();
            chooseLocationModel.mo148785b(str);
            a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, chooseLocationModel);
            AbstractC12888c i2 = C25529d.m91168i(iAppContext);
            if (i2 != null) {
                i2.startActivityForResult(a, i);
                return true;
            }
            currentActivity.startActivityForResult(a, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m163746a(Activity activity, boolean z) {
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new RouteOpenCameraModel(z));
        if (m163747a(activity, a)) {
            AppBrandLogger.m52830i("LarkNativeRouter", "open Lark Camera");
            activity.startActivityForResult(a, 20010);
            return true;
        }
        AppBrandLogger.m52829e("LarkNativeRouter", "activity is not exist");
        return false;
    }

    /* renamed from: a */
    private static boolean m163747a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            return queryIntentActivities != null && !queryIntentActivities.isEmpty();
        } catch (Exception e) {
            AppBrandLogger.m52829e("LarkNativeRouter", e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static void m163739a(Activity activity) {
        if (activity != null) {
            Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
            BaseRouteModel baseRouteModel = new BaseRouteModel();
            baseRouteModel.mo148767a("about");
            a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, baseRouteModel);
            m163748a(a, activity);
            return;
        }
        AppBrandLogger.m52829e("LarkNativeRouter", "startLarkAboutActivity failed, activity is null");
    }

    /* renamed from: a */
    private static Intent m163738a(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(activity.getPackageName(), str));
        return intent;
    }

    /* renamed from: a */
    public static void m163740a(Context context, String str) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
            OpenUrlByLarkModel openUrlByLarkModel = new OpenUrlByLarkModel();
            openUrlByLarkModel.mo148804b(str);
            a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, openUrlByLarkModel);
            m163748a(a, activity);
            return;
        }
        AppBrandLogger.m52829e("LarkNativeRouter", "open url by lark failed, activity is null");
    }

    /* renamed from: a */
    public static void m163741a(String str, String str2, Activity activity) {
        if (activity == null) {
            AppBrandLogger.m52828d("LarkNativeRouter", "startProfileActivityByUserId failed, activity is null");
            return;
        }
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        RouteProfileModel routeProfileModel = new RouteProfileModel();
        routeProfileModel.mo148858c(str2);
        routeProfileModel.mo148856b(str);
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, routeProfileModel);
        m163748a(a, activity);
    }

    /* renamed from: a */
    public static boolean m163743a(Activity activity, String str, String str2) {
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        OpenWebModel openWebModel = new OpenWebModel();
        openWebModel.mo148810b(str);
        openWebModel.mo148812c(str2);
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, openWebModel);
        return m163748a(a, activity);
    }

    /* renamed from: a */
    public static boolean m163745a(Activity activity, String str, String str2, boolean z) {
        if (activity == null) {
            return false;
        }
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new RouteFileDetailModel(str, str2, z));
        return m163748a(a, activity);
    }

    /* renamed from: a */
    public static boolean m163742a(Activity activity, int i, boolean z, boolean z2, boolean z3) {
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        RoutePhotoPickerModel routePhotoPickerModel = new RoutePhotoPickerModel(i, z, z2, z3);
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, routePhotoPickerModel);
        if (m163747a(activity, a)) {
            AppBrandLogger.m52830i("LarkNativeRouter", "open Lark Photo Picker. model:" + routePhotoPickerModel);
            activity.startActivityForResult(a, 20014);
            return true;
        }
        AppBrandLogger.m52829e("LarkNativeRouter", "activity is not exist");
        return false;
    }

    /* renamed from: a */
    public static boolean m163744a(Activity activity, String str, String str2, String str3, boolean z) {
        if (activity == null) {
            return false;
        }
        Intent a = m163738a(activity, "com.ss.android.lark.littleapp.router.LittleAppRouterActivity");
        a.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new RouteDriveSDKModel(str, str2, str3, z));
        return m163748a(a, activity);
    }
}
