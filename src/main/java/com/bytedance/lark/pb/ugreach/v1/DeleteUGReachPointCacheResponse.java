package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteUGReachPointCacheResponse extends Message<DeleteUGReachPointCacheResponse, C19767a> {
    public static final ProtoAdapter<DeleteUGReachPointCacheResponse> ADAPTER = new C19768b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.DeleteUGReachPointCacheResponse$b */
    private static final class C19768b extends ProtoAdapter<DeleteUGReachPointCacheResponse> {
        C19768b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteUGReachPointCacheResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteUGReachPointCacheResponse deleteUGReachPointCacheResponse) {
            return deleteUGReachPointCacheResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteUGReachPointCacheResponse decode(ProtoReader protoReader) throws IOException {
            C19767a aVar = new C19767a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteUGReachPointCacheResponse deleteUGReachPointCacheResponse) throws IOException {
            protoWriter.writeBytes(deleteUGReachPointCacheResponse.unknownFields());
        }
    }

    public DeleteUGReachPointCacheResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.DeleteUGReachPointCacheResponse$a */
    public static final class C19767a extends Message.Builder<DeleteUGReachPointCacheResponse, C19767a> {
        /* renamed from: a */
        public DeleteUGReachPointCacheResponse build() {
            return new DeleteUGReachPointCacheResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19767a newBuilder() {
        C19767a aVar = new C19767a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "DeleteUGReachPointCacheResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteUGReachPointCacheResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteUGReachPointCacheResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
