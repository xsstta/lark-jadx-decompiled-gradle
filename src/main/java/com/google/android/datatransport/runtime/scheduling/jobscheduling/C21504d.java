package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
final class C21504d extends SchedulerConfig.AbstractC21499b {

    /* renamed from: a */
    private final long f52160a;

    /* renamed from: b */
    private final long f52161b;

    /* renamed from: c */
    private final Set<SchedulerConfig.Flag> f52162c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$a */
    public static final class C21506a extends SchedulerConfig.AbstractC21499b.AbstractC21500a {

        /* renamed from: a */
        private Long f52163a;

        /* renamed from: b */
        private Long f52164b;

        /* renamed from: c */
        private Set<SchedulerConfig.Flag> f52165c;

        C21506a() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b.AbstractC21500a
        /* renamed from: a */
        public SchedulerConfig.AbstractC21499b mo72761a() {
            String str = "";
            if (this.f52163a == null) {
                str = str + " delta";
            }
            if (this.f52164b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f52165c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C21504d(this.f52163a.longValue(), this.f52164b.longValue(), this.f52165c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b.AbstractC21500a
        /* renamed from: a */
        public SchedulerConfig.AbstractC21499b.AbstractC21500a mo72759a(long j) {
            this.f52163a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b.AbstractC21500a
        /* renamed from: b */
        public SchedulerConfig.AbstractC21499b.AbstractC21500a mo72762b(long j) {
            this.f52164b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b.AbstractC21500a
        /* renamed from: a */
        public SchedulerConfig.AbstractC21499b.AbstractC21500a mo72760a(Set<SchedulerConfig.Flag> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f52165c = set;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b
    /* renamed from: a */
    public long mo72756a() {
        return this.f52160a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b
    /* renamed from: b */
    public long mo72757b() {
        return this.f52161b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC21499b
    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo72758c() {
        return this.f52162c;
    }

    public int hashCode() {
        long j = this.f52160a;
        long j2 = this.f52161b;
        return this.f52162c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f52160a + ", maxAllowedDelay=" + this.f52161b + ", flags=" + this.f52162c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.AbstractC21499b)) {
            return false;
        }
        SchedulerConfig.AbstractC21499b bVar = (SchedulerConfig.AbstractC21499b) obj;
        if (this.f52160a == bVar.mo72756a() && this.f52161b == bVar.mo72757b() && this.f52162c.equals(bVar.mo72758c())) {
            return true;
        }
        return false;
    }

    private C21504d(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f52160a = j;
        this.f52161b = j2;
        this.f52162c = set;
    }
}
