package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0002)*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020%H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "basicForwardSource", "", "getBasicForwardSource", "()Ljava/lang/String;", "setBasicForwardSource", "(Ljava/lang/String;)V", "callType", "Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "getCallType", "()Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "setCallType", "(Lcom/ss/android/lark/forward/dto/template/ForwardCallType;)V", "forwardSourceChatType", "getForwardSourceChatType", "setForwardSourceChatType", "location", "Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "getLocation", "()Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "setLocation", "(Lcom/ss/android/lark/forward/dto/template/ForwardLocation;)V", "searchBehaviorKey", "getSearchBehaviorKey", "setSearchBehaviorKey", "sourceMessageIds", "", "getSourceMessageIds", "()Ljava/util/List;", "setSourceMessageIds", "(Ljava/util/List;)V", "describeContents", "", "writeToParcel", "", "flags", "Builder", "CREATOR", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ForwardHitPoint implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private String f98706a;

    /* renamed from: b */
    private String f98707b;

    /* renamed from: c */
    private String f98708c;

    /* renamed from: d */
    private ForwardLocation f98709d;

    /* renamed from: e */
    private ForwardCallType f98710e;

    /* renamed from: f */
    private List<String> f98711f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint$Builder;", "", "()V", "callType", "Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "location", "Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "mBasicForwardSource", "", "mForwardSourceChatType", "mSearchBehaviorKey", "sourceMessageIds", "", "build", "Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint;", "setBasicForwardSource", "basicForwardSource", "setCallType", "setForwardSourceChatType", "sourceChatType", "setLocation", "setSearchBehaviorKey", "searchBehaviorKey", "setSourceMessageIds", "Companion", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardHitPoint$a */
    public static final class Builder {

        /* renamed from: a */
        public static final Companion f98712a = new Companion(null);

        /* renamed from: b */
        private String f98713b;

        /* renamed from: c */
        private String f98714c = "other";

        /* renamed from: d */
        private String f98715d;

        /* renamed from: e */
        private ForwardLocation f98716e = ForwardLocation.OTHER;

        /* renamed from: f */
        private ForwardCallType f98717f = ForwardCallType.CLICK;

        /* renamed from: g */
        private List<String> f98718g = new ArrayList();

        @JvmStatic
        /* renamed from: b */
        public static final ForwardHitPoint m151380b() {
            return f98712a.mo140800a();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint$Builder$Companion;", "", "()V", "simple", "Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint;", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.forward.dto.template.ForwardHitPoint$a$a */
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            /* renamed from: a */
            public final ForwardHitPoint mo140800a() {
                return new Builder().mo140798a();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final ForwardHitPoint mo140798a() {
            ForwardHitPoint forwardHitPoint = new ForwardHitPoint();
            forwardHitPoint.mo140785a(this.f98713b);
            forwardHitPoint.mo140788b(this.f98714c);
            forwardHitPoint.mo140790c(this.f98715d);
            forwardHitPoint.mo140784a(this.f98716e);
            forwardHitPoint.mo140783a(this.f98717f);
            forwardHitPoint.mo140786a(this.f98718g);
            return forwardHitPoint;
        }

        /* renamed from: b */
        public final Builder mo140799b(String str) {
            this.f98715d = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo140794a(ForwardCallType forwardCallType) {
            Builder aVar = this;
            aVar.f98717f = forwardCallType;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140795a(ForwardLocation forwardLocation) {
            Builder aVar = this;
            aVar.f98716e = forwardLocation;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140796a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "basicForwardSource");
            this.f98714c = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo140797a(List<String> list) {
            Builder aVar = this;
            aVar.f98718g = list;
            return aVar;
        }
    }

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/forward/dto/template/ForwardHitPoint;", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardHitPoint$b */
    public static final class CREATOR implements Parcelable.Creator<ForwardHitPoint> {
        private CREATOR() {
        }

        /* renamed from: a */
        public ForwardHitPoint[] newArray(int i) {
            return new ForwardHitPoint[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public ForwardHitPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new ForwardHitPoint(parcel);
        }
    }

    /* renamed from: a */
    public final String mo140782a() {
        return this.f98707b;
    }

    /* renamed from: b */
    public final ForwardLocation mo140787b() {
        return this.f98709d;
    }

    /* renamed from: c */
    public final ForwardCallType mo140789c() {
        return this.f98710e;
    }

    /* renamed from: d */
    public final List<String> mo140791d() {
        return this.f98711f;
    }

    public ForwardHitPoint() {
        this.f98709d = ForwardLocation.OTHER;
        this.f98711f = new ArrayList();
    }

    /* renamed from: a */
    public final void mo140783a(ForwardCallType forwardCallType) {
        this.f98710e = forwardCallType;
    }

    /* renamed from: b */
    public final void mo140788b(String str) {
        this.f98707b = str;
    }

    /* renamed from: c */
    public final void mo140790c(String str) {
        this.f98708c = str;
    }

    /* renamed from: a */
    public final void mo140784a(ForwardLocation forwardLocation) {
        this.f98709d = forwardLocation;
    }

    /* renamed from: a */
    public final void mo140785a(String str) {
        this.f98706a = str;
    }

    /* renamed from: a */
    public final void mo140786a(List<String> list) {
        this.f98711f = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ForwardHitPoint(Parcel parcel) {
        this();
        ForwardLocation forwardLocation;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f98706a = parcel.readString();
        this.f98707b = parcel.readString();
        this.f98708c = parcel.readString();
        this.f98711f = parcel.createStringArrayList();
        String readString = parcel.readString();
        ForwardCallType forwardCallType = null;
        if (readString != null) {
            ForwardLocation.Companion aVar = ForwardLocation.Companion;
            Intrinsics.checkExpressionValueIsNotNull(readString, "it");
            forwardLocation = aVar.mo140817a(readString);
        } else {
            forwardLocation = null;
        }
        this.f98709d = forwardLocation;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            ForwardCallType.Companion aVar2 = ForwardCallType.Companion;
            Intrinsics.checkExpressionValueIsNotNull(readString2, "it");
            forwardCallType = aVar2.mo140738a(readString2);
        }
        this.f98710e = forwardCallType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f98706a);
        parcel.writeString(this.f98707b);
        parcel.writeString(this.f98708c);
        parcel.writeStringList(this.f98711f);
        ForwardLocation forwardLocation = this.f98709d;
        String str2 = null;
        if (forwardLocation != null) {
            str = forwardLocation.getValue();
        } else {
            str = null;
        }
        parcel.writeString(str);
        ForwardCallType forwardCallType = this.f98710e;
        if (forwardCallType != null) {
            str2 = forwardCallType.getValue();
        }
        parcel.writeString(str2);
    }
}
