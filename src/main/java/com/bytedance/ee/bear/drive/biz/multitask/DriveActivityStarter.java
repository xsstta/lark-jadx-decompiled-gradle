package com.bytedance.ee.bear.drive.biz.multitask;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.RemoteActivityStarter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityStarter;", "Lcom/ss/android/lark/multitask/task/RemoteActivityStarter;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "activityClass", "Ljava/lang/Class;", "Landroidx/appcompat/app/AppCompatActivity;", "(Ljava/lang/Class;)V", "onStart", "", "snapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "container", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "CREATOR", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveActivityStarter extends RemoteActivityStarter {
    public static final CREATOR CREATOR = new CREATOR(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001d\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityStarter$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityStarter;", "()V", "TAG", "", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityStarter;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.multitask.DriveActivityStarter$a */
    public static final class CREATOR implements Parcelable.Creator<DriveActivityStarter> {
        private CREATOR() {
        }

        /* renamed from: a */
        public DriveActivityStarter[] newArray(int i) {
            return new DriveActivityStarter[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public DriveActivityStarter createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new DriveActivityStarter(parcel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/drive/biz/multitask/DriveActivityStarter$onStart$fileList$itemType$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/SpaceFileOpenEntity;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.multitask.DriveActivityStarter$b */
    public static final class C6504b extends TypeToken<ArrayList<SpaceFileOpenEntity>> {
        C6504b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveActivityStarter(Class<? extends AppCompatActivity> cls) {
        super(cls);
        Intrinsics.checkParameterIsNotNull(cls, "activityClass");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DriveActivityStarter(android.os.Parcel r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.multitask.DriveActivityStarter.<init>(android.os.Parcel):void");
    }

    @Override // com.ss.android.lark.multitask.task.RemoteActivityStarter
    /* renamed from: a */
    public void mo23767a(C48376q qVar, AbstractC48375n nVar) {
        ArrayList<? extends BaseOpenEntity> arrayList;
        Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        int i = qVar.mo169246g().getInt("extra_drive_sdk_open_index", 0);
        try {
            arrayList = (ArrayList) new Gson().fromJson(qVar.mo169246g().getString("multi_task_extra_open_entities"), new C6504b().getType());
        } catch (Throwable th) {
            C13479a.m54761a("DriveActivityStarter", th);
            arrayList = new ArrayList<>();
        }
        if (arrayList == null || arrayList.isEmpty()) {
            C13479a.m54758a("DriveActivityStarter", "url is empty");
        }
        mo169131a(qVar, new Bundle());
        try {
            ((AbstractC5239d) KoinJavaComponent.m268613a(AbstractC5239d.class, null, null, 6, null)).mo21093a(((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17294b(), arrayList, i);
        } catch (Exception e) {
            C13479a.m54759a("DriveActivityStarter", "openPreview error", e);
        }
    }
}
