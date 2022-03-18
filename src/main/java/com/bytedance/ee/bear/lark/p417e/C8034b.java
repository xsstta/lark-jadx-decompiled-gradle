package com.bytedance.ee.bear.lark.p417e;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.bytedance.ee.bear.lark.selector.C8117c;
import com.bytedance.ee.bear.lark.statistics.doc.DocHitPoint;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.widget.richtext.C59029c;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.e.b */
public class C8034b implements IPlusItem {

    /* renamed from: a */
    private ISupportForItem f21525a;

    /* renamed from: b */
    private Chat f21526b;

    /* renamed from: c */
    private Context f21527c;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.ic_keyboard_docs;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return null;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return 10;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        return this.f21527c.getString(R.string.Lark_Legacy_SendDocKey);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        this.f21525a = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        this.f21525a.mo124326a();
        DocHitPoint.m32117b();
        C8117c.m32406a(this.f21525a.mo124328b(), 2457);
    }

    public C8034b(Context context, Chat chat) {
        this.f21527c = context;
        this.f21526b = chat;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        if (intent == null || i != 2457) {
            return false;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (CollectionUtils.isEmpty(stringArrayListExtra)) {
            return false;
        }
        for (String str : stringArrayListExtra) {
            ((AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class)).mo31010a(this.f21526b.getId(), this.f21525a.mo124331e(), this.f21525a.mo124330d(), C59029c.m229161b(str));
        }
        C13479a.m54772d("DocModule onAc", "p = " + this.f21525a.mo124330d() + " , r = " + this.f21525a.mo124331e());
        this.f21525a.mo124332f();
        return true;
    }
}
