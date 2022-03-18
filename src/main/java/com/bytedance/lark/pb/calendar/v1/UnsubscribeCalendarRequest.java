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

public final class UnsubscribeCalendarRequest extends Message<UnsubscribeCalendarRequest, C16088a> {
    public static final ProtoAdapter<UnsubscribeCalendarRequest> ADAPTER = new C16089b();
    private static final long serialVersionUID = 0;
    public final String calendar_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UnsubscribeCalendarRequest$b */
    private static final class C16089b extends ProtoAdapter<UnsubscribeCalendarRequest> {
        C16089b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnsubscribeCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UnsubscribeCalendarRequest unsubscribeCalendarRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, unsubscribeCalendarRequest.calendar_id) + unsubscribeCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UnsubscribeCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C16088a aVar = new C16088a();
            aVar.f42176a = "";
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
                    aVar.f42176a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnsubscribeCalendarRequest unsubscribeCalendarRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unsubscribeCalendarRequest.calendar_id);
            protoWriter.writeBytes(unsubscribeCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UnsubscribeCalendarRequest$a */
    public static final class C16088a extends Message.Builder<UnsubscribeCalendarRequest, C16088a> {

        /* renamed from: a */
        public String f42176a;

        /* renamed from: a */
        public UnsubscribeCalendarRequest build() {
            String str = this.f42176a;
            if (str != null) {
                return new UnsubscribeCalendarRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "calendar_id");
        }

        /* renamed from: a */
        public C16088a mo57815a(String str) {
            this.f42176a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16088a newBuilder() {
        C16088a aVar = new C16088a();
        aVar.f42176a = this.calendar_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UnsubscribeCalendarRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        StringBuilder replace = sb.replace(0, 2, "UnsubscribeCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UnsubscribeCalendarRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UnsubscribeCalendarRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
    }
}
