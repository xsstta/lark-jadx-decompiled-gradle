package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEmergencyCallNumberResponse extends Message<GetEmergencyCallNumberResponse, C16242a> {
    public static final ProtoAdapter<GetEmergencyCallNumberResponse> ADAPTER = new C16243b();
    public static final Boolean DEFAULT_NEED_REASON = false;
    private static final long serialVersionUID = 0;
    public final String call_id;
    public final String emergency_call_number;
    public final Boolean need_reason;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetEmergencyCallNumberResponse$b */
    private static final class C16243b extends ProtoAdapter<GetEmergencyCallNumberResponse> {
        C16243b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEmergencyCallNumberResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEmergencyCallNumberResponse getEmergencyCallNumberResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getEmergencyCallNumberResponse.call_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getEmergencyCallNumberResponse.call_id);
            } else {
                i = 0;
            }
            if (getEmergencyCallNumberResponse.emergency_call_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getEmergencyCallNumberResponse.emergency_call_number);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getEmergencyCallNumberResponse.need_reason != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getEmergencyCallNumberResponse.need_reason);
            }
            return i4 + i3 + getEmergencyCallNumberResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEmergencyCallNumberResponse decode(ProtoReader protoReader) throws IOException {
            C16242a aVar = new C16242a();
            aVar.f42438a = "";
            aVar.f42439b = "";
            aVar.f42440c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42438a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42439b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42440c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEmergencyCallNumberResponse getEmergencyCallNumberResponse) throws IOException {
            if (getEmergencyCallNumberResponse.call_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEmergencyCallNumberResponse.call_id);
            }
            if (getEmergencyCallNumberResponse.emergency_call_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getEmergencyCallNumberResponse.emergency_call_number);
            }
            if (getEmergencyCallNumberResponse.need_reason != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getEmergencyCallNumberResponse.need_reason);
            }
            protoWriter.writeBytes(getEmergencyCallNumberResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetEmergencyCallNumberResponse$a */
    public static final class C16242a extends Message.Builder<GetEmergencyCallNumberResponse, C16242a> {

        /* renamed from: a */
        public String f42438a;

        /* renamed from: b */
        public String f42439b;

        /* renamed from: c */
        public Boolean f42440c;

        /* renamed from: a */
        public GetEmergencyCallNumberResponse build() {
            return new GetEmergencyCallNumberResponse(this.f42438a, this.f42439b, this.f42440c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16242a newBuilder() {
        C16242a aVar = new C16242a();
        aVar.f42438a = this.call_id;
        aVar.f42439b = this.emergency_call_number;
        aVar.f42440c = this.need_reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetEmergencyCallNumberResponse");
        StringBuilder sb = new StringBuilder();
        if (this.call_id != null) {
            sb.append(", call_id=");
            sb.append(this.call_id);
        }
        if (this.emergency_call_number != null) {
            sb.append(", emergency_call_number=");
            sb.append(this.emergency_call_number);
        }
        if (this.need_reason != null) {
            sb.append(", need_reason=");
            sb.append(this.need_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEmergencyCallNumberResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEmergencyCallNumberResponse(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public GetEmergencyCallNumberResponse(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.call_id = str;
        this.emergency_call_number = str2;
        this.need_reason = bool;
    }
}
