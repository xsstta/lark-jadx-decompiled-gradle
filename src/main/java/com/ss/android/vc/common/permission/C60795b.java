package com.ss.android.vc.common.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.common.permission.b */
public class C60795b {

    /* renamed from: a */
    private static AbstractC60798c f152004a = null;

    /* renamed from: b */
    private static String f152005b = "";

    /* renamed from: com.ss.android.vc.common.permission.b$a */
    public interface AbstractC60797a extends ActivityCompat.OnRequestPermissionsResultCallback {
        /* renamed from: a */
        void mo208275a(int i, List<String> list);

        /* renamed from: b */
        void mo208277b(int i, List<String> list);
    }

    /* renamed from: b */
    public static void m236298b() {
        f152004a = null;
    }

    /* renamed from: a */
    public static String m236288a() {
        return f152005b;
    }

    /* renamed from: a */
    private static Activity m236287a(Object obj) {
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getActivity();
        }
        if (obj instanceof android.app.Fragment) {
            return ((android.app.Fragment) obj).getActivity();
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m236301c(Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static void m236299b(Object obj) {
        boolean z;
        boolean z2 = obj instanceof Activity;
        boolean z3 = obj instanceof Fragment;
        boolean z4 = obj instanceof android.app.Fragment;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        if (!z3 && !z2) {
            if (z4 && z) {
                return;
            }
            if (z4) {
                throw new IllegalArgumentException("Target SDK needs to be greater than 23 if caller is android.app.Fragment");
            }
            throw new IllegalArgumentException("Caller must be an Activity or a Fragment.");
        }
    }

    /* renamed from: b */
    private static boolean m236300b(Object obj, String str) {
        if (obj instanceof Activity) {
            try {
                return ActivityCompat.shouldShowRequestPermissionRationale((Activity) obj, str);
            } catch (Exception unused) {
                return false;
            }
        } else if (obj instanceof Fragment) {
            return ((Fragment) obj).shouldShowRequestPermissionRationale(str);
        } else {
            if (obj instanceof android.app.Fragment) {
                return ((android.app.Fragment) obj).shouldShowRequestPermissionRationale(str);
            }
            return false;
        }
    }

    /* renamed from: a */
    private static void m236292a(Object obj, int i) {
        Class<?> cls = obj.getClass();
        if (m236301c(obj)) {
            cls = cls.getSuperclass();
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(AfterPermissionGranted.class) && ((AfterPermissionGranted) method.getAnnotation(AfterPermissionGranted.class)).value() == i) {
                if (method.getParameterTypes().length <= 0) {
                    try {
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException e) {
                        C60700b.m235864f("EasyPermissions", "[runAnnotatedMethod]", "runDefaultMethod:IllegalAccessException" + e);
                    } catch (InvocationTargetException e2) {
                        C60700b.m235864f("EasyPermissions", "[runAnnotatedMethod2]", "runDefaultMethod:InvocationTargetException" + e2);
                    }
                } else {
                    throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m236295a(Context context, String str) {
        if (TextUtils.isEmpty(str) || Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
        } else if (PermissionChecker.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m236296a(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            C60700b.m235861e("EasyPermissions", "[hasPermissions]", " API version < M, returning true by default");
            return true;
        }
        if (!(strArr == null || strArr.length == 0)) {
            for (String str : strArr) {
                if (!m236295a(context, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m236297a(Object obj, String str) {
        C57744a a = C57744a.m224104a();
        if (!a.getBoolean("vc_permission_" + str, false) || m236300b(obj, str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236291a(AbstractC60798c cVar, DialogInterface dialogInterface, int i) {
        if (cVar != null) {
            cVar.permissionGranted(false);
        }
    }

    /* renamed from: a */
    public static void m236294a(Object obj, String[] strArr, int i) {
        m236299b(obj);
        if (obj instanceof Activity) {
            try {
                ActivityCompat.requestPermissions((Activity) obj, strArr, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).requestPermissions(strArr, i);
        } else if (obj instanceof android.app.Fragment) {
            ((android.app.Fragment) obj).requestPermissions(strArr, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236290a(Activity activity, AbstractC60798c cVar, DialogInterface dialogInterface, int i) {
        C60794a.m236285a(activity, 19991);
        f152004a = cVar;
    }

    /* renamed from: a */
    public static void m236289a(int i, String[] strArr, int[] iArr, Object... objArr) {
        AbstractC60798c cVar;
        boolean z;
        if (!(iArr == null || iArr.length <= 0 || (cVar = f152004a) == null)) {
            if (iArr[0] == 0) {
                z = true;
            } else {
                z = false;
            }
            cVar.permissionGranted(z);
            if (cVar == f152004a) {
                f152004a = null;
            }
        }
        if (!(strArr == null || strArr.length == 0)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                if (iArr[i2] == 0) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
            for (Object obj : objArr) {
                if (!arrayList.isEmpty() && (obj instanceof AbstractC60797a)) {
                    ((AbstractC60797a) obj).mo208275a(i, arrayList);
                }
                if (!arrayList2.isEmpty() && (obj instanceof AbstractC60797a)) {
                    ((AbstractC60797a) obj).mo208277b(i, arrayList2);
                }
                if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                    m236292a(obj, i);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m236293a(final Object obj, final String str, String str2, String str3, AbstractC60798c cVar) {
        Activity a = m236287a(obj);
        f152005b = str;
        if (a == null) {
            C60700b.m235851b("EasyPermissions", "[requestPermission]", "activity null");
            if (cVar != null) {
                cVar.permissionGranted(false);
            }
        } else {
            if (m236296a(a, str)) {
                C60700b.m235851b("EasyPermissions", "[requestPermission2]", "hasPermissions true");
                if (cVar != null) {
                    cVar.permissionGranted(true);
                }
            } else if (m236297a(obj, str)) {
                C60700b.m235851b("EasyPermissions", "[requestPermission3]", "permissionPermanentlyDenied true");
                if ("android.permission.CAMERA".equals(str)) {
                    str2 = ar.m236694a().getString(R.string.View_VM_AccessToCameraDenied);
                    str3 = UIHelper.mustacheFormat((int) R.string.View_VM_NeedsCameraAppNameBraces, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b());
                } else if ("android.permission.RECORD_AUDIO".equals(str)) {
                    str2 = ar.m236694a().getString(R.string.View_VM_AccessToMicDenied);
                    str3 = UIHelper.mustacheFormat((int) R.string.View_G_NeedsMicAppNameBraces, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b());
                }
                VCDialogUtils.m236216b((Context) a, str2, 2, str3, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.common.permission.$$Lambda$b$3zSGYIOwN71C2wuLjU0GAZYO8Hs */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C60795b.m236291a(AbstractC60798c.this, dialogInterface, i);
                    }
                }, (int) R.string.View_G_Settings, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(a, cVar) {
                    /* class com.ss.android.vc.common.permission.$$Lambda$b$2Or73HkhcJXjckrqLAPK26aaFJ8 */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ AbstractC60798c f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C60795b.m236290a(this.f$0, this.f$1, dialogInterface, i);
                    }
                }, false);
            } else {
                f152004a = cVar;
                C60735ab.m236018e(new Runnable() {
                    /* class com.ss.android.vc.common.permission.C60795b.RunnableC607961 */

                    public void run() {
                        C60700b.m235851b("EasyPermissions", "[requestPermission4]", "executePermissionsRequest");
                        C60795b.m236294a(obj, new String[]{str}, 16);
                    }
                });
            }
        }
        C57744a a2 = C57744a.m224104a();
        a2.putBoolean("vc_permission_" + str, true);
    }
}
