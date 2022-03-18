package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class InstanceLayout extends Message<InstanceLayout, C15814a> {
    public static final ProtoAdapter<InstanceLayout> ADAPTER = new C15815b();
    public static final Float DEFAULT_HEIGHT;
    public static final Float DEFAULT_WIDTH;
    public static final Float DEFAULT_X_OFFSET;
    public static final Float DEFAULT_Y_OFFSET;
    public static final Integer DEFAULT_Z_INDEX = 0;
    private static final long serialVersionUID = 0;
    public final Float height;
    public final String id;
    public final Float width;
    public final Float x_offset;
    public final Float y_offset;
    public final Integer z_index;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceLayout$b */
    private static final class C15815b extends ProtoAdapter<InstanceLayout> {
        C15815b() {
            super(FieldEncoding.LENGTH_DELIMITED, InstanceLayout.class);
        }

        /* renamed from: a */
        public int encodedSize(InstanceLayout instanceLayout) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, instanceLayout.id);
            int i5 = 0;
            if (instanceLayout.width != null) {
                i = ProtoAdapter.FLOAT.encodedSizeWithTag(2, instanceLayout.width);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (instanceLayout.height != null) {
                i2 = ProtoAdapter.FLOAT.encodedSizeWithTag(3, instanceLayout.height);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (instanceLayout.x_offset != null) {
                i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(4, instanceLayout.x_offset);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (instanceLayout.y_offset != null) {
                i4 = ProtoAdapter.FLOAT.encodedSizeWithTag(5, instanceLayout.y_offset);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (instanceLayout.z_index != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, instanceLayout.z_index);
            }
            return i9 + i5 + instanceLayout.unknownFields().size();
        }

        /* renamed from: a */
        public InstanceLayout decode(ProtoReader protoReader) throws IOException {
            C15814a aVar = new C15814a();
            aVar.f41595a = "";
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            aVar.f41596b = valueOf;
            aVar.f41597c = valueOf;
            aVar.f41598d = valueOf;
            aVar.f41599e = valueOf;
            aVar.f41600f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41595a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41596b = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41597c = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41598d = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41599e = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41600f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InstanceLayout instanceLayout) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, instanceLayout.id);
            if (instanceLayout.width != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, instanceLayout.width);
            }
            if (instanceLayout.height != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, instanceLayout.height);
            }
            if (instanceLayout.x_offset != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, instanceLayout.x_offset);
            }
            if (instanceLayout.y_offset != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, instanceLayout.y_offset);
            }
            if (instanceLayout.z_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, instanceLayout.z_index);
            }
            protoWriter.writeBytes(instanceLayout.unknownFields());
        }
    }

    static {
        Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        DEFAULT_WIDTH = valueOf;
        DEFAULT_HEIGHT = valueOf;
        DEFAULT_X_OFFSET = valueOf;
        DEFAULT_Y_OFFSET = valueOf;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceLayout$a */
    public static final class C15814a extends Message.Builder<InstanceLayout, C15814a> {

        /* renamed from: a */
        public String f41595a;

        /* renamed from: b */
        public Float f41596b;

        /* renamed from: c */
        public Float f41597c;

        /* renamed from: d */
        public Float f41598d;

        /* renamed from: e */
        public Float f41599e;

        /* renamed from: f */
        public Integer f41600f;

        /* renamed from: a */
        public InstanceLayout build() {
            String str = this.f41595a;
            if (str != null) {
                return new InstanceLayout(str, this.f41596b, this.f41597c, this.f41598d, this.f41599e, this.f41600f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15814a newBuilder() {
        C15814a aVar = new C15814a();
        aVar.f41595a = this.id;
        aVar.f41596b = this.width;
        aVar.f41597c = this.height;
        aVar.f41598d = this.x_offset;
        aVar.f41599e = this.y_offset;
        aVar.f41600f = this.z_index;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "InstanceLayout");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.x_offset != null) {
            sb.append(", x_offset=");
            sb.append(this.x_offset);
        }
        if (this.y_offset != null) {
            sb.append(", y_offset=");
            sb.append(this.y_offset);
        }
        if (this.z_index != null) {
            sb.append(", z_index=");
            sb.append(this.z_index);
        }
        StringBuilder replace = sb.replace(0, 2, "InstanceLayout{");
        replace.append('}');
        return replace.toString();
    }

    public InstanceLayout(String str, Float f, Float f2, Float f3, Float f4, Integer num) {
        this(str, f, f2, f3, f4, num, ByteString.EMPTY);
    }

    public InstanceLayout(String str, Float f, Float f2, Float f3, Float f4, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.width = f;
        this.height = f2;
        this.x_offset = f3;
        this.y_offset = f4;
        this.z_index = num;
    }
}
