package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RejoinVideoChatResponse extends Message<RejoinVideoChatResponse, C50968a> {
    public static final ProtoAdapter<RejoinVideoChatResponse> ADAPTER = new C50969b();
    public static final StatusCode DEFAULT_STATUS = StatusCode.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final JoinMeetingLobby join_meeting_lobby;
    public final StatusCode status;
    public final VideoChatInfo video_chat_info;

    public enum StatusCode implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        VC_BUSY_ERROR(2),
        VoIP_BUSY_ERROR(3),
        MEETING_END_ERROR(4),
        PARTICIPANT_LIMIT_EXCEED_ERROR(5);
        
        public static final ProtoAdapter<StatusCode> ADAPTER = ProtoAdapter.newEnumAdapter(StatusCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static StatusCode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return VC_BUSY_ERROR;
            }
            if (i == 3) {
                return VoIP_BUSY_ERROR;
            }
            if (i == 4) {
                return MEETING_END_ERROR;
            }
            if (i != 5) {
                return null;
            }
            return PARTICIPANT_LIMIT_EXCEED_ERROR;
        }

        private StatusCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatResponse$b */
    private static final class C50969b extends ProtoAdapter<RejoinVideoChatResponse> {
        C50969b() {
            super(FieldEncoding.LENGTH_DELIMITED, RejoinVideoChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RejoinVideoChatResponse rejoinVideoChatResponse) {
            int i;
            int encodedSizeWithTag = StatusCode.ADAPTER.encodedSizeWithTag(1, rejoinVideoChatResponse.status);
            int i2 = 0;
            if (rejoinVideoChatResponse.video_chat_info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(2, rejoinVideoChatResponse.video_chat_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (rejoinVideoChatResponse.join_meeting_lobby != null) {
                i2 = JoinMeetingLobby.ADAPTER.encodedSizeWithTag(3, rejoinVideoChatResponse.join_meeting_lobby);
            }
            return i3 + i2 + rejoinVideoChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RejoinVideoChatResponse decode(ProtoReader protoReader) throws IOException {
            C50968a aVar = new C50968a();
            aVar.f126998a = StatusCode.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126998a = StatusCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126999b = VideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127000c = JoinMeetingLobby.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RejoinVideoChatResponse rejoinVideoChatResponse) throws IOException {
            StatusCode.ADAPTER.encodeWithTag(protoWriter, 1, rejoinVideoChatResponse.status);
            if (rejoinVideoChatResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 2, rejoinVideoChatResponse.video_chat_info);
            }
            if (rejoinVideoChatResponse.join_meeting_lobby != null) {
                JoinMeetingLobby.ADAPTER.encodeWithTag(protoWriter, 3, rejoinVideoChatResponse.join_meeting_lobby);
            }
            protoWriter.writeBytes(rejoinVideoChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50968a newBuilder() {
        C50968a aVar = new C50968a();
        aVar.f126998a = this.status;
        aVar.f126999b = this.video_chat_info;
        aVar.f127000c = this.join_meeting_lobby;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatResponse$a */
    public static final class C50968a extends Message.Builder<RejoinVideoChatResponse, C50968a> {

        /* renamed from: a */
        public StatusCode f126998a;

        /* renamed from: b */
        public VideoChatInfo f126999b;

        /* renamed from: c */
        public JoinMeetingLobby f127000c;

        /* renamed from: a */
        public RejoinVideoChatResponse build() {
            StatusCode statusCode = this.f126998a;
            if (statusCode != null) {
                return new RejoinVideoChatResponse(statusCode, this.f126999b, this.f127000c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(statusCode, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RejoinVideoChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        if (this.join_meeting_lobby != null) {
            sb.append(", join_meeting_lobby=");
            sb.append(this.join_meeting_lobby);
        }
        StringBuilder replace = sb.replace(0, 2, "RejoinVideoChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RejoinVideoChatResponse(StatusCode statusCode, VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby) {
        this(statusCode, videoChatInfo, joinMeetingLobby, ByteString.EMPTY);
    }

    public RejoinVideoChatResponse(StatusCode statusCode, VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = statusCode;
        this.video_chat_info = videoChatInfo;
        this.join_meeting_lobby = joinMeetingLobby;
    }
}
