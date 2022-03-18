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

public final class CancelUploadRequest extends Message<CancelUploadRequest, C19321a> {
    public static final ProtoAdapter<CancelUploadRequest> ADAPTER = new C19322b();
    private static final long serialVersionUID = 0;
    public final List<String> keys;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelUploadRequest$b */
    private static final class C19322b extends ProtoAdapter<CancelUploadRequest> {
        C19322b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelUploadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelUploadRequest cancelUploadRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, cancelUploadRequest.keys) + cancelUploadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelUploadRequest decode(ProtoReader protoReader) throws IOException {
            C19321a aVar = new C19321a();
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
                    aVar.f47514a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelUploadRequest cancelUploadRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, cancelUploadRequest.keys);
            protoWriter.writeBytes(cancelUploadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelUploadRequest$a */
    public static final class C19321a extends Message.Builder<CancelUploadRequest, C19321a> {

        /* renamed from: a */
        public List<String> f47514a = Internal.newMutableList();

        /* renamed from: a */
        public CancelUploadRequest build() {
            return new CancelUploadRequest(this.f47514a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19321a mo65856a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47514a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19321a newBuilder() {
        C19321a aVar = new C19321a();
        aVar.f47514a = Internal.copyOf("keys", this.keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelUploadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        StringBuilder replace = sb.replace(0, 2, "CancelUploadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelUploadRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public CancelUploadRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
    }
}
