package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class WhiteboardData extends Message<WhiteboardData, C51318a> {
    public static final ProtoAdapter<WhiteboardData> ADAPTER = new C51319b();
    public static final Integer DEFAULT_VERSION = 0;
    public static final Boolean DEFAULT_VISIBLE = false;
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final ByteviewUser user;
    public final Integer version;
    public final Boolean visible;
    public final String whiteboard_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.WhiteboardData$b */
    private static final class C51319b extends ProtoAdapter<WhiteboardData> {
        C51319b() {
            super(FieldEncoding.LENGTH_DELIMITED, WhiteboardData.class);
        }

        /* renamed from: a */
        public int encodedSize(WhiteboardData whiteboardData) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, whiteboardData.whiteboard_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, whiteboardData.version) + ProtoAdapter.BOOL.encodedSizeWithTag(3, whiteboardData.visible);
            int i2 = 0;
            if (whiteboardData.user != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(4, whiteboardData.user);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (whiteboardData.meeting_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(10, whiteboardData.meeting_id);
            }
            return i3 + i2 + whiteboardData.unknownFields().size();
        }

        /* renamed from: a */
        public WhiteboardData decode(ProtoReader protoReader) throws IOException {
            C51318a aVar = new C51318a();
            aVar.f127799a = "";
            aVar.f127800b = 0;
            aVar.f127801c = false;
            aVar.f127803e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127799a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127800b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127801c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f127802d = ByteviewUser.ADAPTER.decode(protoReader);
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127803e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WhiteboardData whiteboardData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, whiteboardData.whiteboard_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, whiteboardData.version);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, whiteboardData.visible);
            if (whiteboardData.user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 4, whiteboardData.user);
            }
            if (whiteboardData.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, whiteboardData.meeting_id);
            }
            protoWriter.writeBytes(whiteboardData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.WhiteboardData$a */
    public static final class C51318a extends Message.Builder<WhiteboardData, C51318a> {

        /* renamed from: a */
        public String f127799a;

        /* renamed from: b */
        public Integer f127800b;

        /* renamed from: c */
        public Boolean f127801c;

        /* renamed from: d */
        public ByteviewUser f127802d;

        /* renamed from: e */
        public String f127803e;

        /* renamed from: a */
        public WhiteboardData build() {
            Integer num;
            Boolean bool;
            String str = this.f127799a;
            if (str != null && (num = this.f127800b) != null && (bool = this.f127801c) != null) {
                return new WhiteboardData(str, num, bool, this.f127802d, this.f127803e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "whiteboard_id", this.f127800b, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f127801c, "visible");
        }
    }

    @Override // com.squareup.wire.Message
    public C51318a newBuilder() {
        C51318a aVar = new C51318a();
        aVar.f127799a = this.whiteboard_id;
        aVar.f127800b = this.version;
        aVar.f127801c = this.visible;
        aVar.f127802d = this.user;
        aVar.f127803e = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "WhiteboardData");
        StringBuilder sb = new StringBuilder();
        sb.append(", whiteboard_id=");
        sb.append(this.whiteboard_id);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", visible=");
        sb.append(this.visible);
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "WhiteboardData{");
        replace.append('}');
        return replace.toString();
    }

    public WhiteboardData(String str, Integer num, Boolean bool, ByteviewUser byteviewUser, String str2) {
        this(str, num, bool, byteviewUser, str2, ByteString.EMPTY);
    }

    public WhiteboardData(String str, Integer num, Boolean bool, ByteviewUser byteviewUser, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.whiteboard_id = str;
        this.version = num;
        this.visible = bool;
        this.user = byteviewUser;
        this.meeting_id = str2;
    }
}
