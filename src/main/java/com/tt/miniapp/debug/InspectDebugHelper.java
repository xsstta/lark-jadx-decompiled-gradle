package com.tt.miniapp.debug;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.C41343f;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\f\u001a\u00020\tJ\"\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0007J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tt/miniapp/debug/InspectDebugHelper;", "", "()V", "TAG", "", "appList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "canInspect", "", "applicationInspectDebugIsOpen", "appId", "inspectModeIsOpen", "setInspectDebugList", "", "list", "tryKillAllBrandProcess", "tryOpenInspectModeWindow", "activity", "Landroid/app/Activity;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.debug.b */
public final class InspectDebugHelper {

    /* renamed from: a */
    public static final InspectDebugHelper f166565a = new InspectDebugHelper();

    /* renamed from: b */
    private static ArrayList<String> f166566b;

    /* renamed from: c */
    private static boolean f166567c;

    private InspectDebugHelper() {
    }

    /* renamed from: a */
    public final boolean mo230982a() {
        return f166567c;
    }

    /* renamed from: b */
    public final void mo230984b() {
        Log.m165389i("InspectDebugHelper", "tryKillAllBrandProcess: canInspect--" + f166567c);
        if (f166567c) {
            new C41343f().mo148927c();
        }
    }

    /* renamed from: a */
    public final void mo230981a(ArrayList<String> arrayList) {
        Log.m165389i("InspectDebugHelper", "list is " + String.valueOf(arrayList));
        f166566b = arrayList;
        if (arrayList != null) {
            arrayList.isEmpty();
            f166567c = true;
            Log.m165389i("InspectDebugHelper", "inspect is open");
            return;
        }
        f166567c = false;
        Log.m165383e("InspectDebugHelper", "list is empty and can not open inspect");
    }

    /* renamed from: a */
    public final boolean mo230983a(String str) {
        String str2;
        if (!mo230982a()) {
            Log.m165389i("InspectDebugHelper", "can not inspect");
            return false;
        }
        Log.m165389i("InspectDebugHelper", "appId is --" + str);
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                ArrayList<String> arrayList = f166566b;
                if (arrayList != null) {
                    return arrayList.contains(str);
                }
                return false;
            }
        }
        Log.m165383e("InspectDebugHelper", "appId is null");
        return false;
    }

    /* renamed from: a */
    public final void mo230980a(Activity activity) {
        if (activity == null) {
            Log.m165383e("InspectDebugHelper", "activity is null");
            return;
        }
        TextView textView = new TextView(activity);
        textView.setText(activity.getResources().getText(R.string.Lark_OpenPlatform_DebuggingModeTtl));
        textView.setTextSize(10.0f);
        textView.setBackgroundColor(Color.parseColor("#88000000"));
        textView.setTextColor(activity.getResources().getColor(R.color.lkui_N00));
        textView.setPadding(20, 50, 20, 50);
        try {
            if (!activity.isDestroyed()) {
                if (!activity.isFinishing()) {
                    Object systemService = activity.getSystemService("window");
                    if (!(systemService instanceof WindowManager)) {
                        systemService = null;
                    }
                    WindowManager windowManager = (WindowManager) systemService;
                    if (windowManager != null) {
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.type = 2;
                        layoutParams.format = 1;
                        layoutParams.gravity = 49;
                        layoutParams.flags = 136;
                        windowManager.addView(textView, layoutParams);
                        return;
                    }
                    InspectDebugHelper bVar = this;
                    Log.m165383e("InspectDebugHelper", "windowManager is null");
                    return;
                }
            }
            Log.m165389i("InspectDebugHelper", "activity isDestroyed or isFinishing");
        } catch (Throwable th) {
            Log.m165386e("InspectDebugHelper", th);
        }
    }
}
