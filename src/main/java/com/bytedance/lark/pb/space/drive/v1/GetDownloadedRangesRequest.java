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

public final class GetDownloadedRangesRequest extends Message<GetDownloadedRangesRequest, C19363a> {
    public static final ProtoAdapter<GetDownloadedRangesRequest> ADAPTER = new C19364b();
    private static final long serialVersionUID = 0;
    public final String data_version;
    public final String file_token;
    public final String local_path;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.GetDownloadedRangesRequest$b */
    private static final class C19364b extends ProtoAdapter<GetDownloadedRangesRequest> {
        C19364b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDownloadedRangesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDownloadedRangesRequest getDownloadedRangesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getDownloadedRangesRequest.file_token);
            int i2 = 0;
            if (getDownloadedRangesRequest.local_path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getDownloadedRangesRequest.local_path);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getDownloadedRangesRequest.data_version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getDownloadedRangesRequest.data_version);
            }
            return i3 + i2 + getDownloadedRangesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDownloadedRangesRequest decode(ProtoReader protoReader) throws IOException {
            C19363a aVar = new C19363a();
            aVar.f47615a = "";
            aVar.f47616b = "";
            aVar.f47617c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47615a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47616b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47617c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDownloadedRangesRequest getDownloadedRangesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getDownloadedRangesRequest.file_token);
            if (getDownloadedRangesRequest.local_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getDownloadedRangesRequest.local_path);
            }
            if (getDownloadedRangesRequest.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getDownloadedRangesRequest.data_version);
            }
            protoWriter.writeBytes(getDownloadedRangesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19363a newBuilder() {
        C19363a aVar = new C19363a();
        aVar.f47615a = this.file_token;
        aVar.f47616b = this.local_path;
        aVar.f47617c = this.data_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.GetDownloadedRangesRequest$a */
    public static final class C19363a extends Message.Builder<GetDownloadedRangesRequest, C19363a> {

        /* renamed from: a */
        public String f47615a;

        /* renamed from: b */
        public String f47616b;

        /* renamed from: c */
        public String f47617c;

        /* renamed from: a */
        public GetDownloadedRangesRequest build() {
            String str = this.f47615a;
            if (str != null) {
                return new GetDownloadedRangesRequest(str, this.f47616b, this.f47617c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "file_token");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetDownloadedRangesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", file_token=");
        sb.append(this.file_token);
        if (this.local_path != null) {
            sb.append(", local_path=");
            sb.append(this.local_path);
        }
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDownloadedRangesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDownloadedRangesRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public GetDownloadedRangesRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_token = str;
        this.local_path = str2;
        this.data_version = str3;
    }
}
