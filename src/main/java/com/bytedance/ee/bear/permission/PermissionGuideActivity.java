package com.bytedance.ee.bear.permission;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.permission.AbstractBinderC10473a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PermissionGuideActivity extends Activity {

    /* renamed from: a */
    IBinder f28165a;

    /* renamed from: b */
    public String f28166b;

    /* renamed from: c */
    private C10476c f28167c;

    /* renamed from: d */
    private String[] f28168d;

    /* renamed from: e */
    private HashMap<String, String> f28169e;

    /* renamed from: f */
    private boolean f28170f;

    /* renamed from: g */
    private Dialog f28171g;

    /* access modifiers changed from: protected */
    public void onStop() {
        m43450a(this);
    }

    /* renamed from: a */
    public void mo39782a() {
        super.onStop();
        C13479a.m54772d("PermissionCheck", "PermissionGuideActivity onStop");
    }

    public void finish() {
        mo39783a(new AbstractBinderC10473a.C10474a(-1, this.f28166b));
        super.finish();
    }

    public void onResume() {
        super.onResume();
        C13479a.m54772d("PermissionCheck", "PermissionGuideActivity onResume");
        String[] strArr = this.f28168d;
        if (strArr != null && !this.f28167c.mo39801a((Context) this, strArr)) {
            Dialog dialog = this.f28171g;
            if (dialog == null || !dialog.isShowing()) {
                this.f28167c.mo39800a((Activity) this, this.f28168d);
            }
        }
    }

    /* renamed from: b */
    private void m43452b() {
        C13479a.m54772d("PermissionCheck", "PermissionGuideActivity init: ");
        this.f28167c = new C10476c();
        try {
            Bundle a = m43448a(getIntent(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f28165a = ((BinderParcelable) a.getParcelable("callback")).mo39775a();
            this.f28166b = a.getString(C10477d.f28182d);
            this.f28168d = a.getStringArray(C10477d.f28179a);
            this.f28169e = (HashMap) a.getSerializable(C10477d.f28180b);
            this.f28170f = a.getBoolean(C10477d.f28181c);
        } catch (Exception e) {
            C13479a.m54759a("PermissionCheck", "PermissionGuideActivity init: ", e);
            finish();
        }
    }

    /* renamed from: c */
    private void m43453c() {
        Dialog dialog;
        HashMap<String, String> hashMap = this.f28169e;
        if (hashMap == null || hashMap.size() == 0 || ((dialog = this.f28171g) != null && dialog.isShowing())) {
            C13479a.m54764b("PermissionCheck", "showPermissionDenyDialog(), permission map is empty or dialog is showing");
            finish();
            return;
        }
        String d = m43454d();
        if (TextUtils.isEmpty(d)) {
            finish();
            return;
        }
        String a = C10539a.m43639a(this, R.string.Doc_Permission_NoPermissionTitle, "permissions", d);
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("larkAppName", getString(R.string.Lark_App_Name));
        hashMap2.put("permissions", d);
        this.f28171g = new C25639g(this).mo89237b(a).mo89238b(true).mo89249h(17).mo89223a(20, 24, 20, 0).mo89242c(C10539a.m43640a(this, R.string.Doc_Permission_NoPermissionMessage, hashMap2)).mo89255n(17).mo89235b(20, 24, 20, 25).mo89245d(0.3f).mo89257p(17).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_right, R.string.Doc_Permission_Settings, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.permission.PermissionGuideActivity.DialogInterface$OnClickListenerC104723 */

            public void onClick(DialogInterface dialogInterface, int i) {
                PermissionGuideActivity.m43449a((Context) PermissionGuideActivity.this);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Doc_Permission_Cancel, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.permission.PermissionGuideActivity.DialogInterface$OnClickListenerC104712 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo89227a(new DialogInterface.OnDismissListener() {
            /* class com.bytedance.ee.bear.permission.PermissionGuideActivity.DialogInterface$OnDismissListenerC104701 */

            public void onDismiss(DialogInterface dialogInterface) {
                PermissionGuideActivity permissionGuideActivity = PermissionGuideActivity.this;
                permissionGuideActivity.mo39783a(new AbstractBinderC10473a.C10474a(201, permissionGuideActivity.f28166b));
                PermissionGuideActivity.this.finish();
            }
        }).mo89239c();
        mo39783a(new AbstractBinderC10473a.C10474a(LocationRequest.PRIORITY_HD_ACCURACY, this.f28166b));
    }

    /* renamed from: d */
    private String m43454d() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 23) {
            arrayList.addAll(this.f28169e.values());
        } else {
            for (Map.Entry<String, String> entry : this.f28169e.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(entry.getValue()) && !shouldShowRequestPermissionRationale(key)) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        if (arrayList.size() == 0) {
            C13479a.m54764b("PermissionCheck", "getDenyPermissionName(), denyPermission size == 0");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) {
                sb.append((String) arrayList.get(i));
            } else {
                sb.append((String) arrayList.get(i));
                sb.append("、");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(201326592);
        m43452b();
    }

    /* renamed from: a */
    public static void m43449a(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e) {
            C13479a.m54758a("PermissionCheck", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m43450a(PermissionGuideActivity permissionGuideActivity) {
        permissionGuideActivity.mo39782a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PermissionGuideActivity permissionGuideActivity2 = permissionGuideActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    permissionGuideActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo39783a(AbstractBinderC10473a.C10474a aVar) {
        IBinder iBinder = this.f28165a;
        if (iBinder != null && iBinder.isBinderAlive()) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.os.IBinder");
            obtain.writeInt(aVar.mo39794a());
            obtain.writeString(aVar.mo39795b());
            try {
                this.f28165a.transact(2, obtain, obtain2, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* renamed from: a */
    public static Bundle m43448a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* renamed from: a */
    private void m43451a(String[] strArr, int[] iArr) {
        C13479a.m54772d("PermissionCheck", "PermissionGuideActivity PERMISSIONS=" + strArr.toString() + " GRANTRESULTS=" + iArr.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        m43451a(strArr, iArr);
        C10476c cVar = this.f28167c;
        if (i != 1) {
            return;
        }
        if (cVar.mo39801a((Context) this, this.f28168d)) {
            mo39783a(new AbstractBinderC10473a.C10474a(100, this.f28166b));
            finish();
            C13479a.m54772d("PermissionCheck", "PermissionGuideActivity onRequestPermissionsResult: PERMISSION ALLOW");
            return;
        }
        C13479a.m54772d("PermissionCheck", "PermissionGuideActivity onRequestPermissionsResult: PERMISSION DENY");
        mo39783a(new AbstractBinderC10473a.C10474a(101, this.f28166b));
        if (this.f28170f) {
            m43453c();
        } else {
            finish();
        }
    }
}
