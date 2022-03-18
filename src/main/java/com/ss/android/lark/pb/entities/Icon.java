package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Icon extends Message<Icon, C49710a> {
    public static final ProtoAdapter<Icon> ADAPTER = new C49711b();
    private static final long serialVersionUID = 0;
    public final String mKey;
    public final String mfs_unit;
    public final IconType mtype;

    /* renamed from: com.ss.android.lark.pb.entities.Icon$b */
    private static final class C49711b extends ProtoAdapter<Icon> {
        C49711b() {
            super(FieldEncoding.LENGTH_DELIMITED, Icon.class);
        }

        /* renamed from: a */
        public int encodedSize(Icon icon) {
            int i;
            int i2;
            int i3 = 0;
            if (icon.mtype != null) {
                i = IconType.ADAPTER.encodedSizeWithTag(1, icon.mtype);
            } else {
                i = 0;
            }
            if (icon.mKey != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, icon.mKey);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (icon.mfs_unit != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, icon.mfs_unit);
            }
            return i4 + i3 + icon.unknownFields().size();
        }

        /* renamed from: a */
        public Icon decode(ProtoReader protoReader) throws IOException {
            C49710a aVar = new C49710a();
            aVar.f124455b = "";
            aVar.f124456c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124454a = IconType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124455b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124456c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Icon icon) throws IOException {
            if (icon.mtype != null) {
                IconType.ADAPTER.encodeWithTag(protoWriter, 1, icon.mtype);
            }
            if (icon.mKey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, icon.mKey);
            }
            if (icon.mfs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, icon.mfs_unit);
            }
            protoWriter.writeBytes(icon.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Icon$a */
    public static final class C49710a extends Message.Builder<Icon, C49710a> {

        /* renamed from: a */
        public IconType f124454a;

        /* renamed from: b */
        public String f124455b;

        /* renamed from: c */
        public String f124456c;

        /* renamed from: a */
        public Icon build() {
            return new Icon(this.f124454a, this.f124455b, this.f124456c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49710a newBuilder() {
        C49710a aVar = new C49710a();
        aVar.f124454a = this.mtype;
        aVar.f124455b = this.mKey;
        aVar.f124456c = this.mfs_unit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mKey != null) {
            sb.append(", Key=");
            sb.append(this.mKey);
        }
        if (this.mfs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.mfs_unit);
        }
        StringBuilder replace = sb.replace(0, 2, "Icon{");
        replace.append('}');
        return replace.toString();
    }

    public Icon(IconType iconType, String str, String str2) {
        this(iconType, str, str2, ByteString.EMPTY);
    }

    public Icon(IconType iconType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = iconType;
        this.mKey = str;
        this.mfs_unit = str2;
    }
}
