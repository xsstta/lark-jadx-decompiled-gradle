package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UnbindTeamChatRequest extends Message<UnbindTeamChatRequest, C18125a> {
    public static final ProtoAdapter<UnbindTeamChatRequest> ADAPTER = new C18126b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final Long team_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.UnbindTeamChatRequest$b */
    private static final class C18126b extends ProtoAdapter<UnbindTeamChatRequest> {
        C18126b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnbindTeamChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UnbindTeamChatRequest unbindTeamChatRequest) {
            int i;
            int i2 = 0;
            if (unbindTeamChatRequest.team_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, unbindTeamChatRequest.team_id);
            } else {
                i = 0;
            }
            if (unbindTeamChatRequest.chat_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, unbindTeamChatRequest.chat_id);
            }
            return i + i2 + unbindTeamChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UnbindTeamChatRequest decode(ProtoReader protoReader) throws IOException {
            C18125a aVar = new C18125a();
            aVar.f45284a = 0L;
            aVar.f45285b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45284a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45285b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnbindTeamChatRequest unbindTeamChatRequest) throws IOException {
            if (unbindTeamChatRequest.team_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, unbindTeamChatRequest.team_id);
            }
            if (unbindTeamChatRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, unbindTeamChatRequest.chat_id);
            }
            protoWriter.writeBytes(unbindTeamChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UnbindTeamChatRequest$a */
    public static final class C18125a extends Message.Builder<UnbindTeamChatRequest, C18125a> {

        /* renamed from: a */
        public Long f45284a;

        /* renamed from: b */
        public Long f45285b;

        /* renamed from: a */
        public UnbindTeamChatRequest build() {
            return new UnbindTeamChatRequest(this.f45284a, this.f45285b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18125a mo62861a(Long l) {
            this.f45284a = l;
            return this;
        }

        /* renamed from: b */
        public C18125a mo62863b(Long l) {
            this.f45285b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18125a newBuilder() {
        C18125a aVar = new C18125a();
        aVar.f45284a = this.team_id;
        aVar.f45285b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UnbindTeamChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.team_id != null) {
            sb.append(", team_id=");
            sb.append(this.team_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UnbindTeamChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UnbindTeamChatRequest(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public UnbindTeamChatRequest(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.chat_id = l2;
    }
}
