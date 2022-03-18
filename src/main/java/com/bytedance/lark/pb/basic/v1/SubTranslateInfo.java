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

public final class SubTranslateInfo extends Message<SubTranslateInfo, C15296a> {
    public static final ProtoAdapter<SubTranslateInfo> ADAPTER = new C15297b();
    private static final long serialVersionUID = 0;
    public final Map<String, TranslateInfo> sub_translate_messages;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SubTranslateInfo$a */
    public static final class C15296a extends Message.Builder<SubTranslateInfo, C15296a> {

        /* renamed from: a */
        public Map<String, TranslateInfo> f40501a = Internal.newMutableMap();

        /* renamed from: a */
        public SubTranslateInfo build() {
            return new SubTranslateInfo(this.f40501a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SubTranslateInfo$b */
    private static final class C15297b extends ProtoAdapter<SubTranslateInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, TranslateInfo>> f40502a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TranslateInfo.ADAPTER);

        C15297b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubTranslateInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SubTranslateInfo subTranslateInfo) {
            return this.f40502a.encodedSizeWithTag(1, subTranslateInfo.sub_translate_messages) + subTranslateInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SubTranslateInfo decode(ProtoReader protoReader) throws IOException {
            C15296a aVar = new C15296a();
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
                    aVar.f40501a.putAll(this.f40502a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubTranslateInfo subTranslateInfo) throws IOException {
            this.f40502a.encodeWithTag(protoWriter, 1, subTranslateInfo.sub_translate_messages);
            protoWriter.writeBytes(subTranslateInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15296a newBuilder() {
        C15296a aVar = new C15296a();
        aVar.f40501a = Internal.copyOf("sub_translate_messages", this.sub_translate_messages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SubTranslateInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.sub_translate_messages.isEmpty()) {
            sb.append(", sub_translate_messages=");
            sb.append(this.sub_translate_messages);
        }
        StringBuilder replace = sb.replace(0, 2, "SubTranslateInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SubTranslateInfo(Map<String, TranslateInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public SubTranslateInfo(Map<String, TranslateInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sub_translate_messages = Internal.immutableCopyOf("sub_translate_messages", map);
    }
}
