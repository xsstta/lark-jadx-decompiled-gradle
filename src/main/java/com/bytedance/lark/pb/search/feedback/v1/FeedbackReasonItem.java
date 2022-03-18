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

public final class FeedbackReasonItem extends Message<FeedbackReasonItem, C18749a> {
    public static final ProtoAdapter<FeedbackReasonItem> ADAPTER = new C18750b();
    public static final Integer DEFAULT_ID = 0;
    private static final long serialVersionUID = 0;
    public final String content;
    public final Integer id;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackReasonItem$b */
    private static final class C18750b extends ProtoAdapter<FeedbackReasonItem> {
        C18750b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackReasonItem.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackReasonItem feedbackReasonItem) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, feedbackReasonItem.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackReasonItem.content) + feedbackReasonItem.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackReasonItem decode(ProtoReader protoReader) throws IOException {
            C18749a aVar = new C18749a();
            aVar.f46296a = 0;
            aVar.f46297b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46296a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46297b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackReasonItem feedbackReasonItem) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, feedbackReasonItem.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedbackReasonItem.content);
            protoWriter.writeBytes(feedbackReasonItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18749a newBuilder() {
        C18749a aVar = new C18749a();
        aVar.f46296a = this.id;
        aVar.f46297b = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackReasonItem$a */
    public static final class C18749a extends Message.Builder<FeedbackReasonItem, C18749a> {

        /* renamed from: a */
        public Integer f46296a;

        /* renamed from: b */
        public String f46297b;

        /* renamed from: a */
        public FeedbackReasonItem build() {
            String str;
            Integer num = this.f46296a;
            if (num != null && (str = this.f46297b) != null) {
                return new FeedbackReasonItem(num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "id", this.f46297b, "content");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "FeedbackReasonItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", content=");
        sb.append(this.content);
        StringBuilder replace = sb.replace(0, 2, "FeedbackReasonItem{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackReasonItem(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public FeedbackReasonItem(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = num;
        this.content = str;
    }
}
