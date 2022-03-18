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
import okio.ByteString;

public final class VersionData extends Message<VersionData, C15434a> {
    public static final ProtoAdapter<VersionData> ADAPTER = new C15435b();
    private static final long serialVersionUID = 0;
    public final String download_md5;
    public final String download_url;
    public final String release_notes;
    public final String release_time;
    public final String version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.VersionData$b */
    private static final class C15435b extends ProtoAdapter<VersionData> {
        C15435b() {
            super(FieldEncoding.LENGTH_DELIMITED, VersionData.class);
        }

        /* renamed from: a */
        public int encodedSize(VersionData versionData) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, versionData.version) + ProtoAdapter.STRING.encodedSizeWithTag(2, versionData.download_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, versionData.release_notes) + ProtoAdapter.STRING.encodedSizeWithTag(4, versionData.release_time);
            if (versionData.download_md5 != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, versionData.download_md5);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + versionData.unknownFields().size();
        }

        /* renamed from: a */
        public VersionData decode(ProtoReader protoReader) throws IOException {
            C15434a aVar = new C15434a();
            aVar.f40852a = "";
            aVar.f40853b = "";
            aVar.f40854c = "";
            aVar.f40855d = "";
            aVar.f40856e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40852a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40853b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40854c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40855d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40856e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VersionData versionData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, versionData.version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, versionData.download_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, versionData.release_notes);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, versionData.release_time);
            if (versionData.download_md5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, versionData.download_md5);
            }
            protoWriter.writeBytes(versionData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15434a newBuilder() {
        C15434a aVar = new C15434a();
        aVar.f40852a = this.version;
        aVar.f40853b = this.download_url;
        aVar.f40854c = this.release_notes;
        aVar.f40855d = this.release_time;
        aVar.f40856e = this.download_md5;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.VersionData$a */
    public static final class C15434a extends Message.Builder<VersionData, C15434a> {

        /* renamed from: a */
        public String f40852a;

        /* renamed from: b */
        public String f40853b;

        /* renamed from: c */
        public String f40854c;

        /* renamed from: d */
        public String f40855d;

        /* renamed from: e */
        public String f40856e;

        /* renamed from: a */
        public VersionData build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f40852a;
            if (str4 != null && (str = this.f40853b) != null && (str2 = this.f40854c) != null && (str3 = this.f40855d) != null) {
                return new VersionData(str4, str, str2, str3, this.f40856e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f40853b, "download_url", this.f40854c, "release_notes", this.f40855d, "release_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "VersionData");
        StringBuilder sb = new StringBuilder();
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", download_url=");
        sb.append(this.download_url);
        sb.append(", release_notes=");
        sb.append(this.release_notes);
        sb.append(", release_time=");
        sb.append(this.release_time);
        if (this.download_md5 != null) {
            sb.append(", download_md5=");
            sb.append(this.download_md5);
        }
        StringBuilder replace = sb.replace(0, 2, "VersionData{");
        replace.append('}');
        return replace.toString();
    }

    public VersionData(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public VersionData(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
        this.download_url = str2;
        this.release_notes = str3;
        this.release_time = str4;
        this.download_md5 = str5;
    }
}
