package com.ss.android.lark.mail.impl.message.framework.tabcontainer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42924a;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.framework.C42926c;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.message.pageroute.C42942a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2176d.C42349b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.framework.tabcontainer.c */
public class C42933c extends AbstractC42924a {

    /* renamed from: f */
    public ArrayList<MessageListIntenInfo> f109361f;

    /* renamed from: g */
    public C42930b f109362g;

    /* renamed from: h */
    public C42306q f109363h;

    /* renamed from: i */
    private int f109364i;

    /* renamed from: j */
    private int f109365j;

    /* renamed from: k */
    private Bundle f109366k;

    /* renamed from: g */
    public int mo154033g() {
        return this.f109364i;
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42924a
    /* renamed from: a */
    public void mo154003a() {
        super.mo154003a();
        this.f109362g.mo154027b();
    }

    /* renamed from: h */
    private void m170971h() {
        List<C43307b.AbstractC43311a> b = C43307b.m172030a().mo154980b();
        for (int size = b.size() - 1; size >= 0; size--) {
            if (b.get(size) instanceof AbsMessageTemplateView.AbstractC43115a) {
                b.remove(size);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42924a
    /* renamed from: d */
    public void mo154008d() {
        C42344d.m169094a(C42299o.class);
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42933c.RunnableC429352 */

            public void run() {
                if (C43345c.m172076m().mo154996b()) {
                    Log.m165389i("MessageListTabContainer", "onStop and isAppFront quite search");
                    if (C42933c.this.f109362g != null) {
                        C42933c.this.f109362g.mo154026a(true);
                    }
                }
            }
        }, 100);
        super.mo154008d();
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42924a
    /* renamed from: e */
    public void mo154009e() {
        MessageListIntenInfo messageListIntenInfo;
        String str;
        C42871i.m170775a().mo153852a(false);
        if (!CollectionUtils.isEmpty(this.f109361f) && (messageListIntenInfo = this.f109361f.get(0)) != null) {
            Bundle bundle = this.f109366k;
            String str2 = null;
            if (bundle != null) {
                str2 = bundle.getString("key_result_hint_from");
                str = this.f109366k.getString("key_search_session_id");
            } else {
                str = null;
            }
            C42330c.m169053a(messageListIntenInfo.mo154050c(), str2, str);
        }
        C42930b bVar = this.f109362g;
        if (bVar != null) {
            bVar.mo154023a();
            C42926c.m170942a();
        }
        m170971h();
        C41988g.m166970a();
        C42879j.m170799a().mo153878d();
        super.mo154009e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42924a
    /* renamed from: b */
    public void mo154006b(Bundle bundle, final Context context) {
        RelativeLayout.LayoutParams layoutParams;
        Log.m165389i("MessageListTabContainer", "testFirstFrame MessageListTabContainer doOnCreate");
        this.f109328b = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.mail_message_list_tab_activity_frame, (ViewGroup) null, false);
        MailViewPager mailViewPager = (MailViewPager) this.f109328b.findViewById(R.id.mail_messagelist_viewpager);
        this.f109366k = bundle;
        this.f109364i = bundle.getInt("key_def_index");
        this.f109365j = bundle.getInt("key_serve_creator_type");
        ArrayList<MessageListIntenInfo> parcelableArrayList = bundle.getParcelableArrayList("key_threadid_list");
        this.f109361f = parcelableArrayList;
        if (CollectionUtils.isEmpty(parcelableArrayList)) {
            mo154007c();
            return;
        }
        String string = bundle.getString("come_from");
        if (C42879j.m170799a().mo153874b()) {
            Log.m165389i("MessageListTabContainer", "testAsynRender MessageListTabActivity onCreate 11 :");
            C42879j.m170799a().mo153864a((Activity) context, this.f109361f.get(this.f109364i).mo154050c(), string);
        }
        Activity activity = (Activity) context;
        StatusBarUtil.setColorNoTranslucent(activity, context.getResources().getColor(R.color.bg_base));
        this.f109331e = this.f109361f.get(this.f109364i).mo154050c();
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, context, this.f109331e);
        this.f109363h = qVar;
        qVar.mo152431a(bundle);
        ((C42349b) C42344d.m169091a(C42349b.class, context)).mo152460b(mo154010f());
        ((C42351b) C42344d.m169091a(C42351b.class, context)).mo152466b(mo154010f());
        ((C42352c) C42344d.m169091a(C42352c.class, context)).mo152466b(mo154010f());
        Log.m165389i("MessageListTabContainer", "testAsynRender MessageListTabActivity onCreate 22 :");
        AbstractC42925b a = new C42942a().mo154040a(this.f109365j);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f109361f.size(); i++) {
            C42844a a2 = a.mo154011a();
            a2.mo153781a(this.f109361f.get(i));
            a2.mo153779a(i);
            arrayList.add(a2);
        }
        C42930b bVar = new C42930b(activity, arrayList, a, this.f109364i, mailViewPager, this, this.f109365j, string);
        this.f109362g = bVar;
        mailViewPager.setAdapter(bVar);
        mailViewPager.setScanScroll(false);
        this.f109361f.get(this.f109364i).mo154048a(true);
        Log.m165389i("MessageListTabContainer", "MessageListTabActivity mDefIndex:" + this.f109364i);
        mailViewPager.setCurrentItem(this.f109364i);
        this.f109329c = (OperationTitleBar) this.f109328b.findViewById(R.id.message_list_operation_title_bar);
        if (!(this.f109365j == 2 || (layoutParams = (RelativeLayout.LayoutParams) this.f109329c.getLayoutParams()) == null)) {
            layoutParams.topMargin = com.ss.android.lark.utils.StatusBarUtil.getStatusBarHeight(context);
            this.f109329c.setLayoutParams(layoutParams);
        }
        this.f109330d = this.f109328b.findViewById(R.id.mail_message_list_mailtitle_subject);
        mailViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42933c.C429341 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                ((C42349b) C42344d.m169091a(C42349b.class, context)).mo152457a(i, C42933c.this.mo154010f());
                Log.m165389i("MessageListTabContainer", "MessageListTabActivity onPageScrollStateChanged i:" + i);
                C42933c.this.f109363h.mo152427a(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                C42933c.this.f109362g.mo154028b(i);
                C42926c.m170942a();
                C42926c.m170943a(C42933c.this.f109361f.get(i).mo154050c());
                Log.m165389i("MessageListTabContainer", "MessageListTabActivity onPageSelected i:" + i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                C42933c.this.f109363h.mo152428a(i, f, i2, C42933c.this.f109362g);
                if (C42933c.this.f109329c.getAnimation() != null) {
                    C42933c.this.f109329c.getAnimation().cancel();
                }
                if (C42933c.this.f109329c.getVisibility() != 0) {
                    C42933c.this.f109329c.setAlpha(1.0f);
                    if (C42933c.this.f109362g.mo154030c()) {
                        C42933c.this.f109329c.setVisibility(0);
                    }
                }
                C42933c.this.f109362g.mo154024a(i, f, i2);
            }
        });
        MessageListIntenInfo messageListIntenInfo = this.f109361f.get(this.f109364i);
        C42926c.m170943a(messageListIntenInfo.mo154050c());
        C42330c.m169054a(messageListIntenInfo.mo154050c(), string, bundle.getString("key_result_hint_from"), bundle.getString("key_search_session_id"));
    }
}
