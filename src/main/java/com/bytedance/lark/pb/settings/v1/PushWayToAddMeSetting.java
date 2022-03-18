package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushWayToAddMeSetting extends Message<PushWayToAddMeSetting, C19195a> {
    public static final ProtoAdapter<PushWayToAddMeSetting> ADAPTER = new C19196b();
    private static final long serialVersionUID = 0;
    public final WayToAddMeSetting add_me_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushWayToAddMeSetting$b */
    private static final class C19196b extends ProtoAdapter<PushWayToAddMeSetting> {
        C19196b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushWayToAddMeSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushWayToAddMeSetting pushWayToAddMeSetting) {
            int i;
            if (pushWayToAddMeSetting.add_me_setting != null) {
                i = WayToAddMeSetting.ADAPTER.encodedSizeWithTag(1, pushWayToAddMeSetting.add_me_setting);
            } else {
                i = 0;
            }
            return i + pushWayToAddMeSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushWayToAddMeSetting decode(ProtoReader protoReader) throws IOException {
            C19195a aVar = new C19195a();
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
                    aVar.f47362a = WayToAddMeSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushWayToAddMeSetting pushWayToAddMeSetting) throws IOException {
            if (pushWayToAddMeSetting.add_me_setting != null) {
                WayToAddMeSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushWayToAddMeSetting.add_me_setting);
            }
            protoWriter.writeBytes(pushWayToAddMeSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushWayToAddMeSetting$a */
    public static final class C19195a extends Message.Builder<PushWayToAddMeSetting, C19195a> {

        /* renamed from: a */
        public WayToAddMeSetting f47362a;

        /* renamed from: a */
        public PushWayToAddMeSetting build() {
            return new PushWayToAddMeSetting(this.f47362a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19195a newBuilder() {
        C19195a aVar = new C19195a();
        aVar.f47362a = this.add_me_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PushWayToAddMeSetting");
        StringBuilder sb = new StringBuilder();
        if (this.add_me_setting != null) {
            sb.append(", add_me_setting=");
            sb.append(this.add_me_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PushWayToAddMeSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushWayToAddMeSetting(WayToAddMeSetting wayToAddMeSetting) {
        this(wayToAddMeSetting, ByteString.EMPTY);
    }

    public PushWayToAddMeSetting(WayToAddMeSetting wayToAddMeSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.add_me_setting = wayToAddMeSetting;
    }
}
