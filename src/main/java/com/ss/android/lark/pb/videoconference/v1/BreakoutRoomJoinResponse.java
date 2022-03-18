package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BreakoutRoomJoinResponse extends Message<BreakoutRoomJoinResponse, C50477a> {
    public static final ProtoAdapter<BreakoutRoomJoinResponse> ADAPTER = new C50478b();
    private static final long serialVersionUID = 0;
    public final VideoChatInfo video_chat_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinResponse$b */
    private static final class C50478b extends ProtoAdapter<BreakoutRoomJoinResponse> {
        C50478b() {
            super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomJoinResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BreakoutRoomJoinResponse breakoutRoomJoinResponse) {
            int i;
            if (breakoutRoomJoinResponse.video_chat_info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, breakoutRoomJoinResponse.video_chat_info);
            } else {
                i = 0;
            }
            return i + breakoutRoomJoinResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BreakoutRoomJoinResponse decode(ProtoReader protoReader) throws IOException {
            C50477a aVar = new C50477a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126030a = VideoChatInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BreakoutRoomJoinResponse breakoutRoomJoinResponse) throws IOException {
            if (breakoutRoomJoinResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, breakoutRoomJoinResponse.video_chat_info);
            }
            protoWriter.writeBytes(breakoutRoomJoinResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinResponse$a */
    public static final class C50477a extends Message.Builder<BreakoutRoomJoinResponse, C50477a> {

        /* renamed from: a */
        public VideoChatInfo f126030a;

        /* renamed from: a */
        public BreakoutRoomJoinResponse build() {
            return new BreakoutRoomJoinResponse(this.f126030a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50477a newBuilder() {
        C50477a aVar = new C50477a();
        aVar.f126030a = this.video_chat_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "BreakoutRoomJoinResponse");
        StringBuilder sb = new StringBuilder();
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        StringBuilder replace = sb.replace(0, 2, "BreakoutRoomJoinResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BreakoutRoomJoinResponse(VideoChatInfo videoChatInfo) {
        this(videoChatInfo, ByteString.EMPTY);
    }

    public BreakoutRoomJoinResponse(VideoChatInfo videoChatInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_chat_info = videoChatInfo;
    }
}
