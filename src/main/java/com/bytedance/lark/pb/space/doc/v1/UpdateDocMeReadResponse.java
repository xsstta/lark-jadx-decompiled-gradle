package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateDocMeReadResponse extends Message<UpdateDocMeReadResponse, C19283a> {
    public static final ProtoAdapter<UpdateDocMeReadResponse> ADAPTER = new C19284b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMeReadResponse$b */
    private static final class C19284b extends ProtoAdapter<UpdateDocMeReadResponse> {
        C19284b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocMeReadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocMeReadResponse updateDocMeReadResponse) {
            return updateDocMeReadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocMeReadResponse decode(ProtoReader protoReader) throws IOException {
            C19283a aVar = new C19283a();
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
        public void encode(ProtoWriter protoWriter, UpdateDocMeReadResponse updateDocMeReadResponse) throws IOException {
            protoWriter.writeBytes(updateDocMeReadResponse.unknownFields());
        }
    }

    public UpdateDocMeReadResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMeReadResponse$a */
    public static final class C19283a extends Message.Builder<UpdateDocMeReadResponse, C19283a> {
        /* renamed from: a */
        public UpdateDocMeReadResponse build() {
            return new UpdateDocMeReadResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19283a newBuilder() {
        C19283a aVar = new C19283a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocMeReadResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateDocMeReadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocMeReadResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
