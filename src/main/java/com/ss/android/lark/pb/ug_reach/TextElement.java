package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TextElement extends Message<TextElement, C50146a> {
    public static final ProtoAdapter<TextElement> ADAPTER = new C50147b();
    private static final long serialVersionUID = 0;
    public final String mcontent;
    public final TextType mtype;

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

    /* renamed from: com.ss.android.lark.pb.ug_reach.TextElement$b */
    private static final class C50147b extends ProtoAdapter<TextElement> {
        C50147b() {
            super(FieldEncoding.LENGTH_DELIMITED, TextElement.class);
        }

        /* renamed from: a */
        public int encodedSize(TextElement textElement) {
            int i;
            int i2 = 0;
            if (textElement.mtype != null) {
                i = TextType.ADAPTER.encodedSizeWithTag(1, textElement.mtype);
            } else {
                i = 0;
            }
            if (textElement.mcontent != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, textElement.mcontent);
            }
            return i + i2 + textElement.unknownFields().size();
        }

        /* renamed from: a */
        public TextElement decode(ProtoReader protoReader) throws IOException {
            C50146a aVar = new C50146a();
            aVar.f125336b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f125335a = TextType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125336b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TextElement textElement) throws IOException {
            if (textElement.mtype != null) {
                TextType.ADAPTER.encodeWithTag(protoWriter, 1, textElement.mtype);
            }
            if (textElement.mcontent != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, textElement.mcontent);
            }
            protoWriter.writeBytes(textElement.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.TextElement$a */
    public static final class C50146a extends Message.Builder<TextElement, C50146a> {

        /* renamed from: a */
        public TextType f125335a;

        /* renamed from: b */
        public String f125336b;

        /* renamed from: a */
        public TextElement build() {
            return new TextElement(this.f125335a, this.f125336b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50146a newBuilder() {
        C50146a aVar = new C50146a();
        aVar.f125335a = this.mtype;
        aVar.f125336b = this.mcontent;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mcontent != null) {
            sb.append(", content=");
            sb.append(this.mcontent);
        }
        StringBuilder replace = sb.replace(0, 2, "TextElement{");
        replace.append('}');
        return replace.toString();
    }

    public TextElement(TextType textType, String str) {
        this(textType, str, ByteString.EMPTY);
    }

    public TextElement(TextType textType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = textType;
        this.mcontent = str;
    }
}
