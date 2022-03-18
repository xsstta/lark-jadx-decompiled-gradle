package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCurrentUserBriefPrimaryCalendarRequest extends Message<GetCurrentUserBriefPrimaryCalendarRequest, C15692a> {
    public static final ProtoAdapter<GetCurrentUserBriefPrimaryCalendarRequest> ADAPTER = new C15693b();
    public static final Boolean DEFAULT_NEED_CURRENT_USER = false;
    private static final long serialVersionUID = 0;
    public final Boolean need_current_user;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCurrentUserBriefPrimaryCalendarRequest$b */
    private static final class C15693b extends ProtoAdapter<GetCurrentUserBriefPrimaryCalendarRequest> {
        C15693b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCurrentUserBriefPrimaryCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCurrentUserBriefPrimaryCalendarRequest getCurrentUserBriefPrimaryCalendarRequest) {
            int i;
            if (getCurrentUserBriefPrimaryCalendarRequest.need_current_user != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getCurrentUserBriefPrimaryCalendarRequest.need_current_user);
            } else {
                i = 0;
            }
            return i + getCurrentUserBriefPrimaryCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCurrentUserBriefPrimaryCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C15692a aVar = new C15692a();
            aVar.f41450a = false;
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
                    aVar.f41450a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCurrentUserBriefPrimaryCalendarRequest getCurrentUserBriefPrimaryCalendarRequest) throws IOException {
            if (getCurrentUserBriefPrimaryCalendarRequest.need_current_user != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getCurrentUserBriefPrimaryCalendarRequest.need_current_user);
            }
            protoWriter.writeBytes(getCurrentUserBriefPrimaryCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCurrentUserBriefPrimaryCalendarRequest$a */
    public static final class C15692a extends Message.Builder<GetCurrentUserBriefPrimaryCalendarRequest, C15692a> {

        /* renamed from: a */
        public Boolean f41450a;

        /* renamed from: a */
        public GetCurrentUserBriefPrimaryCalendarRequest build() {
            return new GetCurrentUserBriefPrimaryCalendarRequest(this.f41450a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15692a newBuilder() {
        C15692a aVar = new C15692a();
        aVar.f41450a = this.need_current_user;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCurrentUserBriefPrimaryCalendarRequest");
        StringBuilder sb = new StringBuilder();
        if (this.need_current_user != null) {
            sb.append(", need_current_user=");
            sb.append(this.need_current_user);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCurrentUserBriefPrimaryCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCurrentUserBriefPrimaryCalendarRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetCurrentUserBriefPrimaryCalendarRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_current_user = bool;
    }
}
