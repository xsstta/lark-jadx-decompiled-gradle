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

public final class KaInitConfig extends Message<KaInitConfig, C15033a> {
    public static final ProtoAdapter<KaInitConfig> ADAPTER = new C15034b();
    public static final ByteString DEFAULT_CONFIG_BYTES = ByteString.EMPTY;
    public static final Boolean DEFAULT_IS_CUSTOMIZED_KA = false;
    private static final long serialVersionUID = 0;
    public final String channel;
    public final ByteString config_bytes;
    public final Boolean is_customized_ka;
    public final String ka_init_config_path;

    /* renamed from: com.bytedance.lark.pb.basic.v1.KaInitConfig$b */
    private static final class C15034b extends ProtoAdapter<KaInitConfig> {
        C15034b() {
            super(FieldEncoding.LENGTH_DELIMITED, KaInitConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(KaInitConfig kaInitConfig) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, kaInitConfig.channel);
            int i3 = 0;
            if (kaInitConfig.ka_init_config_path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, kaInitConfig.ka_init_config_path);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (kaInitConfig.is_customized_ka != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, kaInitConfig.is_customized_ka);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (kaInitConfig.config_bytes != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(4, kaInitConfig.config_bytes);
            }
            return i5 + i3 + kaInitConfig.unknownFields().size();
        }

        /* renamed from: a */
        public KaInitConfig decode(ProtoReader protoReader) throws IOException {
            C15033a aVar = new C15033a();
            aVar.f39772a = "";
            aVar.f39773b = "";
            aVar.f39774c = false;
            aVar.f39775d = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39772a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39773b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f39774c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39775d = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, KaInitConfig kaInitConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, kaInitConfig.channel);
            if (kaInitConfig.ka_init_config_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, kaInitConfig.ka_init_config_path);
            }
            if (kaInitConfig.is_customized_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, kaInitConfig.is_customized_ka);
            }
            if (kaInitConfig.config_bytes != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, kaInitConfig.config_bytes);
            }
            protoWriter.writeBytes(kaInitConfig.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15033a newBuilder() {
        C15033a aVar = new C15033a();
        aVar.f39772a = this.channel;
        aVar.f39773b = this.ka_init_config_path;
        aVar.f39774c = this.is_customized_ka;
        aVar.f39775d = this.config_bytes;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.KaInitConfig$a */
    public static final class C15033a extends Message.Builder<KaInitConfig, C15033a> {

        /* renamed from: a */
        public String f39772a;

        /* renamed from: b */
        public String f39773b;

        /* renamed from: c */
        public Boolean f39774c;

        /* renamed from: d */
        public ByteString f39775d;

        /* renamed from: a */
        public KaInitConfig build() {
            String str = this.f39772a;
            if (str != null) {
                return new KaInitConfig(str, this.f39773b, this.f39774c, this.f39775d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "channel");
        }

        /* renamed from: a */
        public C15033a mo54933a(Boolean bool) {
            this.f39774c = bool;
            return this;
        }

        /* renamed from: b */
        public C15033a mo54936b(String str) {
            this.f39773b = str;
            return this;
        }

        /* renamed from: a */
        public C15033a mo54934a(String str) {
            this.f39772a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "KaInitConfig");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.ka_init_config_path != null) {
            sb.append(", ka_init_config_path=");
            sb.append(this.ka_init_config_path);
        }
        if (this.is_customized_ka != null) {
            sb.append(", is_customized_ka=");
            sb.append(this.is_customized_ka);
        }
        if (this.config_bytes != null) {
            sb.append(", config_bytes=");
            sb.append(this.config_bytes);
        }
        StringBuilder replace = sb.replace(0, 2, "KaInitConfig{");
        replace.append('}');
        return replace.toString();
    }

    public KaInitConfig(String str, String str2, Boolean bool, ByteString byteString) {
        this(str, str2, bool, byteString, ByteString.EMPTY);
    }

    public KaInitConfig(String str, String str2, Boolean bool, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.channel = str;
        this.ka_init_config_path = str2;
        this.is_customized_ka = bool;
        this.config_bytes = byteString;
    }
}
