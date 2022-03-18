package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class BreakoutRoomManage extends Message<BreakoutRoomManage, C50481a> {
    public static final ProtoAdapter<BreakoutRoomManage> ADAPTER = new C50482b();
    public static final ManageType DEFAULT_TYPE = ManageType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<BreakoutRoomInfo> infos;
    public final ManageType type;
    public final List<UserChanged> user_changed_list;

    public enum ManageType implements WireEnum {
        UNKNOWN(0),
        UPDATE_SETTINGS(1),
        MOVE_PARTICIPANTS(2),
        BREAKOUT_ROOM_END(3);
        
        public static final ProtoAdapter<ManageType> ADAPTER = ProtoAdapter.newEnumAdapter(ManageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ManageType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return UPDATE_SETTINGS;
            }
            if (i == 2) {
                return MOVE_PARTICIPANTS;
            }
            if (i != 3) {
                return null;
            }
            return BREAKOUT_ROOM_END;
        }

        private ManageType(int i) {
            this.value = i;
        }
    }

    public static final class UserChanged extends Message<UserChanged, C50479a> {
        public static final ProtoAdapter<UserChanged> ADAPTER = new C50480b();
        private static final long serialVersionUID = 0;
        public final String to_breakout_room_id;
        public final ByteviewUser user;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomManage$UserChanged$b */
        private static final class C50480b extends ProtoAdapter<UserChanged> {
            C50480b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserChanged.class);
            }

            /* renamed from: a */
            public int encodedSize(UserChanged userChanged) {
                int i;
                int i2 = 0;
                if (userChanged.user != null) {
                    i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, userChanged.user);
                } else {
                    i = 0;
                }
                if (userChanged.to_breakout_room_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userChanged.to_breakout_room_id);
                }
                return i + i2 + userChanged.unknownFields().size();
            }

            /* renamed from: a */
            public UserChanged decode(ProtoReader protoReader) throws IOException {
                C50479a aVar = new C50479a();
                aVar.f126032b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126031a = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126032b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserChanged userChanged) throws IOException {
                if (userChanged.user != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, userChanged.user);
                }
                if (userChanged.to_breakout_room_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userChanged.to_breakout_room_id);
                }
                protoWriter.writeBytes(userChanged.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomManage$UserChanged$a */
        public static final class C50479a extends Message.Builder<UserChanged, C50479a> {

            /* renamed from: a */
            public ByteviewUser f126031a;

            /* renamed from: b */
            public String f126032b;

            /* renamed from: a */
            public UserChanged build() {
                return new UserChanged(this.f126031a, this.f126032b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50479a newBuilder() {
            C50479a aVar = new C50479a();
            aVar.f126031a = this.user;
            aVar.f126032b = this.to_breakout_room_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "UserChanged");
            StringBuilder sb = new StringBuilder();
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            if (this.to_breakout_room_id != null) {
                sb.append(", to_breakout_room_id=");
                sb.append(this.to_breakout_room_id);
            }
            StringBuilder replace = sb.replace(0, 2, "UserChanged{");
            replace.append('}');
            return replace.toString();
        }

        public UserChanged(ByteviewUser byteviewUser, String str) {
            this(byteviewUser, str, ByteString.EMPTY);
        }

        public UserChanged(ByteviewUser byteviewUser, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user = byteviewUser;
            this.to_breakout_room_id = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomManage$b */
    private static final class C50482b extends ProtoAdapter<BreakoutRoomManage> {
        C50482b() {
            super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomManage.class);
        }

        /* renamed from: a */
        public int encodedSize(BreakoutRoomManage breakoutRoomManage) {
            int i;
            if (breakoutRoomManage.type != null) {
                i = ManageType.ADAPTER.encodedSizeWithTag(1, breakoutRoomManage.type);
            } else {
                i = 0;
            }
            return i + BreakoutRoomInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, breakoutRoomManage.infos) + UserChanged.ADAPTER.asRepeated().encodedSizeWithTag(3, breakoutRoomManage.user_changed_list) + breakoutRoomManage.unknownFields().size();
        }

        /* renamed from: a */
        public BreakoutRoomManage decode(ProtoReader protoReader) throws IOException {
            C50481a aVar = new C50481a();
            aVar.f126033a = ManageType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126033a = ManageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126034b.add(BreakoutRoomInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126035c.add(UserChanged.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BreakoutRoomManage breakoutRoomManage) throws IOException {
            if (breakoutRoomManage.type != null) {
                ManageType.ADAPTER.encodeWithTag(protoWriter, 1, breakoutRoomManage.type);
            }
            BreakoutRoomInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, breakoutRoomManage.infos);
            UserChanged.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, breakoutRoomManage.user_changed_list);
            protoWriter.writeBytes(breakoutRoomManage.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomManage$a */
    public static final class C50481a extends Message.Builder<BreakoutRoomManage, C50481a> {

        /* renamed from: a */
        public ManageType f126033a;

        /* renamed from: b */
        public List<BreakoutRoomInfo> f126034b = Internal.newMutableList();

        /* renamed from: c */
        public List<UserChanged> f126035c = Internal.newMutableList();

        /* renamed from: a */
        public BreakoutRoomManage build() {
            return new BreakoutRoomManage(this.f126033a, this.f126034b, this.f126035c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50481a mo174873a(List<BreakoutRoomInfo> list) {
            Internal.checkElementsNotNull(list);
            this.f126034b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50481a newBuilder() {
        C50481a aVar = new C50481a();
        aVar.f126033a = this.type;
        aVar.f126034b = Internal.copyOf("infos", this.infos);
        aVar.f126035c = Internal.copyOf("user_changed_list", this.user_changed_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "BreakoutRoomManage");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        if (!this.user_changed_list.isEmpty()) {
            sb.append(", user_changed_list=");
            sb.append(this.user_changed_list);
        }
        StringBuilder replace = sb.replace(0, 2, "BreakoutRoomManage{");
        replace.append('}');
        return replace.toString();
    }

    public BreakoutRoomManage(ManageType manageType, List<BreakoutRoomInfo> list, List<UserChanged> list2) {
        this(manageType, list, list2, ByteString.EMPTY);
    }

    public BreakoutRoomManage(ManageType manageType, List<BreakoutRoomInfo> list, List<UserChanged> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = manageType;
        this.infos = Internal.immutableCopyOf("infos", list);
        this.user_changed_list = Internal.immutableCopyOf("user_changed_list", list2);
    }
}
