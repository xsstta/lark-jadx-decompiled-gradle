package com.huawei.hms.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.EnableServiceActivity;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.common.ErrorDialogFragment;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.common.api.AvailabilityException;
import com.huawei.hms.common.api.HuaweiApiCallable;
import com.huawei.hms.common.internal.ConnectionErrorMessages;
import com.huawei.hms.common.internal.DialogRedirect;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.HMSPublishStateHolder;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.api.b */
public final class C23459b extends HuaweiApiAvailability {

    /* renamed from: b */
    private static final C23459b f57864b = new C23459b();

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i, PendingIntent pendingIntent) {
        if (i == 0) {
            return false;
        }
        return pendingIntent != null || i == 1 || i == 2 || i == 6;
    }

    private C23459b() {
    }

    public static C23459b getInstance() {
        return f57864b;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i) {
        return isUserResolvableError(i, null);
    }

    /* renamed from: a */
    protected static int m85086a(Activity activity) {
        if (m85087a((Context) activity) == 0 || Build.VERSION.SDK_INT < 16) {
            return 3;
        }
        return 0;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, HuaweiApiAvailability.getServicesVersionCode());
    }

    /* renamed from: a */
    private static int m85087a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public String getErrorString(int i) {
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getErrorString, errorCode: " + i);
        return ConnectionResult.m85043a(i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileNoticeAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(new PackageManagerHelper(context).getPackageStates(HMSPackageManager.getInstance(context).getHMSPackageName()))) {
            return 1;
        }
        if (HMSPackageManager.getInstance(context).isApkUpdateNecessary(20600000)) {
            return 2;
        }
        return 0;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public AbstractC23432f<Void> getHuaweiServicesReady(Activity activity) {
        Preconditions.checkNotNull(activity);
        C23433g[] gVarArr = {new C23433g()};
        AbstractC23432f<Void> a = gVarArr[0].mo81844a();
        int isHuaweiMobileServicesAvailable = isHuaweiMobileServicesAvailable(activity.getApplicationContext(), 30000000);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, isHuaweiMobileServicesAvailable);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, ResolutionDelegate.class.getName());
        if (resolveErrorIntent != null) {
            ForegroundIntentBuilder.registerResponseCallback(ResolutionDelegate.CALLBACK_METHOD, new C23460a(this, gVarArr));
            Bundle bundle = new Bundle();
            bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, resolveErrorIntent);
            intentStartBridgeActivity.putExtras(bundle);
            activity.startActivity(intentStartBridgeActivity);
        } else if (isHuaweiMobileServicesAvailable == 3) {
            Intent intent = new Intent();
            intent.setClass(activity, EnableServiceActivity.class);
            activity.startActivity(intent);
        } else if (isHuaweiMobileServicesAvailable == 0) {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "The HMS service is available.");
        } else {
            HMSLog.m86964e("HuaweiApiAvailabilityImpl", "Framework can not solve the availability problem.");
            gVarArr[0].mo81845a((Exception) new AvailabilityException());
        }
        return a;
    }

    /* renamed from: a */
    private void m85093a(Object obj) throws AvailabilityException {
        ConnectionResult connectionResult;
        AvailabilityException availabilityException = new AvailabilityException();
        if (obj instanceof HuaweiApi) {
            connectionResult = availabilityException.getConnectionResult((HuaweiApi) obj);
        } else {
            connectionResult = availabilityException.getConnectionResult((HuaweiApiCallable) obj);
        }
        if (connectionResult.getErrorCode() != 0) {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "The service is unavailable: " + availabilityException.getMessage());
            throw availabilityException;
        }
    }

    /* renamed from: com.huawei.hms.api.b$a */
    class C23460a implements BusResponseCallback {

        /* renamed from: a */
        final /* synthetic */ C23433g[] f57865a;

        C23460a(C23459b bVar, C23433g[] gVarArr) {
            this.f57865a = gVarArr;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult succeedReturn(Activity activity, int i, Intent intent) {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Test foreground bus success: resultCode " + i + ", data" + intent);
            return null;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult innerError(Activity activity, int i, String str) {
            HMSLog.m86964e("HuaweiApiAvailabilityImpl", "Test foreground bus error: resultCode " + i + ", errMessage" + str);
            this.f57865a[0].mo81845a((Exception) new AvailabilityException());
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m85090a(Activity activity, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(activity, str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        return mo82099b(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void popupErrNotification(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        showErrorNotification(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i);
    }

    /* renamed from: b */
    public PendingIntent mo82099b(Context context, int i) {
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i);
        Intent a = mo82098a(context, i);
        if (a != null) {
            return PendingIntent.getActivity(context, 0, a, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public AbstractC23432f<Void> checkApiAccessible(HuaweiApi<?> huaweiApi, HuaweiApi<?>... huaweiApiArr) {
        AbstractC23432f<Void> a = new C23433g().mo81844a();
        if (huaweiApi != null) {
            try {
                m85093a(huaweiApi);
            } catch (AvailabilityException e) {
                HMSLog.m86966i("HuaweiApiAvailabilityImpl", "checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiArr != null) {
            for (HuaweiApi<?> huaweiApi2 : huaweiApiArr) {
                m85093a(huaweiApi2);
            }
        }
        return a;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getResolveErrorPendingIntent(Activity activity, int i) {
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(activity, 0, resolveErrorIntent, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void showErrorNotification(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter showErrorNotification, errorCode: " + i);
        Dialog errorDialog = getErrorDialog((Activity) context, i, 0);
        if (errorDialog == null) {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "showErrorNotification errorDialog can not be null");
        } else {
            errorDialog.show();
        }
    }

    /* renamed from: a */
    private Intent m85089a(Activity activity, int i) {
        if (!Util.isAvailableLibExist(activity.getApplicationContext())) {
            return null;
        }
        if (i == 1 || i == 2) {
            return UpdateManager.startUpdateIntent(activity);
        }
        if (i != 6) {
            return null;
        }
        return BridgeActivity.getIntentStartBridgeActivity(activity, BindingFailedResolution.class.getName());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public AbstractC23432f<Void> checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr) {
        AbstractC23432f<Void> a = new C23433g().mo81844a();
        if (huaweiApiCallable != null) {
            try {
                m85093a(huaweiApiCallable);
            } catch (AvailabilityException e) {
                HMSLog.m86966i("HuaweiApiAvailabilityImpl", "HuaweiApiCallable checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiCallableArr != null) {
            for (HuaweiApiCallable huaweiApiCallable2 : huaweiApiCallableArr) {
                m85093a(huaweiApiCallable2);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static Intent m85091a(Context context, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(context, str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Intent getResolveErrorIntent(Activity activity, int i) {
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorIntent, errorCode: " + i);
        if (!Util.isAvailableLibExist(activity.getApplicationContext())) {
            return null;
        }
        if (i == 1 || i == 2) {
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            if (HMSPublishStateHolder.getPublishState() == 0) {
                updateBean.setClientPackageName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
            } else if (HMSPublishStateHolder.getPublishState() == 1) {
                updateBean.setClientPackageName(PackageConstants.SERVICES_PACKAGE_ALL_SCENE);
            } else {
                updateBean.setClientPackageName("com.huawei.hwid");
            }
            updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
            updateBean.setClientAppId("C10132067");
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(activity.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
            return UpdateManager.getStartUpdateIntent(activity, updateBean);
        } else if (i != 6) {
            return null;
        } else {
            return m85090a(activity, BindingFailedResolution.class.getName());
        }
    }

    /* renamed from: a */
    public Intent mo82098a(Context context, int i) {
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorIntent, errorCode: " + i);
        if (i == 1 || i == 2) {
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            if (HMSPublishStateHolder.getPublishState() == 0) {
                updateBean.setClientPackageName(HMSPackageManager.getInstance(context.getApplicationContext()).getHMSPackageName());
            } else if (HMSPublishStateHolder.getPublishState() == 1) {
                updateBean.setClientPackageName(PackageConstants.SERVICES_PACKAGE_ALL_SCENE);
            } else {
                updateBean.setClientPackageName("com.huawei.hwid");
            }
            updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
            updateBean.setClientAppId("C10132067");
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
            return UpdateManager.getStartUpdateIntent(context, updateBean);
        } else if (i != 6) {
            return null;
        } else {
            return m85091a(context, BindingFailedResolution.class.getName());
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2) {
        resolveError(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, int i, int i2) {
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i + " requestCode: " + i2);
        Intent a = mo82098a(context, i);
        if (a != null) {
            return PendingIntent.getActivity(context, i2, a, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return getErrorDialog(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        m85092a(activity, errorDialog, HuaweiMobileServicesUtil.HMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    private static Dialog m85088a(Activity activity, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, m85086a(activity));
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        builder.setPositiveButton(ConnectionErrorMessages.getErrorDialogButtonMessage(activity, i), dialogRedirect);
        String errorTitle = ConnectionErrorMessages.getErrorTitle(activity, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return m85088a(activity, i, DialogRedirect.getInstance(activity, m85089a(activity, i), i2), onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2, PendingIntent pendingIntent) {
        Checker.checkNonNull(activity, "activity must not be null.");
        if (pendingIntent != null) {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter resolveError, param pendingIntent is not null. and.errorCode: " + i);
        } else {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "Enter resolveError, param pendingIntent is  null. get pendingIntent from error code.and.errorCode: " + i);
            pendingIntent = getResolveErrorPendingIntent(activity, i);
        }
        if (pendingIntent != null) {
            HMSLog.m86966i("HuaweiApiAvailabilityImpl", "In resolveError, start pingding intent.errorCode: " + i);
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                HMSLog.m86964e("HuaweiApiAvailabilityImpl", "Enter resolveError, start pendingIntent failed.errorCode: " + i);
            }
        }
    }

    /* renamed from: a */
    private static void m85092a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(activity, i, i2, onCancelListener);
    }
}
