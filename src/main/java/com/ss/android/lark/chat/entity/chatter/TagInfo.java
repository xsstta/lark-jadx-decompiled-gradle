package com.ss.android.lark.chat.entity.chatter;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "Ljava/io/Serializable;", "text", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chatter/TagType;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chatter/TagType;)V", "getText", "()Ljava/lang/String;", "getType", "()Lcom/ss/android/lark/chat/entity/chatter/TagType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "Factory", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TagInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final Lazy factory$delegate = LazyKt.lazy(C33981b.INSTANCE);
    private static final long serialVersionUID = -351515894162L;
    private final String text;
    private final TagType type;

    @JvmStatic
    public static final void apply(LarkNameTag.Builder bVar, TagInfo tagInfo) {
        Companion.mo124876a(bVar, tagInfo);
    }

    @JvmStatic
    public static final void apply(LarkNameTag.Builder bVar, List<TagInfo> list) {
        Companion.m131782a(Companion, bVar, list, null, 4, null);
    }

    @JvmStatic
    public static final void apply(LarkNameTag.Builder bVar, List<TagInfo> list, FilterRule bVar2) {
        Companion.mo124877a(bVar, list, bVar2);
    }

    @JvmStatic
    public static final void apply(LarkNameTag.Builder bVar, List<TagInfo> list, List<? extends FilterRule> list2) {
        Companion.mo124878a(bVar, list, list2);
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, TagType tagType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagInfo.text;
        }
        if ((i & 2) != 0) {
            tagType = tagInfo.type;
        }
        return tagInfo.copy(str, tagType);
    }

    public static final Factory getFactory() {
        return Companion.mo124874a();
    }

    @JvmStatic
    public static final TagInfo map(Chatter.ChatExtra.ChatChatterTagInfo.TagInfo tagInfo) {
        return Companion.mo124875a(tagInfo);
    }

    public final String component1() {
        return this.text;
    }

    public final TagType component2() {
        return this.type;
    }

    public final TagInfo copy(String str, TagType tagType) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(tagType, ShareHitPoint.f121869d);
        return new TagInfo(str, tagType);
    }

    public String toString() {
        return "TagInfo(text=" + this.text + ", type=" + this.type + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001bH\u0007R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/TagInfo$Companion;", "", "()V", "factory", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo$Factory;", "factory$annotations", "getFactory", "()Lcom/ss/android/lark/chat/entity/chatter/TagInfo$Factory;", "factory$delegate", "Lkotlin/Lazy;", "serialVersionUID", "", "apply", "", "builder", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "tagInfo", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "infos", "", "rules", "Lcom/ss/android/lark/chat/entity/chatter/FilterRule;", "getTagByType", "Lcom/ss/android/lark/chat/entity/chatter/TagType;", "sourceType", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatExtra$ChatChatterTagInfo$TagInfo$TagType;", "map", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatExtra$ChatChatterTagInfo$TagInfo;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.TagInfo$a */
    public static final class Companion {
        /* renamed from: a */
        public final Factory mo124874a() {
            Lazy lazy = TagInfo.factory$delegate;
            Companion aVar = TagInfo.Companion;
            return (Factory) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final TagType m131781a(Chatter.ChatExtra.ChatChatterTagInfo.TagInfo.TagType tagType) {
            int i = C33985d.f87779a[tagType.ordinal()];
            if (i == 1) {
                return TagType.CLASS_TEACHER;
            }
            if (i == 2) {
                return TagType.DISCIPLINE_TEACHER;
            }
            if (i != 3) {
                return TagType.UNKNOWN;
            }
            return TagType.ADMIN_USER;
        }

        @JvmStatic
        /* renamed from: a */
        public final TagInfo mo124875a(Chatter.ChatExtra.ChatChatterTagInfo.TagInfo tagInfo) {
            Intrinsics.checkParameterIsNotNull(tagInfo, "tagInfo");
            String str = tagInfo.description;
            Intrinsics.checkExpressionValueIsNotNull(str, "tagInfo.description");
            if (str != null) {
                String obj = StringsKt.trim((CharSequence) str).toString();
                Companion aVar = TagInfo.Companion;
                Chatter.ChatExtra.ChatChatterTagInfo.TagInfo.TagType tagType = tagInfo.tag_type;
                Intrinsics.checkExpressionValueIsNotNull(tagType, "tagInfo.tag_type");
                return new TagInfo(obj, aVar.m131781a(tagType));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo124876a(LarkNameTag.Builder bVar, TagInfo tagInfo) {
            Intrinsics.checkParameterIsNotNull(bVar, "builder");
            Intrinsics.checkParameterIsNotNull(tagInfo, "tagInfo");
            C33986e.m131805a(bVar, tagInfo);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo124877a(LarkNameTag.Builder bVar, List<TagInfo> list, FilterRule bVar2) {
            Intrinsics.checkParameterIsNotNull(bVar, "builder");
            Intrinsics.checkParameterIsNotNull(list, "infos");
            Intrinsics.checkParameterIsNotNull(bVar2, "rules");
            mo124878a(bVar, list, CollectionsKt.listOf(bVar2));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo124878a(LarkNameTag.Builder bVar, List<TagInfo> list, List<? extends FilterRule> list2) {
            Intrinsics.checkParameterIsNotNull(bVar, "builder");
            Intrinsics.checkParameterIsNotNull(list2, "rules");
            if (list != null) {
                Iterator<T> it = C33986e.m131804a(CollectionsKt.toList(list), list2).iterator();
                while (it.hasNext()) {
                    C33986e.m131805a(bVar, it.next());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.entity.chatter.TagInfo$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m131782a(Companion aVar, LarkNameTag.Builder bVar, List list, List list2, int i, Object obj) {
            if ((i & 4) != 0) {
                list2 = CollectionsKt.emptyList();
            }
            aVar.mo124878a(bVar, list, list2);
        }
    }

    public final String getText() {
        return this.text;
    }

    public final TagType getType() {
        return this.type;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo$Factory;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.TagInfo$b */
    static final class C33981b extends Lambda implements Function0<Factory> {
        public static final C33981b INSTANCE = new C33981b();

        C33981b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Factory invoke() {
            return new Factory();
        }
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.type.hashCode();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/TagInfo$Factory;", "", "()V", "classTag", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "context", "Landroid/content/Context;", "eduTag", "kaTag", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.TagInfo$c */
    public static final class Factory {
        /* renamed from: a */
        public final TagInfo mo124879a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            String string = context.getString(R.string.Lark_Education_SchoolParentGroupLabel);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…n_SchoolParentGroupLabel)");
            return new TagInfo(string, TagType.EDU);
        }

        /* renamed from: b */
        public final TagInfo mo124880b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            String string = context.getString(R.string.Lark_Education_ClassTag);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri….Lark_Education_ClassTag)");
            return new TagInfo(string, TagType.CLASS);
        }

        /* renamed from: c */
        public final TagInfo mo124881c(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            String string = context.getString(R.string.Lark_Group_ConnectGroupLabel);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…_Group_ConnectGroupLabel)");
            return new TagInfo(string, TagType.KA);
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof TagInfo)) {
            return super.equals(obj);
        }
        TagInfo tagInfo = (TagInfo) obj;
        boolean z3 = false;
        boolean areEqual = Intrinsics.areEqual(this.text, tagInfo.text) | false;
        if (this.type.getBgColor() == tagInfo.type.getBgColor()) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = areEqual | z;
        if (this.type.getOrder() == tagInfo.type.getOrder()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        if (this.type.getTextColor() == tagInfo.type.getTextColor()) {
            z3 = true;
        }
        return z5 | z3;
    }

    public TagInfo(String str, TagType tagType) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(tagType, ShareHitPoint.f121869d);
        this.text = str;
        this.type = tagType;
    }
}
