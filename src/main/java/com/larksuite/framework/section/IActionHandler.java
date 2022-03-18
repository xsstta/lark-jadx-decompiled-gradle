package com.larksuite.framework.section;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/larksuite/framework/section/IActionHandler;", "", "handleAction", "", "action", "", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "", "handleViewAction", "viewId", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.d */
public interface IActionHandler {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.d$a */
    public static final class C25883a {
        /* renamed from: a */
        public static void m93676a(IActionHandler dVar, int i) {
        }

        /* renamed from: a */
        public static void m93677a(IActionHandler dVar, int i, int i2) {
        }

        /* renamed from: a */
        public static void m93678a(IActionHandler dVar, int i, IActionData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        }

        /* renamed from: a */
        public static void m93679a(IActionHandler dVar, int i, Object obj) {
        }

        /* renamed from: a */
        public static void m93680a(IActionHandler dVar, int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "actionData");
        }

        /* renamed from: a */
        public static void m93681a(IActionHandler dVar, int i, boolean z) {
        }

        /* renamed from: b */
        public static void m93682b(IActionHandler dVar, int i, int i2) {
        }
    }
}
