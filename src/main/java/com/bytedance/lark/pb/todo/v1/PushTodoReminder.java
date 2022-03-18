package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushTodoReminder extends Message<PushTodoReminder, C19603a> {
    public static final ProtoAdapter<PushTodoReminder> ADAPTER = new C19604b();
    public static final Long DEFAULT_DUE_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    private static final long serialVersionUID = 0;
    public final Long due_time;
    public final String due_timezone;
    public final String guid;
    public final Boolean is_all_day;
    public final TodoReminder reminder;
    public final String summary;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoReminder$b */
    private static final class C19604b extends ProtoAdapter<PushTodoReminder> {
        C19604b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodoReminder.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodoReminder pushTodoReminder) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (pushTodoReminder.guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushTodoReminder.guid);
            } else {
                i = 0;
            }
            if (pushTodoReminder.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushTodoReminder.summary);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (pushTodoReminder.due_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, pushTodoReminder.due_time);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pushTodoReminder.due_timezone != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushTodoReminder.due_timezone);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pushTodoReminder.is_all_day != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pushTodoReminder.is_all_day);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (pushTodoReminder.reminder != null) {
                i6 = TodoReminder.ADAPTER.encodedSizeWithTag(6, pushTodoReminder.reminder);
            }
            return i10 + i6 + pushTodoReminder.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodoReminder decode(ProtoReader protoReader) throws IOException {
            C19603a aVar = new C19603a();
            aVar.f47953a = "";
            aVar.f47954b = "";
            aVar.f47955c = 0L;
            aVar.f47956d = "";
            aVar.f47957e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47953a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47954b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47955c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47956d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47957e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47958f = TodoReminder.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushTodoReminder pushTodoReminder) throws IOException {
            if (pushTodoReminder.guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushTodoReminder.guid);
            }
            if (pushTodoReminder.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushTodoReminder.summary);
            }
            if (pushTodoReminder.due_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pushTodoReminder.due_time);
            }
            if (pushTodoReminder.due_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushTodoReminder.due_timezone);
            }
            if (pushTodoReminder.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pushTodoReminder.is_all_day);
            }
            if (pushTodoReminder.reminder != null) {
                TodoReminder.ADAPTER.encodeWithTag(protoWriter, 6, pushTodoReminder.reminder);
            }
            protoWriter.writeBytes(pushTodoReminder.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoReminder$a */
    public static final class C19603a extends Message.Builder<PushTodoReminder, C19603a> {

        /* renamed from: a */
        public String f47953a;

        /* renamed from: b */
        public String f47954b;

        /* renamed from: c */
        public Long f47955c;

        /* renamed from: d */
        public String f47956d;

        /* renamed from: e */
        public Boolean f47957e;

        /* renamed from: f */
        public TodoReminder f47958f;

        /* renamed from: a */
        public PushTodoReminder build() {
            return new PushTodoReminder(this.f47953a, this.f47954b, this.f47955c, this.f47956d, this.f47957e, this.f47958f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19603a newBuilder() {
        C19603a aVar = new C19603a();
        aVar.f47953a = this.guid;
        aVar.f47954b = this.summary;
        aVar.f47955c = this.due_time;
        aVar.f47956d = this.due_timezone;
        aVar.f47957e = this.is_all_day;
        aVar.f47958f = this.reminder;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodoReminder");
        StringBuilder sb = new StringBuilder();
        if (this.guid != null) {
            sb.append(", guid=");
            sb.append(this.guid);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.due_time != null) {
            sb.append(", due_time=");
            sb.append(this.due_time);
        }
        if (this.due_timezone != null) {
            sb.append(", due_timezone=");
            sb.append(this.due_timezone);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.reminder != null) {
            sb.append(", reminder=");
            sb.append(this.reminder);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodoReminder{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodoReminder(String str, String str2, Long l, String str3, Boolean bool, TodoReminder todoReminder) {
        this(str, str2, l, str3, bool, todoReminder, ByteString.EMPTY);
    }

    public PushTodoReminder(String str, String str2, Long l, String str3, Boolean bool, TodoReminder todoReminder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guid = str;
        this.summary = str2;
        this.due_time = l;
        this.due_timezone = str3;
        this.is_all_day = bool;
        this.reminder = todoReminder;
    }
}
