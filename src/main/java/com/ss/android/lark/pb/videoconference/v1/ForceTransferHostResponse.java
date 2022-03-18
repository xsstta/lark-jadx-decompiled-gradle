package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ForceTransferHostResponse extends Message<ForceTransferHostResponse, C50589a> {
    public static final ProtoAdapter<ForceTransferHostResponse> ADAPTER = new C50590b();
    private static final long serialVersionUID = 0;
    public final VideoChatInfo video_chat_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ForceTransferHostResponse$b */
    private static final class C50590b extends ProtoAdapter<ForceTransferHostResponse> {
        C50590b() {
            super(FieldEncoding.LENGTH_DELIMITED, ForceTransferHostResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ForceTransferHostResponse forceTransferHostResponse) {
            int i;
            if (forceTransferHostResponse.video_chat_info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, forceTransferHostResponse.video_chat_info);
            } else {
                i = 0;
            }
            return i + forceTransferHostResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ForceTransferHostResponse decode(ProtoReader protoReader) throws IOException {
            C50589a aVar = new C50589a();
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
                    aVar.f126288a = VideoChatInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ForceTransferHostResponse forceTransferHostResponse) throws IOException {
            if (forceTransferHostResponse.video_chat_info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, forceTransferHostResponse.video_chat_info);
            }
            protoWriter.writeBytes(forceTransferHostResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ForceTransferHostResponse$a */
    public static final class C50589a extends Message.Builder<ForceTransferHostResponse, C50589a> {

        /* renamed from: a */
        public VideoChatInfo f126288a;

        /* renamed from: a */
        public ForceTransferHostResponse build() {
            return new ForceTransferHostResponse(this.f126288a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50589a newBuilder() {
        C50589a aVar = new C50589a();
        aVar.f126288a = this.video_chat_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ForceTransferHostResponse");
        StringBuilder sb = new StringBuilder();
        if (this.video_chat_info != null) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ForceTransferHostResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ForceTransferHostResponse(VideoChatInfo videoChatInfo) {
        this(videoChatInfo, ByteString.EMPTY);
    }

    public ForceTransferHostResponse(VideoChatInfo videoChatInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_chat_info = videoChatInfo;
    }
}
