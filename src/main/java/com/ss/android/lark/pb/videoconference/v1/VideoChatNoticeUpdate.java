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
import com.ss.android.lark.pb.videoconference.v1.VideoChatNotice;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatNoticeUpdate extends Message<VideoChatNoticeUpdate, C51272a> {
    public static final ProtoAdapter<VideoChatNoticeUpdate> ADAPTER = new C51273b();
    public static final Action DEFAULT_ACTION = Action.DISMISS;
    public static final VideoChatNotice.Type DEFAULT_TYPE = VideoChatNotice.Type.TOAST;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String key;
    public final String meeting_id;
    public final String push_sid;
    public final VideoChatNotice.Type type;

    public enum Action implements WireEnum {
        DISMISS(1);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return DISMISS;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatNoticeUpdate$b */
    private static final class C51273b extends ProtoAdapter<VideoChatNoticeUpdate> {
        C51273b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatNoticeUpdate.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatNoticeUpdate videoChatNoticeUpdate) {
            int i;
            int i2;
            int encodedSizeWithTag = Action.ADAPTER.encodedSizeWithTag(1, videoChatNoticeUpdate.action) + VideoChatNotice.Type.ADAPTER.encodedSizeWithTag(2, videoChatNoticeUpdate.type);
            int i3 = 0;
            if (videoChatNoticeUpdate.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatNoticeUpdate.key);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (videoChatNoticeUpdate.meeting_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoChatNoticeUpdate.meeting_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (videoChatNoticeUpdate.push_sid != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatNoticeUpdate.push_sid);
            }
            return i5 + i3 + videoChatNoticeUpdate.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatNoticeUpdate decode(ProtoReader protoReader) throws IOException {
            C51272a aVar = new C51272a();
            aVar.f127684a = Action.DISMISS;
            aVar.f127685b = VideoChatNotice.Type.TOAST;
            aVar.f127686c = "";
            aVar.f127687d = "";
            aVar.f127688e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127684a = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f127685b = VideoChatNotice.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f127686c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f127687d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127688e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatNoticeUpdate videoChatNoticeUpdate) throws IOException {
            Action.ADAPTER.encodeWithTag(protoWriter, 1, videoChatNoticeUpdate.action);
            VideoChatNotice.Type.ADAPTER.encodeWithTag(protoWriter, 2, videoChatNoticeUpdate.type);
            if (videoChatNoticeUpdate.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatNoticeUpdate.key);
            }
            if (videoChatNoticeUpdate.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoChatNoticeUpdate.meeting_id);
            }
            if (videoChatNoticeUpdate.push_sid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatNoticeUpdate.push_sid);
            }
            protoWriter.writeBytes(videoChatNoticeUpdate.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatNoticeUpdate$a */
    public static final class C51272a extends Message.Builder<VideoChatNoticeUpdate, C51272a> {

        /* renamed from: a */
        public Action f127684a;

        /* renamed from: b */
        public VideoChatNotice.Type f127685b;

        /* renamed from: c */
        public String f127686c;

        /* renamed from: d */
        public String f127687d;

        /* renamed from: e */
        public String f127688e;

        /* renamed from: a */
        public VideoChatNoticeUpdate build() {
            VideoChatNotice.Type type;
            Action action = this.f127684a;
            if (action != null && (type = this.f127685b) != null) {
                return new VideoChatNoticeUpdate(action, type, this.f127686c, this.f127687d, this.f127688e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f127685b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C51272a newBuilder() {
        C51272a aVar = new C51272a();
        aVar.f127684a = this.action;
        aVar.f127685b = this.type;
        aVar.f127686c = this.key;
        aVar.f127687d = this.meeting_id;
        aVar.f127688e = this.push_sid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatNoticeUpdate");
        StringBuilder sb = new StringBuilder();
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", type=");
        sb.append(this.type);
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.push_sid != null) {
            sb.append(", push_sid=");
            sb.append(this.push_sid);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatNoticeUpdate{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatNoticeUpdate(Action action2, VideoChatNotice.Type type2, String str, String str2, String str3) {
        this(action2, type2, str, str2, str3, ByteString.EMPTY);
    }

    public VideoChatNoticeUpdate(Action action2, VideoChatNotice.Type type2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action = action2;
        this.type = type2;
        this.key = str;
        this.meeting_id = str2;
        this.push_sid = str3;
    }
}
