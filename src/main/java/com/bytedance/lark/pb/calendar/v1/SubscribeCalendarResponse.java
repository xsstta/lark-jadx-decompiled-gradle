package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeCalendarResponse extends Message<SubscribeCalendarResponse, C16070a> {
    public static final ProtoAdapter<SubscribeCalendarResponse> ADAPTER = new C16071b();
    private static final long serialVersionUID = 0;
    public final Calendar calendar;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SubscribeCalendarResponse$b */
    private static final class C16071b extends ProtoAdapter<SubscribeCalendarResponse> {
        C16071b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeCalendarResponse subscribeCalendarResponse) {
            return Calendar.ADAPTER.encodedSizeWithTag(1, subscribeCalendarResponse.calendar) + subscribeCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C16070a aVar = new C16070a();
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
                    aVar.f42159a = Calendar.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeCalendarResponse subscribeCalendarResponse) throws IOException {
            Calendar.ADAPTER.encodeWithTag(protoWriter, 1, subscribeCalendarResponse.calendar);
            protoWriter.writeBytes(subscribeCalendarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SubscribeCalendarResponse$a */
    public static final class C16070a extends Message.Builder<SubscribeCalendarResponse, C16070a> {

        /* renamed from: a */
        public Calendar f42159a;

        /* renamed from: a */
        public SubscribeCalendarResponse build() {
            Calendar calendar = this.f42159a;
            if (calendar != null) {
                return new SubscribeCalendarResponse(calendar, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendar, "calendar");
        }
    }

    @Override // com.squareup.wire.Message
    public C16070a newBuilder() {
        C16070a aVar = new C16070a();
        aVar.f42159a = this.calendar;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SubscribeCalendarResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar=");
        sb.append(this.calendar);
        StringBuilder replace = sb.replace(0, 2, "SubscribeCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeCalendarResponse(Calendar calendar2) {
        this(calendar2, ByteString.EMPTY);
    }

    public SubscribeCalendarResponse(Calendar calendar2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar = calendar2;
    }
}
