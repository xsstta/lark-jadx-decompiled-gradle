package com.ss.android.lark.mail.impl.message.framework;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.message.C42834b;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.AbstractC42929a;
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
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import java.util.List;

public class MessageListActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    public AbsMessageTemplateView f109319a;

    /* renamed from: b */
    public C42834b f109320b;

    /* renamed from: c */
    private final String f109321c = "MessageListActivity";

    /* renamed from: d */
    private MessageListIntenInfo f109322d;

    /* renamed from: e */
    private int f109323e;

    /* renamed from: f */
    private String f109324f;

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107399b;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        Log.m165389i("MessageListActivity", "onResume");
        this.f109319a.mo154332b();
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
        Log.m165389i("MessageListActivity", "onBackPressed");
        ((C42306q) C42344d.m169092a(C42306q.class, this, this.f109324f)).mo152384d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        C42344d.m169094a(C42299o.class);
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.framework.MessageListActivity.RunnableC429232 */

            public void run() {
                if (C43345c.m172076m().mo154996b()) {
                    Log.m165389i("MessageListActivity", "onStop and isAppFront quite search");
                    if (MessageListActivity.this.f109319a != null) {
                        MessageListActivity.this.f109319a.mo154329a(true);
                    }
                }
            }
        }, 100);
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        Bundle bundle;
        String str;
        Log.m165389i("MessageListActivity", "onDestroy");
        if (this.f109322d != null) {
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
            C42330c.m169053a(this.f109322d.mo154050c(), str2, str);
        }
        this.f109319a.mo154298I();
        mo150716e();
        C42926c.m170942a();
        this.f109320b.mo153750b();
        C41988g.m166970a();
        C42879j.m170799a().mo153878d();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("key_thread", this.f109322d);
        bundle.putInt("key_serve_creator_type", this.f109323e);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    private void m170918b(Bundle bundle) {
        C42844a a = new C42942a().mo154040a(this.f109323e).mo154011a();
        a.mo153781a(this.f109322d);
        a.mo153782a(bundle.getString("come_from"));
        this.f109319a.mo154321a(a, false, null, this.f109323e);
    }

    /* renamed from: a */
    private void m170917a(Bundle bundle) {
        this.f109323e = bundle.getInt("key_serve_creator_type");
        AbstractC42925b a = new C42942a().mo154040a(this.f109323e);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.mail_message_list_single_activity, (ViewGroup) null);
        setContentView(relativeLayout);
        this.f109319a = a.mo154012a(this);
        relativeLayout.addView(this.f109319a, 0, new RelativeLayout.LayoutParams(-1, -1));
        this.f109319a.setITabPageLoadCallback(new AbstractC42929a() {
            /* class com.ss.android.lark.mail.impl.message.framework.MessageListActivity.C429221 */

            @Override // com.ss.android.lark.mail.impl.message.framework.tabcontainer.AbstractC42929a
            /* renamed from: a */
            public void mo153995a(int i) {
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m165389i("MessageListActivity", "onCreate");
        C42834b bVar = new C42834b(1);
        this.f109320b = bVar;
        bVar.mo153749a();
        Bundle extras = getIntent().getExtras();
        if (bundle == null) {
            bundle = extras;
        }
        if (bundle == null) {
            finish();
            return;
        }
        MessageListIntenInfo messageListIntenInfo = (MessageListIntenInfo) bundle.getParcelable("key_thread");
        this.f109322d = messageListIntenInfo;
        if (messageListIntenInfo == null) {
            finish();
            return;
        }
        this.f109324f = messageListIntenInfo.mo154050c();
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_base));
        ((C42306q) C42344d.m169092a(C42306q.class, this, this.f109324f)).mo152431a(bundle);
        ((C42349b) C42344d.m169091a(C42349b.class, this)).mo152460b(mo150444a());
        ((C42351b) C42344d.m169091a(C42351b.class, this)).mo152466b(mo150444a());
        ((C42352c) C42344d.m169091a(C42352c.class, this)).mo152466b(mo150444a());
        this.f109322d.mo154048a(true);
        m170917a(bundle);
        m170918b(bundle);
        C42926c.m170943a(this.f109322d.mo154050c());
        C42330c.m169054a(this.f109322d.mo154050c(), bundle.getString("come_from"), bundle.getString("key_result_hint_from"), bundle.getString("key_search_session_id"));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f109319a.mo154311a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }
}
