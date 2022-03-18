package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateVideoChatRequest extends Message<UpdateVideoChatRequest, C51140a> {
    public static final ProtoAdapter<UpdateVideoChatRequest> ADAPTER = new C51141b();
    public static final Action DEFAULT_ACTION = Action.UNKOWN;
    public static final Long DEFAULT_GLOBAL_SEQ_ID = 0L;
    public static final Boolean DEFAULT_IS_REJECT_JOIN_LOBBY = false;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final ActionTime action_time;
    public final Long global_seq_id;
    public final String id;
    public final String interactive_id;
    public final Boolean is_reject_join_lobby;
    public final List<String> lark_user_ids;
    public final ParticipantSettings participant_settings;
    public final List<String> pstn_ids;
    public final List<String> room_ids;
    public final String sdk_exception_reason;
    public final List<ByteviewUser> users;

    public enum Action implements WireEnum {
        UNKOWN(0),
        ACCEPT(1),
        REFUSE(2),
        CANCEL(3),
        LEAVE(4),
        END(5),
        RECEIVED_INVITATION(6),
        SDK_EXCEPTION(7),
        TERMINATE(8),
        TRIAL_TIMEOUT(9),
        LEAVE_LOBBY(10),
        MUTE_PUSH_ACK(11),
        AUTO_END(12);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKOWN;
                case 1:
                    return ACCEPT;
                case 2:
                    return REFUSE;
                case 3:
                    return CANCEL;
                case 4:
                    return LEAVE;
                case 5:
                    return END;
                case 6:
                    return RECEIVED_INVITATION;
                case 7:
                    return SDK_EXCEPTION;
                case 8:
                    return TERMINATE;
                case 9:
                    return TRIAL_TIMEOUT;
                case 10:
                    return LEAVE_LOBBY;
                case 11:
                    return MUTE_PUSH_ACK;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return AUTO_END;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatRequest$b */
    private static final class C51141b extends ProtoAdapter<UpdateVideoChatRequest> {
        C51141b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateVideoChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateVideoChatRequest updateVideoChatRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = Action.ADAPTER.encodedSizeWithTag(1, updateVideoChatRequest.action) + ProtoAdapter.STRING.encodedSizeWithTag(2, updateVideoChatRequest.id);
            int i6 = 0;
            if (updateVideoChatRequest.action_time != null) {
                i = ActionTime.ADAPTER.encodedSizeWithTag(3, updateVideoChatRequest.action_time);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (updateVideoChatRequest.participant_settings != null) {
                i2 = ParticipantSettings.ADAPTER.encodedSizeWithTag(4, updateVideoChatRequest.participant_settings);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i7 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, updateVideoChatRequest.lark_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, updateVideoChatRequest.room_ids);
            if (updateVideoChatRequest.interactive_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, updateVideoChatRequest.interactive_id);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, updateVideoChatRequest.pstn_ids);
            if (updateVideoChatRequest.sdk_exception_reason != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(9, updateVideoChatRequest.sdk_exception_reason);
            } else {
                i4 = 0;
            }
            int i8 = encodedSizeWithTag3 + i4;
            if (updateVideoChatRequest.is_reject_join_lobby != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(10, updateVideoChatRequest.is_reject_join_lobby);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag4 = i8 + i5 + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(11, updateVideoChatRequest.users);
            if (updateVideoChatRequest.global_seq_id != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(12, updateVideoChatRequest.global_seq_id);
            }
            return encodedSizeWithTag4 + i6 + updateVideoChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateVideoChatRequest decode(ProtoReader protoReader) throws IOException {
            C51140a aVar = new C51140a();
            aVar.f127254a = Action.UNKOWN;
            aVar.f127255b = "";
            aVar.f127260g = "";
            aVar.f127262i = "";
            aVar.f127263j = false;
            aVar.f127265l = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f127254a = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f127255b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127256c = ActionTime.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127257d = ParticipantSettings.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127258e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f127259f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f127260g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127261h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f127262i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127263j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127264k.add(ByteviewUser.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127265l = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UpdateVideoChatRequest updateVideoChatRequest) throws IOException {
            Action.ADAPTER.encodeWithTag(protoWriter, 1, updateVideoChatRequest.action);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateVideoChatRequest.id);
            if (updateVideoChatRequest.action_time != null) {
                ActionTime.ADAPTER.encodeWithTag(protoWriter, 3, updateVideoChatRequest.action_time);
            }
            if (updateVideoChatRequest.participant_settings != null) {
                ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 4, updateVideoChatRequest.participant_settings);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, updateVideoChatRequest.lark_user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, updateVideoChatRequest.room_ids);
            if (updateVideoChatRequest.interactive_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, updateVideoChatRequest.interactive_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, updateVideoChatRequest.pstn_ids);
            if (updateVideoChatRequest.sdk_exception_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, updateVideoChatRequest.sdk_exception_reason);
            }
            if (updateVideoChatRequest.is_reject_join_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, updateVideoChatRequest.is_reject_join_lobby);
            }
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, updateVideoChatRequest.users);
            if (updateVideoChatRequest.global_seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, updateVideoChatRequest.global_seq_id);
            }
            protoWriter.writeBytes(updateVideoChatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51140a newBuilder() {
        C51140a aVar = new C51140a();
        aVar.f127254a = this.action;
        aVar.f127255b = this.id;
        aVar.f127256c = this.action_time;
        aVar.f127257d = this.participant_settings;
        aVar.f127258e = Internal.copyOf("lark_user_ids", this.lark_user_ids);
        aVar.f127259f = Internal.copyOf("room_ids", this.room_ids);
        aVar.f127260g = this.interactive_id;
        aVar.f127261h = Internal.copyOf("pstn_ids", this.pstn_ids);
        aVar.f127262i = this.sdk_exception_reason;
        aVar.f127263j = this.is_reject_join_lobby;
        aVar.f127264k = Internal.copyOf("users", this.users);
        aVar.f127265l = this.global_seq_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatRequest$a */
    public static final class C51140a extends Message.Builder<UpdateVideoChatRequest, C51140a> {

        /* renamed from: a */
        public Action f127254a;

        /* renamed from: b */
        public String f127255b;

        /* renamed from: c */
        public ActionTime f127256c;

        /* renamed from: d */
        public ParticipantSettings f127257d;

        /* renamed from: e */
        public List<String> f127258e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f127259f = Internal.newMutableList();

        /* renamed from: g */
        public String f127260g;

        /* renamed from: h */
        public List<String> f127261h = Internal.newMutableList();

        /* renamed from: i */
        public String f127262i;

        /* renamed from: j */
        public Boolean f127263j;

        /* renamed from: k */
        public List<ByteviewUser> f127264k = Internal.newMutableList();

        /* renamed from: l */
        public Long f127265l;

        /* renamed from: a */
        public UpdateVideoChatRequest build() {
            String str;
            Action action = this.f127254a;
            if (action != null && (str = this.f127255b) != null) {
                return new UpdateVideoChatRequest(action, str, this.f127256c, this.f127257d, this.f127258e, this.f127259f, this.f127260g, this.f127261h, this.f127262i, this.f127263j, this.f127264k, this.f127265l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f127255b, "id");
        }

        /* renamed from: a */
        public C51140a mo176448a(ActionTime actionTime) {
            this.f127256c = actionTime;
            return this;
        }

        /* renamed from: b */
        public C51140a mo176455b(String str) {
            this.f127260g = str;
            return this;
        }

        /* renamed from: a */
        public C51140a mo176449a(ParticipantSettings participantSettings) {
            this.f127257d = participantSettings;
            return this;
        }

        /* renamed from: b */
        public C51140a mo176456b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127259f = list;
            return this;
        }

        /* renamed from: c */
        public C51140a mo176457c(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127261h = list;
            return this;
        }

        /* renamed from: d */
        public C51140a mo176458d(List<ByteviewUser> list) {
            Internal.checkElementsNotNull(list);
            this.f127264k = list;
            return this;
        }

        /* renamed from: a */
        public C51140a mo176450a(Action action) {
            this.f127254a = action;
            return this;
        }

        /* renamed from: a */
        public C51140a mo176451a(Long l) {
            this.f127265l = l;
            return this;
        }

        /* renamed from: a */
        public C51140a mo176452a(String str) {
            this.f127255b = str;
            return this;
        }

        /* renamed from: a */
        public C51140a mo176453a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127258e = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateVideoChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", id=");
        sb.append(this.id);
        if (this.action_time != null) {
            sb.append(", action_time=");
            sb.append(this.action_time);
        }
        if (this.participant_settings != null) {
            sb.append(", participant_settings=");
            sb.append(this.participant_settings);
        }
        if (!this.lark_user_ids.isEmpty()) {
            sb.append(", lark_user_ids=");
            sb.append(this.lark_user_ids);
        }
        if (!this.room_ids.isEmpty()) {
            sb.append(", room_ids=");
            sb.append(this.room_ids);
        }
        if (this.interactive_id != null) {
            sb.append(", interactive_id=");
            sb.append(this.interactive_id);
        }
        if (!this.pstn_ids.isEmpty()) {
            sb.append(", pstn_ids=");
            sb.append(this.pstn_ids);
        }
        if (this.sdk_exception_reason != null) {
            sb.append(", sdk_exception_reason=");
            sb.append(this.sdk_exception_reason);
        }
        if (this.is_reject_join_lobby != null) {
            sb.append(", is_reject_join_lobby=");
            sb.append(this.is_reject_join_lobby);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.global_seq_id != null) {
            sb.append(", global_seq_id=");
            sb.append(this.global_seq_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateVideoChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateVideoChatRequest(Action action2, String str, ActionTime actionTime, ParticipantSettings participantSettings, List<String> list, List<String> list2, String str2, List<String> list3, String str3, Boolean bool, List<ByteviewUser> list4, Long l) {
        this(action2, str, actionTime, participantSettings, list, list2, str2, list3, str3, bool, list4, l, ByteString.EMPTY);
    }

    public UpdateVideoChatRequest(Action action2, String str, ActionTime actionTime, ParticipantSettings participantSettings, List<String> list, List<String> list2, String str2, List<String> list3, String str3, Boolean bool, List<ByteviewUser> list4, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action = action2;
        this.id = str;
        this.action_time = actionTime;
        this.participant_settings = participantSettings;
        this.lark_user_ids = Internal.immutableCopyOf("lark_user_ids", list);
        this.room_ids = Internal.immutableCopyOf("room_ids", list2);
        this.interactive_id = str2;
        this.pstn_ids = Internal.immutableCopyOf("pstn_ids", list3);
        this.sdk_exception_reason = str3;
        this.is_reject_join_lobby = bool;
        this.users = Internal.immutableCopyOf("users", list4);
        this.global_seq_id = l;
    }
}
