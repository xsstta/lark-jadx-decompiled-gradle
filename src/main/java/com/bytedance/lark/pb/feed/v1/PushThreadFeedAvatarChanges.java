package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PushThreadFeedAvatarChanges extends Message<PushThreadFeedAvatarChanges, C17220a> {
    public static final ProtoAdapter<PushThreadFeedAvatarChanges> ADAPTER = new C17221b();
    private static final long serialVersionUID = 0;
    public final Map<String, Avatar> avatars;

    public static final class Avatar extends Message<Avatar, C17218a> {
        public static final ProtoAdapter<Avatar> ADAPTER = new C17219b();
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final String avatar_path;
        public final List<String> avatar_urls;
        public final String mini_avatar_key;

        /* renamed from: com.bytedance.lark.pb.feed.v1.PushThreadFeedAvatarChanges$Avatar$b */
        private static final class C17219b extends ProtoAdapter<Avatar> {
            C17219b() {
                super(FieldEncoding.LENGTH_DELIMITED, Avatar.class);
            }

            /* renamed from: a */
            public int encodedSize(Avatar avatar) {
                int i;
                int i2;
                int i3 = 0;
                if (avatar.avatar_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, avatar.avatar_key);
                } else {
                    i = 0;
                }
                if (avatar.avatar_path != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, avatar.avatar_path);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, avatar.avatar_urls);
                if (avatar.mini_avatar_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, avatar.mini_avatar_key);
                }
                return encodedSizeWithTag + i3 + avatar.unknownFields().size();
            }

            /* renamed from: a */
            public Avatar decode(ProtoReader protoReader) throws IOException {
                C17218a aVar = new C17218a();
                aVar.f44023a = "";
                aVar.f44024b = "";
                aVar.f44026d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44023a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f44024b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f44025c.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f44026d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Avatar avatar) throws IOException {
                if (avatar.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, avatar.avatar_key);
                }
                if (avatar.avatar_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, avatar.avatar_path);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, avatar.avatar_urls);
                if (avatar.mini_avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, avatar.mini_avatar_key);
                }
                protoWriter.writeBytes(avatar.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.PushThreadFeedAvatarChanges$Avatar$a */
        public static final class C17218a extends Message.Builder<Avatar, C17218a> {

            /* renamed from: a */
            public String f44023a;

            /* renamed from: b */
            public String f44024b;

            /* renamed from: c */
            public List<String> f44025c = Internal.newMutableList();

            /* renamed from: d */
            public String f44026d;

            /* renamed from: a */
            public Avatar build() {
                return new Avatar(this.f44023a, this.f44024b, this.f44025c, this.f44026d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17218a newBuilder() {
            C17218a aVar = new C17218a();
            aVar.f44023a = this.avatar_key;
            aVar.f44024b = this.avatar_path;
            aVar.f44025c = Internal.copyOf("avatar_urls", this.avatar_urls);
            aVar.f44026d = this.mini_avatar_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "Avatar");
            StringBuilder sb = new StringBuilder();
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.avatar_path != null) {
                sb.append(", avatar_path=");
                sb.append(this.avatar_path);
            }
            if (!this.avatar_urls.isEmpty()) {
                sb.append(", avatar_urls=");
                sb.append(this.avatar_urls);
            }
            if (this.mini_avatar_key != null) {
                sb.append(", mini_avatar_key=");
                sb.append(this.mini_avatar_key);
            }
            StringBuilder replace = sb.replace(0, 2, "Avatar{");
            replace.append('}');
            return replace.toString();
        }

        public Avatar(String str, String str2, List<String> list, String str3) {
            this(str, str2, list, str3, ByteString.EMPTY);
        }

        public Avatar(String str, String str2, List<String> list, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.avatar_key = str;
            this.avatar_path = str2;
            this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
            this.mini_avatar_key = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushThreadFeedAvatarChanges$a */
    public static final class C17220a extends Message.Builder<PushThreadFeedAvatarChanges, C17220a> {

        /* renamed from: a */
        public Map<String, Avatar> f44027a = Internal.newMutableMap();

        /* renamed from: a */
        public PushThreadFeedAvatarChanges build() {
            return new PushThreadFeedAvatarChanges(this.f44027a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushThreadFeedAvatarChanges$b */
    private static final class C17221b extends ProtoAdapter<PushThreadFeedAvatarChanges> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Avatar>> f44028a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Avatar.ADAPTER);

        C17221b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushThreadFeedAvatarChanges.class);
        }

        /* renamed from: a */
        public int encodedSize(PushThreadFeedAvatarChanges pushThreadFeedAvatarChanges) {
            return this.f44028a.encodedSizeWithTag(1, pushThreadFeedAvatarChanges.avatars) + pushThreadFeedAvatarChanges.unknownFields().size();
        }

        /* renamed from: a */
        public PushThreadFeedAvatarChanges decode(ProtoReader protoReader) throws IOException {
            C17220a aVar = new C17220a();
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
                    aVar.f44027a.putAll(this.f44028a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushThreadFeedAvatarChanges pushThreadFeedAvatarChanges) throws IOException {
            this.f44028a.encodeWithTag(protoWriter, 1, pushThreadFeedAvatarChanges.avatars);
            protoWriter.writeBytes(pushThreadFeedAvatarChanges.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17220a newBuilder() {
        C17220a aVar = new C17220a();
        aVar.f44027a = Internal.copyOf("avatars", this.avatars);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushThreadFeedAvatarChanges");
        StringBuilder sb = new StringBuilder();
        if (!this.avatars.isEmpty()) {
            sb.append(", avatars=");
            sb.append(this.avatars);
        }
        StringBuilder replace = sb.replace(0, 2, "PushThreadFeedAvatarChanges{");
        replace.append('}');
        return replace.toString();
    }

    public PushThreadFeedAvatarChanges(Map<String, Avatar> map) {
        this(map, ByteString.EMPTY);
    }

    public PushThreadFeedAvatarChanges(Map<String, Avatar> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatars = Internal.immutableCopyOf("avatars", map);
    }
}
