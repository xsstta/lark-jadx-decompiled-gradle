package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiTips;", "", "()V", "DefaultError", "", "errTips", "", "", "loadingTips", "okTips", "errKey", "action", "errCode", "errTip", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", "err", "", "loadingTip", "okTip", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.h */
public final class WikiTips {

    /* renamed from: a */
    public static final WikiTips f33454a;

    /* renamed from: b */
    private static final Map<String, Integer> f33455b;

    /* renamed from: c */
    private static final Map<String, Integer> f33456c;

    /* renamed from: d */
    private static final Map<String, Integer> f33457d;

    private WikiTips() {
    }

    static {
        WikiTips hVar = new WikiTips();
        f33454a = hVar;
        HashMap hashMap = new HashMap();
        f33455b = hashMap;
        HashMap hashMap2 = new HashMap();
        f33456c = hashMap2;
        HashMap hashMap3 = new HashMap();
        f33457d = hashMap3;
        hashMap.put(WikiAction.ADD.name(), Integer.valueOf((int) R.string.Doc_Wiki_CreateDialog));
        hashMap.put(WikiAction.DEL.name(), Integer.valueOf((int) R.string.Doc_Wiki_RemoveDialog));
        hashMap.put(WikiAction.MOV.name(), Integer.valueOf((int) R.string.Doc_Wiki_MovePageMoving));
        String name = WikiAction.SHORTCUT.name();
        Integer valueOf = Integer.valueOf((int) R.string.CreationMobile_Wiki_CreateCopy_Creating_Toast);
        hashMap.put(name, valueOf);
        hashMap.put(WikiAction.MAKE_COPY.name(), valueOf);
        hashMap2.put(WikiAction.DEL.name(), Integer.valueOf((int) R.string.CreationMobile_Wiki_RemoveSuccessfully_Toast));
        hashMap2.put(WikiAction.MOV.name(), Integer.valueOf((int) R.string.Doc_Wiki_MoveSuccess));
        hashMap2.put(WikiAction.FAVORITE.name(), Integer.valueOf((int) R.string.CreationMobile_Wiki_Favorites_AddedFavorites_Toast));
        hashMap2.put(WikiAction.UNFAVORITE.name(), Integer.valueOf((int) R.string.CreationMobile_Wiki_Favorites_CanceledFavorites_Toast));
        hashMap2.put(WikiAction.SHORTCUT.name(), Integer.valueOf((int) R.string.CreationMobile_Wiki_Shortcuts_CreateSuccessfully_Toast));
        hashMap2.put(WikiAction.MAKE_COPY.name(), Integer.valueOf((int) R.string.CreationMobile_Wiki_CreateCopy_CreateSuccessfully_Toast));
        hashMap3.put(hVar.m51920a(WikiAction.EXPAND.name(), 920004002), Integer.valueOf((int) R.string.Doc_Wiki_ExpandFailPageRemoved));
        hashMap3.put(hVar.m51920a(WikiAction.EXPAND.name(), 920004004), Integer.valueOf((int) R.string.Doc_Wiki_ExpandFailNoPermission));
        hashMap3.put(hVar.m51920a(WikiAction.ADD.name(), 920004002), Integer.valueOf((int) R.string.Doc_Wiki_CreateFailFatherRemoved));
        hashMap3.put(hVar.m51920a(WikiAction.ADD.name(), 920004004), Integer.valueOf((int) R.string.CreationMobile_Wiki_Permission_NoPermissionToCreate_Toast));
        hashMap3.put(hVar.m51920a(WikiAction.ADD.name(), 920004011), Integer.valueOf((int) R.string.Doc_Wiki_CreateFailMaximumLimited));
        hashMap3.put(hVar.m51920a(WikiAction.DEL.name(), 920004002), Integer.valueOf((int) R.string.Doc_Wiki_RemoveFailRepeat));
        String a = hVar.m51920a(WikiAction.DEL.name(), 920004004);
        Integer valueOf2 = Integer.valueOf((int) R.string.CreationMobile_Wiki_NoPermissionToDelete_Toast);
        hashMap3.put(a, valueOf2);
        hashMap3.put(hVar.m51920a(WikiAction.DEL.name(), 233525001), valueOf2);
        hashMap3.put(hVar.m51920a(WikiAction.DEL.name(), 233525002), Integer.valueOf((int) R.string.CreationMobile_Wiki_CannotDeleteSubpages_Toast));
        hashMap3.put(hVar.m51920a(WikiAction.MOV.name(), 920004001), Integer.valueOf((int) R.string.Doc_Wiki_MoveFailTargetRemoved));
        hashMap3.put(hVar.m51920a(WikiAction.MOV.name(), 920004002), Integer.valueOf((int) R.string.Doc_Wiki_MoveFailCurrentRemoved));
        hashMap3.put(hVar.m51920a(WikiAction.MOV.name(), 920004004), Integer.valueOf((int) R.string.CreationMobile_Wiki_Permission_NoPermissionToMove_Toast));
        hashMap3.put(hVar.m51920a(WikiAction.FAVORITE.name(), 100000002), Integer.valueOf((int) R.string.Doc_Wiki_StarFail));
        hashMap3.put(hVar.m51920a(WikiAction.UNFAVORITE.name(), 100000002), Integer.valueOf((int) R.string.Doc_Wiki_UnstarFail));
        hashMap3.put(hVar.m51920a(WikiAction.SHORTCUT.name(), 100000002), Integer.valueOf((int) R.string.CreationMobile_Wiki_Shortcuts_UnableToCreate_Toast));
        hashMap3.put(hVar.m51920a(WikiAction.MAKE_COPY.name(), 100000002), Integer.valueOf((int) R.string.CreationMobile_Wiki_CreateCopy_UnableToCreate_Toast));
    }

    /* renamed from: b */
    public final int mo47516b(WikiAction wikiAction) {
        Intrinsics.checkParameterIsNotNull(wikiAction, "action");
        Integer num = f33456c.get(wikiAction.name());
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo47514a(WikiAction wikiAction) {
        Intrinsics.checkParameterIsNotNull(wikiAction, "action");
        Integer num = f33455b.get(wikiAction.name());
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    private final String m51920a(String str, int i) {
        return str + '-' + i;
    }

    /* renamed from: a */
    public final int mo47515a(WikiAction wikiAction, Throwable th) {
        int i;
        Intrinsics.checkParameterIsNotNull(wikiAction, "action");
        if (C12477f.m51913a(th)) {
            i = 920004004;
        } else {
            i = C12477f.m51915b(th);
        }
        Integer num = null;
        if (i != -1) {
            Map<String, Integer> map = f33457d;
            Integer num2 = map.get(m51920a(wikiAction.name(), i));
            if (num2 == null) {
                num = map.get(m51920a(wikiAction.name(), 100000002));
            } else {
                num = num2;
            }
        }
        if (num == null) {
            ConnectionService d = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
            ConnectionService.NetworkState b = d.mo20038b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
            if (!b.mo20041b()) {
                num = Integer.valueOf((int) R.string.Doc_Wiki_Network_Error);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return R.string.Doc_Wiki_Tree_LoadError;
    }
}
