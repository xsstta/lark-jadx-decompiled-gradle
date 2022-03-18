package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class JoinMeetingResponse extends Message<JoinMeetingResponse, C50839a> {
    public static final ProtoAdapter<JoinMeetingResponse> ADAPTER = new C50840b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<ClientExtraAction> extra_actions;
    public final JoinMeetingLobby join_meeting_lobby;
    public final Type type;
    public final VideoChatInfo video_chat_info;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        VC_BUSY(2),
        VOIP_BUSY(3),
        PARTICIPANT_LIMIT_EXCEED(4),
        MEETING_ENDED(5),
        MEETING_OUT_OF_DATE(6),
        MEETING_NEED_EXTENSION(7),
        VERSION_LOW(8),
        MEETING_NUMBER_INVALID(9),
        DEVICE_RINGING(10),
        MEETING_LOCKED(11),
        CHAT_POST_NO_PERMISSION(12),
        TENANT_IN_BLACKLIST(13),
        MEETING_NUMBER_NOT_CERTIFICATED(14),
        VERSION_INCOMPATIBLE(15);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return SUCCESS;
                case 2:
                    return VC_BUSY;
                case 3:
                    return VOIP_BUSY;
                case 4:
                    return PARTICIPANT_LIMIT_EXCEED;
                case 5:
                    return MEETING_ENDED;
                case 6:
                    return MEETING_OUT_OF_DATE;
                case 7:
                    return MEETING_NEED_EXTENSION;
                case 8:
                    return VERSION_LOW;
                case 9:
                    return MEETING_NUMBER_INVALID;
                case 10:
                    return DEVICE_RINGING;
                case 11:
                    return MEETING_LOCKED;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CHAT_POST_NO_PERMISSION;
                case 13:
                    return TENANT_IN_BLACKLIST;
                case 14:
                    return MEETING_NUMBER_NOT_CERTIFICATED;
                case 15:
                    return VERSION_INCOMPATIBLE;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingResponse$b */
    private static final class C50840b extends ProtoAdapter<JoinMeetingResponse> {
        C50840b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinMeetingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinMeetingResponse joinMeetingResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (joinMeetingResponse.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, joinMeetingResponse.type);
            } else {
                i = 0;
            }
            if (joinMeetingResponse.video_chat_info != null) {
                i2 = VideoChatInfo.ADAPTER.encodedSizeWithTag(2, joinMeetingResponse.video_chat_info);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ClientExtraAction.ADAPTER.asRepeated().encodedSizeWithTag(3, joinMeetingResponse.extra_actions);
            if (joinMeetingResponse.join_meeting_lobby != null) {
                i3 = JoinMeetingLobby.ADAPTER.encodedSizeWithTag(4, joinMeetingResponse.join_meeting_lobby);
            }
            return encodedSizeWithTag + i3 + joinMeetingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JoinMeetingResponse decode(ProtoReader protoReader) throws IOException {
            C50839a aVar = new C50839a();
            aVar.f126728a = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126728a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126729b = VideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f126730c.add(ClientExtraAction.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126731d = JoinMeetingLobby.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinMeetingResponse joinMeetingResponse) throws IOException {
            if (joinMeetingResponse.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, joinMeetingResponse.type);
            }
            if (joinMeetingResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 2, joinMeetingResponse.video_chat_info);
            }
            ClientExtraAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, joinMeetingResponse.extra_actions);
            if (joinMeetingResponse.join_meeting_lobby != null) {
                JoinMeetingLobby.ADAPTER.encodeWithTag(protoWriter, 4, joinMeetingResponse.join_meeting_lobby);
            }
            protoWriter.writeBytes(joinMeetingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingResponse$a */
    public static final class C50839a extends Message.Builder<JoinMeetingResponse, C50839a> {

        /* renamed from: a */
        public Type f126728a;

        /* renamed from: b */
        public VideoChatInfo f126729b;

        /* renamed from: c */
        public List<ClientExtraAction> f126730c = Internal.newMutableList();

        /* renamed from: d */
        public JoinMeetingLobby f126731d;

        /* renamed from: a */
        public JoinMeetingResponse build() {
            return new JoinMeetingResponse(this.f126728a, this.f126729b, this.f126730c, this.f126731d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50839a newBuilder() {
        C50839a aVar = new C50839a();
        aVar.f126728a = this.type;
        aVar.f126729b = this.video_chat_info;
        aVar.f126730c = Internal.copyOf("extra_actions", this.extra_actions);
        aVar.f126731d = this.join_meeting_lobby;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinMeetingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        if (!this.extra_actions.isEmpty()) {
            sb.append(", extra_actions=");
            sb.append(this.extra_actions);
        }
        if (this.join_meeting_lobby != null) {
            sb.append(", join_meeting_lobby=");
            sb.append(this.join_meeting_lobby);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinMeetingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JoinMeetingResponse(Type type2, VideoChatInfo videoChatInfo, List<ClientExtraAction> list, JoinMeetingLobby joinMeetingLobby) {
        this(type2, videoChatInfo, list, joinMeetingLobby, ByteString.EMPTY);
    }

    public JoinMeetingResponse(Type type2, VideoChatInfo videoChatInfo, List<ClientExtraAction> list, JoinMeetingLobby joinMeetingLobby, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.video_chat_info = videoChatInfo;
        this.extra_actions = Internal.immutableCopyOf("extra_actions", list);
        this.join_meeting_lobby = joinMeetingLobby;
    }
}
