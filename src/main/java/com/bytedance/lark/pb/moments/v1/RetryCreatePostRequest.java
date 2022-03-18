package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RetryCreatePostRequest extends Message<RetryCreatePostRequest, C18538a> {
    public static final ProtoAdapter<RetryCreatePostRequest> ADAPTER = new C18539b();
    private static final long serialVersionUID = 0;
    public final String post_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreatePostRequest$b */
    private static final class C18539b extends ProtoAdapter<RetryCreatePostRequest> {
        C18539b() {
            super(FieldEncoding.LENGTH_DELIMITED, RetryCreatePostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RetryCreatePostRequest retryCreatePostRequest) {
            int i;
            if (retryCreatePostRequest.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, retryCreatePostRequest.post_id);
            } else {
                i = 0;
            }
            return i + retryCreatePostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RetryCreatePostRequest decode(ProtoReader protoReader) throws IOException {
            C18538a aVar = new C18538a();
            aVar.f46024a = "";
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
                    aVar.f46024a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RetryCreatePostRequest retryCreatePostRequest) throws IOException {
            if (retryCreatePostRequest.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, retryCreatePostRequest.post_id);
            }
            protoWriter.writeBytes(retryCreatePostRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreatePostRequest$a */
    public static final class C18538a extends Message.Builder<RetryCreatePostRequest, C18538a> {

        /* renamed from: a */
        public String f46024a;

        /* renamed from: a */
        public RetryCreatePostRequest build() {
            return new RetryCreatePostRequest(this.f46024a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18538a mo63952a(String str) {
            this.f46024a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18538a newBuilder() {
        C18538a aVar = new C18538a();
        aVar.f46024a = this.post_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "RetryCreatePostRequest");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        StringBuilder replace = sb.replace(0, 2, "RetryCreatePostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RetryCreatePostRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public RetryCreatePostRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
    }
}
