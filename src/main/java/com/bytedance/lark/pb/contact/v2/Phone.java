package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Phone extends Message<Phone, C16552a> {
    public static final ProtoAdapter<Phone> ADAPTER = new C16553b();
    private static final long serialVersionUID = 0;
    public final String district_number;
    public final String phone_number;
    public final String region_code;

    /* renamed from: com.bytedance.lark.pb.contact.v2.Phone$b */
    private static final class C16553b extends ProtoAdapter<Phone> {
        C16553b() {
            super(FieldEncoding.LENGTH_DELIMITED, Phone.class);
        }

        /* renamed from: a */
        public int encodedSize(Phone phone) {
            int i;
            int i2;
            int i3 = 0;
            if (phone.district_number != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, phone.district_number);
            } else {
                i = 0;
            }
            if (phone.phone_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, phone.phone_number);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (phone.region_code != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, phone.region_code);
            }
            return i4 + i3 + phone.unknownFields().size();
        }

        /* renamed from: a */
        public Phone decode(ProtoReader protoReader) throws IOException {
            C16552a aVar = new C16552a();
            aVar.f42919a = "";
            aVar.f42920b = "";
            aVar.f42921c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42919a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42920b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42921c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Phone phone) throws IOException {
            if (phone.district_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, phone.district_number);
            }
            if (phone.phone_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, phone.phone_number);
            }
            if (phone.region_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, phone.region_code);
            }
            protoWriter.writeBytes(phone.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.Phone$a */
    public static final class C16552a extends Message.Builder<Phone, C16552a> {

        /* renamed from: a */
        public String f42919a;

        /* renamed from: b */
        public String f42920b;

        /* renamed from: c */
        public String f42921c;

        /* renamed from: a */
        public Phone build() {
            return new Phone(this.f42919a, this.f42920b, this.f42921c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16552a mo58922a(String str) {
            this.f42919a = str;
            return this;
        }

        /* renamed from: b */
        public C16552a mo58924b(String str) {
            this.f42920b = str;
            return this;
        }

        /* renamed from: c */
        public C16552a mo58925c(String str) {
            this.f42921c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16552a newBuilder() {
        C16552a aVar = new C16552a();
        aVar.f42919a = this.district_number;
        aVar.f42920b = this.phone_number;
        aVar.f42921c = this.region_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "Phone");
        StringBuilder sb = new StringBuilder();
        if (this.district_number != null) {
            sb.append(", district_number=");
            sb.append(this.district_number);
        }
        if (this.phone_number != null) {
            sb.append(", phone_number=");
            sb.append(this.phone_number);
        }
        if (this.region_code != null) {
            sb.append(", region_code=");
            sb.append(this.region_code);
        }
        StringBuilder replace = sb.replace(0, 2, "Phone{");
        replace.append('}');
        return replace.toString();
    }

    public Phone(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public Phone(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.district_number = str;
        this.phone_number = str2;
        this.region_code = str3;
    }
}
