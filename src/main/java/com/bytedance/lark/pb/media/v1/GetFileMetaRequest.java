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

public final class GetFileMetaRequest extends Message<GetFileMetaRequest, C18234a> {
    public static final ProtoAdapter<GetFileMetaRequest> ADAPTER = new C18235b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileMetaRequest$b */
    private static final class C18235b extends ProtoAdapter<GetFileMetaRequest> {
        C18235b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFileMetaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFileMetaRequest getFileMetaRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getFileMetaRequest.key) + getFileMetaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFileMetaRequest decode(ProtoReader protoReader) throws IOException {
            C18234a aVar = new C18234a();
            aVar.f45482a = "";
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
                    aVar.f45482a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFileMetaRequest getFileMetaRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getFileMetaRequest.key);
            protoWriter.writeBytes(getFileMetaRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileMetaRequest$a */
    public static final class C18234a extends Message.Builder<GetFileMetaRequest, C18234a> {

        /* renamed from: a */
        public String f45482a;

        /* renamed from: a */
        public GetFileMetaRequest build() {
            String str = this.f45482a;
            if (str != null) {
                return new GetFileMetaRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C18234a mo63193a(String str) {
            this.f45482a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18234a newBuilder() {
        C18234a aVar = new C18234a();
        aVar.f45482a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetFileMetaRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "GetFileMetaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFileMetaRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetFileMetaRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
