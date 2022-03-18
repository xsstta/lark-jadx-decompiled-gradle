package com.ss.android.lark.pb.users;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchUserMemoResponse extends Message<PatchUserMemoResponse, C50266a> {
    public static final ProtoAdapter<PatchUserMemoResponse> ADAPTER = new C50267b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.users.PatchUserMemoResponse$b */
    private static final class C50267b extends ProtoAdapter<PatchUserMemoResponse> {
        C50267b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchUserMemoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchUserMemoResponse patchUserMemoResponse) {
            return patchUserMemoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchUserMemoResponse decode(ProtoReader protoReader) throws IOException {
            C50266a aVar = new C50266a();
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
        public void encode(ProtoWriter protoWriter, PatchUserMemoResponse patchUserMemoResponse) throws IOException {
            protoWriter.writeBytes(patchUserMemoResponse.unknownFields());
        }
    }

    public PatchUserMemoResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.users.PatchUserMemoResponse$a */
    public static final class C50266a extends Message.Builder<PatchUserMemoResponse, C50266a> {
        /* renamed from: a */
        public PatchUserMemoResponse build() {
            return new PatchUserMemoResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50266a newBuilder() {
        C50266a aVar = new C50266a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PatchUserMemoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchUserMemoResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
