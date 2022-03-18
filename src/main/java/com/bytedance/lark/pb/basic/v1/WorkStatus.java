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

public final class WorkStatus extends Message<WorkStatus, C15446a> {
    public static final ProtoAdapter<WorkStatus> ADAPTER = new C15447b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Status DEFAULT_STATUS = Status.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String description;
    public final Long end_time;
    public final Long start_time;
    public final Status status;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        ON_LEAVE(1),
        ON_MEETING(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ON_LEAVE;
            }
            if (i != 2) {
                return null;
            }
            return ON_MEETING;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.WorkStatus$b */
    private static final class C15447b extends ProtoAdapter<WorkStatus> {
        C15447b() {
            super(FieldEncoding.LENGTH_DELIMITED, WorkStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(WorkStatus workStatus) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (workStatus.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, workStatus.status);
            } else {
                i = 0;
            }
            if (workStatus.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, workStatus.description);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (workStatus.start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, workStatus.start_time);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (workStatus.end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, workStatus.end_time);
            }
            return i6 + i4 + workStatus.unknownFields().size();
        }

        /* renamed from: a */
        public WorkStatus decode(ProtoReader protoReader) throws IOException {
            C15446a aVar = new C15446a();
            aVar.f40900a = Status.UNKNOWN;
            aVar.f40901b = "";
            aVar.f40902c = 0L;
            aVar.f40903d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40900a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40901b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40902c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40903d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WorkStatus workStatus) throws IOException {
            if (workStatus.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, workStatus.status);
            }
            if (workStatus.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, workStatus.description);
            }
            if (workStatus.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, workStatus.start_time);
            }
            if (workStatus.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, workStatus.end_time);
            }
            protoWriter.writeBytes(workStatus.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.WorkStatus$a */
    public static final class C15446a extends Message.Builder<WorkStatus, C15446a> {

        /* renamed from: a */
        public Status f40900a;

        /* renamed from: b */
        public String f40901b;

        /* renamed from: c */
        public Long f40902c;

        /* renamed from: d */
        public Long f40903d;

        /* renamed from: a */
        public WorkStatus build() {
            return new WorkStatus(this.f40900a, this.f40901b, this.f40902c, this.f40903d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15446a newBuilder() {
        C15446a aVar = new C15446a();
        aVar.f40900a = this.status;
        aVar.f40901b = this.description;
        aVar.f40902c = this.start_time;
        aVar.f40903d = this.end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "WorkStatus");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "WorkStatus{");
        replace.append('}');
        return replace.toString();
    }

    public WorkStatus(Status status2, String str, Long l, Long l2) {
        this(status2, str, l, l2, ByteString.EMPTY);
    }

    public WorkStatus(Status status2, String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.description = str;
        this.start_time = l;
        this.end_time = l2;
    }
}
