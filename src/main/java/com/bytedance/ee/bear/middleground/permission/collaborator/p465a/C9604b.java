package com.bytedance.ee.bear.middleground.permission.collaborator.p465a;

import android.view.View;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.component.universe_design.image.UDAvatarList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b */
public class C9604b extends UDAvatarList.AvatarAdapter<UserInfo> {

    /* renamed from: a */
    static final /* synthetic */ boolean f25785a = true;

    /* renamed from: b */
    private AbstractC9605a f25786b;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b$a */
    public interface AbstractC9605a {
        /* renamed from: a */
        void mo36784a(UserInfo userInfo);
    }

    public C9604b() {
        super(-3, new ArrayList());
    }

    /* renamed from: a */
    public void mo36787a(AbstractC9605a aVar) {
        this.f25786b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39766a(UserInfo userInfo, View view) {
        AbstractC9605a aVar = this.f25786b;
        if (aVar != null) {
            aVar.mo36784a(userInfo);
        }
    }

    @Override // com.larksuite.component.universe_design.image.UDAvatarList.AvatarAdapter
    /* renamed from: a */
    public void mo18933a(UDAvatar uDAvatar, int i) {
        UserInfo userInfo = (UserInfo) getItem(i);
        if (userInfo != null) {
            AvatarLoadHelper.m39732a(uDAvatar, userInfo);
            uDAvatar.setOnClickListener(new View.OnClickListener(userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.p465a.$$Lambda$b$TxvgiQt1ggsbWxIgPkxQhgtnTKk */
                public final /* synthetic */ UserInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C9604b.this.m39766a((C9604b) this.f$1, (UserInfo) view);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo36788a(ArrayList<UserInfo> arrayList, int i) {
        List a = mo91010a();
        if (f25785a || a != null) {
            a.clear();
            a.addAll(arrayList);
            int size = i - arrayList.size();
            while (true) {
                int i2 = size - 1;
                if (size > 0) {
                    a.add(new UserInfo());
                    size = i2;
                } else {
                    notifyDataSetChanged();
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }
}
