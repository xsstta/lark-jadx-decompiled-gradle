package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCurrentUserBriefPrimaryCalendarResponse extends Message<GetCurrentUserBriefPrimaryCalendarResponse, C15694a> {
    public static final ProtoAdapter<GetCurrentUserBriefPrimaryCalendarResponse> ADAPTER = new C15695b();
    private static final long serialVersionUID = 0;
    public final Calendar calendar;
    public final Chatter current_user;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCurrentUserBriefPrimaryCalendarResponse$b */
    private static final class C15695b extends ProtoAdapter<GetCurrentUserBriefPrimaryCalendarResponse> {
        C15695b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCurrentUserBriefPrimaryCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCurrentUserBriefPrimaryCalendarResponse getCurrentUserBriefPrimaryCalendarResponse) {
            int i;
            int i2 = 0;
            if (getCurrentUserBriefPrimaryCalendarResponse.calendar != null) {
                i = Calendar.ADAPTER.encodedSizeWithTag(1, getCurrentUserBriefPrimaryCalendarResponse.calendar);
            } else {
                i = 0;
            }
            if (getCurrentUserBriefPrimaryCalendarResponse.current_user != null) {
                i2 = Chatter.ADAPTER.encodedSizeWithTag(2, getCurrentUserBriefPrimaryCalendarResponse.current_user);
            }
            return i + i2 + getCurrentUserBriefPrimaryCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCurrentUserBriefPrimaryCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C15694a aVar = new C15694a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41451a = Calendar.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41452b = Chatter.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCurrentUserBriefPrimaryCalendarResponse getCurrentUserBriefPrimaryCalendarResponse) throws IOException {
            if (getCurrentUserBriefPrimaryCalendarResponse.calendar != null) {
                Calendar.ADAPTER.encodeWithTag(protoWriter, 1, getCurrentUserBriefPrimaryCalendarResponse.calendar);
            }
            if (getCurrentUserBriefPrimaryCalendarResponse.current_user != null) {
                Chatter.ADAPTER.encodeWithTag(protoWriter, 2, getCurrentUserBriefPrimaryCalendarResponse.current_user);
            }
            protoWriter.writeBytes(getCurrentUserBriefPrimaryCalendarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCurrentUserBriefPrimaryCalendarResponse$a */
    public static final class C15694a extends Message.Builder<GetCurrentUserBriefPrimaryCalendarResponse, C15694a> {

        /* renamed from: a */
        public Calendar f41451a;

        /* renamed from: b */
        public Chatter f41452b;

        /* renamed from: a */
        public GetCurrentUserBriefPrimaryCalendarResponse build() {
            return new GetCurrentUserBriefPrimaryCalendarResponse(this.f41451a, this.f41452b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15694a newBuilder() {
        C15694a aVar = new C15694a();
        aVar.f41451a = this.calendar;
        aVar.f41452b = this.current_user;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCurrentUserBriefPrimaryCalendarResponse");
        StringBuilder sb = new StringBuilder();
        if (this.calendar != null) {
            sb.append(", calendar=");
            sb.append(this.calendar);
        }
        if (this.current_user != null) {
            sb.append(", current_user=");
            sb.append(this.current_user);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCurrentUserBriefPrimaryCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCurrentUserBriefPrimaryCalendarResponse(Calendar calendar2, Chatter chatter) {
        this(calendar2, chatter, ByteString.EMPTY);
    }

    public GetCurrentUserBriefPrimaryCalendarResponse(Calendar calendar2, Chatter chatter, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar = calendar2;
        this.current_user = chatter;
    }
}
