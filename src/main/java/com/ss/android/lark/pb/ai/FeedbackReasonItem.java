package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FeedbackReasonItem extends Message<FeedbackReasonItem, C49461a> {
    public static final ProtoAdapter<FeedbackReasonItem> ADAPTER = new C49462b();
    public static final Integer DEFAULT_ID = 0;
    private static final long serialVersionUID = 0;
    public final String mcontent;
    public final Integer mid;

    /* renamed from: com.ss.android.lark.pb.ai.FeedbackReasonItem$b */
    private static final class C49462b extends ProtoAdapter<FeedbackReasonItem> {
        C49462b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackReasonItem.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackReasonItem feedbackReasonItem) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, feedbackReasonItem.mid) + ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackReasonItem.mcontent) + feedbackReasonItem.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackReasonItem decode(ProtoReader protoReader) throws IOException {
            C49461a aVar = new C49461a();
            aVar.f124057a = 0;
            aVar.f124058b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124057a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124058b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackReasonItem feedbackReasonItem) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, feedbackReasonItem.mid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedbackReasonItem.mcontent);
            protoWriter.writeBytes(feedbackReasonItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49461a newBuilder() {
        C49461a aVar = new C49461a();
        aVar.f124057a = this.mid;
        aVar.f124058b = this.mcontent;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.FeedbackReasonItem$a */
    public static final class C49461a extends Message.Builder<FeedbackReasonItem, C49461a> {

        /* renamed from: a */
        public Integer f124057a;

        /* renamed from: b */
        public String f124058b;

        /* renamed from: a */
        public FeedbackReasonItem build() {
            String str;
            Integer num = this.f124057a;
            if (num != null && (str = this.f124058b) != null) {
                return new FeedbackReasonItem(num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "mid", this.f124058b, "mcontent");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", content=");
        sb.append(this.mcontent);
        StringBuilder replace = sb.replace(0, 2, "FeedbackReasonItem{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackReasonItem(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public FeedbackReasonItem(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = num;
        this.mcontent = str;
    }
}
