package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class AttributedText extends Message<AttributedText, C49433a> {
    public static final ProtoAdapter<AttributedText> ADAPTER = new C49434b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> mattributes;
    public final String mtext;

    /* renamed from: com.ss.android.lark.pb.ai.AttributedText$a */
    public static final class C49433a extends Message.Builder<AttributedText, C49433a> {

        /* renamed from: a */
        public String f123980a;

        /* renamed from: b */
        public Map<String, String> f123981b = Internal.newMutableMap();

        /* renamed from: a */
        public AttributedText build() {
            String str = this.f123980a;
            if (str != null) {
                return new AttributedText(str, this.f123981b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mtext");
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.AttributedText$b */
    private static final class C49434b extends ProtoAdapter<AttributedText> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f123982a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49434b() {
            super(FieldEncoding.LENGTH_DELIMITED, AttributedText.class);
        }

        /* renamed from: a */
        public int encodedSize(AttributedText attributedText) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, attributedText.mtext) + this.f123982a.encodedSizeWithTag(2, attributedText.mattributes) + attributedText.unknownFields().size();
        }

        /* renamed from: a */
        public AttributedText decode(ProtoReader protoReader) throws IOException {
            C49433a aVar = new C49433a();
            aVar.f123980a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123980a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123981b.putAll(this.f123982a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AttributedText attributedText) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attributedText.mtext);
            this.f123982a.encodeWithTag(protoWriter, 2, attributedText.mattributes);
            protoWriter.writeBytes(attributedText.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49433a newBuilder() {
        C49433a aVar = new C49433a();
        aVar.f123980a = this.mtext;
        aVar.f123981b = Internal.copyOf("mattributes", this.mattributes);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", text=");
        sb.append(this.mtext);
        if (!this.mattributes.isEmpty()) {
            sb.append(", attributes=");
            sb.append(this.mattributes);
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
        this.mtext = str;
        this.mattributes = Internal.immutableCopyOf("mattributes", map);
    }
}
