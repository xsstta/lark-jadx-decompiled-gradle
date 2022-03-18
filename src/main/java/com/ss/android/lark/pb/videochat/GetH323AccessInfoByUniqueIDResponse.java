package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetH323AccessInfoByUniqueIDResponse extends Message<GetH323AccessInfoByUniqueIDResponse, C50324a> {
    public static final ProtoAdapter<GetH323AccessInfoByUniqueIDResponse> ADAPTER = new C50325b();
    private static final long serialVersionUID = 0;
    public final VideoChatH323Setting mh323_access;

    /* renamed from: com.ss.android.lark.pb.videochat.GetH323AccessInfoByUniqueIDResponse$b */
    private static final class C50325b extends ProtoAdapter<GetH323AccessInfoByUniqueIDResponse> {
        C50325b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetH323AccessInfoByUniqueIDResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetH323AccessInfoByUniqueIDResponse getH323AccessInfoByUniqueIDResponse) {
            int i;
            if (getH323AccessInfoByUniqueIDResponse.mh323_access != null) {
                i = VideoChatH323Setting.ADAPTER.encodedSizeWithTag(1, getH323AccessInfoByUniqueIDResponse.mh323_access);
            } else {
                i = 0;
            }
            return i + getH323AccessInfoByUniqueIDResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetH323AccessInfoByUniqueIDResponse decode(ProtoReader protoReader) throws IOException {
            C50324a aVar = new C50324a();
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
                    aVar.f125704a = VideoChatH323Setting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetH323AccessInfoByUniqueIDResponse getH323AccessInfoByUniqueIDResponse) throws IOException {
            if (getH323AccessInfoByUniqueIDResponse.mh323_access != null) {
                VideoChatH323Setting.ADAPTER.encodeWithTag(protoWriter, 1, getH323AccessInfoByUniqueIDResponse.mh323_access);
            }
            protoWriter.writeBytes(getH323AccessInfoByUniqueIDResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetH323AccessInfoByUniqueIDResponse$a */
    public static final class C50324a extends Message.Builder<GetH323AccessInfoByUniqueIDResponse, C50324a> {

        /* renamed from: a */
        public VideoChatH323Setting f125704a;

        /* renamed from: a */
        public GetH323AccessInfoByUniqueIDResponse build() {
            return new GetH323AccessInfoByUniqueIDResponse(this.f125704a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50324a newBuilder() {
        C50324a aVar = new C50324a();
        aVar.f125704a = this.mh323_access;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mh323_access != null) {
            sb.append(", h323_access=");
            sb.append(this.mh323_access);
        }
        StringBuilder replace = sb.replace(0, 2, "GetH323AccessInfoByUniqueIDResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetH323AccessInfoByUniqueIDResponse(VideoChatH323Setting videoChatH323Setting) {
        this(videoChatH323Setting, ByteString.EMPTY);
    }

    public GetH323AccessInfoByUniqueIDResponse(VideoChatH323Setting videoChatH323Setting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mh323_access = videoChatH323Setting;
    }
}
