package com.ss.android.lark.mail.impl.message.framework.tabcontainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.framework.C42926c;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.message.pageroute.C42942a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2176d.C42349b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import java.util.ArrayList;
import java.util.List;

public class MessageListTabActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    public ArrayList<MessageListIntenInfo> f109335a;

    /* renamed from: b */
    public C42930b f109336b;

    /* renamed from: c */
    public String f109337c;

    /* renamed from: d */
    private int f109338d;

    /* renamed from: e */
    private int f109339e;

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107399b;
    }

    /* renamed from: d */
    public int mo154015d() {
        return this.f109338d;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        this.f109336b.mo154027b();
    }

    /* renamed from: e */
    private void mo150716e() {
        List<C43307b.AbstractC43311a> b = C43307b.m172030a().mo154980b();
        for (int size = b.size() - 1; size >= 0; size--) {
            if (b.get(size) instanceof AbsMessageTemplateView.AbstractC43115a) {
                b.remove(size);
            }
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        ((C42351b) C42344d.m169091a(C42351b.class, this)).mo152473j();
        ((C42352c) C42344d.m169091a(C42352c.class, this)).mo152473j();
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
        ((C42306q) C42344d.m169092a(C42306q.class, this, this.f109337c)).mo152384d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        C42344d.m169094a(C42299o.class);
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.framework.tabcontainer.MessageListTabActivity.RunnableC429282 */

            public void run() {
                if (C43345c.m172076m().mo154996b()) {
                    Log.m165389i("MessageListTabActivity", "onStop and isAppFront quite search");
                    if (MessageListTabActivity.this.f109336b != null) {
                        MessageListTabActivity.this.f109336b.mo154026a(true);
                    }
                }
            }
        }, 100);
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        MessageListIntenInfo messageListIntenInfo;
        Bundle bundle;
        String str;
        if (!CollectionUtils.isEmpty(this.f109335a) && (messageListIntenInfo = this.f109335a.get(0)) != null) {
            String str2 = null;
            if (getIntent() == null) {
                bundle = null;
            } else {
                bundle = getIntent().getExtras();
            }
            if (bundle != null) {
                str2 = bundle.getString("key_result_hint_from");
                str = bundle.getString("key_search_session_id");
            } else {
                str = null;
            }
            C42330c.m169053a(messageListIntenInfo.mo154050c(), str2, str);
        }
        C42930b bVar = this.f109336b;
        if (bVar != null) {
            bVar.mo154023a();
            C42926c.m170942a();
        }
        mo150716e();
        C41988g.m166970a();
        C42879j.m170799a().mo153878d();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Log.m165389i("MessageListTabActivity", "onSaveInstanceState mDefIndex:" + this.f109338d);
        bundle.putInt("key_def_index", this.f109338d);
        bundle.putParcelableArrayList("key_threadid_list", this.f109335a);
        bundle.putInt("key_serve_creator_type", this.f109339e);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (bundle == null) {
            bundle = extras;
        }
        if (bundle == null) {
            C41816b.m166115a().mo150114D().mo150182b("email_page_intent_error", C43767j.m173489a().mo155933a("pageName", mo150444a()).mo155933a("error", "extras null").mo155934a());
            Log.m165389i("MessageListTabActivity", "testAsynRender extras null finish return :");
            finish();
            return;
        }
        setContentView(R.layout.mail_message_list_tab_activity);
        MailViewPager mailViewPager = (MailViewPager) findViewById(R.id.mail_messagelist_viewpager);
        boolean z = bundle.getBoolean("key_click_preload_ing");
        this.f109338d = bundle.getInt("key_def_index");
        this.f109339e = bundle.getInt("key_serve_creator_type");
        ArrayList<MessageListIntenInfo> parcelableArrayList = bundle.getParcelableArrayList("key_threadid_list");
        this.f109335a = parcelableArrayList;
        if (CollectionUtils.isEmpty(parcelableArrayList)) {
            Log.m165389i("MessageListTabActivity", "testAsynRender mMessageListItemList empty finish return :");
            finish();
            return;
        }
        String string = bundle.getString("come_from");
        if (!z) {
            C42879j.m170799a().mo153870a(this.f109335a, this.f109338d, this.f109339e, "", this);
        }
        if (C42879j.m170799a().mo153874b()) {
            Log.m165389i("MessageListTabActivity", "testAsynRender MessageListTabActivity onCreate 11 :");
            C42879j.m170799a().mo153864a(this, this.f109335a.get(this.f109338d).mo154050c(), string);
        }
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_base));
        String c = this.f109335a.get(this.f109338d).mo154050c();
        this.f109337c = c;
        ((C42306q) C42344d.m169092a(C42306q.class, this, c)).mo152431a(bundle);
        ((C42349b) C42344d.m169091a(C42349b.class, this)).mo152460b(mo150444a());
        ((C42351b) C42344d.m169091a(C42351b.class, this)).mo152466b(mo150444a());
        ((C42352c) C42344d.m169091a(C42352c.class, this)).mo152466b(mo150444a());
        Log.m165389i("MessageListTabActivity", "testAsynRender MessageListTabActivity onCreate 22 :");
        AbstractC42925b a = new C42942a().mo154040a(this.f109339e);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f109335a.size(); i++) {
            C42844a a2 = a.mo154011a();
            a2.mo153781a(this.f109335a.get(i));
            a2.mo153779a(i);
            arrayList.add(a2);
        }
        C42930b bVar = new C42930b(this, arrayList, a, this.f109338d, mailViewPager, null, this.f109339e, string);
        this.f109336b = bVar;
        mailViewPager.setAdapter(bVar);
        mailViewPager.setScanScroll(false);
        this.f109335a.get(this.f109338d).mo154048a(true);
        Log.m165389i("MessageListTabActivity", "MessageListTabActivity mDefIndex:" + this.f109338d);
        mailViewPager.setCurrentItem(this.f109338d);
        final View findViewById = findViewById(R.id.message_list_operation_title_bar);
        mailViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.mail.impl.message.framework.tabcontainer.MessageListTabActivity.C429271 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                ((C42349b) C42344d.m169091a(C42349b.class, MessageListTabActivity.this)).mo152457a(i, MessageListTabActivity.this.mo150444a());
                Log.m165389i("MessageListTabActivity", "MessageListTabActivity onPageScrollStateChanged i:" + i);
                MessageListTabActivity messageListTabActivity = MessageListTabActivity.this;
                ((C42306q) C42344d.m169092a(C42306q.class, messageListTabActivity, messageListTabActivity.f109337c)).mo152427a(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                MessageListTabActivity.this.f109336b.mo154028b(i);
                C42926c.m170942a();
                C42926c.m170943a(MessageListTabActivity.this.f109335a.get(i).mo154050c());
                Log.m165389i("MessageListTabActivity", "MessageListTabActivity onPageSelected i:" + i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                MessageListTabActivity messageListTabActivity = MessageListTabActivity.this;
                ((C42306q) C42344d.m169092a(C42306q.class, messageListTabActivity, messageListTabActivity.f109337c)).mo152428a(i, f, i2, MessageListTabActivity.this.f109336b);
                if (findViewById.getAnimation() != null) {
                    findViewById.getAnimation().cancel();
                }
                if (findViewById.getVisibility() != 0) {
                    findViewById.setAlpha(1.0f);
                    findViewById.setVisibility(0);
                }
                MessageListTabActivity.this.f109336b.mo154024a(i, f, i2);
            }
        });
        MessageListIntenInfo messageListIntenInfo = this.f109335a.get(this.f109338d);
        C42926c.m170943a(messageListIntenInfo.mo154050c());
        C42330c.m169054a(messageListIntenInfo.mo154050c(), string, bundle.getString("key_result_hint_from"), bundle.getString("key_search_session_id"));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f109336b.mo154025a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }
}
