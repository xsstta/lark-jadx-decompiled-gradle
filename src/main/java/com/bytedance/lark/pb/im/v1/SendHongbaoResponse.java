package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SendHongbaoResponse extends Message<SendHongbaoResponse, C18021a> {
    public static final ProtoAdapter<SendHongbaoResponse> ADAPTER = new C18022b();
    public static final PayURLType DEFAULT_PAY_URL_TYPE = PayURLType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String pay_url;
    public final PayURLType pay_url_type;

    public enum PayURLType implements WireEnum {
        UNKNOWN(0),
        CAIJING_PAY(1),
        BYTE_PAY(2);
        
        public static final ProtoAdapter<PayURLType> ADAPTER = ProtoAdapter.newEnumAdapter(PayURLType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PayURLType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CAIJING_PAY;
            }
            if (i != 2) {
                return null;
            }
            return BYTE_PAY;
        }

        private PayURLType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendHongbaoResponse$b */
    private static final class C18022b extends ProtoAdapter<SendHongbaoResponse> {
        C18022b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendHongbaoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendHongbaoResponse sendHongbaoResponse) {
            int i;
            int i2 = 0;
            if (sendHongbaoResponse.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendHongbaoResponse.id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.encodedSizeWithTag(2, sendHongbaoResponse.pay_url);
            if (sendHongbaoResponse.pay_url_type != null) {
                i2 = PayURLType.ADAPTER.encodedSizeWithTag(3, sendHongbaoResponse.pay_url_type);
            }
            return encodedSizeWithTag + i2 + sendHongbaoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendHongbaoResponse decode(ProtoReader protoReader) throws IOException {
            C18021a aVar = new C18021a();
            aVar.f45131a = "";
            aVar.f45132b = "";
            aVar.f45133c = PayURLType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45131a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45132b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45133c = PayURLType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendHongbaoResponse sendHongbaoResponse) throws IOException {
            if (sendHongbaoResponse.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendHongbaoResponse.id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendHongbaoResponse.pay_url);
            if (sendHongbaoResponse.pay_url_type != null) {
                PayURLType.ADAPTER.encodeWithTag(protoWriter, 3, sendHongbaoResponse.pay_url_type);
            }
            protoWriter.writeBytes(sendHongbaoResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18021a newBuilder() {
        C18021a aVar = new C18021a();
        aVar.f45131a = this.id;
        aVar.f45132b = this.pay_url;
        aVar.f45133c = this.pay_url_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendHongbaoResponse$a */
    public static final class C18021a extends Message.Builder<SendHongbaoResponse, C18021a> {

        /* renamed from: a */
        public String f45131a;

        /* renamed from: b */
        public String f45132b;

        /* renamed from: c */
        public PayURLType f45133c;

        /* renamed from: a */
        public SendHongbaoResponse build() {
            String str = this.f45132b;
            if (str != null) {
                return new SendHongbaoResponse(this.f45131a, str, this.f45133c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "pay_url");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendHongbaoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        sb.append(", pay_url=");
        sb.append(this.pay_url);
        if (this.pay_url_type != null) {
            sb.append(", pay_url_type=");
            sb.append(this.pay_url_type);
        }
        StringBuilder replace = sb.replace(0, 2, "SendHongbaoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendHongbaoResponse(String str, String str2, PayURLType payURLType) {
        this(str, str2, payURLType, ByteString.EMPTY);
    }

    public SendHongbaoResponse(String str, String str2, PayURLType payURLType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.pay_url = str2;
        this.pay_url_type = payURLType;
    }
}
