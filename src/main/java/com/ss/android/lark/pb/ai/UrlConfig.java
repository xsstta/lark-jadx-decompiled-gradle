package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UrlConfig extends Message<UrlConfig, C49529a> {
    public static final ProtoAdapter<UrlConfig> ADAPTER = new C49530b();
    private static final long serialVersionUID = 0;
    public final String medit_url;
    public final String mhome_url;

    /* renamed from: com.ss.android.lark.pb.ai.UrlConfig$b */
    private static final class C49530b extends ProtoAdapter<UrlConfig> {
        C49530b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlConfig urlConfig) {
            int i;
            int i2 = 0;
            if (urlConfig.mhome_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, urlConfig.mhome_url);
            } else {
                i = 0;
            }
            if (urlConfig.medit_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, urlConfig.medit_url);
            }
            return i + i2 + urlConfig.unknownFields().size();
        }

        /* renamed from: a */
        public UrlConfig decode(ProtoReader protoReader) throws IOException {
            C49529a aVar = new C49529a();
            aVar.f124126a = "";
            aVar.f124127b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124126a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124127b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrlConfig urlConfig) throws IOException {
            if (urlConfig.mhome_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlConfig.mhome_url);
            }
            if (urlConfig.medit_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, urlConfig.medit_url);
            }
            protoWriter.writeBytes(urlConfig.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.UrlConfig$a */
    public static final class C49529a extends Message.Builder<UrlConfig, C49529a> {

        /* renamed from: a */
        public String f124126a;

        /* renamed from: b */
        public String f124127b;

        /* renamed from: a */
        public UrlConfig build() {
            return new UrlConfig(this.f124126a, this.f124127b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49529a newBuilder() {
        C49529a aVar = new C49529a();
        aVar.f124126a = this.mhome_url;
        aVar.f124127b = this.medit_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mhome_url != null) {
            sb.append(", home_url=");
            sb.append(this.mhome_url);
        }
        if (this.medit_url != null) {
            sb.append(", edit_url=");
            sb.append(this.medit_url);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlConfig{");
        replace.append('}');
        return replace.toString();
    }

    public UrlConfig(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public UrlConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mhome_url = str;
        this.medit_url = str2;
    }
}
