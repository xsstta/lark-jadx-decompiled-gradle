package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTeamChatResponse extends Message<CreateTeamChatResponse, C17382a> {
    public static final ProtoAdapter<CreateTeamChatResponse> ADAPTER = new C17383b();
    private static final long serialVersionUID = 0;
    public final Chat chat;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamChatResponse$b */
    private static final class C17383b extends ProtoAdapter<CreateTeamChatResponse> {
        C17383b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTeamChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTeamChatResponse createTeamChatResponse) {
            int i;
            if (createTeamChatResponse.chat != null) {
                i = Chat.ADAPTER.encodedSizeWithTag(1, createTeamChatResponse.chat);
            } else {
                i = 0;
            }
            return i + createTeamChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTeamChatResponse decode(ProtoReader protoReader) throws IOException {
            C17382a aVar = new C17382a();
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
                    aVar.f44283a = Chat.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTeamChatResponse createTeamChatResponse) throws IOException {
            if (createTeamChatResponse.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 1, createTeamChatResponse.chat);
            }
            protoWriter.writeBytes(createTeamChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamChatResponse$a */
    public static final class C17382a extends Message.Builder<CreateTeamChatResponse, C17382a> {

        /* renamed from: a */
        public Chat f44283a;

        /* renamed from: a */
        public CreateTeamChatResponse build() {
            return new CreateTeamChatResponse(this.f44283a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17382a newBuilder() {
        C17382a aVar = new C17382a();
        aVar.f44283a = this.chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateTeamChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTeamChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTeamChatResponse(Chat chat2) {
        this(chat2, ByteString.EMPTY);
    }

    public CreateTeamChatResponse(Chat chat2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat = chat2;
    }
}
