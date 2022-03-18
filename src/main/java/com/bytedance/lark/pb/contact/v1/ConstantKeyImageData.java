package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class ConstantKeyImageData extends Message<ConstantKeyImageData, C16150a> {
    public static final ProtoAdapter<ConstantKeyImageData> ADAPTER = new C16151b();
    public static final ConstantKeyImageType DEFAULT_TYPE = ConstantKeyImageType.UnknownType;
    private static final long serialVersionUID = 0;
    public final String dynamic_key;
    public final String qr_code;
    public final ConstantKeyImageType type;

    public enum ConstantKeyImageType implements WireEnum {
        UnknownType(0),
        AppName(1),
        AppIcon(2),
        UserName(3),
        TenantName(4),
        UserAvatar(5),
        TenantAvatar(6),
        PersonalContactQr(7),
        TeamCodeQr(8),
        QRCodeStr(9),
        TccTextResource(255);
        
        public static final ProtoAdapter<ConstantKeyImageType> ADAPTER = ProtoAdapter.newEnumAdapter(ConstantKeyImageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ConstantKeyImageType fromValue(int i) {
            if (i == 255) {
                return TccTextResource;
            }
            switch (i) {
                case 0:
                    return UnknownType;
                case 1:
                    return AppName;
                case 2:
                    return AppIcon;
                case 3:
                    return UserName;
                case 4:
                    return TenantName;
                case 5:
                    return UserAvatar;
                case 6:
                    return TenantAvatar;
                case 7:
                    return PersonalContactQr;
                case 8:
                    return TeamCodeQr;
                case 9:
                    return QRCodeStr;
                default:
                    return null;
            }
        }

        private ConstantKeyImageType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ConstantKeyImageData$b */
    private static final class C16151b extends ProtoAdapter<ConstantKeyImageData> {
        C16151b() {
            super(FieldEncoding.LENGTH_DELIMITED, ConstantKeyImageData.class);
        }

        /* renamed from: a */
        public int encodedSize(ConstantKeyImageData constantKeyImageData) {
            int i;
            int encodedSizeWithTag = ConstantKeyImageType.ADAPTER.encodedSizeWithTag(1, constantKeyImageData.type);
            int i2 = 0;
            if (constantKeyImageData.dynamic_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, constantKeyImageData.dynamic_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (constantKeyImageData.qr_code != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, constantKeyImageData.qr_code);
            }
            return i3 + i2 + constantKeyImageData.unknownFields().size();
        }

        /* renamed from: a */
        public ConstantKeyImageData decode(ProtoReader protoReader) throws IOException {
            C16150a aVar = new C16150a();
            aVar.f42272a = ConstantKeyImageType.UnknownType;
            aVar.f42273b = "";
            aVar.f42274c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42272a = ConstantKeyImageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42273b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42274c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ConstantKeyImageData constantKeyImageData) throws IOException {
            ConstantKeyImageType.ADAPTER.encodeWithTag(protoWriter, 1, constantKeyImageData.type);
            if (constantKeyImageData.dynamic_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, constantKeyImageData.dynamic_key);
            }
            if (constantKeyImageData.qr_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, constantKeyImageData.qr_code);
            }
            protoWriter.writeBytes(constantKeyImageData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16150a newBuilder() {
        C16150a aVar = new C16150a();
        aVar.f42272a = this.type;
        aVar.f42273b = this.dynamic_key;
        aVar.f42274c = this.qr_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ConstantKeyImageData$a */
    public static final class C16150a extends Message.Builder<ConstantKeyImageData, C16150a> {

        /* renamed from: a */
        public ConstantKeyImageType f42272a;

        /* renamed from: b */
        public String f42273b;

        /* renamed from: c */
        public String f42274c;

        /* renamed from: a */
        public ConstantKeyImageData build() {
            ConstantKeyImageType constantKeyImageType = this.f42272a;
            if (constantKeyImageType != null) {
                return new ConstantKeyImageData(constantKeyImageType, this.f42273b, this.f42274c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(constantKeyImageType, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ConstantKeyImageData");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.dynamic_key != null) {
            sb.append(", dynamic_key=");
            sb.append(this.dynamic_key);
        }
        if (this.qr_code != null) {
            sb.append(", qr_code=");
            sb.append(this.qr_code);
        }
        StringBuilder replace = sb.replace(0, 2, "ConstantKeyImageData{");
        replace.append('}');
        return replace.toString();
    }

    public ConstantKeyImageData(ConstantKeyImageType constantKeyImageType, String str, String str2) {
        this(constantKeyImageType, str, str2, ByteString.EMPTY);
    }

    public ConstantKeyImageData(ConstantKeyImageType constantKeyImageType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = constantKeyImageType;
        this.dynamic_key = str;
        this.qr_code = str2;
    }
}
