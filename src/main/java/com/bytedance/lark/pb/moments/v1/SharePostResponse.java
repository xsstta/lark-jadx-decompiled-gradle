package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SharePostResponse extends Message<SharePostResponse, C18550a> {
    public static final ProtoAdapter<SharePostResponse> ADAPTER = new C18551b();
    public static final Integer DEFAULT_MODIFIED_SHARE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer modified_share_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.SharePostResponse$b */
    private static final class C18551b extends ProtoAdapter<SharePostResponse> {
        C18551b() {
            super(FieldEncoding.LENGTH_DELIMITED, SharePostResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SharePostResponse sharePostResponse) {
            int i;
            if (sharePostResponse.modified_share_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, sharePostResponse.modified_share_count);
            } else {
                i = 0;
            }
            return i + sharePostResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SharePostResponse decode(ProtoReader protoReader) throws IOException {
            C18550a aVar = new C18550a();
            aVar.f46039a = 0;
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
                    aVar.f46039a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SharePostResponse sharePostResponse) throws IOException {
            if (sharePostResponse.modified_share_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, sharePostResponse.modified_share_count);
            }
            protoWriter.writeBytes(sharePostResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.SharePostResponse$a */
    public static final class C18550a extends Message.Builder<SharePostResponse, C18550a> {

        /* renamed from: a */
        public Integer f46039a;

        /* renamed from: a */
        public SharePostResponse build() {
            return new SharePostResponse(this.f46039a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18550a newBuilder() {
        C18550a aVar = new C18550a();
        aVar.f46039a = this.modified_share_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "SharePostResponse");
        StringBuilder sb = new StringBuilder();
        if (this.modified_share_count != null) {
            sb.append(", modified_share_count=");
            sb.append(this.modified_share_count);
        }
        StringBuilder replace = sb.replace(0, 2, "SharePostResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SharePostResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public SharePostResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.modified_share_count = num;
    }
}
