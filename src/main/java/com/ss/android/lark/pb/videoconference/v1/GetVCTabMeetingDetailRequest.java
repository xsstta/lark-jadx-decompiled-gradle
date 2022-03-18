package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVCTabMeetingDetailRequest extends Message<GetVCTabMeetingDetailRequest, C50697a> {
    public static final ProtoAdapter<GetVCTabMeetingDetailRequest> ADAPTER = new C50698b();
    public static final Boolean DEFAULT_IS_TRY_LOCAL = false;
    private static final long serialVersionUID = 0;
    public final String history_id;
    public final Boolean is_try_local;
    public final String time_zone;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailRequest$b */
    private static final class C50698b extends ProtoAdapter<GetVCTabMeetingDetailRequest> {
        C50698b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCTabMeetingDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCTabMeetingDetailRequest getVCTabMeetingDetailRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getVCTabMeetingDetailRequest.history_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getVCTabMeetingDetailRequest.history_id);
            } else {
                i = 0;
            }
            if (getVCTabMeetingDetailRequest.time_zone != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getVCTabMeetingDetailRequest.time_zone);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getVCTabMeetingDetailRequest.is_try_local != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getVCTabMeetingDetailRequest.is_try_local);
            }
            return i4 + i3 + getVCTabMeetingDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCTabMeetingDetailRequest decode(ProtoReader protoReader) throws IOException {
            C50697a aVar = new C50697a();
            aVar.f126429a = "";
            aVar.f126430b = "";
            aVar.f126431c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126429a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126430b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126431c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCTabMeetingDetailRequest getVCTabMeetingDetailRequest) throws IOException {
            if (getVCTabMeetingDetailRequest.history_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVCTabMeetingDetailRequest.history_id);
            }
            if (getVCTabMeetingDetailRequest.time_zone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getVCTabMeetingDetailRequest.time_zone);
            }
            if (getVCTabMeetingDetailRequest.is_try_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getVCTabMeetingDetailRequest.is_try_local);
            }
            protoWriter.writeBytes(getVCTabMeetingDetailRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailRequest$a */
    public static final class C50697a extends Message.Builder<GetVCTabMeetingDetailRequest, C50697a> {

        /* renamed from: a */
        public String f126429a;

        /* renamed from: b */
        public String f126430b;

        /* renamed from: c */
        public Boolean f126431c;

        /* renamed from: a */
        public GetVCTabMeetingDetailRequest build() {
            return new GetVCTabMeetingDetailRequest(this.f126429a, this.f126430b, this.f126431c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50697a mo175375a(Boolean bool) {
            this.f126431c = bool;
            return this;
        }

        /* renamed from: b */
        public C50697a mo175378b(String str) {
            this.f126430b = str;
            return this;
        }

        /* renamed from: a */
        public C50697a mo175376a(String str) {
            this.f126429a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50697a newBuilder() {
        C50697a aVar = new C50697a();
        aVar.f126429a = this.history_id;
        aVar.f126430b = this.time_zone;
        aVar.f126431c = this.is_try_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVCTabMeetingDetailRequest");
        StringBuilder sb = new StringBuilder();
        if (this.history_id != null) {
            sb.append(", history_id=");
            sb.append(this.history_id);
        }
        if (this.time_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.time_zone);
        }
        if (this.is_try_local != null) {
            sb.append(", is_try_local=");
            sb.append(this.is_try_local);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCTabMeetingDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCTabMeetingDetailRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public GetVCTabMeetingDetailRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_id = str;
        this.time_zone = str2;
        this.is_try_local = bool;
    }
}
