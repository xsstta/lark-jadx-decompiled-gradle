package com.bytedance.lark.pb.search.common;

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

public final class JumpTabInfo extends Message<JumpTabInfo, C18741a> {
    public static final ProtoAdapter<JumpTabInfo> ADAPTER = new C18742b();
    private static final long serialVersionUID = 0;
    public final List<JumpTab> jump_tabs;
    public final String title_highlighted;

    public static final class JumpTab extends Message<JumpTab, C18739a> {
        public static final ProtoAdapter<JumpTab> ADAPTER = new C18740b();
        public static final SearchTabName DEFAULT_SEARCH_TAB = SearchTabName.UNKNOWN_TAB;
        private static final long serialVersionUID = 0;
        public final String formatted_text;
        public final SearchTabName search_tab;

        /* renamed from: com.bytedance.lark.pb.search.common.JumpTabInfo$JumpTab$b */
        private static final class C18740b extends ProtoAdapter<JumpTab> {
            C18740b() {
                super(FieldEncoding.LENGTH_DELIMITED, JumpTab.class);
            }

            /* renamed from: a */
            public int encodedSize(JumpTab jumpTab) {
                int i;
                int i2 = 0;
                if (jumpTab.formatted_text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, jumpTab.formatted_text);
                } else {
                    i = 0;
                }
                if (jumpTab.search_tab != null) {
                    i2 = SearchTabName.ADAPTER.encodedSizeWithTag(2, jumpTab.search_tab);
                }
                return i + i2 + jumpTab.unknownFields().size();
            }

            /* renamed from: a */
            public JumpTab decode(ProtoReader protoReader) throws IOException {
                C18739a aVar = new C18739a();
                aVar.f46283a = "";
                aVar.f46284b = SearchTabName.UNKNOWN_TAB;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46283a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f46284b = SearchTabName.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, JumpTab jumpTab) throws IOException {
                if (jumpTab.formatted_text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, jumpTab.formatted_text);
                }
                if (jumpTab.search_tab != null) {
                    SearchTabName.ADAPTER.encodeWithTag(protoWriter, 2, jumpTab.search_tab);
                }
                protoWriter.writeBytes(jumpTab.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.common.JumpTabInfo$JumpTab$a */
        public static final class C18739a extends Message.Builder<JumpTab, C18739a> {

            /* renamed from: a */
            public String f46283a;

            /* renamed from: b */
            public SearchTabName f46284b;

            /* renamed from: a */
            public JumpTab build() {
                return new JumpTab(this.f46283a, this.f46284b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18739a newBuilder() {
            C18739a aVar = new C18739a();
            aVar.f46283a = this.formatted_text;
            aVar.f46284b = this.search_tab;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "JumpTab");
            StringBuilder sb = new StringBuilder();
            if (this.formatted_text != null) {
                sb.append(", formatted_text=");
                sb.append(this.formatted_text);
            }
            if (this.search_tab != null) {
                sb.append(", search_tab=");
                sb.append(this.search_tab);
            }
            StringBuilder replace = sb.replace(0, 2, "JumpTab{");
            replace.append('}');
            return replace.toString();
        }

        public JumpTab(String str, SearchTabName searchTabName) {
            this(str, searchTabName, ByteString.EMPTY);
        }

        public JumpTab(String str, SearchTabName searchTabName, ByteString byteString) {
            super(ADAPTER, byteString);
            this.formatted_text = str;
            this.search_tab = searchTabName;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.common.JumpTabInfo$b */
    private static final class C18742b extends ProtoAdapter<JumpTabInfo> {
        C18742b() {
            super(FieldEncoding.LENGTH_DELIMITED, JumpTabInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(JumpTabInfo jumpTabInfo) {
            int i;
            if (jumpTabInfo.title_highlighted != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, jumpTabInfo.title_highlighted);
            } else {
                i = 0;
            }
            return i + JumpTab.ADAPTER.asRepeated().encodedSizeWithTag(2, jumpTabInfo.jump_tabs) + jumpTabInfo.unknownFields().size();
        }

        /* renamed from: a */
        public JumpTabInfo decode(ProtoReader protoReader) throws IOException {
            C18741a aVar = new C18741a();
            aVar.f46285a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46285a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46286b.add(JumpTab.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JumpTabInfo jumpTabInfo) throws IOException {
            if (jumpTabInfo.title_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, jumpTabInfo.title_highlighted);
            }
            JumpTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, jumpTabInfo.jump_tabs);
            protoWriter.writeBytes(jumpTabInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.common.JumpTabInfo$a */
    public static final class C18741a extends Message.Builder<JumpTabInfo, C18741a> {

        /* renamed from: a */
        public String f46285a;

        /* renamed from: b */
        public List<JumpTab> f46286b = Internal.newMutableList();

        /* renamed from: a */
        public JumpTabInfo build() {
            return new JumpTabInfo(this.f46285a, this.f46286b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18741a newBuilder() {
        C18741a aVar = new C18741a();
        aVar.f46285a = this.title_highlighted;
        aVar.f46286b = Internal.copyOf("jump_tabs", this.jump_tabs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "JumpTabInfo");
        StringBuilder sb = new StringBuilder();
        if (this.title_highlighted != null) {
            sb.append(", title_highlighted=");
            sb.append(this.title_highlighted);
        }
        if (!this.jump_tabs.isEmpty()) {
            sb.append(", jump_tabs=");
            sb.append(this.jump_tabs);
        }
        StringBuilder replace = sb.replace(0, 2, "JumpTabInfo{");
        replace.append('}');
        return replace.toString();
    }

    public JumpTabInfo(String str, List<JumpTab> list) {
        this(str, list, ByteString.EMPTY);
    }

    public JumpTabInfo(String str, List<JumpTab> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title_highlighted = str;
        this.jump_tabs = Internal.immutableCopyOf("jump_tabs", list);
    }
}
