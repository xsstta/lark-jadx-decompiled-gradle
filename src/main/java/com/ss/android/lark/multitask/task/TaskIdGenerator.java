package com.ss.android.lark.multitask.task;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/multitask/task/TaskIdGenerator;", "", "startsFrom", "", "endsWith", "(JJ)V", "idCounter", "Ljava/util/concurrent/atomic/AtomicLong;", "generateTaskId", "Companion", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.p */
public final class TaskIdGenerator {

    /* renamed from: a */
    public static final Companion f121816a = new Companion(null);

    /* renamed from: b */
    private final AtomicLong f121817b;

    /* renamed from: c */
    private final long f121818c;

    /* renamed from: d */
    private final long f121819d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/multitask/task/TaskIdGenerator$Companion;", "", "()V", "NO_ID", "", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.p$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo169233a() {
        if (!this.f121817b.compareAndSet(this.f121819d, this.f121818c)) {
            return this.f121817b.incrementAndGet();
        }
        return this.f121818c;
    }

    public TaskIdGenerator(long j, long j2) {
        this.f121818c = j;
        this.f121819d = j2;
        this.f121817b = new AtomicLong(j);
        if (j2 <= j) {
            throw new IllegalArgumentException("endsWith can not equal to or less than startsFrom");
        }
    }
}
