package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ActionTime extends Message<ActionTime, C50455a> {
    public static final ProtoAdapter<ActionTime> ADAPTER = new C50456b();
    public static final Long DEFAULT_ACCEPT = 0L;
    public static final Long DEFAULT_INVITE = 0L;
    public static final Long DEFAULT_PUSH = 0L;
    private static final long serialVersionUID = 0;
    public final Long accept;
    public final Long invite;
    public final Long push;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ActionTime$b */
    private static final class C50456b extends ProtoAdapter<ActionTime> {
        C50456b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionTime.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionTime actionTime) {
            int i;
            int i2;
            int i3 = 0;
            if (actionTime.invite != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, actionTime.invite);
            } else {
                i = 0;
            }
            if (actionTime.accept != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, actionTime.accept);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (actionTime.push != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, actionTime.push);
            }
            return i4 + i3 + actionTime.unknownFields().size();
        }

        /* renamed from: a */
        public ActionTime decode(ProtoReader protoReader) throws IOException {
            C50455a aVar = new C50455a();
            aVar.f125992a = 0L;
            aVar.f125993b = 0L;
            aVar.f125994c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125992a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125993b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125994c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionTime actionTime) throws IOException {
            if (actionTime.invite != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, actionTime.invite);
            }
            if (actionTime.accept != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, actionTime.accept);
            }
            if (actionTime.push != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, actionTime.push);
            }
            protoWriter.writeBytes(actionTime.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ActionTime$a */
    public static final class C50455a extends Message.Builder<ActionTime, C50455a> {

        /* renamed from: a */
        public Long f125992a;

        /* renamed from: b */
        public Long f125993b;

        /* renamed from: c */
        public Long f125994c;

        /* renamed from: a */
        public ActionTime build() {
            return new ActionTime(this.f125992a, this.f125993b, this.f125994c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50455a mo174807a(Long l) {
            this.f125992a = l;
            return this;
        }

        /* renamed from: b */
        public C50455a mo174809b(Long l) {
            this.f125993b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50455a newBuilder() {
        C50455a aVar = new C50455a();
        aVar.f125992a = this.invite;
        aVar.f125993b = this.accept;
        aVar.f125994c = this.push;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ActionTime");
        StringBuilder sb = new StringBuilder();
        if (this.invite != null) {
            sb.append(", invite=");
            sb.append(this.invite);
        }
        if (this.accept != null) {
            sb.append(", accept=");
            sb.append(this.accept);
        }
        if (this.push != null) {
            sb.append(", push=");
            sb.append(this.push);
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
        this.invite = l;
        this.accept = l2;
        this.push = l3;
    }
}
