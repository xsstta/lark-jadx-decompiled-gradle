package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TranslateMessageDisplayRule extends Message<TranslateMessageDisplayRule, C15354a> {
    public static final ProtoAdapter<TranslateMessageDisplayRule> ADAPTER = new C15355b();
    public static final DisplayRule DEFAULT_RULE = DisplayRule.UNKNOWN_RULE;
    private static final long serialVersionUID = 0;
    public final DisplayRule rule;

    /* renamed from: com.bytedance.lark.pb.basic.v1.TranslateMessageDisplayRule$b */
    private static final class C15355b extends ProtoAdapter<TranslateMessageDisplayRule> {
        C15355b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateMessageDisplayRule.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateMessageDisplayRule translateMessageDisplayRule) {
            return DisplayRule.ADAPTER.encodedSizeWithTag(1, translateMessageDisplayRule.rule) + translateMessageDisplayRule.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateMessageDisplayRule decode(ProtoReader protoReader) throws IOException {
            C15354a aVar = new C15354a();
            aVar.f40668a = DisplayRule.UNKNOWN_RULE;
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
                        aVar.f40668a = DisplayRule.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateMessageDisplayRule translateMessageDisplayRule) throws IOException {
            DisplayRule.ADAPTER.encodeWithTag(protoWriter, 1, translateMessageDisplayRule.rule);
            protoWriter.writeBytes(translateMessageDisplayRule.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TranslateMessageDisplayRule$a */
    public static final class C15354a extends Message.Builder<TranslateMessageDisplayRule, C15354a> {

        /* renamed from: a */
        public DisplayRule f40668a;

        /* renamed from: a */
        public TranslateMessageDisplayRule build() {
            DisplayRule displayRule = this.f40668a;
            if (displayRule != null) {
                return new TranslateMessageDisplayRule(displayRule, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(displayRule, "rule");
        }
    }

    @Override // com.squareup.wire.Message
    public C15354a newBuilder() {
        C15354a aVar = new C15354a();
        aVar.f40668a = this.rule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TranslateMessageDisplayRule");
        StringBuilder sb = new StringBuilder();
        sb.append(", rule=");
        sb.append(this.rule);
        StringBuilder replace = sb.replace(0, 2, "TranslateMessageDisplayRule{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateMessageDisplayRule(DisplayRule displayRule) {
        this(displayRule, ByteString.EMPTY);
    }

    public TranslateMessageDisplayRule(DisplayRule displayRule, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rule = displayRule;
    }
}
