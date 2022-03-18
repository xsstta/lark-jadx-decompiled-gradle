package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class InstanceSpan extends Message<InstanceSpan, C15818a> {
    public static final ProtoAdapter<InstanceSpan> ADAPTER = new C15819b();
    public static final Integer DEFAULT_END_DAY = 0;
    public static final Integer DEFAULT_END_MINUTE = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_START_DAY = 0;
    public static final Integer DEFAULT_START_MINUTE = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer end_day;
    public final Integer end_minute;
    public final Long end_time;
    public final Integer start_day;
    public final Integer start_minute;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceSpan$b */
    private static final class C15819b extends ProtoAdapter<InstanceSpan> {
        C15819b() {
            super(FieldEncoding.LENGTH_DELIMITED, InstanceSpan.class);
        }

        /* renamed from: a */
        public int encodedSize(InstanceSpan instanceSpan) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (instanceSpan.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, instanceSpan.start_time);
            } else {
                i = 0;
            }
            if (instanceSpan.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, instanceSpan.end_time);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (instanceSpan.start_day != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, instanceSpan.start_day);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (instanceSpan.end_day != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, instanceSpan.end_day);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (instanceSpan.start_minute != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, instanceSpan.start_minute);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (instanceSpan.end_minute != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, instanceSpan.end_minute);
            }
            return i10 + i6 + instanceSpan.unknownFields().size();
        }

        /* renamed from: a */
        public InstanceSpan decode(ProtoReader protoReader) throws IOException {
            C15818a aVar = new C15818a();
            aVar.f41608a = 0L;
            aVar.f41609b = 0L;
            aVar.f41610c = 0;
            aVar.f41611d = 0;
            aVar.f41612e = 0;
            aVar.f41613f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41608a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41609b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41610c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41611d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41612e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41613f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InstanceSpan instanceSpan) throws IOException {
            if (instanceSpan.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, instanceSpan.start_time);
            }
            if (instanceSpan.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, instanceSpan.end_time);
            }
            if (instanceSpan.start_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, instanceSpan.start_day);
            }
            if (instanceSpan.end_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, instanceSpan.end_day);
            }
            if (instanceSpan.start_minute != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, instanceSpan.start_minute);
            }
            if (instanceSpan.end_minute != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, instanceSpan.end_minute);
            }
            protoWriter.writeBytes(instanceSpan.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceSpan$a */
    public static final class C15818a extends Message.Builder<InstanceSpan, C15818a> {

        /* renamed from: a */
        public Long f41608a;

        /* renamed from: b */
        public Long f41609b;

        /* renamed from: c */
        public Integer f41610c;

        /* renamed from: d */
        public Integer f41611d;

        /* renamed from: e */
        public Integer f41612e;

        /* renamed from: f */
        public Integer f41613f;

        /* renamed from: a */
        public InstanceSpan build() {
            return new InstanceSpan(this.f41608a, this.f41609b, this.f41610c, this.f41611d, this.f41612e, this.f41613f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15818a newBuilder() {
        C15818a aVar = new C15818a();
        aVar.f41608a = this.start_time;
        aVar.f41609b = this.end_time;
        aVar.f41610c = this.start_day;
        aVar.f41611d = this.end_day;
        aVar.f41612e = this.start_minute;
        aVar.f41613f = this.end_minute;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "InstanceSpan");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.start_day != null) {
            sb.append(", start_day=");
            sb.append(this.start_day);
        }
        if (this.end_day != null) {
            sb.append(", end_day=");
            sb.append(this.end_day);
        }
        if (this.start_minute != null) {
            sb.append(", start_minute=");
            sb.append(this.start_minute);
        }
        if (this.end_minute != null) {
            sb.append(", end_minute=");
            sb.append(this.end_minute);
        }
        StringBuilder replace = sb.replace(0, 2, "InstanceSpan{");
        replace.append('}');
        return replace.toString();
    }

    public InstanceSpan(Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4) {
        this(l, l2, num, num2, num3, num4, ByteString.EMPTY);
    }

    public InstanceSpan(Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.start_day = num;
        this.end_day = num2;
        this.start_minute = num3;
        this.end_minute = num4;
    }
}
