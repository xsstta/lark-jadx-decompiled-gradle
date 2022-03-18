package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateOpenAppLastHappenTimeResponse extends Message<UpdateOpenAppLastHappenTimeResponse, C18721a> {
    public static final ProtoAdapter<UpdateOpenAppLastHappenTimeResponse> ADAPTER = new C18722b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse$b */
    private static final class C18722b extends ProtoAdapter<UpdateOpenAppLastHappenTimeResponse> {
        C18722b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateOpenAppLastHappenTimeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateOpenAppLastHappenTimeResponse updateOpenAppLastHappenTimeResponse) {
            return updateOpenAppLastHappenTimeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateOpenAppLastHappenTimeResponse decode(ProtoReader protoReader) throws IOException {
            C18721a aVar = new C18721a();
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
        public void encode(ProtoWriter protoWriter, UpdateOpenAppLastHappenTimeResponse updateOpenAppLastHappenTimeResponse) throws IOException {
            protoWriter.writeBytes(updateOpenAppLastHappenTimeResponse.unknownFields());
        }
    }

    public UpdateOpenAppLastHappenTimeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse$a */
    public static final class C18721a extends Message.Builder<UpdateOpenAppLastHappenTimeResponse, C18721a> {
        /* renamed from: a */
        public UpdateOpenAppLastHappenTimeResponse build() {
            return new UpdateOpenAppLastHappenTimeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18721a newBuilder() {
        C18721a aVar = new C18721a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "UpdateOpenAppLastHappenTimeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateOpenAppLastHappenTimeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateOpenAppLastHappenTimeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
