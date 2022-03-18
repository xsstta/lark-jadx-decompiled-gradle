package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.UserInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ContactPointUserInfo extends Message<ContactPointUserInfo, C16426a> {
    public static final ProtoAdapter<ContactPointUserInfo> ADAPTER = new C16427b();
    public static final UserContactStatus DEFAULT_CONTACT_STATUS = UserContactStatus.CONTACT_STATUS_NOT_FRIEND;
    public static final Boolean DEFAULT_SHOULD_HIDDEN = false;
    private static final long serialVersionUID = 0;
    public final String contact_point;
    public final UserContactStatus contact_status;
    public final Boolean should_hidden;
    public final UserInfo user_info;

    /* renamed from: com.bytedance.lark.pb.contact.v2.ContactPointUserInfo$b */
    private static final class C16427b extends ProtoAdapter<ContactPointUserInfo> {
        C16427b() {
            super(FieldEncoding.LENGTH_DELIMITED, ContactPointUserInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ContactPointUserInfo contactPointUserInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, contactPointUserInfo.contact_point) + UserInfo.ADAPTER.encodedSizeWithTag(2, contactPointUserInfo.user_info);
            int i2 = 0;
            if (contactPointUserInfo.contact_status != null) {
                i = UserContactStatus.ADAPTER.encodedSizeWithTag(3, contactPointUserInfo.contact_status);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (contactPointUserInfo.should_hidden != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, contactPointUserInfo.should_hidden);
            }
            return i3 + i2 + contactPointUserInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ContactPointUserInfo decode(ProtoReader protoReader) throws IOException {
            C16426a aVar = new C16426a();
            aVar.f42723a = "";
            aVar.f42725c = UserContactStatus.CONTACT_STATUS_NOT_FRIEND;
            aVar.f42726d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42723a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42724b = UserInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f42725c = UserContactStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42726d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ContactPointUserInfo contactPointUserInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contactPointUserInfo.contact_point);
            UserInfo.ADAPTER.encodeWithTag(protoWriter, 2, contactPointUserInfo.user_info);
            if (contactPointUserInfo.contact_status != null) {
                UserContactStatus.ADAPTER.encodeWithTag(protoWriter, 3, contactPointUserInfo.contact_status);
            }
            if (contactPointUserInfo.should_hidden != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, contactPointUserInfo.should_hidden);
            }
            protoWriter.writeBytes(contactPointUserInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16426a newBuilder() {
        C16426a aVar = new C16426a();
        aVar.f42723a = this.contact_point;
        aVar.f42724b = this.user_info;
        aVar.f42725c = this.contact_status;
        aVar.f42726d = this.should_hidden;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.ContactPointUserInfo$a */
    public static final class C16426a extends Message.Builder<ContactPointUserInfo, C16426a> {

        /* renamed from: a */
        public String f42723a;

        /* renamed from: b */
        public UserInfo f42724b;

        /* renamed from: c */
        public UserContactStatus f42725c;

        /* renamed from: d */
        public Boolean f42726d;

        /* renamed from: a */
        public ContactPointUserInfo build() {
            UserInfo userInfo;
            String str = this.f42723a;
            if (str != null && (userInfo = this.f42724b) != null) {
                return new ContactPointUserInfo(str, userInfo, this.f42725c, this.f42726d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "contact_point", this.f42724b, "user_info");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ContactPointUserInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", contact_point=");
        sb.append(this.contact_point);
        sb.append(", user_info=");
        sb.append(this.user_info);
        if (this.contact_status != null) {
            sb.append(", contact_status=");
            sb.append(this.contact_status);
        }
        if (this.should_hidden != null) {
            sb.append(", should_hidden=");
            sb.append(this.should_hidden);
        }
        StringBuilder replace = sb.replace(0, 2, "ContactPointUserInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ContactPointUserInfo(String str, UserInfo userInfo, UserContactStatus userContactStatus, Boolean bool) {
        this(str, userInfo, userContactStatus, bool, ByteString.EMPTY);
    }

    public ContactPointUserInfo(String str, UserInfo userInfo, UserContactStatus userContactStatus, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contact_point = str;
        this.user_info = userInfo;
        this.contact_status = userContactStatus;
        this.should_hidden = bool;
    }
}
