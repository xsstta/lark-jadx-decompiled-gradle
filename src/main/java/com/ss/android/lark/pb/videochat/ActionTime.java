package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ActionTime extends Message<ActionTime, C50268a> {
    public static final ProtoAdapter<ActionTime> ADAPTER = new C50269b();
    public static final Long DEFAULT_ACCEPT = 0L;
    public static final Long DEFAULT_INVITE = 0L;
    public static final Long DEFAULT_PUSH = 0L;
    private static final long serialVersionUID = 0;
    public final Long maccept;
    public final Long minvite;
    public final Long mpush;

    /* renamed from: com.ss.android.lark.pb.videochat.ActionTime$b */
    private static final class C50269b extends ProtoAdapter<ActionTime> {
        C50269b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionTime.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionTime actionTime) {
            int i;
            int i2;
            int i3 = 0;
            if (actionTime.minvite != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, actionTime.minvite);
            } else {
                i = 0;
            }
            if (actionTime.maccept != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, actionTime.maccept);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (actionTime.mpush != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, actionTime.mpush);
            }
            return i4 + i3 + actionTime.unknownFields().size();
        }

        /* renamed from: a */
        public ActionTime decode(ProtoReader protoReader) throws IOException {
            C50268a aVar = new C50268a();
            aVar.f125617a = 0L;
            aVar.f125618b = 0L;
            aVar.f125619c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125617a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125618b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125619c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionTime actionTime) throws IOException {
            if (actionTime.minvite != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, actionTime.minvite);
            }
            if (actionTime.maccept != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, actionTime.maccept);
            }
            if (actionTime.mpush != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, actionTime.mpush);
            }
            protoWriter.writeBytes(actionTime.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.ActionTime$a */
    public static final class C50268a extends Message.Builder<ActionTime, C50268a> {

        /* renamed from: a */
        public Long f125617a;

        /* renamed from: b */
        public Long f125618b;

        /* renamed from: c */
        public Long f125619c;

        /* renamed from: a */
        public ActionTime build() {
            return new ActionTime(this.f125617a, this.f125618b, this.f125619c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50268a newBuilder() {
        C50268a aVar = new C50268a();
        aVar.f125617a = this.minvite;
        aVar.f125618b = this.maccept;
        aVar.f125619c = this.mpush;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.minvite != null) {
            sb.append(", invite=");
            sb.append(this.minvite);
        }
        if (this.maccept != null) {
            sb.append(", accept=");
            sb.append(this.maccept);
        }
        if (this.mpush != null) {
            sb.append(", push=");
            sb.append(this.mpush);
        }
        StringBuilder replace = sb.replace(0, 2, "ActionTime{");
        replace.append('}');
        return replace.toString();
    }

    public ActionTime(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public ActionTime(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.minvite = l;
        this.maccept = l2;
        this.mpush = l3;
    }
}
