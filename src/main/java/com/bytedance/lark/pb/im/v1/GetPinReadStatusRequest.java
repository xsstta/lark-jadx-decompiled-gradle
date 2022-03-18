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

public final class GetPinReadStatusRequest extends Message<GetPinReadStatusRequest, C17664a> {
    public static final ProtoAdapter<GetPinReadStatusRequest> ADAPTER = new C17665b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPinReadStatusRequest$b */
    private static final class C17665b extends ProtoAdapter<GetPinReadStatusRequest> {
        C17665b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPinReadStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPinReadStatusRequest getPinReadStatusRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getPinReadStatusRequest.chat_id) + getPinReadStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPinReadStatusRequest decode(ProtoReader protoReader) throws IOException {
            C17664a aVar = new C17664a();
            aVar.f44670a = "";
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
                    aVar.f44670a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPinReadStatusRequest getPinReadStatusRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPinReadStatusRequest.chat_id);
            protoWriter.writeBytes(getPinReadStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPinReadStatusRequest$a */
    public static final class C17664a extends Message.Builder<GetPinReadStatusRequest, C17664a> {

        /* renamed from: a */
        public String f44670a;

        /* renamed from: a */
        public GetPinReadStatusRequest build() {
            String str = this.f44670a;
            if (str != null) {
                return new GetPinReadStatusRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17664a mo61733a(String str) {
            this.f44670a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17664a newBuilder() {
        C17664a aVar = new C17664a();
        aVar.f44670a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetPinReadStatusRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetPinReadStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPinReadStatusRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetPinReadStatusRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
