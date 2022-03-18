package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DownloadFailedInfo extends Message<DownloadFailedInfo, C19339a> {
    public static final ProtoAdapter<DownloadFailedInfo> ADAPTER = new C19340b();
    public static final Integer DEFAULT_ERROR_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Integer error_code;
    public final String error_message;
    public final String key;
    public final String request_id;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadFailedInfo$b */
    private static final class C19340b extends ProtoAdapter<DownloadFailedInfo> {
        C19340b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadFailedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadFailedInfo downloadFailedInfo) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadFailedInfo.key);
            int i3 = 0;
            if (downloadFailedInfo.error_code != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, downloadFailedInfo.error_code);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (downloadFailedInfo.request_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, downloadFailedInfo.request_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (downloadFailedInfo.error_message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, downloadFailedInfo.error_message);
            }
            return i5 + i3 + downloadFailedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadFailedInfo decode(ProtoReader protoReader) throws IOException {
            C19339a aVar = new C19339a();
            aVar.f47531a = "";
            aVar.f47532b = 0;
            aVar.f47533c = "";
            aVar.f47534d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47531a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47532b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47533c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47534d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadFailedInfo downloadFailedInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadFailedInfo.key);
            if (downloadFailedInfo.error_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, downloadFailedInfo.error_code);
            }
            if (downloadFailedInfo.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, downloadFailedInfo.request_id);
            }
            if (downloadFailedInfo.error_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, downloadFailedInfo.error_message);
            }
            protoWriter.writeBytes(downloadFailedInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19339a newBuilder() {
        C19339a aVar = new C19339a();
        aVar.f47531a = this.key;
        aVar.f47532b = this.error_code;
        aVar.f47533c = this.request_id;
        aVar.f47534d = this.error_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadFailedInfo$a */
    public static final class C19339a extends Message.Builder<DownloadFailedInfo, C19339a> {

        /* renamed from: a */
        public String f47531a;

        /* renamed from: b */
        public Integer f47532b;

        /* renamed from: c */
        public String f47533c;

        /* renamed from: d */
        public String f47534d;

        /* renamed from: a */
        public DownloadFailedInfo build() {
            String str = this.f47531a;
            if (str != null) {
                return new DownloadFailedInfo(str, this.f47532b, this.f47533c, this.f47534d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadFailedInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (this.error_code != null) {
            sb.append(", error_code=");
            sb.append(this.error_code);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.error_message != null) {
            sb.append(", error_message=");
            sb.append(this.error_message);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadFailedInfo{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadFailedInfo(String str, Integer num, String str2, String str3) {
        this(str, num, str2, str3, ByteString.EMPTY);
    }

    public DownloadFailedInfo(String str, Integer num, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.error_code = num;
        this.request_id = str2;
        this.error_message = str3;
    }
}
