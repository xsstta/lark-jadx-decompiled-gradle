package com.ss.android.lark.ug.dyflow.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ug.dyflow.common.data.elements.ButtonElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ConfigElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.PictureElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.TextElementData;
import com.ss.android.lark.ug.dyflow.common.data.elements.VideoElementData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u000223B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u00101\u001a\u00020-H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$ElementType;", "(Ljava/lang/String;Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$ElementType;)V", "buttonElementData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;", "getButtonElementData", "()Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;", "setButtonElementData", "(Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;)V", "configElementData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;", "getConfigElementData", "()Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;", "setConfigElementData", "(Lcom/ss/android/lark/ug/dyflow/common/data/elements/ConfigElementData;)V", "getId", "()Ljava/lang/String;", "pictureElementData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;", "getPictureElementData", "()Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;", "setPictureElementData", "(Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;)V", "textElementData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/TextElementData;", "getTextElementData", "()Lcom/ss/android/lark/ug/dyflow/common/data/elements/TextElementData;", "setTextElementData", "(Lcom/ss/android/lark/ug/dyflow/common/data/elements/TextElementData;)V", "getType", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$ElementType;", "videoElementData", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;", "getVideoElementData", "()Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;", "setVideoElementData", "(Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;)V", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "ElementType", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FlowElementData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f141420a;

    /* renamed from: b */
    private final ElementType f141421b;

    /* renamed from: c */
    private TextElementData f141422c;

    /* renamed from: d */
    private PictureElementData f141423d;

    /* renamed from: e */
    private VideoElementData f141424e;

    /* renamed from: f */
    private ButtonElementData f141425f;

    /* renamed from: g */
    private ConfigElementData f141426g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$ElementType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "TEXT", "PICTURE", "VIDEO", "BUTTON", "CONFIG", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ElementType {
        UNKNOWN(0),
        TEXT(1),
        PICTURE(2),
        VIDEO(3),
        BUTTON(4),
        CONFIG(5);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$ElementType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$ElementType;", "value", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.common.data.FlowElementData$ElementType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ElementType mo194803a(int i) {
                if (i == 0) {
                    return ElementType.UNKNOWN;
                }
                if (i == 1) {
                    return ElementType.TEXT;
                }
                if (i == 2) {
                    return ElementType.PICTURE;
                }
                if (i == 3) {
                    return ElementType.VIDEO;
                }
                if (i == 4) {
                    return ElementType.BUTTON;
                }
                if (i != 5) {
                    return ElementType.UNKNOWN;
                }
                return ElementType.CONFIG;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ElementType(int i) {
            this.value = i;
        }
    }

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/FlowElementData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.FlowElementData$a */
    public static final class CREATOR implements Parcelable.Creator<FlowElementData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public FlowElementData[] newArray(int i) {
            return new FlowElementData[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public FlowElementData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new FlowElementData(parcel);
        }
    }

    /* renamed from: a */
    public final ElementType mo194789a() {
        return this.f141421b;
    }

    /* renamed from: b */
    public final TextElementData mo194795b() {
        return this.f141422c;
    }

    /* renamed from: c */
    public final PictureElementData mo194796c() {
        return this.f141423d;
    }

    /* renamed from: d */
    public final VideoElementData mo194797d() {
        return this.f141424e;
    }

    /* renamed from: e */
    public final ButtonElementData mo194799e() {
        return this.f141425f;
    }

    /* renamed from: f */
    public final ConfigElementData mo194800f() {
        return this.f141426g;
    }

    /* renamed from: a */
    public final void mo194790a(ButtonElementData buttonElementData) {
        this.f141425f = buttonElementData;
    }

    /* renamed from: a */
    public final void mo194791a(ConfigElementData configElementData) {
        this.f141426g = configElementData;
    }

    /* renamed from: a */
    public final void mo194792a(PictureElementData pictureElementData) {
        this.f141423d = pictureElementData;
    }

    /* renamed from: a */
    public final void mo194793a(TextElementData textElementData) {
        this.f141422c = textElementData;
    }

    public FlowElementData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        String readString = parcel.readString();
        this.f141420a = readString == null ? "" : readString;
        this.f141421b = ElementType.Companion.mo194803a(parcel.readInt());
        ClassLoader classLoader = getClass().getClassLoader();
        this.f141422c = (TextElementData) parcel.readParcelable(classLoader);
        this.f141423d = (PictureElementData) parcel.readParcelable(classLoader);
        this.f141424e = (VideoElementData) parcel.readParcelable(classLoader);
        this.f141425f = (ButtonElementData) parcel.readParcelable(classLoader);
        this.f141426g = (ConfigElementData) parcel.readParcelable(classLoader);
    }

    /* renamed from: a */
    public final void mo194794a(VideoElementData videoElementData) {
        this.f141424e = videoElementData;
    }

    public FlowElementData(String str, ElementType elementType) {
        Intrinsics.checkParameterIsNotNull(elementType, ShareHitPoint.f121869d);
        this.f141420a = str;
        this.f141421b = elementType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f141420a);
            parcel.writeInt(this.f141421b.getValue());
            parcel.writeParcelable(this.f141422c, 0);
            parcel.writeParcelable(this.f141423d, 0);
            parcel.writeParcelable(this.f141424e, 0);
            parcel.writeParcelable(this.f141425f, 0);
            parcel.writeParcelable(this.f141426g, 0);
        }
    }
}
