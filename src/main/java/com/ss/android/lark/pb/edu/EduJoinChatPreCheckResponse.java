package com.ss.android.lark.pb.edu;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class EduJoinChatPreCheckResponse extends Message<EduJoinChatPreCheckResponse, C49634a> {
    public static final ProtoAdapter<EduJoinChatPreCheckResponse> ADAPTER = new C49635b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> muser_ids;

    /* renamed from: com.ss.android.lark.pb.edu.EduJoinChatPreCheckResponse$a */
    public static final class C49634a extends Message.Builder<EduJoinChatPreCheckResponse, C49634a> {

        /* renamed from: a */
        public Map<String, Boolean> f124279a = Internal.newMutableMap();

        /* renamed from: a */
        public EduJoinChatPreCheckResponse build() {
            return new EduJoinChatPreCheckResponse(this.f124279a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.edu.EduJoinChatPreCheckResponse$b */
    private static final class C49635b extends ProtoAdapter<EduJoinChatPreCheckResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f124280a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C49635b() {
            super(FieldEncoding.LENGTH_DELIMITED, EduJoinChatPreCheckResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(EduJoinChatPreCheckResponse eduJoinChatPreCheckResponse) {
            return this.f124280a.encodedSizeWithTag(1, eduJoinChatPreCheckResponse.muser_ids) + eduJoinChatPreCheckResponse.unknownFields().size();
        }

        /* renamed from: a */
        public EduJoinChatPreCheckResponse decode(ProtoReader protoReader) throws IOException {
            C49634a aVar = new C49634a();
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
                    aVar.f124279a.putAll(this.f124280a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EduJoinChatPreCheckResponse eduJoinChatPreCheckResponse) throws IOException {
            this.f124280a.encodeWithTag(protoWriter, 1, eduJoinChatPreCheckResponse.muser_ids);
            protoWriter.writeBytes(eduJoinChatPreCheckResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49634a newBuilder() {
        C49634a aVar = new C49634a();
        aVar.f124279a = Internal.copyOf("muser_ids", this.muser_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.muser_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.muser_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "EduJoinChatPreCheckResponse{");
        replace.append('}');
        return replace.toString();
    }

    public EduJoinChatPreCheckResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public EduJoinChatPreCheckResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_ids = Internal.immutableCopyOf("muser_ids", map);
    }
}
