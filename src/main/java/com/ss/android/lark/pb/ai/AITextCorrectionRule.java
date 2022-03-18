package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AITextCorrectionRule extends Message<AITextCorrectionRule, C49423a> {
    public static final ProtoAdapter<AITextCorrectionRule> ADAPTER = new C49424b();
    public static final Integer DEFAULT_ID = 0;
    private static final long serialVersionUID = 0;
    public final String mdescription;
    public final Integer mid;

    /* renamed from: com.ss.android.lark.pb.ai.AITextCorrectionRule$b */
    private static final class C49424b extends ProtoAdapter<AITextCorrectionRule> {
        C49424b() {
            super(FieldEncoding.LENGTH_DELIMITED, AITextCorrectionRule.class);
        }

        /* renamed from: a */
        public int encodedSize(AITextCorrectionRule aITextCorrectionRule) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aITextCorrectionRule.mid) + ProtoAdapter.STRING.encodedSizeWithTag(2, aITextCorrectionRule.mdescription) + aITextCorrectionRule.unknownFields().size();
        }

        /* renamed from: a */
        public AITextCorrectionRule decode(ProtoReader protoReader) throws IOException {
            C49423a aVar = new C49423a();
            aVar.f123965a = 0;
            aVar.f123966b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123965a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123966b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AITextCorrectionRule aITextCorrectionRule) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aITextCorrectionRule.mid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, aITextCorrectionRule.mdescription);
            protoWriter.writeBytes(aITextCorrectionRule.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49423a newBuilder() {
        C49423a aVar = new C49423a();
        aVar.f123965a = this.mid;
        aVar.f123966b = this.mdescription;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.AITextCorrectionRule$a */
    public static final class C49423a extends Message.Builder<AITextCorrectionRule, C49423a> {

        /* renamed from: a */
        public Integer f123965a;

        /* renamed from: b */
        public String f123966b;

        /* renamed from: a */
        public AITextCorrectionRule build() {
            String str;
            Integer num = this.f123965a;
            if (num != null && (str = this.f123966b) != null) {
                return new AITextCorrectionRule(num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "mid", this.f123966b, "mdescription");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", description=");
        sb.append(this.mdescription);
        StringBuilder replace = sb.replace(0, 2, "AITextCorrectionRule{");
        replace.append('}');
        return replace.toString();
    }

    public AITextCorrectionRule(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public AITextCorrectionRule(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = num;
        this.mdescription = str;
    }
}
