package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVCTabTotalMissedCallResponse extends Message<GetVCTabTotalMissedCallResponse, C50445a> {
    public static final ProtoAdapter<GetVCTabTotalMissedCallResponse> ADAPTER = new C50446b();
    private static final long serialVersionUID = 0;
    public final VCTabTotalMissedCallInfo minfo;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallResponse$b */
    private static final class C50446b extends ProtoAdapter<GetVCTabTotalMissedCallResponse> {
        C50446b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCTabTotalMissedCallResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCTabTotalMissedCallResponse getVCTabTotalMissedCallResponse) {
            int i;
            if (getVCTabTotalMissedCallResponse.minfo != null) {
                i = VCTabTotalMissedCallInfo.ADAPTER.encodedSizeWithTag(1, getVCTabTotalMissedCallResponse.minfo);
            } else {
                i = 0;
            }
            return i + getVCTabTotalMissedCallResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCTabTotalMissedCallResponse decode(ProtoReader protoReader) throws IOException {
            C50445a aVar = new C50445a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125985a = VCTabTotalMissedCallInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCTabTotalMissedCallResponse getVCTabTotalMissedCallResponse) throws IOException {
            if (getVCTabTotalMissedCallResponse.minfo != null) {
                VCTabTotalMissedCallInfo.ADAPTER.encodeWithTag(protoWriter, 1, getVCTabTotalMissedCallResponse.minfo);
            }
            protoWriter.writeBytes(getVCTabTotalMissedCallResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallResponse$a */
    public static final class C50445a extends Message.Builder<GetVCTabTotalMissedCallResponse, C50445a> {

        /* renamed from: a */
        public VCTabTotalMissedCallInfo f125985a;

        /* renamed from: a */
        public GetVCTabTotalMissedCallResponse build() {
            return new GetVCTabTotalMissedCallResponse(this.f125985a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50445a newBuilder() {
        C50445a aVar = new C50445a();
        aVar.f125985a = this.minfo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.minfo != null) {
            sb.append(", info=");
            sb.append(this.minfo);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCTabTotalMissedCallResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCTabTotalMissedCallResponse(VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo) {
        this(vCTabTotalMissedCallInfo, ByteString.EMPTY);
    }

    public GetVCTabTotalMissedCallResponse(VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.minfo = vCTabTotalMissedCallInfo;
    }
}
