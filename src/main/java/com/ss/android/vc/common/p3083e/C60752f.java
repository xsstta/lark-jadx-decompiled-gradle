package com.ss.android.vc.common.p3083e;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0003\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a.\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0016\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0016\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0016\u001a\n\u0010\u001d\u001a\u00020\u001e*\u00020\u0016\u001a\n\u0010\u001f\u001a\u00020 *\u00020\u0016\u001a\n\u0010!\u001a\u00020\"*\u00020\u0016\u001a\n\u0010#\u001a\u00020$*\u00020\u0016\u001a\n\u0010%\u001a\u00020&*\u00020\u0016\u001a\n\u0010'\u001a\u00020(*\u00020\u0016\u001a\n\u0010)\u001a\u00020**\u00020\u0016\u001a\n\u0010+\u001a\u00020,*\u00020\u0016\u001a\n\u0010-\u001a\u00020.*\u00020\u0016\u001a\n\u0010/\u001a\u000200*\u00020\u0016\u001a\n\u00101\u001a\u000202*\u00020\u0016\u001a\n\u00103\u001a\u000204*\u00020\u0016\u001a\n\u00105\u001a\u000206*\u00020\u0016\u001a\n\u00107\u001a\u000208*\u00020\u0016\u001a\n\u00109\u001a\u00020:*\u00020\u0016\u001a\n\u0010;\u001a\u00020<*\u00020\u0016\u001a\n\u0010=\u001a\u00020>*\u00020\u0016\u001a\n\u0010?\u001a\u00020@*\u00020\u0016\u001a\n\u0010A\u001a\u00020B*\u00020\u0016\u001a\n\u0010C\u001a\u00020D*\u00020\u0016\u001a\n\u0010E\u001a\u00020F*\u00020\u0016\u001a\n\u0010G\u001a\u00020H*\u00020\u0016\u001a\n\u0010I\u001a\u00020J*\u00020\u0016\u001a\n\u0010K\u001a\u00020L*\u00020\u0016\u001a\n\u0010M\u001a\u00020N*\u00020\u0016\u001a\n\u0010O\u001a\u00020P*\u00020\u0016\u001a\n\u0010Q\u001a\u00020R*\u00020\u0016\u001a\n\u0010S\u001a\u00020T*\u00020\u0016\u001a\n\u0010U\u001a\u00020V*\u00020\u0016\u001a\n\u0010W\u001a\u00020X*\u00020\u0016\u001a\n\u0010Y\u001a\u00020Z*\u00020\u0016\u001a\n\u0010[\u001a\u00020\\*\u00020\u0016\u001a\n\u0010]\u001a\u00020^*\u00020\u0016\u001a\n\u0010_\u001a\u00020`*\u00020\u0016\u001a\n\u0010a\u001a\u00020b*\u00020\u0016\u001a\n\u0010c\u001a\u00020d*\u00020\u0016\u001a\n\u0010e\u001a\u00020f*\u00020\u0016\u001a\n\u0010g\u001a\u00020h*\u00020\u0016\u001a\n\u0010i\u001a\u00020j*\u00020\u0016\u001a\n\u0010k\u001a\u00020l*\u00020\u0016\u001a\n\u0010m\u001a\u00020n*\u00020\u0016\u001a\n\u0010o\u001a\u00020p*\u00020\u0016\u001a\n\u0010q\u001a\u00020r*\u00020\u0016\u001a\n\u0010s\u001a\u00020t*\u00020\u0016\u001a\n\u0010u\u001a\u00020v*\u00020\u0016\u001a\n\u0010w\u001a\u00020\r*\u00020\u0011\u001a&\u0010x\u001a\u00020\u0001*\u00020y2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020z0\u000b¢\u0006\u0002\b\u000eH\b\u001a\u001d\u0010{\u001a\u0002H|\"\u0004\b\u0000\u0010|*\u00020\u00122\u0006\u0010}\u001a\u00020\u0001¢\u0006\u0002\u0010~\u001a\n\u0010\u001a\u00020\r*\u00020\u0011\u001a.\u0010\u0001\u001a\u00030\u0001*\u0005\u0018\u00010\u0001\u0002\u001c\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0002\u0010\u0000\u001a$\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u0005\u0018\u00010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0001H\b\u001a!\u0010\u0001\u001a\u00020\r\"\u0004\b\u0000\u0010|*\u00030\u00012\u0007\u0010\u0001\u001a\u0002H|¢\u0006\u0003\u0010\u0001\u001a \u0010\u0001\u001a\u00030\u0001*\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0001H\b\u001aK\u0010\u0001\u001a\u0005\u0018\u00010\u0001\"\t\b\u0000\u0010|*\u00030\u0001*\u0004\u0018\u0001H|2%\u0010\u0001\u001a \u0012\u0016\u0012\u0014H|¢\u0006\u000f\b\u0001\u0012\n\b\u0001\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020\r0\u000bH\b¢\u0006\u0003\u0010\u0001\u001a.\u0010\u0001\u001a\u00030\u0001*\u0005\u0018\u00010\u0001\u0002\u001c\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0000\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0002\u0010\u0000\u001a \u0010\u0001\u001a\u00030\u0001*\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0001H\b\u001a$\u0010\u0001\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\t\u001a!\u0010\u0001\u001a\u00020\r*\u00020\u00112\t\b\u0002\u0010\u0001\u001a\u00020\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u0001\u001a\u000b\u0010\u0001\u001a\u00020\r*\u00020\u0011\u001a\u000b\u0010\u0001\u001a\u00020\r*\u00020\u0011¨\u0006\u0001"}, d2 = {"addFragment", "", "Landroidx/appcompat/app/AppCompatActivity;", "frameId", "fragment", "Landroidx/fragment/app/Fragment;", "build", "Landroid/app/Notification;", "channelId", "", "func", "Lkotlin/Function1;", "Landroidx/core/app/NotificationCompat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "findFragment", "get", "Landroid/view/View;", "Landroid/view/ViewGroup;", "position", "getAccessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/content/Context;", "getAccountManager", "Landroid/accounts/AccountManager;", "getActivityManager", "Landroid/app/ActivityManager;", "getAlarmManager", "Landroid/app/AlarmManager;", "getAppOpsManager", "Landroid/app/AppOpsManager;", "getAppWidgetManager", "Landroid/appwidget/AppWidgetManager;", "getAudioManager", "Landroid/media/AudioManager;", "getBatteryManager", "Landroid/os/BatteryManager;", "getBluetoothManager", "Landroid/bluetooth/BluetoothManager;", "getCameraManager", "Landroid/hardware/camera2/CameraManager;", "getCaptioningManager", "Landroid/view/accessibility/CaptioningManager;", "getClipboardManager", "Landroid/content/ClipboardManager;", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getConsumerIrManager", "Landroid/hardware/ConsumerIrManager;", "getDevicePolicyManager", "Landroid/app/admin/DevicePolicyManager;", "getDisplayManager", "Landroid/hardware/display/DisplayManager;", "getDownloadManager", "Landroid/app/DownloadManager;", "getDropBoxManager", "Landroid/os/DropBoxManager;", "getInputManager", "Landroid/hardware/input/InputManager;", "getInputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getJobScheduler", "Landroid/app/job/JobScheduler;", "getKeyguardManager", "Landroid/app/KeyguardManager;", "getLauncherApps", "Landroid/content/pm/LauncherApps;", "getLayoutInflater", "Landroid/view/LayoutInflater;", "getLocationManager", "Landroid/location/LocationManager;", "getMediaProjectionManager", "Landroid/media/projection/MediaProjectionManager;", "getMediaRouter", "Landroid/media/MediaRouter;", "getMediaSessionManager", "Landroid/media/session/MediaSessionManager;", "getNfcManager", "Landroid/nfc/NfcManager;", "getNotificationManager", "Landroid/app/NotificationManager;", "getNsdManager", "Landroid/net/nsd/NsdManager;", "getPowerManager", "Landroid/os/PowerManager;", "getPrintManager", "Landroid/print/PrintManager;", "getRestrictionsManager", "Landroid/content/RestrictionsManager;", "getSearchManager", "Landroid/app/SearchManager;", "getSensorManager", "Landroid/hardware/SensorManager;", "getStorageManager", "Landroid/os/storage/StorageManager;", "getSubscriptionManager", "Landroid/telephony/SubscriptionManager;", "getTelecomManager", "Landroid/telecom/TelecomManager;", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getTextServicesManager", "Landroid/view/textservice/TextServicesManager;", "getTvInputManager", "Landroid/media/tv/TvInputManager;", "getUiModeManager", "Landroid/app/UiModeManager;", "getUsageStatsManager", "Landroid/app/usage/UsageStatsManager;", "getUsbManager", "Landroid/hardware/usb/UsbManager;", "getUserManager", "Landroid/os/UserManager;", "getVibrator", "Landroid/os/Vibrator;", "getWifiP2pManager", "Landroid/net/wifi/p2p/WifiP2pManager;", "getWindowManager", "Landroid/view/WindowManager;", "gone", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentTransaction;", "inflateHolder", "T", "layoutRes", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "invisible", "isNull", "", "", C13998f.f36682a, "Lkotlin/Function0;", "load", "Landroid/widget/ImageView;", "url", "(Landroid/widget/ImageView;Ljava/lang/Object;)V", "neg", "notNull", "Lkotlin/ParameterName;", "name", "it", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "pos", "replaceFragment", "tag", "setSize", "width", "height", "toggle", "visible", "lib_vc_suiteRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.e.f */
public final class C60752f {
    /* renamed from: a */
    public static final boolean m236080a(Object obj) {
        return obj == null;
    }

    /* renamed from: b */
    public static final boolean m236082b(Object obj) {
        return obj != null;
    }

    /* renamed from: b */
    public static final void m236081b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$invisible");
        view.setVisibility(4);
    }

    /* renamed from: c */
    public static final void m236083c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$gone");
        view.setVisibility(8);
    }

    /* renamed from: a */
    public static final void m236079a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$visible");
        view.setVisibility(0);
    }

    /* renamed from: a */
    public static final View m236078a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$get");
        View childAt = viewGroup.getChildAt(i);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(position)");
        return childAt;
    }

    /* renamed from: a */
    public static final int m236076a(AppCompatActivity appCompatActivity, int i, Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "$this$addFragment");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "beginTransaction()");
        FragmentTransaction add = beginTransaction.add(i, fragment);
        Intrinsics.checkExpressionValueIsNotNull(add, "add(frameId, fragment)");
        return add.commit();
    }

    /* renamed from: a */
    public static final int m236077a(AppCompatActivity appCompatActivity, int i, Fragment fragment, String str) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "$this$replaceFragment");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "beginTransaction()");
        FragmentTransaction replace = beginTransaction.replace(i, fragment, str);
        Intrinsics.checkExpressionValueIsNotNull(replace, "replace(frameId, fragment, tag)");
        return replace.commit();
    }
}
