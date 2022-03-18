package com.bytedance.lark.pb.search.feedback.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FeedbackResponse extends Message<FeedbackResponse, C18753a> {
    public static final ProtoAdapter<FeedbackResponse> ADAPTER = new C18754b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final String err_msg;
    public final Boolean success;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackResponse$b */
    private static final class C18754b extends ProtoAdapter<FeedbackResponse> {
        C18754b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackResponse feedbackResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, feedbackResponse.success);
            if (feedbackResponse.err_msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackResponse.err_msg);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + feedbackResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackResponse decode(ProtoReader protoReader) throws IOException {
            C18753a aVar = new C18753a();
            aVar.f46303a = false;
            aVar.f46304b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46303a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46304b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackResponse feedbackResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, feedbackResponse.success);
            if (feedbackResponse.err_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedbackResponse.err_msg);
            }
            protoWriter.writeBytes(feedbackResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackResponse$a */
    public static final class C18753a extends Message.Builder<FeedbackResponse, C18753a> {

        /* renamed from: a */
        public Boolean f46303a;

        /* renamed from: b */
        public String f46304b;

        /* renamed from: a */
        public FeedbackResponse build() {
            Boolean bool = this.f46303a;
            if (bool != null) {
                return new FeedbackResponse(bool, this.f46304b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "success");
        }
    }

    @Override // com.squareup.wire.Message
    public C18753a newBuilder() {
        C18753a aVar = new C18753a();
        aVar.f46303a = this.success;
        aVar.f46304b = this.err_msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "FeedbackResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.success);
        if (this.err_msg != null) {
            sb.append(", err_msg=");
            sb.append(this.err_msg);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public FeedbackResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.err_msg = str;
    }
}
