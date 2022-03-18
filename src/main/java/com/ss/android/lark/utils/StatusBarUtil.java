package com.ss.android.lark.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class StatusBarUtil {
    private static final int FAKE_STATUS_BAR_VIEW_ID = 2131306239;
    private static final int FAKE_TRANSLUCENT_VIEW_ID = 2131306240;

    public static void setTransparent(Activity activity) {
        setTranslucentForImageView(activity, 0, new View[0]);
    }

    public static void hideStatusBar(Activity activity) {
        if (activity != null) {
            activity.getWindow().addFlags(1024);
        }
    }

    public static void showStatusBar(Activity activity) {
        if (activity != null) {
            activity.getWindow().clearFlags(1024);
        }
    }

    public static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    private static void clearPreviousSetting(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
            ((ViewGroup) ((ViewGroup) activity.findViewById(16908290)).getChildAt(0)).setPadding(0, 0, 0, 0);
        }
    }

    private static void setTransparentForWindow(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(0);
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | DynamicModule.f58006b | 1024);
        } else if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().setFlags(67108864, 67108864);
        }
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, SmEvents.EVENT_NE_RR, view);
    }

    public static void setTransparentForImageView(Activity activity, View... viewArr) {
        setTranslucentForImageView(activity, 0, viewArr);
    }

    public static void setTransparentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, 0, view);
    }

    private static View createTranslucentStatusBarView(Activity activity, int i) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        view.setBackgroundColor(Color.argb(i, 0, 0, 0));
        view.setId(FAKE_TRANSLUCENT_VIEW_ID);
        return view;
    }

    private static void addTranslucentView(Activity activity, int i) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        View findViewById = viewGroup.findViewById(FAKE_TRANSLUCENT_VIEW_ID);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 8) {
                findViewById.setVisibility(0);
            }
            findViewById.setBackgroundColor(Color.argb(i, 0, 0, 0));
            return;
        }
        viewGroup.addView(createTranslucentStatusBarView(activity, i));
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, int i, View view) {
        setTranslucentForImageView(activity, i, view);
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            clearPreviousSetting(activity);
        }
    }

    public static void setTranslucentForImageView(Activity activity, int i, View... viewArr) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 19) {
            setTransparentForWindow(activity);
            addTranslucentView(activity, i);
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null && ((tag = view.getTag(-123)) == null || !((Boolean) tag).booleanValue())) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(activity), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        view.setTag(-123, true);
                    }
                }
            }
        }
    }
}
