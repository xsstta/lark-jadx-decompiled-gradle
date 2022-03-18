package com.ss.android.lark.platform.lifecycle;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import com.bytedance.common.utility.reflect.Reflect;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.C29538a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.p2482c.C51791b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public class AppLifecycle {

    /* renamed from: m */
    private static Boolean f128782m;

    /* renamed from: a */
    public String f128783a;

    /* renamed from: b */
    public Context f128784b;

    /* renamed from: c */
    public WeakReference<Activity> f128785c;

    /* renamed from: d */
    public WeakReference<Activity> f128786d;

    /* renamed from: e */
    public int f128787e;

    /* renamed from: f */
    public final CopyOnWriteArrayList<C29538a> f128788f;

    /* renamed from: g */
    public AbstractC29586u.C29587a f128789g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<AbstractC29586u> f128790h;

    /* renamed from: i */
    private boolean f128791i;

    /* renamed from: j */
    private ContentObserver f128792j;

    /* renamed from: k */
    private Application.ActivityLifecycleCallbacks f128793k;

    /* renamed from: l */
    private volatile boolean f128794l;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.lifecycle.AppLifecycle$b */
    public static final class C51829b {

        /* renamed from: a */
        public static final AppLifecycle f128817a = new AppLifecycle();
    }

    /* renamed from: com.ss.android.lark.platform.lifecycle.AppLifecycle$c */
    public interface AbstractC51830c {
        String getProcessName(Context context);
    }

    /* renamed from: a */
    public static AppLifecycle m200904a() {
        return C51829b.f128817a;
    }

    /* renamed from: f */
    public boolean mo177976f() {
        return this.f128791i;
    }

    /* renamed from: g */
    public int mo177977g() {
        return this.f128787e;
    }

    public static class LifecycleContentProvider extends ContentProvider {

        /* renamed from: f */
        private static Uri f128799f;

        /* renamed from: a */
        private final List<ProcessRecord> f128800a = new ArrayList(2);

        /* renamed from: b */
        private final List<ProcessRecord> f128801b = new ArrayList(2);

        /* renamed from: c */
        private final List<ProcessRecord> f128802c = new ArrayList();

        /* renamed from: d */
        private String f128803d;

        /* renamed from: e */
        private volatile boolean f128804e;

        /* renamed from: g */
        private final RunnableC51831d f128805g = new RunnableC51831d(50);

        /* renamed from: a */
        private boolean m200948a(List<ProcessRecord> list, List<ProcessRecord> list2) {
            if (list.size() != list2.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!Objects.equals(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public boolean onCreate() {
            this.f128804e = false;
            Context context = getContext();
            if (context == null) {
                Log.m165383e("AppLifecycle", "onCreate get context is null, so return");
                return false;
            }
            m200953d(context.getApplicationContext());
            Log.m165389i("AppLifecycle", "onCreate: init top process is " + this.f128803d);
            return true;
        }

        /* renamed from: a */
        private List<ProcessRecord> m200942a() {
            ArrayList arrayList = new ArrayList(3);
            if (this.f128804e) {
                arrayList.addAll(this.f128800a);
            } else if ("foreground".equals(this.f128803d)) {
                arrayList.add(new ProcessRecord(this.f128803d, null, SystemClock.elapsedRealtime()));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m200950b() {
            Context context = getContext();
            if (context != null && !m200948a(this.f128800a, this.f128801b)) {
                try {
                    this.f128801b.clear();
                    this.f128801b.addAll(this.f128800a);
                    context.getContentResolver().notifyChange(m200952c(context), null);
                } catch (Exception e) {
                    Log.m165383e("AppLifecycle", "LifecycleContentProvider notify fail: " + e.getMessage());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ Boolean m200941a(ProcessRecord processRecord) {
            return Boolean.valueOf(Objects.equals(processRecord.f128808a, "p0"));
        }

        public String getType(Uri uri) {
            Log.m165383e("AppLifecycle", "getType not support yet!");
            return null;
        }

        /* renamed from: b */
        public static ProcessRecord m200949b(Context context) {
            Bundle a = m200939a(context, "getRecentStoppedActivity", null);
            if (a != null) {
                try {
                    a.setClassLoader(ProcessRecord.class.getClassLoader());
                    return (ProcessRecord) a.getParcelable("extra_recent_stopped_activity");
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: c */
        private static Uri m200952c(Context context) {
            if (f128799f == null) {
                f128799f = Uri.parse("content://" + context.getPackageName() + ".provider.applifecycle");
            }
            return f128799f;
        }

        /* renamed from: d */
        private void m200953d(Context context) {
            if (context == null) {
                Log.m165383e("AppLifecycle", "getForegroundProcess: context is null, so return");
                return;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                Log.m165383e("AppLifecycle", "getForegroundProcess: activityManager is null, so return");
                return;
            }
            String packageName = context.getPackageName();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.m165383e("AppLifecycle", "getForegroundProcess: get running process info  is null, so return");
                return;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(packageName)) {
                    Log.m165389i("AppLifecycle", "process name is " + runningAppProcessInfo.processName + ", process import is  " + runningAppProcessInfo.importance);
                    if (runningAppProcessInfo.importance == 100) {
                        this.f128803d = "foreground";
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public static List<ProcessRecord> m200943a(Context context) {
            Bundle a = m200939a(context, "getAppState", null);
            if (a != null) {
                return m200944a(a);
            }
            return null;
        }

        /* renamed from: a */
        private static List<ProcessRecord> m200944a(Bundle bundle) {
            String[] stringArray = bundle.getStringArray("extra_top_process");
            String[] stringArray2 = bundle.getStringArray("extra_activity");
            long j = bundle.getLong("extra_timestamp", bundle.getLong("extra_timestamp"));
            if (stringArray == null || stringArray2 == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(stringArray.length);
            for (int i = 0; i < stringArray.length; i++) {
                arrayList.add(new ProcessRecord(stringArray[i], stringArray2[i], j));
            }
            return arrayList;
        }

        /* renamed from: b */
        public static void m200951b(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }

        public Uri insert(Uri uri, ContentValues contentValues) {
            Log.m165383e("AppLifecycle", "insert not support yet!");
            return uri;
        }

        /* renamed from: a */
        private ProcessRecord m200940a(List<ProcessRecord> list, String str) {
            for (int i = 0; i < list.size(); i++) {
                ProcessRecord processRecord = list.get(i);
                if (str.equals(processRecord.f128808a)) {
                    return processRecord;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m200945a(Context context, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(m200952c(context), true, contentObserver);
        }

        public int delete(Uri uri, String str, String[] strArr) {
            Log.m165383e("AppLifecycle", "delete not support yet!");
            return 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static Bundle m200939a(Context context, String str, Bundle bundle) {
            try {
                return context.getContentResolver().call(m200952c(context), str, "", bundle);
            } catch (Exception e) {
                e.printStackTrace();
                Log.m165383e("AppLifecycle", String.format("call method %s failed: %s", str, e.getMessage()));
                return null;
            }
        }

        public Bundle call(String str, String str2, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            if ("getAppState".equals(str)) {
                List<ProcessRecord> a = m200942a();
                String[] strArr = new String[a.size()];
                String[] strArr2 = new String[a.size()];
                long j = 0;
                for (int i = 0; i < a.size(); i++) {
                    ProcessRecord processRecord = a.get(i);
                    strArr[i] = processRecord.f128808a;
                    strArr2[i] = processRecord.f128809b;
                    j = Math.max(j, processRecord.f128810c);
                }
                if (j == 0) {
                    j = SystemClock.elapsedRealtime();
                }
                bundle2.putStringArray("extra_top_process", strArr);
                bundle2.putStringArray("extra_activity", strArr2);
                bundle2.putLong("extra_timestamp", j);
                return bundle2;
            }
            if ("getRecentStoppedActivity".equals(str)) {
                if (this.f128802c.isEmpty()) {
                    return null;
                }
                bundle2.putParcelable("extra_recent_stopped_activity", (ProcessRecord) CollectionsKt.last((List) this.f128802c));
            }
            if (bundle == null) {
                return bundle2;
            }
            String string = bundle.getString("extra_current_process");
            boolean z = bundle.getBoolean("extra_is_front");
            String string2 = bundle.getString("extra_activity");
            Lifecycle.Event event = Lifecycle.Event.values()[bundle.getInt("extra_lifecycle_event")];
            final ProcessRecord processRecord2 = new ProcessRecord(string, string2, bundle.getLong("extra_timestamp"));
            if (!TextUtils.isEmpty(string) && "processToBackground".equals(str)) {
                this.f128804e = true;
                ProcessRecord a2 = m200940a(this.f128800a, string);
                if (a2 == null || a2.f128810c < processRecord2.f128810c) {
                    if (event.compareTo((Enum) Lifecycle.Event.ON_START) <= 0 && z) {
                        this.f128800a.add(processRecord2);
                        Collections.sort(this.f128800a);
                    }
                    if (event.compareTo((Enum) Lifecycle.Event.ON_STOP) >= 0 && a2 != null) {
                        C51832a.m200964a(this.f128800a, new Function1<ProcessRecord, Boolean>() {
                            /* class com.ss.android.lark.platform.lifecycle.AppLifecycle.LifecycleContentProvider.C518251 */

                            /* renamed from: a */
                            public Boolean invoke(ProcessRecord processRecord) {
                                return Boolean.valueOf(processRecord2.f128809b.equals(processRecord.f128809b));
                            }
                        });
                    }
                }
                if (event == Lifecycle.Event.ON_STOP) {
                    this.f128802c.add(processRecord2);
                }
                if (event == Lifecycle.Event.ON_DESTROY || event == Lifecycle.Event.ON_START) {
                    int size = this.f128802c.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        ProcessRecord processRecord3 = this.f128802c.get(size);
                        if (Objects.equals(processRecord3.f128809b, string2)) {
                            this.f128802c.remove(processRecord3);
                            break;
                        }
                        size--;
                    }
                    if (!C51836c.m200983a(getContext())) {
                        CollectionsKt.removeAll((List) this.f128802c, (Function1) $$Lambda$AppLifecycle$LifecycleContentProvider$CG9JcfyfBANc5xbtAmjiedIuIs.INSTANCE);
                    }
                }
                this.f128805g.mo178003a(new Runnable() {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$LifecycleContentProvider$GdHiyCDPXBqpR4BQmwTi3aLhyO0 */

                    public final void run() {
                        AppLifecycle.LifecycleContentProvider.this.m200950b();
                    }
                });
            }
            return bundle2;
        }

        public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            Log.m165383e("AppLifecycle", "update not support yet!");
            return 0;
        }

        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            Log.m165383e("AppLifecycle", "query not support yet!");
            return null;
        }

        /* renamed from: a */
        public static void m200947a(Context context, String str, Activity activity, Lifecycle.Event event, boolean z, long j) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_current_process", str);
            bundle.putBoolean("extra_is_front", z);
            bundle.putLong("extra_timestamp", j);
            if (activity != null) {
                bundle.putString("extra_activity", activity.getClass().getName());
                bundle.putInt("extra_lifecycle_event", event.ordinal());
            }
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context, bundle) {
                /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$LifecycleContentProvider$TZ27poMCx6Z995roOZuHXhtnaFY */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ Bundle f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    AppLifecycle.LifecycleContentProvider.m200939a(this.f$0, "processToBackground", this.f$1);
                }
            });
        }
    }

    /* renamed from: com.ss.android.lark.platform.lifecycle.AppLifecycle$a */
    public static class C51827a {

        /* renamed from: a */
        public final Context f128811a;

        /* renamed from: b */
        public final List<String> f128812b;

        /* renamed from: c */
        public final AbstractC51830c f128813c;

        /* renamed from: com.ss.android.lark.platform.lifecycle.AppLifecycle$a$a */
        public static final class C51828a {

            /* renamed from: a */
            public final Context f128814a;

            /* renamed from: b */
            public final List<String> f128815b = new ArrayList();

            /* renamed from: c */
            public AbstractC51830c f128816c;

            /* renamed from: a */
            public C51827a mo178002a() {
                return new C51827a(this);
            }

            /* renamed from: a */
            public C51828a mo178000a(AbstractC51830c cVar) {
                this.f128816c = cVar;
                return this;
            }

            /* renamed from: a */
            public C51828a mo178001a(String str) {
                this.f128815b.add(str);
                return this;
            }

            public C51828a(Context context) {
                this.f128814a = context;
            }
        }

        private C51827a(C51828a aVar) {
            List<String> list;
            this.f128811a = aVar.f128814a;
            if (aVar.f128815b == null) {
                list = new ArrayList<>();
            } else {
                list = aVar.f128815b;
            }
            this.f128812b = list;
            this.f128813c = aVar.f128816c;
        }
    }

    /* renamed from: com.ss.android.lark.platform.lifecycle.AppLifecycle$d */
    private static class RunnableC51831d implements Runnable {

        /* renamed from: a */
        private final int f128818a;

        /* renamed from: b */
        private final Handler f128819b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private Runnable f128820c;

        public void run() {
            Runnable runnable = this.f128820c;
            if (runnable != null) {
                runnable.run();
            }
            this.f128820c = null;
        }

        /* renamed from: a */
        public void mo178003a(Runnable runnable) {
            this.f128820c = runnable;
            this.f128819b.removeCallbacks(this);
            this.f128819b.postDelayed(this, (long) this.f128818a);
        }

        public RunnableC51831d(int i) {
            this.f128818a = i;
        }
    }

    /* renamed from: d */
    public boolean mo177974d() {
        AbstractC29586u.C29587a aVar = this.f128789g;
        if (aVar == null || !aVar.mo105888d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo177975e() {
        AbstractC29586u.C29587a aVar = this.f128789g;
        if (aVar == null || !aVar.mo105887c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m200908c() {
        if (f128782m == null) {
            f128782m = Boolean.valueOf(C37239a.m146648b().mo136951a("lark.app.lifecycle.fix.async"));
        }
        return f128782m.booleanValue();
    }

    /* renamed from: b */
    public void mo177970b() {
        Log.m165389i("AppLifecycle", "setupGlobalAppStateObserver ");
        Context context = this.f128784b;
        if (context instanceof Application) {
            m200906a((Application) context);
        }
    }

    /* renamed from: h */
    public Activity mo177978h() {
        if (mo177974d()) {
            return this.f128785c.get();
        }
        return null;
    }

    /* renamed from: i */
    public Activity mo177979i() {
        if (mo177974d()) {
            return this.f128786d.get();
        }
        return null;
    }

    /* renamed from: j */
    public String mo177980j() {
        if (this.f128785c.get() != null) {
            return this.f128785c.get().getClass().getName();
        }
        return "";
    }

    public static class ProcessRecord implements Parcelable, Comparable<ProcessRecord> {
        public static final Parcelable.Creator<ProcessRecord> CREATOR = new Parcelable.Creator<ProcessRecord>() {
            /* class com.ss.android.lark.platform.lifecycle.AppLifecycle.ProcessRecord.C518261 */

            /* renamed from: a */
            public ProcessRecord[] newArray(int i) {
                return new ProcessRecord[i];
            }

            /* renamed from: a */
            public ProcessRecord createFromParcel(Parcel parcel) {
                return new ProcessRecord(parcel);
            }
        };

        /* renamed from: a */
        public final String f128808a;

        /* renamed from: b */
        public final String f128809b;

        /* renamed from: c */
        public final long f128810c;

        public int describeContents() {
            return 0;
        }

        public int hashCode() {
            int i;
            String str = this.f128808a;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.f128809b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f128810c;
            return ((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)));
        }

        ProcessRecord(Parcel parcel) {
            this.f128808a = parcel.readString();
            this.f128809b = parcel.readString();
            this.f128810c = parcel.readLong();
        }

        /* renamed from: a */
        public int compareTo(ProcessRecord processRecord) {
            int i = ((this.f128810c - processRecord.f128810c) > 0 ? 1 : ((this.f128810c - processRecord.f128810c) == 0 ? 0 : -1));
            if (i < 0) {
                return 1;
            }
            if (i > 0) {
                return -1;
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProcessRecord processRecord = (ProcessRecord) obj;
            if (this.f128810c == processRecord.f128810c && Objects.equals(this.f128808a, processRecord.f128808a)) {
                return Objects.equals(this.f128809b, processRecord.f128809b);
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f128808a);
            parcel.writeString(this.f128809b);
            parcel.writeLong(this.f128810c);
        }

        ProcessRecord(String str, String str2, long j) {
            this.f128808a = str;
            this.f128809b = str2;
            this.f128810c = j;
        }
    }

    private AppLifecycle() {
        this.f128785c = new WeakReference<>(null);
        this.f128786d = new WeakReference<>(null);
        this.f128789g = new AbstractC29586u.C29587a();
        this.f128791i = false;
        this.f128794l = false;
        this.f128790h = new CopyOnWriteArrayList<>();
        this.f128788f = new CopyOnWriteArrayList<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m200907a(AbstractC29586u.C29587a aVar) {
        mo177966a(this.f128789g, aVar);
    }

    /* renamed from: b */
    public AbstractC29586u.C29587a mo177969b(Context context) {
        return C51832a.m200962a(context, this.f128783a);
    }

    /* renamed from: c */
    public ProcessRecord mo177973c(Context context) {
        return LifecycleContentProvider.m200949b(context);
    }

    /* renamed from: a */
    public void mo177965a(C29538a aVar) {
        if (!this.f128788f.contains(aVar)) {
            this.f128788f.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo177971b(C29538a aVar) {
        this.f128788f.remove(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m200909d(Context context) {
        new Handler(Looper.getMainLooper()).post(new Runnable(mo177969b(context)) {
            /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$xilX2tKzlh5iggpFPzIxdYjeIlk */
            public final /* synthetic */ AbstractC29586u.C29587a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppLifecycle.this.m200907a((AppLifecycle) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo177964a(Context context) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context) {
            /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$JUA9XmA7CxLnoz6RDwMZn3uRkNw */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AppLifecycle.this.m200909d(this.f$1);
            }
        });
    }

    /* renamed from: b */
    public void mo177972b(AbstractC29586u uVar) {
        this.f128790h.remove(uVar);
    }

    /* renamed from: a */
    private void m200906a(final Application application) {
        ContentObserver contentObserver = this.f128792j;
        if (contentObserver != null) {
            LifecycleContentProvider.m200951b(application, contentObserver);
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f128793k;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        this.f128789g = AbstractC29586u.C29587a.m109237a(m200905a(new String[0], this.f128783a), mo177980j(), this.f128783a, 0);
        mo177964a((Context) application);
        C518231 r0 = new ContentObserver(new Handler(Looper.getMainLooper())) {
            /* class com.ss.android.lark.platform.lifecycle.AppLifecycle.C518231 */

            public void onChange(boolean z) {
                if (AppLifecycle.m200908c()) {
                    AppLifecycle appLifecycle = AppLifecycle.this;
                    appLifecycle.mo177964a(appLifecycle.f128784b);
                    return;
                }
                AppLifecycle appLifecycle2 = AppLifecycle.this;
                appLifecycle2.mo177966a(appLifecycle2.f128789g, AppLifecycle.this.mo177969b(application));
            }
        };
        this.f128792j = r0;
        LifecycleContentProvider.m200945a(application, r0);
        C518242 r02 = new C29538a() {
            /* class com.ss.android.lark.platform.lifecycle.AppLifecycle.C518242 */

            /* renamed from: b */
            private int f128798b;

            /* renamed from: a */
            private AbstractC29586u.C29587a m200928a() {
                return AbstractC29586u.C29587a.m109237a(AppLifecycle.this.f128783a, AppLifecycle.this.mo177980j(), AppLifecycle.this.f128783a, SystemClock.elapsedRealtime());
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityDestroyed(Activity activity) {
                AppLifecycle appLifecycle = AppLifecycle.this;
                appLifecycle.f128787e--;
                m200933a("onActivityDestroyed", new Function1(activity) {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$2$dMLBNIBbPTB3juxwjleb2xWCTFo */
                    public final /* synthetic */ Activity f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(this.f$0);
                    }
                });
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityStarted(Activity activity) {
                this.f128798b++;
                m200932a(activity, Lifecycle.Event.ON_START);
                m200933a("onActivityStarted", new Function1(activity) {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$2$wr6A7mjGpLUJ49D4Z1XUH8PcQyA */
                    public final /* synthetic */ Activity f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(this.f$0);
                    }
                });
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityStopped(Activity activity) {
                this.f128798b--;
                m200932a(activity, Lifecycle.Event.ON_STOP);
                m200933a("onActivityStopped", new Function1(activity) {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$2$6W2AKPKC_2rfXYJrV0a7SkUA7KQ */
                    public final /* synthetic */ Activity f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(this.f$0);
                    }
                });
            }

            /* renamed from: a */
            private boolean m200934a(Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_STOP || event == Lifecycle.Event.ON_DESTROY) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityPaused(Activity activity) {
                Log.m165389i("AppLifecycle", String.format("%s pause", activity.getClass().getSimpleName()));
                m200932a(activity, Lifecycle.Event.ON_PAUSE);
                m200933a("onActivityPaused", new Function1(activity) {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$2$LdM88tV0zcLpY2Z3DKw7STV1ZDM */
                    public final /* synthetic */ Activity f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(this.f$0);
                    }
                });
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityResumed(Activity activity) {
                Log.m165389i("AppLifecycle", String.format("%s resume", activity.getClass().getSimpleName()));
                m200932a(activity, Lifecycle.Event.ON_RESUME);
                m200933a("onActivityResumed", new Function1(activity) {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$2$R1KgOy24P5dPDAWTugxwrdcttPE */
                    public final /* synthetic */ Activity f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(this.f$0);
                    }
                });
            }

            /* renamed from: a */
            private void m200931a(Activity activity) {
                try {
                    Log.m165389i("AppLifecycle", String.format("referer: %s, %s", activity.getReferrer(), (String) Reflect.on(activity).get("mReferrer", String.class)));
                } catch (Exception e) {
                    Log.m165382e("logAppFrontSource failed: " + e.getMessage());
                }
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityCreated(Activity activity, Bundle bundle) {
                AppLifecycle.this.f128787e++;
                m200933a("onActivityCreated", new Function1(activity, bundle) {
                    /* class com.ss.android.lark.platform.lifecycle.$$Lambda$AppLifecycle$2$j_q5rdLvbl3KQOgoJmsiqt9k23g */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ Bundle f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(this.f$0, this.f$1);
                    }
                });
            }

            /* renamed from: a */
            private void m200933a(String str, Function1<Application.ActivityLifecycleCallbacks, Void> function1) {
                Iterator<C29538a> it = AppLifecycle.this.f128788f.iterator();
                while (it.hasNext()) {
                    C29538a next = it.next();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    function1.invoke(next);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 > 5) {
                        Log.m165383e("AppLifecycle", String.format("%s %s cost %sms", next.getClass().getName(), str, Long.valueOf(elapsedRealtime2)));
                    }
                }
            }

            /* renamed from: a */
            private void m200932a(Activity activity, Lifecycle.Event event) {
                boolean z;
                boolean z2;
                boolean z3;
                Activity activity2 = AppLifecycle.this.f128785c.get();
                if (activity2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f128798b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z || !z2 || activity2 == activity) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (event.ordinal() < Lifecycle.Event.ON_STOP.ordinal()) {
                    AppLifecycle.this.f128785c = new WeakReference<>(activity);
                }
                if (AppLifecycle.this.mo177968a(activity)) {
                    if (event.ordinal() < Lifecycle.Event.ON_STOP.ordinal()) {
                        AppLifecycle.this.f128786d = new WeakReference<>(activity);
                    } else if (AppLifecycle.this.f128786d.get() == activity && event.ordinal() >= Lifecycle.Event.ON_STOP.ordinal()) {
                        AppLifecycle.this.f128786d = new WeakReference<>(null);
                    }
                }
                if (!z && z2) {
                    Log.m165389i("AppLifecycle", String.format("%s to front", AppLifecycle.this.f128783a));
                    C51791b.m200791a().mo103630a().mo103634a(true);
                    AbstractC29586u.C29587a a = m200928a();
                    if (AppLifecycle.m200908c()) {
                        AppLifecycle appLifecycle = AppLifecycle.this;
                        appLifecycle.mo177966a(appLifecycle.f128789g, m200928a());
                    }
                    m200931a(activity);
                    LifecycleContentProvider.m200947a(AppLifecycle.this.f128784b, AppLifecycle.this.f128783a, activity, event, true, a.mo105889e());
                } else if (z && !z2) {
                    Log.m165389i("AppLifecycle", String.format("%s to background", AppLifecycle.this.f128783a));
                    LifecycleContentProvider.m200947a(AppLifecycle.this.f128784b, AppLifecycle.this.f128783a, activity, event, false, SystemClock.elapsedRealtime());
                } else if (z3) {
                    if (!AppLifecycle.m200908c()) {
                        AppLifecycle appLifecycle2 = AppLifecycle.this;
                        appLifecycle2.mo177966a(appLifecycle2.f128789g, m200928a());
                    } else if (!AppLifecycle.this.f128789g.mo105887c()) {
                        Log.m165385e("AppLifecycle", "detect app state error", new Throwable("detect app state error"), true);
                        AppLifecycle appLifecycle3 = AppLifecycle.this;
                        appLifecycle3.mo177966a(appLifecycle3.f128789g, m200928a());
                    }
                    if (m200934a(event)) {
                        LifecycleContentProvider.m200947a(AppLifecycle.this.f128784b, AppLifecycle.this.f128783a, activity, event, true, m200928a().mo105889e());
                    }
                } else if (m200934a(event)) {
                    AbstractC29586u.C29587a a2 = m200928a();
                    AppLifecycle appLifecycle4 = AppLifecycle.this;
                    appLifecycle4.mo177966a(appLifecycle4.f128789g, a2);
                    LifecycleContentProvider.m200947a(AppLifecycle.this.f128784b, AppLifecycle.this.f128783a, activity, event, true, a2.mo105889e());
                }
            }
        };
        this.f128793k = r02;
        application.registerActivityLifecycleCallbacks(r02);
        this.f128794l = true;
    }

    /* renamed from: a */
    public AppLifecycle mo177963a(C51827a aVar) {
        Application application;
        Context context = aVar.f128811a;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) context.getApplicationContext();
        }
        this.f128784b = application;
        String processName = aVar.f128813c.getProcessName(context);
        if (TextUtils.isEmpty(processName)) {
            processName = "main";
        }
        this.f128783a = processName;
        for (String str : aVar.f128812b) {
            if (this.f128783a.startsWith(str)) {
                Log.m165389i("AppLifecycle", "init func, process " + str + ", not call setup");
                this.f128794l = true;
                return this;
            }
        }
        m200906a(application);
        this.f128794l = true;
        return this;
    }

    /* renamed from: a */
    public void mo177967a(AbstractC29586u uVar) {
        this.f128790h.add(uVar);
    }

    /* renamed from: a */
    public boolean mo177968a(Activity activity) {
        return !activity.getClass().getSimpleName().equals("MainActivity");
    }

    /* renamed from: a */
    private String m200905a(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0 || str == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return str;
            }
        }
        return strArr[0];
    }

    /* renamed from: a */
    public void mo177966a(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        if (this.f128789g.mo105889e() <= aVar2.mo105889e() && !this.f128789g.equals(aVar2)) {
            this.f128789g = aVar2;
            if (aVar2.mo105887c()) {
                Log.m165379d("AppLifecycle", "set sAppHasFont is true");
                this.f128791i = true;
            }
            Iterator<AbstractC29586u> it = this.f128790h.iterator();
            while (it.hasNext()) {
                it.next().onAppLifecycleChanged(aVar, aVar2);
            }
        }
    }
}
