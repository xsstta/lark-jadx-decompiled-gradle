package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserASSetting extends Message<UserASSetting, C49531a> {
    public static final ProtoAdapter<UserASSetting> ADAPTER = new C49532b();
    private static final long serialVersionUID = 0;
    public final FeatureSetting mnautilus_setting;

    /* renamed from: com.ss.android.lark.pb.ai.UserASSetting$b */
    private static final class C49532b extends ProtoAdapter<UserASSetting> {
        C49532b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserASSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(UserASSetting userASSetting) {
            int i;
            if (userASSetting.mnautilus_setting != null) {
                i = FeatureSetting.ADAPTER.encodedSizeWithTag(1, userASSetting.mnautilus_setting);
            } else {
                i = 0;
            }
            return i + userASSetting.unknownFields().size();
        }

        /* renamed from: a */
        public UserASSetting decode(ProtoReader protoReader) throws IOException {
            C49531a aVar = new C49531a();
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
                    aVar.f124128a = FeatureSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserASSetting userASSetting) throws IOException {
            if (userASSetting.mnautilus_setting != null) {
                FeatureSetting.ADAPTER.encodeWithTag(protoWriter, 1, userASSetting.mnautilus_setting);
            }
            protoWriter.writeBytes(userASSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.UserASSetting$a */
    public static final class C49531a extends Message.Builder<UserASSetting, C49531a> {

        /* renamed from: a */
        public FeatureSetting f124128a;

        /* renamed from: a */
        public UserASSetting build() {
            return new UserASSetting(this.f124128a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49531a mo172744a(FeatureSetting featureSetting) {
            this.f124128a = featureSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49531a newBuilder() {
        C49531a aVar = new C49531a();
        aVar.f124128a = this.mnautilus_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mnautilus_setting != null) {
            sb.append(", nautilus_setting=");
            sb.append(this.mnautilus_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "UserASSetting{");
        replace.append('}');
        return replace.toString();
    }

    public UserASSetting(FeatureSetting featureSetting) {
        this(featureSetting, ByteString.EMPTY);
    }

    public UserASSetting(FeatureSetting featureSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mnautilus_setting = featureSetting;
    }
}
