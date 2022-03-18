package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReplyFollowNoticeResponse extends Message<ReplyFollowNoticeResponse, C50972a> {
    public static final ProtoAdapter<ReplyFollowNoticeResponse> ADAPTER = new C50973b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyFollowNoticeResponse$b */
    private static final class C50973b extends ProtoAdapter<ReplyFollowNoticeResponse> {
        C50973b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplyFollowNoticeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplyFollowNoticeResponse replyFollowNoticeResponse) {
            return replyFollowNoticeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ReplyFollowNoticeResponse decode(ProtoReader protoReader) throws IOException {
            C50972a aVar = new C50972a();
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
        public void encode(ProtoWriter protoWriter, ReplyFollowNoticeResponse replyFollowNoticeResponse) throws IOException {
            protoWriter.writeBytes(replyFollowNoticeResponse.unknownFields());
        }
    }

    public ReplyFollowNoticeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyFollowNoticeResponse$a */
    public static final class C50972a extends Message.Builder<ReplyFollowNoticeResponse, C50972a> {
        /* renamed from: a */
        public ReplyFollowNoticeResponse build() {
            return new ReplyFollowNoticeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50972a newBuilder() {
        C50972a aVar = new C50972a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReplyFollowNoticeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ReplyFollowNoticeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ReplyFollowNoticeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
