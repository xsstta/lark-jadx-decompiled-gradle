package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UploadListResponse extends Message<UploadListResponse, C19403a> {
    public static final ProtoAdapter<UploadListResponse> ADAPTER = new C19404b();
    private static final long serialVersionUID = 0;
    public final List<DriveFile> list;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadListResponse$b */
    private static final class C19404b extends ProtoAdapter<UploadListResponse> {
        C19404b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadListResponse uploadListResponse) {
            return DriveFile.ADAPTER.asRepeated().encodedSizeWithTag(1, uploadListResponse.list) + uploadListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadListResponse decode(ProtoReader protoReader) throws IOException {
            C19403a aVar = new C19403a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47704a.add(DriveFile.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadListResponse uploadListResponse) throws IOException {
            DriveFile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, uploadListResponse.list);
            protoWriter.writeBytes(uploadListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadListResponse$a */
    public static final class C19403a extends Message.Builder<UploadListResponse, C19403a> {

        /* renamed from: a */
        public List<DriveFile> f47704a = Internal.newMutableList();

        /* renamed from: a */
        public UploadListResponse build() {
            return new UploadListResponse(this.f47704a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19403a newBuilder() {
        C19403a aVar = new C19403a();
        aVar.f47704a = Internal.copyOf("list", this.list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UploadListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadListResponse(List<DriveFile> list2) {
        this(list2, ByteString.EMPTY);
    }

    public UploadListResponse(List<DriveFile> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.list = Internal.immutableCopyOf("list", list2);
    }
}
