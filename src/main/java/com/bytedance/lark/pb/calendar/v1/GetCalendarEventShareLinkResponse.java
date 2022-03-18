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

public final class GetCalendarEventShareLinkResponse extends Message<GetCalendarEventShareLinkResponse, C15662a> {
    public static final ProtoAdapter<GetCalendarEventShareLinkResponse> ADAPTER = new C15663b();
    public static final ByteString DEFAULT_IMAGE_DATA = ByteString.EMPTY;
    public static final Boolean DEFAULT_USER_CAN_INVITE_ATTENDEE = false;
    private static final long serialVersionUID = 0;
    public final ByteString image_data;
    public final String link_address;
    public final String share_copy;
    public final Boolean user_can_invite_attendee;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventShareLinkResponse$b */
    private static final class C15663b extends ProtoAdapter<GetCalendarEventShareLinkResponse> {
        C15663b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarEventShareLinkResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarEventShareLinkResponse getCalendarEventShareLinkResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarEventShareLinkResponse.link_address);
            int i3 = 0;
            if (getCalendarEventShareLinkResponse.image_data != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(2, getCalendarEventShareLinkResponse.image_data);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getCalendarEventShareLinkResponse.share_copy != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getCalendarEventShareLinkResponse.share_copy);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getCalendarEventShareLinkResponse.user_can_invite_attendee != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getCalendarEventShareLinkResponse.user_can_invite_attendee);
            }
            return i5 + i3 + getCalendarEventShareLinkResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarEventShareLinkResponse decode(ProtoReader protoReader) throws IOException {
            C15662a aVar = new C15662a();
            aVar.f41427a = "";
            aVar.f41428b = ByteString.EMPTY;
            aVar.f41429c = "";
            aVar.f41430d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41427a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41428b = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41429c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41430d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarEventShareLinkResponse getCalendarEventShareLinkResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarEventShareLinkResponse.link_address);
            if (getCalendarEventShareLinkResponse.image_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, getCalendarEventShareLinkResponse.image_data);
            }
            if (getCalendarEventShareLinkResponse.share_copy != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getCalendarEventShareLinkResponse.share_copy);
            }
            if (getCalendarEventShareLinkResponse.user_can_invite_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getCalendarEventShareLinkResponse.user_can_invite_attendee);
            }
            protoWriter.writeBytes(getCalendarEventShareLinkResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15662a newBuilder() {
        C15662a aVar = new C15662a();
        aVar.f41427a = this.link_address;
        aVar.f41428b = this.image_data;
        aVar.f41429c = this.share_copy;
        aVar.f41430d = this.user_can_invite_attendee;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventShareLinkResponse$a */
    public static final class C15662a extends Message.Builder<GetCalendarEventShareLinkResponse, C15662a> {

        /* renamed from: a */
        public String f41427a;

        /* renamed from: b */
        public ByteString f41428b;

        /* renamed from: c */
        public String f41429c;

        /* renamed from: d */
        public Boolean f41430d;

        /* renamed from: a */
        public GetCalendarEventShareLinkResponse build() {
            String str = this.f41427a;
            if (str != null) {
                return new GetCalendarEventShareLinkResponse(str, this.f41428b, this.f41429c, this.f41430d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "link_address");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarEventShareLinkResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", link_address=");
        sb.append(this.link_address);
        if (this.image_data != null) {
            sb.append(", image_data=");
            sb.append(this.image_data);
        }
        if (this.share_copy != null) {
            sb.append(", share_copy=");
            sb.append(this.share_copy);
        }
        if (this.user_can_invite_attendee != null) {
            sb.append(", user_can_invite_attendee=");
            sb.append(this.user_can_invite_attendee);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarEventShareLinkResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarEventShareLinkResponse(String str, ByteString byteString, String str2, Boolean bool) {
        this(str, byteString, str2, bool, ByteString.EMPTY);
    }

    public GetCalendarEventShareLinkResponse(String str, ByteString byteString, String str2, Boolean bool, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.link_address = str;
        this.image_data = byteString;
        this.share_copy = str2;
        this.user_can_invite_attendee = bool;
    }
}
