package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatFeedbackResponse extends Message<VideoChatFeedbackResponse, C51234a> {
    public static final ProtoAdapter<VideoChatFeedbackResponse> ADAPTER = new C51235b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFeedbackResponse$b */
    private static final class C51235b extends ProtoAdapter<VideoChatFeedbackResponse> {
        C51235b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatFeedbackResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatFeedbackResponse videoChatFeedbackResponse) {
            return videoChatFeedbackResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatFeedbackResponse decode(ProtoReader protoReader) throws IOException {
            C51234a aVar = new C51234a();
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
        public void encode(ProtoWriter protoWriter, VideoChatFeedbackResponse videoChatFeedbackResponse) throws IOException {
            protoWriter.writeBytes(videoChatFeedbackResponse.unknownFields());
        }
    }

    public VideoChatFeedbackResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFeedbackResponse$a */
    public static final class C51234a extends Message.Builder<VideoChatFeedbackResponse, C51234a> {
        /* renamed from: a */
        public VideoChatFeedbackResponse build() {
            return new VideoChatFeedbackResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51234a newBuilder() {
        C51234a aVar = new C51234a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatFeedbackResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "VideoChatFeedbackResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatFeedbackResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
