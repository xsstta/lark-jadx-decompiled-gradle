package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserProfile extends Message<UserProfile, C18564a> {
    public static final ProtoAdapter<UserProfile> ADAPTER = new C18565b();
    public static final Integer DEFAULT_FOLLOWER_COUNT = 0;
    public static final Integer DEFAULT_FOLLOWING_COUNT = 0;
    public static final Integer DEFAULT_POSTS_COUNT = 0;
    public static final Integer DEFAULT_REACTIONS_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final ImageSet background_image;
    public final Integer follower_count;
    public final Integer following_count;
    public final Integer posts_count;
    public final Integer reactions_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserProfile$b */
    private static final class C18565b extends ProtoAdapter<UserProfile> {
        C18565b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserProfile.class);
        }

        /* renamed from: a */
        public int encodedSize(UserProfile userProfile) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (userProfile.follower_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, userProfile.follower_count);
            } else {
                i = 0;
            }
            if (userProfile.following_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, userProfile.following_count);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (userProfile.posts_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, userProfile.posts_count);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (userProfile.background_image != null) {
                i4 = ImageSet.ADAPTER.encodedSizeWithTag(4, userProfile.background_image);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (userProfile.reactions_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, userProfile.reactions_count);
            }
            return i8 + i5 + userProfile.unknownFields().size();
        }

        /* renamed from: a */
        public UserProfile decode(ProtoReader protoReader) throws IOException {
            C18564a aVar = new C18564a();
            aVar.f46059a = 0;
            aVar.f46060b = 0;
            aVar.f46061c = 0;
            aVar.f46063e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46059a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46060b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46061c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46062d = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46063e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserProfile userProfile) throws IOException {
            if (userProfile.follower_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, userProfile.follower_count);
            }
            if (userProfile.following_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, userProfile.following_count);
            }
            if (userProfile.posts_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, userProfile.posts_count);
            }
            if (userProfile.background_image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, userProfile.background_image);
            }
            if (userProfile.reactions_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, userProfile.reactions_count);
            }
            protoWriter.writeBytes(userProfile.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserProfile$a */
    public static final class C18564a extends Message.Builder<UserProfile, C18564a> {

        /* renamed from: a */
        public Integer f46059a;

        /* renamed from: b */
        public Integer f46060b;

        /* renamed from: c */
        public Integer f46061c;

        /* renamed from: d */
        public ImageSet f46062d;

        /* renamed from: e */
        public Integer f46063e;

        /* renamed from: a */
        public UserProfile build() {
            return new UserProfile(this.f46059a, this.f46060b, this.f46061c, this.f46062d, this.f46063e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18564a mo64017a(Integer num) {
            this.f46061c = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18564a newBuilder() {
        C18564a aVar = new C18564a();
        aVar.f46059a = this.follower_count;
        aVar.f46060b = this.following_count;
        aVar.f46061c = this.posts_count;
        aVar.f46062d = this.background_image;
        aVar.f46063e = this.reactions_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UserProfile");
        StringBuilder sb = new StringBuilder();
        if (this.follower_count != null) {
            sb.append(", follower_count=");
            sb.append(this.follower_count);
        }
        if (this.following_count != null) {
            sb.append(", following_count=");
            sb.append(this.following_count);
        }
        if (this.posts_count != null) {
            sb.append(", posts_count=");
            sb.append(this.posts_count);
        }
        if (this.background_image != null) {
            sb.append(", background_image=");
            sb.append(this.background_image);
        }
        if (this.reactions_count != null) {
            sb.append(", reactions_count=");
            sb.append(this.reactions_count);
        }
        StringBuilder replace = sb.replace(0, 2, "UserProfile{");
        replace.append('}');
        return replace.toString();
    }

    public UserProfile(Integer num, Integer num2, Integer num3, ImageSet imageSet, Integer num4) {
        this(num, num2, num3, imageSet, num4, ByteString.EMPTY);
    }

    public UserProfile(Integer num, Integer num2, Integer num3, ImageSet imageSet, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.follower_count = num;
        this.following_count = num2;
        this.posts_count = num3;
        this.background_image = imageSet;
        this.reactions_count = num4;
    }
}
