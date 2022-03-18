package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.entities.VideoChatContent;
import java.io.IOException;
import okio.ByteString;

public final class PullVCCardInfoResponse extends Message<PullVCCardInfoResponse, C50403a> {
    public static final ProtoAdapter<PullVCCardInfoResponse> ADAPTER = new C50404b();
    public static final Boolean DEFAULT_IS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean mis_more;
    public final String mnext_request_token;
    public final VideoChatContent mvideo_chat_content;

    /* renamed from: com.ss.android.lark.pb.videochat.PullVCCardInfoResponse$b */
    private static final class C50404b extends ProtoAdapter<PullVCCardInfoResponse> {
        C50404b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVCCardInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVCCardInfoResponse pullVCCardInfoResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (pullVCCardInfoResponse.mvideo_chat_content != null) {
                i = VideoChatContent.ADAPTER.encodedSizeWithTag(1, pullVCCardInfoResponse.mvideo_chat_content);
            } else {
                i = 0;
            }
            if (pullVCCardInfoResponse.mnext_request_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullVCCardInfoResponse.mnext_request_token);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pullVCCardInfoResponse.mis_more != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pullVCCardInfoResponse.mis_more);
            }
            return i4 + i3 + pullVCCardInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullVCCardInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50403a aVar = new C50403a();
            aVar.f125876b = "";
            aVar.f125877c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125875a = VideoChatContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125876b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125877c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVCCardInfoResponse pullVCCardInfoResponse) throws IOException {
            if (pullVCCardInfoResponse.mvideo_chat_content != null) {
                VideoChatContent.ADAPTER.encodeWithTag(protoWriter, 1, pullVCCardInfoResponse.mvideo_chat_content);
            }
            if (pullVCCardInfoResponse.mnext_request_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullVCCardInfoResponse.mnext_request_token);
            }
            if (pullVCCardInfoResponse.mis_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pullVCCardInfoResponse.mis_more);
            }
            protoWriter.writeBytes(pullVCCardInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.PullVCCardInfoResponse$a */
    public static final class C50403a extends Message.Builder<PullVCCardInfoResponse, C50403a> {

        /* renamed from: a */
        public VideoChatContent f125875a;

        /* renamed from: b */
        public String f125876b;

        /* renamed from: c */
        public Boolean f125877c;

        /* renamed from: a */
        public PullVCCardInfoResponse build() {
            return new PullVCCardInfoResponse(this.f125875a, this.f125876b, this.f125877c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50403a newBuilder() {
        C50403a aVar = new C50403a();
        aVar.f125875a = this.mvideo_chat_content;
        aVar.f125876b = this.mnext_request_token;
        aVar.f125877c = this.mis_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mvideo_chat_content != null) {
            sb.append(", video_chat_content=");
            sb.append(this.mvideo_chat_content);
        }
        if (this.mnext_request_token != null) {
            sb.append(", next_request_token=");
            sb.append(this.mnext_request_token);
        }
        if (this.mis_more != null) {
            sb.append(", is_more=");
            sb.append(this.mis_more);
        }
        StringBuilder replace = sb.replace(0, 2, "PullVCCardInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullVCCardInfoResponse(VideoChatContent videoChatContent, String str, Boolean bool) {
        this(videoChatContent, str, bool, ByteString.EMPTY);
    }

    public PullVCCardInfoResponse(VideoChatContent videoChatContent, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mvideo_chat_content = videoChatContent;
        this.mnext_request_token = str;
        this.mis_more = bool;
    }
}
