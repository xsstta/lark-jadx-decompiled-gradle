package com.ss.android.lark.pb.calendars;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarIDByShareTokenRequest extends Message<GetCalendarIDByShareTokenRequest, C49570a> {
    public static final ProtoAdapter<GetCalendarIDByShareTokenRequest> ADAPTER = new C49571b();
    private static final long serialVersionUID = 0;
    public final String mshare_token;

    /* renamed from: com.ss.android.lark.pb.calendars.GetCalendarIDByShareTokenRequest$b */
    private static final class C49571b extends ProtoAdapter<GetCalendarIDByShareTokenRequest> {
        C49571b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarIDByShareTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarIDByShareTokenRequest getCalendarIDByShareTokenRequest) {
            int i;
            if (getCalendarIDByShareTokenRequest.mshare_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarIDByShareTokenRequest.mshare_token);
            } else {
                i = 0;
            }
            return i + getCalendarIDByShareTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarIDByShareTokenRequest decode(ProtoReader protoReader) throws IOException {
            C49570a aVar = new C49570a();
            aVar.f124186a = "";
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
                    aVar.f124186a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarIDByShareTokenRequest getCalendarIDByShareTokenRequest) throws IOException {
            if (getCalendarIDByShareTokenRequest.mshare_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarIDByShareTokenRequest.mshare_token);
            }
            protoWriter.writeBytes(getCalendarIDByShareTokenRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendars.GetCalendarIDByShareTokenRequest$a */
    public static final class C49570a extends Message.Builder<GetCalendarIDByShareTokenRequest, C49570a> {

        /* renamed from: a */
        public String f124186a;

        /* renamed from: a */
        public GetCalendarIDByShareTokenRequest build() {
            return new GetCalendarIDByShareTokenRequest(this.f124186a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49570a mo172854a(String str) {
            this.f124186a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49570a newBuilder() {
        C49570a aVar = new C49570a();
        aVar.f124186a = this.mshare_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mshare_token != null) {
            sb.append(", share_token=");
            sb.append(this.mshare_token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarIDByShareTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarIDByShareTokenRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCalendarIDByShareTokenRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mshare_token = str;
    }
}
