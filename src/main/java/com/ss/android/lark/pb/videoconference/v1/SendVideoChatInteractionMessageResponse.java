package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendVideoChatInteractionMessageResponse extends Message<SendVideoChatInteractionMessageResponse, C51014a> {
    public static final ProtoAdapter<SendVideoChatInteractionMessageResponse> ADAPTER = new C51015b();
    private static final long serialVersionUID = 0;
    public final VideoChatInteractionMessage message;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageResponse$b */
    private static final class C51015b extends ProtoAdapter<SendVideoChatInteractionMessageResponse> {
        C51015b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendVideoChatInteractionMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendVideoChatInteractionMessageResponse sendVideoChatInteractionMessageResponse) {
            int i;
            if (sendVideoChatInteractionMessageResponse.message != null) {
                i = VideoChatInteractionMessage.ADAPTER.encodedSizeWithTag(1, sendVideoChatInteractionMessageResponse.message);
            } else {
                i = 0;
            }
            return i + sendVideoChatInteractionMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendVideoChatInteractionMessageResponse decode(ProtoReader protoReader) throws IOException {
            C51014a aVar = new C51014a();
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
                    aVar.f127077a = VideoChatInteractionMessage.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendVideoChatInteractionMessageResponse sendVideoChatInteractionMessageResponse) throws IOException {
            if (sendVideoChatInteractionMessageResponse.message != null) {
                VideoChatInteractionMessage.ADAPTER.encodeWithTag(protoWriter, 1, sendVideoChatInteractionMessageResponse.message);
            }
            protoWriter.writeBytes(sendVideoChatInteractionMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageResponse$a */
    public static final class C51014a extends Message.Builder<SendVideoChatInteractionMessageResponse, C51014a> {

        /* renamed from: a */
        public VideoChatInteractionMessage f127077a;

        /* renamed from: a */
        public SendVideoChatInteractionMessageResponse build() {
            return new SendVideoChatInteractionMessageResponse(this.f127077a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51014a newBuilder() {
        C51014a aVar = new C51014a();
        aVar.f127077a = this.message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SendVideoChatInteractionMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        StringBuilder replace = sb.replace(0, 2, "SendVideoChatInteractionMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendVideoChatInteractionMessageResponse(VideoChatInteractionMessage videoChatInteractionMessage) {
        this(videoChatInteractionMessage, ByteString.EMPTY);
    }

    public SendVideoChatInteractionMessageResponse(VideoChatInteractionMessage videoChatInteractionMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = videoChatInteractionMessage;
    }
}
