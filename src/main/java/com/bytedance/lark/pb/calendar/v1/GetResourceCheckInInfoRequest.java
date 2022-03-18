package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetResourceCheckInInfoRequest extends Message<GetResourceCheckInInfoRequest, C15766a> {
    public static final ProtoAdapter<GetResourceCheckInInfoRequest> ADAPTER = new C15767b();
    private static final long serialVersionUID = 0;
    public final String resource_check_in_token;
    public final String timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoRequest$b */
    private static final class C15767b extends ProtoAdapter<GetResourceCheckInInfoRequest> {
        C15767b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceCheckInInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceCheckInInfoRequest getResourceCheckInInfoRequest) {
            int i;
            int i2 = 0;
            if (getResourceCheckInInfoRequest.resource_check_in_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getResourceCheckInInfoRequest.resource_check_in_token);
            } else {
                i = 0;
            }
            if (getResourceCheckInInfoRequest.timezone != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getResourceCheckInInfoRequest.timezone);
            }
            return i + i2 + getResourceCheckInInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceCheckInInfoRequest decode(ProtoReader protoReader) throws IOException {
            C15766a aVar = new C15766a();
            aVar.f41527a = "";
            aVar.f41528b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41527a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41528b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetResourceCheckInInfoRequest getResourceCheckInInfoRequest) throws IOException {
            if (getResourceCheckInInfoRequest.resource_check_in_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getResourceCheckInInfoRequest.resource_check_in_token);
            }
            if (getResourceCheckInInfoRequest.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getResourceCheckInInfoRequest.timezone);
            }
            protoWriter.writeBytes(getResourceCheckInInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoRequest$a */
    public static final class C15766a extends Message.Builder<GetResourceCheckInInfoRequest, C15766a> {

        /* renamed from: a */
        public String f41527a;

        /* renamed from: b */
        public String f41528b;

        /* renamed from: a */
        public GetResourceCheckInInfoRequest build() {
            return new GetResourceCheckInInfoRequest(this.f41527a, this.f41528b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15766a mo56976a(String str) {
            this.f41527a = str;
            return this;
        }

        /* renamed from: b */
        public C15766a mo56978b(String str) {
            this.f41528b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15766a newBuilder() {
        C15766a aVar = new C15766a();
        aVar.f41527a = this.resource_check_in_token;
        aVar.f41528b = this.timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetResourceCheckInInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.resource_check_in_token != null) {
            sb.append(", resource_check_in_token=");
            sb.append(this.resource_check_in_token);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        StringBuilder replace = sb.replace(0, 2, "GetResourceCheckInInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceCheckInInfoRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetResourceCheckInInfoRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_check_in_token = str;
        this.timezone = str2;
    }
}
