package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateVideoChatResponse extends Message<UpdateVideoChatResponse, C51142a> {
    public static final ProtoAdapter<UpdateVideoChatResponse> ADAPTER = new C51143b();
    private static final long serialVersionUID = 0;
    public final JoinMeetingLobby join_meeting_lobby;
    public final VideoChatInfo video_chat_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatResponse$b */
    private static final class C51143b extends ProtoAdapter<UpdateVideoChatResponse> {
        C51143b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateVideoChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateVideoChatResponse updateVideoChatResponse) {
            int i;
            int i2 = 0;
            if (updateVideoChatResponse.video_chat_info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, updateVideoChatResponse.video_chat_info);
            } else {
                i = 0;
            }
            if (updateVideoChatResponse.join_meeting_lobby != null) {
                i2 = JoinMeetingLobby.ADAPTER.encodedSizeWithTag(2, updateVideoChatResponse.join_meeting_lobby);
            }
            return i + i2 + updateVideoChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateVideoChatResponse decode(ProtoReader protoReader) throws IOException {
            C51142a aVar = new C51142a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127266a = VideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127267b = JoinMeetingLobby.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateVideoChatResponse updateVideoChatResponse) throws IOException {
            if (updateVideoChatResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, updateVideoChatResponse.video_chat_info);
            }
            if (updateVideoChatResponse.join_meeting_lobby != null) {
                JoinMeetingLobby.ADAPTER.encodeWithTag(protoWriter, 2, updateVideoChatResponse.join_meeting_lobby);
            }
            protoWriter.writeBytes(updateVideoChatResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatResponse$a */
    public static final class C51142a extends Message.Builder<UpdateVideoChatResponse, C51142a> {

        /* renamed from: a */
        public VideoChatInfo f127266a;

        /* renamed from: b */
        public JoinMeetingLobby f127267b;

        /* renamed from: a */
        public UpdateVideoChatResponse build() {
            return new UpdateVideoChatResponse(this.f127266a, this.f127267b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51142a newBuilder() {
        C51142a aVar = new C51142a();
        aVar.f127266a = this.video_chat_info;
        aVar.f127267b = this.join_meeting_lobby;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateVideoChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        if (this.join_meeting_lobby != null) {
            sb.append(", join_meeting_lobby=");
            sb.append(this.join_meeting_lobby);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateVideoChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateVideoChatResponse(VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby) {
        this(videoChatInfo, joinMeetingLobby, ByteString.EMPTY);
    }

    public UpdateVideoChatResponse(VideoChatInfo videoChatInfo, JoinMeetingLobby joinMeetingLobby, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_chat_info = videoChatInfo;
        this.join_meeting_lobby = joinMeetingLobby;
    }
}
