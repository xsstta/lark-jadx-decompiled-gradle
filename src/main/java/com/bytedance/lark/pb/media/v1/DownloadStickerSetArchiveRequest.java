package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DownloadStickerSetArchiveRequest extends Message<DownloadStickerSetArchiveRequest, C18216a> {
    public static final ProtoAdapter<DownloadStickerSetArchiveRequest> ADAPTER = new C18217b();
    public static final Boolean DEFAULT_SHOULD_DELETE = true;
    private static final long serialVersionUID = 0;
    public final String key;
    public final String path;
    public final Boolean should_delete;
    public final String unzip_path;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadStickerSetArchiveRequest$b */
    private static final class C18217b extends ProtoAdapter<DownloadStickerSetArchiveRequest> {
        C18217b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadStickerSetArchiveRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadStickerSetArchiveRequest downloadStickerSetArchiveRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadStickerSetArchiveRequest.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, downloadStickerSetArchiveRequest.path) + ProtoAdapter.STRING.encodedSizeWithTag(3, downloadStickerSetArchiveRequest.url);
            int i2 = 0;
            if (downloadStickerSetArchiveRequest.unzip_path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, downloadStickerSetArchiveRequest.unzip_path);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (downloadStickerSetArchiveRequest.should_delete != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, downloadStickerSetArchiveRequest.should_delete);
            }
            return i3 + i2 + downloadStickerSetArchiveRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadStickerSetArchiveRequest decode(ProtoReader protoReader) throws IOException {
            C18216a aVar = new C18216a();
            aVar.f45449a = "";
            aVar.f45450b = "";
            aVar.f45451c = "";
            aVar.f45452d = "";
            aVar.f45453e = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45449a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45450b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45451c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45452d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45453e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadStickerSetArchiveRequest downloadStickerSetArchiveRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadStickerSetArchiveRequest.key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, downloadStickerSetArchiveRequest.path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, downloadStickerSetArchiveRequest.url);
            if (downloadStickerSetArchiveRequest.unzip_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, downloadStickerSetArchiveRequest.unzip_path);
            }
            if (downloadStickerSetArchiveRequest.should_delete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, downloadStickerSetArchiveRequest.should_delete);
            }
            protoWriter.writeBytes(downloadStickerSetArchiveRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadStickerSetArchiveRequest$a */
    public static final class C18216a extends Message.Builder<DownloadStickerSetArchiveRequest, C18216a> {

        /* renamed from: a */
        public String f45449a;

        /* renamed from: b */
        public String f45450b;

        /* renamed from: c */
        public String f45451c;

        /* renamed from: d */
        public String f45452d;

        /* renamed from: e */
        public Boolean f45453e;

        /* renamed from: a */
        public DownloadStickerSetArchiveRequest build() {
            String str;
            String str2;
            String str3 = this.f45449a;
            if (str3 != null && (str = this.f45450b) != null && (str2 = this.f45451c) != null) {
                return new DownloadStickerSetArchiveRequest(str3, str, str2, this.f45452d, this.f45453e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "key", this.f45450b, "path", this.f45451c, "url");
        }

        /* renamed from: a */
        public C18216a mo63145a(String str) {
            this.f45449a = str;
            return this;
        }

        /* renamed from: b */
        public C18216a mo63147b(String str) {
            this.f45450b = str;
            return this;
        }

        /* renamed from: c */
        public C18216a mo63148c(String str) {
            this.f45451c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18216a newBuilder() {
        C18216a aVar = new C18216a();
        aVar.f45449a = this.key;
        aVar.f45450b = this.path;
        aVar.f45451c = this.url;
        aVar.f45452d = this.unzip_path;
        aVar.f45453e = this.should_delete;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DownloadStickerSetArchiveRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", url=");
        sb.append(this.url);
        if (this.unzip_path != null) {
            sb.append(", unzip_path=");
            sb.append(this.unzip_path);
        }
        if (this.should_delete != null) {
            sb.append(", should_delete=");
            sb.append(this.should_delete);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadStickerSetArchiveRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadStickerSetArchiveRequest(String str, String str2, String str3, String str4, Boolean bool) {
        this(str, str2, str3, str4, bool, ByteString.EMPTY);
    }

    public DownloadStickerSetArchiveRequest(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.path = str2;
        this.url = str3;
        this.unzip_path = str4;
        this.should_delete = bool;
    }
}
