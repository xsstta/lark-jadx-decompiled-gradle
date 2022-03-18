package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class JoinCalendarGroupMeetingResponse extends Message<JoinCalendarGroupMeetingResponse, C50813a> {
    public static final ProtoAdapter<JoinCalendarGroupMeetingResponse> ADAPTER = new C50814b();
    public static final Boolean DEFAULT_IS_CREATED = false;
    public static final Type DEFAULT_TYPE = Type.CALENDAR_MEETING_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean is_created;
    public final JoinMeetingLobby join_meeting_lobby;
    public final Type type;
    public final VideoChatInfo video_chat_info;

    public enum Type implements WireEnum {
        CALENDAR_MEETING_UNKNOWN(0),
        CALENDAR_SUCCESS(1),
        CALENDAR_VC_BUSY(2),
        CALENDAR_VOIP_BUSY(3),
        CALENDAR_MEETING_ENDED(4),
        CALENDAR_PARTICIPANT_LIMIT_EXCEED(5),
        CALENDAR_MEETING_OUT_OF_DATE(6),
        CALENDAR_MEETING_NEED_EXTENSION(7),
        CALENDAR_VERSION_LOW(8);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return CALENDAR_MEETING_UNKNOWN;
                case 1:
                    return CALENDAR_SUCCESS;
                case 2:
                    return CALENDAR_VC_BUSY;
                case 3:
                    return CALENDAR_VOIP_BUSY;
                case 4:
                    return CALENDAR_MEETING_ENDED;
                case 5:
                    return CALENDAR_PARTICIPANT_LIMIT_EXCEED;
                case 6:
                    return CALENDAR_MEETING_OUT_OF_DATE;
                case 7:
                    return CALENDAR_MEETING_NEED_EXTENSION;
                case 8:
                    return CALENDAR_VERSION_LOW;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingResponse$b */
    private static final class C50814b extends ProtoAdapter<JoinCalendarGroupMeetingResponse> {
        C50814b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinCalendarGroupMeetingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinCalendarGroupMeetingResponse joinCalendarGroupMeetingResponse) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, joinCalendarGroupMeetingResponse.type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, joinCalendarGroupMeetingResponse.is_created);
            int i2 = 0;
            if (joinCalendarGroupMeetingResponse.video_chat_info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(3, joinCalendarGroupMeetingResponse.video_chat_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (joinCalendarGroupMeetingResponse.join_meeting_lobby != null) {
                i2 = JoinMeetingLobby.ADAPTER.encodedSizeWithTag(4, joinCalendarGroupMeetingResponse.join_meeting_lobby);
            }
            return i3 + i2 + joinCalendarGroupMeetingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JoinCalendarGroupMeetingResponse decode(ProtoReader protoReader) throws IOException {
            C50813a aVar = new C50813a();
            aVar.f126676a = Type.CALENDAR_MEETING_UNKNOWN;
            aVar.f126677b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126676a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126677b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126678c = VideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126679d = JoinMeetingLobby.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinCalendarGroupMeetingResponse joinCalendarGroupMeetingResponse) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, joinCalendarGroupMeetingResponse.type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, joinCalendarGroupMeetingResponse.is_created);
            if (joinCalendarGroupMeetingResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 3, joinCalendarGroupMeetingResponse.video_chat_info);
            }
            if (joinCalendarGroupMeetingResponse.join_meeting_lobby != null) {
                JoinMeetingLobby.ADAPTER.encodeWithTag(protoWriter, 4, joinCalendarGroupMeetingResponse.join_meeting_lobby);
            }
            protoWriter.writeBytes(joinCalendarGroupMeetingResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50813a newBuilder() {
        C50813a aVar = new C50813a();
        aVar.f126676a = this.type;
        aVar.f126677b = this.is_created;
        aVar.f126678c = this.video_chat_info;
        aVar.f126679d = this.join_meeting_lobby;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingResponse$a */
    public static final class C50813a extends Message.Builder<JoinCalendarGroupMeetingResponse, C50813a> {

        /* renamed from: a */
        public Type f126676a;

        /* renamed from: b */
        public Boolean f126677b;

        /* renamed from: c */
        public VideoChatInfo f126678c;

        /* renamed from: d */
        public JoinMeetingLobby f126679d;

        /* renamed from: a */
        public JoinCalendarGroupMeetingResponse build() {
            Boolean bool;
            Type type = this.f126676a;
            if (type != null && (bool = this.f126677b) != null) {
                return new JoinCalendarGroupMeetingResponse(type, bool, this.f126678c, this.f126679d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f126677b, "is_created");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinCalendarGroupMeetingResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", is_created=");
        sb.append(this.is_created);
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        if (this.join_meeting_lobby != null) {
            sb.append(", join_meeting_lobby=");
            sb.append(this.join_meeting_lobby);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinCalendarGroupMeetingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JoinCalendarGroupMeetingResponse(Type type2, Boolean bool, VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby) {
        this(type2, bool, videoChatInfo, joinMeetingLobby, ByteString.EMPTY);
    }

    public JoinCalendarGroupMeetingResponse(Type type2, Boolean bool, VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.is_created = bool;
        this.video_chat_info = videoChatInfo;
        this.join_meeting_lobby = joinMeetingLobby;
    }
}
