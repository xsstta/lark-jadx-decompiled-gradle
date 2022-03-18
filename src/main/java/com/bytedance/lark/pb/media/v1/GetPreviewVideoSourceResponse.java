package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPreviewVideoSourceResponse extends Message<GetPreviewVideoSourceResponse, C18252a> {
    public static final ProtoAdapter<GetPreviewVideoSourceResponse> ADAPTER = new C18253b();
    private static final long serialVersionUID = 0;
    public final String video_src;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetPreviewVideoSourceResponse$b */
    private static final class C18253b extends ProtoAdapter<GetPreviewVideoSourceResponse> {
        C18253b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPreviewVideoSourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPreviewVideoSourceResponse getPreviewVideoSourceResponse) {
            int i;
            if (getPreviewVideoSourceResponse.video_src != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getPreviewVideoSourceResponse.video_src);
            } else {
                i = 0;
            }
            return i + getPreviewVideoSourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPreviewVideoSourceResponse decode(ProtoReader protoReader) throws IOException {
            C18252a aVar = new C18252a();
            aVar.f45504a = "";
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
                    aVar.f45504a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPreviewVideoSourceResponse getPreviewVideoSourceResponse) throws IOException {
            if (getPreviewVideoSourceResponse.video_src != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPreviewVideoSourceResponse.video_src);
            }
            protoWriter.writeBytes(getPreviewVideoSourceResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetPreviewVideoSourceResponse$a */
    public static final class C18252a extends Message.Builder<GetPreviewVideoSourceResponse, C18252a> {

        /* renamed from: a */
        public String f45504a;

        /* renamed from: a */
        public GetPreviewVideoSourceResponse build() {
            return new GetPreviewVideoSourceResponse(this.f45504a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18252a newBuilder() {
        C18252a aVar = new C18252a();
        aVar.f45504a = this.video_src;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetPreviewVideoSourceResponse");
        StringBuilder sb = new StringBuilder();
        if (this.video_src != null) {
            sb.append(", video_src=");
            sb.append(this.video_src);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPreviewVideoSourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPreviewVideoSourceResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetPreviewVideoSourceResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_src = str;
    }
}
