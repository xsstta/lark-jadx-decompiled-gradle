package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class UpdateTodoSettingRequest extends Message<UpdateTodoSettingRequest, C19683a> {
    public static final ProtoAdapter<UpdateTodoSettingRequest> ADAPTER = new C19684b();
    public static final Type DEFAULT_TYPE = Type.TODO_SETTING;
    private static final long serialVersionUID = 0;
    public final TodoSetting setting;
    public final Type type;
    public final TodoListViewSetting view_setting;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        TODO_SETTING(1),
        VIEW_SETTING(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TODO_SETTING;
            }
            if (i != 2) {
                return null;
            }
            return VIEW_SETTING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateTodoSettingRequest$b */
    private static final class C19684b extends ProtoAdapter<UpdateTodoSettingRequest> {
        C19684b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateTodoSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateTodoSettingRequest updateTodoSettingRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (updateTodoSettingRequest.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, updateTodoSettingRequest.type);
            } else {
                i = 0;
            }
            if (updateTodoSettingRequest.setting != null) {
                i2 = TodoSetting.ADAPTER.encodedSizeWithTag(2, updateTodoSettingRequest.setting);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (updateTodoSettingRequest.view_setting != null) {
                i3 = TodoListViewSetting.ADAPTER.encodedSizeWithTag(3, updateTodoSettingRequest.view_setting);
            }
            return i4 + i3 + updateTodoSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateTodoSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19683a aVar = new C19683a();
            aVar.f48128a = Type.TODO_SETTING;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f48128a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f48129b = TodoSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48130c = TodoListViewSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateTodoSettingRequest updateTodoSettingRequest) throws IOException {
            if (updateTodoSettingRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, updateTodoSettingRequest.type);
            }
            if (updateTodoSettingRequest.setting != null) {
                TodoSetting.ADAPTER.encodeWithTag(protoWriter, 2, updateTodoSettingRequest.setting);
            }
            if (updateTodoSettingRequest.view_setting != null) {
                TodoListViewSetting.ADAPTER.encodeWithTag(protoWriter, 3, updateTodoSettingRequest.view_setting);
            }
            protoWriter.writeBytes(updateTodoSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateTodoSettingRequest$a */
    public static final class C19683a extends Message.Builder<UpdateTodoSettingRequest, C19683a> {

        /* renamed from: a */
        public Type f48128a;

        /* renamed from: b */
        public TodoSetting f48129b;

        /* renamed from: c */
        public TodoListViewSetting f48130c;

        /* renamed from: a */
        public UpdateTodoSettingRequest build() {
            return new UpdateTodoSettingRequest(this.f48128a, this.f48129b, this.f48130c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19683a mo66745a(TodoListViewSetting todoListViewSetting) {
            this.f48130c = todoListViewSetting;
            return this;
        }

        /* renamed from: a */
        public C19683a mo66746a(TodoSetting todoSetting) {
            this.f48129b = todoSetting;
            return this;
        }

        /* renamed from: a */
        public C19683a mo66747a(Type type) {
            this.f48128a = type;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19683a newBuilder() {
        C19683a aVar = new C19683a();
        aVar.f48128a = this.type;
        aVar.f48129b = this.setting;
        aVar.f48130c = this.view_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "UpdateTodoSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        if (this.view_setting != null) {
            sb.append(", view_setting=");
            sb.append(this.view_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateTodoSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateTodoSettingRequest(Type type2, TodoSetting todoSetting, TodoListViewSetting todoListViewSetting) {
        this(type2, todoSetting, todoListViewSetting, ByteString.EMPTY);
    }

    public UpdateTodoSettingRequest(Type type2, TodoSetting todoSetting, TodoListViewSetting todoListViewSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.setting = todoSetting;
        this.view_setting = todoListViewSetting;
    }
}
