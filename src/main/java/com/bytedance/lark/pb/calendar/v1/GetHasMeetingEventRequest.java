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

public final class GetHasMeetingEventRequest extends Message<GetHasMeetingEventRequest, C15712a> {
    public static final ProtoAdapter<GetHasMeetingEventRequest> ADAPTER = new C15713b();
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetHasMeetingEventRequest$b */
    private static final class C15713b extends ProtoAdapter<GetHasMeetingEventRequest> {
        C15713b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHasMeetingEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHasMeetingEventRequest getHasMeetingEventRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getHasMeetingEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getHasMeetingEventRequest.key) + getHasMeetingEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHasMeetingEventRequest decode(ProtoReader protoReader) throws IOException {
            C15712a aVar = new C15712a();
            aVar.f41471a = "";
            aVar.f41472b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41471a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41472b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHasMeetingEventRequest getHasMeetingEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getHasMeetingEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getHasMeetingEventRequest.key);
            protoWriter.writeBytes(getHasMeetingEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15712a newBuilder() {
        C15712a aVar = new C15712a();
        aVar.f41471a = this.calendar_id;
        aVar.f41472b = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetHasMeetingEventRequest$a */
    public static final class C15712a extends Message.Builder<GetHasMeetingEventRequest, C15712a> {

        /* renamed from: a */
        public String f41471a;

        /* renamed from: b */
        public String f41472b;

        /* renamed from: a */
        public GetHasMeetingEventRequest build() {
            String str;
            String str2 = this.f41471a;
            if (str2 != null && (str = this.f41472b) != null) {
                return new GetHasMeetingEventRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41472b, "key");
        }

        /* renamed from: a */
        public C15712a mo56844a(String str) {
            this.f41471a = str;
            return this;
        }

        /* renamed from: b */
        public C15712a mo56846b(String str) {
            this.f41472b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetHasMeetingEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "GetHasMeetingEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHasMeetingEventRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetHasMeetingEventRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
    }
}
