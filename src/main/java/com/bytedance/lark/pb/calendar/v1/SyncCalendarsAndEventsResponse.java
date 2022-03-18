package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SyncCalendarsAndEventsResponse extends Message<SyncCalendarsAndEventsResponse, C16078a> {
    public static final ProtoAdapter<SyncCalendarsAndEventsResponse> ADAPTER = new C16079b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SyncCalendarsAndEventsResponse$b */
    private static final class C16079b extends ProtoAdapter<SyncCalendarsAndEventsResponse> {
        C16079b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncCalendarsAndEventsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncCalendarsAndEventsResponse syncCalendarsAndEventsResponse) {
            return syncCalendarsAndEventsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SyncCalendarsAndEventsResponse decode(ProtoReader protoReader) throws IOException {
            C16078a aVar = new C16078a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncCalendarsAndEventsResponse syncCalendarsAndEventsResponse) throws IOException {
            protoWriter.writeBytes(syncCalendarsAndEventsResponse.unknownFields());
        }
    }

    public SyncCalendarsAndEventsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SyncCalendarsAndEventsResponse$a */
    public static final class C16078a extends Message.Builder<SyncCalendarsAndEventsResponse, C16078a> {
        /* renamed from: a */
        public SyncCalendarsAndEventsResponse build() {
            return new SyncCalendarsAndEventsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16078a newBuilder() {
        C16078a aVar = new C16078a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SyncCalendarsAndEventsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SyncCalendarsAndEventsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SyncCalendarsAndEventsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
