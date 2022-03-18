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

public final class SubscribeCalendarRequest extends Message<SubscribeCalendarRequest, C16068a> {
    public static final ProtoAdapter<SubscribeCalendarRequest> ADAPTER = new C16069b();
    private static final long serialVersionUID = 0;
    public final String calendar_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SubscribeCalendarRequest$b */
    private static final class C16069b extends ProtoAdapter<SubscribeCalendarRequest> {
        C16069b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeCalendarRequest subscribeCalendarRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, subscribeCalendarRequest.calendar_id) + subscribeCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C16068a aVar = new C16068a();
            aVar.f42158a = "";
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
                    aVar.f42158a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeCalendarRequest subscribeCalendarRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subscribeCalendarRequest.calendar_id);
            protoWriter.writeBytes(subscribeCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SubscribeCalendarRequest$a */
    public static final class C16068a extends Message.Builder<SubscribeCalendarRequest, C16068a> {

        /* renamed from: a */
        public String f42158a;

        /* renamed from: a */
        public SubscribeCalendarRequest build() {
            String str = this.f42158a;
            if (str != null) {
                return new SubscribeCalendarRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "calendar_id");
        }

        /* renamed from: a */
        public C16068a mo57765a(String str) {
            this.f42158a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16068a newBuilder() {
        C16068a aVar = new C16068a();
        aVar.f42158a = this.calendar_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SubscribeCalendarRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        StringBuilder replace = sb.replace(0, 2, "SubscribeCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeCalendarRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SubscribeCalendarRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
    }
}
