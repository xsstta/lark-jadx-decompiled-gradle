package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21504d;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC21523a mo72751a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map<Priority, AbstractC21499b> mo72752b();

    /* renamed from: c */
    public static C21498a m77765c() {
        return new C21498a();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b */
    public static abstract class AbstractC21499b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b$a */
        public static abstract class AbstractC21500a {
            /* renamed from: a */
            public abstract AbstractC21500a mo72759a(long j);

            /* renamed from: a */
            public abstract AbstractC21500a mo72760a(Set<Flag> set);

            /* renamed from: a */
            public abstract AbstractC21499b mo72761a();

            /* renamed from: b */
            public abstract AbstractC21500a mo72762b(long j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract long mo72756a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo72757b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<Flag> mo72758c();

        /* renamed from: d */
        public static AbstractC21500a m77773d() {
            return new C21504d.C21506a().mo72760a(Collections.emptySet());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static class C21498a {

        /* renamed from: a */
        private AbstractC21523a f52150a;

        /* renamed from: b */
        private Map<Priority, AbstractC21499b> f52151b = new HashMap();

        /* renamed from: a */
        public SchedulerConfig mo72755a() {
            Objects.requireNonNull(this.f52150a, "missing required property: clock");
            if (this.f52151b.keySet().size() >= Priority.values().length) {
                Map<Priority, AbstractC21499b> map = this.f52151b;
                this.f52151b = new HashMap();
                return SchedulerConfig.m77762a(this.f52150a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: a */
        public C21498a mo72754a(AbstractC21523a aVar) {
            this.f52150a = aVar;
            return this;
        }

        /* renamed from: a */
        public C21498a mo72753a(Priority priority, AbstractC21499b bVar) {
            this.f52151b.put(priority, bVar);
            return this;
        }
    }

    /* renamed from: a */
    private static <T> Set<T> m77763a(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public static SchedulerConfig m77761a(AbstractC21523a aVar) {
        return m77765c().mo72753a(Priority.DEFAULT, AbstractC21499b.m77773d().mo72759a(30000).mo72762b(86400000).mo72761a()).mo72753a(Priority.HIGHEST, AbstractC21499b.m77773d().mo72759a(1000).mo72762b(86400000).mo72761a()).mo72753a(Priority.VERY_LOW, AbstractC21499b.m77773d().mo72759a(86400000).mo72762b(86400000).mo72760a(m77763a(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE)).mo72761a()).mo72754a(aVar).mo72755a();
    }

    /* renamed from: a */
    static SchedulerConfig m77762a(AbstractC21523a aVar, Map<Priority, AbstractC21499b> map) {
        return new C21503c(aVar, map);
    }

    /* renamed from: a */
    private void m77764a(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: a */
    public long mo72749a(Priority priority, long j, int i) {
        long a = j - mo72751a().mo72782a();
        AbstractC21499b bVar = mo72752b().get(priority);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.mo72756a(), a), bVar.mo72757b());
    }

    /* renamed from: a */
    public JobInfo.Builder mo72750a(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(mo72749a(priority, j, i));
        m77764a(builder, mo72752b().get(priority).mo72758c());
        return builder;
    }
}
