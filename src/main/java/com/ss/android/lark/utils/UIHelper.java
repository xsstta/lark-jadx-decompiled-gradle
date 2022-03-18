package com.ss.android.lark.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.samskivert.mustache.C27035d;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

public class UIHelper {
    public static String getAppName() {
        return getString(R.string.Lark_App_Name);
    }

    public static Context getContext() {
        return LarkContext.getApplication();
    }

    public static Resources getResources() {
        return UIUtils.getResources(getContext());
    }

    public static int getWindowWidth(Context context) {
        return getWindowWidth(context, ContainerType.Right);
    }

    public static int dp2px(float f) {
        return UIUtils.dp2px(getContext(), f);
    }

    public static int getColor(int i) {
        return UIUtils.getColor(getContext(), i);
    }

    public static int getDimens(int i) {
        return UIUtils.getDimens(getContext(), i);
    }

    public static Drawable getDrawable(int i) {
        return UIUtils.getDrawable(getContext(), i);
    }

    public static String[] getStringArray(int i) {
        return UIUtils.getStringArray(getContext(), i);
    }

    public static View inflate(int i) {
        return UIUtils.inflate(getContext(), i);
    }

    public static String mustacheFormat(int i) {
        return mustacheFormat(UIUtils.getString(getContext(), i));
    }

    public static int px2dp(float f) {
        return UIUtils.px2dp(getContext(), f);
    }

    public static float sp2px(float f) {
        return UIUtils.sp2px(getContext(), f);
    }

    public static String getString(int i) {
        if (LarkContext.getApplication() != null) {
            return UIUtils.getString(getContext(), i);
        }
        Log.m165383e("UIHelper", "getString before application context injected");
        return "";
    }

    public static String mustacheFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("APP_DISPLAY_NAME", getString(R.string.Lark_App_Name));
        try {
            return C27035d.m98270a().mo96184a(false).mo96186a(str).mo96212a(hashMap);
        } catch (Exception e) {
            Log.m165383e("UIHelper", e.getMessage());
            return str;
        }
    }

    public static String getQuantityString(int i, int i2) {
        return UIUtils.getQuantityString(getContext(), i, i2);
    }

    public static String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return UIUtils.getString(getContext(), i, objArr);
    }

    public static View inflate(int i, ViewGroup viewGroup) {
        return UIUtils.inflate(getContext(), i, viewGroup);
    }

    public static int getWindowWidth(Context context, ContainerType containerType) {
        if (!DesktopUtil.m144301a(context)) {
            return DeviceUtils.getScreenWidth(context);
        }
        int width = C36512a.m144041a().mo134753a(containerType).width();
        if (containerType == ContainerType.Left && width == 0) {
            return dp2px(300.0f);
        }
        return width;
    }

    public static String mustacheFormat(int i, Map<String, String> map) {
        String string = UIUtils.getString(getContext(), i);
        if (!TextUtils.isEmpty(string) && !CollectionUtils.isEmpty(map)) {
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(string).mo96212a(map);
            } catch (Exception e) {
                Log.m165383e("UIHelper", e.getMessage());
            }
        }
        return string;
    }

    public static String mustacheFormat(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(map)) {
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(str).mo96212a(map);
            } catch (Exception e) {
                Log.m165383e("UIHelper", e.getMessage());
            }
        }
        return str;
    }

    public static String mustacheFormat(int i, String str, String str2) {
        String string = UIUtils.getString(getContext(), i);
        if (!(str == null || str2 == null)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str, str2);
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(string).mo96212a(hashMap);
            } catch (Exception e) {
                Log.m165383e("UIHelper", e.getMessage());
            }
        }
        return string;
    }

    public static String mustacheFormat(String str, String str2, String str3) {
        if (!(str2 == null || str3 == null)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str2, str3);
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(str).mo96212a(hashMap);
            } catch (Exception e) {
                Log.m165383e("UIHelper", e.getMessage());
            }
        }
        return str;
    }
}
