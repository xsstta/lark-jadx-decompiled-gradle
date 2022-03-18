package com.ss.android.lark.floating;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnPermissionResult;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import com.ss.android.lark.floating.utils.AppStateHandler;
import com.ss.android.lark.floating.widget.activityfloat.ActivityFloatManager;
import com.ss.android.lark.floating.widget.appfloat.AppFloatManager;
import com.ss.android.lark.floating.widget.appfloat.FloatManager;
import com.ss.android.lark.log.Log;
import com.ss.android.vesdk.p3188b.C63954b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/floating/LKUIFloat;", "", "()V", "Builder", "Companion", "IFloatDependency", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.a */
public final class LKUIFloat {

    /* renamed from: a */
    public static WeakReference<Activity> f98416a;

    /* renamed from: b */
    public static AtomicBoolean f98417b = new AtomicBoolean();

    /* renamed from: c */
    public static IFloatDependency f98418c;

    /* renamed from: d */
    public static final Companion f98419d = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/floating/LKUIFloat$IFloatDependency;", "", "getTopActivity", "Landroid/app/Activity;", "isAppFront", "", "registerAppStateHandler", "", "observer", "Lcom/ss/android/lark/floating/utils/AppStateHandler$AppStateObserver;", "unRegisterAppStateHandler", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.a$c */
    public interface IFloatDependency {
        /* renamed from: a */
        Activity mo102716a();

        /* renamed from: a */
        void mo102717a(AppStateHandler.AppStateObserver aVar);

