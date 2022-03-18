package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AITextCorrectionMatch extends Message<AITextCorrectionMatch, C49419a> {
    public static final ProtoAdapter<AITextCorrectionMatch> ADAPTER = new C49420b();
    public static final Integer DEFAULT_LENGTH = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer mlength;
    public final String mmodel;
    public final Integer moffset;
    public final AITextCorrectionRule mrule;
    public final String msentence;
    public final String msentence_id;
    public final String msource_text;
    public final String mtarget_text;
    public final String mvid;

    /* renamed from: com.ss.android.lark.pb.ai.AITextCorrectionMatch$b */
    private static final class C49420b extends ProtoAdapter<AITextCorrectionMatch> {
        C49420b() {
            super(FieldEncoding.LENGTH_DELIMITED, AITextCorrectionMatch.class);
        }

        /* renamed from: a */
        public int encodedSize(AITextCorrectionMatch aITextCorrectionMatch) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, aITextCorrectionMatch.mvid) + ProtoAdapter.INT32.encodedSizeWithTag(2, aITextCorrectionMatch.moffset) + ProtoAdapter.INT32.encodedSizeWithTag(3, aITextCorrectionMatch.mlength) + ProtoAdapter.STRING.encodedSizeWithTag(4, aITextCorrectionMatch.msource_text) + ProtoAdapter.STRING.encodedSizeWithTag(5, aITextCorrectionMatch.mtarget_text) + ProtoAdapter.STRING.encodedSizeWithTag(6, aITextCorrectionMatch.msentence) + ProtoAdapter.STRING.encodedSizeWithTag(7, aITextCorrectionMatch.msentence_id) + ProtoAdapter.STRING.encodedSizeWithTag(8, aITextCorrectionMatch.mmodel) + AITextCorrectionRule.ADAPTER.encodedSizeWithTag(9, aITextCorrectionMatch.mrule) + aITextCorrectionMatch.unknownFields().size();
        }

        /* renamed from: a */
        public AITextCorrectionMatch decode(ProtoReader protoReader) throws IOException {
            C49419a aVar = new C49419a();
            aVar.f123953a = "";
            aVar.f123954b = 0;
            aVar.f123955c = 0;
            aVar.f123956d = "";
            aVar.f123957e = "";
            aVar.f123958f = "";
            aVar.f123959g = "";
            aVar.f123960h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f123953a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f123954b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f123955c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f123956d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f123957e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f123958f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f123959g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f123960h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f123961i = AITextCorrectionRule.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AITextCorrectionMatch aITextCorrectionMatch) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, aITextCorrectionMatch.mvid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, aITextCorrectionMatch.moffset);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, aITextCorrectionMatch.mlength);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, aITextCorrectionMatch.msource_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, aITextCorrectionMatch.mtarget_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, aITextCorrectionMatch.msentence);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, aITextCorrectionMatch.msentence_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, aITextCorrectionMatch.mmodel);
            AITextCorrectionRule.ADAPTER.encodeWithTag(protoWriter, 9, aITextCorrectionMatch.mrule);
            protoWriter.writeBytes(aITextCorrectionMatch.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49419a newBuilder() {
        C49419a aVar = new C49419a();
        aVar.f123953a = this.mvid;
        aVar.f123954b = this.moffset;
        aVar.f123955c = this.mlength;
        aVar.f123956d = this.msource_text;
        aVar.f123957e = this.mtarget_text;
        aVar.f123958f = this.msentence;
        aVar.f123959g = this.msentence_id;
        aVar.f123960h = this.mmodel;
        aVar.f123961i = this.mrule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", vid=");
        sb.append(this.mvid);
        sb.append(", offset=");
        sb.append(this.moffset);
        sb.append(", length=");
        sb.append(this.mlength);
        sb.append(", source_text=");
        sb.append(this.msource_text);
        sb.append(", target_text=");
        sb.append(this.mtarget_text);
        sb.append(", sentence=");
        sb.append(this.msentence);
        sb.append(", sentence_id=");
        sb.append(this.msentence_id);
        sb.append(", model=");
        sb.append(this.mmodel);
        sb.append(", rule=");
        sb.append(this.mrule);
        StringBuilder replace = sb.replace(0, 2, "AITextCorrectionMatch{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.ai.AITextCorrectionMatch$a */
    public static final class C49419a extends Message.Builder<AITextCorrectionMatch, C49419a> {

        /* renamed from: a */
        public String f123953a;

        /* renamed from: b */
        public Integer f123954b;

        /* renamed from: c */
        public Integer f123955c;

        /* renamed from: d */
        public String f123956d;

        /* renamed from: e */
        public String f123957e;

        /* renamed from: f */
        public String f123958f;

        /* renamed from: g */
        public String f123959g;

        /* renamed from: h */
        public String f123960h;

        /* renamed from: i */
        public AITextCorrectionRule f123961i;

        /* renamed from: a */
        public AITextCorrectionMatch build() {
            Integer num;
            Integer num2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            AITextCorrectionRule aITextCorrectionRule;
            String str6 = this.f123953a;
            if (str6 != null && (num = this.f123954b) != null && (num2 = this.f123955c) != null && (str = this.f123956d) != null && (str2 = this.f123957e) != null && (str3 = this.f123958f) != null && (str4 = this.f123959g) != null && (str5 = this.f123960h) != null && (aITextCorrectionRule = this.f123961i) != null) {
                return new AITextCorrectionMatch(str6, num, num2, str, str2, str3, str4, str5, aITextCorrectionRule, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str6, "mvid", this.f123954b, "moffset", this.f123955c, "mlength", this.f123956d, "msource_text", this.f123957e, "mtarget_text", this.f123958f, "msentence", this.f123959g, "msentence_id", this.f123960h, "mmodel", this.f123961i, "mrule");
        }
    }

    public AITextCorrectionMatch(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, AITextCorrectionRule aITextCorrectionRule) {
        this(str, num, num2, str2, str3, str4, str5, str6, aITextCorrectionRule, ByteString.EMPTY);
    }

    public AITextCorrectionMatch(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, AITextCorrectionRule aITextCorrectionRule, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mvid = str;
        this.moffset = num;
        this.mlength = num2;
        this.msource_text = str2;
        this.mtarget_text = str3;
        this.msentence = str4;
        this.msentence_id = str5;
        this.mmodel = str6;
        this.mrule = aITextCorrectionRule;
    }
}
