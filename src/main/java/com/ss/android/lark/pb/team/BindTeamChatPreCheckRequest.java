package com.ss.android.lark.pb.team;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.entities.TeamChatType;
import java.io.IOException;
import okio.ByteString;

public final class BindTeamChatPreCheckRequest extends Message<BindTeamChatPreCheckRequest, C50058a> {
    public static final ProtoAdapter<BindTeamChatPreCheckRequest> ADAPTER = new C50059b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mchat_id;
    public final TeamChatType mteam_chat_type;
    public final Long mteam_id;

    /* renamed from: com.ss.android.lark.pb.team.BindTeamChatPreCheckRequest$b */
    private static final class C50059b extends ProtoAdapter<BindTeamChatPreCheckRequest> {
        C50059b() {
            super(FieldEncoding.LENGTH_DELIMITED, BindTeamChatPreCheckRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BindTeamChatPreCheckRequest bindTeamChatPreCheckRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (bindTeamChatPreCheckRequest.mteam_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, bindTeamChatPreCheckRequest.mteam_id);
            } else {
                i = 0;
            }
            if (bindTeamChatPreCheckRequest.mchat_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, bindTeamChatPreCheckRequest.mchat_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (bindTeamChatPreCheckRequest.mteam_chat_type != null) {
                i3 = TeamChatType.ADAPTER.encodedSizeWithTag(3, bindTeamChatPreCheckRequest.mteam_chat_type);
            }
            return i4 + i3 + bindTeamChatPreCheckRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BindTeamChatPreCheckRequest decode(ProtoReader protoReader) throws IOException {
            C50058a aVar = new C50058a();
            aVar.f125180a = 0L;
            aVar.f125181b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125180a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125181b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125182c = TeamChatType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BindTeamChatPreCheckRequest bindTeamChatPreCheckRequest) throws IOException {
            if (bindTeamChatPreCheckRequest.mteam_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, bindTeamChatPreCheckRequest.mteam_id);
            }
            if (bindTeamChatPreCheckRequest.mchat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, bindTeamChatPreCheckRequest.mchat_id);
            }
            if (bindTeamChatPreCheckRequest.mteam_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 3, bindTeamChatPreCheckRequest.mteam_chat_type);
            }
            protoWriter.writeBytes(bindTeamChatPreCheckRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.BindTeamChatPreCheckRequest$a */
    public static final class C50058a extends Message.Builder<BindTeamChatPreCheckRequest, C50058a> {

        /* renamed from: a */
        public Long f125180a;

        /* renamed from: b */
        public Long f125181b;

        /* renamed from: c */
        public TeamChatType f125182c;

        /* renamed from: a */
        public BindTeamChatPreCheckRequest build() {
            return new BindTeamChatPreCheckRequest(this.f125180a, this.f125181b, this.f125182c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50058a mo173918a(Long l) {
            this.f125180a = l;
            return this;
        }

        /* renamed from: b */
        public C50058a mo173920b(Long l) {
            this.f125181b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50058a newBuilder() {
        C50058a aVar = new C50058a();
        aVar.f125180a = this.mteam_id;
        aVar.f125181b = this.mchat_id;
        aVar.f125182c = this.mteam_chat_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mteam_id != null) {
            sb.append(", team_id=");
            sb.append(this.mteam_id);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mteam_chat_type != null) {
            sb.append(", team_chat_type=");
            sb.append(this.mteam_chat_type);
        }
        StringBuilder replace = sb.replace(0, 2, "BindTeamChatPreCheckRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BindTeamChatPreCheckRequest(Long l, Long l2, TeamChatType teamChatType) {
        this(l, l2, teamChatType, ByteString.EMPTY);
    }

    public BindTeamChatPreCheckRequest(Long l, Long l2, TeamChatType teamChatType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mteam_id = l;
        this.mchat_id = l2;
        this.mteam_chat_type = teamChatType;
    }
}
