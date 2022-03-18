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

public final class PutLanguagesConfigurationV2Request extends Message<PutLanguagesConfigurationV2Request, C17977a> {
    public static final ProtoAdapter<PutLanguagesConfigurationV2Request> ADAPTER = new C17978b();
    private static final long serialVersionUID = 0;
    public final Map<String, LanguagesConfiguration> src_languages_conf;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutLanguagesConfigurationV2Request$a */
    public static final class C17977a extends Message.Builder<PutLanguagesConfigurationV2Request, C17977a> {

        /* renamed from: a */
        public Map<String, LanguagesConfiguration> f45075a = Internal.newMutableMap();

        /* renamed from: a */
        public PutLanguagesConfigurationV2Request build() {
            return new PutLanguagesConfigurationV2Request(this.f45075a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17977a mo62477a(Map<String, LanguagesConfiguration> map) {
            Internal.checkElementsNotNull(map);
            this.f45075a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutLanguagesConfigurationV2Request$b */
    private static final class C17978b extends ProtoAdapter<PutLanguagesConfigurationV2Request> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, LanguagesConfiguration>> f45076a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LanguagesConfiguration.ADAPTER);

        C17978b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutLanguagesConfigurationV2Request.class);
        }

        /* renamed from: a */
        public int encodedSize(PutLanguagesConfigurationV2Request putLanguagesConfigurationV2Request) {
            return this.f45076a.encodedSizeWithTag(1, putLanguagesConfigurationV2Request.src_languages_conf) + putLanguagesConfigurationV2Request.unknownFields().size();
        }

        /* renamed from: a */
        public PutLanguagesConfigurationV2Request decode(ProtoReader protoReader) throws IOException {
            C17977a aVar = new C17977a();
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
                    aVar.f45075a.putAll(this.f45076a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutLanguagesConfigurationV2Request putLanguagesConfigurationV2Request) throws IOException {
            this.f45076a.encodeWithTag(protoWriter, 1, putLanguagesConfigurationV2Request.src_languages_conf);
            protoWriter.writeBytes(putLanguagesConfigurationV2Request.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17977a newBuilder() {
        C17977a aVar = new C17977a();
        aVar.f45075a = Internal.copyOf("src_languages_conf", this.src_languages_conf);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutLanguagesConfigurationV2Request");
        StringBuilder sb = new StringBuilder();
        if (!this.src_languages_conf.isEmpty()) {
            sb.append(", src_languages_conf=");
            sb.append(this.src_languages_conf);
        }
        StringBuilder replace = sb.replace(0, 2, "PutLanguagesConfigurationV2Request{");
        replace.append('}');
        return replace.toString();
    }

    public PutLanguagesConfigurationV2Request(Map<String, LanguagesConfiguration> map) {
        this(map, ByteString.EMPTY);
    }

    public PutLanguagesConfigurationV2Request(Map<String, LanguagesConfiguration> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.src_languages_conf = Internal.immutableCopyOf("src_languages_conf", map);
    }
}
