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

public final class CheckChattersInChatResponse extends Message<CheckChattersInChatResponse, C17324a> {
    public static final ProtoAdapter<CheckChattersInChatResponse> ADAPTER = new C17325b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> chatters;

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckChattersInChatResponse$a */
    public static final class C17324a extends Message.Builder<CheckChattersInChatResponse, C17324a> {

        /* renamed from: a */
        public Map<String, Boolean> f44176a = Internal.newMutableMap();

        /* renamed from: a */
        public CheckChattersInChatResponse build() {
            return new CheckChattersInChatResponse(this.f44176a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckChattersInChatResponse$b */
    private static final class C17325b extends ProtoAdapter<CheckChattersInChatResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f44177a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C17325b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckChattersInChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckChattersInChatResponse checkChattersInChatResponse) {
            return this.f44177a.encodedSizeWithTag(1, checkChattersInChatResponse.chatters) + checkChattersInChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckChattersInChatResponse decode(ProtoReader protoReader) throws IOException {
            C17324a aVar = new C17324a();
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
                    aVar.f44176a.putAll(this.f44177a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckChattersInChatResponse checkChattersInChatResponse) throws IOException {
            this.f44177a.encodeWithTag(protoWriter, 1, checkChattersInChatResponse.chatters);
            protoWriter.writeBytes(checkChattersInChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17324a newBuilder() {
        C17324a aVar = new C17324a();
        aVar.f44176a = Internal.copyOf("chatters", this.chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CheckChattersInChatResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckChattersInChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckChattersInChatResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public CheckChattersInChatResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatters = Internal.immutableCopyOf("chatters", map);
    }
}
