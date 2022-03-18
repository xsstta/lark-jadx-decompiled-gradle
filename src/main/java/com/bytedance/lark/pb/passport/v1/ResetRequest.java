package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ResetRequest extends Message<ResetRequest, C18737a> {
    public static final ProtoAdapter<ResetRequest> ADAPTER = new C18738b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.passport.v1.ResetRequest$b */
    private static final class C18738b extends ProtoAdapter<ResetRequest> {
        C18738b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResetRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ResetRequest resetRequest) {
            return resetRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ResetRequest decode(ProtoReader protoReader) throws IOException {
            C18737a aVar = new C18737a();
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
        public void encode(ProtoWriter protoWriter, ResetRequest resetRequest) throws IOException {
            protoWriter.writeBytes(resetRequest.unknownFields());
        }
    }

    public ResetRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.ResetRequest$a */
    public static final class C18737a extends Message.Builder<ResetRequest, C18737a> {
        /* renamed from: a */
        public ResetRequest build() {
            return new ResetRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18737a newBuilder() {
        C18737a aVar = new C18737a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "ResetRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ResetRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ResetRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
