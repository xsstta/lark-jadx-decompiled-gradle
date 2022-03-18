package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarGroupRequest extends Message<GetCalendarGroupRequest, C50609a> {
    public static final ProtoAdapter<GetCalendarGroupRequest> ADAPTER = new C50610b();
    public static final Boolean DEFAULT_AUTO_CREATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean auto_create;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGroupRequest$b */
    private static final class C50610b extends ProtoAdapter<GetCalendarGroupRequest> {
        C50610b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarGroupRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarGroupRequest getCalendarGroupRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarGroupRequest.meeting_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getCalendarGroupRequest.auto_create) + getCalendarGroupRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarGroupRequest decode(ProtoReader protoReader) throws IOException {
            C50609a aVar = new C50609a();
            aVar.f126343a = "";
            aVar.f126344b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126343a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126344b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarGroupRequest getCalendarGroupRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarGroupRequest.meeting_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCalendarGroupRequest.auto_create);
            protoWriter.writeBytes(getCalendarGroupRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50609a newBuilder() {
        C50609a aVar = new C50609a();
        aVar.f126343a = this.meeting_id;
        aVar.f126344b = this.auto_create;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGroupRequest$a */
    public static final class C50609a extends Message.Builder<GetCalendarGroupRequest, C50609a> {

        /* renamed from: a */
        public String f126343a;

        /* renamed from: b */
        public Boolean f126344b;

        /* renamed from: a */
        public GetCalendarGroupRequest build() {
            Boolean bool;
            String str = this.f126343a;
            if (str != null && (bool = this.f126344b) != null) {
                return new GetCalendarGroupRequest(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id", this.f126344b, "auto_create");
        }

        /* renamed from: a */
        public C50609a mo175190a(Boolean bool) {
            this.f126344b = bool;
            return this;
        }

        /* renamed from: a */
        public C50609a mo175191a(String str) {
            this.f126343a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarGroupRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", auto_create=");
        sb.append(this.auto_create);
        StringBuilder replace = sb.replace(0, 2, "GetCalendarGroupRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarGroupRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public GetCalendarGroupRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.auto_create = bool;
    }
}
