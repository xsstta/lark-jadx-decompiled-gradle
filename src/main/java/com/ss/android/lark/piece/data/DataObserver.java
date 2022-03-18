package com.ss.android.lark.piece.data;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\b\u000bJ\u0017\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/piece/data/DataObserver;", "T", "", "notifyWhenObserve", "", "(Z)V", "getNotifyWhenObserve", "()Z", "onDataChanged", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onDataChanged$piece_release", "onValue", "(Ljava/lang/Object;)V", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.piece.a.a */
public abstract class DataObserver<T> {

    /* renamed from: a */
    private final boolean f128041a;

    public DataObserver() {
        this(false, 1, null);
    }

    /* renamed from: a */
    public abstract void mo127664a(T t);

    /* renamed from: a */
    public final boolean mo177156a() {
        return this.f128041a;
    }

    public DataObserver(boolean z) {
        this.f128041a = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo177157b(Object obj) {
        if (obj != 0) {
            try {
                mo127664a(obj);
            } catch (ClassCastException unused) {
            }
        } else {
            mo127664a(null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataObserver(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
