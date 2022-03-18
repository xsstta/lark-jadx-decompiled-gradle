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

public final class PushVideoChatInteractionMessages extends Message<PushVideoChatInteractionMessages, C50952a> {
    public static final ProtoAdapter<PushVideoChatInteractionMessages> ADAPTER = new C50953b();
    private static final long serialVersionUID = 0;
    public final List<VideoChatInteractionMessage> messages;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushVideoChatInteractionMessages$b */
    private static final class C50953b extends ProtoAdapter<PushVideoChatInteractionMessages> {
        C50953b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushVideoChatInteractionMessages.class);
        }

        /* renamed from: a */
        public int encodedSize(PushVideoChatInteractionMessages pushVideoChatInteractionMessages) {
            return VideoChatInteractionMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, pushVideoChatInteractionMessages.messages) + pushVideoChatInteractionMessages.unknownFields().size();
        }

        /* renamed from: a */
        public PushVideoChatInteractionMessages decode(ProtoReader protoReader) throws IOException {
            C50952a aVar = new C50952a();
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
                    aVar.f126973a.add(VideoChatInteractionMessage.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushVideoChatInteractionMessages pushVideoChatInteractionMessages) throws IOException {
            VideoChatInteractionMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushVideoChatInteractionMessages.messages);
            protoWriter.writeBytes(pushVideoChatInteractionMessages.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushVideoChatInteractionMessages$a */
    public static final class C50952a extends Message.Builder<PushVideoChatInteractionMessages, C50952a> {

        /* renamed from: a */
        public List<VideoChatInteractionMessage> f126973a = Internal.newMutableList();

        /* renamed from: a */
        public PushVideoChatInteractionMessages build() {
            return new PushVideoChatInteractionMessages(this.f126973a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50952a newBuilder() {
        C50952a aVar = new C50952a();
        aVar.f126973a = Internal.copyOf("messages", this.messages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PushVideoChatInteractionMessages");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        StringBuilder replace = sb.replace(0, 2, "PushVideoChatInteractionMessages{");
        replace.append('}');
        return replace.toString();
    }

    public PushVideoChatInteractionMessages(List<VideoChatInteractionMessage> list) {
        this(list, ByteString.EMPTY);
    }

    public PushVideoChatInteractionMessages(List<VideoChatInteractionMessage> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
