package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPhoneNumberAttributtonResponse extends Message<GetPhoneNumberAttributtonResponse, C50328a> {
    public static final ProtoAdapter<GetPhoneNumberAttributtonResponse> ADAPTER = new C50329b();
    private static final long serialVersionUID = 0;
    public final String misp;
    public final String mprovince;

    /* renamed from: com.ss.android.lark.pb.videochat.GetPhoneNumberAttributtonResponse$b */
    private static final class C50329b extends ProtoAdapter<GetPhoneNumberAttributtonResponse> {
        C50329b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPhoneNumberAttributtonResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPhoneNumberAttributtonResponse getPhoneNumberAttributtonResponse) {
            int i;
            int i2 = 0;
            if (getPhoneNumberAttributtonResponse.mprovince != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getPhoneNumberAttributtonResponse.mprovince);
            } else {
                i = 0;
            }
            if (getPhoneNumberAttributtonResponse.misp != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getPhoneNumberAttributtonResponse.misp);
            }
            return i + i2 + getPhoneNumberAttributtonResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPhoneNumberAttributtonResponse decode(ProtoReader protoReader) throws IOException {
            C50328a aVar = new C50328a();
            aVar.f125706a = "";
            aVar.f125707b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125706a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125707b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPhoneNumberAttributtonResponse getPhoneNumberAttributtonResponse) throws IOException {
            if (getPhoneNumberAttributtonResponse.mprovince != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPhoneNumberAttributtonResponse.mprovince);
            }
            if (getPhoneNumberAttributtonResponse.misp != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getPhoneNumberAttributtonResponse.misp);
            }
            protoWriter.writeBytes(getPhoneNumberAttributtonResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetPhoneNumberAttributtonResponse$a */
    public static final class C50328a extends Message.Builder<GetPhoneNumberAttributtonResponse, C50328a> {

        /* renamed from: a */
        public String f125706a;

        /* renamed from: b */
        public String f125707b;

        /* renamed from: a */
        public GetPhoneNumberAttributtonResponse build() {
            return new GetPhoneNumberAttributtonResponse(this.f125706a, this.f125707b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50328a newBuilder() {
        C50328a aVar = new C50328a();
        aVar.f125706a = this.mprovince;
        aVar.f125707b = this.misp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mprovince != null) {
            sb.append(", province=");
            sb.append(this.mprovince);
        }
        if (this.misp != null) {
            sb.append(", isp=");
            sb.append(this.misp);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPhoneNumberAttributtonResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPhoneNumberAttributtonResponse(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetPhoneNumberAttributtonResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mprovince = str;
        this.misp = str2;
    }
}
