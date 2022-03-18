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

public final class CancelResourceRequest extends Message<CancelResourceRequest, C18198a> {
    public static final ProtoAdapter<CancelResourceRequest> ADAPTER = new C18199b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.media.v1.CancelResourceRequest$b */
    private static final class C18199b extends ProtoAdapter<CancelResourceRequest> {
        C18199b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelResourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelResourceRequest cancelResourceRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, cancelResourceRequest.key) + cancelResourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelResourceRequest decode(ProtoReader protoReader) throws IOException {
            C18198a aVar = new C18198a();
            aVar.f45426a = "";
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
                    aVar.f45426a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelResourceRequest cancelResourceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cancelResourceRequest.key);
            protoWriter.writeBytes(cancelResourceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.CancelResourceRequest$a */
    public static final class C18198a extends Message.Builder<CancelResourceRequest, C18198a> {

        /* renamed from: a */
        public String f45426a;

        /* renamed from: a */
        public CancelResourceRequest build() {
            String str = this.f45426a;
            if (str != null) {
                return new CancelResourceRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C18198a mo63095a(String str) {
            this.f45426a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18198a newBuilder() {
        C18198a aVar = new C18198a();
        aVar.f45426a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "CancelResourceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "CancelResourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelResourceRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public CancelResourceRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
