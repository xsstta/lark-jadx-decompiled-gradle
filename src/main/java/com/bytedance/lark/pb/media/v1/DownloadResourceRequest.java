package com.bytedance.lark.pb.media.v1;

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

public final class DownloadResourceRequest extends Message<DownloadResourceRequest, C18212a> {
    public static final ProtoAdapter<DownloadResourceRequest> ADAPTER = new C18213b();
    public static final Boolean DEFAULT_NEED_PROGRESS = true;
    public static final Boolean DEFAULT_SHOULD_ADD_SECURITY_PROPERTY = true;
    public static final Boolean DEFAULT_SHOULD_LIMIT_SPEED = false;
    private static final long serialVersionUID = 0;
    public final Map<String, String> headers;
    public final String key;
    public final Boolean need_progress;
    public final String path;
    public final Boolean should_add_security_property;
    public final Boolean should_limit_speed;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadResourceRequest$b */
    private static final class C18213b extends ProtoAdapter<DownloadResourceRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45448a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18213b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadResourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadResourceRequest downloadResourceRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadResourceRequest.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, downloadResourceRequest.path) + ProtoAdapter.STRING.encodedSizeWithTag(3, downloadResourceRequest.url) + this.f45448a.encodedSizeWithTag(4, downloadResourceRequest.headers);
            int i3 = 0;
            if (downloadResourceRequest.need_progress != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, downloadResourceRequest.need_progress);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (downloadResourceRequest.should_limit_speed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(6, downloadResourceRequest.should_limit_speed);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (downloadResourceRequest.should_add_security_property != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(7, downloadResourceRequest.should_add_security_property);
            }
            return i5 + i3 + downloadResourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadResourceRequest decode(ProtoReader protoReader) throws IOException {
            C18212a aVar = new C18212a();
            aVar.f45441a = "";
            aVar.f45442b = "";
            aVar.f45443c = "";
            aVar.f45445e = true;
            aVar.f45446f = false;
            aVar.f45447g = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45441a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45442b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45443c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45444d.putAll(this.f45448a.decode(protoReader));
                            break;
                        case 5:
                            aVar.f45445e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45446f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45447g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DownloadResourceRequest downloadResourceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadResourceRequest.key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, downloadResourceRequest.path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, downloadResourceRequest.url);
            this.f45448a.encodeWithTag(protoWriter, 4, downloadResourceRequest.headers);
            if (downloadResourceRequest.need_progress != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, downloadResourceRequest.need_progress);
            }
            if (downloadResourceRequest.should_limit_speed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, downloadResourceRequest.should_limit_speed);
            }
            if (downloadResourceRequest.should_add_security_property != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, downloadResourceRequest.should_add_security_property);
            }
            protoWriter.writeBytes(downloadResourceRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18212a newBuilder() {
        C18212a aVar = new C18212a();
        aVar.f45441a = this.key;
        aVar.f45442b = this.path;
        aVar.f45443c = this.url;
        aVar.f45444d = Internal.copyOf("headers", this.headers);
        aVar.f45445e = this.need_progress;
        aVar.f45446f = this.should_limit_speed;
        aVar.f45447g = this.should_add_security_property;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadResourceRequest$a */
    public static final class C18212a extends Message.Builder<DownloadResourceRequest, C18212a> {

        /* renamed from: a */
        public String f45441a;

        /* renamed from: b */
        public String f45442b;

        /* renamed from: c */
        public String f45443c;

        /* renamed from: d */
        public Map<String, String> f45444d = Internal.newMutableMap();

        /* renamed from: e */
        public Boolean f45445e;

        /* renamed from: f */
        public Boolean f45446f;

        /* renamed from: g */
        public Boolean f45447g;

        /* renamed from: a */
        public DownloadResourceRequest build() {
            String str;
            String str2;
            String str3 = this.f45441a;
            if (str3 != null && (str = this.f45442b) != null && (str2 = this.f45443c) != null) {
                return new DownloadResourceRequest(str3, str, str2, this.f45444d, this.f45445e, this.f45446f, this.f45447g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "key", this.f45442b, "path", this.f45443c, "url");
        }

        /* renamed from: a */
        public C18212a mo63134a(String str) {
            this.f45441a = str;
            return this;
        }

        /* renamed from: b */
        public C18212a mo63136b(String str) {
            this.f45442b = str;
            return this;
        }

        /* renamed from: c */
        public C18212a mo63137c(String str) {
            this.f45443c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DownloadResourceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", url=");
        sb.append(this.url);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.need_progress != null) {
            sb.append(", need_progress=");
            sb.append(this.need_progress);
        }
        if (this.should_limit_speed != null) {
            sb.append(", should_limit_speed=");
            sb.append(this.should_limit_speed);
        }
        if (this.should_add_security_property != null) {
            sb.append(", should_add_security_property=");
            sb.append(this.should_add_security_property);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadResourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadResourceRequest(String str, String str2, String str3, Map<String, String> map, Boolean bool, Boolean bool2, Boolean bool3) {
        this(str, str2, str3, map, bool, bool2, bool3, ByteString.EMPTY);
    }

    public DownloadResourceRequest(String str, String str2, String str3, Map<String, String> map, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.path = str2;
        this.url = str3;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.need_progress = bool;
        this.should_limit_speed = bool2;
        this.should_add_security_property = bool3;
    }
}
