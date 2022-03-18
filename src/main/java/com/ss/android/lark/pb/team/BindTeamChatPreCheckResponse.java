package com.ss.android.lark.pb.team;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BindTeamChatPreCheckResponse extends Message<BindTeamChatPreCheckResponse, C50060a> {
    public static final ProtoAdapter<BindTeamChatPreCheckResponse> ADAPTER = new C50061b();
    public static final Long DEFAULT_CHAT_CHATTERS_VERSION = 0L;
    public static final Integer DEFAULT_TO_ADD_CHAT_CHATTER_COUNT = 0;
    public static final Integer DEFAULT_TO_ADD_TEAM_MEMBER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Long mchat_chatters_version;
    public final Integer mto_add_chat_chatter_count;
    public final List<Long> mto_add_chat_chatter_ids;
    public final Integer mto_add_team_member_count;
    public final List<Long> mto_add_team_member_ids;

    /* renamed from: com.ss.android.lark.pb.team.BindTeamChatPreCheckResponse$b */
    private static final class C50061b extends ProtoAdapter<BindTeamChatPreCheckResponse> {
        C50061b() {
            super(FieldEncoding.LENGTH_DELIMITED, BindTeamChatPreCheckResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, bindTeamChatPreCheckResponse.mto_add_team_member_ids) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, bindTeamChatPreCheckResponse.mto_add_chat_chatter_ids);
            int i3 = 0;
            if (bindTeamChatPreCheckResponse.mchat_chatters_version != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, bindTeamChatPreCheckResponse.mchat_chatters_version);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (bindTeamChatPreCheckResponse.mto_add_team_member_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, bindTeamChatPreCheckResponse.mto_add_team_member_count);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (bindTeamChatPreCheckResponse.mto_add_chat_chatter_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, bindTeamChatPreCheckResponse.mto_add_chat_chatter_count);
            }
            return i5 + i3 + bindTeamChatPreCheckResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BindTeamChatPreCheckResponse decode(ProtoReader protoReader) throws IOException {
            C50060a aVar = new C50060a();
            aVar.f125185c = 0L;
            aVar.f125186d = 0;
            aVar.f125187e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125183a.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f125184b.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f125185c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125186d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125187e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, bindTeamChatPreCheckResponse.mto_add_team_member_ids);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, bindTeamChatPreCheckResponse.mto_add_chat_chatter_ids);
            if (bindTeamChatPreCheckResponse.mchat_chatters_version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, bindTeamChatPreCheckResponse.mchat_chatters_version);
            }
            if (bindTeamChatPreCheckResponse.mto_add_team_member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, bindTeamChatPreCheckResponse.mto_add_team_member_count);
            }
            if (bindTeamChatPreCheckResponse.mto_add_chat_chatter_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, bindTeamChatPreCheckResponse.mto_add_chat_chatter_count);
            }
            protoWriter.writeBytes(bindTeamChatPreCheckResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.BindTeamChatPreCheckResponse$a */
    public static final class C50060a extends Message.Builder<BindTeamChatPreCheckResponse, C50060a> {

        /* renamed from: a */
        public List<Long> f125183a = Internal.newMutableList();

        /* renamed from: b */
        public List<Long> f125184b = Internal.newMutableList();

        /* renamed from: c */
        public Long f125185c;

        /* renamed from: d */
        public Integer f125186d;

        /* renamed from: e */
        public Integer f125187e;

        /* renamed from: a */
        public BindTeamChatPreCheckResponse build() {
            return new BindTeamChatPreCheckResponse(this.f125183a, this.f125184b, this.f125185c, this.f125186d, this.f125187e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50060a newBuilder() {
        C50060a aVar = new C50060a();
        aVar.f125183a = Internal.copyOf("mto_add_team_member_ids", this.mto_add_team_member_ids);
        aVar.f125184b = Internal.copyOf("mto_add_chat_chatter_ids", this.mto_add_chat_chatter_ids);
        aVar.f125185c = this.mchat_chatters_version;
        aVar.f125186d = this.mto_add_team_member_count;
        aVar.f125187e = this.mto_add_chat_chatter_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mto_add_team_member_ids.isEmpty()) {
            sb.append(", to_add_team_member_ids=");
            sb.append(this.mto_add_team_member_ids);
        }
        if (!this.mto_add_chat_chatter_ids.isEmpty()) {
            sb.append(", to_add_chat_chatter_ids=");
            sb.append(this.mto_add_chat_chatter_ids);
        }
        if (this.mchat_chatters_version != null) {
            sb.append(", chat_chatters_version=");
            sb.append(this.mchat_chatters_version);
        }
        if (this.mto_add_team_member_count != null) {
            sb.append(", to_add_team_member_count=");
            sb.append(this.mto_add_team_member_count);
        }
        if (this.mto_add_chat_chatter_count != null) {
            sb.append(", to_add_chat_chatter_count=");
            sb.append(this.mto_add_chat_chatter_count);
        }
        StringBuilder replace = sb.replace(0, 2, "BindTeamChatPreCheckResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BindTeamChatPreCheckResponse(List<Long> list, List<Long> list2, Long l, Integer num, Integer num2) {
        this(list, list2, l, num, num2, ByteString.EMPTY);
    }

    public BindTeamChatPreCheckResponse(List<Long> list, List<Long> list2, Long l, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mto_add_team_member_ids = Internal.immutableCopyOf("mto_add_team_member_ids", list);
        this.mto_add_chat_chatter_ids = Internal.immutableCopyOf("mto_add_chat_chatter_ids", list2);
        this.mchat_chatters_version = l;
        this.mto_add_team_member_count = num;
        this.mto_add_chat_chatter_count = num2;
    }
}
