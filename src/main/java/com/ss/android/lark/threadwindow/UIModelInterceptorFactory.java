package com.ss.android.lark.threadwindow;

import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.threadwindow.view.ThreadWindowUIModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/threadwindow/UIModelInterceptorFactory;", "", "model", "Lcom/ss/android/lark/threadwindow/ThreadWindowModel;", "(Lcom/ss/android/lark/threadwindow/ThreadWindowModel;)V", "getModel", "()Lcom/ss/android/lark/threadwindow/ThreadWindowModel;", "uiModels", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel;", "Lkotlin/collections/HashMap;", "getUiModels", "()Ljava/util/HashMap;", "createInterceptor", "Lcom/ss/android/lark/chat/core/model/DataListPipeline$ListChangeInterceptor;", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "tabType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.o */
public final class UIModelInterceptorFactory {

    /* renamed from: a */
    private final HashMap<Integer, ThreadWindowUIModel> f138882a = new HashMap<>();

    /* renamed from: b */
    private final C56101i f138883b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/threadwindow/UIModelInterceptorFactory$createInterceptor$uiModel$1", "Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel$ItemModeChangeListener;", "onUIItemModelChange", "", ShareHitPoint.f121869d, "", "threadId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadwindow.o$a */
    public static final class C56147a implements ThreadWindowUIModel.ItemModeChangeListener {

        /* renamed from: a */
        final /* synthetic */ UIModelInterceptorFactory f138884a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"com/ss/android/lark/threadwindow/UIModelInterceptorFactory$createInterceptor$uiModel$1$onUIItemModelChange$1", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "doUpdateIfExist", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.threadwindow.o$a$a */
        public static final class C56148a extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
                return aVar;
            }

            C56148a() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56147a(UIModelInterceptorFactory oVar) {
            this.f138884a = oVar;
        }

        @Override // com.ss.android.lark.threadwindow.view.ThreadWindowUIModel.ItemModeChangeListener
        /* renamed from: a */
        public void mo191461a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            this.f138884a.mo191460b().mo190803a(str, new C56148a(), i);
        }
    }

    /* renamed from: a */
    public final HashMap<Integer, ThreadWindowUIModel> mo191459a() {
        return this.f138882a;
    }

    /* renamed from: b */
    public final C56101i mo191460b() {
        return this.f138883b;
    }

    public UIModelInterceptorFactory(C56101i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "model");
        this.f138883b = iVar;
    }

    /* renamed from: a */
    public final C33955c.AbstractC33956a<ThreadMessageVO<?>> mo191458a(int i) {
        ThreadWindowUIModel dVar = new ThreadWindowUIModel(i, new C56147a(this));
        this.f138882a.put(Integer.valueOf(i), dVar);
        return new UIModelInterceptor(dVar);
    }
}
