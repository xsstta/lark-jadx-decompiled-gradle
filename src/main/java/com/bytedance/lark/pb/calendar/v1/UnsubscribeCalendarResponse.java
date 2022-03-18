package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UnsubscribeCalendarResponse extends Message<UnsubscribeCalendarResponse, C16090a> {
    public static final ProtoAdapter<UnsubscribeCalendarResponse> ADAPTER = new C16091b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UnsubscribeCalendarResponse$b */
    private static final class C16091b extends ProtoAdapter<UnsubscribeCalendarResponse> {
        C16091b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnsubscribeCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UnsubscribeCalendarResponse unsubscribeCalendarResponse) {
            return unsubscribeCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UnsubscribeCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C16090a aVar = new C16090a();
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
        public void encode(ProtoWriter protoWriter, UnsubscribeCalendarResponse unsubscribeCalendarResponse) throws IOException {
            protoWriter.writeBytes(unsubscribeCalendarResponse.unknownFields());
        }
    }

    public UnsubscribeCalendarResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UnsubscribeCalendarResponse$a */
    public static final class C16090a extends Message.Builder<UnsubscribeCalendarResponse, C16090a> {
        /* renamed from: a */
        public UnsubscribeCalendarResponse build() {
            return new UnsubscribeCalendarResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16090a newBuilder() {
        C16090a aVar = new C16090a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UnsubscribeCalendarResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UnsubscribeCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UnsubscribeCalendarResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
