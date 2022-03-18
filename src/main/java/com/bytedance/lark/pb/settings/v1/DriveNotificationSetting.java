package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DriveNotificationSetting extends Message<DriveNotificationSetting, C19131a> {
    public static final ProtoAdapter<DriveNotificationSetting> ADAPTER = new C19132b();
    public static final Boolean DEFAULT_NOTIFY_OPEN = false;
    private static final long serialVersionUID = 0;
    public final Boolean notify_open;

    /* renamed from: com.bytedance.lark.pb.settings.v1.DriveNotificationSetting$b */
    private static final class C19132b extends ProtoAdapter<DriveNotificationSetting> {
        C19132b() {
            super(FieldEncoding.LENGTH_DELIMITED, DriveNotificationSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(DriveNotificationSetting driveNotificationSetting) {
            int i;
            if (driveNotificationSetting.notify_open != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, driveNotificationSetting.notify_open);
            } else {
                i = 0;
            }
            return i + driveNotificationSetting.unknownFields().size();
        }

        /* renamed from: a */
        public DriveNotificationSetting decode(ProtoReader protoReader) throws IOException {
            C19131a aVar = new C19131a();
            aVar.f47272a = false;
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
                    aVar.f47272a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DriveNotificationSetting driveNotificationSetting) throws IOException {
            if (driveNotificationSetting.notify_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, driveNotificationSetting.notify_open);
            }
            protoWriter.writeBytes(driveNotificationSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.DriveNotificationSetting$a */
    public static final class C19131a extends Message.Builder<DriveNotificationSetting, C19131a> {

        /* renamed from: a */
        public Boolean f47272a;

        /* renamed from: a */
        public DriveNotificationSetting build() {
            return new DriveNotificationSetting(this.f47272a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19131a newBuilder() {
        C19131a aVar = new C19131a();
        aVar.f47272a = this.notify_open;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "DriveNotificationSetting");
        StringBuilder sb = new StringBuilder();
        if (this.notify_open != null) {
            sb.append(", notify_open=");
            sb.append(this.notify_open);
        }
        StringBuilder replace = sb.replace(0, 2, "DriveNotificationSetting{");
        replace.append('}');
        return replace.toString();
    }

    public DriveNotificationSetting(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public DriveNotificationSetting(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notify_open = bool;
    }
}
