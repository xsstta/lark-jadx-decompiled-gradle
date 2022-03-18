package com.ss.android.lark.utils.navigation;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.MagicWindowUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Navigation {
    private static Map<String, List<WeakReference<Navigation>>> mNavigationMap = new ConcurrentHashMap();
    public static String sCurrentActivePageName;
    private static boolean sIsLifecycleInit = false;
    private static boolean sIsNavigationEnable = false;
    private static long sLastOpenTime;
    private static String sLastPageName;
    private static String sLastSourceKey;
    private static AbstractC57855a sNavigationListener;
    private Context mContext;
    Fragment mFragment;
    private String mSourceKey;
    private String mSourceName;
    private long mStartTime;

    /* renamed from: com.ss.android.lark.utils.navigation.Navigation$a */
    public interface AbstractC57855a {
        /* renamed from: a */
        void mo102690a(String str, int i);

        /* renamed from: a */
        void mo102691a(String str, String str2, long j);
    }

    /* renamed from: com.ss.android.lark.utils.navigation.Navigation$b */
    public interface AbstractC57856b {
        void onOpenPage();
    }

    private String getSourceKey() {
        return this.mSourceKey;
    }

    private String getSourceName() {
        return this.mSourceName;
    }

    public Context getContext() {
        return this.mContext;
    }

    public static void setIsNavigationEnable(boolean z) {
        sIsNavigationEnable = z;
    }

    public static void setNavigationListener(AbstractC57855a aVar) {
        sNavigationListener = aVar;
    }

    public boolean openActivity(Intent intent) {
        return openActivity(intent, -1, null);
    }

    public static Navigation from(Context context) {
        Navigation navigation = new Navigation(context, new C57857c(context));
        addNewNavigation(navigation);
        return navigation;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.navigation.Navigation$c */
    public static class C57857c {

        /* renamed from: a */
        public final String f142482a;

        /* renamed from: b */
        public final String f142483b;

        private C57857c(Object obj) {
            this.f142482a = obj.toString();
            this.f142483b = obj.getClass().getName();
        }

        private C57857c(View view) {
            String str;
            this.f142482a = view.toString();
            try {
                str = view.getContext().getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException e) {
                Log.m165382e(e.getMessage());
                str = "";
            }
            this.f142483b = view.getClass().getName() + ": " + str;
        }
    }

    private static synchronized void addActivityLifeMonitor(Context context) {
        synchronized (Navigation.class) {
            if (!sIsLifecycleInit) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.ss.android.lark.utils.navigation.Navigation.C578541 */

                    public void onActivityDestroyed(Activity activity) {
                    }

                    public void onActivityResumed(Activity activity) {
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public void onActivityStarted(Activity activity) {
                    }

                    public void onActivityPaused(Activity activity) {
                        if (C57782ag.m224242a(Navigation.sCurrentActivePageName, activity.getComponentName().getClassName())) {
                            Log.m165389i("Navigation", "page :" + Navigation.sCurrentActivePageName + " paused");
                            Navigation.sCurrentActivePageName = "";
                        }
                    }

                    public void onActivityStopped(Activity activity) {
                        if (C57782ag.m224242a(Navigation.sCurrentActivePageName, activity.getComponentName().getClassName())) {
                            Log.m165389i("Navigation", "page :" + Navigation.sCurrentActivePageName + " stopped");
                            Navigation.sCurrentActivePageName = "";
                        }
                    }

                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        Navigation.sCurrentActivePageName = activity.getComponentName().getClassName();
                        Log.m165389i("Navigation", "page :" + Navigation.sCurrentActivePageName + " created");
                    }
                });
                sIsLifecycleInit = true;
            }
        }
    }

    private boolean isDuplicateOpen(String str) {
        if (!TextUtils.equals(str, sLastPageName) || SystemClock.uptimeMillis() - sLastOpenTime >= 500) {
            return false;
        }
        return true;
    }

    private static void addNewNavigation(Navigation navigation) {
        if (sIsNavigationEnable) {
            List<WeakReference<Navigation>> list = mNavigationMap.get(navigation.getSourceKey());
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(new WeakReference<>(navigation));
            mNavigationMap.put(navigation.getSourceKey(), list);
        }
    }

    public static Navigation from(View view) {
        Navigation navigation = new Navigation(view.getContext(), new C57857c(view));
        addNewNavigation(navigation);
        return navigation;
    }

    private Navigation(Context context, C57857c cVar) {
        this(context, null, cVar);
    }

    public boolean openActivity(Intent intent, int i) {
        return openActivity(intent, i, null);
    }

    public static Navigation from(Context context, Fragment fragment) {
        Navigation navigation = new Navigation(context, fragment, new C57857c(fragment));
        addNewNavigation(navigation);
        return navigation;
    }

    private boolean isSameAsCreatedPage(String str, String str2) {
        if (!TextUtils.equals(str, sCurrentActivePageName) || !TextUtils.equals(str2, sLastSourceKey)) {
            return false;
        }
        return true;
    }

    private boolean startActivity(Intent intent, Bundle bundle) {
        if (sIsNavigationEnable) {
            return openActivityByNavigation(intent, -1, bundle);
        }
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            fragment.startActivity(intent, bundle);
            return true;
        }
        this.mContext.startActivity(intent, bundle);
        return true;
    }

    public static Navigation from(Context context, Object obj) {
        Navigation navigation = new Navigation(context, new C57857c(obj));
        addNewNavigation(navigation);
        return navigation;
    }

    public boolean openActivity(Intent intent, Bundle bundle) {
        return openActivity(intent, -1, bundle);
    }

    public boolean openActivity(String str, AbstractC57856b bVar) {
        if (!sIsNavigationEnable) {
            bVar.onOpenPage();
            return true;
        } else if (!CollectionUtils.isNotEmpty(mNavigationMap.get(this.mSourceKey))) {
            return false;
        } else {
            if (isDuplicateOpen(str)) {
                Log.m165389i("Navigation", "return by duplicate open page name: " + str);
                return false;
            }
            bVar.onOpenPage();
            sLastOpenTime = SystemClock.uptimeMillis();
            sLastPageName = str;
            AbstractC57855a aVar = sNavigationListener;
            if (aVar != null) {
                aVar.mo102691a(str, getSourceName(), SystemClock.uptimeMillis() - this.mStartTime);
            }
            mNavigationMap.clear();
            return true;
        }
    }

    private Navigation(Context context, Fragment fragment, C57857c cVar) {
        this.mContext = context;
        this.mFragment = fragment;
        this.mStartTime = SystemClock.uptimeMillis();
        this.mSourceKey = cVar.f142482a;
        this.mSourceName = cVar.f142483b;
        if (sIsNavigationEnable) {
            addActivityLifeMonitor(context);
        }
    }

    private boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (sIsNavigationEnable) {
            return openActivityByNavigation(intent, i, bundle);
        }
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i, bundle);
            return true;
        }
        ((Activity) this.mContext).startActivityForResult(intent, i, bundle);
        return true;
    }

    public boolean openActivity(Intent intent, int i, Bundle bundle) {
        if (!(this.mContext instanceof Activity)) {
            intent.addFlags(268435456);
            return startActivity(intent, bundle);
        } else if (i > 0) {
            return startActivityForResult(intent, i, bundle);
        } else {
            return startActivity(intent, bundle);
        }
    }

    private boolean openActivityByNavigation(Intent intent, int i, Bundle bundle) {
        String str;
        boolean z;
        List<WeakReference<Navigation>> list = mNavigationMap.get(this.mSourceKey);
        if (!CollectionUtils.isNotEmpty(list) || this.mContext == null) {
            return false;
        }
        if (intent.getComponent() != null) {
            str = intent.getComponent().getClassName();
        } else {
            str = "";
        }
        if (isDuplicateOpen(str)) {
            Log.m165389i("Navigation", "return by duplicate open page name: " + str);
            return false;
        }
        Context context = this.mContext;
        if (!(context instanceof Activity) || !MagicWindowUtil.m224687e(context)) {
            z = false;
        } else {
            z = true;
        }
        if (!isSameAsCreatedPage(str, this.mSourceKey) || z) {
            if (i > 0) {
                Fragment fragment = this.mFragment;
                if (fragment != null) {
                    fragment.startActivityForResult(intent, i, bundle);
                } else {
                    Context context2 = this.mContext;
                    if (context2 instanceof Activity) {
                        ((Activity) context2).startActivityForResult(intent, i, bundle);
                    }
                }
            } else {
                Fragment fragment2 = this.mFragment;
                if (fragment2 != null) {
                    fragment2.startActivity(intent, bundle);
                } else {
                    this.mContext.startActivity(intent, bundle);
                }
            }
            Log.m165389i("Navigation", "open page: " + str);
            sLastOpenTime = SystemClock.uptimeMillis();
            sLastPageName = str;
            sLastSourceKey = this.mSourceKey;
            AbstractC57855a aVar = sNavigationListener;
            if (aVar != null) {
                aVar.mo102691a(str, getSourceName(), SystemClock.uptimeMillis() - this.mStartTime);
                if (list.size() > 1) {
                    sNavigationListener.mo102690a(str, list.size() - 1);
                }
            }
            mNavigationMap.clear();
            return true;
        }
        Log.m165389i("Navigation", "return by is same as active page: " + str);
        return false;
    }
}
