package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetP2PChatsByChatterIdsResponse extends Message<GetP2PChatsByChatterIdsResponse, C17659a> {
    public static final ProtoAdapter<GetP2PChatsByChatterIdsResponse> ADAPTER = new C17660b();
    private static final long serialVersionUID = 0;
    public final Map<String, Chat> chatter_id2chat;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetP2PChatsByChatterIdsResponse$a */
    public static final class C17659a extends Message.Builder<GetP2PChatsByChatterIdsResponse, C17659a> {

        /* renamed from: a */
        public Map<String, Chat> f44667a = Internal.newMutableMap();

        /* renamed from: a */
        public GetP2PChatsByChatterIdsResponse build() {
            return new GetP2PChatsByChatterIdsResponse(this.f44667a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetP2PChatsByChatterIdsResponse$b */
    private static final class C17660b extends ProtoAdapter<GetP2PChatsByChatterIdsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Chat>> f44668a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chat.ADAPTER);

        C17660b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetP2PChatsByChatterIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetP2PChatsByChatterIdsResponse getP2PChatsByChatterIdsResponse) {
            return this.f44668a.encodedSizeWithTag(1, getP2PChatsByChatterIdsResponse.chatter_id2chat) + getP2PChatsByChatterIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetP2PChatsByChatterIdsResponse decode(ProtoReader protoReader) throws IOException {
            C17659a aVar = new C17659a();
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
                    aVar.f44667a.putAll(this.f44668a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetP2PChatsByChatterIdsResponse getP2PChatsByChatterIdsResponse) throws IOException {
            this.f44668a.encodeWithTag(protoWriter, 1, getP2PChatsByChatterIdsResponse.chatter_id2chat);
            protoWriter.writeBytes(getP2PChatsByChatterIdsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17659a newBuilder() {
        C17659a aVar = new C17659a();
        aVar.f44667a = Internal.copyOf("chatter_id2chat", this.chatter_id2chat);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetP2PChatsByChatterIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_id2chat.isEmpty()) {
            sb.append(", chatter_id2chat=");
            sb.append(this.chatter_id2chat);
        }
        StringBuilder replace = sb.replace(0, 2, "GetP2PChatsByChatterIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetP2PChatsByChatterIdsResponse(Map<String, Chat> map) {
        this(map, ByteString.EMPTY);
    }

    public GetP2PChatsByChatterIdsResponse(Map<String, Chat> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_id2chat = Internal.immutableCopyOf("chatter_id2chat", map);
    }
}
