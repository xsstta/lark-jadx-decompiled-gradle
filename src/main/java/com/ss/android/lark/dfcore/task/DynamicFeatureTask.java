package com.ss.android.lark.dfcore.task;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dfcore.config.C36608a;
import com.ss.android.lark.dfcore.config.C36609b;
import com.ss.android.lark.dfcore.p1800b.AbstractC36599a;
import com.ss.android.lark.dfcore.p1800b.AbstractC36600b;
import com.ss.android.lark.dfcore.p1800b.AbstractC36601c;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class DynamicFeatureTask implements Parcelable {
    public static final Parcelable.Creator<DynamicFeatureTask> CREATOR = new Parcelable.Creator<DynamicFeatureTask>() {
        /* class com.ss.android.lark.dfcore.task.DynamicFeatureTask.C366131 */

        /* renamed from: a */
        public DynamicFeatureTask[] newArray(int i) {
            return new DynamicFeatureTask[i];
        }

        /* renamed from: a */
        public DynamicFeatureTask createFromParcel(Parcel parcel) {
            return new DynamicFeatureTask(parcel);
        }
    };

    /* renamed from: a */
    public long f94212a;

    /* renamed from: b */
    public AbstractC36614a f94213b;

    /* renamed from: c */
    private String f94214c;

    /* renamed from: d */
    private String f94215d;

    /* renamed from: e */
    private Locale f94216e;

    /* renamed from: f */
    private int f94217f;

    /* renamed from: g */
    private C36609b f94218g;

    /* renamed from: h */
    private WeakReference<AbstractC36600b> f94219h;

    /* renamed from: i */
    private WeakReference<AbstractC36599a> f94220i;

    /* renamed from: j */
    private WeakReference<AbstractC36601c> f94221j;

    /* renamed from: k */
    private HashSet<Object> f94222k;

    /* renamed from: l */
    private int f94223l;

    /* renamed from: m */
    private boolean f94224m;

    /* renamed from: n */
    private long f94225n;

    /* renamed from: o */
    private long f94226o;

    /* renamed from: p */
    private Timer f94227p;

    /* renamed from: com.ss.android.lark.dfcore.task.DynamicFeatureTask$a */
    public interface AbstractC36614a {
        /* renamed from: a */
        void mo135015a();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo135040a() {
        return this.f94214c;
    }

    /* renamed from: b */
    public String mo135050b() {
        return this.f94215d;
    }

    /* renamed from: f */
    public Locale mo135056f() {
        return this.f94216e;
    }

    /* renamed from: g */
    public int mo135057g() {
        return this.f94217f;
    }

    /* renamed from: h */
    public C36609b mo135058h() {
        return this.f94218g;
    }

    /* renamed from: j */
    public boolean mo135061j() {
        return this.f94224m;
    }

    /* renamed from: l */
    public int mo135063l() {
        return this.f94223l;
    }

    /* renamed from: a */
    public void mo135048a(Locale locale) {
        this.f94216e = new Locale(locale.getLanguage());
    }

    /* renamed from: a */
    public void mo135047a(DynamicFeatureTask dynamicFeatureTask) {
        this.f94219h = m144447a((Object) dynamicFeatureTask.mo135051c());
        this.f94220i = m144447a((Object) dynamicFeatureTask.mo135052d());
        this.f94221j = m144447a((Object) dynamicFeatureTask.mo135054e());
        this.f94218g = dynamicFeatureTask.f94218g;
        this.f94223l = dynamicFeatureTask.mo135063l();
    }

    /* renamed from: a */
    public void mo135049a(boolean z) {
        this.f94224m = z;
    }

    /* renamed from: i */
    public boolean mo135060i() {
        return DynamicFeatureCore.install(this);
    }

    /* renamed from: o */
    private boolean m144450o() {
        C36609b bVar = this.f94218g;
        if (bVar == null) {
            return false;
        }
        return bVar.mo135037b();
    }

    /* renamed from: c */
    public AbstractC36600b mo135051c() {
        WeakReference<AbstractC36600b> weakReference = this.f94219h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: d */
    public AbstractC36599a mo135052d() {
        WeakReference<AbstractC36599a> weakReference = this.f94220i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: e */
    public AbstractC36601c mo135054e() {
        WeakReference<AbstractC36601c> weakReference = this.f94221j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: m */
    public boolean mo135064m() {
        if (this.f94226o <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void mo135065n() {
        Timer timer = this.f94227p;
        if (timer != null) {
            timer.cancel();
            this.f94227p = null;
        }
        this.f94213b = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.dfcore.task.DynamicFeatureTask$b */
    public class C36615b extends TimerTask {
        public void run() {
            if (System.currentTimeMillis() - DynamicFeatureTask.this.f94212a > C36608a.f94188e && DynamicFeatureTask.this.f94213b != null) {
                DynamicFeatureTask.this.f94213b.mo135015a();
            }
        }

        private C36615b() {
        }
    }

    public int hashCode() {
        int i;
        String str = this.f94215d;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (527 + i) * 31;
        String str2 = this.f94214c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: k */
    public long mo135062k() {
        if (this.f94212a <= 0) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f94212a;
        if (currentTimeMillis < C36608a.f94185b) {
            return C36608a.f94185b - currentTimeMillis;
        }
        return 0;
    }

    public DynamicFeatureTask() {
        this.f94217f = 2;
        this.f94218g = new C36609b.C36611a().mo135039a();
        this.f94222k = new HashSet<>();
        this.f94224m = false;
        this.f94212a = -1;
        this.f94225n = 0;
        this.f94226o = 0;
        this.f94223l = System.identityHashCode(this);
    }

    public String toString() {
        return "DynamicFeatureTask{moduleName='" + this.f94214c + '\'' + ", packageName='" + this.f94215d + '\'' + ", locale=" + this.f94216e + ", installResultListener=" + this.f94219h + ", installProgressListener=" + this.f94220i + ", installStateListener=" + this.f94221j + ", identity=" + this.f94223l + ", isCanceledByUser=" + this.f94224m + ", startDownloadTime=" + this.f94212a + '}';
    }

    /* renamed from: a */
    public void mo135041a(long j) {
        this.f94212a = j;
    }

    public DynamicFeatureTask(String str) {
        this();
        this.f94214c = str;
        m144449a(str);
    }

    /* renamed from: a */
    private final <T> WeakReference<T> m144447a(T t) {
        return m144448a(t, m144450o());
    }

    /* renamed from: a */
    private void m144449a(String str) {
        if (str.startsWith("df_language")) {
            this.f94215d = "com.ss.android.lark.dflanguage";
        } else {
            this.f94215d = DynamicFeatureUtils.getPackageName(str);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DynamicFeatureTask)) {
            return super.equals(obj);
        }
        DynamicFeatureTask dynamicFeatureTask = (DynamicFeatureTask) obj;
        if (!this.f94215d.equals(dynamicFeatureTask.mo135050b()) || !this.f94214c.equals(dynamicFeatureTask.mo135040a())) {
            return false;
        }
        return true;
    }

    protected DynamicFeatureTask(Parcel parcel) {
        this.f94217f = 2;
        this.f94218g = new C36609b.C36611a().mo135039a();
        this.f94222k = new HashSet<>();
        this.f94224m = false;
        this.f94212a = -1;
        this.f94225n = 0;
        this.f94226o = 0;
        this.f94214c = parcel.readString();
        this.f94215d = parcel.readString();
        this.f94216e = (Locale) parcel.readSerializable();
        this.f94217f = parcel.readInt();
    }

    /* renamed from: a */
    public void mo135042a(AbstractC36599a aVar) {
        this.f94220i = m144447a((Object) aVar);
    }

    /* renamed from: a */
    public void mo135043a(AbstractC36600b bVar) {
        this.f94219h = m144447a((Object) bVar);
    }

    /* renamed from: a */
    public void mo135044a(AbstractC36601c cVar) {
        this.f94221j = m144447a((Object) cVar);
    }

    /* renamed from: a */
    public void mo135045a(C36609b bVar) {
        this.f94218g = bVar;
    }

    /* renamed from: a */
    public void mo135046a(AbstractC36614a aVar) {
        this.f94213b = aVar;
        Timer timer = new Timer();
        this.f94227p = timer;
        timer.schedule(new C36615b(), C36608a.f94188e);
    }

    /* renamed from: a */
    private final <T> WeakReference<T> m144448a(T t, boolean z) {
        if (t == null) {
            return null;
        }
        if (z) {
            this.f94222k.add(t);
        }
        return new WeakReference<>(t);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f94214c);
        parcel.writeString(this.f94215d);
        parcel.writeSerializable(this.f94216e);
        parcel.writeInt(this.f94217f);
    }
}
