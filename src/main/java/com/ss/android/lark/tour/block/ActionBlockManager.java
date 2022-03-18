package com.ss.android.lark.tour.block;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager;", "", "()V", "ActionType", "Companion", "PolicyType", "PolicyType2ActionTypeList", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ActionBlockManager {

    /* renamed from: a */
    public static final HashMap<Integer, Integer> f141150a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<Integer, Long> f141151b = new HashMap<>();

    /* renamed from: c */
    public static final Companion f141152c = new Companion(null);

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager$ActionType;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface ActionType {
        public static final Companion Companion = Companion.f141153a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager$ActionType$Companion;", "", "()V", "ALERT_DIALOG", "", "TIPS", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tour.block.ActionBlockManager$ActionType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f141153a = new Companion();

            private Companion() {
            }
        }
    }

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager$PolicyType;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface PolicyType {
        public static final Companion Companion = Companion.f141154a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager$PolicyType$Companion;", "", "()V", "ALERT_DIALOG", "", "ON_BOARDING_TOUR", "TIPS", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tour.block.ActionBlockManager$PolicyType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f141154a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u001c\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0014\u0010\u0012\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager$Companion;", "", "()V", "actionTypeBlocks", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "policyTypeRecords", "", "blockByActionType", "", "actionType", "blockByPolicyType", "policyType", "inquireAndRun", "callback", "Lkotlin/Function0;", "inquireAndRunForAlertDialog", "inquireAndRunForTips", "unblockByActionType", "unblockByPolicyType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tour.block.ActionBlockManager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo194392a(Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "callback");
            mo194391a(1, function0);
        }

        /* renamed from: c */
        private final synchronized void m221996c(int i) {
            Integer num = ActionBlockManager.f141150a.get(Integer.valueOf(i));
            if (num != null) {
                num.intValue();
                ActionBlockManager.f141150a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            } else {
                ActionBlockManager.f141150a.put(Integer.valueOf(i), 1);
            }
        }

        /* renamed from: d */
        private final synchronized void m221997d(int i) {
            Integer num = ActionBlockManager.f141150a.get(Integer.valueOf(i));
            if (num != null) {
                int intValue = num.intValue() - 1;
                if (intValue == 0) {
                    ActionBlockManager.f141150a.remove(Integer.valueOf(i));
                } else {
                    ActionBlockManager.f141150a.put(Integer.valueOf(i), Integer.valueOf(intValue));
                }
            }
        }

        /* renamed from: a */
        public final synchronized void mo194390a(int i) {
            if (!ActionBlockManager.f141151b.containsKey(Integer.valueOf(i))) {
                List<Integer> list = PolicyType2ActionTypeList.f141155a.mo194394a().get(Integer.valueOf(i));
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ActionBlockManager.f141152c.m221996c(it.next().intValue());
                    }
                    ActionBlockManager.f141151b.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
                }
            }
        }

        /* renamed from: b */
        public final synchronized void mo194393b(int i) {
            if (ActionBlockManager.f141151b.containsKey(Integer.valueOf(i))) {
                List<Integer> list = PolicyType2ActionTypeList.f141155a.mo194394a().get(Integer.valueOf(i));
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ActionBlockManager.f141152c.m221997d(it.next().intValue());
                    }
                    ActionBlockManager.f141151b.remove(Integer.valueOf(i));
                }
            }
        }

        /* renamed from: a */
        public final void mo194391a(int i, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "callback");
            Integer num = ActionBlockManager.f141150a.get(Integer.valueOf(i));
            if (num == null) {
                function0.invoke();
            } else if (num != null && num.intValue() == 0) {
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/tour/block/ActionBlockManager$PolicyType2ActionTypeList;", "", "()V", "map", "", "", "", "getMap", "()Ljava/util/Map;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tour.block.ActionBlockManager$b */
    public static final class PolicyType2ActionTypeList {

        /* renamed from: a */
        public static final PolicyType2ActionTypeList f141155a = new PolicyType2ActionTypeList();

        /* renamed from: b */
        private static final Map<Integer, List<Integer>> f141156b = MapsKt.mapOf(new Pair(1, CollectionsKt.arrayListOf(1)), new Pair(2, CollectionsKt.arrayListOf(2)), new Pair(3, CollectionsKt.arrayListOf(1, 2)));

        private PolicyType2ActionTypeList() {
        }

        /* renamed from: a */
        public final Map<Integer, List<Integer>> mo194394a() {
            return f141156b;
        }
    }
}
