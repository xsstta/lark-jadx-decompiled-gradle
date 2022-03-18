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

public final class SketchOperationUnit extends Message<SketchOperationUnit, C51082a> {
    public static final ProtoAdapter<SketchOperationUnit> ADAPTER = new C51083b();
    public static final Action DEFAULT_ACTION = Action.DRAW;
    public static final ClearType DEFAULT_CLEAR_TYPE = ClearType.OTHER;
    public static final SketchCommand DEFAULT_CMD = SketchCommand.ADD;
    public static final Long DEFAULT_TIMESTAMP_MS = 0L;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final ClearType clear_type;
    public final SketchCommand cmd;
    public final SketchRemoveData remove_data;
    public final List<SketchDataUnit> sketch_units;
    public final Long timestamp_ms;

    public static final class SketchRemoveData extends Message<SketchRemoveData, C51080a> {
        public static final ProtoAdapter<SketchRemoveData> ADAPTER = new C51081b();
        public static final Integer DEFAULT_CURRENT_STEP = 0;
        public static final RemoveType DEFAULT_REMOVE_TYPE = RemoveType.REMOVE_ALL;
        private static final long serialVersionUID = 0;
        public final Integer current_step;
        public final List<String> ids;
        public final RemoveType remove_type;
        public final List<ByteviewUser> users;

        public enum RemoveType implements WireEnum {
            REMOVE_ALL(1),
            STORE_BY_DEVICE_ID(2),
            REMOVE_BY_DEVICE_ID(3),
            REMOVE_BY_SHAPE_ID(4);
            
