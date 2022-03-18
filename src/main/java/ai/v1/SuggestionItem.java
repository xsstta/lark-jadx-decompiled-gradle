package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SuggestionItem extends Message<SuggestionItem, C0077a> {
    public static final ProtoAdapter<SuggestionItem> ADAPTER = new C0078b();
    public static final Double DEFAULT_CONFIDENCE = Double.valueOf(0.0d);
    private static final long serialVersionUID = 0;
    public final Double confidence;
    public final String id;
    public final String reason;
    public final String suggestion;

    /* renamed from: ai.v1.SuggestionItem$b */
    private static final class C0078b extends ProtoAdapter<SuggestionItem> {
        C0078b() {
            super(FieldEncoding.LENGTH_DELIMITED, SuggestionItem.class);
        }

        /* renamed from: a */
        public int encodedSize(SuggestionItem suggestionItem) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, suggestionItem.suggestion) + ProtoAdapter.STRING.encodedSizeWithTag(2, suggestionItem.id);
            int i2 = 0;
            if (suggestionItem.confidence != null) {
                i = ProtoAdapter.DOUBLE.encodedSizeWithTag(3, suggestionItem.confidence);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (suggestionItem.reason != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, suggestionItem.reason);
            }
            return i3 + i2 + suggestionItem.unknownFields().size();
        }

        /* renamed from: a */
        public SuggestionItem decode(ProtoReader protoReader) throws IOException {
            C0077a aVar = new C0077a();
            aVar.f128a = "";
            aVar.f129b = "";
            aVar.f130c = Double.valueOf(0.0d);
            aVar.f131d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f128a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f129b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f130c = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f131d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SuggestionItem suggestionItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, suggestionItem.suggestion);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, suggestionItem.id);
            if (suggestionItem.confidence != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, suggestionItem.confidence);
            }
            if (suggestionItem.reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, suggestionItem.reason);
            }
            protoWriter.writeBytes(suggestionItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0077a newBuilder() {
        C0077a aVar = new C0077a();
        aVar.f128a = this.suggestion;
        aVar.f129b = this.id;
        aVar.f130c = this.confidence;
        aVar.f131d = this.reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.SuggestionItem$a */
    public static final class C0077a extends Message.Builder<SuggestionItem, C0077a> {

        /* renamed from: a */
        public String f128a;

        /* renamed from: b */
        public String f129b;

        /* renamed from: c */
        public Double f130c;

        /* renamed from: d */
        public String f131d;

        /* renamed from: a */
        public SuggestionItem build() {
            String str;
            String str2 = this.f128a;
            if (str2 != null && (str = this.f129b) != null) {
                return new SuggestionItem(str2, str, this.f130c, this.f131d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "suggestion", this.f129b, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "SuggestionItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", suggestion=");
        sb.append(this.suggestion);
        sb.append(", id=");
        sb.append(this.id);
        if (this.confidence != null) {
            sb.append(", confidence=");
            sb.append(this.confidence);
        }
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        StringBuilder replace = sb.replace(0, 2, "SuggestionItem{");
        replace.append('}');
        return replace.toString();
    }

    public SuggestionItem(String str, String str2, Double d, String str3) {
        this(str, str2, d, str3, ByteString.EMPTY);
    }

    public SuggestionItem(String str, String str2, Double d, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.suggestion = str;
        this.id = str2;
        this.confidence = d;
        this.reason = str3;
    }
}
