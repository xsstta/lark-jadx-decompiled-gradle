package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class RetryCreateCommentRequest extends Message<RetryCreateCommentRequest, C18534a> {
    public static final ProtoAdapter<RetryCreateCommentRequest> ADAPTER = new C18535b();
    private static final long serialVersionUID = 0;
    public final String comment_id;
    public final List<String> push_category_ids;

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreateCommentRequest$b */
    private static final class C18535b extends ProtoAdapter<RetryCreateCommentRequest> {
        C18535b() {
            super(FieldEncoding.LENGTH_DELIMITED, RetryCreateCommentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RetryCreateCommentRequest retryCreateCommentRequest) {
            int i;
            if (retryCreateCommentRequest.comment_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, retryCreateCommentRequest.comment_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, retryCreateCommentRequest.push_category_ids) + retryCreateCommentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RetryCreateCommentRequest decode(ProtoReader protoReader) throws IOException {
            C18534a aVar = new C18534a();
            aVar.f46020a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46020a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46021b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RetryCreateCommentRequest retryCreateCommentRequest) throws IOException {
            if (retryCreateCommentRequest.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, retryCreateCommentRequest.comment_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, retryCreateCommentRequest.push_category_ids);
            protoWriter.writeBytes(retryCreateCommentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.RetryCreateCommentRequest$a */
    public static final class C18534a extends Message.Builder<RetryCreateCommentRequest, C18534a> {

        /* renamed from: a */
        public String f46020a;

        /* renamed from: b */
        public List<String> f46021b = Internal.newMutableList();

        /* renamed from: a */
        public RetryCreateCommentRequest build() {
            return new RetryCreateCommentRequest(this.f46020a, this.f46021b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18534a mo63943a(String str) {
            this.f46020a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18534a newBuilder() {
        C18534a aVar = new C18534a();
        aVar.f46020a = this.comment_id;
        aVar.f46021b = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "RetryCreateCommentRequest");
        StringBuilder sb = new StringBuilder();
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "RetryCreateCommentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RetryCreateCommentRequest(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public RetryCreateCommentRequest(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment_id = str;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
    }
}
