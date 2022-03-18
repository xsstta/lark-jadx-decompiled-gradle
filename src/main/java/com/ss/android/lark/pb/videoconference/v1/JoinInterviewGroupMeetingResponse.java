package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class JoinInterviewGroupMeetingResponse extends Message<JoinInterviewGroupMeetingResponse, C50817a> {
    public static final ProtoAdapter<JoinInterviewGroupMeetingResponse> ADAPTER = new C50818b();
    private static final long serialVersionUID = 0;
    public final JoinMeetingLobby join_meeting_lobby;
    public final VideoChatInfo video_chat_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingResponse$b */
    private static final class C50818b extends ProtoAdapter<JoinInterviewGroupMeetingResponse> {
        C50818b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinInterviewGroupMeetingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinInterviewGroupMeetingResponse joinInterviewGroupMeetingResponse) {
            int i;
            int i2 = 0;
            if (joinInterviewGroupMeetingResponse.video_chat_info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, joinInterviewGroupMeetingResponse.video_chat_info);
            } else {
                i = 0;
            }
            if (joinInterviewGroupMeetingResponse.join_meeting_lobby != null) {
                i2 = JoinMeetingLobby.ADAPTER.encodedSizeWithTag(2, joinInterviewGroupMeetingResponse.join_meeting_lobby);
            }
            return i + i2 + joinInterviewGroupMeetingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JoinInterviewGroupMeetingResponse decode(ProtoReader protoReader) throws IOException {
            C50817a aVar = new C50817a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126685a = VideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126686b = JoinMeetingLobby.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinInterviewGroupMeetingResponse joinInterviewGroupMeetingResponse) throws IOException {
            if (joinInterviewGroupMeetingResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, joinInterviewGroupMeetingResponse.video_chat_info);
            }
            if (joinInterviewGroupMeetingResponse.join_meeting_lobby != null) {
                JoinMeetingLobby.ADAPTER.encodeWithTag(protoWriter, 2, joinInterviewGroupMeetingResponse.join_meeting_lobby);
            }
            protoWriter.writeBytes(joinInterviewGroupMeetingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingResponse$a */
    public static final class C50817a extends Message.Builder<JoinInterviewGroupMeetingResponse, C50817a> {

        /* renamed from: a */
        public VideoChatInfo f126685a;

        /* renamed from: b */
        public JoinMeetingLobby f126686b;

        /* renamed from: a */
        public JoinInterviewGroupMeetingResponse build() {
            return new JoinInterviewGroupMeetingResponse(this.f126685a, this.f126686b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50817a newBuilder() {
        C50817a aVar = new C50817a();
        aVar.f126685a = this.video_chat_info;
        aVar.f126686b = this.join_meeting_lobby;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinInterviewGroupMeetingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        if (this.join_meeting_lobby != null) {
            sb.append(", join_meeting_lobby=");
            sb.append(this.join_meeting_lobby);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinInterviewGroupMeetingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JoinInterviewGroupMeetingResponse(VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby) {
        this(videoChatInfo, joinMeetingLobby, ByteString.EMPTY);
    }

    public JoinInterviewGroupMeetingResponse(VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_chat_info = videoChatInfo;
        this.join_meeting_lobby = joinMeetingLobby;
    }
}
