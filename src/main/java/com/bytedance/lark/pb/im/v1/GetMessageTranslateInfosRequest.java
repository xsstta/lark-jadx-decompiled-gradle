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

public final class GetMessageTranslateInfosRequest extends Message<GetMessageTranslateInfosRequest, C17633a> {
    public static final ProtoAdapter<GetMessageTranslateInfosRequest> ADAPTER = new C17634b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageTranslateInfosRequest$b */
    private static final class C17634b extends ProtoAdapter<GetMessageTranslateInfosRequest> {
        C17634b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageTranslateInfosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageTranslateInfosRequest getMessageTranslateInfosRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageTranslateInfosRequest.message_id) + getMessageTranslateInfosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageTranslateInfosRequest decode(ProtoReader protoReader) throws IOException {
            C17633a aVar = new C17633a();
            aVar.f44643a = "";
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
                    aVar.f44643a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageTranslateInfosRequest getMessageTranslateInfosRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageTranslateInfosRequest.message_id);
            protoWriter.writeBytes(getMessageTranslateInfosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageTranslateInfosRequest$a */
    public static final class C17633a extends Message.Builder<GetMessageTranslateInfosRequest, C17633a> {

        /* renamed from: a */
        public String f44643a;

        /* renamed from: a */
        public GetMessageTranslateInfosRequest build() {
            String str = this.f44643a;
            if (str != null) {
                return new GetMessageTranslateInfosRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C17633a newBuilder() {
        C17633a aVar = new C17633a();
        aVar.f44643a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageTranslateInfosRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        StringBuilder replace = sb.replace(0, 2, "GetMessageTranslateInfosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageTranslateInfosRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetMessageTranslateInfosRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
