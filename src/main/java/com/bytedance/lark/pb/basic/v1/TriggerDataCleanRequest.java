package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TriggerDataCleanRequest extends Message<TriggerDataCleanRequest, C15358a> {
    public static final ProtoAdapter<TriggerDataCleanRequest> ADAPTER = new C15359b();
    public static final CleanType DEFAULT_CLEAN_TYPE = CleanType.AUTO;
    public static final Integer DEFAULT_EXEC_TIME_LIMIT = 30;
    public static final Integer DEFAULT_TIME_LIMIT = 0;
    private static final long serialVersionUID = 0;
    public final CleanType clean_type;
    public final Integer exec_time_limit;
    public final Integer time_limit;

    public enum CleanType implements WireEnum {
        AUTO(1),
        USER(2);
        
        public static final ProtoAdapter<CleanType> ADAPTER = ProtoAdapter.newEnumAdapter(CleanType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CleanType fromValue(int i) {
            if (i == 1) {
                return AUTO;
            }
            if (i != 2) {
                return null;
            }
            return USER;
        }

        private CleanType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerDataCleanRequest$b */
    private static final class C15359b extends ProtoAdapter<TriggerDataCleanRequest> {
        C15359b() {
            super(FieldEncoding.LENGTH_DELIMITED, TriggerDataCleanRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TriggerDataCleanRequest triggerDataCleanRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (triggerDataCleanRequest.time_limit != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, triggerDataCleanRequest.time_limit);
            } else {
                i = 0;
            }
            if (triggerDataCleanRequest.exec_time_limit != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, triggerDataCleanRequest.exec_time_limit);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (triggerDataCleanRequest.clean_type != null) {
                i3 = CleanType.ADAPTER.encodedSizeWithTag(3, triggerDataCleanRequest.clean_type);
            }
            return i4 + i3 + triggerDataCleanRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TriggerDataCleanRequest decode(ProtoReader protoReader) throws IOException {
            C15358a aVar = new C15358a();
            aVar.f40671a = 0;
            aVar.f40672b = 30;
            aVar.f40673c = CleanType.AUTO;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40671a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40672b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f40673c = CleanType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TriggerDataCleanRequest triggerDataCleanRequest) throws IOException {
            if (triggerDataCleanRequest.time_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, triggerDataCleanRequest.time_limit);
            }
            if (triggerDataCleanRequest.exec_time_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, triggerDataCleanRequest.exec_time_limit);
            }
            if (triggerDataCleanRequest.clean_type != null) {
                CleanType.ADAPTER.encodeWithTag(protoWriter, 3, triggerDataCleanRequest.clean_type);
            }
            protoWriter.writeBytes(triggerDataCleanRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerDataCleanRequest$a */
    public static final class C15358a extends Message.Builder<TriggerDataCleanRequest, C15358a> {

        /* renamed from: a */
        public Integer f40671a;

        /* renamed from: b */
        public Integer f40672b;

        /* renamed from: c */
        public CleanType f40673c;

        /* renamed from: a */
        public TriggerDataCleanRequest build() {
            return new TriggerDataCleanRequest(this.f40671a, this.f40672b, this.f40673c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15358a mo55779a(CleanType cleanType) {
            this.f40673c = cleanType;
            return this;
        }

        /* renamed from: b */
        public C15358a mo55782b(Integer num) {
            this.f40672b = num;
            return this;
        }

        /* renamed from: a */
        public C15358a mo55780a(Integer num) {
            this.f40671a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15358a newBuilder() {
        C15358a aVar = new C15358a();
        aVar.f40671a = this.time_limit;
        aVar.f40672b = this.exec_time_limit;
        aVar.f40673c = this.clean_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TriggerDataCleanRequest");
        StringBuilder sb = new StringBuilder();
        if (this.time_limit != null) {
            sb.append(", time_limit=");
            sb.append(this.time_limit);
        }
        if (this.exec_time_limit != null) {
            sb.append(", exec_time_limit=");
            sb.append(this.exec_time_limit);
        }
        if (this.clean_type != null) {
            sb.append(", clean_type=");
            sb.append(this.clean_type);
        }
        StringBuilder replace = sb.replace(0, 2, "TriggerDataCleanRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TriggerDataCleanRequest(Integer num, Integer num2, CleanType cleanType) {
        this(num, num2, cleanType, ByteString.EMPTY);
    }

    public TriggerDataCleanRequest(Integer num, Integer num2, CleanType cleanType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time_limit = num;
        this.exec_time_limit = num2;
        this.clean_type = cleanType;
    }
}
