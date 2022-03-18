package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCTabMissedCallConfirmResponse extends Message<VCTabMissedCallConfirmResponse, C50449a> {
    public static final ProtoAdapter<VCTabMissedCallConfirmResponse> ADAPTER = new C50450b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.VCTabMissedCallConfirmResponse$b */
    private static final class C50450b extends ProtoAdapter<VCTabMissedCallConfirmResponse> {
        C50450b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMissedCallConfirmResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMissedCallConfirmResponse vCTabMissedCallConfirmResponse) {
            return vCTabMissedCallConfirmResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMissedCallConfirmResponse decode(ProtoReader protoReader) throws IOException {
            C50449a aVar = new C50449a();
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
        public void encode(ProtoWriter protoWriter, VCTabMissedCallConfirmResponse vCTabMissedCallConfirmResponse) throws IOException {
            protoWriter.writeBytes(vCTabMissedCallConfirmResponse.unknownFields());
        }
    }

    public VCTabMissedCallConfirmResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.VCTabMissedCallConfirmResponse$a */
    public static final class C50449a extends Message.Builder<VCTabMissedCallConfirmResponse, C50449a> {
        /* renamed from: a */
        public VCTabMissedCallConfirmResponse build() {
            return new VCTabMissedCallConfirmResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50449a newBuilder() {
        C50449a aVar = new C50449a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "VCTabMissedCallConfirmResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMissedCallConfirmResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
