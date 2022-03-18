package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullVideoChatInteractionMessagesResponse extends Message<PullVideoChatInteractionMessagesResponse, C50940a> {
    public static final ProtoAdapter<PullVideoChatInteractionMessagesResponse> ADAPTER = new C50941b();
    private static final long serialVersionUID = 0;
    public final List<VideoChatInteractionMessage> messages;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesResponse$b */
    private static final class C50941b extends ProtoAdapter<PullVideoChatInteractionMessagesResponse> {
        C50941b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVideoChatInteractionMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVideoChatInteractionMessagesResponse pullVideoChatInteractionMessagesResponse) {
            return VideoChatInteractionMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, pullVideoChatInteractionMessagesResponse.messages) + pullVideoChatInteractionMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullVideoChatInteractionMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C50940a aVar = new C50940a();
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
                    aVar.f126964a.add(VideoChatInteractionMessage.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVideoChatInteractionMessagesResponse pullVideoChatInteractionMessagesResponse) throws IOException {
            VideoChatInteractionMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullVideoChatInteractionMessagesResponse.messages);
            protoWriter.writeBytes(pullVideoChatInteractionMessagesResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesResponse$a */
    public static final class C50940a extends Message.Builder<PullVideoChatInteractionMessagesResponse, C50940a> {

        /* renamed from: a */
        public List<VideoChatInteractionMessage> f126964a = Internal.newMutableList();

        /* renamed from: a */
        public PullVideoChatInteractionMessagesResponse build() {
            return new PullVideoChatInteractionMessagesResponse(this.f126964a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50940a newBuilder() {
        C50940a aVar = new C50940a();
        aVar.f126964a = Internal.copyOf("messages", this.messages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullVideoChatInteractionMessagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        StringBuilder replace = sb.replace(0, 2, "PullVideoChatInteractionMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullVideoChatInteractionMessagesResponse(List<VideoChatInteractionMessage> list) {
        this(list, ByteString.EMPTY);
    }

    public PullVideoChatInteractionMessagesResponse(List<VideoChatInteractionMessage> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
