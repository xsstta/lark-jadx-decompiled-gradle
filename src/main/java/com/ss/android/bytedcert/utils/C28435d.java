package com.ss.android.bytedcert.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.DialogInterfaceC0257a;
import androidx.core.app.ActivityCompat;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.activities.FaceLivePreActivity;
import com.ss.android.bytedcert.callback.AbstractC28335f;

/* renamed from: com.ss.android.bytedcert.utils.d */
public class C28435d {

    /* renamed from: a */
    public static AbstractC28335f f71517a;

    /* renamed from: a */
    public static boolean m104224a(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return C28440f.m104233b();
        }
        if (ActivityCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0 && ActivityCompat.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && ActivityCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m104222a(Activity activity, AbstractC28335f fVar) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (ActivityCompat.checkSelfPermission(activity, "android.permission.CAMERA") != 0 || ActivityCompat.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || ActivityCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    ActivityCompat.requestPermissions(activity, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 10);
                    f71517a = fVar;
                } else if (fVar != null) {
                    fVar.mo100837a();
                }
            } else if (!C28440f.m104233b()) {
                if (Build.VERSION.SDK_INT >= 17) {
                    m104223a(activity, activity.getString(R.string.byted_camera));
                }
                if (fVar != null) {
                    fVar.mo100838b();
                }
            } else if (fVar != null) {
                fVar.mo100837a();
            }
        } else if (fVar != null) {
            fVar.mo100838b();
        }
    }

    /* renamed from: a */
    public static void m104223a(final Context context, String str) {
        if (context != null) {
            DialogInterfaceC0257a.C0258a aVar = new DialogInterfaceC0257a.C0258a(context);
            aVar.mo923a(context.getString(R.string.byted_no_permission_visit) + str);
            aVar.mo927b(context.getString(R.string.byted_go_setting) + str + context.getString(R.string.byted_get_permission));
            aVar.mo925a(true);
            aVar.mo924a(context.getString(R.string.byted_goto_set), new DialogInterface.OnClickListener() {
                /* class com.ss.android.bytedcert.utils.C28435d.DialogInterface$OnClickListenerC284361 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (context != null) {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        intent.addFlags(268435456);
                        intent.addFlags(1073741824);
                        intent.addFlags(8388608);
                        context.startActivity(intent);
                    }
                    dialogInterface.dismiss();
                    Context context = context;
                    if (context instanceof FaceLivePreActivity) {
                        ((FaceLivePreActivity) context).mo100831a(true);
                    }
                }
            });
            aVar.mo928b(context.getString(R.string.byted_cancle), new DialogInterface.OnClickListener() {
                /* class com.ss.android.bytedcert.utils.C28435d.DialogInterface$OnClickListenerC284372 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    if (C28435d.f71517a != null) {
                        C28435d.f71517a.mo100838b();
                    }
                }
            });
            aVar.mo917a(new DialogInterface.OnCancelListener() {
                /* class com.ss.android.bytedcert.utils.C28435d.DialogInterface$OnCancelListenerC284383 */

                public void onCancel(DialogInterface dialogInterface) {
                    if (C28435d.f71517a != null) {
                        C28435d.f71517a.mo100838b();
                    }
                }
            });
            aVar.mo929b().show();
        }
    }

    /* renamed from: a */
    public static void m104221a(Activity activity, int i, String[] strArr, int[] iArr) {
        if (i == 10) {
            char c = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                } else if (iArr[i2] != 0) {
                    c = 65535;
                    if (Build.VERSION.SDK_INT > 17 && !ActivityCompat.shouldShowRequestPermissionRationale(activity, strArr[i2])) {
                        if (strArr[i2].equals("android.permission.READ_EXTERNAL_STORAGE")) {
                            m104223a(activity, activity.getString(R.string.byted_storage));
                        } else if (strArr[i2].equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            m104223a(activity, activity.getString(R.string.byted_storage));
                        } else if (strArr[i2].equals("android.permission.CAMERA")) {
                            m104223a(activity, activity.getString(R.string.byted_camera));
                        }
                        c = 65534;
                    }
                } else {
                    i2++;
                }
            }
            if (c != 65534) {
                if (c == 0) {
                    AbstractC28335f fVar = f71517a;
                    if (fVar != null) {
                        fVar.mo100837a();
                        return;
                    }
                    return;
                }
                AbstractC28335f fVar2 = f71517a;
                if (fVar2 != null) {
                    fVar2.mo100838b();
                }
            }
        }
    }
}
