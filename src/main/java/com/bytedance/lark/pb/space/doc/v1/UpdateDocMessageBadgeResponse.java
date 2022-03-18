package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateDocMessageBadgeResponse extends Message<UpdateDocMessageBadgeResponse, C19287a> {
    public static final ProtoAdapter<UpdateDocMessageBadgeResponse> ADAPTER = new C19288b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMessageBadgeResponse$b */
    private static final class C19288b extends ProtoAdapter<UpdateDocMessageBadgeResponse> {
        C19288b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocMessageBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocMessageBadgeResponse updateDocMessageBadgeResponse) {
            return updateDocMessageBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocMessageBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C19287a aVar = new C19287a();
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
        public void encode(ProtoWriter protoWriter, UpdateDocMessageBadgeResponse updateDocMessageBadgeResponse) throws IOException {
            protoWriter.writeBytes(updateDocMessageBadgeResponse.unknownFields());
        }
    }

    public UpdateDocMessageBadgeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMessageBadgeResponse$a */
    public static final class C19287a extends Message.Builder<UpdateDocMessageBadgeResponse, C19287a> {
        /* renamed from: a */
        public UpdateDocMessageBadgeResponse build() {
            return new UpdateDocMessageBadgeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19287a newBuilder() {
        C19287a aVar = new C19287a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocMessageBadgeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateDocMessageBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocMessageBadgeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
