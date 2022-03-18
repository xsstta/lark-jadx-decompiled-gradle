package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CheckP2PChatsExistByUserRequest extends Message<CheckP2PChatsExistByUserRequest, C49574a> {
    public static final ProtoAdapter<CheckP2PChatsExistByUserRequest> ADAPTER = new C49575b();
    private static final long serialVersionUID = 0;
    public final List<String> mchatter_ids;

    /* renamed from: com.ss.android.lark.pb.chats.CheckP2PChatsExistByUserRequest$b */
    private static final class C49575b extends ProtoAdapter<CheckP2PChatsExistByUserRequest> {
        C49575b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckP2PChatsExistByUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckP2PChatsExistByUserRequest checkP2PChatsExistByUserRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, checkP2PChatsExistByUserRequest.mchatter_ids) + checkP2PChatsExistByUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckP2PChatsExistByUserRequest decode(ProtoReader protoReader) throws IOException {
            C49574a aVar = new C49574a();
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
                    aVar.f124188a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckP2PChatsExistByUserRequest checkP2PChatsExistByUserRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, checkP2PChatsExistByUserRequest.mchatter_ids);
            protoWriter.writeBytes(checkP2PChatsExistByUserRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.CheckP2PChatsExistByUserRequest$a */
    public static final class C49574a extends Message.Builder<CheckP2PChatsExistByUserRequest, C49574a> {

        /* renamed from: a */
        public List<String> f124188a = Internal.newMutableList();

        /* renamed from: a */
        public CheckP2PChatsExistByUserRequest build() {
            return new CheckP2PChatsExistByUserRequest(this.f124188a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49574a newBuilder() {
        C49574a aVar = new C49574a();
        aVar.f124188a = Internal.copyOf("mchatter_ids", this.mchatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mchatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.mchatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckP2PChatsExistByUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckP2PChatsExistByUserRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public CheckP2PChatsExistByUserRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchatter_ids = Internal.immutableCopyOf("mchatter_ids", list);
    }
}
