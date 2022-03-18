package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TextElementData extends Message<TextElementData, C18622a> {
    public static final ProtoAdapter<TextElementData> ADAPTER = new C18623b();
    public static final TextType DEFAULT_TEXT_TYPE = TextType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String text;
    public final TextType text_type;

    public enum TextType implements WireEnum {
        UNKNOWN(0),
        PLAIN(1),
        HTML(2);
        
        public static final ProtoAdapter<TextType> ADAPTER = ProtoAdapter.newEnumAdapter(TextType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TextType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PLAIN;
            }
            if (i != 2) {
                return null;
            }
            return HTML;
        }

        private TextType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.TextElementData$b */
    private static final class C18623b extends ProtoAdapter<TextElementData> {
        C18623b() {
            super(FieldEncoding.LENGTH_DELIMITED, TextElementData.class);
        }

        /* renamed from: a */
        public int encodedSize(TextElementData textElementData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, textElementData.text) + TextType.ADAPTER.encodedSizeWithTag(2, textElementData.text_type) + textElementData.unknownFields().size();
        }

        /* renamed from: a */
        public TextElementData decode(ProtoReader protoReader) throws IOException {
            C18622a aVar = new C18622a();
            aVar.f46131a = "";
            aVar.f46132b = TextType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46131a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46132b = TextType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TextElementData textElementData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textElementData.text);
            TextType.ADAPTER.encodeWithTag(protoWriter, 2, textElementData.text_type);
            protoWriter.writeBytes(textElementData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18622a newBuilder() {
        C18622a aVar = new C18622a();
        aVar.f46131a = this.text;
        aVar.f46132b = this.text_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.TextElementData$a */
    public static final class C18622a extends Message.Builder<TextElementData, C18622a> {

        /* renamed from: a */
        public String f46131a;

        /* renamed from: b */
        public TextType f46132b;

        /* renamed from: a */
        public TextElementData build() {
            TextType textType;
            String str = this.f46131a;
            if (str != null && (textType = this.f46132b) != null) {
                return new TextElementData(str, textType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "text", this.f46132b, "text_type");
        }

        /* renamed from: a */
        public C18622a mo64155a(TextType textType) {
            this.f46132b = textType;
            return this;
        }

        /* renamed from: a */
        public C18622a mo64156a(String str) {
            this.f46131a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "TextElementData");
        StringBuilder sb = new StringBuilder();
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", text_type=");
        sb.append(this.text_type);
        StringBuilder replace = sb.replace(0, 2, "TextElementData{");
        replace.append('}');
        return replace.toString();
    }

    public TextElementData(String str, TextType textType) {
        this(str, textType, ByteString.EMPTY);
    }

    public TextElementData(String str, TextType textType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.text_type = textType;
    }
}
