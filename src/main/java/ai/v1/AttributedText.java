package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class AttributedText extends Message<AttributedText, C0033a> {
    public static final ProtoAdapter<AttributedText> ADAPTER = new C0034b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> attributes;
    public final String text;

    /* renamed from: ai.v1.AttributedText$a */
    public static final class C0033a extends Message.Builder<AttributedText, C0033a> {

        /* renamed from: a */
        public String f55a;

        /* renamed from: b */
        public Map<String, String> f56b = Internal.newMutableMap();

        /* renamed from: a */
        public AttributedText build() {
            String str = this.f55a;
            if (str != null) {
                return new AttributedText(str, this.f56b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "text");
        }
    }

    /* renamed from: ai.v1.AttributedText$b */
    private static final class C0034b extends ProtoAdapter<AttributedText> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f57a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C0034b() {
            super(FieldEncoding.LENGTH_DELIMITED, AttributedText.class);
        }

        /* renamed from: a */
        public int encodedSize(AttributedText attributedText) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, attributedText.text) + this.f57a.encodedSizeWithTag(2, attributedText.attributes) + attributedText.unknownFields().size();
        }

        /* renamed from: a */
        public AttributedText decode(ProtoReader protoReader) throws IOException {
            C0033a aVar = new C0033a();
            aVar.f55a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f55a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56b.putAll(this.f57a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AttributedText attributedText) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attributedText.text);
            this.f57a.encodeWithTag(protoWriter, 2, attributedText.attributes);
            protoWriter.writeBytes(attributedText.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0033a newBuilder() {
        C0033a aVar = new C0033a();
        aVar.f55a = this.text;
        aVar.f56b = Internal.copyOf("attributes", this.attributes);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "AttributedText");
        StringBuilder sb = new StringBuilder();
        sb.append(", text=");
        sb.append(this.text);
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=");
            sb.append(this.attributes);
        }
        StringBuilder replace = sb.replace(0, 2, "AttributedText{");
        replace.append('}');
        return replace.toString();
    }

    public AttributedText(String str, Map<String, String> map) {
        this(str, map, ByteString.EMPTY);
    }

    public AttributedText(String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.attributes = Internal.immutableCopyOf("attributes", map);
    }
}
