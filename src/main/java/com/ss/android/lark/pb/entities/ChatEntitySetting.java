package com.ss.android.lark.pb.entities;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatEntitySetting extends Message<ChatEntitySetting, C49682a> {
    public static final ProtoAdapter<ChatEntitySetting> ADAPTER = new C49683b();
    private static final long serialVersionUID = 0;
    public final AddMemberApplySetting.Enum madd_member_apply_setting;
    public final AddMemberPermissionSetting.Enum madd_member_permission_setting;
    public final AnonymousSetting manonymous_setting;
    public final AtAllPermissionSetting.Enum mat_all_permission_setting;
    public final CreateUrgentSetting.Enum mcreate_urgent_setting;
    public final CreateVideoConferenceSetting.Enum mcreate_video_conference_setting;
    public final SystemMessageVisibleSetting.Enum mjoin_message_visible_setting;
    public final MessageVisibilitySetting.Enum mmessage_visibility_setting;
    public final PinPermissionSetting.Enum mpin_permission_setting;
    public final SystemMessageVisibleSetting.Enum mquit_message_visible_setting;
    public final ShareCardPermissionSetting.Enum mshare_card_permission_setting;
    public final ThreadAnonymousSetting.Enum mthread_anonymous_setting;
    public final TopNoticePermissionSetting.Enum mtop_notice_permission_setting;

    public static final class AddMemberApplySetting extends Message<AddMemberApplySetting, C49658a> {
        public static final ProtoAdapter<AddMemberApplySetting> ADAPTER = new C49659b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            NO_APPLY(1),
            NEED_APPLY(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return NO_APPLY;
                }
                if (i != 2) {
                    return null;
                }
                return NEED_APPLY;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AddMemberApplySetting$b */
        private static final class C49659b extends ProtoAdapter<AddMemberApplySetting> {
            C49659b() {
                super(FieldEncoding.LENGTH_DELIMITED, AddMemberApplySetting.class);
            }

            /* renamed from: a */
            public int encodedSize(AddMemberApplySetting addMemberApplySetting) {
                return addMemberApplySetting.unknownFields().size();
            }

            /* renamed from: a */
            public AddMemberApplySetting decode(ProtoReader protoReader) throws IOException {
                C49658a aVar = new C49658a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AddMemberApplySetting addMemberApplySetting) throws IOException {
                protoWriter.writeBytes(addMemberApplySetting.unknownFields());
            }
        }

        public AddMemberApplySetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AddMemberApplySetting$a */
        public static final class C49658a extends Message.Builder<AddMemberApplySetting, C49658a> {
            /* renamed from: a */
            public AddMemberApplySetting build() {
                return new AddMemberApplySetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49658a newBuilder() {
            C49658a aVar = new C49658a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "AddMemberApplySetting{");
            replace.append('}');
            return replace.toString();
        }

        public AddMemberApplySetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class AddMemberPermissionSetting extends Message<AddMemberPermissionSetting, C49660a> {
        public static final ProtoAdapter<AddMemberPermissionSetting> ADAPTER = new C49661b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_OWNER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_OWNER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AddMemberPermissionSetting$b */
        private static final class C49661b extends ProtoAdapter<AddMemberPermissionSetting> {
            C49661b() {
                super(FieldEncoding.LENGTH_DELIMITED, AddMemberPermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(AddMemberPermissionSetting addMemberPermissionSetting) {
                return addMemberPermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public AddMemberPermissionSetting decode(ProtoReader protoReader) throws IOException {
                C49660a aVar = new C49660a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AddMemberPermissionSetting addMemberPermissionSetting) throws IOException {
                protoWriter.writeBytes(addMemberPermissionSetting.unknownFields());
            }
        }

        public AddMemberPermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AddMemberPermissionSetting$a */
        public static final class C49660a extends Message.Builder<AddMemberPermissionSetting, C49660a> {
            /* renamed from: a */
            public AddMemberPermissionSetting build() {
                return new AddMemberPermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49660a newBuilder() {
            C49660a aVar = new C49660a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "AddMemberPermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public AddMemberPermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class AtAllPermissionSetting extends Message<AtAllPermissionSetting, C49664a> {
        public static final ProtoAdapter<AtAllPermissionSetting> ADAPTER = new C49665b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_OWNER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_OWNER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AtAllPermissionSetting$b */
        private static final class C49665b extends ProtoAdapter<AtAllPermissionSetting> {
            C49665b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtAllPermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(AtAllPermissionSetting atAllPermissionSetting) {
                return atAllPermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public AtAllPermissionSetting decode(ProtoReader protoReader) throws IOException {
                C49664a aVar = new C49664a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtAllPermissionSetting atAllPermissionSetting) throws IOException {
                protoWriter.writeBytes(atAllPermissionSetting.unknownFields());
            }
        }

        public AtAllPermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AtAllPermissionSetting$a */
        public static final class C49664a extends Message.Builder<AtAllPermissionSetting, C49664a> {
            /* renamed from: a */
            public AtAllPermissionSetting build() {
                return new AtAllPermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49664a newBuilder() {
            C49664a aVar = new C49664a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "AtAllPermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public AtAllPermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class CreateUrgentSetting extends Message<CreateUrgentSetting, C49666a> {
        public static final ProtoAdapter<CreateUrgentSetting> ADAPTER = new C49667b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$CreateUrgentSetting$b */
        private static final class C49667b extends ProtoAdapter<CreateUrgentSetting> {
            C49667b() {
                super(FieldEncoding.LENGTH_DELIMITED, CreateUrgentSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(CreateUrgentSetting createUrgentSetting) {
                return createUrgentSetting.unknownFields().size();
            }

            /* renamed from: a */
            public CreateUrgentSetting decode(ProtoReader protoReader) throws IOException {
                C49666a aVar = new C49666a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CreateUrgentSetting createUrgentSetting) throws IOException {
                protoWriter.writeBytes(createUrgentSetting.unknownFields());
            }
        }

        public CreateUrgentSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$CreateUrgentSetting$a */
        public static final class C49666a extends Message.Builder<CreateUrgentSetting, C49666a> {
            /* renamed from: a */
            public CreateUrgentSetting build() {
                return new CreateUrgentSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49666a newBuilder() {
            C49666a aVar = new C49666a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "CreateUrgentSetting{");
            replace.append('}');
            return replace.toString();
        }

        public CreateUrgentSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class CreateVideoConferenceSetting extends Message<CreateVideoConferenceSetting, C49668a> {
        public static final ProtoAdapter<CreateVideoConferenceSetting> ADAPTER = new C49669b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$CreateVideoConferenceSetting$b */
        private static final class C49669b extends ProtoAdapter<CreateVideoConferenceSetting> {
            C49669b() {
                super(FieldEncoding.LENGTH_DELIMITED, CreateVideoConferenceSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(CreateVideoConferenceSetting createVideoConferenceSetting) {
                return createVideoConferenceSetting.unknownFields().size();
            }

            /* renamed from: a */
            public CreateVideoConferenceSetting decode(ProtoReader protoReader) throws IOException {
                C49668a aVar = new C49668a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CreateVideoConferenceSetting createVideoConferenceSetting) throws IOException {
                protoWriter.writeBytes(createVideoConferenceSetting.unknownFields());
            }
        }

        public CreateVideoConferenceSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$CreateVideoConferenceSetting$a */
        public static final class C49668a extends Message.Builder<CreateVideoConferenceSetting, C49668a> {
            /* renamed from: a */
            public CreateVideoConferenceSetting build() {
                return new CreateVideoConferenceSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49668a newBuilder() {
            C49668a aVar = new C49668a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "CreateVideoConferenceSetting{");
            replace.append('}');
            return replace.toString();
        }

        public CreateVideoConferenceSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class MessageVisibilitySetting extends Message<MessageVisibilitySetting, C49670a> {
        public static final ProtoAdapter<MessageVisibilitySetting> ADAPTER = new C49671b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MESSAGES(1),
            ONLY_NEW_MESSAGES(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MESSAGES;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_NEW_MESSAGES;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$MessageVisibilitySetting$b */
        private static final class C49671b extends ProtoAdapter<MessageVisibilitySetting> {
            C49671b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageVisibilitySetting.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageVisibilitySetting messageVisibilitySetting) {
                return messageVisibilitySetting.unknownFields().size();
            }

            /* renamed from: a */
            public MessageVisibilitySetting decode(ProtoReader protoReader) throws IOException {
                C49670a aVar = new C49670a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageVisibilitySetting messageVisibilitySetting) throws IOException {
                protoWriter.writeBytes(messageVisibilitySetting.unknownFields());
            }
        }

        public MessageVisibilitySetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$MessageVisibilitySetting$a */
        public static final class C49670a extends Message.Builder<MessageVisibilitySetting, C49670a> {
            /* renamed from: a */
            public MessageVisibilitySetting build() {
                return new MessageVisibilitySetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49670a newBuilder() {
            C49670a aVar = new C49670a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "MessageVisibilitySetting{");
            replace.append('}');
            return replace.toString();
        }

        public MessageVisibilitySetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class PinPermissionSetting extends Message<PinPermissionSetting, C49672a> {
        public static final ProtoAdapter<PinPermissionSetting> ADAPTER = new C49673b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$PinPermissionSetting$b */
        private static final class C49673b extends ProtoAdapter<PinPermissionSetting> {
            C49673b() {
                super(FieldEncoding.LENGTH_DELIMITED, PinPermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(PinPermissionSetting pinPermissionSetting) {
                return pinPermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public PinPermissionSetting decode(ProtoReader protoReader) throws IOException {
                C49672a aVar = new C49672a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PinPermissionSetting pinPermissionSetting) throws IOException {
                protoWriter.writeBytes(pinPermissionSetting.unknownFields());
            }
        }

        public PinPermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$PinPermissionSetting$a */
        public static final class C49672a extends Message.Builder<PinPermissionSetting, C49672a> {
            /* renamed from: a */
            public PinPermissionSetting build() {
                return new PinPermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49672a newBuilder() {
            C49672a aVar = new C49672a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "PinPermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public PinPermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class ShareCardPermissionSetting extends Message<ShareCardPermissionSetting, C49674a> {
        public static final ProtoAdapter<ShareCardPermissionSetting> ADAPTER = new C49675b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALLOWED(1),
            NOT_ALLOWED(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALLOWED;
                }
                if (i != 2) {
                    return null;
                }
                return NOT_ALLOWED;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$ShareCardPermissionSetting$b */
        private static final class C49675b extends ProtoAdapter<ShareCardPermissionSetting> {
            C49675b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareCardPermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareCardPermissionSetting shareCardPermissionSetting) {
                return shareCardPermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public ShareCardPermissionSetting decode(ProtoReader protoReader) throws IOException {
                C49674a aVar = new C49674a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareCardPermissionSetting shareCardPermissionSetting) throws IOException {
                protoWriter.writeBytes(shareCardPermissionSetting.unknownFields());
            }
        }

        public ShareCardPermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$ShareCardPermissionSetting$a */
        public static final class C49674a extends Message.Builder<ShareCardPermissionSetting, C49674a> {
            /* renamed from: a */
            public ShareCardPermissionSetting build() {
                return new ShareCardPermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49674a newBuilder() {
            C49674a aVar = new C49674a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "ShareCardPermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public ShareCardPermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class SystemMessageVisibleSetting extends Message<SystemMessageVisibleSetting, C49676a> {
        public static final ProtoAdapter<SystemMessageVisibleSetting> ADAPTER = new C49677b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ONLY_OWNER(1),
            ALL_MEMBERS(2),
            NOT_ANYONE(3);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ONLY_OWNER;
                }
                if (i == 2) {
                    return ALL_MEMBERS;
                }
                if (i != 3) {
                    return null;
                }
                return NOT_ANYONE;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$SystemMessageVisibleSetting$b */
        private static final class C49677b extends ProtoAdapter<SystemMessageVisibleSetting> {
            C49677b() {
                super(FieldEncoding.LENGTH_DELIMITED, SystemMessageVisibleSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(SystemMessageVisibleSetting systemMessageVisibleSetting) {
                return systemMessageVisibleSetting.unknownFields().size();
            }

            /* renamed from: a */
            public SystemMessageVisibleSetting decode(ProtoReader protoReader) throws IOException {
                C49676a aVar = new C49676a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SystemMessageVisibleSetting systemMessageVisibleSetting) throws IOException {
                protoWriter.writeBytes(systemMessageVisibleSetting.unknownFields());
            }
        }

        public SystemMessageVisibleSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$SystemMessageVisibleSetting$a */
        public static final class C49676a extends Message.Builder<SystemMessageVisibleSetting, C49676a> {
            /* renamed from: a */
            public SystemMessageVisibleSetting build() {
                return new SystemMessageVisibleSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49676a newBuilder() {
            C49676a aVar = new C49676a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "SystemMessageVisibleSetting{");
            replace.append('}');
            return replace.toString();
        }

        public SystemMessageVisibleSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class ThreadAnonymousSetting extends Message<ThreadAnonymousSetting, C49678a> {
        public static final ProtoAdapter<ThreadAnonymousSetting> ADAPTER = new C49679b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            INVISIBLE(1),
            NOT_ALLOWED(2),
            ALLOWED(3);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return INVISIBLE;
                }
                if (i == 2) {
                    return NOT_ALLOWED;
                }
                if (i != 3) {
                    return null;
                }
                return ALLOWED;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$ThreadAnonymousSetting$b */
        private static final class C49679b extends ProtoAdapter<ThreadAnonymousSetting> {
            C49679b() {
                super(FieldEncoding.LENGTH_DELIMITED, ThreadAnonymousSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(ThreadAnonymousSetting threadAnonymousSetting) {
                return threadAnonymousSetting.unknownFields().size();
            }

            /* renamed from: a */
            public ThreadAnonymousSetting decode(ProtoReader protoReader) throws IOException {
                C49678a aVar = new C49678a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ThreadAnonymousSetting threadAnonymousSetting) throws IOException {
                protoWriter.writeBytes(threadAnonymousSetting.unknownFields());
            }
        }

        public ThreadAnonymousSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$ThreadAnonymousSetting$a */
        public static final class C49678a extends Message.Builder<ThreadAnonymousSetting, C49678a> {
            /* renamed from: a */
            public ThreadAnonymousSetting build() {
                return new ThreadAnonymousSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49678a newBuilder() {
            C49678a aVar = new C49678a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "ThreadAnonymousSetting{");
            replace.append('}');
            return replace.toString();
        }

        public ThreadAnonymousSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class TopNoticePermissionSetting extends Message<TopNoticePermissionSetting, C49680a> {
        public static final ProtoAdapter<TopNoticePermissionSetting> ADAPTER = new C49681b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$TopNoticePermissionSetting$b */
        private static final class C49681b extends ProtoAdapter<TopNoticePermissionSetting> {
            C49681b() {
                super(FieldEncoding.LENGTH_DELIMITED, TopNoticePermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(TopNoticePermissionSetting topNoticePermissionSetting) {
                return topNoticePermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public TopNoticePermissionSetting decode(ProtoReader protoReader) throws IOException {
                C49680a aVar = new C49680a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TopNoticePermissionSetting topNoticePermissionSetting) throws IOException {
                protoWriter.writeBytes(topNoticePermissionSetting.unknownFields());
            }
        }

        public TopNoticePermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$TopNoticePermissionSetting$a */
        public static final class C49680a extends Message.Builder<TopNoticePermissionSetting, C49680a> {
            /* renamed from: a */
            public TopNoticePermissionSetting build() {
                return new TopNoticePermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49680a newBuilder() {
            C49680a aVar = new C49680a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "TopNoticePermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public TopNoticePermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public enum Field implements WireEnum {
        UNKNOWN(0),
        ADD_MEMBER_PERMISSION_SETTING(1),
        AT_ALL_PERMISSION_SETTING(2),
        JOIN_MESSAGE_VISIBLE_SETTING(3),
        QUIT_MESSAGE_VISIBLE_SETTING(4),
        SHARE_CARD_PERMISSION_SETTING(5),
        ADD_MEMBER_APPLY_SETTING(6),
        THREAD_ANONYMOUS_SETTING(7),
        MESSAGE_VISIBILITY_SETTING(8),
        ALLOW_ANONYMOUS_SETTING(9),
        CREATE_URGENT_SETTING(10),
        CREATE_VIDEO_CONFERENCE_SETTING(11),
        PIN_PERMISSION_SETTING(12),
        TOP_NOTICE_PERMISSION_SETTING(14);
        
        public static final ProtoAdapter<Field> ADAPTER = ProtoAdapter.newEnumAdapter(Field.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Field fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ADD_MEMBER_PERMISSION_SETTING;
                case 2:
                    return AT_ALL_PERMISSION_SETTING;
                case 3:
                    return JOIN_MESSAGE_VISIBLE_SETTING;
                case 4:
                    return QUIT_MESSAGE_VISIBLE_SETTING;
                case 5:
                    return SHARE_CARD_PERMISSION_SETTING;
                case 6:
                    return ADD_MEMBER_APPLY_SETTING;
                case 7:
                    return THREAD_ANONYMOUS_SETTING;
                case 8:
                    return MESSAGE_VISIBILITY_SETTING;
                case 9:
                    return ALLOW_ANONYMOUS_SETTING;
                case 10:
                    return CREATE_URGENT_SETTING;
                case 11:
                    return CREATE_VIDEO_CONFERENCE_SETTING;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return PIN_PERMISSION_SETTING;
                case 13:
                default:
                    return null;
                case 14:
                    return TOP_NOTICE_PERMISSION_SETTING;
            }
        }

        private Field(int i) {
            this.value = i;
        }
    }

    public static final class AnonymousSetting extends Message<AnonymousSetting, C49662a> {
        public static final ProtoAdapter<AnonymousSetting> ADAPTER = new C49663b();
        public static final Boolean DEFAULT_IS_ALLOW_ANONYMOUS = false;
        public static final Boolean DEFAULT_IS_VISIBLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mis_allow_anonymous;
        public final Boolean mis_visible;

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AnonymousSetting$b */
        private static final class C49663b extends ProtoAdapter<AnonymousSetting> {
            C49663b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnonymousSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(AnonymousSetting anonymousSetting) {
                int i;
                int i2 = 0;
                if (anonymousSetting.mis_allow_anonymous != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, anonymousSetting.mis_allow_anonymous);
                } else {
                    i = 0;
                }
                if (anonymousSetting.mis_visible != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, anonymousSetting.mis_visible);
                }
                return i + i2 + anonymousSetting.unknownFields().size();
            }

            /* renamed from: a */
            public AnonymousSetting decode(ProtoReader protoReader) throws IOException {
                C49662a aVar = new C49662a();
                aVar.f124390a = false;
                aVar.f124391b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124390a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124391b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AnonymousSetting anonymousSetting) throws IOException {
                if (anonymousSetting.mis_allow_anonymous != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, anonymousSetting.mis_allow_anonymous);
                }
                if (anonymousSetting.mis_visible != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, anonymousSetting.mis_visible);
                }
                protoWriter.writeBytes(anonymousSetting.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$AnonymousSetting$a */
        public static final class C49662a extends Message.Builder<AnonymousSetting, C49662a> {

            /* renamed from: a */
            public Boolean f124390a;

            /* renamed from: b */
            public Boolean f124391b;

            /* renamed from: a */
            public AnonymousSetting build() {
                return new AnonymousSetting(this.f124390a, this.f124391b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49662a newBuilder() {
            C49662a aVar = new C49662a();
            aVar.f124390a = this.mis_allow_anonymous;
            aVar.f124391b = this.mis_visible;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mis_allow_anonymous != null) {
                sb.append(", is_allow_anonymous=");
                sb.append(this.mis_allow_anonymous);
            }
            if (this.mis_visible != null) {
                sb.append(", is_visible=");
                sb.append(this.mis_visible);
            }
            StringBuilder replace = sb.replace(0, 2, "AnonymousSetting{");
            replace.append('}');
            return replace.toString();
        }

        public AnonymousSetting(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public AnonymousSetting(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mis_allow_anonymous = bool;
            this.mis_visible = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$b */
    private static final class C49683b extends ProtoAdapter<ChatEntitySetting> {
        C49683b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatEntitySetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatEntitySetting chatEntitySetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (chatEntitySetting.madd_member_permission_setting != null) {
                i = AddMemberPermissionSetting.Enum.ADAPTER.encodedSizeWithTag(1, chatEntitySetting.madd_member_permission_setting);
            } else {
                i = 0;
            }
            if (chatEntitySetting.mat_all_permission_setting != null) {
                i2 = AtAllPermissionSetting.Enum.ADAPTER.encodedSizeWithTag(2, chatEntitySetting.mat_all_permission_setting);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (chatEntitySetting.mjoin_message_visible_setting != null) {
                i3 = SystemMessageVisibleSetting.Enum.ADAPTER.encodedSizeWithTag(3, chatEntitySetting.mjoin_message_visible_setting);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (chatEntitySetting.mquit_message_visible_setting != null) {
                i4 = SystemMessageVisibleSetting.Enum.ADAPTER.encodedSizeWithTag(4, chatEntitySetting.mquit_message_visible_setting);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (chatEntitySetting.mshare_card_permission_setting != null) {
                i5 = ShareCardPermissionSetting.Enum.ADAPTER.encodedSizeWithTag(5, chatEntitySetting.mshare_card_permission_setting);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (chatEntitySetting.madd_member_apply_setting != null) {
                i6 = AddMemberApplySetting.Enum.ADAPTER.encodedSizeWithTag(6, chatEntitySetting.madd_member_apply_setting);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (chatEntitySetting.mthread_anonymous_setting != null) {
                i7 = ThreadAnonymousSetting.Enum.ADAPTER.encodedSizeWithTag(7, chatEntitySetting.mthread_anonymous_setting);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (chatEntitySetting.mmessage_visibility_setting != null) {
                i8 = MessageVisibilitySetting.Enum.ADAPTER.encodedSizeWithTag(8, chatEntitySetting.mmessage_visibility_setting);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (chatEntitySetting.manonymous_setting != null) {
                i9 = AnonymousSetting.ADAPTER.encodedSizeWithTag(9, chatEntitySetting.manonymous_setting);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (chatEntitySetting.mcreate_urgent_setting != null) {
                i10 = CreateUrgentSetting.Enum.ADAPTER.encodedSizeWithTag(10, chatEntitySetting.mcreate_urgent_setting);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (chatEntitySetting.mcreate_video_conference_setting != null) {
                i11 = CreateVideoConferenceSetting.Enum.ADAPTER.encodedSizeWithTag(11, chatEntitySetting.mcreate_video_conference_setting);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (chatEntitySetting.mpin_permission_setting != null) {
                i12 = PinPermissionSetting.Enum.ADAPTER.encodedSizeWithTag(12, chatEntitySetting.mpin_permission_setting);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (chatEntitySetting.mtop_notice_permission_setting != null) {
                i13 = TopNoticePermissionSetting.Enum.ADAPTER.encodedSizeWithTag(13, chatEntitySetting.mtop_notice_permission_setting);
            }
            return i24 + i13 + chatEntitySetting.unknownFields().size();
        }

        /* renamed from: a */
        public ChatEntitySetting decode(ProtoReader protoReader) throws IOException {
            C49682a aVar = new C49682a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f124392a = AddMemberPermissionSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f124393b = AtAllPermissionSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f124394c = SystemMessageVisibleSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f124395d = SystemMessageVisibleSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f124396e = ShareCardPermissionSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f124397f = AddMemberApplySetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f124398g = ThreadAnonymousSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case 8:
                            try {
                                aVar.f124399h = MessageVisibilitySetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                break;
                            }
                        case 9:
                            aVar.f124400i = AnonymousSetting.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f124401j = CreateUrgentSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                break;
                            }
                        case 11:
                            try {
                                aVar.f124402k = CreateVideoConferenceSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e10.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            try {
                                aVar.f124403l = PinPermissionSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e11.value));
                                break;
                            }
                        case 13:
                            try {
                                aVar.f124404m = TopNoticePermissionSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e12.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, ChatEntitySetting chatEntitySetting) throws IOException {
            if (chatEntitySetting.madd_member_permission_setting != null) {
                AddMemberPermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 1, chatEntitySetting.madd_member_permission_setting);
            }
            if (chatEntitySetting.mat_all_permission_setting != null) {
                AtAllPermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 2, chatEntitySetting.mat_all_permission_setting);
            }
            if (chatEntitySetting.mjoin_message_visible_setting != null) {
                SystemMessageVisibleSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 3, chatEntitySetting.mjoin_message_visible_setting);
            }
            if (chatEntitySetting.mquit_message_visible_setting != null) {
                SystemMessageVisibleSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 4, chatEntitySetting.mquit_message_visible_setting);
            }
            if (chatEntitySetting.mshare_card_permission_setting != null) {
                ShareCardPermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 5, chatEntitySetting.mshare_card_permission_setting);
            }
            if (chatEntitySetting.madd_member_apply_setting != null) {
                AddMemberApplySetting.Enum.ADAPTER.encodeWithTag(protoWriter, 6, chatEntitySetting.madd_member_apply_setting);
            }
            if (chatEntitySetting.mthread_anonymous_setting != null) {
                ThreadAnonymousSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 7, chatEntitySetting.mthread_anonymous_setting);
            }
            if (chatEntitySetting.mmessage_visibility_setting != null) {
                MessageVisibilitySetting.Enum.ADAPTER.encodeWithTag(protoWriter, 8, chatEntitySetting.mmessage_visibility_setting);
            }
            if (chatEntitySetting.manonymous_setting != null) {
                AnonymousSetting.ADAPTER.encodeWithTag(protoWriter, 9, chatEntitySetting.manonymous_setting);
            }
            if (chatEntitySetting.mcreate_urgent_setting != null) {
                CreateUrgentSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 10, chatEntitySetting.mcreate_urgent_setting);
            }
            if (chatEntitySetting.mcreate_video_conference_setting != null) {
                CreateVideoConferenceSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 11, chatEntitySetting.mcreate_video_conference_setting);
            }
            if (chatEntitySetting.mpin_permission_setting != null) {
                PinPermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 12, chatEntitySetting.mpin_permission_setting);
            }
            if (chatEntitySetting.mtop_notice_permission_setting != null) {
                TopNoticePermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 13, chatEntitySetting.mtop_notice_permission_setting);
            }
            protoWriter.writeBytes(chatEntitySetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatEntitySetting$a */
    public static final class C49682a extends Message.Builder<ChatEntitySetting, C49682a> {

        /* renamed from: a */
        public AddMemberPermissionSetting.Enum f124392a;

        /* renamed from: b */
        public AtAllPermissionSetting.Enum f124393b;

        /* renamed from: c */
        public SystemMessageVisibleSetting.Enum f124394c;

        /* renamed from: d */
        public SystemMessageVisibleSetting.Enum f124395d;

        /* renamed from: e */
        public ShareCardPermissionSetting.Enum f124396e;

        /* renamed from: f */
        public AddMemberApplySetting.Enum f124397f;

        /* renamed from: g */
        public ThreadAnonymousSetting.Enum f124398g;

        /* renamed from: h */
        public MessageVisibilitySetting.Enum f124399h;

        /* renamed from: i */
        public AnonymousSetting f124400i;

        /* renamed from: j */
        public CreateUrgentSetting.Enum f124401j;

        /* renamed from: k */
        public CreateVideoConferenceSetting.Enum f124402k;

        /* renamed from: l */
        public PinPermissionSetting.Enum f124403l;

        /* renamed from: m */
        public TopNoticePermissionSetting.Enum f124404m;

        /* renamed from: a */
        public ChatEntitySetting build() {
            return new ChatEntitySetting(this.f124392a, this.f124393b, this.f124394c, this.f124395d, this.f124396e, this.f124397f, this.f124398g, this.f124399h, this.f124400i, this.f124401j, this.f124402k, this.f124403l, this.f124404m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49682a newBuilder() {
        C49682a aVar = new C49682a();
        aVar.f124392a = this.madd_member_permission_setting;
        aVar.f124393b = this.mat_all_permission_setting;
        aVar.f124394c = this.mjoin_message_visible_setting;
        aVar.f124395d = this.mquit_message_visible_setting;
        aVar.f124396e = this.mshare_card_permission_setting;
        aVar.f124397f = this.madd_member_apply_setting;
        aVar.f124398g = this.mthread_anonymous_setting;
        aVar.f124399h = this.mmessage_visibility_setting;
        aVar.f124400i = this.manonymous_setting;
        aVar.f124401j = this.mcreate_urgent_setting;
        aVar.f124402k = this.mcreate_video_conference_setting;
        aVar.f124403l = this.mpin_permission_setting;
        aVar.f124404m = this.mtop_notice_permission_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.madd_member_permission_setting != null) {
            sb.append(", add_member_permission_setting=");
            sb.append(this.madd_member_permission_setting);
        }
        if (this.mat_all_permission_setting != null) {
            sb.append(", at_all_permission_setting=");
            sb.append(this.mat_all_permission_setting);
        }
        if (this.mjoin_message_visible_setting != null) {
            sb.append(", join_message_visible_setting=");
            sb.append(this.mjoin_message_visible_setting);
        }
        if (this.mquit_message_visible_setting != null) {
            sb.append(", quit_message_visible_setting=");
            sb.append(this.mquit_message_visible_setting);
        }
        if (this.mshare_card_permission_setting != null) {
            sb.append(", share_card_permission_setting=");
            sb.append(this.mshare_card_permission_setting);
        }
        if (this.madd_member_apply_setting != null) {
            sb.append(", add_member_apply_setting=");
            sb.append(this.madd_member_apply_setting);
        }
        if (this.mthread_anonymous_setting != null) {
            sb.append(", thread_anonymous_setting=");
            sb.append(this.mthread_anonymous_setting);
        }
        if (this.mmessage_visibility_setting != null) {
            sb.append(", message_visibility_setting=");
            sb.append(this.mmessage_visibility_setting);
        }
        if (this.manonymous_setting != null) {
            sb.append(", anonymous_setting=");
            sb.append(this.manonymous_setting);
        }
        if (this.mcreate_urgent_setting != null) {
            sb.append(", create_urgent_setting=");
            sb.append(this.mcreate_urgent_setting);
        }
        if (this.mcreate_video_conference_setting != null) {
            sb.append(", create_video_conference_setting=");
            sb.append(this.mcreate_video_conference_setting);
        }
        if (this.mpin_permission_setting != null) {
            sb.append(", pin_permission_setting=");
            sb.append(this.mpin_permission_setting);
        }
        if (this.mtop_notice_permission_setting != null) {
            sb.append(", top_notice_permission_setting=");
            sb.append(this.mtop_notice_permission_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatEntitySetting{");
        replace.append('}');
        return replace.toString();
    }

    public ChatEntitySetting(AddMemberPermissionSetting.Enum r16, AtAllPermissionSetting.Enum r17, SystemMessageVisibleSetting.Enum r18, SystemMessageVisibleSetting.Enum r19, ShareCardPermissionSetting.Enum r20, AddMemberApplySetting.Enum r21, ThreadAnonymousSetting.Enum r22, MessageVisibilitySetting.Enum r23, AnonymousSetting anonymousSetting, CreateUrgentSetting.Enum r25, CreateVideoConferenceSetting.Enum r26, PinPermissionSetting.Enum r27, TopNoticePermissionSetting.Enum r28) {
        this(r16, r17, r18, r19, r20, r21, r22, r23, anonymousSetting, r25, r26, r27, r28, ByteString.EMPTY);
    }

    public ChatEntitySetting(AddMemberPermissionSetting.Enum r2, AtAllPermissionSetting.Enum r3, SystemMessageVisibleSetting.Enum r4, SystemMessageVisibleSetting.Enum r5, ShareCardPermissionSetting.Enum r6, AddMemberApplySetting.Enum r7, ThreadAnonymousSetting.Enum r8, MessageVisibilitySetting.Enum r9, AnonymousSetting anonymousSetting, CreateUrgentSetting.Enum r11, CreateVideoConferenceSetting.Enum r12, PinPermissionSetting.Enum r13, TopNoticePermissionSetting.Enum r14, ByteString byteString) {
        super(ADAPTER, byteString);
        this.madd_member_permission_setting = r2;
        this.mat_all_permission_setting = r3;
        this.mjoin_message_visible_setting = r4;
        this.mquit_message_visible_setting = r5;
        this.mshare_card_permission_setting = r6;
        this.madd_member_apply_setting = r7;
        this.mthread_anonymous_setting = r8;
        this.mmessage_visibility_setting = r9;
        this.manonymous_setting = anonymousSetting;
        this.mcreate_urgent_setting = r11;
        this.mcreate_video_conference_setting = r12;
        this.mpin_permission_setting = r13;
        this.mtop_notice_permission_setting = r14;
    }
}
