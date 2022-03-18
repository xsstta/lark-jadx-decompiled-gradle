package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FetchAllSketchDataResponse extends Message<FetchAllSketchDataResponse, C50555a> {
    public static final ProtoAdapter<FetchAllSketchDataResponse> ADAPTER = new C50556b();
    public static final Integer DEFAULT_CURRENT_STEP = 0;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Integer current_step;
    public final List<SketchDataUnit> sketch_units;
    public final Integer version;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataResponse$b */
    private static final class C50556b extends ProtoAdapter<FetchAllSketchDataResponse> {
        C50556b() {
            super(FieldEncoding.LENGTH_DELIMITED, FetchAllSketchDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FetchAllSketchDataResponse fetchAllSketchDataResponse) {
            int i;
            int encodedSizeWithTag = SketchDataUnit.ADAPTER.asRepeated().encodedSizeWithTag(1, fetchAllSketchDataResponse.sketch_units) + ProtoAdapter.INT32.encodedSizeWithTag(2, fetchAllSketchDataResponse.version);
            if (fetchAllSketchDataResponse.current_step != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, fetchAllSketchDataResponse.current_step);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + fetchAllSketchDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FetchAllSketchDataResponse decode(ProtoReader protoReader) throws IOException {
            C50555a aVar = new C50555a();
            aVar.f126197b = 0;
            aVar.f126198c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126196a.add(SketchDataUnit.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126197b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126198c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FetchAllSketchDataResponse fetchAllSketchDataResponse) throws IOException {
            SketchDataUnit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, fetchAllSketchDataResponse.sketch_units);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fetchAllSketchDataResponse.version);
            if (fetchAllSketchDataResponse.current_step != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, fetchAllSketchDataResponse.current_step);
            }
            protoWriter.writeBytes(fetchAllSketchDataResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50555a newBuilder() {
        C50555a aVar = new C50555a();
        aVar.f126196a = Internal.copyOf("sketch_units", this.sketch_units);
        aVar.f126197b = this.version;
        aVar.f126198c = this.current_step;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataResponse$a */
    public static final class C50555a extends Message.Builder<FetchAllSketchDataResponse, C50555a> {

        /* renamed from: a */
        public List<SketchDataUnit> f126196a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f126197b;

        /* renamed from: c */
        public Integer f126198c;

        /* renamed from: a */
        public FetchAllSketchDataResponse build() {
            Integer num = this.f126197b;
            if (num != null) {
                return new FetchAllSketchDataResponse(this.f126196a, num, this.f126198c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FetchAllSketchDataResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.sketch_units.isEmpty()) {
            sb.append(", sketch_units=");
            sb.append(this.sketch_units);
        }
        sb.append(", version=");
        sb.append(this.version);
        if (this.current_step != null) {
            sb.append(", current_step=");
            sb.append(this.current_step);
        }
        StringBuilder replace = sb.replace(0, 2, "FetchAllSketchDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FetchAllSketchDataResponse(List<SketchDataUnit> list, Integer num, Integer num2) {
        this(list, num, num2, ByteString.EMPTY);
    }

    public FetchAllSketchDataResponse(List<SketchDataUnit> list, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sketch_units = Internal.immutableCopyOf("sketch_units", list);
        this.version = num;
        this.current_step = num2;
    }
}
