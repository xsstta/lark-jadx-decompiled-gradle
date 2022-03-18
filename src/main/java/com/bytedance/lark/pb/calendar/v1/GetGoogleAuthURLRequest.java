package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetGoogleAuthURLRequest extends Message<GetGoogleAuthURLRequest, C15708a> {
    public static final ProtoAdapter<GetGoogleAuthURLRequest> ADAPTER = new C15709b();
    public static final Boolean DEFAULT_ENABLE_GMAIL = false;
    public static final Boolean DEFAULT_FORCE_ENABLE_MAIL_INVITATION = false;
    public static final Boolean DEFAULT_MAIL_ENTRY = false;
    private static final long serialVersionUID = 0;
    public final Boolean enable_gmail;
    public final Boolean force_enable_mail_invitation;
    public final Boolean mail_entry;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetGoogleAuthURLRequest$b */
    private static final class C15709b extends ProtoAdapter<GetGoogleAuthURLRequest> {
        C15709b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGoogleAuthURLRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGoogleAuthURLRequest getGoogleAuthURLRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getGoogleAuthURLRequest.mail_entry != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getGoogleAuthURLRequest.mail_entry);
            } else {
                i = 0;
            }
            if (getGoogleAuthURLRequest.enable_gmail != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getGoogleAuthURLRequest.enable_gmail);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getGoogleAuthURLRequest.force_enable_mail_invitation != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getGoogleAuthURLRequest.force_enable_mail_invitation);
            }
            return i4 + i3 + getGoogleAuthURLRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetGoogleAuthURLRequest decode(ProtoReader protoReader) throws IOException {
            C15708a aVar = new C15708a();
            aVar.f41466a = false;
            aVar.f41467b = false;
            aVar.f41468c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41466a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41467b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41468c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetGoogleAuthURLRequest getGoogleAuthURLRequest) throws IOException {
            if (getGoogleAuthURLRequest.mail_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getGoogleAuthURLRequest.mail_entry);
            }
            if (getGoogleAuthURLRequest.enable_gmail != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getGoogleAuthURLRequest.enable_gmail);
            }
            if (getGoogleAuthURLRequest.force_enable_mail_invitation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getGoogleAuthURLRequest.force_enable_mail_invitation);
            }
            protoWriter.writeBytes(getGoogleAuthURLRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetGoogleAuthURLRequest$a */
    public static final class C15708a extends Message.Builder<GetGoogleAuthURLRequest, C15708a> {

        /* renamed from: a */
        public Boolean f41466a;

        /* renamed from: b */
        public Boolean f41467b;

        /* renamed from: c */
        public Boolean f41468c;

        /* renamed from: a */
        public GetGoogleAuthURLRequest build() {
            return new GetGoogleAuthURLRequest(this.f41466a, this.f41467b, this.f41468c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15708a newBuilder() {
        C15708a aVar = new C15708a();
        aVar.f41466a = this.mail_entry;
        aVar.f41467b = this.enable_gmail;
        aVar.f41468c = this.force_enable_mail_invitation;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetGoogleAuthURLRequest");
        StringBuilder sb = new StringBuilder();
        if (this.mail_entry != null) {
            sb.append(", mail_entry=");
            sb.append(this.mail_entry);
        }
        if (this.enable_gmail != null) {
            sb.append(", enable_gmail=");
            sb.append(this.enable_gmail);
        }
        if (this.force_enable_mail_invitation != null) {
            sb.append(", force_enable_mail_invitation=");
            sb.append(this.force_enable_mail_invitation);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGoogleAuthURLRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetGoogleAuthURLRequest(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public GetGoogleAuthURLRequest(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mail_entry = bool;
        this.enable_gmail = bool2;
        this.force_enable_mail_invitation = bool3;
    }
}
