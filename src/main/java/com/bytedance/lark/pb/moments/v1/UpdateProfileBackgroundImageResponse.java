package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateProfileBackgroundImageResponse extends Message<UpdateProfileBackgroundImageResponse, C18558a> {
    public static final ProtoAdapter<UpdateProfileBackgroundImageResponse> ADAPTER = new C18559b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UpdateProfileBackgroundImageResponse$b */
    private static final class C18559b extends ProtoAdapter<UpdateProfileBackgroundImageResponse> {
        C18559b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateProfileBackgroundImageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateProfileBackgroundImageResponse updateProfileBackgroundImageResponse) {
            return updateProfileBackgroundImageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateProfileBackgroundImageResponse decode(ProtoReader protoReader) throws IOException {
            C18558a aVar = new C18558a();
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
        public void encode(ProtoWriter protoWriter, UpdateProfileBackgroundImageResponse updateProfileBackgroundImageResponse) throws IOException {
            protoWriter.writeBytes(updateProfileBackgroundImageResponse.unknownFields());
        }
    }

    public UpdateProfileBackgroundImageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UpdateProfileBackgroundImageResponse$a */
    public static final class C18558a extends Message.Builder<UpdateProfileBackgroundImageResponse, C18558a> {
        /* renamed from: a */
        public UpdateProfileBackgroundImageResponse build() {
            return new UpdateProfileBackgroundImageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18558a newBuilder() {
        C18558a aVar = new C18558a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UpdateProfileBackgroundImageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateProfileBackgroundImageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateProfileBackgroundImageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
