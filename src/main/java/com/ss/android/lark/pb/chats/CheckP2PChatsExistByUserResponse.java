package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CheckP2PChatsExistByUserResponse extends Message<CheckP2PChatsExistByUserResponse, C49576a> {
    public static final ProtoAdapter<CheckP2PChatsExistByUserResponse> ADAPTER = new C49577b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> mchatterChatMap;
    public final Map<String, Boolean> mexists;

    /* renamed from: com.ss.android.lark.pb.chats.CheckP2PChatsExistByUserResponse$a */
    public static final class C49576a extends Message.Builder<CheckP2PChatsExistByUserResponse, C49576a> {

        /* renamed from: a */
        public Map<String, Boolean> f124189a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, String> f124190b = Internal.newMutableMap();

        /* renamed from: a */
        public CheckP2PChatsExistByUserResponse build() {
            return new CheckP2PChatsExistByUserResponse(this.f124189a, this.f124190b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.CheckP2PChatsExistByUserResponse$b */
    private static final class C49577b extends ProtoAdapter<CheckP2PChatsExistByUserResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f124191a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f124192b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49577b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckP2PChatsExistByUserResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckP2PChatsExistByUserResponse checkP2PChatsExistByUserResponse) {
            return this.f124191a.encodedSizeWithTag(1, checkP2PChatsExistByUserResponse.mexists) + this.f124192b.encodedSizeWithTag(2, checkP2PChatsExistByUserResponse.mchatterChatMap) + checkP2PChatsExistByUserResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckP2PChatsExistByUserResponse decode(ProtoReader protoReader) throws IOException {
            C49576a aVar = new C49576a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124189a.putAll(this.f124191a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124190b.putAll(this.f124192b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckP2PChatsExistByUserResponse checkP2PChatsExistByUserResponse) throws IOException {
            this.f124191a.encodeWithTag(protoWriter, 1, checkP2PChatsExistByUserResponse.mexists);
            this.f124192b.encodeWithTag(protoWriter, 2, checkP2PChatsExistByUserResponse.mchatterChatMap);
            protoWriter.writeBytes(checkP2PChatsExistByUserResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49576a newBuilder() {
        C49576a aVar = new C49576a();
        aVar.f124189a = Internal.copyOf("mexists", this.mexists);
        aVar.f124190b = Internal.copyOf("mchatterChatMap", this.mchatterChatMap);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mexists.isEmpty()) {
            sb.append(", exists=");
            sb.append(this.mexists);
        }
        if (!this.mchatterChatMap.isEmpty()) {
            sb.append(", chatterChatMap=");
            sb.append(this.mchatterChatMap);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckP2PChatsExistByUserResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckP2PChatsExistByUserResponse(Map<String, Boolean> map, Map<String, String> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public CheckP2PChatsExistByUserResponse(Map<String, Boolean> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mexists = Internal.immutableCopyOf("mexists", map);
        this.mchatterChatMap = Internal.immutableCopyOf("mchatterChatMap", map2);
    }
}
