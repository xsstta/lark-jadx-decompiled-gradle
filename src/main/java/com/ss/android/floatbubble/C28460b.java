package com.ss.android.floatbubble;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.util.RomUtils;
import com.ss.android.floatbubble.util.p1318a.C28466a;
import com.ss.android.floatbubble.util.p1320c.C28470a;
import com.ss.android.floatbubble.util.p1321d.C28471a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.floatbubble.b */
public class C28460b {

    /* renamed from: com.ss.android.floatbubble.b$a */
    public interface AbstractC28463a {
        /* renamed from: a */
        void mo101330a();
    }

    /* renamed from: com.ss.android.floatbubble.b$b */
    public static class C28464b {

        /* renamed from: a */
        String f71599a;

        /* renamed from: b */
        String f71600b;

        /* renamed from: c */
        AbstractC28463a f71601c;

        /* renamed from: a */
        public C28464b mo101331a(String str) {
            this.f71599a = str;
            return this;
        }

        /* renamed from: b */
        public C28464b mo101332b(String str) {
            this.f71600b = str;
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m104296a(Context context) {
        boolean z;
        if (context == null) {
            z = false;
        } else if (Build.VERSION.SDK_INT < 23) {
            if (RomUtils.m104301a()) {
                z = C28471a.m104333a(context);
            } else {
                z = true;
            }
        } else if (RomUtils.m104304d()) {
            z = C28470a.m104325a(context);
        } else {
            z = Settings.canDrawOverlays(context);
        }
        Log.m165389i("VideoChat_FloatBubblePermission", "isGranted : " + z);
        return z;
    }

    /* renamed from: a */
    public static void m104295a(Application application) {
        Log.m165389i("VideoChat_FloatBubblePermission", "goToSettingPage");
        try {
            if (Build.VERSION.SDK_INT < 23) {
                if (RomUtils.m104301a()) {
                    C28471a.m104332a(application);
                    return;
                }
            } else if (RomUtils.m104302b() && Build.VERSION.SDK_INT == 23) {
                C28466a.m104308a(application);
                return;
            } else if (RomUtils.m104304d()) {
                C28470a.m104327b(application);
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + application.getPackageName()));
            intent.setFlags(268435456);
            if (intent.resolveActivity(application.getPackageManager()) != null) {
                application.startActivity(intent);
            } else {
                Log.m165383e("VideoChat_FloatBubblePermission", "permission setting page not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m104294a(final Activity activity, final C28464b bVar) {
        if (activity != null && !activity.isFinishing()) {
            Log.m165389i("VideoChat_FloatBubblePermission", "requestFloatPermission");
            final Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(1);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setContentView(R.layout.request_float_dialog);
                TextView textView = (TextView) window.findViewById(R.id.float_dialog_title);
                TextView textView2 = (TextView) window.findViewById(R.id.float_dialog_prompt);
                ((TextView) window.findViewById(R.id.float_dialog_start)).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.floatbubble.C28460b.View$OnClickListenerC284611 */

                    public void onClick(View view) {
                        dialog.dismiss();
                        C28460b.m104295a(activity.getApplication());
                    }
                });
                ((TextView) window.findViewById(R.id.float_dialog_cancel)).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.floatbubble.C28460b.View$OnClickListenerC284622 */

                    public void onClick(View view) {
                        dialog.dismiss();
                        C28464b bVar = bVar;
                        if (bVar != null && bVar.f71601c != null) {
                            bVar.f71601c.mo101330a();
                        }
                    }
                });
                dialog.setCanceledOnTouchOutside(false);
                try {
                    if (!activity.isFinishing()) {
                        dialog.show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
