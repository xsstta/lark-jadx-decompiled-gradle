package com.ss.android.appcenter.business.tab.business.widget;

import android.util.SparseArray;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.p3400a.p3410g.AbstractC67729a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\u0006\u0010\u001d\u001a\u00020\u001aJ\u0018\u0010\u001e\u001a\u00020\t2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010 H\u0002J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockLogTracer;", "", "()V", "LOG_ERROR", "", "LOG_INFO", "LOG_WARN", "logStrLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/appcenter/business/tab/business/widget/BlockLogTracer$LogText;", "getLogStrLiveData", "()Landroidx/lifecycle/MutableLiveData;", "logger", "Lcom/tt/refer/abs/log/AbsRuntimeLogger;", "getLogger", "()Lcom/tt/refer/abs/log/AbsRuntimeLogger;", "mCurrentLogLevel", "getMCurrentLogLevel", "()I", "setMCurrentLogLevel", "(I)V", "mQueueSparseIntArray", "Landroid/util/SparseArray;", "", "", "appendLog", "", "it", "msg", "clearLog", "getStringFromQueue", "strList", "", "switchCurrentLogType", "logType", "Companion", "LogText", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.widget.d */
public final class BlockLogTracer {

    /* renamed from: b */
    public static final Companion f69938b = new Companion(null);

    /* renamed from: a */
    public final SparseArray<List<String>> f69939a;

    /* renamed from: c */
    private final int f69940c = 4;

    /* renamed from: d */
    private final int f69941d = 5;

    /* renamed from: e */
    private final int f69942e = 6;

    /* renamed from: f */
    private final AbstractC67729a f69943f;

    /* renamed from: g */
    private final C1177w<LogText> f69944g;

    /* renamed from: h */
    private int f69945h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockLogTracer$Companion;", "", "()V", "TAG", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockLogTracer$LogText;", "", "logString", "", "endIndex", "", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getEndIndex", "()Ljava/util/Set;", "getLogString", "()Ljava/lang/String;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.d$b */
    public static final class LogText {

        /* renamed from: a */
        private final String f69947a;

        /* renamed from: b */
        private final Set<Integer> f69948b;

        /* renamed from: a */
        public final String mo99670a() {
            return this.f69947a;
        }

        /* renamed from: b */
        public final Set<Integer> mo99671b() {
            return this.f69948b;
        }

        public LogText(String str, Set<Integer> set) {
            Intrinsics.checkParameterIsNotNull(str, "logString");
            Intrinsics.checkParameterIsNotNull(set, "endIndex");
            this.f69947a = str;
            this.f69948b = set;
        }
    }

    /* renamed from: a */
    public final AbstractC67729a mo99663a() {
        return this.f69943f;
    }

    /* renamed from: b */
    public final C1177w<LogText> mo99666b() {
        return this.f69944g;
    }

    /* renamed from: c */
    public final int mo99667c() {
        return this.f69945h;
    }

    public BlockLogTracer() {
        SparseArray<List<String>> sparseArray = new SparseArray<>(6);
        this.f69939a = sparseArray;
        this.f69944g = new C1177w<>();
        sparseArray.put(0, Collections.synchronizedList(new ArrayList()));
        sparseArray.put(4, Collections.synchronizedList(new ArrayList()));
        sparseArray.put(5, Collections.synchronizedList(new ArrayList()));
        sparseArray.put(6, Collections.synchronizedList(new ArrayList()));
        this.f69943f = new AbstractC67729a(this) {
            /* class com.ss.android.appcenter.business.tab.business.widget.BlockLogTracer.C279551 */

            /* renamed from: a */
            final /* synthetic */ BlockLogTracer f69946a;

            @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
            public void release() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f69946a = r1;
            }

            @Override // com.tt.refer.p3400a.p3410g.AbstractC67729a
            /* renamed from: a */
            public void mo99669a(int i, String str) {
                Intrinsics.checkParameterIsNotNull(str, "msg");
                AppBrandLogger.m52828d("BlockPreviewBlockViewModel", "level: " + i + " ,msg: " + str);
                List<String> list = this.f69946a.f69939a.get(i);
                if (list != null) {
                    this.f69946a.mo99665a(list, str);
                }
                List<String> list2 = this.f69946a.f69939a.get(0);
                if (list2 != null) {
                    this.f69946a.mo99665a(list2, str);
                }
                BlockLogTracer dVar = this.f69946a;
                this.f69946a.mo99666b().mo5926a(dVar.mo99662a(dVar.f69939a.get(this.f69946a.mo99667c())));
            }
        };
    }

    /* renamed from: d */
    public final void mo99668d() {
        synchronized (this) {
            this.f69939a.get(0).clear();
            this.f69939a.get(this.f69940c).clear();
            this.f69939a.get(this.f69941d).clear();
            this.f69939a.get(this.f69942e).clear();
            this.f69944g.mo5926a(new LogText("", new HashSet()));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo99664a(int i) {
        if (i == 0) {
            this.f69945h = 0;
        } else if (i == 1) {
            this.f69945h = this.f69940c;
        } else if (i == 2) {
            this.f69945h = this.f69941d;
        } else if (i == 3) {
            this.f69945h = this.f69942e;
        }
        this.f69944g.mo5926a(mo99662a(this.f69939a.get(this.f69945h)));
    }

    /* renamed from: a */
    public final LogText mo99662a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = new HashSet();
        if (list != null) {
            synchronized (this) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    hashSet.add(Integer.valueOf(sb.length()));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "stringBuilder.toString()");
        return new LogText(sb2, hashSet);
    }

    /* renamed from: a */
    public final void mo99665a(List<String> list, String str) {
        synchronized (this) {
            list.add(0, str);
            while (list.size() > 50) {
                list.remove(list.size() - 1);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
