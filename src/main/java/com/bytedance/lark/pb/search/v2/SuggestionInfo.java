package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.common.JumpTabInfo;
import com.bytedance.lark.pb.search.sidecard.ServiceCard;
import com.bytedance.lark.pb.search.sidecard.SideCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SuggestionInfo extends Message<SuggestionInfo, C19041a> {
    public static final ProtoAdapter<SuggestionInfo> ADAPTER = new C19042b();
    private static final long serialVersionUID = 0;
    public final JumpTabInfo jump_tab_info;
    public final ResourceTag resource_tag;
    public final List<ServiceCard> service_cards;
    public final SideCard side_card;

    public static final class ResourceTag extends Message<ResourceTag, C19039a> {
        public static final ProtoAdapter<ResourceTag> ADAPTER = new C19040b();
        private static final long serialVersionUID = 0;
        public final List<String> tags;

        /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionInfo$ResourceTag$b */
        private static final class C19040b extends ProtoAdapter<ResourceTag> {
            C19040b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResourceTag.class);
            }

            /* renamed from: a */
            public int encodedSize(ResourceTag resourceTag) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, resourceTag.tags) + resourceTag.unknownFields().size();
            }

            /* renamed from: a */
            public ResourceTag decode(ProtoReader protoReader) throws IOException {
                C19039a aVar = new C19039a();
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
                        aVar.f47105a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResourceTag resourceTag) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, resourceTag.tags);
                protoWriter.writeBytes(resourceTag.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionInfo$ResourceTag$a */
        public static final class C19039a extends Message.Builder<ResourceTag, C19039a> {

            /* renamed from: a */
            public List<String> f47105a = Internal.newMutableList();

            /* renamed from: a */
            public ResourceTag build() {
                return new ResourceTag(this.f47105a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19039a newBuilder() {
            C19039a aVar = new C19039a();
            aVar.f47105a = Internal.copyOf("tags", this.tags);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ResourceTag");
            StringBuilder sb = new StringBuilder();
            if (!this.tags.isEmpty()) {
                sb.append(", tags=");
                sb.append(this.tags);
            }
            StringBuilder replace = sb.replace(0, 2, "ResourceTag{");
            replace.append('}');
            return replace.toString();
        }

        public ResourceTag(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public ResourceTag(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.tags = Internal.immutableCopyOf("tags", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionInfo$b */
    private static final class C19042b extends ProtoAdapter<SuggestionInfo> {
        C19042b() {
            super(FieldEncoding.LENGTH_DELIMITED, SuggestionInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SuggestionInfo suggestionInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (suggestionInfo.side_card != null) {
                i = SideCard.ADAPTER.encodedSizeWithTag(1, suggestionInfo.side_card);
            } else {
                i = 0;
            }
            if (suggestionInfo.resource_tag != null) {
                i2 = ResourceTag.ADAPTER.encodedSizeWithTag(2, suggestionInfo.resource_tag);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (suggestionInfo.jump_tab_info != null) {
                i3 = JumpTabInfo.ADAPTER.encodedSizeWithTag(3, suggestionInfo.jump_tab_info);
            }
            return i4 + i3 + ServiceCard.ADAPTER.asRepeated().encodedSizeWithTag(4, suggestionInfo.service_cards) + suggestionInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SuggestionInfo decode(ProtoReader protoReader) throws IOException {
            C19041a aVar = new C19041a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47106a = SideCard.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47107b = ResourceTag.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47108c = JumpTabInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47109d.add(ServiceCard.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SuggestionInfo suggestionInfo) throws IOException {
            if (suggestionInfo.side_card != null) {
                SideCard.ADAPTER.encodeWithTag(protoWriter, 1, suggestionInfo.side_card);
            }
            if (suggestionInfo.resource_tag != null) {
                ResourceTag.ADAPTER.encodeWithTag(protoWriter, 2, suggestionInfo.resource_tag);
            }
            if (suggestionInfo.jump_tab_info != null) {
                JumpTabInfo.ADAPTER.encodeWithTag(protoWriter, 3, suggestionInfo.jump_tab_info);
            }
            ServiceCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, suggestionInfo.service_cards);
            protoWriter.writeBytes(suggestionInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionInfo$a */
    public static final class C19041a extends Message.Builder<SuggestionInfo, C19041a> {

        /* renamed from: a */
        public SideCard f47106a;

        /* renamed from: b */
        public ResourceTag f47107b;

        /* renamed from: c */
        public JumpTabInfo f47108c;

        /* renamed from: d */
        public List<ServiceCard> f47109d = Internal.newMutableList();

        /* renamed from: a */
        public SuggestionInfo build() {
            return new SuggestionInfo(this.f47106a, this.f47107b, this.f47108c, this.f47109d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19041a newBuilder() {
        C19041a aVar = new C19041a();
        aVar.f47106a = this.side_card;
        aVar.f47107b = this.resource_tag;
        aVar.f47108c = this.jump_tab_info;
        aVar.f47109d = Internal.copyOf("service_cards", this.service_cards);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SuggestionInfo");
        StringBuilder sb = new StringBuilder();
        if (this.side_card != null) {
            sb.append(", side_card=");
            sb.append(this.side_card);
        }
        if (this.resource_tag != null) {
            sb.append(", resource_tag=");
            sb.append(this.resource_tag);
        }
        if (this.jump_tab_info != null) {
            sb.append(", jump_tab_info=");
            sb.append(this.jump_tab_info);
        }
        if (!this.service_cards.isEmpty()) {
            sb.append(", service_cards=");
            sb.append(this.service_cards);
        }
        StringBuilder replace = sb.replace(0, 2, "SuggestionInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SuggestionInfo(SideCard sideCard, ResourceTag resourceTag, JumpTabInfo jumpTabInfo, List<ServiceCard> list) {
        this(sideCard, resourceTag, jumpTabInfo, list, ByteString.EMPTY);
    }

    public SuggestionInfo(SideCard sideCard, ResourceTag resourceTag, JumpTabInfo jumpTabInfo, List<ServiceCard> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.side_card = sideCard;
        this.resource_tag = resourceTag;
        this.jump_tab_info = jumpTabInfo;
        this.service_cards = Internal.immutableCopyOf("service_cards", list);
    }
}
