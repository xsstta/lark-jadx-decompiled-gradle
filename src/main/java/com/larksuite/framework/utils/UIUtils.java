package com.larksuite.framework.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.C0768a;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class UIUtils {
    private static int navigationHeight = -1;
    private static int realScreenHeight;

    public static boolean canShowSkeleton() {
        return !RomUtils.m94952g();
    }

    public static void clearPadding(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    public static Resources getResources(Context context) {
        return context.getResources();
    }

    public static void hide(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void invisible(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static void show(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static Activity getActivityFromView(View view) {
        return getActivityFromContext(view.getContext());
    }

    public static AssetManager getAssets(Context context) {
        return getResources(context).getAssets();
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return getResources(context).getDisplayMetrics();
    }

    public static int getScaledTouchSlop(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static int getScreenOrientation(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static boolean isActivityRunning(Activity activity) {
        if (activity == null) {
            return false;
        }
        return isActivityRunningInner(activity);
    }

    public static boolean isVisible(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static boolean canLoadImage(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            return isActivityRunningInner((Activity) context);
        }
        return true;
    }

    public static void disableGrandParentClipChild(View view) {
        ViewParent parent;
        ViewParent parent2 = view.getParent();
        if (parent2 != null && (parent = parent2.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    public static Activity getActivityFromContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int getHeight(View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static int getNavigationBarHeight(Context context) {
        int i = navigationHeight;
        if (i != -1) {
            return i;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        navigationHeight = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static int getScreenHeight(Context context) {
        int i = realScreenHeight;
        if (i != 0) {
            return i;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        realScreenHeight = displayMetrics.heightPixels;
        return displayMetrics.heightPixels;
    }

    public static int getWidth(View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    private static boolean isActivityRunningInner(Activity activity) {
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public static void setStatusBarTransparent(Context context) {
        Activity activity = (Activity) context;
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
            activity.getWindow().setStatusBarColor(0);
        }
    }

    public static void setViewOnScreenOneThirdPlaceByTranslationY(final View view) {
        final Context context = view.getContext();
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.larksuite.framework.utils.UIUtils.ViewTreeObserver$OnPreDrawListenerC262451 */

            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                view.setTranslationY((((float) UIUtils.getScreenHeight(context)) / 3.0f) - (((float) iArr[1]) - view.getTranslationY()));
                return false;
            }
        });
    }

    public static RectF calcViewScreenLocation(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight()));
    }

    public static void disableAllParentClipChild(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                disableAllParentClipChild((View) parent);
            }
        }
    }

    public static boolean performParentLongClick(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.isLongClickable()) {
                viewGroup.performLongClick();
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public static <T extends View> T findViewById(View view, int i) {
        return (T) view.findViewById(i);
    }

    public static Drawable getCompatDrawable(Context context, int i) {
        return C0215a.m655b(context, i);
    }

    public static boolean setTextViewEditorDrawable(TextView textView, Drawable drawable) {
        return setTextViewEditorDrawable(Build.VERSION.SDK_INT, textView, drawable);
    }

    public static void display(View view, boolean z) {
        if (z) {
            show(view);
        } else {
            hide(view);
        }
    }

    public static int getColor(Context context, int i) {
        return getResources(context).getColor(i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return getResources(context).getColorStateList(i);
    }

    public static int getDimens(Context context, int i) {
        return getResources(context).getDimensionPixelSize(i);
    }

    public static Drawable getDrawable(Context context, int i) {
        return getResources(context).getDrawable(i);
    }

    public static String getString(Context context, int i) {
        return getResources(context).getString(i);
    }

    public static String[] getStringArray(Context context, int i) {
        return getResources(context).getStringArray(i);
    }

    public static View inflate(Context context, int i) {
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public static AssetFileDescriptor openRawResourceFd(Context context, int i) {
        return getResources(context).openRawResourceFd(i);
    }

    public static int px2dp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float sp2px(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getAlphaColor(int i, double d) {
        if (d >= 0.0d && d <= 1.0d) {
            return C0768a.m3716c(i, (int) (d * 255.0d));
        }
        throw new IllegalArgumentException();
    }

    public static int px2sp(Context context, int i) {
        return (int) ((((float) i) / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void setForegroundAlpha(Activity activity, float f) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f;
            window.setAttributes(attributes);
        }
    }

    public static void setTextStyle(TextView textView, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            textView.setTextAppearance(textView.getContext(), i);
        } else {
            textView.setTextAppearance(i);
        }
    }

    public static boolean setTextViewCursorDrawable(TextView textView, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            return setTextViewEditorDrawable(i, textView, drawable);
        }
        textView.setTextCursorDrawable(drawable);
        textView.invalidate();
        return true;
    }

    public static void saveBitmap2File(Bitmap bitmap, String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isActivityAlive(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            r0 = 0
            if (r3 != 0) goto L_0x000c
            return r0
        L_0x000c:
            r1 = 100
            java.util.List r3 = r3.getRunningTasks(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0016:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r3.next()
            android.app.ActivityManager$RunningTaskInfo r1 = (android.app.ActivityManager.RunningTaskInfo) r1
            android.content.ComponentName r2 = r1.topActivity
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x003a
            android.content.ComponentName r2 = r1.baseActivity
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0016
        L_0x003a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.ComponentName r4 = r1.topActivity
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r4 = " info.baseActivity.getPackageName()="
            r3.append(r4)
            android.content.ComponentName r4 = r1.baseActivity
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "UIUtils"
            com.ss.android.lark.log.Log.m165389i(r4, r3)
            r3 = 1
            return r3
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.UIUtils.isActivityAlive(android.content.Context, java.lang.String):boolean");
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static void setViewLayoutParam(ViewGroup viewGroup, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        viewGroup.setLayoutParams(layoutParams);
    }

    public static String getQuantityString(Context context, int i, int i2) {
        return getResources(context).getQuantityString(i, i2, Integer.valueOf(i2));
    }

    public static String getString(Context context, int i, Object... objArr) throws Resources.NotFoundException {
        return getResources(context).getString(i, objArr);
    }

    public static View inflate(Context context, int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup);
    }

    public static void showByStatus(TextView textView, String str, boolean z) {
        if (textView != null) {
            if (z) {
                textView.setText(str);
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }
    }

    public static void setForegroundDrawable(Activity activity, float f, Drawable drawable) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 23) {
                decorView.setForeground(drawable);
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f;
            window.setAttributes(attributes);
        }
    }

    public static boolean setTextViewCursorColor(Context context, TextView textView, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            Drawable textCursorDrawable = textView.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return false;
            }
            textCursorDrawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
            textView.setTextCursorDrawable(textCursorDrawable);
            textView.invalidate();
            return true;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            Drawable drawable = ContextCompat.getDrawable(context, declaredField.getInt(textView));
            if (drawable == null) {
                return false;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            return setTextViewEditorDrawable(i2, textView, drawable);
        } catch (Exception e) {
            Log.m165379d("UIUtils", "setTextViewCursorColor: " + e.getMessage());
            return false;
        }
    }

    private static boolean setTextViewEditorDrawable(int i, TextView textView, Drawable drawable) {
        if (i > 28) {
            return setTextViewCursorDrawable(textView, drawable);
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(textView);
            if (i == 28) {
                Field declaredField2 = TextView.class.getDeclaredField("mDrawableForCursor");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, drawable);
            } else {
                Field declaredField3 = TextView.class.getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                declaredField3.set(obj, new Drawable[]{drawable, drawable});
            }
            textView.invalidate();
            return true;
        } catch (Exception e) {
            Log.m165379d("UIUtils", "setTextViewEditorDrawable: " + e.getMessage());
            return false;
        }
    }

    public static Drawable getDrawableFromLayout(Context context, int i, int i2, int i3) {
        return new BitmapDrawable(context.getResources(), getBitmapFromLayout(context, i, i2, i3));
    }

    public static Bitmap getBitmapFromLayout(Context context, int i, int i2, int i3) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        inflate.layout(0, 0, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static void setMargins(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }
}
