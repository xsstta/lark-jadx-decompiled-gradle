package com.bytedance.ee.webapp.v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.ActivityLifecycle;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.RemoteActivityStarter;
import com.ss.android.lark.multitask.task.RemoteTaskStarter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fH\u0016¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/webapp/v2/WebContainerDelegateStarter;", "Lcom/ss/android/lark/multitask/task/RemoteActivityStarter;", "Lcom/ss/android/lark/multitask/task/RemoteTaskStarter;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "activityClass", "Ljava/lang/Class;", "Landroidx/appcompat/app/AppCompatActivity;", "(Ljava/lang/Class;)V", "describeContents", "", "onStart", "", "snapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "container", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "writeToParcel", "flags", "CREATOR", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WebContainerDelegateStarter extends RemoteActivityStarter implements Parcelable, RemoteTaskStarter {
    public static final CREATOR CREATOR = new CREATOR(null);

    @Override // com.ss.android.lark.multitask.task.RemoteActivityStarter
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/webapp/v2/WebContainerDelegateStarter$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/webapp/v2/WebContainerDelegateStarter;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/ee/webapp/v2/WebContainerDelegateStarter;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.v2.WebContainerDelegateStarter$a */
    public static final class CREATOR implements Parcelable.Creator<WebContainerDelegateStarter> {
        private CREATOR() {
        }

        /* renamed from: a */
        public WebContainerDelegateStarter[] newArray(int i) {
            return new WebContainerDelegateStarter[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public WebContainerDelegateStarter createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new WebContainerDelegateStarter(parcel);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebContainerDelegateStarter(Class<? extends AppCompatActivity> cls) {
        super(cls);
        Intrinsics.checkParameterIsNotNull(cls, "activityClass");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebContainerDelegateStarter(android.os.Parcel r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.webapp.v2.WebContainerDelegateStarter.<init>(android.os.Parcel):void");
    }

    @Override // com.ss.android.lark.multitask.task.RemoteActivityStarter
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeSerializable(this.f121791a);
    }

    @Override // com.ss.android.lark.multitask.task.RemoteActivityStarter
    /* renamed from: a */
    public void mo23767a(C48376q qVar, AbstractC48375n nVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        List<Activity> a = ActivityLifecycle.f121792a.mo169205a();
        Bundle bundle = new Bundle();
        Intent intent = new Intent(ActivityLifecycle.f121792a.mo169205a().get(0), C25822b.m93349a());
        C25830a aVar = new C25830a();
        aVar.mo91890a(new WebAppContainerDelegate());
        mo169131a(qVar, bundle);
        C25822b.m93352b().mo91901a(bundle, aVar);
        intent.putExtra("url", qVar.mo169246g().getString("url"));
        intent.putExtras(bundle);
        a.get(a.size() - 1).startActivity(intent);
    }
}
