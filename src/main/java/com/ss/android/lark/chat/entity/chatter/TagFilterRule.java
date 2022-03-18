package com.ss.android.lark.chat.entity.chatter;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/TagFilterRule;", "", "()V", "chatAdminRule", "Lcom/ss/android/lark/chat/entity/chatter/FilterRule;", "chatAdminRule$annotations", "getChatAdminRule", "()Lcom/ss/android/lark/chat/entity/chatter/FilterRule;", "eduRule", "eduRule$annotations", "getEduRule", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.chatter.c */
public final class TagFilterRule {

    /* renamed from: a */
    public static final TagFilterRule f87776a = new TagFilterRule();

    /* renamed from: b */
    private static final FilterRule f87777b = new C33984b();

    /* renamed from: c */
    private static final FilterRule f87778c = new C33983a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/entity/chatter/TagFilterRule$chatAdminRule$1", "Lcom/ss/android/lark/chat/entity/chatter/FilterRule;", "intercept", "", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "lst", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.c$a */
    public static final class C33983a implements FilterRule {
        C33983a() {
        }

        @Override // com.ss.android.lark.chat.entity.chatter.FilterRule
        /* renamed from: a */
        public List<TagInfo> mo124899a(List<TagInfo> list) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(list, "lst");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.getType() == TagType.ADMIN_USER) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/entity/chatter/TagFilterRule$eduRule$1", "Lcom/ss/android/lark/chat/entity/chatter/FilterRule;", "intercept", "", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "lst", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.c$b */
    public static final class C33984b implements FilterRule {
        C33984b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        @Override // com.ss.android.lark.chat.entity.chatter.FilterRule
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.ss.android.lark.chat.entity.chatter.TagInfo> mo124899a(java.util.List<com.ss.android.lark.chat.entity.chatter.TagInfo> r7) {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.entity.chatter.TagFilterRule.C33984b.mo124899a(java.util.List):java.util.List");
        }
    }

    private TagFilterRule() {
    }

    /* renamed from: a */
    public static final FilterRule m131800a() {
        return f87777b;
    }

    /* renamed from: b */
    public static final FilterRule m131801b() {
        return f87778c;
    }
}
