package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class AbbreviationEntity extends Message<AbbreviationEntity, C14644a> {
    public static final ProtoAdapter<AbbreviationEntity> ADAPTER = new C14645b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final String full_name;
    public final String i18n_desc;
    public final String id;
    public final Map<String, String> metadata;
    public final String name;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.AbbreviationEntity$b */
    private static final class C14645b extends ProtoAdapter<AbbreviationEntity> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f38752a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C14645b() {
            super(FieldEncoding.LENGTH_DELIMITED, AbbreviationEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(AbbreviationEntity abbreviationEntity) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, abbreviationEntity.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, abbreviationEntity.name) + ProtoAdapter.INT32.encodedSizeWithTag(3, abbreviationEntity.version) + ProtoAdapter.STRING.encodedSizeWithTag(4, abbreviationEntity.full_name);
            if (abbreviationEntity.i18n_desc != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, abbreviationEntity.i18n_desc);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f38752a.encodedSizeWithTag(6, abbreviationEntity.metadata) + abbreviationEntity.unknownFields().size();
        }

        /* renamed from: a */
        public AbbreviationEntity decode(ProtoReader protoReader) throws IOException {
            C14644a aVar = new C14644a();
            aVar.f38746a = "";
            aVar.f38747b = "";
            aVar.f38748c = 0;
            aVar.f38749d = "";
            aVar.f38750e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38746a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38747b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38748c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38749d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38750e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38751f.putAll(this.f38752a.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AbbreviationEntity abbreviationEntity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, abbreviationEntity.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, abbreviationEntity.name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, abbreviationEntity.version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, abbreviationEntity.full_name);
            if (abbreviationEntity.i18n_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, abbreviationEntity.i18n_desc);
            }
            this.f38752a.encodeWithTag(protoWriter, 6, abbreviationEntity.metadata);
            protoWriter.writeBytes(abbreviationEntity.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14644a newBuilder() {
        C14644a aVar = new C14644a();
        aVar.f38746a = this.id;
        aVar.f38747b = this.name;
        aVar.f38748c = this.version;
        aVar.f38749d = this.full_name;
        aVar.f38750e = this.i18n_desc;
        aVar.f38751f = Internal.copyOf("metadata", this.metadata);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AbbreviationEntity$a */
    public static final class C14644a extends Message.Builder<AbbreviationEntity, C14644a> {

        /* renamed from: a */
        public String f38746a;

        /* renamed from: b */
        public String f38747b;

        /* renamed from: c */
        public Integer f38748c;

        /* renamed from: d */
        public String f38749d;

        /* renamed from: e */
        public String f38750e;

        /* renamed from: f */
        public Map<String, String> f38751f = Internal.newMutableMap();

        /* renamed from: a */
        public AbbreviationEntity build() {
            String str;
            Integer num;
            String str2;
            String str3 = this.f38746a;
            if (str3 != null && (str = this.f38747b) != null && (num = this.f38748c) != null && (str2 = this.f38749d) != null) {
                return new AbbreviationEntity(str3, str, num, str2, this.f38750e, this.f38751f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f38747b, "name", this.f38748c, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f38749d, "full_name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AbbreviationEntity");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", full_name=");
        sb.append(this.full_name);
        if (this.i18n_desc != null) {
            sb.append(", i18n_desc=");
            sb.append(this.i18n_desc);
        }
        if (!this.metadata.isEmpty()) {
            sb.append(", metadata=");
            sb.append(this.metadata);
        }
        StringBuilder replace = sb.replace(0, 2, "AbbreviationEntity{");
        replace.append('}');
        return replace.toString();
    }

    public AbbreviationEntity(String str, String str2, Integer num, String str3, String str4, Map<String, String> map) {
        this(str, str2, num, str3, str4, map, ByteString.EMPTY);
    }

    public AbbreviationEntity(String str, String str2, Integer num, String str3, String str4, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.version = num;
        this.full_name = str3;
        this.i18n_desc = str4;
        this.metadata = Internal.immutableCopyOf("metadata", map);
    }
}
