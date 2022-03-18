package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCTabTotalMissedCallInfo extends Message<VCTabTotalMissedCallInfo, C50451a> {
    public static final ProtoAdapter<VCTabTotalMissedCallInfo> ADAPTER = new C50452b();
    public static final Long DEFAULT_CONFIRMED_MISSED_CALLS = 0L;
    public static final Long DEFAULT_TOTAL_MISSED_CALLS = 0L;
    private static final long serialVersionUID = 0;
    public final Long mconfirmed_missed_calls;
    public final Long mtotal_missed_calls;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.VCTabTotalMissedCallInfo$b */
    private static final class C50452b extends ProtoAdapter<VCTabTotalMissedCallInfo> {
        C50452b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabTotalMissedCallInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo) {
            int i;
            int i2 = 0;
            if (vCTabTotalMissedCallInfo.mtotal_missed_calls != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, vCTabTotalMissedCallInfo.mtotal_missed_calls);
            } else {
                i = 0;
            }
            if (vCTabTotalMissedCallInfo.mconfirmed_missed_calls != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, vCTabTotalMissedCallInfo.mconfirmed_missed_calls);
            }
            return i + i2 + vCTabTotalMissedCallInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabTotalMissedCallInfo decode(ProtoReader protoReader) throws IOException {
            C50451a aVar = new C50451a();
            aVar.f125987a = 0L;
            aVar.f125988b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125987a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125988b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo) throws IOException {
            if (vCTabTotalMissedCallInfo.mtotal_missed_calls != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, vCTabTotalMissedCallInfo.mtotal_missed_calls);
            }
            if (vCTabTotalMissedCallInfo.mconfirmed_missed_calls != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, vCTabTotalMissedCallInfo.mconfirmed_missed_calls);
            }
            protoWriter.writeBytes(vCTabTotalMissedCallInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.VCTabTotalMissedCallInfo$a */
    public static final class C50451a extends Message.Builder<VCTabTotalMissedCallInfo, C50451a> {

        /* renamed from: a */
        public Long f125987a;

        /* renamed from: b */
        public Long f125988b;

        /* renamed from: a */
        public VCTabTotalMissedCallInfo build() {
            return new VCTabTotalMissedCallInfo(this.f125987a, this.f125988b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50451a newBuilder() {
        C50451a aVar = new C50451a();
        aVar.f125987a = this.mtotal_missed_calls;
        aVar.f125988b = this.mconfirmed_missed_calls;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtotal_missed_calls != null) {
            sb.append(", total_missed_calls=");
            sb.append(this.mtotal_missed_calls);
        }
        if (this.mconfirmed_missed_calls != null) {
            sb.append(", confirmed_missed_calls=");
            sb.append(this.mconfirmed_missed_calls);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabTotalMissedCallInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabTotalMissedCallInfo(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public VCTabTotalMissedCallInfo(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtotal_missed_calls = l;
        this.mconfirmed_missed_calls = l2;
    }
}
