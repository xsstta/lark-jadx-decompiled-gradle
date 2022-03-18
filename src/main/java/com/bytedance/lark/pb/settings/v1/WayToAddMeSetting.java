package com.bytedance.lark.pb.settings.v1;

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

public final class WayToAddMeSetting extends Message<WayToAddMeSetting, C19229a> {
    public static final ProtoAdapter<WayToAddMeSetting> ADAPTER = new C19230b();
    public static final Boolean DEFAULT_CHAT_SETTING = true;
    public static final Boolean DEFAULT_CONTACT_TOKEN_SETTING = true;
    private static final long serialVersionUID = 0;
    public final Boolean chat_setting;
    public final Boolean contact_token_setting;
    public final List<WayToAddMeSettingItem> way_to_add_items;

    /* renamed from: com.bytedance.lark.pb.settings.v1.WayToAddMeSetting$b */
    private static final class C19230b extends ProtoAdapter<WayToAddMeSetting> {
        C19230b() {
            super(FieldEncoding.LENGTH_DELIMITED, WayToAddMeSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(WayToAddMeSetting wayToAddMeSetting) {
            int i;
            int i2 = 0;
            if (wayToAddMeSetting.chat_setting != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, wayToAddMeSetting.chat_setting);
            } else {
                i = 0;
            }
            if (wayToAddMeSetting.contact_token_setting != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, wayToAddMeSetting.contact_token_setting);
            }
            return i + i2 + WayToAddMeSettingItem.ADAPTER.asRepeated().encodedSizeWithTag(3, wayToAddMeSetting.way_to_add_items) + wayToAddMeSetting.unknownFields().size();
        }

        /* renamed from: a */
        public WayToAddMeSetting decode(ProtoReader protoReader) throws IOException {
            C19229a aVar = new C19229a();
            aVar.f47398a = true;
            aVar.f47399b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47398a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47399b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47400c.add(WayToAddMeSettingItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WayToAddMeSetting wayToAddMeSetting) throws IOException {
            if (wayToAddMeSetting.chat_setting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, wayToAddMeSetting.chat_setting);
            }
            if (wayToAddMeSetting.contact_token_setting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, wayToAddMeSetting.contact_token_setting);
            }
            WayToAddMeSettingItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, wayToAddMeSetting.way_to_add_items);
            protoWriter.writeBytes(wayToAddMeSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.WayToAddMeSetting$a */
    public static final class C19229a extends Message.Builder<WayToAddMeSetting, C19229a> {

        /* renamed from: a */
        public Boolean f47398a;

        /* renamed from: b */
        public Boolean f47399b;

        /* renamed from: c */
        public List<WayToAddMeSettingItem> f47400c = Internal.newMutableList();

        /* renamed from: a */
        public WayToAddMeSetting build() {
            return new WayToAddMeSetting(this.f47398a, this.f47399b, this.f47400c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19229a newBuilder() {
        C19229a aVar = new C19229a();
        aVar.f47398a = this.chat_setting;
        aVar.f47399b = this.contact_token_setting;
        aVar.f47400c = Internal.copyOf("way_to_add_items", this.way_to_add_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "WayToAddMeSetting");
        StringBuilder sb = new StringBuilder();
        if (this.chat_setting != null) {
            sb.append(", chat_setting=");
            sb.append(this.chat_setting);
        }
        if (this.contact_token_setting != null) {
            sb.append(", contact_token_setting=");
            sb.append(this.contact_token_setting);
        }
        if (!this.way_to_add_items.isEmpty()) {
            sb.append(", way_to_add_items=");
            sb.append(this.way_to_add_items);
        }
        StringBuilder replace = sb.replace(0, 2, "WayToAddMeSetting{");
        replace.append('}');
        return replace.toString();
    }

    public WayToAddMeSetting(Boolean bool, Boolean bool2, List<WayToAddMeSettingItem> list) {
        this(bool, bool2, list, ByteString.EMPTY);
    }

    public WayToAddMeSetting(Boolean bool, Boolean bool2, List<WayToAddMeSettingItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_setting = bool;
        this.contact_token_setting = bool2;
        this.way_to_add_items = Internal.immutableCopyOf("way_to_add_items", list);
    }
}
