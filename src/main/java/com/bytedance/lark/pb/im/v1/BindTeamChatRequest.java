package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.TeamChatType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BindTeamChatRequest extends Message<BindTeamChatRequest, C17300a> {
    public static final ProtoAdapter<BindTeamChatRequest> ADAPTER = new C17301b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_CHAT_MEMBER_VERSION = 0L;
    public static final TeamChatType DEFAULT_TEAM_CHAT_TYPE = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final Long chat_member_version;
    public final TeamChatType team_chat_type;
    public final Long team_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.BindTeamChatRequest$b */
    private static final class C17301b extends ProtoAdapter<BindTeamChatRequest> {
        C17301b() {
            super(FieldEncoding.LENGTH_DELIMITED, BindTeamChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BindTeamChatRequest bindTeamChatRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (bindTeamChatRequest.team_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, bindTeamChatRequest.team_id);
            } else {
                i = 0;
            }
            if (bindTeamChatRequest.chat_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, bindTeamChatRequest.chat_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (bindTeamChatRequest.chat_member_version != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, bindTeamChatRequest.chat_member_version);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (bindTeamChatRequest.team_chat_type != null) {
                i4 = TeamChatType.ADAPTER.encodedSizeWithTag(4, bindTeamChatRequest.team_chat_type);
            }
            return i6 + i4 + bindTeamChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BindTeamChatRequest decode(ProtoReader protoReader) throws IOException {
            C17300a aVar = new C17300a();
            aVar.f44141a = 0L;
            aVar.f44142b = 0L;
            aVar.f44143c = 0L;
            aVar.f44144d = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44141a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44142b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44143c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44144d = TeamChatType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BindTeamChatRequest bindTeamChatRequest) throws IOException {
            if (bindTeamChatRequest.team_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, bindTeamChatRequest.team_id);
            }
            if (bindTeamChatRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, bindTeamChatRequest.chat_id);
            }
            if (bindTeamChatRequest.chat_member_version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, bindTeamChatRequest.chat_member_version);
            }
            if (bindTeamChatRequest.team_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 4, bindTeamChatRequest.team_chat_type);
            }
            protoWriter.writeBytes(bindTeamChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.BindTeamChatRequest$a */
    public static final class C17300a extends Message.Builder<BindTeamChatRequest, C17300a> {

        /* renamed from: a */
        public Long f44141a;

        /* renamed from: b */
        public Long f44142b;

        /* renamed from: c */
        public Long f44143c;

        /* renamed from: d */
        public TeamChatType f44144d;

        /* renamed from: a */
        public BindTeamChatRequest build() {
            return new BindTeamChatRequest(this.f44141a, this.f44142b, this.f44143c, this.f44144d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17300a mo60780a(TeamChatType teamChatType) {
            this.f44144d = teamChatType;
            return this;
        }

        /* renamed from: b */
        public C17300a mo60783b(Long l) {
            this.f44142b = l;
            return this;
        }

        /* renamed from: a */
        public C17300a mo60781a(Long l) {
            this.f44141a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17300a newBuilder() {
        C17300a aVar = new C17300a();
        aVar.f44141a = this.team_id;
        aVar.f44142b = this.chat_id;
        aVar.f44143c = this.chat_member_version;
        aVar.f44144d = this.team_chat_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "BindTeamChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.team_id != null) {
            sb.append(", team_id=");
            sb.append(this.team_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.chat_member_version != null) {
            sb.append(", chat_member_version=");
            sb.append(this.chat_member_version);
        }
        if (this.team_chat_type != null) {
            sb.append(", team_chat_type=");
            sb.append(this.team_chat_type);
        }
        StringBuilder replace = sb.replace(0, 2, "BindTeamChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BindTeamChatRequest(Long l, Long l2, Long l3, TeamChatType teamChatType) {
        this(l, l2, l3, teamChatType, ByteString.EMPTY);
    }

    public BindTeamChatRequest(Long l, Long l2, Long l3, TeamChatType teamChatType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.chat_id = l2;
        this.chat_member_version = l3;
        this.team_chat_type = teamChatType;
    }
}
