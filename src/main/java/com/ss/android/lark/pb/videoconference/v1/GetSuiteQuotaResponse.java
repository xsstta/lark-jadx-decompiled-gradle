package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSuiteQuotaResponse extends Message<GetSuiteQuotaResponse, C50681a> {
    public static final ProtoAdapter<GetSuiteQuotaResponse> ADAPTER = new C50682b();
    public static final Boolean DEFAULT_BREAKOUT_ROOM = false;
    public static final Boolean DEFAULT_INTERPRETATION = false;
    public static final Boolean DEFAULT_PSTN_CALL = false;
    public static final Boolean DEFAULT_SUBTITLE = false;
    public static final Boolean DEFAULT_WAITING_ROOM = false;
    private static final long serialVersionUID = 0;
    public final Boolean breakout_room;
    public final Boolean interpretation;
    public final Boolean pstn_call;
    public final Boolean subtitle;
    public final Boolean waiting_room;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaResponse$b */
    private static final class C50682b extends ProtoAdapter<GetSuiteQuotaResponse> {
        C50682b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSuiteQuotaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSuiteQuotaResponse getSuiteQuotaResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getSuiteQuotaResponse.waiting_room != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getSuiteQuotaResponse.waiting_room);
            } else {
                i = 0;
            }
            if (getSuiteQuotaResponse.interpretation != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getSuiteQuotaResponse.interpretation);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getSuiteQuotaResponse.pstn_call != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getSuiteQuotaResponse.pstn_call);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getSuiteQuotaResponse.subtitle != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getSuiteQuotaResponse.subtitle);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getSuiteQuotaResponse.breakout_room != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getSuiteQuotaResponse.breakout_room);
            }
            return i8 + i5 + getSuiteQuotaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSuiteQuotaResponse decode(ProtoReader protoReader) throws IOException {
            C50681a aVar = new C50681a();
            aVar.f126404a = false;
            aVar.f126405b = false;
            aVar.f126406c = false;
            aVar.f126407d = false;
            aVar.f126408e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126404a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126405b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126406c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f126407d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126408e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSuiteQuotaResponse getSuiteQuotaResponse) throws IOException {
            if (getSuiteQuotaResponse.waiting_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getSuiteQuotaResponse.waiting_room);
            }
            if (getSuiteQuotaResponse.interpretation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getSuiteQuotaResponse.interpretation);
            }
            if (getSuiteQuotaResponse.pstn_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getSuiteQuotaResponse.pstn_call);
            }
            if (getSuiteQuotaResponse.subtitle != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getSuiteQuotaResponse.subtitle);
            }
            if (getSuiteQuotaResponse.breakout_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getSuiteQuotaResponse.breakout_room);
            }
            protoWriter.writeBytes(getSuiteQuotaResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaResponse$a */
    public static final class C50681a extends Message.Builder<GetSuiteQuotaResponse, C50681a> {

        /* renamed from: a */
        public Boolean f126404a;

        /* renamed from: b */
        public Boolean f126405b;

        /* renamed from: c */
        public Boolean f126406c;

        /* renamed from: d */
        public Boolean f126407d;

        /* renamed from: e */
        public Boolean f126408e;

        /* renamed from: a */
        public GetSuiteQuotaResponse build() {
            return new GetSuiteQuotaResponse(this.f126404a, this.f126405b, this.f126406c, this.f126407d, this.f126408e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50681a newBuilder() {
        C50681a aVar = new C50681a();
        aVar.f126404a = this.waiting_room;
        aVar.f126405b = this.interpretation;
        aVar.f126406c = this.pstn_call;
        aVar.f126407d = this.subtitle;
        aVar.f126408e = this.breakout_room;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetSuiteQuotaResponse");
        StringBuilder sb = new StringBuilder();
        if (this.waiting_room != null) {
            sb.append(", waiting_room=");
            sb.append(this.waiting_room);
        }
        if (this.interpretation != null) {
            sb.append(", interpretation=");
            sb.append(this.interpretation);
        }
        if (this.pstn_call != null) {
            sb.append(", pstn_call=");
            sb.append(this.pstn_call);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.breakout_room != null) {
            sb.append(", breakout_room=");
            sb.append(this.breakout_room);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSuiteQuotaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSuiteQuotaResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public GetSuiteQuotaResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.waiting_room = bool;
        this.interpretation = bool2;
        this.pstn_call = bool3;
        this.subtitle = bool4;
        this.breakout_room = bool5;
    }
}
