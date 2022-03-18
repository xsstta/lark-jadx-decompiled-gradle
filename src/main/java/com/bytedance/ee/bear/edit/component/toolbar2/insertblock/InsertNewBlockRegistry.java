package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockRegistry;", "", "()V", "items", "", "", "Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockData;", "getItem", "key", "", "edit-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.c */
public final class InsertNewBlockRegistry {

    /* renamed from: a */
    private final Map<CharSequence, InsertNewBlockData> f20734a;

    public InsertNewBlockRegistry() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f20734a = linkedHashMap;
        linkedHashMap.put(InsertNewBlockData.h1.getKey(), InsertNewBlockData.h1);
        linkedHashMap.put(InsertNewBlockData.h2.getKey(), InsertNewBlockData.h2);
        linkedHashMap.put(InsertNewBlockData.h3.getKey(), InsertNewBlockData.h3);
        linkedHashMap.put(InsertNewBlockData.h4.getKey(), InsertNewBlockData.h4);
        linkedHashMap.put(InsertNewBlockData.h5.getKey(), InsertNewBlockData.h5);
        linkedHashMap.put(InsertNewBlockData.h6.getKey(), InsertNewBlockData.h6);
        linkedHashMap.put(InsertNewBlockData.h7.getKey(), InsertNewBlockData.h7);
        linkedHashMap.put(InsertNewBlockData.h8.getKey(), InsertNewBlockData.h8);
        linkedHashMap.put(InsertNewBlockData.h9.getKey(), InsertNewBlockData.h9);
        linkedHashMap.put(InsertNewBlockData.orderedList.getKey(), InsertNewBlockData.orderedList);
        linkedHashMap.put(InsertNewBlockData.unorderedList.getKey(), InsertNewBlockData.unorderedList);
        linkedHashMap.put(InsertNewBlockData.checkbox.getKey(), InsertNewBlockData.checkbox);
        linkedHashMap.put(InsertNewBlockData.codeList.getKey(), InsertNewBlockData.codeList);
        linkedHashMap.put(InsertNewBlockData.blockQuote.getKey(), InsertNewBlockData.blockQuote);
        linkedHashMap.put(InsertNewBlockData.insertImage.getKey(), InsertNewBlockData.insertImage);
        linkedHashMap.put(InsertNewBlockData.insertTable.getKey(), InsertNewBlockData.insertTable);
        linkedHashMap.put(InsertNewBlockData.insertFile.getKey(), InsertNewBlockData.insertFile);
        linkedHashMap.put(InsertNewBlockData.insertSeparator.getKey(), InsertNewBlockData.insertSeparator);
        linkedHashMap.put(InsertNewBlockData.mentionUser.getKey(), InsertNewBlockData.mentionUser);
        linkedHashMap.put(InsertNewBlockData.mentionChat.getKey(), InsertNewBlockData.mentionChat);
        linkedHashMap.put(InsertNewBlockData.mentionFile.getKey(), InsertNewBlockData.mentionFile);
        linkedHashMap.put(InsertNewBlockData.equation.getKey(), InsertNewBlockData.equation);
        linkedHashMap.put(InsertNewBlockData.calloutBlock.getKey(), InsertNewBlockData.calloutBlock);
        linkedHashMap.put(InsertNewBlockData.insertCalendar.getKey(), InsertNewBlockData.insertCalendar);
        linkedHashMap.put(InsertNewBlockData.insertReminder.getKey(), InsertNewBlockData.insertReminder);
    }

    /* renamed from: a */
    public final InsertNewBlockData mo30027a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<CharSequence, InsertNewBlockData> map = this.f20734a;
        if (str == null) {
            Intrinsics.throwNpe();
        }
        return map.get(str);
    }
}
