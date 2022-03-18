package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatMeetingFeedbackResponse extends Message<VideoChatMeetingFeedbackResponse, C51268a> {
    public static final ProtoAdapter<VideoChatMeetingFeedbackResponse> ADAPTER = new C51269b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackResponse$b */
    private static final class C51269b extends ProtoAdapter<VideoChatMeetingFeedbackResponse> {
        C51269b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatMeetingFeedbackResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatMeetingFeedbackResponse videoChatMeetingFeedbackResponse) {
            return videoChatMeetingFeedbackResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatMeetingFeedbackResponse decode(ProtoReader protoReader) throws IOException {
            C51268a aVar = new C51268a();
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
        public void encode(ProtoWriter protoWriter, VideoChatMeetingFeedbackResponse videoChatMeetingFeedbackResponse) throws IOException {
            protoWriter.writeBytes(videoChatMeetingFeedbackResponse.unknownFields());
        }
    }

    public VideoChatMeetingFeedbackResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackResponse$a */
    public static final class C51268a extends Message.Builder<VideoChatMeetingFeedbackResponse, C51268a> {
        /* renamed from: a */
        public VideoChatMeetingFeedbackResponse build() {
            return new VideoChatMeetingFeedbackResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51268a newBuilder() {
        C51268a aVar = new C51268a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatMeetingFeedbackResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "VideoChatMeetingFeedbackResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatMeetingFeedbackResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