            public static final ProtoAdapter<RemoveType> ADAPTER = ProtoAdapter.newEnumAdapter(RemoveType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static RemoveType fromValue(int i) {
                if (i == 1) {
                    return REMOVE_ALL;
                }
                if (i == 2) {
                    return STORE_BY_DEVICE_ID;
                }
                if (i == 3) {
                    return REMOVE_BY_DEVICE_ID;
                }
                if (i != 4) {
                    return null;
                }
                return REMOVE_BY_SHAPE_ID;
            }

            private RemoveType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit$SketchRemoveData$b */
        private static final class C51081b extends ProtoAdapter<SketchRemoveData> {
            C51081b() {
                super(FieldEncoding.LENGTH_DELIMITED, SketchRemoveData.class);
            }

            /* renamed from: a */
            public int encodedSize(SketchRemoveData sketchRemoveData) {
                int i;
                int encodedSizeWithTag = RemoveType.ADAPTER.encodedSizeWithTag(1, sketchRemoveData.remove_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, sketchRemoveData.ids);
                if (sketchRemoveData.current_step != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, sketchRemoveData.current_step);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(4, sketchRemoveData.users) + sketchRemoveData.unknownFields().size();
            }

            /* renamed from: a */
            public SketchRemoveData decode(ProtoReader protoReader) throws IOException {
                C51080a aVar = new C51080a();
                aVar.f127197a = RemoveType.REMOVE_ALL;
                aVar.f127199c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f127197a = RemoveType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f127198b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f127199c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127200d.add(ByteviewUser.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SketchRemoveData sketchRemoveData) throws IOException {
                RemoveType.ADAPTER.encodeWithTag(protoWriter, 1, sketchRemoveData.remove_type);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, sketchRemoveData.ids);
                if (sketchRemoveData.current_step != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sketchRemoveData.current_step);
                }
                ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, sketchRemoveData.users);
                protoWriter.writeBytes(sketchRemoveData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit$SketchRemoveData$a */
        public static final class C51080a extends Message.Builder<SketchRemoveData, C51080a> {

            /* renamed from: a */
            public RemoveType f127197a;

            /* renamed from: b */
            public List<String> f127198b = Internal.newMutableList();

            /* renamed from: c */
            public Integer f127199c;

            /* renamed from: d */
            public List<ByteviewUser> f127200d = Internal.newMutableList();

            /* renamed from: a */
            public SketchRemoveData build() {
                RemoveType removeType = this.f127197a;
                if (removeType != null) {
                    return new SketchRemoveData(removeType, this.f127198b, this.f127199c, this.f127200d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(removeType, "remove_type");
            }
        }

        @Override // com.squareup.wire.Message
        public C51080a newBuilder() {
            C51080a aVar = new C51080a();
            aVar.f127197a = this.remove_type;
            aVar.f127198b = Internal.copyOf("ids", this.ids);
            aVar.f127199c = this.current_step;
            aVar.f127200d = Internal.copyOf("users", this.users);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SketchRemoveData");
            StringBuilder sb = new StringBuilder();
            sb.append(", remove_type=");
            sb.append(this.remove_type);
            if (!this.ids.isEmpty()) {
                sb.append(", ids=");
                sb.append(this.ids);
            }
            if (this.current_step != null) {
                sb.append(", current_step=");
                sb.append(this.current_step);
            }
            if (!this.users.isEmpty()) {
                sb.append(", users=");
                sb.append(this.users);
            }
            StringBuilder replace = sb.replace(0, 2, "SketchRemoveData{");
            replace.append('}');
            return replace.toString();
        }

        public SketchRemoveData(RemoveType removeType, List<String> list, Integer num, List<ByteviewUser> list2) {
            this(removeType, list, num, list2, ByteString.EMPTY);
        }

        public SketchRemoveData(RemoveType removeType, List<String> list, Integer num, List<ByteviewUser> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.remove_type = removeType;
            this.ids = Internal.immutableCopyOf("ids", list);
            this.current_step = num;
            this.users = Internal.immutableCopyOf("users", list2);
        }
    }

    public enum Action implements WireEnum {
        DRAW(1),
        UNDO(2),
        CLEAR(3),
        REDO(4),
        ERASER(5);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 1) {
                return DRAW;
            }
            if (i == 2) {
                return UNDO;
            }
            if (i == 3) {
                return CLEAR;
            }
            if (i == 4) {
                return REDO;
            }
            if (i != 5) {
                return null;
            }
            return ERASER;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum ClearType implements WireEnum {
        OTHER(1),
        SELF(2),
        ALL(3);
        
        public static final ProtoAdapter<ClearType> ADAPTER = ProtoAdapter.newEnumAdapter(ClearType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ClearType fromValue(int i) {
            if (i == 1) {
                return OTHER;
            }
            if (i == 2) {
                return SELF;
            }
            if (i != 3) {
                return null;
            }
            return ALL;
        }

        private ClearType(int i) {
            this.value = i;
        }
    }

    public enum SketchCommand implements WireEnum {
        ADD(1),
        REMOVE(2),
        UPDATE(3);
        
        public static final ProtoAdapter<SketchCommand> ADAPTER = ProtoAdapter.newEnumAdapter(SketchCommand.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SketchCommand fromValue(int i) {
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return REMOVE;
            }
            if (i != 3) {
                return null;
            }
            return UPDATE;
        }

        private SketchCommand(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit$b */
    private static final class C51083b extends ProtoAdapter<SketchOperationUnit> {
        C51083b() {
            super(FieldEncoding.LENGTH_DELIMITED, SketchOperationUnit.class);
        }

        /* renamed from: a */
        public int encodedSize(SketchOperationUnit sketchOperationUnit) {
            int i;
            int i2;
            int encodedSizeWithTag = SketchCommand.ADAPTER.encodedSizeWithTag(1, sketchOperationUnit.cmd) + Action.ADAPTER.encodedSizeWithTag(2, sketchOperationUnit.action) + SketchDataUnit.ADAPTER.asRepeated().encodedSizeWithTag(3, sketchOperationUnit.sketch_units);
            int i3 = 0;
            if (sketchOperationUnit.clear_type != null) {
                i = ClearType.ADAPTER.encodedSizeWithTag(4, sketchOperationUnit.clear_type);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (sketchOperationUnit.remove_data != null) {
                i2 = SketchRemoveData.ADAPTER.encodedSizeWithTag(5, sketchOperationUnit.remove_data);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (sketchOperationUnit.timestamp_ms != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(6, sketchOperationUnit.timestamp_ms);
            }
            return i5 + i3 + sketchOperationUnit.unknownFields().size();
        }

        /* renamed from: a */
        public SketchOperationUnit decode(ProtoReader protoReader) throws IOException {
            C51082a aVar = new C51082a();
            aVar.f127201a = SketchCommand.ADD;
            aVar.f127202b = Action.DRAW;
            aVar.f127204d = ClearType.OTHER;
            aVar.f127206f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f127201a = SketchCommand.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f127202b = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f127203c.add(SketchDataUnit.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f127204d = ClearType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 5:
                            aVar.f127205e = SketchRemoveData.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127206f = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SketchOperationUnit sketchOperationUnit) throws IOException {
            SketchCommand.ADAPTER.encodeWithTag(protoWriter, 1, sketchOperationUnit.cmd);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, sketchOperationUnit.action);
            SketchDataUnit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, sketchOperationUnit.sketch_units);
            if (sketchOperationUnit.clear_type != null) {
                ClearType.ADAPTER.encodeWithTag(protoWriter, 4, sketchOperationUnit.clear_type);
            }
            if (sketchOperationUnit.remove_data != null) {
                SketchRemoveData.ADAPTER.encodeWithTag(protoWriter, 5, sketchOperationUnit.remove_data);
            }
            if (sketchOperationUnit.timestamp_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, sketchOperationUnit.timestamp_ms);
            }
            protoWriter.writeBytes(sketchOperationUnit.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit$a */
    public static final class C51082a extends Message.Builder<SketchOperationUnit, C51082a> {

        /* renamed from: a */
        public SketchCommand f127201a;

        /* renamed from: b */
        public Action f127202b;

        /* renamed from: c */
        public List<SketchDataUnit> f127203c = Internal.newMutableList();

        /* renamed from: d */
        public ClearType f127204d;

        /* renamed from: e */
        public SketchRemoveData f127205e;

        /* renamed from: f */
        public Long f127206f;

        /* renamed from: a */
        public SketchOperationUnit build() {
            Action action;
            SketchCommand sketchCommand = this.f127201a;
            if (sketchCommand != null && (action = this.f127202b) != null) {
                return new SketchOperationUnit(sketchCommand, action, this.f127203c, this.f127204d, this.f127205e, this.f127206f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(sketchCommand, "cmd", this.f127202b, "action");
        }
    }

    @Override // com.squareup.wire.Message
    public C51082a newBuilder() {
        C51082a aVar = new C51082a();
        aVar.f127201a = this.cmd;
        aVar.f127202b = this.action;
        aVar.f127203c = Internal.copyOf("sketch_units", this.sketch_units);
        aVar.f127204d = this.clear_type;
        aVar.f127205e = this.remove_data;
        aVar.f127206f = this.timestamp_ms;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SketchOperationUnit");
        StringBuilder sb = new StringBuilder();
        sb.append(", cmd=");
        sb.append(this.cmd);
        sb.append(", action=");
        sb.append(this.action);
        if (!this.sketch_units.isEmpty()) {
            sb.append(", sketch_units=");
            sb.append(this.sketch_units);
        }
        if (this.clear_type != null) {
            sb.append(", clear_type=");
            sb.append(this.clear_type);
        }
        if (this.remove_data != null) {
            sb.append(", remove_data=");
            sb.append(this.remove_data);
        }
        if (this.timestamp_ms != null) {
            sb.append(", timestamp_ms=");
            sb.append(this.timestamp_ms);
        }
        StringBuilder replace = sb.replace(0, 2, "SketchOperationUnit{");
        replace.append('}');
        return replace.toString();
    }

    public SketchOperationUnit(SketchCommand sketchCommand, Action action2, List<SketchDataUnit> list, ClearType clearType, SketchRemoveData sketchRemoveData, Long l) {
        this(sketchCommand, action2, list, clearType, sketchRemoveData, l, ByteString.EMPTY);
    }

    public SketchOperationUnit(SketchCommand sketchCommand, Action action2, List<SketchDataUnit> list, ClearType clearType, SketchRemoveData sketchRemoveData, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd = sketchCommand;
        this.action = action2;
        this.sketch_units = Internal.immutableCopyOf("sketch_units", list);
        this.clear_type = clearType;
        this.remove_data = sketchRemoveData;
        this.timestamp_ms = l;
    }
}
