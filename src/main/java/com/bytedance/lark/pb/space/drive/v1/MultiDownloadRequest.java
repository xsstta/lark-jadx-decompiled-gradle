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

public final class MultiDownloadRequest extends Message<MultiDownloadRequest, C19371a> {
    public static final ProtoAdapter<MultiDownloadRequest> ADAPTER = new C19372b();
    private static final long serialVersionUID = 0;
    public final List<DownloadRequest> download_requests;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.MultiDownloadRequest$b */
    private static final class C19372b extends ProtoAdapter<MultiDownloadRequest> {
        C19372b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiDownloadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiDownloadRequest multiDownloadRequest) {
            return DownloadRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, multiDownloadRequest.download_requests) + multiDownloadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MultiDownloadRequest decode(ProtoReader protoReader) throws IOException {
            C19371a aVar = new C19371a();
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
                    aVar.f47634a.add(DownloadRequest.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MultiDownloadRequest multiDownloadRequest) throws IOException {
            DownloadRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, multiDownloadRequest.download_requests);
            protoWriter.writeBytes(multiDownloadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.MultiDownloadRequest$a */
    public static final class C19371a extends Message.Builder<MultiDownloadRequest, C19371a> {

        /* renamed from: a */
        public List<DownloadRequest> f47634a = Internal.newMutableList();

        /* renamed from: a */
        public MultiDownloadRequest build() {
            return new MultiDownloadRequest(this.f47634a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19371a mo65997a(List<DownloadRequest> list) {
            Internal.checkElementsNotNull(list);
            this.f47634a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19371a newBuilder() {
        C19371a aVar = new C19371a();
        aVar.f47634a = Internal.copyOf("download_requests", this.download_requests);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "MultiDownloadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.download_requests.isEmpty()) {
            sb.append(", download_requests=");
            sb.append(this.download_requests);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiDownloadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MultiDownloadRequest(List<DownloadRequest> list) {
        this(list, ByteString.EMPTY);
    }

    public MultiDownloadRequest(List<DownloadRequest> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.download_requests = Internal.immutableCopyOf("download_requests", list);
    }
}
