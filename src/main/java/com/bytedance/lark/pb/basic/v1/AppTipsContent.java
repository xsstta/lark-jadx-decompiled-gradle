package com.bytedance.lark.pb.basic.v1;

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

public final class AppTipsContent extends Message<AppTipsContent, C14692a> {
    public static final ProtoAdapter<AppTipsContent> ADAPTER = new C14693b();
    private static final long serialVersionUID = 0;
    public final List<ActionInfo> actions;
    public final String i18n_msg;
    public final String i18n_title;

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppTipsContent$b */
    private static final class C14693b extends ProtoAdapter<AppTipsContent> {
        C14693b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppTipsContent.class);
        }

        /* renamed from: a */
        public int encodedSize(AppTipsContent appTipsContent) {
            int i;
            int i2 = 0;
            if (appTipsContent.i18n_title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, appTipsContent.i18n_title);
            } else {
                i = 0;
            }
            if (appTipsContent.i18n_msg != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, appTipsContent.i18n_msg);
            }
            return i + i2 + ActionInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, appTipsContent.actions) + appTipsContent.unknownFields().size();
        }

        /* renamed from: a */
        public AppTipsContent decode(ProtoReader protoReader) throws IOException {
            C14692a aVar = new C14692a();
            aVar.f38852a = "";
            aVar.f38853b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38852a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38853b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38854c.add(ActionInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AppTipsContent appTipsContent) throws IOException {
            if (appTipsContent.i18n_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appTipsContent.i18n_title);
            }
            if (appTipsContent.i18n_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appTipsContent.i18n_msg);
            }
            ActionInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, appTipsContent.actions);
            protoWriter.writeBytes(appTipsContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppTipsContent$a */
    public static final class C14692a extends Message.Builder<AppTipsContent, C14692a> {

        /* renamed from: a */
        public String f38852a;

        /* renamed from: b */
        public String f38853b;

        /* renamed from: c */
        public List<ActionInfo> f38854c = Internal.newMutableList();

        /* renamed from: a */
        public AppTipsContent build() {
            return new AppTipsContent(this.f38852a, this.f38853b, this.f38854c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14692a newBuilder() {
        C14692a aVar = new C14692a();
        aVar.f38852a = this.i18n_title;
        aVar.f38853b = this.i18n_msg;
        aVar.f38854c = Internal.copyOf("actions", this.actions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AppTipsContent");
        StringBuilder sb = new StringBuilder();
        if (this.i18n_title != null) {
            sb.append(", i18n_title=");
            sb.append(this.i18n_title);
        }
        if (this.i18n_msg != null) {
            sb.append(", i18n_msg=");
            sb.append(this.i18n_msg);
        }
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        StringBuilder replace = sb.replace(0, 2, "AppTipsContent{");
        replace.append('}');
        return replace.toString();
    }

    public AppTipsContent(String str, String str2, List<ActionInfo> list) {
        this(str, str2, list, ByteString.EMPTY);
    }

    public AppTipsContent(String str, String str2, List<ActionInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_title = str;
        this.i18n_msg = str2;
        this.actions = Internal.immutableCopyOf("actions", list);
    }
}
