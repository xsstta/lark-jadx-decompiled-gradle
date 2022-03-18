package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import java.util.Map;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
public final class C21503c extends SchedulerConfig {

    /* renamed from: a */
    private final AbstractC21523a f52158a;

    /* renamed from: b */
    private final Map<Priority, SchedulerConfig.AbstractC21499b> f52159b;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: a */
    public AbstractC21523a mo72751a() {
        return this.f52158a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: b */
    public Map<Priority, SchedulerConfig.AbstractC21499b> mo72752b() {
        return this.f52159b;
    }

    public int hashCode() {
        return ((this.f52158a.hashCode() ^ 1000003) * 1000003) ^ this.f52159b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f52158a + ", values=" + this.f52159b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.f52158a.equals(schedulerConfig.mo72751a()) || !this.f52159b.equals(schedulerConfig.mo72752b())) {
            return false;
        }
        return true;
    }

    C21503c(AbstractC21523a aVar, Map<Priority, SchedulerConfig.AbstractC21499b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f52158a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f52159b = map;
    }
}
