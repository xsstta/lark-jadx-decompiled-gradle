package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.DragEvent;
import android.view.View;
import androidx.core.app.AbstractC0743j;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0898d;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends ContextCompat {
    private static AbstractC0712a sDelegate;

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.ActivityCompat$a */
    public interface AbstractC0712a {
        /* renamed from: a */
        boolean mo4062a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo4063a(Activity activity, String[] strArr, int i);
    }

    protected ActivityCompat() {
    }

    public static AbstractC0712a getPermissionCompatDelegate() {
        return sDelegate;
    }

    public static void setPermissionCompatDelegate(AbstractC0712a aVar) {
        sDelegate = aVar;
    }

    /* renamed from: androidx.core.app.ActivityCompat$b */
    private static class SharedElementCallbackC0713b extends SharedElementCallback {

        /* renamed from: a */
        private final AbstractC0743j f3012a;

        SharedElementCallbackC0713b(AbstractC0743j jVar) {
            this.f3012a = jVar;
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f3012a.mo4252a(list);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3012a.mo4251a(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f3012a.mo4255a(list, map);
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3012a.mo4250a(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f3012a.mo4256b(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f3012a.mo4254a(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3012a.mo4253a(list, list2, new AbstractC0743j.AbstractC0744a() {
                /* class androidx.core.app.ActivityCompat.SharedElementCallbackC0713b.C07141 */

                @Override // androidx.core.app.AbstractC0743j.AbstractC0744a
                /* renamed from: a */
                public void mo4071a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void finishAffinity(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void finishAfterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void postponeEnterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void startPostponedEnterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static void recreate(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C0731c.m3585a(activity)) {
            activity.recreate();
        }
    }

    public static Uri getReferrer(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static C0898d requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        return C0898d.m4340a(activity, dragEvent);
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static <T extends View> T requireViewById(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, AbstractC0743j jVar) {
        SharedElementCallbackC0713b bVar;
        if (Build.VERSION.SDK_INT >= 21) {
            if (jVar != null) {
                bVar = new SharedElementCallbackC0713b(jVar);
            } else {
                bVar = null;
            }
            activity.setEnterSharedElementCallback(bVar);
        }
    }

    public static void setExitSharedElementCallback(Activity activity, AbstractC0743j jVar) {
        SharedElementCallbackC0713b bVar;
        if (Build.VERSION.SDK_INT >= 21) {
            if (jVar != null) {
                bVar = new SharedElementCallbackC0713b(jVar);
            } else {
                bVar = null;
            }
            activity.setExitSharedElementCallback(bVar);
        }
    }

    public static void requestPermissions(final Activity activity, final String[] strArr, final int i) {
        AbstractC0712a aVar = sDelegate;
        if (aVar != null && aVar.mo4063a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class androidx.core.app.ActivityCompat.RunnableC07111 */

                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((OnRequestPermissionsResultCallback) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
