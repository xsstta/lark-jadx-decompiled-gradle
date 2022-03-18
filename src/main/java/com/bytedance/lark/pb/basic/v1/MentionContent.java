package com.bytedance.lark.pb.basic.v1;

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

public final class MentionContent extends Message<MentionContent, C15053a> {
    public static final ProtoAdapter<MentionContent> ADAPTER = new C15054b();
    private static final long serialVersionUID = 0;
    public final String default_content;
    public final Map<String, String> i18n_content;
    public final MentionContentStyle style;

    /* renamed from: com.bytedance.lark.pb.basic.v1.MentionContent$b */
    private static final class C15054b extends ProtoAdapter<MentionContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39823a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15054b() {
            super(FieldEncoding.LENGTH_DELIMITED, MentionContent.class);
        }

        /* renamed from: a */
        public int encodedSize(MentionContent mentionContent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mentionContent.default_content) + this.f39823a.encodedSizeWithTag(2, mentionContent.i18n_content) + MentionContentStyle.ADAPTER.encodedSizeWithTag(3, mentionContent.style) + mentionContent.unknownFields().size();
        }

        /* renamed from: a */
        public MentionContent decode(ProtoReader protoReader) throws IOException {
            C15053a aVar = new C15053a();
            aVar.f39820a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39820a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39821b.putAll(this.f39823a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39822c = MentionContentStyle.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MentionContent mentionContent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mentionContent.default_content);
            this.f39823a.encodeWithTag(protoWriter, 2, mentionContent.i18n_content);
            MentionContentStyle.ADAPTER.encodeWithTag(protoWriter, 3, mentionContent.style);
            protoWriter.writeBytes(mentionContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15053a newBuilder() {
        C15053a aVar = new C15053a();
        aVar.f39820a = this.default_content;
        aVar.f39821b = Internal.copyOf("i18n_content", this.i18n_content);
        aVar.f39822c = this.style;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MentionContent$a */
    public static final class C15053a extends Message.Builder<MentionContent, C15053a> {

        /* renamed from: a */
        public String f39820a;

        /* renamed from: b */
        public Map<String, String> f39821b = Internal.newMutableMap();

        /* renamed from: c */
        public MentionContentStyle f39822c;

        /* renamed from: a */
        public MentionContent build() {
            MentionContentStyle mentionContentStyle;
            String str = this.f39820a;
            if (str != null && (mentionContentStyle = this.f39822c) != null) {
                return new MentionContent(str, this.f39821b, mentionContentStyle, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "default_content", this.f39822c, "style");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MentionContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", default_content=");
        sb.append(this.default_content);
        if (!this.i18n_content.isEmpty()) {
            sb.append(", i18n_content=");
            sb.append(this.i18n_content);
        }
        sb.append(", style=");
        sb.append(this.style);
        StringBuilder replace = sb.replace(0, 2, "MentionContent{");
        replace.append('}');
        return replace.toString();
    }

    public MentionContent(String str, Map<String, String> map, MentionContentStyle mentionContentStyle) {
        this(str, map, mentionContentStyle, ByteString.EMPTY);
    }

    public MentionContent(String str, Map<String, String> map, MentionContentStyle mentionContentStyle, ByteString byteString) {
        super(ADAPTER, byteString);
        this.default_content = str;
        this.i18n_content = Internal.immutableCopyOf("i18n_content", map);
        this.style = mentionContentStyle;
    }
}
