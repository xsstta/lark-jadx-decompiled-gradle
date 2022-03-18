package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class TriggerDataCleanResponse extends Message<TriggerDataCleanResponse, C15362a> {
    public static final ProtoAdapter<TriggerDataCleanResponse> ADAPTER = new C15363b();
    private static final long serialVersionUID = 0;
    public final List<Cleaned> cleaned;

    public enum Business implements WireEnum {
        UNKNOWN(0),
        SEARCH(1),
        MESSAGE(2),
        FEED(3),
        RESOURCE(4),
        MAIL(5),
        CALENDAR(6),
        LOG(7);
        
        public static final ProtoAdapter<Business> ADAPTER = ProtoAdapter.newEnumAdapter(Business.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Business fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return SEARCH;
                case 2:
                    return MESSAGE;
                case 3:
                    return FEED;
                case 4:
                    return RESOURCE;
                case 5:
                    return MAIL;
                case 6:
                    return CALENDAR;
                case 7:
                    return LOG;
                default:
                    return null;
            }
        }

        private Business(int i) {
            this.value = i;
        }
    }

    public static final class Cleaned extends Message<Cleaned, C15360a> {
        public static final ProtoAdapter<Cleaned> ADAPTER = new C15361b();
        public static final Business DEFAULT_BUSINESS = Business.UNKNOWN;
        public static final Integer DEFAULT_BYTES = 0;
        public static final Boolean DEFAULT_COMPLETED = false;
        public static final Integer DEFAULT_COST_TIME = 0;
        public static final Integer DEFAULT_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final Business business;
        public final Integer bytes;
        public final Boolean completed;
        public final Integer cost_time;
        public final Integer count;

        /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse$Cleaned$b */
        private static final class C15361b extends ProtoAdapter<Cleaned> {
            C15361b() {
                super(FieldEncoding.LENGTH_DELIMITED, Cleaned.class);
            }

            /* renamed from: a */
            public int encodedSize(Cleaned cleaned) {
                int i;
                int i2;
                int encodedSizeWithTag = Business.ADAPTER.encodedSizeWithTag(1, cleaned.business) + ProtoAdapter.BOOL.encodedSizeWithTag(2, cleaned.completed);
                int i3 = 0;
                if (cleaned.cost_time != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(5, cleaned.cost_time);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (cleaned.count != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, cleaned.count);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (cleaned.bytes != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, cleaned.bytes);
                }
                return i5 + i3 + cleaned.unknownFields().size();
            }

            /* renamed from: a */
            public Cleaned decode(ProtoReader protoReader) throws IOException {
                C15360a aVar = new C15360a();
                aVar.f40674a = Business.UNKNOWN;
                aVar.f40675b = false;
                aVar.f40676c = 0;
                aVar.mo55786a(0);
                aVar.mo55788b(0);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40674a = Business.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f40675b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.mo55786a(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 4) {
                        aVar.mo55788b(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40676c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Cleaned cleaned) throws IOException {
                Business.ADAPTER.encodeWithTag(protoWriter, 1, cleaned.business);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, cleaned.completed);
                if (cleaned.cost_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, cleaned.cost_time);
                }
                if (cleaned.count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, cleaned.count);
                }
                if (cleaned.bytes != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, cleaned.bytes);
                }
                protoWriter.writeBytes(cleaned.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse$Cleaned$a */
        public static final class C15360a extends Message.Builder<Cleaned, C15360a> {

            /* renamed from: a */
            public Business f40674a;

            /* renamed from: b */
            public Boolean f40675b;

            /* renamed from: c */
            public Integer f40676c;

            /* renamed from: d */
            public Integer f40677d;

            /* renamed from: e */
            public Integer f40678e;

            /* renamed from: a */
            public Cleaned build() {
                Boolean bool;
                Business business = this.f40674a;
                if (business != null && (bool = this.f40675b) != null) {
                    return new Cleaned(business, bool, this.f40676c, this.f40677d, this.f40678e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(business, "business", this.f40675b, "completed");
            }

            /* renamed from: a */
            public C15360a mo55786a(Integer num) {
                this.f40677d = num;
                this.f40678e = null;
                return this;
            }

            /* renamed from: b */
            public C15360a mo55788b(Integer num) {
                this.f40678e = num;
                this.f40677d = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15360a newBuilder() {
            C15360a aVar = new C15360a();
            aVar.f40674a = this.business;
            aVar.f40675b = this.completed;
            aVar.f40676c = this.cost_time;
            aVar.f40677d = this.count;
            aVar.f40678e = this.bytes;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Cleaned");
            StringBuilder sb = new StringBuilder();
            sb.append(", business=");
            sb.append(this.business);
            sb.append(", completed=");
            sb.append(this.completed);
            if (this.cost_time != null) {
                sb.append(", cost_time=");
                sb.append(this.cost_time);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            if (this.bytes != null) {
                sb.append(", bytes=");
                sb.append(this.bytes);
            }
            StringBuilder replace = sb.replace(0, 2, "Cleaned{");
            replace.append('}');
            return replace.toString();
        }

        public Cleaned(Business business2, Boolean bool, Integer num, Integer num2, Integer num3) {
            this(business2, bool, num, num2, num3, ByteString.EMPTY);
        }

        public Cleaned(Business business2, Boolean bool, Integer num, Integer num2, Integer num3, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(num2, num3) <= 1) {
                this.business = business2;
                this.completed = bool;
                this.cost_time = num;
                this.count = num2;
                this.bytes = num3;
                return;
            }
            throw new IllegalArgumentException("at most one of count, bytes may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse$b */
    private static final class C15363b extends ProtoAdapter<TriggerDataCleanResponse> {
        C15363b() {
            super(FieldEncoding.LENGTH_DELIMITED, TriggerDataCleanResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TriggerDataCleanResponse triggerDataCleanResponse) {
            return Cleaned.ADAPTER.asRepeated().encodedSizeWithTag(1, triggerDataCleanResponse.cleaned) + triggerDataCleanResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TriggerDataCleanResponse decode(ProtoReader protoReader) throws IOException {
            C15362a aVar = new C15362a();
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
                    aVar.f40679a.add(Cleaned.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TriggerDataCleanResponse triggerDataCleanResponse) throws IOException {
            Cleaned.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, triggerDataCleanResponse.cleaned);
            protoWriter.writeBytes(triggerDataCleanResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse$a */
    public static final class C15362a extends Message.Builder<TriggerDataCleanResponse, C15362a> {

        /* renamed from: a */
        public List<Cleaned> f40679a = Internal.newMutableList();

        /* renamed from: a */
        public TriggerDataCleanResponse build() {
            return new TriggerDataCleanResponse(this.f40679a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15362a newBuilder() {
        C15362a aVar = new C15362a();
        aVar.f40679a = Internal.copyOf("cleaned", this.cleaned);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TriggerDataCleanResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.cleaned.isEmpty()) {
            sb.append(", cleaned=");
            sb.append(this.cleaned);
        }
        StringBuilder replace = sb.replace(0, 2, "TriggerDataCleanResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TriggerDataCleanResponse(List<Cleaned> list) {
        this(list, ByteString.EMPTY);
    }

    public TriggerDataCleanResponse(List<Cleaned> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cleaned = Internal.immutableCopyOf("cleaned", list);
    }
}