        /* renamed from: b */
        boolean mo102718b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final Builder m150799a(Context context) {
        return f98419d.mo140141a(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Unit m150800a(Activity activity, String str) {
        return f98419d.mo140143a(activity, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Unit m150801a(String str) {
        return f98419d.mo140144a(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150802a(Application application, IFloatDependency cVar) {
        f98419d.mo140145a(application, cVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final Unit m150803b(String str) {
        return f98419d.mo140153c(str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m150804b(Activity activity, String str) {
        return f98419d.mo140151b(activity, str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final View m150805c(Activity activity, String str) {
        return f98419d.mo140152c(activity, str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m150806c(String str) {
        return f98419d.mo140154d(str);
    }

    @JvmStatic
    /* renamed from: d */
    public static final View m150807d(String str) {
        return f98419d.mo140155e(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0017J\"\u0010\u001c\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007J7\u0010 \u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u001a\u0010!\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030#0\"\"\u0006\u0012\u0002\b\u00030#H\u0007¢\u0006\u0002\u0010$J/\u0010 \u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\"\"\u00020\u0004H\u0007¢\u0006\u0002\u0010&J#\u0010'\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010(J#\u0010'\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010.\u001a\u0004\u0018\u00010/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J\"\u00102\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u001b\u00105\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0017J\u0018\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u0002082\u0006\u0010\b\u001a\u00020\tH\u0007J \u00109\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010:\u001a\u0004\u0018\u00010;2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002J\u001e\u0010<\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>J#\u0010@\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010(J7\u0010A\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u001a\u0010!\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030#0\"\"\u0006\u0012\u0002\b\u00030#H\u0007¢\u0006\u0002\u0010$J(\u0010B\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010C\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020>H\u0007J\u0010\u0010E\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J/\u0010F\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010GJ\u0010\u0010H\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\"\u0010I\u001a\u0004\u0018\u0001042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u001b\u0010J\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0017J\b\u0010K\u001a\u00020\u0011H\u0007J\u0014\u0010L\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010M\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010N\u001a\u00020\u0013J\u0010\u0010O\u001a\u00020P2\u0006\u0010\u0019\u001a\u00020QH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/ss/android/lark/floating/LKUIFloat$Companion;", "", "()V", "TAG", "", "activityWr", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "dependency", "Lcom/ss/android/lark/floating/LKUIFloat$IFloatDependency;", "getDependency", "()Lcom/ss/android/lark/floating/LKUIFloat$IFloatDependency;", "setDependency", "(Lcom/ss/android/lark/floating/LKUIFloat$IFloatDependency;)V", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "appFloatDragEnable", "", "dragEnable", "", "tag", "appFloatIsShow", "clearFilters", "(Ljava/lang/String;)Lkotlin/Unit;", "dismiss", "activity", "(Landroid/app/Activity;Ljava/lang/String;)Lkotlin/Unit;", "dismissAppFloat", "evictRect", "rect", "", "Landroid/graphics/Rect;", "filterActivities", "clazz", "", "Ljava/lang/Class;", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/Boolean;", "list", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Boolean;", "filterActivity", "(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/Boolean;", "activityName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "getAppFloatContainerView", "Landroid/view/View;", "getAppFloatView", "getConfig", "Lcom/ss/android/lark/floating/data/FloatConfig;", "getFilterSet", "", "getFloatView", "hide", "Lcom/ss/android/lark/floating/widget/activityfloat/FloatingView;", "hideAppFloat", "init", "application", "Landroid/app/Application;", "isShow", "manager", "Lcom/ss/android/lark/floating/widget/activityfloat/ActivityFloatManager;", "refreshOffsets", "x", "", "y", "removeFilter", "removeFilters", "resetLocation", "offsetX", "offsetY", "restoreWrapContent", "setDragEnable", "(Landroid/app/Activity;ZLjava/lang/String;)Lkotlin/Unit;", "setMatchParent", "show", "showAppFloat", "unInit", "update", "updateKeepScreenOn", C63954b.f161494a, "with", "Lcom/ss/android/lark/floating/LKUIFloat$Builder;", "Landroid/content/Context;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.a$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final IFloatDependency mo140142a() {
            return LKUIFloat.f98418c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Unit mo140144a(String str) {
            return FloatManager.f98554a.mo140332b(str);
        }

        @JvmStatic
        /* renamed from: b */
        public final Unit mo140150b(String str) {
            return FloatManager.f98554a.mo140328a(false, str, false);
        }

        @JvmStatic
        /* renamed from: c */
        public final Unit mo140153c(String str) {
            return FloatManager.f98554a.mo140328a(true, str, true);
        }

        @JvmStatic
        /* renamed from: f */
        public final void mo140156f(String str) {
            FloatManager.f98554a.mo140330a(str);
        }

        /* renamed from: g */
        private final FloatConfig m150827g(String str) {
            AppFloatManager e = FloatManager.f98554a.mo140335e(str);
            if (e != null) {
                return e.mo140314h();
            }
            return null;
        }

        @JvmStatic
        /* renamed from: d */
        public final boolean mo140154d(String str) {
            FloatConfig g = m150827g(str);
            if (g != null) {
                return g.mo140199g();
            }
            return false;
        }

        @JvmStatic
        /* renamed from: e */
        public final View mo140155e(String str) {
            FloatConfig g = m150827g(str);
            if (g != null) {
                return g.mo140188c();
            }
            return null;
        }

        /* renamed from: a */
        private final ActivityFloatManager m150826a(Activity activity) {
            if (activity == null) {
                WeakReference<Activity> weakReference = LKUIFloat.f98416a;
                if (weakReference != null) {
                    activity = weakReference.get();
                } else {
                    activity = null;
                }
            }
            if (activity != null) {
                return new ActivityFloatManager(activity);
            }
            return null;
        }

        @JvmStatic
        /* renamed from: a */
        public final Builder mo140141a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "activity");
            if (context instanceof Activity) {
                LKUIFloat.f98416a = new WeakReference<>(context);
            }
            return new Builder(context);
        }

        /* renamed from: a */
        public final void mo140146a(IFloatDependency cVar) {
            LKUIFloat.f98418c = cVar;
        }

        @JvmStatic
        /* renamed from: a */
        public final Unit mo140143a(Activity activity, String str) {
            ActivityFloatManager a = m150826a(activity);
            if (a != null) {
                return a.mo140296a(str);
            }
            return null;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo140151b(Activity activity, String str) {
            ActivityFloatManager a = m150826a(activity);
            if (a != null) {
                return a.mo140298b(str);
            }
            return false;
        }

        @JvmStatic
        /* renamed from: c */
        public final View mo140152c(Activity activity, String str) {
            ActivityFloatManager a = m150826a(activity);
            if (a != null) {
                return a.mo140299c(str);
            }
            return null;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo140145a(Application application, IFloatDependency cVar) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            Intrinsics.checkParameterIsNotNull(cVar, "dependency");
            if (LKUIFloat.f98417b.compareAndSet(false, true)) {
                mo140146a(cVar);
                AppStateHandler.f98493a.mo140252a(application);
                AppStateHandler.f98493a.mo140251a();
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo140148a(String str, List<Rect> list) {
            Intrinsics.checkParameterIsNotNull(list, "rect");
            FloatManager.f98554a.mo140331a(str, list);
        }

        /* renamed from: a */
        public final void mo140149a(String str, boolean z) {
            AppFloatManager e = FloatManager.f98554a.mo140335e(str);
            if (e != null) {
                e.mo140306a(z);
            }
        }

        /* renamed from: a */
        public final void mo140147a(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            AppFloatManager e = FloatManager.f98554a.mo140335e(str);
            if (e != null) {
                e.mo140308b(i, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\fH\u0016J#\u0010\u0014\u001a\u00020\u00002\u001b\u0010\u0015\u001a\u0017\u0012\b\u0012\u00060\u0017R\u00020\u0018\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\fJ'\u0010,\u001a\u00020\u00002\u001a\u0010-\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030/0.\"\u0006\u0012\u0002\b\u00030/¢\u0006\u0002\u00100J\u001f\u00101\u001a\u00020\u00002\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0.\"\u00020\n¢\u0006\u0002\u00103J$\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u000206H\u0007J\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\fJ\u000e\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\fJ\u001c\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u0002062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0016\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u0002062\u0006\u0010A\u001a\u000206J\u001a\u0010B\u001a\u00020\u00002\b\b\u0002\u0010C\u001a\u00020\f2\b\b\u0002\u0010D\u001a\u00020\fJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\fJ\u000e\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020IJ\u000e\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020LJ\u0010\u0010M\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010\nJ\u0006\u0010O\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/ss/android/lark/floating/LKUIFloat$Builder;", "Lcom/ss/android/lark/floating/interfaces/OnPermissionResult;", "activity", "Landroid/content/Context;", "(Landroid/content/Context;)V", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "callbackCreateFailed", "", "reason", "", "checkUninitialized", "", "createActivityFloat", "createAppFloat", "hasEditText", "invokeView", "Lcom/ss/android/lark/floating/interfaces/OnInvokeView;", "permissionResult", "isOpen", "registerCallback", "builder", "Lkotlin/Function1;", "Lcom/ss/android/lark/floating/interfaces/FloatCallbacks$Builder;", "Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;", "Lkotlin/ExtensionFunctionType;", "registerCallbacks", "callbacks", "Lcom/ss/android/lark/floating/interfaces/OnFloatCallbacks;", "requestPermission", "setAnimator", "floatAnimator", "Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;", "setAppFloatAnimator", "appFloatAnimator", "Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;", "setDimBehind", "dim", "", "setDisplayHeight", "displayHeight", "Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;", "setDragEnable", "dragEnable", "setFilter", "clazz", "", "Ljava/lang/Class;", "([Ljava/lang/Class;)Lcom/ss/android/lark/floating/LKUIFloat$Builder;", "setFilterNames", "clazzName", "([Ljava/lang/String;)Lcom/ss/android/lark/floating/LKUIFloat$Builder;", "setGravity", "gravity", "", "offsetX", "offsetY", "setHardwareAccelerated", "hardwareAccelerated", "setKeepScreenOn", "keepScreenOn", "setLayout", "layoutId", "setLocation", "x", "y", "setMatchParent", "widthMatch", "heightMatch", "setNeedRequestPermission", "banRequestPermission", "setShowPattern", "showPattern", "Lcom/ss/android/lark/floating/enums/ShowPattern;", "setSidePattern", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "setTag", "floatTag", "show", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.a$a */
    public static final class Builder implements OnPermissionResult {

        /* renamed from: a */
        private final FloatConfig f98420a = new FloatConfig(null, null, null, null, false, false, false, false, false, null, null, false, false, false, BitmapDescriptorFactory.HUE_RED, false, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, -1, null);

        /* renamed from: b */
        private final Context f98421b;

        /* renamed from: a */
        public final Builder mo140136a(String... strArr) {
            Intrinsics.checkParameterIsNotNull(strArr, "clazzName");
            Builder aVar = this;
            for (String str : strArr) {
                aVar.f98420a.mo140169C().add(str);
                Context context = aVar.f98421b;
                if (context instanceof Activity) {
                    ComponentName componentName = ((Activity) context).getComponentName();
                    Intrinsics.checkExpressionValueIsNotNull(componentName, "activity.componentName");
                    if (Intrinsics.areEqual(str, componentName.getClassName())) {
                        aVar.f98420a.mo140198g(true);
                    }
                }
                IFloatDependency a = LKUIFloat.f98419d.mo140142a();
                Activity a2 = a != null ? a.mo102716a() : null;
                if (a2 != null) {
                    ComponentName componentName2 = a2.getComponentName();
                    Intrinsics.checkExpressionValueIsNotNull(componentName2, "topActivity.componentName");
                    if (Intrinsics.areEqual(str, componentName2.getClassName())) {
                        aVar.f98420a.mo140198g(true);
                    }
                }
            }
            return aVar;
        }

        /* renamed from: a */
        public final void mo140137a() {
            if (this.f98420a.mo140184b() == null) {
                m150808b("No layout exception. You need to set up the layout file.");
            } else if (m150809b()) {
                m150808b("Uninitialized exception. You need to initialize in the application.");
            } else if (this.f98420a.mo140204j() == ShowPattern.CURRENT_ACTIVITY) {
                m150810c();
            } else if (PermissionUtils.m150948a(this.f98421b)) {
                m150811d();
            } else if (!this.f98420a.mo140207m()) {
                m150812e();
            } else {
                Log.m165389i("LKUIFloat", "ban request float permission and permission is Denied");
            }
        }

        /* renamed from: d */
        private final void m150811d() {
            FloatManager.f98554a.mo140329a(this.f98421b, this.f98420a);
        }

        /* renamed from: c */
        private final void m150810c() {
            Context context = this.f98421b;
            if (context instanceof Activity) {
                new ActivityFloatManager((Activity) context).mo140297a(this.f98420a);
            } else {
                m150808b("Context exception. Activity float need to pass in a activity context.");
            }
        }

        /* renamed from: e */
        private final void m150812e() {
            Context context = this.f98421b;
            if (context instanceof FragmentActivity) {
                PermissionUtils.m150947a((FragmentActivity) context, this);
            } else {
                m150808b("Context exception. Request Permission need to pass in a activity context.");
            }
        }

        /* renamed from: b */
        private final boolean m150809b() {
            int i = C38338b.f98445a[this.f98420a.mo140204j().ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 || i == 3) {
                if (!LKUIFloat.f98417b.get()) {
                    return true;
                }
                return false;
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (!(!this.f98420a.mo140169C().isEmpty()) || LKUIFloat.f98417b.get()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final Builder mo140130a(OnFloatCallbacks eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "callbacks");
            Builder aVar = this;
            aVar.f98420a.mo140175a(eVar);
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo140138b(boolean z) {
            Builder aVar = this;
            aVar.f98420a.mo140193e(z);
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo140139c(boolean z) {
            Builder aVar = this;
            aVar.f98420a.mo140196f(z);
            return aVar;
        }

        @Override // com.ss.android.lark.floating.interfaces.OnPermissionResult
        /* renamed from: d */
        public void mo140140d(boolean z) {
            if (z) {
                m150811d();
            } else {
                m150808b("No permission exception. You need to turn on overlay permissions.");
            }
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "activity");
            this.f98421b = context;
        }

        /* renamed from: b */
        private final void m150808b(String str) {
            FloatCallbacks.Builder a;
            Function3<Boolean, String, View, Unit> a2;
            OnFloatCallbacks x = this.f98420a.mo140219x();
            if (x != null) {
                x.mo140244a(false, str, null);
            }
            FloatCallbacks y = this.f98420a.mo140220y();
            if (!(y == null || (a = y.mo140225a()) == null || (a2 = a.mo140227a()) == null)) {
                a2.invoke(false, str, null);
            }
            Log.m165396w(str);
            if (Intrinsics.areEqual(str, "No layout exception. You need to set up the layout file.") || Intrinsics.areEqual(str, "Uninitialized exception. You need to initialize in the application.") || Intrinsics.areEqual(str, "Context exception. Activity float need to pass in a activity context.")) {
                throw new RuntimeException(str);
            }
        }

        /* renamed from: a */
        public final Builder mo140131a(ShowPattern showPattern) {
            Intrinsics.checkParameterIsNotNull(showPattern, "showPattern");
            Builder aVar = this;
            aVar.f98420a.mo140177a(showPattern);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140132a(SidePattern sidePattern) {
            Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
            Builder aVar = this;
            aVar.f98420a.mo140178a(sidePattern);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140133a(String str) {
            Builder aVar = this;
            aVar.f98420a.mo140180a(str);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140134a(Function1<? super FloatCallbacks.Builder, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "builder");
            Builder aVar = this;
            FloatConfig aVar2 = aVar.f98420a;
            FloatCallbacks aVar3 = new FloatCallbacks();
            aVar3.mo140226a(function1);
            aVar2.mo140174a(aVar3);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140135a(boolean z) {
            Builder aVar = this;
            aVar.f98420a.mo140187b(z);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140129a(int i, AbstractC38339g gVar) {
            Builder aVar = this;
            aVar.f98420a.mo140179a(Integer.valueOf(i));
            aVar.f98420a.mo140176a(gVar);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140128a(int i, int i2, int i3) {
            Builder aVar = this;
            aVar.f98420a.mo140172a(i);
            aVar.f98420a.mo140185b(i2);
            aVar.f98420a.mo140189c(i3);
            return aVar;
        }
    }
}
