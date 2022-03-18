package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class UIUtils {
    public static final boolean API_ET_20;
    private static int mDpi = -1;
    private static String sScreenResolution = "";
    public static EllipsisMeasureResult sTempEllipsisResult = new EllipsisMeasureResult();
    private static ToastHook sToastHook;

    public static class EllipsisMeasureResult {
        public String ellipsisStr;
        public int length;
    }

    public interface ToastHook {
        boolean showToast(Context context, int i, CharSequence charSequence, long j, int i2);
    }

    public static int floatToIntBig(float f) {
        return (int) (f + 0.999f);
    }

    public static int setColorAlpha(int i, int i2) {
        if (i2 > 255) {
            i2 = 255;
        } else if (i2 < 0) {
            i2 = 0;
        }
        return (i & 16777215) | (i2 * 16777216);
    }

    private static boolean visibilityValid(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    private UIUtils() {
    }

    public static boolean isInUIThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        API_ET_20 = z;
    }

    public static void assertInUIThread() {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Logger.alertErrorInfo("not in UI thread");
        }
    }

    public static void setToastHook(ToastHook toastHook) {
        sToastHook = toastHook;
    }

    public static boolean clearAnimation(View view) {
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        view.clearAnimation();
        return true;
    }

    public static boolean isViewVisible(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static void detachFromParent(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e) {
                    Logger.throwException(e);
                }
            }
        }
    }

    public static int getDiggBuryWidth(Context context) {
        return ((context.getResources().getDisplayMetrics().widthPixels * 1375) / HwBuildEx.VersionCodes.CUR_DEVELOPMENT) + ((int) dip2Px(context, 20.0f));
    }

    public static int getDpi(Context context) {
        if (mDpi == -1 && context != null) {
            mDpi = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return mDpi;
    }

    public static int getIndexInParent(View view) {
        if (!(view == null || view.getParent() == null)) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return ((ViewGroup) parent).indexOfChild(view);
            }
        }
        return -1;
    }

    public static int getScreenHeight(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String getScreenResolution(Context context) {
        if (StringUtils.isEmpty(sScreenResolution) && context != null) {
            int screenWidth = getScreenWidth(context);
            int screenHeight = getScreenHeight(context);
            if (screenWidth > 0 && screenHeight > 0) {
                sScreenResolution = screenWidth + "*" + screenHeight;
            }
        }
        return sScreenResolution;
    }

    public static void displayToast(Context context, int i) {
        displayToast(context, context.getString(i));
    }

    public static void setText(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    public static float dip2Px(Context context, float f) {
        if (context != null) {
            return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public static int getRatioOfScreen(Context context, float f) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return (int) (((float) displayMetrics.widthPixels) * f);
    }

    public static int px2dip(Context context, float f) {
        if (context != null) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static void setTextViewMaxLines(TextView textView, int i) {
        if (textView != null && i > 0) {
            if (Build.VERSION.SDK_INT < 16 || textView.getMaxLines() != i) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                textView.setSingleLine(z);
                textView.setMaxLines(i);
            }
        }
    }

    public static void setTopMargin(View view, float f) {
        if (view != null) {
            updateLayoutMargin(view, -3, (int) TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics()), -3, -3);
        }
    }

    public static void setTxtAndAdjustVisible(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(charSequence)) {
                setViewVisibility(textView, 8);
                return;
            }
            setViewVisibility(textView, 0);
            textView.setText(charSequence);
        }
    }

    public static void setViewBackgroundWithPadding(View view, int i) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundResource(i);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static void setViewMinHeight(View view, int i) {
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16 || view.getMinimumHeight() != i) {
                view.setMinimumHeight(i);
            }
        }
    }

    public static void setViewVisibility(View view, int i) {
        if (view != null && view.getVisibility() != i && visibilityValid(i)) {
            view.setVisibility(i);
        }
    }

    public static float sp2px(Context context, float f) {
        if (context != null) {
            return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public static void displayToast(Context context, String str) {
        displayToast(context, 0, str);
    }

    public static void requestOrienation(Activity activity, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            activity.setRequestedOrientation(!z ? 1 : 0);
            if (z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    public static void setViewBackgroundWithPadding(View view, Drawable drawable) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundDrawable(drawable);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static int[] getLocationInAncestor(View view, View view2) {
        boolean z;
        if (view == null || view2 == null) {
            Logger.alertErrorInfo("invalid params: child:" + view + ",ancestor:" + view2);
            return null;
        }
        int[] iArr = new int[2];
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        fArr[0] = fArr[0] + ((float) view.getLeft());
        fArr[1] = fArr[1] + ((float) view.getTop());
        ViewParent parent = view.getParent();
        while (true) {
            if (!(parent instanceof View)) {
                z = false;
                break;
            }
            View view3 = (View) parent;
            if (parent == view2) {
                z = true;
                break;
            }
            fArr[0] = fArr[0] - ((float) view3.getScrollX());
            fArr[1] = fArr[1] - ((float) view3.getScrollY());
            fArr[0] = fArr[0] + ((float) view3.getLeft());
            fArr[1] = fArr[1] + ((float) view3.getTop());
            parent = view3.getParent();
        }
        if (!z) {
            Logger.alertErrorInfo("ancestorView:" + view2 + " is not the ancestor of child : " + view);
            return null;
        }
        iArr[0] = (int) (fArr[0] + 0.5f);
        iArr[1] = (int) (fArr[1] + 0.5f);
        return iArr;
    }

    public static void displayToastWithIcon(Context context, int i, String str) {
        displayToast(context, i, str);
    }

    public static void displayToastWithIcon(Context context, int i, int i2) {
        displayToast(context, i, context.getString(i2));
    }

    public static void displayToast(Context context, int i, int i2) {
        displayToast(context, context.getString(i), i2);
    }

    public static void displayLongTimeToast(Context context, int i, int i2) {
        if (context != null) {
            String string = context.getString(i2);
            if (!StringUtils.isEmpty(string)) {
                displayToastInternal(context, i, string, 1, 17);
            }
        }
    }

    public static void displayToast(Context context, int i, String str) {
        displayToastInternal(context, i, str, 0, 17);
    }

    public static void setClickListener(boolean z, View view, View.OnClickListener onClickListener) {
        if (view != null) {
            if (z) {
                view.setOnClickListener(onClickListener);
                view.setClickable(true);
                return;
            }
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    public static void setLayoutParams(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (i != Integer.MIN_VALUE) {
                layoutParams.width = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                layoutParams.height = i2;
            }
        }
    }

    public static void updateLayout(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (layoutParams.width != i || layoutParams.height != i2) {
                if (i != -3) {
                    layoutParams.width = i;
                }
                if (i2 != -3) {
                    layoutParams.height = i2;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void setViewBackgroundWithPadding(View view, Resources resources, int i) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundColor(resources.getColor(i));
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static void displayToast(Context context, String str, int i) {
        displayToastInternal(context, 0, str, 0, i);
    }

    public static void getLocationInUpView(View view, View view2, int[] iArr, boolean z) {
        if (view != null && view2 != null && iArr != null && iArr.length >= 2) {
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            view2.getLocationInWindow(iArr);
            int i3 = iArr[0] - i;
            int i4 = iArr[1] - i2;
            if (z) {
                i3 += view2.getWidth() / 2;
                i4 += view2.getHeight() / 2;
            }
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public static void expandClickRegion(final View view, final int i, final int i2, final int i3, final int i4) {
        view.post(new Runnable() {
            /* class com.bytedance.common.utility.UIUtils.RunnableC36312 */

            public void run() {
                Rect rect = new Rect();
                view.getHitRect(rect);
                rect.top += i2;
                rect.bottom += i4;
                rect.left += i;
                rect.right += i3;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                if (View.class.isInstance(view.getParent())) {
                    ((View) view.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        });
    }

    public static void updateLayoutMargin(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            updateMargin(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
        }
    }

    public static void displayToastInternal(final Context context, final int i, final String str, final int i2, final int i3) {
        if (context != null && !StringUtils.isEmpty(str)) {
            if (!isInUIThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.bytedance.common.utility.UIUtils.RunnableC36301 */

                    public void run() {
                        UIUtils.displayToastInternal(context, i, str, i2, i3);
                    }
                });
                return;
            }
            ToastHook toastHook = sToastHook;
            if (toastHook != null && toastHook.showToast(context, i, str, (long) i2, i3)) {
                return;
            }
            if (!(context instanceof ICustomToast)) {
                try {
                    Toast makeText = Toast.makeText(context, str, i2);
                    if (makeText != null) {
                        makeText.setGravity(i3, 0, 0);
                        makeText.show();
                    }
                } catch (Exception e) {
                    Logger.throwException(e);
                }
            } else if (i2 == 1) {
                ((ICustomToast) context).showCustomLongToast(i, str);
            } else {
                ICustomToast iCustomToast = (ICustomToast) context;
                if (i2 == 0) {
                    i2 = 2000;
                }
                iCustomToast.showCustomToast(i, str, i2, i3);
            }
        }
    }

    public static void ellipseSingleLineStr(String str, int i, Paint paint, int i2, EllipsisMeasureResult ellipsisMeasureResult) {
        if (i <= i2 || StringUtils.isEmpty(str)) {
            ellipsisMeasureResult.ellipsisStr = "";
            ellipsisMeasureResult.length = 0;
            return;
        }
        int floatToIntBig = floatToIntBig(paint.measureText(str));
        if (floatToIntBig <= i) {
            ellipsisMeasureResult.ellipsisStr = str;
            ellipsisMeasureResult.length = floatToIntBig;
            return;
        }
        StringBuilder sb = new StringBuilder();
        int breakText = paint.breakText(str, 0, str.length(), true, (float) (i - i2), null);
        if (breakText < 1) {
            ellipsisMeasureResult.ellipsisStr = "";
            ellipsisMeasureResult.length = 0;
            return;
        }
        sb.append(str.substring(0, breakText));
        sb.append((char) 8230);
        ellipsisMeasureResult.ellipsisStr = sb.toString();
        ellipsisMeasureResult.length = i;
    }

    private static void updateMargin(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4) {
                if (i != -3) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 != -3) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != -3) {
                    marginLayoutParams.bottomMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
