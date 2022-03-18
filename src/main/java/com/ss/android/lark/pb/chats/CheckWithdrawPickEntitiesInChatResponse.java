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

public final class CheckWithdrawPickEntitiesInChatResponse extends Message<CheckWithdrawPickEntitiesInChatResponse, C49580a> {
    public static final ProtoAdapter<CheckWithdrawPickEntitiesInChatResponse> ADAPTER = new C49581b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> mallow_withdraw;

    /* renamed from: com.ss.android.lark.pb.chats.CheckWithdrawPickEntitiesInChatResponse$a */
    public static final class C49580a extends Message.Builder<CheckWithdrawPickEntitiesInChatResponse, C49580a> {

        /* renamed from: a */
        public Map<String, Boolean> f124195a = Internal.newMutableMap();

        /* renamed from: a */
        public CheckWithdrawPickEntitiesInChatResponse build() {
            return new CheckWithdrawPickEntitiesInChatResponse(this.f124195a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.CheckWithdrawPickEntitiesInChatResponse$b */
    private static final class C49581b extends ProtoAdapter<CheckWithdrawPickEntitiesInChatResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f124196a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C49581b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckWithdrawPickEntitiesInChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckWithdrawPickEntitiesInChatResponse checkWithdrawPickEntitiesInChatResponse) {
            return this.f124196a.encodedSizeWithTag(1, checkWithdrawPickEntitiesInChatResponse.mallow_withdraw) + checkWithdrawPickEntitiesInChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckWithdrawPickEntitiesInChatResponse decode(ProtoReader protoReader) throws IOException {
            C49580a aVar = new C49580a();
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
                    aVar.f124195a.putAll(this.f124196a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckWithdrawPickEntitiesInChatResponse checkWithdrawPickEntitiesInChatResponse) throws IOException {
            this.f124196a.encodeWithTag(protoWriter, 1, checkWithdrawPickEntitiesInChatResponse.mallow_withdraw);
            protoWriter.writeBytes(checkWithdrawPickEntitiesInChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49580a newBuilder() {
        C49580a aVar = new C49580a();
        aVar.f124195a = Internal.copyOf("mallow_withdraw", this.mallow_withdraw);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mallow_withdraw.isEmpty()) {
            sb.append(", allow_withdraw=");
            sb.append(this.mallow_withdraw);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckWithdrawPickEntitiesInChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckWithdrawPickEntitiesInChatResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public CheckWithdrawPickEntitiesInChatResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mallow_withdraw = Internal.immutableCopyOf("mallow_withdraw", map);
    }
}
