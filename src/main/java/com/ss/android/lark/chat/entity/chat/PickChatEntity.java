package com.ss.android.lark.chat.entity.chat;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "pickType", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPickType", "()I", "describeContents", "equals", "", "other", "", "hashCode", "writeToParcel", "", "flags", "CREATOR", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public class PickChatEntity implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final int f87769a;

    /* renamed from: b */
    private final String f87770b;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001d\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/PickChatEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "()V", "TYPE_CHAT", "", "TYPE_DEP", "TYPE_UNKNOWN", "TYPE_USER", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "(I)[Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.PickChatEntity$a */
    public static final class CREATOR implements Parcelable.Creator<PickChatEntity> {
        private CREATOR() {
        }

        /* renamed from: a */
        public PickChatEntity[] newArray(int i) {
            return new PickChatEntity[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public PickChatEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PickChatEntity(parcel);
        }
    }

    /* renamed from: a */
    public final int mo124689a() {
        return this.f87769a;
    }

    /* renamed from: b */
    public final String mo124690b() {
        return this.f87770b;
    }

    public int hashCode() {
        return Intrinsics.stringPlus(this.f87770b, String.valueOf(this.f87769a)).hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PickChatEntity(Parcel parcel) {
        this(parcel.readInt(), parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PickChatEntity)) {
            return false;
        }
        PickChatEntity pickChatEntity = (PickChatEntity) obj;
        if (this.f87769a != pickChatEntity.f87769a || !Intrinsics.areEqual(this.f87770b, pickChatEntity.f87770b)) {
            return false;
        }
        return true;
    }

    public PickChatEntity(int i, String str) {
        this.f87769a = i;
        this.f87770b = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f87769a);
        parcel.writeString(this.f87770b);
    }
}
