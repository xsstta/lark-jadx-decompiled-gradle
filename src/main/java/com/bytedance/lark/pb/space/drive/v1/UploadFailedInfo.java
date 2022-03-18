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

public final class UploadFailedInfo extends Message<UploadFailedInfo, C19399a> {
    public static final ProtoAdapter<UploadFailedInfo> ADAPTER = new C19400b();
    public static final Integer DEFAULT_ERROR_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Integer error_code;
    public final String error_message;
    public final String key;
    public final String request_id;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadFailedInfo$b */
    private static final class C19400b extends ProtoAdapter<UploadFailedInfo> {
        C19400b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadFailedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadFailedInfo uploadFailedInfo) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadFailedInfo.key);
            int i3 = 0;
            if (uploadFailedInfo.error_code != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, uploadFailedInfo.error_code);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (uploadFailedInfo.request_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, uploadFailedInfo.request_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (uploadFailedInfo.error_message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, uploadFailedInfo.error_message);
            }
            return i5 + i3 + uploadFailedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UploadFailedInfo decode(ProtoReader protoReader) throws IOException {
            C19399a aVar = new C19399a();
            aVar.f47697a = "";
            aVar.f47698b = 0;
            aVar.f47699c = "";
            aVar.f47700d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47697a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47698b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47699c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47700d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadFailedInfo uploadFailedInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadFailedInfo.key);
            if (uploadFailedInfo.error_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uploadFailedInfo.error_code);
            }
            if (uploadFailedInfo.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uploadFailedInfo.request_id);
            }
            if (uploadFailedInfo.error_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, uploadFailedInfo.error_message);
            }
            protoWriter.writeBytes(uploadFailedInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19399a newBuilder() {
        C19399a aVar = new C19399a();
        aVar.f47697a = this.key;
        aVar.f47698b = this.error_code;
        aVar.f47699c = this.request_id;
        aVar.f47700d = this.error_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadFailedInfo$a */
    public static final class C19399a extends Message.Builder<UploadFailedInfo, C19399a> {

        /* renamed from: a */
        public String f47697a;

        /* renamed from: b */
        public Integer f47698b;

        /* renamed from: c */
        public String f47699c;

        /* renamed from: d */
        public String f47700d;

        /* renamed from: a */
        public UploadFailedInfo build() {
            String str = this.f47697a;
            if (str != null) {
                return new UploadFailedInfo(str, this.f47698b, this.f47699c, this.f47700d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UploadFailedInfo");
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
        StringBuilder replace = sb.replace(0, 2, "UploadFailedInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UploadFailedInfo(String str, Integer num, String str2, String str3) {
        this(str, num, str2, str3, ByteString.EMPTY);
    }

    public UploadFailedInfo(String str, Integer num, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.error_code = num;
        this.request_id = str2;
        this.error_message = str3;
    }
}
