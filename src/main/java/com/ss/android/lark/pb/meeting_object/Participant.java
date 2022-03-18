package com.ss.android.lark.pb.meeting_object;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Participant extends Message<Participant, C49864a> {
    public static final ProtoAdapter<Participant> ADAPTER = new C49865b();
    public static final Boolean DEFAULT_IS_EXTERNAL = false;
    public static final Boolean DEFAULT_IS_HOST_USER = false;
    public static final Boolean DEFAULT_IS_IN_PARTICIPANTS = false;
    public static final Boolean DEFAULT_IS_LOGIN_USER = false;
    public static final Boolean DEFAULT_IS_PARAGRAPH_SPEAKER = false;
    public static final Long DEFAULT_TENANT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String maction_id;
    public final String mavatar_key;
    public final String mavatar_url;
    public final String mdepartment_name;
    public final String mdevice_id;
    public final Boolean mis_external;
    public final Boolean mis_host_user;
    public final Boolean mis_in_participants;
    public final Boolean mis_login_user;
    public final Boolean mis_paragraph_speaker;
    public final Long mtenant_id;
    public final String mtenant_name;
    public final String muser_id;
    public final String muser_name;
    public final LoginUserType muser_type;

    /* renamed from: com.ss.android.lark.pb.meeting_object.Participant$b */
    private static final class C49865b extends ProtoAdapter<Participant> {
        C49865b() {
            super(FieldEncoding.LENGTH_DELIMITED, Participant.class);
        }

        /* renamed from: a */
        public int encodedSize(Participant participant) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, participant.muser_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participant.mdevice_id) + LoginUserType.ADAPTER.encodedSizeWithTag(3, participant.muser_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, participant.muser_name) + ProtoAdapter.STRING.encodedSizeWithTag(5, participant.mavatar_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, participant.mavatar_key) + ProtoAdapter.STRING.encodedSizeWithTag(7, participant.maction_id) + ProtoAdapter.BOOL.encodedSizeWithTag(8, participant.mis_external) + ProtoAdapter.BOOL.encodedSizeWithTag(9, participant.mis_host_user) + ProtoAdapter.BOOL.encodedSizeWithTag(10, participant.mis_login_user) + ProtoAdapter.INT64.encodedSizeWithTag(11, participant.mtenant_id) + ProtoAdapter.STRING.encodedSizeWithTag(12, participant.mtenant_name) + ProtoAdapter.STRING.encodedSizeWithTag(13, participant.mdepartment_name) + ProtoAdapter.BOOL.encodedSizeWithTag(14, participant.mis_in_participants) + ProtoAdapter.BOOL.encodedSizeWithTag(15, participant.mis_paragraph_speaker) + participant.unknownFields().size();
        }

        /* renamed from: a */
        public Participant decode(ProtoReader protoReader) throws IOException {
            C49864a aVar = new C49864a();
            aVar.f124838a = "";
            aVar.f124839b = "";
            aVar.f124841d = "";
            aVar.f124842e = "";
            aVar.f124843f = "";
            aVar.f124844g = "";
            aVar.f124845h = false;
            aVar.f124846i = false;
            aVar.f124847j = false;
            aVar.f124848k = 0L;
            aVar.f124849l = "";
            aVar.f124850m = "";
            aVar.f124851n = false;
            aVar.f124852o = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124838a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124839b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f124840c = LoginUserType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f124841d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124842e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124843f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124844g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124845h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124846i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124847j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124848k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124849l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124850m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f124851n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f124852o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Participant participant) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, participant.muser_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participant.mdevice_id);
            LoginUserType.ADAPTER.encodeWithTag(protoWriter, 3, participant.muser_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, participant.muser_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, participant.mavatar_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, participant.mavatar_key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, participant.maction_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, participant.mis_external);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, participant.mis_host_user);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, participant.mis_login_user);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, participant.mtenant_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, participant.mtenant_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, participant.mdepartment_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, participant.mis_in_participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, participant.mis_paragraph_speaker);
            protoWriter.writeBytes(participant.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49864a newBuilder() {
        C49864a aVar = new C49864a();
        aVar.f124838a = this.muser_id;
        aVar.f124839b = this.mdevice_id;
        aVar.f124840c = this.muser_type;
        aVar.f124841d = this.muser_name;
        aVar.f124842e = this.mavatar_url;
        aVar.f124843f = this.mavatar_key;
        aVar.f124844g = this.maction_id;
        aVar.f124845h = this.mis_external;
        aVar.f124846i = this.mis_host_user;
        aVar.f124847j = this.mis_login_user;
        aVar.f124848k = this.mtenant_id;
        aVar.f124849l = this.mtenant_name;
        aVar.f124850m = this.mdepartment_name;
        aVar.f124851n = this.mis_in_participants;
        aVar.f124852o = this.mis_paragraph_speaker;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.Participant$a */
    public static final class C49864a extends Message.Builder<Participant, C49864a> {

        /* renamed from: a */
        public String f124838a;

        /* renamed from: b */
        public String f124839b;

        /* renamed from: c */
        public LoginUserType f124840c;

        /* renamed from: d */
        public String f124841d;

        /* renamed from: e */
        public String f124842e;

        /* renamed from: f */
        public String f124843f;

        /* renamed from: g */
        public String f124844g;

        /* renamed from: h */
        public Boolean f124845h;

        /* renamed from: i */
        public Boolean f124846i;

        /* renamed from: j */
        public Boolean f124847j;

        /* renamed from: k */
        public Long f124848k;

        /* renamed from: l */
        public String f124849l;

        /* renamed from: m */
        public String f124850m;

        /* renamed from: n */
        public Boolean f124851n;

        /* renamed from: o */
        public Boolean f124852o;

        /* renamed from: a */
        public Participant build() {
            String str;
            LoginUserType loginUserType;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Long l;
            String str6;
            String str7;
            Boolean bool4;
            Boolean bool5;
            String str8 = this.f124838a;
            if (str8 != null && (str = this.f124839b) != null && (loginUserType = this.f124840c) != null && (str2 = this.f124841d) != null && (str3 = this.f124842e) != null && (str4 = this.f124843f) != null && (str5 = this.f124844g) != null && (bool = this.f124845h) != null && (bool2 = this.f124846i) != null && (bool3 = this.f124847j) != null && (l = this.f124848k) != null && (str6 = this.f124849l) != null && (str7 = this.f124850m) != null && (bool4 = this.f124851n) != null && (bool5 = this.f124852o) != null) {
                return new Participant(str8, str, loginUserType, str2, str3, str4, str5, bool, bool2, bool3, l, str6, str7, bool4, bool5, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str8, "muser_id", this.f124839b, "mdevice_id", this.f124840c, "muser_type", this.f124841d, "muser_name", this.f124842e, "mavatar_url", this.f124843f, "mavatar_key", this.f124844g, "maction_id", this.f124845h, "mis_external", this.f124846i, "mis_host_user", this.f124847j, "mis_login_user", this.f124848k, "mtenant_id", this.f124849l, "mtenant_name", this.f124850m, "mdepartment_name", this.f124851n, "mis_in_participants", this.f124852o, "mis_paragraph_speaker");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        sb.append(", device_id=");
        sb.append(this.mdevice_id);
        sb.append(", user_type=");
        sb.append(this.muser_type);
        sb.append(", user_name=");
        sb.append(this.muser_name);
        sb.append(", avatar_url=");
        sb.append(this.mavatar_url);
        sb.append(", avatar_key=");
        sb.append(this.mavatar_key);
        sb.append(", action_id=");
        sb.append(this.maction_id);
        sb.append(", is_external=");
        sb.append(this.mis_external);
        sb.append(", is_host_user=");
        sb.append(this.mis_host_user);
        sb.append(", is_login_user=");
        sb.append(this.mis_login_user);
        sb.append(", tenant_id=");
        sb.append(this.mtenant_id);
        sb.append(", tenant_name=");
        sb.append(this.mtenant_name);
        sb.append(", department_name=");
        sb.append(this.mdepartment_name);
        sb.append(", is_in_participants=");
        sb.append(this.mis_in_participants);
        sb.append(", is_paragraph_speaker=");
        sb.append(this.mis_paragraph_speaker);
        StringBuilder replace = sb.replace(0, 2, "Participant{");
        replace.append('}');
        return replace.toString();
    }

    public Participant(String str, String str2, LoginUserType loginUserType, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str7, String str8, Boolean bool4, Boolean bool5) {
        this(str, str2, loginUserType, str3, str4, str5, str6, bool, bool2, bool3, l, str7, str8, bool4, bool5, ByteString.EMPTY);
    }

    public Participant(String str, String str2, LoginUserType loginUserType, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str7, String str8, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
        this.mdevice_id = str2;
        this.muser_type = loginUserType;
        this.muser_name = str3;
        this.mavatar_url = str4;
        this.mavatar_key = str5;
        this.maction_id = str6;
        this.mis_external = bool;
        this.mis_host_user = bool2;
        this.mis_login_user = bool3;
        this.mtenant_id = l;
        this.mtenant_name = str7;
        this.mdepartment_name = str8;
        this.mis_in_participants = bool4;
        this.mis_paragraph_speaker = bool5;
    }
}
