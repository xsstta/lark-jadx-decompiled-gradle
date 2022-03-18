package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatPrompt extends Message<VideoChatPrompt, C51278a> {
    public static final ProtoAdapter<VideoChatPrompt> ADAPTER = new C51279b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN_ACTION;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final CalendarStartPrompt calendar_start_prompt;
    public final String prompt_id;
    public final String push_sid;
    public final Type type;

    public enum Action implements WireEnum {
        UNKNOWN_ACTION(0),
        SHOW(1),
        DISMISS(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ACTION;
            }
            if (i == 1) {
                return SHOW;
            }
            if (i != 2) {
                return null;
            }
            return DISMISS;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        CALENDAR_START(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return CALENDAR_START;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class CalendarStartPrompt extends Message<CalendarStartPrompt, C51276a> {
        public static final ProtoAdapter<CalendarStartPrompt> ADAPTER = new C51277b();
        public static final Long DEFAULT_EVENT_START_TIME = 0L;
        public static final Long DEFAULT_PROMPT_CREATE_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long event_start_time;
        public final String event_title;
        public final String meeting_id;
        public final Long prompt_create_time;
        public final ByteviewUser start_user;
        public final String unique_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt$CalendarStartPrompt$b */
        private static final class C51277b extends ProtoAdapter<CalendarStartPrompt> {
            C51277b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarStartPrompt.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarStartPrompt calendarStartPrompt) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (calendarStartPrompt.unique_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarStartPrompt.unique_id);
                } else {
                    i = 0;
                }
                if (calendarStartPrompt.event_start_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, calendarStartPrompt.event_start_time);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (calendarStartPrompt.event_title != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, calendarStartPrompt.event_title);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (calendarStartPrompt.start_user != null) {
                    i4 = ByteviewUser.ADAPTER.encodedSizeWithTag(5, calendarStartPrompt.start_user);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (calendarStartPrompt.meeting_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarStartPrompt.meeting_id);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (calendarStartPrompt.prompt_create_time != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, calendarStartPrompt.prompt_create_time);
                }
                return i10 + i6 + calendarStartPrompt.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarStartPrompt decode(ProtoReader protoReader) throws IOException {
                C51276a aVar = new C51276a();
                aVar.f127696a = "";
                aVar.f127697b = 0L;
                aVar.f127698c = "";
                aVar.f127700e = "";
                aVar.f127701f = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 2:
                                aVar.f127696a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f127697b = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127698c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127699d = ByteviewUser.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127700e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127701f = ProtoAdapter.INT64.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, CalendarStartPrompt calendarStartPrompt) throws IOException {
                if (calendarStartPrompt.unique_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarStartPrompt.unique_id);
                }
                if (calendarStartPrompt.event_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarStartPrompt.event_start_time);
                }
                if (calendarStartPrompt.event_title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendarStartPrompt.event_title);
                }
                if (calendarStartPrompt.start_user != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 5, calendarStartPrompt.start_user);
                }
                if (calendarStartPrompt.meeting_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarStartPrompt.meeting_id);
                }
                if (calendarStartPrompt.prompt_create_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, calendarStartPrompt.prompt_create_time);
                }
                protoWriter.writeBytes(calendarStartPrompt.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt$CalendarStartPrompt$a */
        public static final class C51276a extends Message.Builder<CalendarStartPrompt, C51276a> {

            /* renamed from: a */
            public String f127696a;

            /* renamed from: b */
            public Long f127697b;

            /* renamed from: c */
            public String f127698c;

            /* renamed from: d */
            public ByteviewUser f127699d;

            /* renamed from: e */
            public String f127700e;

            /* renamed from: f */
            public Long f127701f;

            /* renamed from: a */
            public CalendarStartPrompt build() {
                return new CalendarStartPrompt(this.f127696a, this.f127697b, this.f127698c, this.f127699d, this.f127700e, this.f127701f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51276a newBuilder() {
            C51276a aVar = new C51276a();
            aVar.f127696a = this.unique_id;
            aVar.f127697b = this.event_start_time;
            aVar.f127698c = this.event_title;
            aVar.f127699d = this.start_user;
            aVar.f127700e = this.meeting_id;
            aVar.f127701f = this.prompt_create_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "CalendarStartPrompt");
            StringBuilder sb = new StringBuilder();
            if (this.unique_id != null) {
                sb.append(", unique_id=");
                sb.append(this.unique_id);
            }
            if (this.event_start_time != null) {
                sb.append(", event_start_time=");
                sb.append(this.event_start_time);
            }
            if (this.event_title != null) {
                sb.append(", event_title=");
                sb.append(this.event_title);
            }
            if (this.start_user != null) {
                sb.append(", start_user=");
                sb.append(this.start_user);
            }
            if (this.meeting_id != null) {
                sb.append(", meeting_id=");
                sb.append(this.meeting_id);
            }
            if (this.prompt_create_time != null) {
                sb.append(", prompt_create_time=");
                sb.append(this.prompt_create_time);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarStartPrompt{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarStartPrompt(String str, Long l, String str2, ByteviewUser byteviewUser, String str3, Long l2) {
            this(str, l, str2, byteviewUser, str3, l2, ByteString.EMPTY);
        }

        public CalendarStartPrompt(String str, Long l, String str2, ByteviewUser byteviewUser, String str3, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.unique_id = str;
            this.event_start_time = l;
            this.event_title = str2;
            this.start_user = byteviewUser;
            this.meeting_id = str3;
            this.prompt_create_time = l2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt$b */
    private static final class C51279b extends ProtoAdapter<VideoChatPrompt> {
        C51279b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatPrompt.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatPrompt videoChatPrompt) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, videoChatPrompt.type) + Action.ADAPTER.encodedSizeWithTag(2, videoChatPrompt.action) + ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatPrompt.prompt_id);
            int i2 = 0;
            if (videoChatPrompt.calendar_start_prompt != null) {
                i = CalendarStartPrompt.ADAPTER.encodedSizeWithTag(4, videoChatPrompt.calendar_start_prompt);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (videoChatPrompt.push_sid != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatPrompt.push_sid);
            }
            return i3 + i2 + videoChatPrompt.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatPrompt decode(ProtoReader protoReader) throws IOException {
            C51278a aVar = new C51278a();
            aVar.f127702a = Type.UNKNOWN_TYPE;
            aVar.f127703b = Action.UNKNOWN_ACTION;
            aVar.f127704c = "";
            aVar.f127706e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127702a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f127703b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f127704c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f127705d = CalendarStartPrompt.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127706e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatPrompt videoChatPrompt) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, videoChatPrompt.type);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, videoChatPrompt.action);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatPrompt.prompt_id);
            if (videoChatPrompt.calendar_start_prompt != null) {
                CalendarStartPrompt.ADAPTER.encodeWithTag(protoWriter, 4, videoChatPrompt.calendar_start_prompt);
            }
            if (videoChatPrompt.push_sid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatPrompt.push_sid);
            }
            protoWriter.writeBytes(videoChatPrompt.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt$a */
    public static final class C51278a extends Message.Builder<VideoChatPrompt, C51278a> {

        /* renamed from: a */
        public Type f127702a;

        /* renamed from: b */
        public Action f127703b;

        /* renamed from: c */
        public String f127704c;

        /* renamed from: d */
        public CalendarStartPrompt f127705d;

        /* renamed from: e */
        public String f127706e;

        /* renamed from: a */
        public VideoChatPrompt build() {
            Action action;
            String str;
            Type type = this.f127702a;
            if (type != null && (action = this.f127703b) != null && (str = this.f127704c) != null) {
                return new VideoChatPrompt(type, action, str, this.f127705d, this.f127706e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f127703b, "action", this.f127704c, "prompt_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51278a newBuilder() {
        C51278a aVar = new C51278a();
        aVar.f127702a = this.type;
        aVar.f127703b = this.action;
        aVar.f127704c = this.prompt_id;
        aVar.f127705d = this.calendar_start_prompt;
        aVar.f127706e = this.push_sid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatPrompt");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", prompt_id=");
        sb.append(this.prompt_id);
        if (this.calendar_start_prompt != null) {
            sb.append(", calendar_start_prompt=");
            sb.append(this.calendar_start_prompt);
        }
        if (this.push_sid != null) {
            sb.append(", push_sid=");
            sb.append(this.push_sid);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatPrompt{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatPrompt(Type type2, Action action2, String str, CalendarStartPrompt calendarStartPrompt, String str2) {
        this(type2, action2, str, calendarStartPrompt, str2, ByteString.EMPTY);
    }

    public VideoChatPrompt(Type type2, Action action2, String str, CalendarStartPrompt calendarStartPrompt, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.action = action2;
        this.prompt_id = str;
        this.calendar_start_prompt = calendarStartPrompt;
        this.push_sid = str2;
    }
}
