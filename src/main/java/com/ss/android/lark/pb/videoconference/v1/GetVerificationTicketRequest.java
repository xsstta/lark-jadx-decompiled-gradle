package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetVerificationTicketRequest extends Message<GetVerificationTicketRequest, C50721a> {
    public static final ProtoAdapter<GetVerificationTicketRequest> ADAPTER = new C50722b();
    public static final Integer DEFAULT_APP_ID = 0;
    private static final long serialVersionUID = 0;
    public final Integer app_id;
    public final String scene;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketRequest$b */
    private static final class C50722b extends ProtoAdapter<GetVerificationTicketRequest> {
        C50722b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVerificationTicketRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVerificationTicketRequest getVerificationTicketRequest) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getVerificationTicketRequest.app_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getVerificationTicketRequest.scene) + getVerificationTicketRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVerificationTicketRequest decode(ProtoReader protoReader) throws IOException {
            C50721a aVar = new C50721a();
            aVar.f126467a = 0;
            aVar.f126468b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126467a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126468b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVerificationTicketRequest getVerificationTicketRequest) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getVerificationTicketRequest.app_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getVerificationTicketRequest.scene);
            protoWriter.writeBytes(getVerificationTicketRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50721a newBuilder() {
        C50721a aVar = new C50721a();
        aVar.f126467a = this.app_id;
        aVar.f126468b = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketRequest$a */
    public static final class C50721a extends Message.Builder<GetVerificationTicketRequest, C50721a> {

        /* renamed from: a */
        public Integer f126467a;

        /* renamed from: b */
        public String f126468b;

        /* renamed from: a */
        public GetVerificationTicketRequest build() {
            String str;
            Integer num = this.f126467a;
            if (num != null && (str = this.f126468b) != null) {
                return new GetVerificationTicketRequest(num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "app_id", this.f126468b, "scene");
        }

        /* renamed from: a */
        public C50721a mo175428a(Integer num) {
            this.f126467a = num;
            return this;
        }

        /* renamed from: a */
        public C50721a mo175429a(String str) {
            this.f126468b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVerificationTicketRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", scene=");
        sb.append(this.scene);
        StringBuilder replace = sb.replace(0, 2, "GetVerificationTicketRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVerificationTicketRequest(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public GetVerificationTicketRequest(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = num;
        this.scene = str;
    }
}
