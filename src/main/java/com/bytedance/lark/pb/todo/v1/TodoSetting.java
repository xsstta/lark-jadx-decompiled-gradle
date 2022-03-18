package com.bytedance.lark.pb.todo.v1;

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

public final class TodoSetting extends Message<TodoSetting, C19667a> {
    public static final ProtoAdapter<TodoSetting> ADAPTER = new C19668b();
    public static final Integer DEFAULT_DUE_REMINDER_OFFSET = 30;
    public static final Boolean DEFAULT_ENABLE_DAILY_REMIND = true;
    private static final long serialVersionUID = 0;
    public final TodoBadgeConfig badge_config;
    public final Integer due_reminder_offset;
    public final Boolean enable_daily_remind;
    public final List<TodoListViewSetting> tab_view_settings;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoSetting$b */
    private static final class C19668b extends ProtoAdapter<TodoSetting> {
        C19668b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoSetting todoSetting) {
            int i;
            int i2;
            int i3 = 0;
            if (todoSetting.enable_daily_remind != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, todoSetting.enable_daily_remind);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + TodoListViewSetting.ADAPTER.asRepeated().encodedSizeWithTag(2, todoSetting.tab_view_settings);
            if (todoSetting.badge_config != null) {
                i2 = TodoBadgeConfig.ADAPTER.encodedSizeWithTag(3, todoSetting.badge_config);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (todoSetting.due_reminder_offset != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, todoSetting.due_reminder_offset);
            }
            return i4 + i3 + todoSetting.unknownFields().size();
        }

        /* renamed from: a */
        public TodoSetting decode(ProtoReader protoReader) throws IOException {
            C19667a aVar = new C19667a();
            aVar.f48109a = true;
            aVar.f48112d = 30;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48109a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48110b.add(TodoListViewSetting.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f48111c = TodoBadgeConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48112d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoSetting todoSetting) throws IOException {
            if (todoSetting.enable_daily_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, todoSetting.enable_daily_remind);
            }
            TodoListViewSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, todoSetting.tab_view_settings);
            if (todoSetting.badge_config != null) {
                TodoBadgeConfig.ADAPTER.encodeWithTag(protoWriter, 3, todoSetting.badge_config);
            }
            if (todoSetting.due_reminder_offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, todoSetting.due_reminder_offset);
            }
            protoWriter.writeBytes(todoSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoSetting$a */
    public static final class C19667a extends Message.Builder<TodoSetting, C19667a> {

        /* renamed from: a */
        public Boolean f48109a;

        /* renamed from: b */
        public List<TodoListViewSetting> f48110b = Internal.newMutableList();

        /* renamed from: c */
        public TodoBadgeConfig f48111c;

        /* renamed from: d */
        public Integer f48112d;

        /* renamed from: a */
        public TodoSetting build() {
            return new TodoSetting(this.f48109a, this.f48110b, this.f48111c, this.f48112d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19667a newBuilder() {
        C19667a aVar = new C19667a();
        aVar.f48109a = this.enable_daily_remind;
        aVar.f48110b = Internal.copyOf("tab_view_settings", this.tab_view_settings);
        aVar.f48111c = this.badge_config;
        aVar.f48112d = this.due_reminder_offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoSetting");
        StringBuilder sb = new StringBuilder();
        if (this.enable_daily_remind != null) {
            sb.append(", enable_daily_remind=");
            sb.append(this.enable_daily_remind);
        }
        if (!this.tab_view_settings.isEmpty()) {
            sb.append(", tab_view_settings=");
            sb.append(this.tab_view_settings);
        }
        if (this.badge_config != null) {
            sb.append(", badge_config=");
            sb.append(this.badge_config);
        }
        if (this.due_reminder_offset != null) {
            sb.append(", due_reminder_offset=");
            sb.append(this.due_reminder_offset);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoSetting{");
        replace.append('}');
        return replace.toString();
    }

    public TodoSetting(Boolean bool, List<TodoListViewSetting> list, TodoBadgeConfig todoBadgeConfig, Integer num) {
        this(bool, list, todoBadgeConfig, num, ByteString.EMPTY);
    }

    public TodoSetting(Boolean bool, List<TodoListViewSetting> list, TodoBadgeConfig todoBadgeConfig, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_daily_remind = bool;
        this.tab_view_settings = Internal.immutableCopyOf("tab_view_settings", list);
        this.badge_config = todoBadgeConfig;
        this.due_reminder_offset = num;
    }
}
