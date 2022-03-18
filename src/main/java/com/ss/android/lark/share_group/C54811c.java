package com.ss.android.lark.share_group;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.share_group.AbstractC54803a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.share_group.c */
public class C54811c implements AbstractC54803a.AbstractC54804a {

    /* renamed from: a */
    public IChatService f135309a = C32821b.m126120a();

    /* renamed from: b */
    public AbstractC34297l f135310b = C32835d.m126323c();

    /* renamed from: c */
    private C54815a f135311c;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public C54815a mo187023a() {
        return this.f135311c;
    }

    /* renamed from: b */
    public String mo187028b() {
        C54815a aVar = this.f135311c;
        if (aVar != null) {
            return aVar.f135320a;
        }
        return "";
    }

    /* renamed from: c */
    public List<GroupRecallEntity> mo187030c() {
        ArrayList arrayList = new ArrayList();
        C54815a aVar = this.f135311c;
        if (aVar != null) {
            return aVar.f135321b;
        }
        return arrayList;
    }

    public C54811c(C54815a aVar) {
        this.f135311c = aVar;
    }

    /* renamed from: a */
    public List<String> mo187024a(List<GroupRecallEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (GroupRecallEntity groupRecallEntity : list) {
            if (groupRecallEntity.mo124689a() == 2) {
                arrayList.add(groupRecallEntity.mo124690b());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<String> mo187029b(List<GroupRecallEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (GroupRecallEntity groupRecallEntity : list) {
            if (groupRecallEntity.mo124689a() == 1) {
                arrayList.add(groupRecallEntity.mo124690b());
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.lark.share_group.c$a */
    public static class C54815a {

        /* renamed from: a */
        public String f135320a;

        /* renamed from: b */
        public List<GroupRecallEntity> f135321b;

        /* renamed from: c */
        public boolean f135322c;

        public C54815a(String str, List<GroupRecallEntity> list, boolean z) {
            this.f135320a = str;
            this.f135321b = list;
            this.f135322c = z;
        }
    }

    /* renamed from: a */
    public void mo187026a(String str, List<GroupRecallEntity> list, final IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        this.f135309a.mo121043b(list, str, new IGetDataCallback<List<GroupRecallEntity>>() {
            /* class com.ss.android.lark.share_group.C54811c.C548143 */

            /* renamed from: a */
            public void onSuccess(List<GroupRecallEntity> list) {
                iGetDataCallback.onSuccess(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        });
    }

    /* renamed from: a */
    public void mo187025a(GroupRecallEntity groupRecallEntity, String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f135309a.mo121008a(str, Collections.emptyList(), Collections.singleton(groupRecallEntity), 2, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.share_group.C54811c.C548121 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                iGetDataCallback.onSuccess(true);
            }
        });
    }

    /* renamed from: a */
    public void mo187027a(List<GroupRecallEntity> list, String str, final IGetDataCallback<List<RecallItemViewData>> iGetDataCallback) {
        if (str == null || list.isEmpty()) {
            C53241h.m205894a("RecallGroupChatterModel", "loadRecallChatters param is invalid! ");
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult(-1));
                return;
            }
            return;
        }
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        mo187026a(str, list, new IGetDataCallback<List<GroupRecallEntity>>() {
            /* class com.ss.android.lark.share_group.C54811c.C548132 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<GroupRecallEntity> list) {
                if (!list.isEmpty()) {
                    hashMap2.putAll(C54811c.this.f135310b.mo121189a(C54811c.this.mo187029b(list)));
                    hashMap.putAll(C54811c.this.f135309a.mo121033b(C54811c.this.mo187024a(list)));
                    ArrayList arrayList = new ArrayList();
                    for (GroupRecallEntity groupRecallEntity : list) {
                        if (groupRecallEntity.mo124689a() == 2) {
                            Chat chat = (Chat) hashMap.get(groupRecallEntity.mo124690b());
                            if (chat != null) {
                                arrayList.add(RecallItemViewData.m212648a(chat));
                            }
                        } else if (groupRecallEntity.mo124689a() == 1) {
                            Chatter chatter = (Chatter) hashMap2.get(groupRecallEntity.mo124690b());
                            if (chatter != null) {
                                arrayList.add(RecallItemViewData.m212649a(chatter));
                            }
                        } else if (groupRecallEntity.mo124689a() == 3) {
                            RecallItemViewData eVar = new RecallItemViewData(groupRecallEntity.mo136116c(), groupRecallEntity.mo124690b());
                            eVar.mo187042b(R.drawable.icon_department_avatar);
                            eVar.mo187039a(3);
                            arrayList.add(eVar);
                        }
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(arrayList);
                    }
                }
            }
        });
    }
}
