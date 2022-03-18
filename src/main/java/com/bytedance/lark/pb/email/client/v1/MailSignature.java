package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailSignature extends Message<MailSignature, C16896a> {
    public static final ProtoAdapter<MailSignature> ADAPTER = new C16897b();
    public static final SignatureDevice DEFAULT_SIGNATURE_DEVICE = SignatureDevice.PC;
    public static final SignatureType DEFAULT_SIGNATURE_TYPE = SignatureType.USER;
    private static final long serialVersionUID = 0;
    public final String id;
    public final List<DraftImage> images;
    public final String name;
    public final SignatureDevice signature_device;
    public final SignatureType signature_type;
    public final String template_html;
    public final String template_value_json;

    public enum SignatureDevice implements WireEnum {
        PC(0),
        MOBILE(1);
        
        public static final ProtoAdapter<SignatureDevice> ADAPTER = ProtoAdapter.newEnumAdapter(SignatureDevice.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SignatureDevice fromValue(int i) {
            if (i == 0) {
                return PC;
            }
            if (i != 1) {
                return null;
            }
            return MOBILE;
        }

        private SignatureDevice(int i) {
            this.value = i;
        }
    }

    public enum SignatureType implements WireEnum {
        USER(0),
        TENANT(1);
        
        public static final ProtoAdapter<SignatureType> ADAPTER = ProtoAdapter.newEnumAdapter(SignatureType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SignatureType fromValue(int i) {
            if (i == 0) {
                return USER;
            }
            if (i != 1) {
                return null;
            }
            return TENANT;
        }

        private SignatureType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSignature$b */
    private static final class C16897b extends ProtoAdapter<MailSignature> {
        C16897b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSignature.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSignature mailSignature) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (mailSignature.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSignature.id);
            } else {
                i = 0;
            }
            if (mailSignature.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailSignature.name);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (mailSignature.template_html != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailSignature.template_html);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (mailSignature.template_value_json != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailSignature.template_value_json);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i8 + i4 + DraftImage.ADAPTER.asRepeated().encodedSizeWithTag(5, mailSignature.images);
            if (mailSignature.signature_type != null) {
                i5 = SignatureType.ADAPTER.encodedSizeWithTag(6, mailSignature.signature_type);
            } else {
                i5 = 0;
            }
            int i9 = encodedSizeWithTag + i5;
            if (mailSignature.signature_device != null) {
                i6 = SignatureDevice.ADAPTER.encodedSizeWithTag(7, mailSignature.signature_device);
            }
            return i9 + i6 + mailSignature.unknownFields().size();
        }

        /* renamed from: a */
        public MailSignature decode(ProtoReader protoReader) throws IOException {
            C16896a aVar = new C16896a();
            aVar.f43371a = "";
            aVar.f43372b = "";
            aVar.f43373c = "";
            aVar.f43374d = "";
            aVar.f43376f = SignatureType.USER;
            aVar.f43377g = SignatureDevice.PC;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43371a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43372b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43373c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43374d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43375e.add(DraftImage.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            try {
                                aVar.f43376f = SignatureType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f43377g = SignatureDevice.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, MailSignature mailSignature) throws IOException {
            if (mailSignature.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSignature.id);
            }
            if (mailSignature.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailSignature.name);
            }
            if (mailSignature.template_html != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailSignature.template_html);
            }
            if (mailSignature.template_value_json != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailSignature.template_value_json);
            }
            DraftImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, mailSignature.images);
            if (mailSignature.signature_type != null) {
                SignatureType.ADAPTER.encodeWithTag(protoWriter, 6, mailSignature.signature_type);
            }
            if (mailSignature.signature_device != null) {
                SignatureDevice.ADAPTER.encodeWithTag(protoWriter, 7, mailSignature.signature_device);
            }
            protoWriter.writeBytes(mailSignature.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSignature$a */
    public static final class C16896a extends Message.Builder<MailSignature, C16896a> {

        /* renamed from: a */
        public String f43371a;

        /* renamed from: b */
        public String f43372b;

        /* renamed from: c */
        public String f43373c;

        /* renamed from: d */
        public String f43374d;

        /* renamed from: e */
        public List<DraftImage> f43375e = Internal.newMutableList();

        /* renamed from: f */
        public SignatureType f43376f;

        /* renamed from: g */
        public SignatureDevice f43377g;

        /* renamed from: a */
        public MailSignature build() {
            return new MailSignature(this.f43371a, this.f43372b, this.f43373c, this.f43374d, this.f43375e, this.f43376f, this.f43377g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16896a newBuilder() {
        C16896a aVar = new C16896a();
        aVar.f43371a = this.id;
        aVar.f43372b = this.name;
        aVar.f43373c = this.template_html;
        aVar.f43374d = this.template_value_json;
        aVar.f43375e = Internal.copyOf("images", this.images);
        aVar.f43376f = this.signature_type;
        aVar.f43377g = this.signature_device;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSignature");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.template_html != null) {
            sb.append(", template_html=");
            sb.append(this.template_html);
        }
        if (this.template_value_json != null) {
            sb.append(", template_value_json=");
            sb.append(this.template_value_json);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        if (this.signature_type != null) {
            sb.append(", signature_type=");
            sb.append(this.signature_type);
        }
        if (this.signature_device != null) {
            sb.append(", signature_device=");
            sb.append(this.signature_device);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSignature{");
        replace.append('}');
        return replace.toString();
    }

    public MailSignature(String str, String str2, String str3, String str4, List<DraftImage> list, SignatureType signatureType, SignatureDevice signatureDevice) {
        this(str, str2, str3, str4, list, signatureType, signatureDevice, ByteString.EMPTY);
    }

    public MailSignature(String str, String str2, String str3, String str4, List<DraftImage> list, SignatureType signatureType, SignatureDevice signatureDevice, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.template_html = str3;
        this.template_value_json = str4;
        this.images = Internal.immutableCopyOf("images", list);
        this.signature_type = signatureType;
        this.signature_device = signatureDevice;
    }
}
