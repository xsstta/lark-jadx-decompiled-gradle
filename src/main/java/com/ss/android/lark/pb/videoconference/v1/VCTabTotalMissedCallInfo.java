package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCTabTotalMissedCallInfo extends Message<VCTabTotalMissedCallInfo, C51206a> {
    public static final ProtoAdapter<VCTabTotalMissedCallInfo> ADAPTER = new C51207b();
    public static final Long DEFAULT_CONFIRMED_MISSED_CALLS = 0L;
    public static final Long DEFAULT_TOTAL_MISSED_CALLS = 0L;
    private static final long serialVersionUID = 0;
    public final Long confirmed_missed_calls;
    public final Long total_missed_calls;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabTotalMissedCallInfo$b */
    private static final class C51207b extends ProtoAdapter<VCTabTotalMissedCallInfo> {
        C51207b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabTotalMissedCallInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo) {
            int i;
            int i2 = 0;
            if (vCTabTotalMissedCallInfo.total_missed_calls != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, vCTabTotalMissedCallInfo.total_missed_calls);
            } else {
                i = 0;
            }
            if (vCTabTotalMissedCallInfo.confirmed_missed_calls != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, vCTabTotalMissedCallInfo.confirmed_missed_calls);
            }
            return i + i2 + vCTabTotalMissedCallInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabTotalMissedCallInfo decode(ProtoReader protoReader) throws IOException {
            C51206a aVar = new C51206a();
            aVar.f127464a = 0L;
            aVar.f127465b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127464a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127465b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo) throws IOException {
            if (vCTabTotalMissedCallInfo.total_missed_calls != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, vCTabTotalMissedCallInfo.total_missed_calls);
            }
            if (vCTabTotalMissedCallInfo.confirmed_missed_calls != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, vCTabTotalMissedCallInfo.confirmed_missed_calls);
            }
            protoWriter.writeBytes(vCTabTotalMissedCallInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabTotalMissedCallInfo$a */
    public static final class C51206a extends Message.Builder<VCTabTotalMissedCallInfo, C51206a> {

        /* renamed from: a */
        public Long f127464a;

        /* renamed from: b */
        public Long f127465b;

        /* renamed from: a */
        public VCTabTotalMissedCallInfo build() {
            return new VCTabTotalMissedCallInfo(this.f127464a, this.f127465b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51206a newBuilder() {
        C51206a aVar = new C51206a();
        aVar.f127464a = this.total_missed_calls;
        aVar.f127465b = this.confirmed_missed_calls;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabTotalMissedCallInfo");
        StringBuilder sb = new StringBuilder();
        if (this.total_missed_calls != null) {
            sb.append(", total_missed_calls=");
            sb.append(this.total_missed_calls);
        }
        if (this.confirmed_missed_calls != null) {
            sb.append(", confirmed_missed_calls=");
            sb.append(this.confirmed_missed_calls);
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
        this.total_missed_calls = l;
        this.confirmed_missed_calls = l2;
    }
}
