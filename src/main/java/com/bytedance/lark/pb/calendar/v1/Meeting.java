package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Meeting extends Message<Meeting, C15864a> {
    public static final ProtoAdapter<Meeting> ADAPTER = new C15865b();
    public static final Boolean DEFAULT_IS_FIRST_ENTRANCE = false;
    public static final Boolean DEFAULT_SHOULD_SHOW_SCROLL = true;
    public static final Version DEFAULT_VERSION = Version.V3;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String docs_url;
    public final String id;
    public final Boolean is_first_entrance;
    public final Boolean should_show_scroll;
    public final Version version;

    public enum Version implements WireEnum {
        NONE_VERSION(0),
        V3(1);
        
        public static final ProtoAdapter<Version> ADAPTER = ProtoAdapter.newEnumAdapter(Version.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Version fromValue(int i) {
            if (i == 0) {
                return NONE_VERSION;
            }
            if (i != 1) {
                return null;
            }
            return V3;
        }

        private Version(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Meeting$b */
    private static final class C15865b extends ProtoAdapter<Meeting> {
        C15865b() {
            super(FieldEncoding.LENGTH_DELIMITED, Meeting.class);
        }

        /* renamed from: a */
        public int encodedSize(Meeting meeting) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, meeting.id);
            int i5 = 0;
            if (meeting.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, meeting.chat_id);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (meeting.is_first_entrance != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, meeting.is_first_entrance);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (meeting.docs_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, meeting.docs_url);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (meeting.should_show_scroll != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, meeting.should_show_scroll);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (meeting.version != null) {
                i5 = Version.ADAPTER.encodedSizeWithTag(6, meeting.version);
            }
            return i9 + i5 + meeting.unknownFields().size();
        }

        /* renamed from: a */
        public Meeting decode(ProtoReader protoReader) throws IOException {
            C15864a aVar = new C15864a();
            aVar.f41685a = "";
            aVar.f41686b = "";
            aVar.f41687c = false;
            aVar.f41688d = "";
            aVar.f41689e = true;
            aVar.f41690f = Version.V3;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41685a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41686b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41687c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41688d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41689e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f41690f = Version.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
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
        public void encode(ProtoWriter protoWriter, Meeting meeting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meeting.id);
            if (meeting.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, meeting.chat_id);
            }
            if (meeting.is_first_entrance != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, meeting.is_first_entrance);
            }
            if (meeting.docs_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, meeting.docs_url);
            }
            if (meeting.should_show_scroll != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, meeting.should_show_scroll);
            }
            if (meeting.version != null) {
                Version.ADAPTER.encodeWithTag(protoWriter, 6, meeting.version);
            }
            protoWriter.writeBytes(meeting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Meeting$a */
    public static final class C15864a extends Message.Builder<Meeting, C15864a> {

        /* renamed from: a */
        public String f41685a;

        /* renamed from: b */
        public String f41686b;

        /* renamed from: c */
        public Boolean f41687c;

        /* renamed from: d */
        public String f41688d;

        /* renamed from: e */
        public Boolean f41689e;

        /* renamed from: f */
        public Version f41690f;

        /* renamed from: a */
        public Meeting build() {
            String str = this.f41685a;
            if (str != null) {
                return new Meeting(str, this.f41686b, this.f41687c, this.f41688d, this.f41689e, this.f41690f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15864a newBuilder() {
        C15864a aVar = new C15864a();
        aVar.f41685a = this.id;
        aVar.f41686b = this.chat_id;
        aVar.f41687c = this.is_first_entrance;
        aVar.f41688d = this.docs_url;
        aVar.f41689e = this.should_show_scroll;
        aVar.f41690f = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "Meeting");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.is_first_entrance != null) {
            sb.append(", is_first_entrance=");
            sb.append(this.is_first_entrance);
        }
        if (this.docs_url != null) {
            sb.append(", docs_url=");
            sb.append(this.docs_url);
        }
        if (this.should_show_scroll != null) {
            sb.append(", should_show_scroll=");
            sb.append(this.should_show_scroll);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "Meeting{");
        replace.append('}');
        return replace.toString();
    }

    public Meeting(String str, String str2, Boolean bool, String str3, Boolean bool2, Version version2) {
        this(str, str2, bool, str3, bool2, version2, ByteString.EMPTY);
    }

    public Meeting(String str, String str2, Boolean bool, String str3, Boolean bool2, Version version2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.chat_id = str2;
        this.is_first_entrance = bool;
        this.docs_url = str3;
        this.should_show_scroll = bool2;
        this.version = version2;
    }
}
