package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MeetingRoomFilter extends Message<MeetingRoomFilter, C15872a> {
    public static final ProtoAdapter<MeetingRoomFilter> ADAPTER = new C15873b();
    public static final Integer DEFAULT_MIN_CAPACITY = 0;
    private static final long serialVersionUID = 0;
    public final Integer min_capacity;
    public final List<String> need_equipments;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter$b */
    private static final class C15873b extends ProtoAdapter<MeetingRoomFilter> {
        C15873b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingRoomFilter.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingRoomFilter meetingRoomFilter) {
            int i;
            if (meetingRoomFilter.min_capacity != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, meetingRoomFilter.min_capacity);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, meetingRoomFilter.need_equipments) + meetingRoomFilter.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingRoomFilter decode(ProtoReader protoReader) throws IOException {
            C15872a aVar = new C15872a();
            aVar.f41702a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41702a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41703b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingRoomFilter meetingRoomFilter) throws IOException {
            if (meetingRoomFilter.min_capacity != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, meetingRoomFilter.min_capacity);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, meetingRoomFilter.need_equipments);
            protoWriter.writeBytes(meetingRoomFilter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter$a */
    public static final class C15872a extends Message.Builder<MeetingRoomFilter, C15872a> {

        /* renamed from: a */
        public Integer f41702a;

        /* renamed from: b */
        public List<String> f41703b = Internal.newMutableList();

        /* renamed from: a */
        public MeetingRoomFilter build() {
            return new MeetingRoomFilter(this.f41702a, this.f41703b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15872a mo57258a(Integer num) {
            this.f41702a = num;
            return this;
        }

        /* renamed from: a */
        public C15872a mo57259a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41703b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15872a newBuilder() {
        C15872a aVar = new C15872a();
        aVar.f41702a = this.min_capacity;
        aVar.f41703b = Internal.copyOf("need_equipments", this.need_equipments);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingRoomFilter");
        StringBuilder sb = new StringBuilder();
        if (this.min_capacity != null) {
            sb.append(", min_capacity=");
            sb.append(this.min_capacity);
        }
        if (!this.need_equipments.isEmpty()) {
            sb.append(", need_equipments=");
            sb.append(this.need_equipments);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingRoomFilter{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingRoomFilter(Integer num, List<String> list) {
        this(num, list, ByteString.EMPTY);
    }

    public MeetingRoomFilter(Integer num, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.min_capacity = num;
        this.need_equipments = Internal.immutableCopyOf("need_equipments", list);
    }
}
