package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushTodoSettingChangeNotification extends Message<PushTodoSettingChangeNotification, C19605a> {
    public static final ProtoAdapter<PushTodoSettingChangeNotification> ADAPTER = new C19606b();
    private static final long serialVersionUID = 0;
    public final TodoSetting setting;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoSettingChangeNotification$b */
    private static final class C19606b extends ProtoAdapter<PushTodoSettingChangeNotification> {
        C19606b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodoSettingChangeNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodoSettingChangeNotification pushTodoSettingChangeNotification) {
            int i;
            if (pushTodoSettingChangeNotification.setting != null) {
                i = TodoSetting.ADAPTER.encodedSizeWithTag(1, pushTodoSettingChangeNotification.setting);
            } else {
                i = 0;
            }
            return i + pushTodoSettingChangeNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodoSettingChangeNotification decode(ProtoReader protoReader) throws IOException {
            C19605a aVar = new C19605a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47959a = TodoSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTodoSettingChangeNotification pushTodoSettingChangeNotification) throws IOException {
            if (pushTodoSettingChangeNotification.setting != null) {
                TodoSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushTodoSettingChangeNotification.setting);
            }
            protoWriter.writeBytes(pushTodoSettingChangeNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoSettingChangeNotification$a */
    public static final class C19605a extends Message.Builder<PushTodoSettingChangeNotification, C19605a> {

        /* renamed from: a */
        public TodoSetting f47959a;

        /* renamed from: a */
        public PushTodoSettingChangeNotification build() {
            return new PushTodoSettingChangeNotification(this.f47959a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19605a newBuilder() {
        C19605a aVar = new C19605a();
        aVar.f47959a = this.setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodoSettingChangeNotification");
        StringBuilder sb = new StringBuilder();
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodoSettingChangeNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodoSettingChangeNotification(TodoSetting todoSetting) {
        this(todoSetting, ByteString.EMPTY);
    }

    public PushTodoSettingChangeNotification(TodoSetting todoSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = todoSetting;
    }
}
