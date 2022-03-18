package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SyncCalendarsAndEventsRequest extends Message<SyncCalendarsAndEventsRequest, C16076a> {
    public static final ProtoAdapter<SyncCalendarsAndEventsRequest> ADAPTER = new C16077b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SyncCalendarsAndEventsRequest$b */
    private static final class C16077b extends ProtoAdapter<SyncCalendarsAndEventsRequest> {
        C16077b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncCalendarsAndEventsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncCalendarsAndEventsRequest syncCalendarsAndEventsRequest) {
            return syncCalendarsAndEventsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SyncCalendarsAndEventsRequest decode(ProtoReader protoReader) throws IOException {
            C16076a aVar = new C16076a();
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
        public void encode(ProtoWriter protoWriter, SyncCalendarsAndEventsRequest syncCalendarsAndEventsRequest) throws IOException {
            protoWriter.writeBytes(syncCalendarsAndEventsRequest.unknownFields());
        }
    }

    public SyncCalendarsAndEventsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SyncCalendarsAndEventsRequest$a */
    public static final class C16076a extends Message.Builder<SyncCalendarsAndEventsRequest, C16076a> {
        /* renamed from: a */
        public SyncCalendarsAndEventsRequest build() {
            return new SyncCalendarsAndEventsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16076a newBuilder() {
        C16076a aVar = new C16076a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SyncCalendarsAndEventsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SyncCalendarsAndEventsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SyncCalendarsAndEventsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
