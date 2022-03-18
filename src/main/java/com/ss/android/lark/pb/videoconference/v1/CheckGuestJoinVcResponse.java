package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckGuestJoinVcResponse extends Message<CheckGuestJoinVcResponse, C50503a> {
    public static final ProtoAdapter<CheckGuestJoinVcResponse> ADAPTER = new C50504b();
    private static final long serialVersionUID = 0;
    public final String response;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcResponse$b */
    private static final class C50504b extends ProtoAdapter<CheckGuestJoinVcResponse> {
        C50504b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckGuestJoinVcResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckGuestJoinVcResponse checkGuestJoinVcResponse) {
            int i;
            if (checkGuestJoinVcResponse.response != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, checkGuestJoinVcResponse.response);
            } else {
                i = 0;
            }
            return i + checkGuestJoinVcResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckGuestJoinVcResponse decode(ProtoReader protoReader) throws IOException {
            C50503a aVar = new C50503a();
            aVar.f126094a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126094a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckGuestJoinVcResponse checkGuestJoinVcResponse) throws IOException {
            if (checkGuestJoinVcResponse.response != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkGuestJoinVcResponse.response);
            }
            protoWriter.writeBytes(checkGuestJoinVcResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcResponse$a */
    public static final class C50503a extends Message.Builder<CheckGuestJoinVcResponse, C50503a> {

        /* renamed from: a */
        public String f126094a;

        /* renamed from: a */
        public CheckGuestJoinVcResponse build() {
            return new CheckGuestJoinVcResponse(this.f126094a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50503a newBuilder() {
        C50503a aVar = new C50503a();
        aVar.f126094a = this.response;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CheckGuestJoinVcResponse");
        StringBuilder sb = new StringBuilder();
        if (this.response != null) {
            sb.append(", response=");
            sb.append(this.response);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckGuestJoinVcResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckGuestJoinVcResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public CheckGuestJoinVcResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.response = str;
    }
}
