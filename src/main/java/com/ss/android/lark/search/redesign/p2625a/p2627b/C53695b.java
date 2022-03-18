package com.ss.android.lark.search.redesign.p2625a.p2627b;

import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.Scene;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.b.b */
public final /* synthetic */ class C53695b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f132526a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f132527b;

    static {
        int[] iArr = new int[Scene.Type.values().length];
        f132526a = iArr;
        iArr[Scene.Type.SEARCH_GLOBAL.ordinal()] = 1;
        iArr[Scene.Type.SEARCH_HELP_DESK.ordinal()] = 2;
        iArr[Scene.Type.SEARCH_CHATTERS.ordinal()] = 3;
        iArr[Scene.Type.SEARCH_OPEN_APP_SCENE.ordinal()] = 4;
        iArr[Scene.Type.SEARCH_CHATS.ordinal()] = 5;
        iArr[Scene.Type.SEARCH_MESSAGES.ordinal()] = 6;
        iArr[Scene.Type.SEARCH_OPEN_SEARCH_SCENE.ordinal()] = 7;
        int[] iArr2 = new int[DocType.values().length];
        f132527b = iArr2;
        iArr2[DocType.DOC.ordinal()] = 1;
        iArr2[DocType.SHEET.ordinal()] = 2;
        iArr2[DocType.BITABLE.ordinal()] = 3;
        iArr2[DocType.MINDNOTE.ordinal()] = 4;
        iArr2[DocType.FILE.ordinal()] = 5;
        iArr2[DocType.SLIDE.ordinal()] = 6;
    }
}
