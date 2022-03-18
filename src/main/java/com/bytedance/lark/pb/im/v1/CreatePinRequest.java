package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreatePinRequest extends Message<CreatePinRequest, C17372a> {
    public static final ProtoAdapter<CreatePinRequest> ADAPTER = new C17373b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreatePinRequest$b */
    private static final class C17373b extends ProtoAdapter<CreatePinRequest> {
        C17373b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreatePinRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreatePinRequest createPinRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createPinRequest.message_id) + createPinRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreatePinRequest decode(ProtoReader protoReader) throws IOException {
            C17372a aVar = new C17372a();
            aVar.f44256a = "";
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
                    aVar.f44256a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreatePinRequest createPinRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createPinRequest.message_id);
            protoWriter.writeBytes(createPinRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreatePinRequest$a */
    public static final class C17372a extends Message.Builder<CreatePinRequest, C17372a> {

        /* renamed from: a */
        public String f44256a;

        /* renamed from: a */
        public CreatePinRequest build() {
            String str = this.f44256a;
            if (str != null) {
                return new CreatePinRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C17372a mo60974a(String str) {
            this.f44256a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17372a newBuilder() {
        C17372a aVar = new C17372a();
        aVar.f44256a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreatePinRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        StringBuilder replace = sb.replace(0, 2, "CreatePinRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreatePinRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public CreatePinRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
