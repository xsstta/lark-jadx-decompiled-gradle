package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetAddFriendPrivateConfigResponse extends Message<GetAddFriendPrivateConfigResponse, C19137a> {
    public static final ProtoAdapter<GetAddFriendPrivateConfigResponse> ADAPTER = new C19138b();
    public static final Boolean DEFAULT_LOGINCPDIFF = false;
    private static final long serialVersionUID = 0;
    public final String DocLink;
    public final Boolean LoginCPDiff;
    public final WayToAddMeSetting add_me_setting;
    public final List<WayToFindMeSettingItem> find_me_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigResponse$b */
    private static final class C19138b extends ProtoAdapter<GetAddFriendPrivateConfigResponse> {
        C19138b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAddFriendPrivateConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAddFriendPrivateConfigResponse getAddFriendPrivateConfigResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getAddFriendPrivateConfigResponse.add_me_setting != null) {
                i = WayToAddMeSetting.ADAPTER.encodedSizeWithTag(1, getAddFriendPrivateConfigResponse.add_me_setting);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + WayToFindMeSettingItem.ADAPTER.asRepeated().encodedSizeWithTag(2, getAddFriendPrivateConfigResponse.find_me_setting);
            if (getAddFriendPrivateConfigResponse.LoginCPDiff != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getAddFriendPrivateConfigResponse.LoginCPDiff);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (getAddFriendPrivateConfigResponse.DocLink != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getAddFriendPrivateConfigResponse.DocLink);
            }
            return i4 + i3 + getAddFriendPrivateConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAddFriendPrivateConfigResponse decode(ProtoReader protoReader) throws IOException {
            C19137a aVar = new C19137a();
            aVar.f47278c = false;
            aVar.f47279d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47276a = WayToAddMeSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47277b.add(WayToFindMeSettingItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f47278c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47279d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAddFriendPrivateConfigResponse getAddFriendPrivateConfigResponse) throws IOException {
            if (getAddFriendPrivateConfigResponse.add_me_setting != null) {
                WayToAddMeSetting.ADAPTER.encodeWithTag(protoWriter, 1, getAddFriendPrivateConfigResponse.add_me_setting);
            }
            WayToFindMeSettingItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getAddFriendPrivateConfigResponse.find_me_setting);
            if (getAddFriendPrivateConfigResponse.LoginCPDiff != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getAddFriendPrivateConfigResponse.LoginCPDiff);
            }
            if (getAddFriendPrivateConfigResponse.DocLink != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getAddFriendPrivateConfigResponse.DocLink);
            }
            protoWriter.writeBytes(getAddFriendPrivateConfigResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigResponse$a */
    public static final class C19137a extends Message.Builder<GetAddFriendPrivateConfigResponse, C19137a> {

        /* renamed from: a */
        public WayToAddMeSetting f47276a;

        /* renamed from: b */
        public List<WayToFindMeSettingItem> f47277b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f47278c;

        /* renamed from: d */
        public String f47279d;

        /* renamed from: a */
        public GetAddFriendPrivateConfigResponse build() {
            return new GetAddFriendPrivateConfigResponse(this.f47276a, this.f47277b, this.f47278c, this.f47279d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19137a newBuilder() {
        C19137a aVar = new C19137a();
        aVar.f47276a = this.add_me_setting;
        aVar.f47277b = Internal.copyOf("find_me_setting", this.find_me_setting);
        aVar.f47278c = this.LoginCPDiff;
        aVar.f47279d = this.DocLink;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetAddFriendPrivateConfigResponse");
        StringBuilder sb = new StringBuilder();
        if (this.add_me_setting != null) {
            sb.append(", add_me_setting=");
            sb.append(this.add_me_setting);
        }
        if (!this.find_me_setting.isEmpty()) {
            sb.append(", find_me_setting=");
            sb.append(this.find_me_setting);
        }
        if (this.LoginCPDiff != null) {
            sb.append(", LoginCPDiff=");
            sb.append(this.LoginCPDiff);
        }
        if (this.DocLink != null) {
            sb.append(", DocLink=");
            sb.append(this.DocLink);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAddFriendPrivateConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAddFriendPrivateConfigResponse(WayToAddMeSetting wayToAddMeSetting, List<WayToFindMeSettingItem> list, Boolean bool, String str) {
        this(wayToAddMeSetting, list, bool, str, ByteString.EMPTY);
    }

    public GetAddFriendPrivateConfigResponse(WayToAddMeSetting wayToAddMeSetting, List<WayToFindMeSettingItem> list, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.add_me_setting = wayToAddMeSetting;
        this.find_me_setting = Internal.immutableCopyOf("find_me_setting", list);
        this.LoginCPDiff = bool;
        this.DocLink = str;
    }
}
