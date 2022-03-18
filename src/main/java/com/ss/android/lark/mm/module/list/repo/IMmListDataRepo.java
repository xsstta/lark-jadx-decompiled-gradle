package com.ss.android.lark.mm.module.list.repo;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016JB\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J@\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u000eH&JN\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u000eH&JH\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J8\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J6\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u0016J6\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u0016JS\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u0016J0\u0010$\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH\u0016J\u0012\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006("}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/IMmListDataRepo;", "", "clear", "", "deleteItem", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "token", "", "isPermanentlyDelete", "", "onSucceed", "Lkotlin/Function0;", "onFailed", "Lkotlin/Function1;", "getHomeListData", "timestamp", "ownerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "getMyListData", "rank", "", "isAsc", "Lkotlin/Function2;", "getSharedListData", "getTrashListData", "removeFromHomeSpace", "objectTokens", "removeFromSharedSpace", "rename", "newName", "Lkotlin/ParameterName;", "name", "errorMsg", "restore", "updateHomeListFirstPageData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateMyListFirstPageData", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.repo.a */
public interface IMmListDataRepo {
    /* renamed from: a */
    void mo163240a();

    /* renamed from: a */
    void mo163241a(MmListControl.DataSource dataSource, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1);

    /* renamed from: a */
    void mo163242a(MmListControl.DataSource dataSource, String str, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1);

    /* renamed from: a */
    void mo163243a(MinutesListResponse minutesListResponse);

    /* renamed from: a */
    void mo163244a(String str, int i, boolean z, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12);

    /* renamed from: a */
    void mo163245a(String str, int i, boolean z, Function2<? super MinutesListResponse, ? super Boolean, Unit> kVar, Function1<? super C47068a, Unit> function1);

    /* renamed from: a */
    void mo163246a(String str, MmOwnerType mmOwnerType, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12);

    /* renamed from: a */
    void mo163247a(String str, Function0<Unit> function0, Function0<Unit> function02);

    /* renamed from: a */
    void mo163248a(String str, Function0<Unit> function0, Function1<? super String, Unit> function1);

    /* renamed from: a */
    void mo163249a(String str, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12);

    /* renamed from: b */
    void mo163250b(MinutesListResponse minutesListResponse);

    /* renamed from: b */
    void mo163251b(String str, Function0<Unit> function0, Function1<? super String, Unit> function1);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.a$a */
    public static final class C46422a {
        /* renamed from: a */
        public static void m183685a(IMmListDataRepo aVar) {
        }

        /* renamed from: a */
        public static void m183686a(IMmListDataRepo aVar, MmListControl.DataSource dataSource, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(dataSource, "ds");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "newName");
            Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        }

        /* renamed from: a */
        public static void m183687a(IMmListDataRepo aVar, MmListControl.DataSource dataSource, String str, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(dataSource, "ds");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
            Intrinsics.checkParameterIsNotNull(function1, "onFailed");
        }

        /* renamed from: a */
        public static void m183688a(IMmListDataRepo aVar, MinutesListResponse minutesListResponse) {
        }

        /* renamed from: a */
        public static void m183689a(IMmListDataRepo aVar, String str, int i, boolean z, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(str, "timestamp");
            Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
            Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        }

        /* renamed from: a */
        public static void m183690a(IMmListDataRepo aVar, String str, Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        }

        /* renamed from: a */
        public static void m183692a(IMmListDataRepo aVar, String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(str, "objectTokens");
            Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        }

        /* renamed from: a */
        public static void m183693a(IMmListDataRepo aVar, String str, Function1<? super MinutesListResponse, Unit> function1, Function1<? super C47068a, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(str, "timestamp");
            Intrinsics.checkParameterIsNotNull(function1, "onSucceed");
            Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        }

        /* renamed from: b */
        public static void m183694b(IMmListDataRepo aVar, MinutesListResponse minutesListResponse) {
        }

        /* renamed from: b */
        public static void m183695b(IMmListDataRepo aVar, String str, Function0<Unit> function0, Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(str, "objectTokens");
            Intrinsics.checkParameterIsNotNull(function0, "onSucceed");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.list.repo.a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m183691a(IMmListDataRepo aVar, String str, Function0 function0, Function0 function02, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    function02 = null;
                }
                aVar.mo163247a(str, function0, function02);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restore");
        }
    }
}
