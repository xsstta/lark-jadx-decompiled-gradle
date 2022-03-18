package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetWayToAddMeSettingRequest extends Message<SetWayToAddMeSettingRequest, C19213a> {
    public static final ProtoAdapter<SetWayToAddMeSettingRequest> ADAPTER = new C19214b();
    private static final long serialVersionUID = 0;
    public final WayToAddMeSettingItem add_me_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetWayToAddMeSettingRequest$b */
    private static final class C19214b extends ProtoAdapter<SetWayToAddMeSettingRequest> {
        C19214b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetWayToAddMeSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetWayToAddMeSettingRequest setWayToAddMeSettingRequest) {
            int i;
            if (setWayToAddMeSettingRequest.add_me_setting != null) {
                i = WayToAddMeSettingItem.ADAPTER.encodedSizeWithTag(1, setWayToAddMeSettingRequest.add_me_setting);
            } else {
                i = 0;
            }
            return i + setWayToAddMeSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetWayToAddMeSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19213a aVar = new C19213a();
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
                    aVar.f47384a = WayToAddMeSettingItem.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetWayToAddMeSettingRequest setWayToAddMeSettingRequest) throws IOException {
            if (setWayToAddMeSettingRequest.add_me_setting != null) {
                WayToAddMeSettingItem.ADAPTER.encodeWithTag(protoWriter, 1, setWayToAddMeSettingRequest.add_me_setting);
            }
            protoWriter.writeBytes(setWayToAddMeSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetWayToAddMeSettingRequest$a */
    public static final class C19213a extends Message.Builder<SetWayToAddMeSettingRequest, C19213a> {

        /* renamed from: a */
        public WayToAddMeSettingItem f47384a;

        /* renamed from: a */
        public SetWayToAddMeSettingRequest build() {
            return new SetWayToAddMeSettingRequest(this.f47384a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19213a mo65603a(WayToAddMeSettingItem wayToAddMeSettingItem) {
            this.f47384a = wayToAddMeSettingItem;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19213a newBuilder() {
        C19213a aVar = new C19213a();
        aVar.f47384a = this.add_me_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetWayToAddMeSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.add_me_setting != null) {
            sb.append(", add_me_setting=");
            sb.append(this.add_me_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "SetWayToAddMeSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetWayToAddMeSettingRequest(WayToAddMeSettingItem wayToAddMeSettingItem) {
        this(wayToAddMeSettingItem, ByteString.EMPTY);
    }

    public SetWayToAddMeSettingRequest(WayToAddMeSettingItem wayToAddMeSettingItem, ByteString byteString) {
        super(ADAPTER, byteString);
        this.add_me_setting = wayToAddMeSettingItem;
    }
}
