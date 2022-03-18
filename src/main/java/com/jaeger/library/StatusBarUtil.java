package com.jaeger.library;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StatusBarUtil {
    private static final int FAKE_STATUS_BAR_VIEW_ID = 2131306239;
    private static final int FAKE_TRANSLUCENT_VIEW_ID = 2131306240;

    private static int calculateStatusColor(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        float f = 1.0f - (((float) i2) / 255.0f);
        return ((int) (((double) (((float) (i & 255)) * f)) + 0.5d)) | (((int) (((double) (((float) ((i >> 16) & 255)) * f)) + 0.5d)) << 16) | -16777216 | (((int) (((double) (((float) ((i >> 8) & 255)) * f)) + 0.5d)) << 8);
    }

    public static void setTranslucent(Activity activity) {
        setTranslucent(activity, SmEvents.EVENT_NE_RR);
    }

    public static void setTransparent(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            transparentStatusBar(activity);
            setRootView(activity);
        }
    }

    private static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void setDarkMode(Activity activity) {
        setMIUIStatusBarDarkIcon(activity, false);
        setMeizuStatusBarDarkIcon(activity, false);
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }

    public static void setLightMode(Activity activity) {
        setMIUIStatusBarDarkIcon(activity, true);
        setMeizuStatusBarDarkIcon(activity, true);
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }

    public static void setTranslucentDiff(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            setRootView(activity);
        }
    }

    private static void clearPreviousSetting(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
            ((ViewGroup) ((ViewGroup) activity.findViewById(16908290)).getChildAt(0)).setPadding(0, 0, 0, 0);
        }
    }

    public static void hideFakeStatusBarView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = viewGroup.findViewById(FAKE_TRANSLUCENT_VIEW_ID);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }

    private static void setRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                childAt.setFitsSystemWindows(true);
                ((ViewGroup) childAt).setClipToPadding(true);
            }
        }
    }

    private static void setTransparentForWindow(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(0);
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().setFlags(67108864, 67108864);
        }
    }

    private static void transparentStatusBar(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(134217728);
            activity.getWindow().setStatusBarColor(0);
            return;
        }
        activity.getWindow().addFlags(67108864);
    }

    private static View createStatusBarView(Activity activity, int i) {
        return createStatusBarView(activity, i, 0);
    }

    public static void setColor(Activity activity, int i) {
        setColor(activity, i, SmEvents.EVENT_NE_RR);
    }

    public static void setColorForSwipeBack(Activity activity, int i) {
        setColorForSwipeBack(activity, i, SmEvents.EVENT_NE_RR);
    }

    public static void setColorNoTranslucent(Activity activity, int i) {
        setColor(activity, i, 0);
    }

    public static void setTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout) {
        setTranslucentForDrawerLayout(activity, drawerLayout, SmEvents.EVENT_NE_RR);
    }

    public static void setTranslucentForImageView(Activity activity, View view) {
        setTranslucentForImageView(activity, SmEvents.EVENT_NE_RR, view);
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, SmEvents.EVENT_NE_RR, view);
    }

    public static void setTransparentForImageView(Activity activity, View view) {
        setTranslucentForImageView(activity, 0, view);
    }

    public static void setTransparentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, 0, view);
    }

    public static void setTranslucent(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            setTransparent(activity);
            addTranslucentView(activity, i);
        }
    }

    public static void setTranslucentForCoordinatorLayout(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            transparentStatusBar(activity);
            addTranslucentView(activity, i);
        }
    }

    private static View createTranslucentStatusBarView(Activity activity, int i) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        view.setBackgroundColor(Color.argb(i, 0, 0, 0));
        view.setId(FAKE_TRANSLUCENT_VIEW_ID);
        return view;
    }

    private static void setDrawerLayoutProperty(DrawerLayout drawerLayout, ViewGroup viewGroup) {
        drawerLayout.setFitsSystemWindows(false);
        viewGroup.setFitsSystemWindows(false);
        viewGroup.setClipToPadding(true);
        ((ViewGroup) drawerLayout.getChildAt(1)).setFitsSystemWindows(false);
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

    public static void setColorDiff(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            transparentStatusBar(activity);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
            if (findViewById != null) {
                if (findViewById.getVisibility() == 8) {
                    findViewById.setVisibility(0);
                }
                findViewById.setBackgroundColor(i);
            } else {
                viewGroup.addView(createStatusBarView(activity, i));
            }
            setRootView(activity);
        }
    }

    private static void setMeizuStatusBarDarkIcon(Activity activity, boolean z) {
        int i;
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i2 = declaredField.getInt(null);
            int i3 = declaredField2.getInt(attributes);
            if (z) {
                i = i3 | i2;
            } else {
                i = (~i2) & i3;
            }
            declaredField2.setInt(attributes, i);
            activity.getWindow().setAttributes(attributes);
        } catch (Exception unused) {
        }
    }

    public static void setTranslucentForDrawerLayoutDiff(Activity activity, DrawerLayout drawerLayout) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
            viewGroup.setFitsSystemWindows(true);
            viewGroup.setClipToPadding(true);
            ((ViewGroup) drawerLayout.getChildAt(1)).setFitsSystemWindows(false);
            drawerLayout.setFitsSystemWindows(false);
        }
    }

    private static void setMIUIStatusBarDarkIcon(Activity activity, boolean z) {
        int i;
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Exception unused) {
        }
    }

    public static void setTransparentForDrawerLayout(Activity activity, DrawerLayout drawerLayout) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (Build.VERSION.SDK_INT >= 21) {
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                activity.getWindow().clearFlags(67108864);
                activity.getWindow().setStatusBarColor(0);
            } else {
                activity.getWindow().addFlags(67108864);
            }
            ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
            if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
                viewGroup.getChildAt(1).setPadding(0, getStatusBarHeight(activity), 0, 0);
            }
            setDrawerLayoutProperty(drawerLayout, viewGroup);
        }
    }

    public static void setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i) {
        setColorForDrawerLayout(activity, drawerLayout, i, SmEvents.EVENT_NE_RR);
    }

    public static void setColorNoTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i) {
        setColorForDrawerLayout(activity, drawerLayout, i, 0);
    }

    public static void setTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            setTransparentForDrawerLayout(activity, drawerLayout);
            addTranslucentView(activity, i);
        }
    }

    private static View createStatusBarView(Activity activity, int i, int i2) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        view.setBackgroundColor(calculateStatusColor(i, i2));
        view.setId(FAKE_STATUS_BAR_VIEW_ID);
        return view;
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, int i, View view) {
        setTranslucentForImageView(activity, i, view);
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            clearPreviousSetting(activity);
        }
    }

    public static void setTranslucentForImageView(Activity activity, int i, View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            setTransparentForWindow(activity);
            addTranslucentView(activity, i);
            if (view != null) {
                Object tag = view.getTag(-123);
                if (tag == null || !((Boolean) tag).booleanValue()) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(activity), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    view.setTag(-123, true);
                }
            }
        }
    }

    public static void setColor(Activity activity, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().setStatusBarColor(calculateStatusColor(i, i2));
        } else if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
            if (findViewById != null) {
                if (findViewById.getVisibility() == 8) {
                    findViewById.setVisibility(0);
                }
                findViewById.setBackgroundColor(calculateStatusColor(i, i2));
            } else {
                viewGroup.addView(createStatusBarView(activity, i, i2));
            }
            setRootView(activity);
        }
    }

    public static void setColorForDrawerLayoutDiff(Activity activity, DrawerLayout drawerLayout, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
            View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
            if (findViewById != null) {
                if (findViewById.getVisibility() == 8) {
                    findViewById.setVisibility(0);
                }
                findViewById.setBackgroundColor(calculateStatusColor(i, SmEvents.EVENT_NE_RR));
            } else {
                viewGroup.addView(createStatusBarView(activity, i), 0);
            }
            if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
                viewGroup.getChildAt(1).setPadding(0, getStatusBarHeight(activity), 0, 0);
            }
            setDrawerLayoutProperty(drawerLayout, viewGroup);
        }
    }

    public static void setColorForSwipeBack(Activity activity, int i, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 19) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            View childAt = viewGroup.getChildAt(0);
            int statusBarHeight = getStatusBarHeight(activity);
            if (childAt == null || !(childAt instanceof CoordinatorLayout)) {
                viewGroup.setPadding(0, statusBarHeight, 0, 0);
                viewGroup.setBackgroundColor(calculateStatusColor(i, i2));
            } else {
                final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) childAt;
                if (Build.VERSION.SDK_INT < 21) {
                    coordinatorLayout.setFitsSystemWindows(false);
                    viewGroup.setBackgroundColor(calculateStatusColor(i, i2));
                    if (viewGroup.getPaddingTop() < statusBarHeight) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        viewGroup.setPadding(0, statusBarHeight, 0, 0);
                        coordinatorLayout.post(new Runnable() {
                            /* class com.jaeger.library.StatusBarUtil.RunnableC239401 */

                            public void run() {
                                coordinatorLayout.requestLayout();
                            }
                        });
                    }
                } else {
                    coordinatorLayout.setStatusBarBackgroundColor(calculateStatusColor(i, i2));
                }
            }
            setTransparentForWindow(activity);
        }
    }

    public static void setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (Build.VERSION.SDK_INT >= 21) {
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                activity.getWindow().clearFlags(67108864);
                activity.getWindow().setStatusBarColor(0);
            } else {
                activity.getWindow().addFlags(67108864);
            }
            ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
            View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
            if (findViewById != null) {
                if (findViewById.getVisibility() == 8) {
                    findViewById.setVisibility(0);
                }
                findViewById.setBackgroundColor(i);
            } else {
                viewGroup.addView(createStatusBarView(activity, i), 0);
            }
            if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
                viewGroup.getChildAt(1).setPadding(viewGroup.getPaddingLeft(), getStatusBarHeight(activity) + viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            setDrawerLayoutProperty(drawerLayout, viewGroup);
            addTranslucentView(activity, i2);
        }
    }
}
