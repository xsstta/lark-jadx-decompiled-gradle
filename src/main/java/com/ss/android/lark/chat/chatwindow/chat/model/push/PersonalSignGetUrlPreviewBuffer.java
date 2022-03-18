package com.ss.android.lark.chat.chatwindow.chat.model.push;

import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R7\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002`\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/push/PersonalSignGetUrlPreviewBuffer;", "Lcom/larksuite/framework/utils/AndroidThrottle$TaskBuffer;", "Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$GetSignUrlPreviewParams;", "()V", "requestMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getRequestMap", "()Ljava/util/HashMap;", "requestMap$delegate", "Lkotlin/Lazy;", "clear", "", "consumeAll", "", "put", "params", "size", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c.d */
public final class PersonalSignGetUrlPreviewBuffer implements AndroidThrottle.AbstractC26232d<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> {

    /* renamed from: a */
    private final Lazy f86029a = LazyKt.lazy(C33406a.INSTANCE);

    /* renamed from: a */
    private final HashMap<String, UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> m129434a() {
        return (HashMap) this.f86029a.getValue();
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: b */
    public void mo93317b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$GetSignUrlPreviewParams;", "Lkotlin/collections/HashMap;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c.d$a */
    static final class C33406a extends Lambda implements Function0<HashMap<String, UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams>> {
        public static final C33406a INSTANCE = new C33406a();

        C33406a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<String, UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> invoke() {
            return new HashMap<>();
        }
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: c */
    public int mo93318c() {
        return m129434a().size();
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: d */
    public Collection<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> mo93319d() {
        ArrayList arrayList = new ArrayList(m129434a().values());
        m129434a().clear();
        return arrayList;
    }

    /* renamed from: a */
    public void mo93316a(UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams bVar) {
        if (bVar != null) {
            m129434a().put(bVar.mo126954b(), bVar);
        }
    }
}
