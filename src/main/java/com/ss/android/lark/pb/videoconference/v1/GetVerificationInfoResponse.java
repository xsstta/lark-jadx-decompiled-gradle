package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVerificationInfoResponse extends Message<GetVerificationInfoResponse, C50719a> {
    public static final ProtoAdapter<GetVerificationInfoResponse> ADAPTER = new C50720b();
    public static final Integer DEFAULT_APP_ID = 0;
    private static final long serialVersionUID = 0;
    public final Integer app_id;
    public final String scene;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoResponse$b */
    private static final class C50720b extends ProtoAdapter<GetVerificationInfoResponse> {
        C50720b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVerificationInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVerificationInfoResponse getVerificationInfoResponse) {
            int i;
            int i2 = 0;
            if (getVerificationInfoResponse.app_id != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getVerificationInfoResponse.app_id);
            } else {
                i = 0;
            }
            if (getVerificationInfoResponse.scene != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getVerificationInfoResponse.scene);
            }
            return i + i2 + getVerificationInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVerificationInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50719a aVar = new C50719a();
            aVar.f126465a = 0;
            aVar.f126466b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126465a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126466b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVerificationInfoResponse getVerificationInfoResponse) throws IOException {
            if (getVerificationInfoResponse.app_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getVerificationInfoResponse.app_id);
            }
            if (getVerificationInfoResponse.scene != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getVerificationInfoResponse.scene);
            }
            protoWriter.writeBytes(getVerificationInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoResponse$a */
    public static final class C50719a extends Message.Builder<GetVerificationInfoResponse, C50719a> {

        /* renamed from: a */
        public Integer f126465a;

        /* renamed from: b */
        public String f126466b;

        /* renamed from: a */
        public GetVerificationInfoResponse build() {
            return new GetVerificationInfoResponse(this.f126465a, this.f126466b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50719a newBuilder() {
        C50719a aVar = new C50719a();
        aVar.f126465a = this.app_id;
        aVar.f126466b = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVerificationInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVerificationInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVerificationInfoResponse(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public GetVerificationInfoResponse(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = num;
        this.scene = str;
    }
}
