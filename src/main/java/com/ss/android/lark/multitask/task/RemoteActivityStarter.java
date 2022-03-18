package com.ss.android.lark.multitask.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/multitask/task/RemoteActivityStarter;", "Lcom/ss/android/lark/multitask/task/AbsActivityTaskStarter;", "Lcom/ss/android/lark/multitask/task/RemoteTaskStarter;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "activityClass", "Ljava/lang/Class;", "Landroidx/appcompat/app/AppCompatActivity;", "(Ljava/lang/Class;)V", "called", "", "describeContents", "", "onStart", "", "snapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "container", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "putExtras", "bundle", "Landroid/os/Bundle;", "start", "writeToParcel", "flags", "CREATOR", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
public class RemoteActivityStarter extends AbstractC48363a implements Parcelable, RemoteTaskStarter {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: b */
    private boolean f121780b;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/multitask/task/RemoteActivityStarter$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/multitask/task/RemoteActivityStarter;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/multitask/task/RemoteActivityStarter;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteActivityStarter$a */
    public static final class CREATOR implements Parcelable.Creator<RemoteActivityStarter> {
        private CREATOR() {
        }

        /* renamed from: a */
        public RemoteActivityStarter[] newArray(int i) {
            return new RemoteActivityStarter[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public RemoteActivityStarter createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new RemoteActivityStarter(parcel);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteActivityStarter(Class<? extends AppCompatActivity> cls) {
        super(cls);
        Intrinsics.checkParameterIsNotNull(cls, "activityClass");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RemoteActivityStarter(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.io.Serializable r2 = r2.readSerializable()
            if (r2 == 0) goto L_0x0011
            java.lang.Class r2 = (java.lang.Class) r2
            r1.<init>(r2)
            return
        L_0x0011:
            kotlin.TypeCastException r2 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out androidx.appcompat.app.AppCompatActivity>"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.multitask.task.RemoteActivityStarter.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeSerializable(this.f121791a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo169131a(C48376q qVar, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        bundle.putAll(qVar.mo169246g());
        bundle.putLong("lark.multitask.snapshot.id", qVar.mo169234a());
        bundle.putBoolean("lark.multitask.task.restored", true);
        this.f121780b = true;
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48378t
    public final void a_(C48376q qVar, AbstractC48375n nVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        this.f121780b = false;
        TaskWrapperHolder.f121828a.mo169249a((AbstractC48369g) null);
        mo23767a(qVar, nVar);
        if (!this.f121780b) {
            throw new IllegalStateException("You must call putExtras() in onStart()".toString());
        }
    }

    /* renamed from: a */
    public void mo23767a(C48376q qVar, AbstractC48375n nVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        List<Activity> a = ActivityLifecycle.f121792a.mo169205a();
        Activity activity = a.get(a.size() - 1);
        Intent intent = new Intent(activity, this.f121791a);
        Bundle bundle = new Bundle();
        mo169131a(qVar, bundle);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }
}
