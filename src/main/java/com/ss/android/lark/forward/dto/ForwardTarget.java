package com.ss.android.lark.forward.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ForwardTarget implements Parcelable {
    public static final Parcelable.Creator<ForwardTarget> CREATOR = new Parcelable.Creator<ForwardTarget>() {
        /* class com.ss.android.lark.forward.dto.ForwardTarget.C383831 */

        /* renamed from: a */
        public ForwardTarget[] newArray(int i) {
            return new ForwardTarget[i];
        }

        /* renamed from: a */
        public ForwardTarget createFromParcel(Parcel parcel) {
            return new ForwardTarget(parcel);
        }
    };

    /* renamed from: a */
    private String f98611a;

    /* renamed from: b */
    private String f98612b;

    /* renamed from: c */
    private String f98613c;

    /* renamed from: d */
    private boolean f98614d;

    /* renamed from: e */
    private Serializable f98615e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TargetType {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo140567b() {
        return this.f98611a;
    }

    /* renamed from: c */
    public String mo140568c() {
        return this.f98612b;
    }

    /* renamed from: d */
    public String mo140569d() {
        return this.f98613c;
    }

    /* renamed from: f */
    public Chat mo140572f() {
        Serializable serializable = this.f98615e;
        if (serializable == null || !(serializable instanceof Chat)) {
            return null;
        }
        return (Chat) serializable;
    }

    /* renamed from: g */
    public ThreadTarget mo140573g() {
        Serializable serializable = this.f98615e;
        if (serializable instanceof ThreadTarget) {
            return (ThreadTarget) serializable;
        }
        return null;
    }

    /* renamed from: a */
    public int mo140565a() {
        Serializable serializable = this.f98615e;
        if (serializable instanceof OpenChat) {
            return 0;
        }
        if (serializable instanceof OpenChatter) {
            return 1;
        }
        if (serializable instanceof ThreadTarget) {
            return 2;
        }
        return -1;
    }

    /* renamed from: e */
    public boolean mo140571e() {
        Serializable serializable = this.f98615e;
        if (serializable == null || !(serializable instanceof Chatter)) {
            return this.f98614d;
        }
        return ((Chatter) serializable).isBot();
    }

    /* renamed from: a */
    public void mo140566a(boolean z) {
        this.f98614d = z;
    }

    public ForwardTarget(Chatter chatter) {
        m151197a(chatter.getId(), chatter.getLocalizedName(), chatter.getAvatarKey(), chatter);
    }

    protected ForwardTarget(Parcel parcel) {
        boolean z;
        this.f98611a = parcel.readString();
        this.f98612b = parcel.readString();
        this.f98613c = parcel.readString();
        this.f98615e = parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98614d = z;
    }

    public ForwardTarget(OpenChat openChat) {
        m151197a(openChat.getId(), openChat.getName(), openChat.getAvatarKey(), openChat);
    }

    public ForwardTarget(ThreadTarget threadTarget) {
        m151197a(threadTarget.getId(), threadTarget.getName(), threadTarget.getAvatar(), threadTarget);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f98611a);
        parcel.writeString(this.f98612b);
        parcel.writeString(this.f98613c);
        parcel.writeSerializable(this.f98615e);
        parcel.writeByte(this.f98614d ? (byte) 1 : 0);
    }

    public ForwardTarget(String str, String str2, String str3) {
        m151197a(str, str2, str3, null);
    }

    /* renamed from: a */
    private void m151197a(String str, String str2, String str3, Serializable serializable) {
        this.f98611a = str;
        this.f98612b = str2;
        this.f98613c = str3;
        this.f98615e = serializable;
    }
}
