package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class LanguagesConfiguration extends Message<LanguagesConfiguration, C17797a> {
    public static final ProtoAdapter<LanguagesConfiguration> ADAPTER = new C17798b();
    public static final DisplayRule DEFAULT_RULE = DisplayRule.ONLY_TRANSLATION;
    private static final long serialVersionUID = 0;
    public final DisplayRule rule;

    /* renamed from: com.bytedance.lark.pb.im.v1.LanguagesConfiguration$b */
    private static final class C17798b extends ProtoAdapter<LanguagesConfiguration> {
        C17798b() {
            super(FieldEncoding.LENGTH_DELIMITED, LanguagesConfiguration.class);
        }

        /* renamed from: a */
        public int encodedSize(LanguagesConfiguration languagesConfiguration) {
            return DisplayRule.ADAPTER.encodedSizeWithTag(1, languagesConfiguration.rule) + languagesConfiguration.unknownFields().size();
        }

        /* renamed from: a */
        public LanguagesConfiguration decode(ProtoReader protoReader) throws IOException {
            C17797a aVar = new C17797a();
            aVar.f44840a = DisplayRule.ONLY_TRANSLATION;
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
                        aVar.f44840a = DisplayRule.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LanguagesConfiguration languagesConfiguration) throws IOException {
            DisplayRule.ADAPTER.encodeWithTag(protoWriter, 1, languagesConfiguration.rule);
            protoWriter.writeBytes(languagesConfiguration.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.LanguagesConfiguration$a */
    public static final class C17797a extends Message.Builder<LanguagesConfiguration, C17797a> {

        /* renamed from: a */
        public DisplayRule f44840a;

        /* renamed from: a */
        public LanguagesConfiguration build() {
            DisplayRule displayRule = this.f44840a;
            if (displayRule != null) {
                return new LanguagesConfiguration(displayRule, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(displayRule, "rule");
        }

        /* renamed from: a */
        public C17797a mo62054a(DisplayRule displayRule) {
            this.f44840a = displayRule;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17797a newBuilder() {
        C17797a aVar = new C17797a();
        aVar.f44840a = this.rule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "LanguagesConfiguration");
        StringBuilder sb = new StringBuilder();
        sb.append(", rule=");
        sb.append(this.rule);
        StringBuilder replace = sb.replace(0, 2, "LanguagesConfiguration{");
        replace.append('}');
        return replace.toString();
    }

    public LanguagesConfiguration(DisplayRule displayRule) {
        this(displayRule, ByteString.EMPTY);
    }

    public LanguagesConfiguration(DisplayRule displayRule, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rule = displayRule;
    }
}
