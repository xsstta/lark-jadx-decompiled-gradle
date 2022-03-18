package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.space.drive.v1.DownloadRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteDownloadRecordRequest extends Message<DeleteDownloadRecordRequest, C19329a> {
    public static final ProtoAdapter<DeleteDownloadRecordRequest> ADAPTER = new C19330b();
    public static final DownloadRequest.ApiType DEFAULT_API_TYPE = DownloadRequest.ApiType.DRIVE;
    private static final long serialVersionUID = 0;
    public final DownloadRequest.ApiType api_type;
    public final String data_version;
    public final String file_token;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteDownloadRecordRequest$b */
    private static final class C19330b extends ProtoAdapter<DeleteDownloadRecordRequest> {
        C19330b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteDownloadRecordRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteDownloadRecordRequest deleteDownloadRecordRequest) {
            int i;
            int encodedSizeWithTag = DownloadRequest.ApiType.ADAPTER.encodedSizeWithTag(1, deleteDownloadRecordRequest.api_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, deleteDownloadRecordRequest.file_token);
            if (deleteDownloadRecordRequest.data_version != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, deleteDownloadRecordRequest.data_version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deleteDownloadRecordRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteDownloadRecordRequest decode(ProtoReader protoReader) throws IOException {
            C19329a aVar = new C19329a();
            aVar.f47523a = DownloadRequest.ApiType.DRIVE;
            aVar.f47524b = "";
            aVar.f47525c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47523a = DownloadRequest.ApiType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f47524b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47525c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteDownloadRecordRequest deleteDownloadRecordRequest) throws IOException {
            DownloadRequest.ApiType.ADAPTER.encodeWithTag(protoWriter, 1, deleteDownloadRecordRequest.api_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteDownloadRecordRequest.file_token);
            if (deleteDownloadRecordRequest.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, deleteDownloadRecordRequest.data_version);
            }
            protoWriter.writeBytes(deleteDownloadRecordRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19329a newBuilder() {
        C19329a aVar = new C19329a();
        aVar.f47523a = this.api_type;
        aVar.f47524b = this.file_token;
        aVar.f47525c = this.data_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteDownloadRecordRequest$a */
    public static final class C19329a extends Message.Builder<DeleteDownloadRecordRequest, C19329a> {

        /* renamed from: a */
        public DownloadRequest.ApiType f47523a;

        /* renamed from: b */
        public String f47524b;

        /* renamed from: c */
        public String f47525c;

        /* renamed from: a */
        public DeleteDownloadRecordRequest build() {
            String str;
            DownloadRequest.ApiType apiType = this.f47523a;
            if (apiType != null && (str = this.f47524b) != null) {
                return new DeleteDownloadRecordRequest(apiType, str, this.f47525c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(apiType, "api_type", this.f47524b, "file_token");
        }

        /* renamed from: a */
        public C19329a mo65873a(DownloadRequest.ApiType apiType) {
            this.f47523a = apiType;
            return this;
        }

        /* renamed from: b */
        public C19329a mo65876b(String str) {
            this.f47525c = str;
            return this;
        }

        /* renamed from: a */
        public C19329a mo65874a(String str) {
            this.f47524b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DeleteDownloadRecordRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", api_type=");
        sb.append(this.api_type);
        sb.append(", file_token=");
        sb.append(this.file_token);
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteDownloadRecordRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteDownloadRecordRequest(DownloadRequest.ApiType apiType, String str, String str2) {
        this(apiType, str, str2, ByteString.EMPTY);
    }

    public DeleteDownloadRecordRequest(DownloadRequest.ApiType apiType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.api_type = apiType;
        this.file_token = str;
        this.data_version = str2;
    }
}
