package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TextMessageContent extends Message<TextMessageContent, C51114a> {
    public static final ProtoAdapter<TextMessageContent> ADAPTER = new C51115b();
    private static final long serialVersionUID = 0;
    public final RichText content;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TextMessageContent$b */
    private static final class C51115b extends ProtoAdapter<TextMessageContent> {
        C51115b() {
            super(FieldEncoding.LENGTH_DELIMITED, TextMessageContent.class);
        }

        /* renamed from: a */
        public int encodedSize(TextMessageContent textMessageContent) {
            int i;
            if (textMessageContent.content != null) {
                i = RichText.ADAPTER.encodedSizeWithTag(1, textMessageContent.content);
            } else {
                i = 0;
            }
            return i + textMessageContent.unknownFields().size();
        }

        /* renamed from: a */
        public TextMessageContent decode(ProtoReader protoReader) throws IOException {
            C51114a aVar = new C51114a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127228a = RichText.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TextMessageContent textMessageContent) throws IOException {
            if (textMessageContent.content != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 1, textMessageContent.content);
            }
            protoWriter.writeBytes(textMessageContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TextMessageContent$a */
    public static final class C51114a extends Message.Builder<TextMessageContent, C51114a> {

        /* renamed from: a */
        public RichText f127228a;

        /* renamed from: a */
        public TextMessageContent build() {
            return new TextMessageContent(this.f127228a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51114a mo176387a(RichText richText) {
            this.f127228a = richText;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51114a newBuilder() {
        C51114a aVar = new C51114a();
        aVar.f127228a = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "TextMessageContent");
        StringBuilder sb = new StringBuilder();
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "TextMessageContent{");
        replace.append('}');
        return replace.toString();
    }

    public TextMessageContent(RichText richText) {
        this(richText, ByteString.EMPTY);
    }

    public TextMessageContent(RichText richText, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = richText;
    }
}
