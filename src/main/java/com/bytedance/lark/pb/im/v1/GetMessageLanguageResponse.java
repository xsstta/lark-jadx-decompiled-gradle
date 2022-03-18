package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetMessageLanguageResponse extends Message<GetMessageLanguageResponse, C17619a> {
    public static final ProtoAdapter<GetMessageLanguageResponse> ADAPTER = new C17620b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> message_language;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageLanguageResponse$a */
    public static final class C17619a extends Message.Builder<GetMessageLanguageResponse, C17619a> {

        /* renamed from: a */
        public Map<String, String> f44616a = Internal.newMutableMap();

        /* renamed from: a */
        public GetMessageLanguageResponse build() {
            return new GetMessageLanguageResponse(this.f44616a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageLanguageResponse$b */
    private static final class C17620b extends ProtoAdapter<GetMessageLanguageResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f44617a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17620b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageLanguageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageLanguageResponse getMessageLanguageResponse) {
            return this.f44617a.encodedSizeWithTag(1, getMessageLanguageResponse.message_language) + getMessageLanguageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageLanguageResponse decode(ProtoReader protoReader) throws IOException {
            C17619a aVar = new C17619a();
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
                    aVar.f44616a.putAll(this.f44617a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageLanguageResponse getMessageLanguageResponse) throws IOException {
            this.f44617a.encodeWithTag(protoWriter, 1, getMessageLanguageResponse.message_language);
            protoWriter.writeBytes(getMessageLanguageResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17619a newBuilder() {
        C17619a aVar = new C17619a();
        aVar.f44616a = Internal.copyOf("message_language", this.message_language);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageLanguageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_language.isEmpty()) {
            sb.append(", message_language=");
            sb.append(this.message_language);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageLanguageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageLanguageResponse(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMessageLanguageResponse(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_language = Internal.immutableCopyOf("message_language", map);
    }
}
