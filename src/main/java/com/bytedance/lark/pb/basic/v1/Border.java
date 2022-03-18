package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Border extends Message<Border, C14702a> {
    public static final ProtoAdapter<Border> ADAPTER = new C14703b();
    public static final Float DEFAULT_CORNER_RADIUS;
    public static final Float DEFAULT_WIDTH;
    private static final long serialVersionUID = 0;
    public final ThemeColor color_v2;
    public final Float corner_radius;
    public final Float width;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Border$b */
    private static final class C14703b extends ProtoAdapter<Border> {
        C14703b() {
            super(FieldEncoding.LENGTH_DELIMITED, Border.class);
        }

        /* renamed from: a */
        public int encodedSize(Border border) {
            int i;
            int i2;
            int i3 = 0;
            if (border.width != null) {
                i = ProtoAdapter.FLOAT.encodedSizeWithTag(1, border.width);
            } else {
                i = 0;
            }
            if (border.color_v2 != null) {
                i2 = ThemeColor.ADAPTER.encodedSizeWithTag(4, border.color_v2);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (border.corner_radius != null) {
                i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(3, border.corner_radius);
            }
            return i4 + i3 + border.unknownFields().size();
        }

        /* renamed from: a */
        public Border decode(ProtoReader protoReader) throws IOException {
            C14702a aVar = new C14702a();
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            aVar.f38870a = valueOf;
            aVar.f38872c = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38870a = ProtoAdapter.FLOAT.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f38872c = ProtoAdapter.FLOAT.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38871b = ThemeColor.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Border border) throws IOException {
            if (border.width != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, border.width);
            }
            if (border.color_v2 != null) {
                ThemeColor.ADAPTER.encodeWithTag(protoWriter, 4, border.color_v2);
            }
            if (border.corner_radius != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, border.corner_radius);
            }
            protoWriter.writeBytes(border.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Border$a */
    public static final class C14702a extends Message.Builder<Border, C14702a> {

        /* renamed from: a */
        public Float f38870a;

        /* renamed from: b */
        public ThemeColor f38871b;

        /* renamed from: c */
        public Float f38872c;

        /* renamed from: a */
        public Border build() {
            return new Border(this.f38870a, this.f38871b, this.f38872c, super.buildUnknownFields());
        }
    }

    static {
        Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        DEFAULT_WIDTH = valueOf;
        DEFAULT_CORNER_RADIUS = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C14702a newBuilder() {
        C14702a aVar = new C14702a();
        aVar.f38870a = this.width;
        aVar.f38871b = this.color_v2;
        aVar.f38872c = this.corner_radius;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Border");
        StringBuilder sb = new StringBuilder();
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.color_v2 != null) {
            sb.append(", color_v2=");
            sb.append(this.color_v2);
        }
        if (this.corner_radius != null) {
            sb.append(", corner_radius=");
            sb.append(this.corner_radius);
        }
        StringBuilder replace = sb.replace(0, 2, "Border{");
        replace.append('}');
        return replace.toString();
    }

    public Border(Float f, ThemeColor themeColor, Float f2) {
        this(f, themeColor, f2, ByteString.EMPTY);
    }

    public Border(Float f, ThemeColor themeColor, Float f2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = f;
        this.color_v2 = themeColor;
        this.corner_radius = f2;
    }
}
