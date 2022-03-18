package com.ss.android.lark.chat.entity.chatter;

import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006*\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0000¨\u0006\t"}, d2 = {"addTextTag", "", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "tagInfo", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "filterByRule", "", "rules", "Lcom/ss/android/lark/chat/entity/chatter/FilterRule;", "im_chat_chat-export_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.chatter.e */
public final class C33986e {
    /* renamed from: a */
    public static final List<TagInfo> m131804a(List<TagInfo> list, List<? extends FilterRule> list2) {
        Intrinsics.checkParameterIsNotNull(list, "$this$filterByRule");
        Intrinsics.checkParameterIsNotNull(list2, "rules");
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list = it.next().mo124899a(list);
        }
        return list;
    }

    @Deprecated(message = "扩展方法在Java中调用可读性很差...", replaceWith = @ReplaceWith(expression = "TagInfo::apply", imports = {}))
    /* renamed from: a */
    public static final void m131805a(LarkNameTag.Builder bVar, TagInfo tagInfo) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$addTextTag");
        Intrinsics.checkParameterIsNotNull(tagInfo, "tagInfo");
        TextTag.Companion bVar2 = TextTag.f62987a;
        TextTag.Builder aVar = new TextTag.Builder();
        aVar.mo90139b(tagInfo.getType().getOrder());
        aVar.mo90136a(tagInfo.getText());
        aVar.mo90145d(tagInfo.getType().getTextColor());
        aVar.mo90147e(tagInfo.getType().getBgColor());
        LarkNameTag.Builder bVar3 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) bVar, aVar.mo90154l(), false, 2, (Object) null);
    }
}
