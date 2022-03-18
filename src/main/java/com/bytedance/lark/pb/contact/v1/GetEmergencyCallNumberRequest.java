package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEmergencyCallNumberRequest extends Message<GetEmergencyCallNumberRequest, C16240a> {
    public static final ProtoAdapter<GetEmergencyCallNumberRequest> ADAPTER = new C16241b();
    private static final long serialVersionUID = 0;
    public final String callee_user_id;
    public final String caller_phone_number;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetEmergencyCallNumberRequest$b */
    private static final class C16241b extends ProtoAdapter<GetEmergencyCallNumberRequest> {
        C16241b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEmergencyCallNumberRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEmergencyCallNumberRequest getEmergencyCallNumberRequest) {
            int i;
            int i2 = 0;
            if (getEmergencyCallNumberRequest.caller_phone_number != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getEmergencyCallNumberRequest.caller_phone_number);
            } else {
                i = 0;
            }
            if (getEmergencyCallNumberRequest.callee_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getEmergencyCallNumberRequest.callee_user_id);
            }
            return i + i2 + getEmergencyCallNumberRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEmergencyCallNumberRequest decode(ProtoReader protoReader) throws IOException {
            C16240a aVar = new C16240a();
            aVar.f42436a = "";
            aVar.f42437b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42436a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42437b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEmergencyCallNumberRequest getEmergencyCallNumberRequest) throws IOException {
            if (getEmergencyCallNumberRequest.caller_phone_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEmergencyCallNumberRequest.caller_phone_number);
            }
            if (getEmergencyCallNumberRequest.callee_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getEmergencyCallNumberRequest.callee_user_id);
            }
            protoWriter.writeBytes(getEmergencyCallNumberRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetEmergencyCallNumberRequest$a */
    public static final class C16240a extends Message.Builder<GetEmergencyCallNumberRequest, C16240a> {

        /* renamed from: a */
        public String f42436a;

        /* renamed from: b */
        public String f42437b;

        /* renamed from: a */
        public GetEmergencyCallNumberRequest build() {
            return new GetEmergencyCallNumberRequest(this.f42436a, this.f42437b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16240a mo58187a(String str) {
            this.f42436a = str;
            return this;
        }

        /* renamed from: b */
        public C16240a mo58189b(String str) {
            this.f42437b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16240a newBuilder() {
        C16240a aVar = new C16240a();
        aVar.f42436a = this.caller_phone_number;
        aVar.f42437b = this.callee_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetEmergencyCallNumberRequest");
        StringBuilder sb = new StringBuilder();
        if (this.caller_phone_number != null) {
            sb.append(", caller_phone_number=");
            sb.append(this.caller_phone_number);
        }
        if (this.callee_user_id != null) {
            sb.append(", callee_user_id=");
            sb.append(this.callee_user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEmergencyCallNumberRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEmergencyCallNumberRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetEmergencyCallNumberRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.caller_phone_number = str;
        this.callee_user_id = str2;
    }
}
