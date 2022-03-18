package com.bytedance.lark.pb.basic.v1;

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

public final class ChattersAuthResult extends Message<ChattersAuthResult, C14825a> {
    public static final ProtoAdapter<ChattersAuthResult> ADAPTER = new C14826b();
    private static final long serialVersionUID = 0;
    public final Map<String, DeniedReason> denied_reasons;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChattersAuthResult$a */
    public static final class C14825a extends Message.Builder<ChattersAuthResult, C14825a> {

        /* renamed from: a */
        public Map<String, DeniedReason> f39171a = Internal.newMutableMap();

        /* renamed from: a */
        public ChattersAuthResult build() {
            return new ChattersAuthResult(this.f39171a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChattersAuthResult$b */
    private static final class C14826b extends ProtoAdapter<ChattersAuthResult> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DeniedReason>> f39172a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DeniedReason.ADAPTER);

        C14826b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChattersAuthResult.class);
        }

        /* renamed from: a */
        public int encodedSize(ChattersAuthResult chattersAuthResult) {
            return this.f39172a.encodedSizeWithTag(1, chattersAuthResult.denied_reasons) + chattersAuthResult.unknownFields().size();
        }

        /* renamed from: a */
        public ChattersAuthResult decode(ProtoReader protoReader) throws IOException {
            C14825a aVar = new C14825a();
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
                    aVar.f39171a.putAll(this.f39172a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChattersAuthResult chattersAuthResult) throws IOException {
            this.f39172a.encodeWithTag(protoWriter, 1, chattersAuthResult.denied_reasons);
            protoWriter.writeBytes(chattersAuthResult.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14825a newBuilder() {
        C14825a aVar = new C14825a();
        aVar.f39171a = Internal.copyOf("denied_reasons", this.denied_reasons);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChattersAuthResult");
        StringBuilder sb = new StringBuilder();
        if (!this.denied_reasons.isEmpty()) {
            sb.append(", denied_reasons=");
            sb.append(this.denied_reasons);
        }
        StringBuilder replace = sb.replace(0, 2, "ChattersAuthResult{");
        replace.append('}');
        return replace.toString();
    }

    public ChattersAuthResult(Map<String, DeniedReason> map) {
        this(map, ByteString.EMPTY);
    }

    public ChattersAuthResult(Map<String, DeniedReason> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.denied_reasons = Internal.immutableCopyOf("denied_reasons", map);
    }
}
