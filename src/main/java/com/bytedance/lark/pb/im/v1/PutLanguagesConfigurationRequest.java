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

public final class PutLanguagesConfigurationRequest extends Message<PutLanguagesConfigurationRequest, C17975a> {
    public static final ProtoAdapter<PutLanguagesConfigurationRequest> ADAPTER = new C17976b();
    private static final long serialVersionUID = 0;
    public final LanguagesConfiguration global_conf;
    public final Map<String, LanguagesConfiguration> languages_conf;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutLanguagesConfigurationRequest$a */
    public static final class C17975a extends Message.Builder<PutLanguagesConfigurationRequest, C17975a> {

        /* renamed from: a */
        public Map<String, LanguagesConfiguration> f45072a = Internal.newMutableMap();

        /* renamed from: b */
        public LanguagesConfiguration f45073b;

        /* renamed from: a */
        public PutLanguagesConfigurationRequest build() {
            return new PutLanguagesConfigurationRequest(this.f45072a, this.f45073b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17975a mo62471a(LanguagesConfiguration languagesConfiguration) {
            this.f45073b = languagesConfiguration;
            return this;
        }

        /* renamed from: a */
        public C17975a mo62472a(Map<String, LanguagesConfiguration> map) {
            Internal.checkElementsNotNull(map);
            this.f45072a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutLanguagesConfigurationRequest$b */
    private static final class C17976b extends ProtoAdapter<PutLanguagesConfigurationRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, LanguagesConfiguration>> f45074a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LanguagesConfiguration.ADAPTER);

        C17976b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutLanguagesConfigurationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutLanguagesConfigurationRequest putLanguagesConfigurationRequest) {
            int i;
            int encodedSizeWithTag = this.f45074a.encodedSizeWithTag(1, putLanguagesConfigurationRequest.languages_conf);
            if (putLanguagesConfigurationRequest.global_conf != null) {
                i = LanguagesConfiguration.ADAPTER.encodedSizeWithTag(2, putLanguagesConfigurationRequest.global_conf);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + putLanguagesConfigurationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutLanguagesConfigurationRequest decode(ProtoReader protoReader) throws IOException {
            C17975a aVar = new C17975a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45072a.putAll(this.f45074a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45073b = LanguagesConfiguration.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutLanguagesConfigurationRequest putLanguagesConfigurationRequest) throws IOException {
            this.f45074a.encodeWithTag(protoWriter, 1, putLanguagesConfigurationRequest.languages_conf);
            if (putLanguagesConfigurationRequest.global_conf != null) {
                LanguagesConfiguration.ADAPTER.encodeWithTag(protoWriter, 2, putLanguagesConfigurationRequest.global_conf);
            }
            protoWriter.writeBytes(putLanguagesConfigurationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17975a newBuilder() {
        C17975a aVar = new C17975a();
        aVar.f45072a = Internal.copyOf("languages_conf", this.languages_conf);
        aVar.f45073b = this.global_conf;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutLanguagesConfigurationRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.languages_conf.isEmpty()) {
            sb.append(", languages_conf=");
            sb.append(this.languages_conf);
        }
        if (this.global_conf != null) {
            sb.append(", global_conf=");
            sb.append(this.global_conf);
        }
        StringBuilder replace = sb.replace(0, 2, "PutLanguagesConfigurationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutLanguagesConfigurationRequest(Map<String, LanguagesConfiguration> map, LanguagesConfiguration languagesConfiguration) {
        this(map, languagesConfiguration, ByteString.EMPTY);
    }

    public PutLanguagesConfigurationRequest(Map<String, LanguagesConfiguration> map, LanguagesConfiguration languagesConfiguration, ByteString byteString) {
        super(ADAPTER, byteString);
        this.languages_conf = Internal.immutableCopyOf("languages_conf", map);
        this.global_conf = languagesConfiguration;
    }
}
