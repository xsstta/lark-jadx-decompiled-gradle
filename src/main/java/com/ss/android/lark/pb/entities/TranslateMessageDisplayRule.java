package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TranslateMessageDisplayRule extends Message<TranslateMessageDisplayRule, C49740a> {
    public static final ProtoAdapter<TranslateMessageDisplayRule> ADAPTER = new C49741b();
    private static final long serialVersionUID = 0;
    public final DisplayRule mrule;

    /* renamed from: com.ss.android.lark.pb.entities.TranslateMessageDisplayRule$b */
    private static final class C49741b extends ProtoAdapter<TranslateMessageDisplayRule> {
        C49741b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateMessageDisplayRule.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateMessageDisplayRule translateMessageDisplayRule) {
            return DisplayRule.ADAPTER.encodedSizeWithTag(1, translateMessageDisplayRule.mrule) + translateMessageDisplayRule.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateMessageDisplayRule decode(ProtoReader protoReader) throws IOException {
            C49740a aVar = new C49740a();
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
                    try {
                        aVar.f124575a = DisplayRule.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateMessageDisplayRule translateMessageDisplayRule) throws IOException {
            DisplayRule.ADAPTER.encodeWithTag(protoWriter, 1, translateMessageDisplayRule.mrule);
            protoWriter.writeBytes(translateMessageDisplayRule.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.TranslateMessageDisplayRule$a */
    public static final class C49740a extends Message.Builder<TranslateMessageDisplayRule, C49740a> {

        /* renamed from: a */
        public DisplayRule f124575a;

        /* renamed from: a */
        public TranslateMessageDisplayRule build() {
            DisplayRule displayRule = this.f124575a;
            if (displayRule != null) {
                return new TranslateMessageDisplayRule(displayRule, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(displayRule, "mrule");
        }
    }

    @Override // com.squareup.wire.Message
    public C49740a newBuilder() {
        C49740a aVar = new C49740a();
        aVar.f124575a = this.mrule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rule=");
        sb.append(this.mrule);
        StringBuilder replace = sb.replace(0, 2, "TranslateMessageDisplayRule{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateMessageDisplayRule(DisplayRule displayRule) {
        this(displayRule, ByteString.EMPTY);
    }

    public TranslateMessageDisplayRule(DisplayRule displayRule, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mrule = displayRule;
    }
}
