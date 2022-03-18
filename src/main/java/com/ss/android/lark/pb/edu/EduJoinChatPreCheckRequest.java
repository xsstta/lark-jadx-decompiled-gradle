package com.ss.android.lark.pb.edu;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EduJoinChatPreCheckRequest extends Message<EduJoinChatPreCheckRequest, C49632a> {
    public static final ProtoAdapter<EduJoinChatPreCheckRequest> ADAPTER = new C49633b();
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final List<String> muser_ids;

    /* renamed from: com.ss.android.lark.pb.edu.EduJoinChatPreCheckRequest$b */
    private static final class C49633b extends ProtoAdapter<EduJoinChatPreCheckRequest> {
        C49633b() {
            super(FieldEncoding.LENGTH_DELIMITED, EduJoinChatPreCheckRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(EduJoinChatPreCheckRequest eduJoinChatPreCheckRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, eduJoinChatPreCheckRequest.mchat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, eduJoinChatPreCheckRequest.muser_ids) + eduJoinChatPreCheckRequest.unknownFields().size();
        }

        /* renamed from: a */
        public EduJoinChatPreCheckRequest decode(ProtoReader protoReader) throws IOException {
            C49632a aVar = new C49632a();
            aVar.f124277a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124277a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124278b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EduJoinChatPreCheckRequest eduJoinChatPreCheckRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eduJoinChatPreCheckRequest.mchat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, eduJoinChatPreCheckRequest.muser_ids);
            protoWriter.writeBytes(eduJoinChatPreCheckRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.edu.EduJoinChatPreCheckRequest$a */
    public static final class C49632a extends Message.Builder<EduJoinChatPreCheckRequest, C49632a> {

        /* renamed from: a */
        public String f124277a;

        /* renamed from: b */
        public List<String> f124278b = Internal.newMutableList();

        /* renamed from: a */
        public EduJoinChatPreCheckRequest build() {
            String str = this.f124277a;
            if (str != null) {
                return new EduJoinChatPreCheckRequest(str, this.f124278b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mchat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C49632a newBuilder() {
        C49632a aVar = new C49632a();
        aVar.f124277a = this.mchat_id;
        aVar.f124278b = Internal.copyOf("muser_ids", this.muser_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.mchat_id);
        if (!this.muser_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.muser_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "EduJoinChatPreCheckRequest{");
        replace.append('}');
        return replace.toString();
    }

    public EduJoinChatPreCheckRequest(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public EduJoinChatPreCheckRequest(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.muser_ids = Internal.immutableCopyOf("muser_ids", list);
    }
}
