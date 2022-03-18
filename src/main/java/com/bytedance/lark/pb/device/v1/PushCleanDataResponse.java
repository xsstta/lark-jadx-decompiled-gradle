package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushCleanDataResponse extends Message<PushCleanDataResponse, C16584a> {
    public static final ProtoAdapter<PushCleanDataResponse> ADAPTER = new C16585b();
    public static final CleanLevel DEFAULT_CLEAN_LEVEL = CleanLevel.Low;
    public static final Long DEFAULT_DATA_TIME_LIMIT = 0L;
    private static final long serialVersionUID = 0;
    public final CleanLevel clean_level;
    public final Long data_time_limit;

    public enum CleanLevel implements WireEnum {
        Low(1),
        Medium(2),
        High(3),
        Full(4);
        
        public static final ProtoAdapter<CleanLevel> ADAPTER = ProtoAdapter.newEnumAdapter(CleanLevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CleanLevel fromValue(int i) {
            if (i == 1) {
                return Low;
            }
            if (i == 2) {
                return Medium;
            }
            if (i == 3) {
                return High;
            }
            if (i != 4) {
                return null;
            }
            return Full;
        }

        private CleanLevel(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.PushCleanDataResponse$b */
    private static final class C16585b extends ProtoAdapter<PushCleanDataResponse> {
        C16585b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCleanDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCleanDataResponse pushCleanDataResponse) {
            return CleanLevel.ADAPTER.encodedSizeWithTag(1, pushCleanDataResponse.clean_level) + ProtoAdapter.INT64.encodedSizeWithTag(2, pushCleanDataResponse.data_time_limit) + pushCleanDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushCleanDataResponse decode(ProtoReader protoReader) throws IOException {
            C16584a aVar = new C16584a();
            aVar.f42946a = CleanLevel.Low;
            aVar.f42947b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42946a = CleanLevel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42947b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCleanDataResponse pushCleanDataResponse) throws IOException {
            CleanLevel.ADAPTER.encodeWithTag(protoWriter, 1, pushCleanDataResponse.clean_level);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pushCleanDataResponse.data_time_limit);
            protoWriter.writeBytes(pushCleanDataResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16584a newBuilder() {
        C16584a aVar = new C16584a();
        aVar.f42946a = this.clean_level;
        aVar.f42947b = this.data_time_limit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.PushCleanDataResponse$a */
    public static final class C16584a extends Message.Builder<PushCleanDataResponse, C16584a> {

        /* renamed from: a */
        public CleanLevel f42946a;

        /* renamed from: b */
        public Long f42947b;

        /* renamed from: a */
        public PushCleanDataResponse build() {
            Long l;
            CleanLevel cleanLevel = this.f42946a;
            if (cleanLevel != null && (l = this.f42947b) != null) {
                return new PushCleanDataResponse(cleanLevel, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(cleanLevel, "clean_level", this.f42947b, "data_time_limit");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "PushCleanDataResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", clean_level=");
        sb.append(this.clean_level);
        sb.append(", data_time_limit=");
        sb.append(this.data_time_limit);
        StringBuilder replace = sb.replace(0, 2, "PushCleanDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushCleanDataResponse(CleanLevel cleanLevel, Long l) {
        this(cleanLevel, l, ByteString.EMPTY);
    }

    public PushCleanDataResponse(CleanLevel cleanLevel, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.clean_level = cleanLevel;
        this.data_time_limit = l;
    }
}
