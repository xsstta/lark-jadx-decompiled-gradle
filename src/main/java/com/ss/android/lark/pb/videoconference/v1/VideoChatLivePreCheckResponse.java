package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatLivePreCheckResponse extends Message<VideoChatLivePreCheckResponse, C51260a> {
    public static final ProtoAdapter<VideoChatLivePreCheckResponse> ADAPTER = new C51261b();
    public static final Boolean DEFAULT_SHOW_PRIVACY_POLICY = false;
    private static final long serialVersionUID = 0;
    public final Boolean show_privacy_policy;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckResponse$b */
    private static final class C51261b extends ProtoAdapter<VideoChatLivePreCheckResponse> {
        C51261b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatLivePreCheckResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatLivePreCheckResponse videoChatLivePreCheckResponse) {
            int i;
            if (videoChatLivePreCheckResponse.show_privacy_policy != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, videoChatLivePreCheckResponse.show_privacy_policy);
            } else {
                i = 0;
            }
            return i + videoChatLivePreCheckResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatLivePreCheckResponse decode(ProtoReader protoReader) throws IOException {
            C51260a aVar = new C51260a();
            aVar.f127650a = false;
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
                    aVar.f127650a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatLivePreCheckResponse videoChatLivePreCheckResponse) throws IOException {
            if (videoChatLivePreCheckResponse.show_privacy_policy != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoChatLivePreCheckResponse.show_privacy_policy);
            }
            protoWriter.writeBytes(videoChatLivePreCheckResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckResponse$a */
    public static final class C51260a extends Message.Builder<VideoChatLivePreCheckResponse, C51260a> {

        /* renamed from: a */
        public Boolean f127650a;

        /* renamed from: a */
        public VideoChatLivePreCheckResponse build() {
            return new VideoChatLivePreCheckResponse(this.f127650a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51260a newBuilder() {
        C51260a aVar = new C51260a();
        aVar.f127650a = this.show_privacy_policy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatLivePreCheckResponse");
        StringBuilder sb = new StringBuilder();
        if (this.show_privacy_policy != null) {
            sb.append(", show_privacy_policy=");
            sb.append(this.show_privacy_policy);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatLivePreCheckResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatLivePreCheckResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public VideoChatLivePreCheckResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_privacy_policy = bool;
    }
}
