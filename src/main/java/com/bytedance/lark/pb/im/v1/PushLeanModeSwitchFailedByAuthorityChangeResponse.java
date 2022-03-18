package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushLeanModeSwitchFailedByAuthorityChangeResponse extends Message<PushLeanModeSwitchFailedByAuthorityChangeResponse, C17909a> {
    public static final ProtoAdapter<PushLeanModeSwitchFailedByAuthorityChangeResponse> ADAPTER = new C17910b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLeanModeSwitchFailedByAuthorityChangeResponse$b */
    private static final class C17910b extends ProtoAdapter<PushLeanModeSwitchFailedByAuthorityChangeResponse> {
        C17910b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushLeanModeSwitchFailedByAuthorityChangeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushLeanModeSwitchFailedByAuthorityChangeResponse pushLeanModeSwitchFailedByAuthorityChangeResponse) {
            return pushLeanModeSwitchFailedByAuthorityChangeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushLeanModeSwitchFailedByAuthorityChangeResponse decode(ProtoReader protoReader) throws IOException {
            C17909a aVar = new C17909a();
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
        public void encode(ProtoWriter protoWriter, PushLeanModeSwitchFailedByAuthorityChangeResponse pushLeanModeSwitchFailedByAuthorityChangeResponse) throws IOException {
            protoWriter.writeBytes(pushLeanModeSwitchFailedByAuthorityChangeResponse.unknownFields());
        }
    }

    public PushLeanModeSwitchFailedByAuthorityChangeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLeanModeSwitchFailedByAuthorityChangeResponse$a */
    public static final class C17909a extends Message.Builder<PushLeanModeSwitchFailedByAuthorityChangeResponse, C17909a> {
        /* renamed from: a */
        public PushLeanModeSwitchFailedByAuthorityChangeResponse build() {
            return new PushLeanModeSwitchFailedByAuthorityChangeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17909a newBuilder() {
        C17909a aVar = new C17909a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushLeanModeSwitchFailedByAuthorityChangeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PushLeanModeSwitchFailedByAuthorityChangeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushLeanModeSwitchFailedByAuthorityChangeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
