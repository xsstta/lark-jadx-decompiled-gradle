package com.ss.android.lark.multitask.task;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.multitask.task.Task;

public class RemoteTaskSnapshot extends C48376q implements Parcelable {
    public static final Parcelable.Creator<RemoteTaskSnapshot> CREATOR = new Parcelable.Creator<RemoteTaskSnapshot>() {
        /* class com.ss.android.lark.multitask.task.RemoteTaskSnapshot.C483621 */

        /* renamed from: a */
        public RemoteTaskSnapshot[] newArray(int i) {
            return new RemoteTaskSnapshot[i];
        }

        /* renamed from: a */
        public RemoteTaskSnapshot createFromParcel(Parcel parcel) {
            return new RemoteTaskSnapshot(parcel);
        }
    };

    public int describeContents() {
        return 0;
    }

    public RemoteTaskSnapshot() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.multitask.task.C48376q
    /* renamed from: a */
    public void mo169178a(AbstractC48375n nVar) {
        super.mo169178a(nVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.multitask.task.C48376q
    /* renamed from: a */
    public void mo169179a(AbstractC48378t tVar) {
        super.mo169179a(tVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.multitask.task.C48376q
    /* renamed from: a */
    public void mo169180a(CharSequence charSequence) {
        super.mo169180a(charSequence);
    }

    /* renamed from: a */
    public static RemoteTaskSnapshot m190749a(C48376q qVar) {
        if (qVar instanceof RemoteTaskSnapshot) {
            return (RemoteTaskSnapshot) qVar;
        }
        return m190748a(qVar.mo169234a(), qVar.mo169241c(), qVar.mo169242d(), qVar.mo169239b(), qVar.mo169243e(), new RemoteTaskContainer(), qVar.mo169245f(), qVar.mo169246g());
    }

    protected RemoteTaskSnapshot(Parcel parcel) {
        mo169235a(parcel.readLong());
        mo169238a(parcel.readString());
        mo169240b(parcel.readString());
        mo169180a((CharSequence) parcel.readString());
        mo169237a((Task.IconFactory) parcel.readParcelable(RemoteTaskContainer.class.getClassLoader()));
        mo169178a(new RemoteTaskContainer());
        mo169179a((AbstractC48378t) parcel.readParcelable(RemoteTaskStarter.class.getClassLoader()));
        mo169236a(parcel.readBundle(getClass().getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(mo169234a());
        parcel.writeString(mo169241c());
        parcel.writeString(mo169242d());
        parcel.writeString((String) mo169239b());
        parcel.writeParcelable(mo169243e(), i);
        parcel.writeParcelable((RemoteTaskStarter) mo169245f(), i);
        parcel.writeBundle(mo169246g());
    }

    /* renamed from: a */
    public static RemoteTaskSnapshot m190748a(long j, String str, String str2, CharSequence charSequence, Task.IconFactory iconFactory, AbstractC48375n nVar, AbstractC48378t tVar, Bundle bundle) {
        RemoteTaskSnapshot remoteTaskSnapshot = new RemoteTaskSnapshot();
        remoteTaskSnapshot.mo169235a(j);
        remoteTaskSnapshot.mo169238a(str);
        remoteTaskSnapshot.mo169240b(str2);
        remoteTaskSnapshot.mo169180a(charSequence);
        remoteTaskSnapshot.mo169237a(iconFactory);
        remoteTaskSnapshot.mo169178a(nVar);
        remoteTaskSnapshot.mo169179a(tVar);
        remoteTaskSnapshot.mo169236a(bundle);
        return remoteTaskSnapshot;
    }
}
