package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReplyVideoChatNoticeResponse extends Message<ReplyVideoChatNoticeResponse, C50976a> {
    public static final ProtoAdapter<ReplyVideoChatNoticeResponse> ADAPTER = new C50977b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatNoticeResponse$b */
    private static final class C50977b extends ProtoAdapter<ReplyVideoChatNoticeResponse> {
        C50977b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplyVideoChatNoticeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplyVideoChatNoticeResponse replyVideoChatNoticeResponse) {
            return replyVideoChatNoticeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ReplyVideoChatNoticeResponse decode(ProtoReader protoReader) throws IOException {
            C50976a aVar = new C50976a();
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
        public void encode(ProtoWriter protoWriter, ReplyVideoChatNoticeResponse replyVideoChatNoticeResponse) throws IOException {
            protoWriter.writeBytes(replyVideoChatNoticeResponse.unknownFields());
        }
    }

    public ReplyVideoChatNoticeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatNoticeResponse$a */
    public static final class C50976a extends Message.Builder<ReplyVideoChatNoticeResponse, C50976a> {
        /* renamed from: a */
        public ReplyVideoChatNoticeResponse build() {
            return new ReplyVideoChatNoticeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50976a newBuilder() {
        C50976a aVar = new C50976a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReplyVideoChatNoticeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ReplyVideoChatNoticeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ReplyVideoChatNoticeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
