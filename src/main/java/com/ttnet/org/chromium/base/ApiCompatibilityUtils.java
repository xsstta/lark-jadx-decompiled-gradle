package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.UserManager;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodSubtype;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.widget.C0942e;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class ApiCompatibilityUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static int compareBoolean(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int compareLong(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    private static boolean isPasswordInputType(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    private ApiCompatibilityUtils() {
    }

    public static int getActivityNewDocumentFlag() {
        if (Build.VERSION.SDK_INT >= 21) {
        }
        return 524288;
    }

    public static boolean isElevationSupported() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static boolean isPrintingSupported() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }

    private static class LayerDrawableCompat extends LayerDrawable {
        private boolean mMutated;

        public Drawable mutate() {
            if (this.mMutated) {
                return this;
            }
            Rect[] layersBounds = ApiCompatibilityUtils.getLayersBounds(this);
            Drawable mutate = super.mutate();
            if (mutate != this) {
                return mutate;
            }
            ApiCompatibilityUtils.restoreLayersBounds(this, layersBounds);
            this.mMutated = true;
            return this;
        }

        LayerDrawableCompat(Drawable[] drawableArr) {
            super(drawableArr);
        }
    }

    private static class TransitionDrawableCompat extends TransitionDrawable {
        private boolean mMutated;

        public Drawable mutate() {
            if (this.mMutated) {
                return this;
            }
            Rect[] layersBounds = ApiCompatibilityUtils.getLayersBounds(this);
            Drawable mutate = super.mutate();
            if (mutate != this) {
                return mutate;
            }
            ApiCompatibilityUtils.restoreLayersBounds(this, layersBounds);
            this.mMutated = true;
            return this;
        }

        TransitionDrawableCompat(Drawable[] drawableArr) {
            super(drawableArr);
        }
    }

    private static class FinishAndRemoveTaskWithRetry implements Runnable {
        private final Activity mActivity;
        private int mTryCount;

        public void run() {
            this.mActivity.finishAndRemoveTask();
            this.mTryCount++;
            if (this.mActivity.isFinishing()) {
                return;
            }
            if (((long) this.mTryCount) < 3) {
                ThreadUtils.postOnUiThreadDelayed(this, 500);
            } else {
                this.mActivity.finish();
            }
        }

        FinishAndRemoveTaskWithRetry(Activity activity) {
            this.mActivity = activity;
        }
    }

    public static <T> T requireNonNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void disableSmartSelectionTextClassifier(TextView textView) {
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setTextClassifier(TextClassifier.NO_OP);
        }
    }

    public static void finishAfterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static byte[] getBytesUtf8(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 encoding not available.", e);
        }
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static String getLocale(InputMethodSubtype inputMethodSubtype) {
        if (Build.VERSION.SDK_INT >= 24) {
            return inputMethodSubtype.getLanguageTag();
        }
        return inputMethodSubtype.getLocale();
    }

    public static Uri getUriForDownloadedFile(File file) {
        if (Build.VERSION.SDK_INT > 23) {
            return FileUtils.getUriForFile(file);
        }
        return Uri.fromFile(file);
    }

    public static boolean isInMultiWindowMode(Activity activity) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return activity.isInMultiWindowMode();
    }

    public static void setWindowIndeterminateProgress(Window window) {
        if (Build.VERSION.SDK_INT < 21) {
            window.setFeatureInt(5, -2);
        }
    }

    public static Bundle createLaunchDisplayIdActivityOptions(int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        makeBasic.setLaunchDisplayId(i);
        return makeBasic.toBundle();
    }

    public static LayerDrawable createLayerDrawable(Drawable[] drawableArr) {
        if (Build.VERSION.SDK_INT <= 19) {
            return new LayerDrawableCompat(drawableArr);
        }
        return new LayerDrawable(drawableArr);
    }

    public static TransitionDrawable createTransitionDrawable(Drawable[] drawableArr) {
        if (Build.VERSION.SDK_INT <= 19) {
            return new TransitionDrawableCompat(drawableArr);
        }
        return new TransitionDrawable(drawableArr);
    }

    public static void finishAndRemoveTask(Activity activity) {
        if (Build.VERSION.SDK_INT > 21) {
            activity.finishAndRemoveTask();
        } else if (Build.VERSION.SDK_INT == 21) {
            new FinishAndRemoveTaskWithRetry(activity).run();
        } else {
            activity.finish();
        }
    }

    public static long getAvailableBlocks(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 19) {
            return statFs.getAvailableBlocksLong();
        }
        return (long) statFs.getAvailableBlocks();
    }

    public static long getBlockCount(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 19) {
            return statFs.getBlockCountLong();
        }
        return (long) statFs.getBlockCount();
    }

    public static long getBlockSize(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 19) {
            return statFs.getBlockSizeLong();
        }
        return (long) statFs.getBlockSize();
    }

    public static Rect[] getLayersBounds(LayerDrawable layerDrawable) {
        Rect[] rectArr = new Rect[layerDrawable.getNumberOfLayers()];
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            rectArr[i] = layerDrawable.getDrawable(i).getBounds();
        }
        return rectArr;
    }

    public static boolean isDemoUser(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return false;
        }
        return ((UserManager) context.getSystemService("user")).isDemoUser();
    }

    public static boolean isInteractive(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (Build.VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public static boolean shouldSkipFirstUseHints(ContentResolver contentResolver) {
        if (Build.VERSION.SDK_INT < 21 || Settings.Secure.getInt(contentResolver, "skip_first_use_hints", 0) == 0) {
            return false;
        }
        return true;
    }

    public static Intent getNotificationSettingsIntent(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.ACTION_APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        return intent;
    }

    public static void setPasswordEditTextContentDescription(EditText editText) {
        if (Build.VERSION.SDK_INT < 24 && isPasswordInputType(editText.getInputType()) && !TextUtils.isEmpty(editText.getHint())) {
            editText.setContentDescription(editText.getHint());
        }
    }

    public static <T> T requireNonNull(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static void setAccessibilityTraversalBefore(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(i);
        }
    }

    public static boolean setElevation(View view, float f) {
        if (!isElevationSupported()) {
            return false;
        }
        view.setElevation(f);
        return true;
    }

    public static String toHtml(Spanned spanned, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.toHtml(spanned, i);
        }
        return Html.toHtml(spanned);
    }

    public static int getColor(Resources resources, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, null);
        }
        return resources.getColor(i);
    }

    public static Drawable getDrawable(Resources resources, int i) throws Resources.NotFoundException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return resources.getDrawable(i, null);
            }
            Drawable drawable = resources.getDrawable(i);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return drawable;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static Drawable getUserBadgedIcon(Context context, int i) {
        Drawable drawable = getDrawable(context.getResources(), i);
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getPackageManager().getUserBadgedIcon(drawable, Process.myUserHandle());
        }
        return drawable;
    }

    public static void restoreLayersBounds(LayerDrawable layerDrawable, Rect[] rectArr) {
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            layerDrawable.getDrawable(i).setBounds(rectArr[i]);
        }
    }

    public static boolean setElevation(PopupWindow popupWindow, float f) {
        if (!isElevationSupported()) {
            return false;
        }
        popupWindow.setElevation(f);
        return true;
    }

    public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT == 21 && colorStateList != null && imageView.getImageTintMode() == null) {
            imageView.setImageTintMode(PorterDuff.Mode.SRC_IN);
        }
        C0942e.m4551a(imageView, colorStateList);
    }

    public static void setStatusBarIconColor(View view, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & -8193;
            }
            view.setSystemUiVisibility(i);
        }
    }

    public static void setTextAppearance(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void setStatusBarColor(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT < 26 && i == -16777216 && window.getNavigationBarColor() == -16777216) {
                window.clearFlags(Integer.MIN_VALUE);
            } else {
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i);
        }
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawableForDensity(i, i2, null);
        }
        return resources.getDrawableForDensity(i, i2);
    }

    public static int checkPermission(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static void setTaskDescription(Activity activity, String str, Bitmap bitmap, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setTaskDescription(new ActivityManager.TaskDescription(str, bitmap, i));
        }
    }

    public static Drawable getUserBadgedDrawableForDensity(Context context, Drawable drawable, Rect rect, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getPackageManager().getUserBadgedDrawableForDensity(drawable, Process.myUserHandle(), rect, i);
        }
        return drawable;
    }
}
