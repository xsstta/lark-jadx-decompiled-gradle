package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullVideochatByShareCodeResponse extends Message<PullVideochatByShareCodeResponse, C50407a> {
    public static final ProtoAdapter<PullVideochatByShareCodeResponse> ADAPTER = new C50408b();
    private static final long serialVersionUID = 0;
    public final VideoChatInfo minfo;

    /* renamed from: com.ss.android.lark.pb.videochat.PullVideochatByShareCodeResponse$b */
    private static final class C50408b extends ProtoAdapter<PullVideochatByShareCodeResponse> {
        C50408b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVideochatByShareCodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVideochatByShareCodeResponse pullVideochatByShareCodeResponse) {
            int i;
            if (pullVideochatByShareCodeResponse.minfo != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, pullVideochatByShareCodeResponse.minfo);
            } else {
                i = 0;
            }
            return i + pullVideochatByShareCodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullVideochatByShareCodeResponse decode(ProtoReader protoReader) throws IOException {
            C50407a aVar = new C50407a();
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
                    aVar.f125879a = VideoChatInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVideochatByShareCodeResponse pullVideochatByShareCodeResponse) throws IOException {
            if (pullVideochatByShareCodeResponse.minfo != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, pullVideochatByShareCodeResponse.minfo);
            }
            protoWriter.writeBytes(pullVideochatByShareCodeResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.PullVideochatByShareCodeResponse$a */
    public static final class C50407a extends Message.Builder<PullVideochatByShareCodeResponse, C50407a> {

        /* renamed from: a */
        public VideoChatInfo f125879a;

        /* renamed from: a */
        public PullVideochatByShareCodeResponse build() {
            return new PullVideochatByShareCodeResponse(this.f125879a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50407a newBuilder() {
        C50407a aVar = new C50407a();
        aVar.f125879a = this.minfo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.minfo != null) {
            sb.append(", info=");
            sb.append(this.minfo);
        }
        StringBuilder replace = sb.replace(0, 2, "PullVideochatByShareCodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullVideochatByShareCodeResponse(VideoChatInfo videoChatInfo) {
        this(videoChatInfo, ByteString.EMPTY);
    }

    public PullVideochatByShareCodeResponse(VideoChatInfo videoChatInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.minfo = videoChatInfo;
    }
}
