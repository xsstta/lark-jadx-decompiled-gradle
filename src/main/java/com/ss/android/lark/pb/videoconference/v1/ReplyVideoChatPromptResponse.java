package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReplyVideoChatPromptResponse extends Message<ReplyVideoChatPromptResponse, C50980a> {
    public static final ProtoAdapter<ReplyVideoChatPromptResponse> ADAPTER = new C50981b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatPromptResponse$b */
    private static final class C50981b extends ProtoAdapter<ReplyVideoChatPromptResponse> {
        C50981b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplyVideoChatPromptResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplyVideoChatPromptResponse replyVideoChatPromptResponse) {
            return replyVideoChatPromptResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ReplyVideoChatPromptResponse decode(ProtoReader protoReader) throws IOException {
            C50980a aVar = new C50980a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReplyVideoChatPromptResponse replyVideoChatPromptResponse) throws IOException {
            protoWriter.writeBytes(replyVideoChatPromptResponse.unknownFields());
        }
    }

    public ReplyVideoChatPromptResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatPromptResponse$a */
    public static final class C50980a extends Message.Builder<ReplyVideoChatPromptResponse, C50980a> {
        /* renamed from: a */
        public ReplyVideoChatPromptResponse build() {
            return new ReplyVideoChatPromptResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50980a newBuilder() {
        C50980a aVar = new C50980a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReplyVideoChatPromptResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ReplyVideoChatPromptResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ReplyVideoChatPromptResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
