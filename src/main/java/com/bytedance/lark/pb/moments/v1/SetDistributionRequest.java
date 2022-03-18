package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.moments.v1.Post;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SetDistributionRequest extends Message<SetDistributionRequest, C18542a> {
    public static final ProtoAdapter<SetDistributionRequest> ADAPTER = new C18543b();
    public static final Post.PostDistributionType DEFAULT_DISTRIBUTION_TYPE = Post.PostDistributionType.NORMAL;
    public static final Post.InCategoryDistributionType DEFAULT_IN_CATEGORY_DISTRIBUTION_TYPE = Post.InCategoryDistributionType.IN_CATEGORY_NORMAL;
    private static final long serialVersionUID = 0;
    public final Post.PostDistributionType distribution_type;
    public final Post.InCategoryDistributionType in_category_distribution_type;
    public final String post_id;
    public final List<String> push_category_ids;

    /* renamed from: com.bytedance.lark.pb.moments.v1.SetDistributionRequest$b */
    private static final class C18543b extends ProtoAdapter<SetDistributionRequest> {
        C18543b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDistributionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDistributionRequest setDistributionRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (setDistributionRequest.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setDistributionRequest.post_id);
            } else {
                i = 0;
            }
            if (setDistributionRequest.distribution_type != null) {
                i2 = Post.PostDistributionType.ADAPTER.encodedSizeWithTag(2, setDistributionRequest.distribution_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (setDistributionRequest.in_category_distribution_type != null) {
                i3 = Post.InCategoryDistributionType.ADAPTER.encodedSizeWithTag(3, setDistributionRequest.in_category_distribution_type);
            }
            return i4 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, setDistributionRequest.push_category_ids) + setDistributionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetDistributionRequest decode(ProtoReader protoReader) throws IOException {
            C18542a aVar = new C18542a();
            aVar.f46027a = "";
            aVar.f46028b = Post.PostDistributionType.NORMAL;
            aVar.f46029c = Post.InCategoryDistributionType.IN_CATEGORY_NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46027a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46028b = Post.PostDistributionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f46029c = Post.InCategoryDistributionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46030d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetDistributionRequest setDistributionRequest) throws IOException {
            if (setDistributionRequest.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setDistributionRequest.post_id);
            }
            if (setDistributionRequest.distribution_type != null) {
                Post.PostDistributionType.ADAPTER.encodeWithTag(protoWriter, 2, setDistributionRequest.distribution_type);
            }
            if (setDistributionRequest.in_category_distribution_type != null) {
                Post.InCategoryDistributionType.ADAPTER.encodeWithTag(protoWriter, 3, setDistributionRequest.in_category_distribution_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, setDistributionRequest.push_category_ids);
            protoWriter.writeBytes(setDistributionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.SetDistributionRequest$a */
    public static final class C18542a extends Message.Builder<SetDistributionRequest, C18542a> {

        /* renamed from: a */
        public String f46027a;

        /* renamed from: b */
        public Post.PostDistributionType f46028b;

        /* renamed from: c */
        public Post.InCategoryDistributionType f46029c;

        /* renamed from: d */
        public List<String> f46030d = Internal.newMutableList();

        /* renamed from: a */
        public SetDistributionRequest build() {
            return new SetDistributionRequest(this.f46027a, this.f46028b, this.f46029c, this.f46030d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18542a mo63961a(Post.PostDistributionType postDistributionType) {
            this.f46028b = postDistributionType;
            return this;
        }

        /* renamed from: a */
        public C18542a mo63962a(String str) {
            this.f46027a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18542a newBuilder() {
        C18542a aVar = new C18542a();
        aVar.f46027a = this.post_id;
        aVar.f46028b = this.distribution_type;
        aVar.f46029c = this.in_category_distribution_type;
        aVar.f46030d = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "SetDistributionRequest");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.distribution_type != null) {
            sb.append(", distribution_type=");
            sb.append(this.distribution_type);
        }
        if (this.in_category_distribution_type != null) {
            sb.append(", in_category_distribution_type=");
            sb.append(this.in_category_distribution_type);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDistributionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetDistributionRequest(String str, Post.PostDistributionType postDistributionType, Post.InCategoryDistributionType inCategoryDistributionType, List<String> list) {
        this(str, postDistributionType, inCategoryDistributionType, list, ByteString.EMPTY);
    }

    public SetDistributionRequest(String str, Post.PostDistributionType postDistributionType, Post.InCategoryDistributionType inCategoryDistributionType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.distribution_type = postDistributionType;
        this.in_category_distribution_type = inCategoryDistributionType;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
    }
}
