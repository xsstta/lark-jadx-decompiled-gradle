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

public final class PushRoomViewInstanceChangeNotification extends Message<PushRoomViewInstanceChangeNotification, C15964a> {
    public static final ProtoAdapter<PushRoomViewInstanceChangeNotification> ADAPTER = new C15965b();
    private static final long serialVersionUID = 0;
    public final List<String> resource_calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushRoomViewInstanceChangeNotification$b */
    private static final class C15965b extends ProtoAdapter<PushRoomViewInstanceChangeNotification> {
        C15965b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushRoomViewInstanceChangeNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushRoomViewInstanceChangeNotification pushRoomViewInstanceChangeNotification) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pushRoomViewInstanceChangeNotification.resource_calendar_ids) + pushRoomViewInstanceChangeNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushRoomViewInstanceChangeNotification decode(ProtoReader protoReader) throws IOException {
            C15964a aVar = new C15964a();
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
                    aVar.f41967a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushRoomViewInstanceChangeNotification pushRoomViewInstanceChangeNotification) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pushRoomViewInstanceChangeNotification.resource_calendar_ids);
            protoWriter.writeBytes(pushRoomViewInstanceChangeNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushRoomViewInstanceChangeNotification$a */
    public static final class C15964a extends Message.Builder<PushRoomViewInstanceChangeNotification, C15964a> {

        /* renamed from: a */
        public List<String> f41967a = Internal.newMutableList();

        /* renamed from: a */
        public PushRoomViewInstanceChangeNotification build() {
            return new PushRoomViewInstanceChangeNotification(this.f41967a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15964a newBuilder() {
        C15964a aVar = new C15964a();
        aVar.f41967a = Internal.copyOf("resource_calendar_ids", this.resource_calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushRoomViewInstanceChangeNotification");
        StringBuilder sb = new StringBuilder();
        if (!this.resource_calendar_ids.isEmpty()) {
            sb.append(", resource_calendar_ids=");
            sb.append(this.resource_calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushRoomViewInstanceChangeNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushRoomViewInstanceChangeNotification(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PushRoomViewInstanceChangeNotification(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_calendar_ids = Internal.immutableCopyOf("resource_calendar_ids", list);
    }
}
