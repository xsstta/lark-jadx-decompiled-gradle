package com.ss.android.lark.todo.wrapper.impl.tabspec.title;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/tabspec/title/TodoTitleInfo;", "Lcom/ss/android/lark/maincore/ITitleInfo;", "()V", "mFuncBtnList", "", "Lcom/ss/android/lark/maincore/IFunctionButton;", "mIconStyle", "Lcom/ss/android/lark/maincore/ITitleInfo$IconStyle;", "mName", "", "mStatus", "Lcom/ss/android/lark/maincore/ITitleInfo$Status;", "getClickListener", "Lcom/ss/android/lark/maincore/ITitleInfo$ClickListener;", "getFunctionButtonList", "", "getIconStyle", "getName", "getSelectedItem", "Lcom/ss/android/lark/maincore/ITitleInfo$SelectedItem;", "getStatus", "isShow", "", "setFunctionButtonList", "", "funcBtnList", "setName", "name", "setStatus", UpdateKey.STATUS, "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.c.a.b */
public final class TodoTitleInfo implements ITitleInfo {

    /* renamed from: a */
    private String f139237a = "";

    /* renamed from: b */
    private ITitleInfo.Status f139238b = ITitleInfo.Status.Normal;

    /* renamed from: c */
    private List<AbstractC44545b> f139239c = new ArrayList();

    /* renamed from: d */
    private ITitleInfo.IconStyle f139240d = ITitleInfo.IconStyle.Hide;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.c.a.b$a */
    static final class C56252a implements ITitleInfo.AbstractC44542a {

        /* renamed from: a */
        public static final C56252a f139241a = new C56252a();

        C56252a() {
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo.AbstractC44542a
        /* renamed from: a */
        public final void mo99210a() {
        }
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return true;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        return this.f139237a;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return this.f139240d;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return this.f139238b;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return C56252a.f139241a;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return CollectionsKt.toList(this.f139239c);
    }

    /* renamed from: a */
    public final void mo191725a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f139237a = str;
    }

    /* renamed from: a */
    public final void mo191726a(List<? extends AbstractC44545b> list) {
        Intrinsics.checkParameterIsNotNull(list, "funcBtnList");
        this.f139239c.clear();
        this.f139239c.addAll(list);
    }
}
