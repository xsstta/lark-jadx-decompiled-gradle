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

public final class CancelDownloadRequest extends Message<CancelDownloadRequest, C19313a> {
    public static final ProtoAdapter<CancelDownloadRequest> ADAPTER = new C19314b();
    public static final Boolean DEFAULT_DELETE_FILE = false;
    private static final long serialVersionUID = 0;
    public final Boolean delete_file;
    public final List<String> keys;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelDownloadRequest$b */
    private static final class C19314b extends ProtoAdapter<CancelDownloadRequest> {
        C19314b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelDownloadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelDownloadRequest cancelDownloadRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, cancelDownloadRequest.keys);
            if (cancelDownloadRequest.delete_file != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, cancelDownloadRequest.delete_file);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + cancelDownloadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelDownloadRequest decode(ProtoReader protoReader) throws IOException {
            C19313a aVar = new C19313a();
            aVar.f47507b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47506a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47507b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelDownloadRequest cancelDownloadRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, cancelDownloadRequest.keys);
            if (cancelDownloadRequest.delete_file != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, cancelDownloadRequest.delete_file);
            }
            protoWriter.writeBytes(cancelDownloadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelDownloadRequest$a */
    public static final class C19313a extends Message.Builder<CancelDownloadRequest, C19313a> {

        /* renamed from: a */
        public List<String> f47506a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f47507b;

        /* renamed from: a */
        public CancelDownloadRequest build() {
            return new CancelDownloadRequest(this.f47506a, this.f47507b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19313a mo65836a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47506a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19313a newBuilder() {
        C19313a aVar = new C19313a();
        aVar.f47506a = Internal.copyOf("keys", this.keys);
        aVar.f47507b = this.delete_file;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelDownloadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        if (this.delete_file != null) {
            sb.append(", delete_file=");
            sb.append(this.delete_file);
        }
        StringBuilder replace = sb.replace(0, 2, "CancelDownloadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelDownloadRequest(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public CancelDownloadRequest(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
        this.delete_file = bool;
    }
}
