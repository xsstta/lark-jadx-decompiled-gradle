package com.ss.android.lark.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.utils.b */
public class C57805b {

    /* renamed from: com.ss.android.lark.utils.b$a */
    public interface AbstractC57809a {
        void permissionGranted(boolean z);
    }

    /* renamed from: a */
    public static void m224326a(Activity activity, AbstractC57809a aVar) {
        m224329a(activity, aVar, "android.permission.RECORD_AUDIO", (int) R.string.Lark_Legacy_NoAudioPermission, (int) R.string.Lark_Legacy_ApplyAudioPermission, false, 0);
    }

    /* renamed from: b */
    public static void m224331b(Activity activity, AbstractC57809a aVar) {
        m224328a(activity, aVar, "android.permission.CAMERA", R.string.Lark_Legacy_NoCameraPermission, R.string.Lark_Legacy_ApplyCameraPermission);
    }

    /* renamed from: c */
    public static void m224332c(Activity activity, AbstractC57809a aVar) {
        m224328a(activity, aVar, "android.permission.READ_CONTACTS", R.string.Lark_UserGrowth_InviteMemberImportContactsNoPermission, R.string.Lark_UserGrowth_InviteMemberImportContactsTip);
    }

    /* renamed from: d */
    public static void m224333d(Activity activity, AbstractC57809a aVar) {
        m224327a(activity, aVar, (int) R.string.Lark_Legacy_NoStoragePermission, (int) R.string.Lark_Legacy_ApplyStoragePermission, true, 2, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    public static void m224328a(Activity activity, AbstractC57809a aVar, String str, int i, int i2) {
        m224329a(activity, aVar, str, i, i2, true, 0);
    }

    /* renamed from: a */
    public static void m224329a(Activity activity, AbstractC57809a aVar, String str, int i, int i2, boolean z, int i3) {
        m224327a(activity, aVar, i, i2, z, i3, str);
    }

    /* renamed from: a */
    private static void m224327a(final Activity activity, final AbstractC57809a aVar, final int i, final int i2, final boolean z, final int i3, String... strArr) {
        if (activity == null) {
            Log.m165383e("AppPermission", "checkPermissions activity is null");
        } else if (activity.isDestroyed() || activity.isFinishing()) {
            Log.m165383e("AppPermission", "checkPermissions activity is destroyed or finishing");
        } else {
            C51331a aVar2 = new C51331a(activity);
            if (strArr.length > 0) {
                boolean z2 = false;
                final String str = strArr[0];
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z2 = true;
                        break;
                    }
                    String str2 = strArr[i4];
                    if (!aVar2.mo176921a(str2)) {
                        str = str2;
                        break;
                    }
                    i4++;
                }
                if (!z2) {
                    aVar2.mo176924c(strArr).subscribe(new Consumer<Boolean>() {
                        /* class com.ss.android.lark.utils.C57805b.C578061 */

                        /* renamed from: a */
                        public void accept(Boolean bool) {
                            if (!bool.booleanValue()) {
                                C57805b.m224330a(bool, activity, i, i2, str, i3, z, aVar);
                                return;
                            }
                            AbstractC57809a aVar = aVar;
                            if (aVar != null) {
                                aVar.permissionGranted(bool.booleanValue());
                            }
                        }
                    });
                } else if (aVar != null) {
                    aVar.permissionGranted(z2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m224330a(final Boolean bool, final Activity activity, final int i, final int i2, final String str, final int i3, final boolean z, final AbstractC57809a aVar) {
        new C25639g(activity).mo89237b(UIHelper.mustacheFormat(i)).mo89242c(UIHelper.mustacheFormat(i2)).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Settings, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.utils.C57805b.DialogInterface$OnClickListenerC578083 */

            public void onClick(DialogInterface dialogInterface, int i) {
                int i2;
                if (Build.VERSION.SDK_INT < 23 || !z || !activity.shouldShowRequestPermissionRationale(str) || (i2 = i3) >= 6) {
                    C26323w.m95322a(activity.getApplicationContext());
                    AbstractC57809a aVar = aVar;
                    if (aVar != null) {
                        aVar.permissionGranted(bool.booleanValue());
                        return;
                    }
                    return;
                }
                C57805b.m224329a(activity, aVar, str, i, i2, true, i2);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_LarkCancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.utils.C57805b.DialogInterface$OnClickListenerC578072 */

            public void onClick(DialogInterface dialogInterface, int i) {
                AbstractC57809a aVar = aVar;
                if (aVar != null) {
                    aVar.permissionGranted(bool.booleanValue());
                }
            }
        }).mo89239c();
    }
}
