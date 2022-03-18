package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserGuideInfo extends Message<UserGuideInfo, C18624a> {
    public static final ProtoAdapter<UserGuideInfo> ADAPTER = new C18625b();
    public static final Long DEFAULT_PRIORITY = 0L;
    private static final long serialVersionUID = 0;
    public final String key;
    public final Long priority;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.UserGuideInfo$b */
    private static final class C18625b extends ProtoAdapter<UserGuideInfo> {
        C18625b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserGuideInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserGuideInfo userGuideInfo) {
            int i;
            int i2 = 0;
            if (userGuideInfo.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userGuideInfo.key);
            } else {
                i = 0;
            }
            if (userGuideInfo.priority != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userGuideInfo.priority);
            }
            return i + i2 + userGuideInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserGuideInfo decode(ProtoReader protoReader) throws IOException {
            C18624a aVar = new C18624a();
            aVar.f46133a = "";
            aVar.f46134b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46133a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46134b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserGuideInfo userGuideInfo) throws IOException {
            if (userGuideInfo.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userGuideInfo.key);
            }
            if (userGuideInfo.priority != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, userGuideInfo.priority);
            }
            protoWriter.writeBytes(userGuideInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.UserGuideInfo$a */
    public static final class C18624a extends Message.Builder<UserGuideInfo, C18624a> {

        /* renamed from: a */
        public String f46133a;

        /* renamed from: b */
        public Long f46134b;

        /* renamed from: a */
        public UserGuideInfo build() {
            return new UserGuideInfo(this.f46133a, this.f46134b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18624a newBuilder() {
        C18624a aVar = new C18624a();
        aVar.f46133a = this.key;
        aVar.f46134b = this.priority;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "UserGuideInfo");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        StringBuilder replace = sb.replace(0, 2, "UserGuideInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserGuideInfo(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public UserGuideInfo(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.priority = l;
    }
}
