package com.ss.android.lark.mail.impl.message.view.p2210a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.uiframework.view.actionbar.ActionBar;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ForwardButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReplyAllButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReplyButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ShareButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.view.a.d */
public class C43179d implements AbstractC43186e {

    /* renamed from: a */
    public ActionBar f109917a;

    /* renamed from: b */
    public AbsMessageTemplateView f109918b;

    /* renamed from: c */
    private final String f109919c = "BottomActionViewModelA";

    /* renamed from: d */
    private AbsButton f109920d;

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: a */
    public int mo154562a() {
        return R.layout.mail_messagelist_bottombar_item_layout;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: a */
    public void mo154564a(int i) {
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: b */
    public AbsButton mo154568b() {
        return this.f109920d;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: c */
    public void mo154569c() {
        this.f109917a.setVisibility(0);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: d */
    public void mo154570d() {
        this.f109917a.setVisibility(4);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: a */
    public void mo154565a(final AbsMessageTemplateView absMessageTemplateView) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43179d.RunnableC431812 */

            public void run() {
                ArrayList<AbsButton> a = C43179d.this.mo154563a(absMessageTemplateView.f109693a, absMessageTemplateView.getLabelId());
                if (C43179d.this.f109917a != null && C43179d.this.mo154567a(a)) {
                    C43179d.this.f109917a.getAdapter().mo155823a(a);
                    C43179d.this.f109917a.getAdapter().mo155824b();
                }
            }
        });
    }

    public C43179d(ActionBar actionBar) {
        this.f109917a = actionBar;
        actionBar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43179d.View$OnClickListenerC431801 */

            public void onClick(View view) {
            }
        });
    }

    /* renamed from: a */
    public boolean mo154567a(ArrayList<AbsButton> arrayList) {
        ActionBar actionBar = this.f109917a;
        if (actionBar == null || actionBar.getAdapter() == null || this.f109917a.getAdapter().mo155821a() == null || arrayList == null || arrayList.size() == this.f109917a.getAdapter().mo155821a().size()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e
    /* renamed from: a */
    public void mo154566a(AbsMessageTemplateView absMessageTemplateView, int i) {
        this.f109918b = absMessageTemplateView;
        if (absMessageTemplateView.getThreadType() != 4 && i != 3) {
            ArrayList<AbsButton> a = mo154563a(this.f109918b.f109693a, this.f109918b.getLabelId());
            C43175a aVar = new C43175a(this);
            this.f109917a.setAdapter(aVar);
            aVar.mo155823a(a);
            aVar.mo155824b();
        }
    }

    /* renamed from: a */
    public ArrayList<AbsButton> mo154563a(List<C42097j> list, String str) {
        boolean z;
        ArrayList<AbsButton> arrayList = new ArrayList<>();
        if (!TextUtils.equals("SCHEDULED", str) && list != null && !list.isEmpty()) {
            int size = list.size();
            while (true) {
                size--;
                if (size <= -1) {
                    break;
                }
                C42097j jVar = list.get(list.size() - 1);
                if (jVar != null) {
                    z = !jVar.mo151968j();
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return arrayList;
        }
        arrayList.add(new ReplyButton(new AbsButton.AbstractC43948a() {
            /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43179d.C431823 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
            public void onButtonClick(View view) {
                if (!C13657b.m55421a(C43179d.this.f109918b.f109693a)) {
                    C42097j jVar = C43179d.this.f109918b.f109693a.get(C43179d.this.f109918b.f109693a.size() - 1);
                    C43179d.this.f109918b.mo154318a(jVar.mo151964g(), jVar.mo151959c(), "message_quick_action_reply");
                    C42187a.m168485a(C43179d.this.f109918b.f109699g, jVar.mo151964g().mo151581b(), jVar.mo151959c());
                    C42187a.m168482a("email_thread_reply", C43177b.m171626a());
                    C42330c.m169048a(C42330c.C42333b.f107672y);
                }
            }
        }));
        if (C13657b.m55423b(list) && list.get(list.size() - 1).mo151964g().mo151552E()) {
            arrayList.add(new ReplyAllButton(new AbsButton.AbstractC43948a() {
                /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43179d.C431834 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                public void onButtonClick(View view) {
                    if (!C13657b.m55421a(C43179d.this.f109918b.f109693a)) {
                        C42097j jVar = C43179d.this.f109918b.f109693a.get(C43179d.this.f109918b.f109693a.size() - 1);
                        C43179d.this.f109918b.mo154335b(jVar.mo151964g(), jVar.mo151959c(), "message_quick_action_reply_all");
                        C42187a.m168505b(C43179d.this.f109918b.f109699g, jVar.mo151964g().mo151581b(), jVar.mo151959c());
                        C42187a.m168482a("email_thread_replyall", C43177b.m171626a());
                        C42330c.m169048a(C42330c.C42333b.f107638B);
                    }
                }
            }));
        }
        arrayList.add(new ForwardButton(new AbsButton.AbstractC43948a() {
            /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43179d.C431845 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
            public void onButtonClick(View view) {
                if (!C13657b.m55421a(C43179d.this.f109918b.f109693a)) {
                    C42097j jVar = C43179d.this.f109918b.f109693a.get(C43179d.this.f109918b.f109693a.size() - 1);
                    C43179d.this.f109918b.mo154345c(jVar.mo151964g(), jVar.mo151959c(), "message_quick_action_forward");
                    C42187a.m168515c(C43179d.this.f109918b.f109699g, jVar.mo151964g().mo151581b(), jVar.mo151959c());
                    C42187a.m168482a("email_thread_forward", C43177b.m171626a());
                    C42330c.m169048a(C42330c.C42333b.f107639C);
                }
            }
        }));
        if (this.f109918b.mo154303N()) {
            ShareButton shareButton = new ShareButton(new AbsButton.AbstractC43948a() {
                /* class com.ss.android.lark.mail.impl.message.view.p2210a.C43179d.C431856 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                public void onButtonClick(View view) {
                    Log.m165389i("BottomActionViewModelA", "createDataList ShareButton click");
                    C43179d.this.f109918b.mo154301L();
                    C42330c.m169048a(C42330c.C42333b.f107668u);
                }
            });
            this.f109920d = shareButton;
            arrayList.add(shareButton);
        }
        return arrayList;
    }
}
