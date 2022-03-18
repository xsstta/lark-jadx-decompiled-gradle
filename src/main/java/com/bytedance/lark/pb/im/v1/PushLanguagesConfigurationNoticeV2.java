package com.bytedance.lark.pb.im.v1;

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

public final class PushLanguagesConfigurationNoticeV2 extends Message<PushLanguagesConfigurationNoticeV2, C17905a> {
    public static final ProtoAdapter<PushLanguagesConfigurationNoticeV2> ADAPTER = new C17906b();
    private static final long serialVersionUID = 0;
    public final Map<String, LanguagesConfiguration> src_languages_conf;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLanguagesConfigurationNoticeV2$a */
    public static final class C17905a extends Message.Builder<PushLanguagesConfigurationNoticeV2, C17905a> {

        /* renamed from: a */
        public Map<String, LanguagesConfiguration> f44986a = Internal.newMutableMap();

        /* renamed from: a */
        public PushLanguagesConfigurationNoticeV2 build() {
            return new PushLanguagesConfigurationNoticeV2(this.f44986a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLanguagesConfigurationNoticeV2$b */
    private static final class C17906b extends ProtoAdapter<PushLanguagesConfigurationNoticeV2> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, LanguagesConfiguration>> f44987a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LanguagesConfiguration.ADAPTER);

        C17906b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushLanguagesConfigurationNoticeV2.class);
        }

        /* renamed from: a */
        public int encodedSize(PushLanguagesConfigurationNoticeV2 pushLanguagesConfigurationNoticeV2) {
            return this.f44987a.encodedSizeWithTag(1, pushLanguagesConfigurationNoticeV2.src_languages_conf) + pushLanguagesConfigurationNoticeV2.unknownFields().size();
        }

        /* renamed from: a */
        public PushLanguagesConfigurationNoticeV2 decode(ProtoReader protoReader) throws IOException {
            C17905a aVar = new C17905a();
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
                    aVar.f44986a.putAll(this.f44987a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushLanguagesConfigurationNoticeV2 pushLanguagesConfigurationNoticeV2) throws IOException {
            this.f44987a.encodeWithTag(protoWriter, 1, pushLanguagesConfigurationNoticeV2.src_languages_conf);
            protoWriter.writeBytes(pushLanguagesConfigurationNoticeV2.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17905a newBuilder() {
        C17905a aVar = new C17905a();
        aVar.f44986a = Internal.copyOf("src_languages_conf", this.src_languages_conf);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushLanguagesConfigurationNoticeV2");
        StringBuilder sb = new StringBuilder();
        if (!this.src_languages_conf.isEmpty()) {
            sb.append(", src_languages_conf=");
            sb.append(this.src_languages_conf);
        }
        StringBuilder replace = sb.replace(0, 2, "PushLanguagesConfigurationNoticeV2{");
        replace.append('}');
        return replace.toString();
    }

    public PushLanguagesConfigurationNoticeV2(Map<String, LanguagesConfiguration> map) {
        this(map, ByteString.EMPTY);
    }

    public PushLanguagesConfigurationNoticeV2(Map<String, LanguagesConfiguration> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.src_languages_conf = Internal.immutableCopyOf("src_languages_conf", map);
    }
}
