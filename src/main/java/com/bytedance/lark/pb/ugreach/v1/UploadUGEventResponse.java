package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadUGEventResponse extends Message<UploadUGEventResponse, C19809a> {
    public static final ProtoAdapter<UploadUGEventResponse> ADAPTER = new C19810b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.UploadUGEventResponse$b */
    private static final class C19810b extends ProtoAdapter<UploadUGEventResponse> {
        C19810b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadUGEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadUGEventResponse uploadUGEventResponse) {
            return uploadUGEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadUGEventResponse decode(ProtoReader protoReader) throws IOException {
            C19809a aVar = new C19809a();
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
        public void encode(ProtoWriter protoWriter, UploadUGEventResponse uploadUGEventResponse) throws IOException {
            protoWriter.writeBytes(uploadUGEventResponse.unknownFields());
        }
    }

    public UploadUGEventResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.UploadUGEventResponse$a */
    public static final class C19809a extends Message.Builder<UploadUGEventResponse, C19809a> {
        /* renamed from: a */
        public UploadUGEventResponse build() {
            return new UploadUGEventResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19809a newBuilder() {
        C19809a aVar = new C19809a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "UploadUGEventResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UploadUGEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadUGEventResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
