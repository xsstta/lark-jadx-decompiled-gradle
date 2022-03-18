package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCTabMissedCallConfirmRequest extends Message<VCTabMissedCallConfirmRequest, C50447a> {
    public static final ProtoAdapter<VCTabMissedCallConfirmRequest> ADAPTER = new C50448b();
    public static final Long DEFAULT_CONFIRMED_MISSED_CALLS = 0L;
    private static final long serialVersionUID = 0;
    public final Long mconfirmed_missed_calls;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.VCTabMissedCallConfirmRequest$b */
    private static final class C50448b extends ProtoAdapter<VCTabMissedCallConfirmRequest> {
        C50448b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMissedCallConfirmRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMissedCallConfirmRequest vCTabMissedCallConfirmRequest) {
            int i;
            if (vCTabMissedCallConfirmRequest.mconfirmed_missed_calls != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, vCTabMissedCallConfirmRequest.mconfirmed_missed_calls);
            } else {
                i = 0;
            }
            return i + vCTabMissedCallConfirmRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMissedCallConfirmRequest decode(ProtoReader protoReader) throws IOException {
            C50447a aVar = new C50447a();
            aVar.f125986a = 0L;
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
                    aVar.f125986a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabMissedCallConfirmRequest vCTabMissedCallConfirmRequest) throws IOException {
            if (vCTabMissedCallConfirmRequest.mconfirmed_missed_calls != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, vCTabMissedCallConfirmRequest.mconfirmed_missed_calls);
            }
            protoWriter.writeBytes(vCTabMissedCallConfirmRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.VCTabMissedCallConfirmRequest$a */
    public static final class C50447a extends Message.Builder<VCTabMissedCallConfirmRequest, C50447a> {

        /* renamed from: a */
        public Long f125986a;

        /* renamed from: a */
        public VCTabMissedCallConfirmRequest build() {
            return new VCTabMissedCallConfirmRequest(this.f125986a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50447a newBuilder() {
        C50447a aVar = new C50447a();
        aVar.f125986a = this.mconfirmed_missed_calls;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mconfirmed_missed_calls != null) {
            sb.append(", confirmed_missed_calls=");
            sb.append(this.mconfirmed_missed_calls);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabMissedCallConfirmRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMissedCallConfirmRequest(Long l) {
        this(l, ByteString.EMPTY);
    }

    public VCTabMissedCallConfirmRequest(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mconfirmed_missed_calls = l;
    }
}
