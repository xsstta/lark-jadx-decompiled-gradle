package com.ss.android.lark.dto.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/dto/group/GroupRecallEntity;", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "pickType", "", "id", "", "name", "(ILjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "describeContents", "writeToParcel", "", "flags", "CREATOR", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupRecallEntity extends PickChatEntity {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f94797a;

    public GroupRecallEntity(int i, String str) {
        this(i, str, null, 4, null);
    }

    @Override // com.ss.android.lark.chat.entity.chat.PickChatEntity
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/dto/group/GroupRecallEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "()V", "createFromParcel", "Lcom/ss/android/lark/dto/group/GroupRecallEntity;", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/dto/group/GroupRecallEntity;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.dto.group.GroupRecallEntity$a */
    public static final class CREATOR implements Parcelable.Creator<PickChatEntity> {
        private CREATOR() {
        }

        /* renamed from: a */
        public GroupRecallEntity[] newArray(int i) {
            return new GroupRecallEntity[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public GroupRecallEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new GroupRecallEntity(parcel);
        }
    }

    /* renamed from: c */
    public final String mo136116c() {
        return this.f94797a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupRecallEntity(Parcel parcel) {
        this(parcel.readInt(), parcel.readString(), parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    @Override // com.ss.android.lark.chat.entity.chat.PickChatEntity
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(mo124689a());
        parcel.writeString(mo124690b());
        parcel.writeString(this.f94797a);
    }

    public GroupRecallEntity(int i, String str, String str2) {
        super(i, str);
        this.f94797a = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupRecallEntity(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
