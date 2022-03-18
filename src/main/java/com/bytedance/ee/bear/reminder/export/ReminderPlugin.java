package com.bytedance.ee.bear.reminder.export;

import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.reminder.C10614b;
import com.bytedance.ee.bear.reminder.ReminderViewModel;
import com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a;
import com.bytedance.ee.bear.reminder.model.C10621b;
import com.bytedance.ee.bear.reminder.model.ReminderModel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Map;

public class ReminderPlugin extends DocumentPluginV2 {
    public C10619a mReminderJsBinder;
    public C10614b mReminderReporter;
    public ReminderViewModel mReminderViewModel;

    /* renamed from: com.bytedance.ee.bear.reminder.export.ReminderPlugin$a */
    private class C10619a implements AbstractC7945d<ReminderModel> {

        /* renamed from: b */
        private String f28530b;

        /* renamed from: b */
        private void m44052b() {
            ReminderPlugin.this.mReminderReporter.mo40128c("click_insert_reminder");
        }

        /* renamed from: c */
        private void m44053c() {
            ReminderPlugin.this.mReminderReporter.mo40128c("click_reminder");
        }

        /* renamed from: a */
        public void mo40170a() {
            C13479a.m54772d("ReminderPlugin", "notifyCancel ");
            ReminderPlugin.this.getBridge().mo19350a("window.lark.biz.reminder.cancel", new JSONObject(), null);
        }

        private C10619a() {
        }

        /* renamed from: a */
        public void mo40171a(ReminderModel reminderModel) {
            reminderModel.getData().setReminderBlockId(this.f28530b);
            C13479a.m54772d("ReminderPlugin", String.format("initViewModel: window.lark.biz.reminder.setDate(%s)", reminderModel.toString()));
            ReminderPlugin.this.getBridge().mo19350a("window.lark.biz.reminder.setDate", reminderModel.toJSONObject(), null);
        }

        /* renamed from: a */
        public void handle(ReminderModel reminderModel, AbstractC7947h hVar) {
            C10621b bVar;
            C13479a.m54772d("ReminderPlugin", "show reminder: data = " + reminderModel);
            if (reminderModel == null || reminderModel.getData() == null) {
                this.f28530b = null;
                m44052b();
            } else {
                this.f28530b = reminderModel.getData().getReminderBlockId();
                m44053c();
            }
            if (reminderModel == null || reminderModel.getData() == null) {
                bVar = new C10621b();
            } else {
                bVar = reminderModel.toReminderSettings();
            }
            if (reminderModel == null) {
                bVar = new C10621b();
            }
            ReminderPlugin.this.mReminderViewModel.setOriginReminderSettings(bVar);
            C10548d.m43696a(ReminderPlugin.this.getContext());
            ReminderPlugin.this.mReminderViewModel.setActive(true);
        }
    }

    private void hideFragment() {
        View$OnClickListenerC10607a reminderFragment = getReminderFragment();
        if (reminderFragment != null) {
            reminderFragment.mo5513b();
        }
    }

    private View$OnClickListenerC10607a getReminderFragment() {
        return (View$OnClickListenerC10607a) getActivity().getSupportFragmentManager().findFragmentByTag("ReminderPlugin");
    }

    private void showFragment() {
        if (getReminderFragment() == null) {
            ((View$OnClickListenerC10607a) instantiateFragment(View$OnClickListenerC10607a.class)).mo5511a(getActivity().getSupportFragmentManager(), "ReminderPlugin");
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        C10619a aVar = new C10619a();
        this.mReminderJsBinder = aVar;
        map.put("biz.reminder.showSettingsPage", aVar);
    }

    public /* synthetic */ void lambda$onAttachToHost$0$ReminderPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            C13479a.m54764b("ReminderPlugin", "show reminder fragment.");
            showFragment();
            return;
        }
        C13479a.m54764b("ReminderPlugin", "remove reminder fragment.");
        hideFragment();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.mReminderReporter = new C10614b();
        ReminderViewModel dVar = (ReminderViewModel) C4950k.m20476a(this, ReminderViewModel.class);
        this.mReminderViewModel = dVar;
        dVar.setDelegate(new ReminderViewModel.IReminderDelegate() {
            /* class com.bytedance.ee.bear.reminder.export.ReminderPlugin.C106181 */

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: k */
            public void mo40168k() {
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: b */
            public void mo40159b() {
                ReminderPlugin.this.mReminderReporter.mo40128c("client_all_day");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: c */
            public void mo40160c() {
                ReminderPlugin.this.mReminderReporter.mo40128c("client_cancel_all_day");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: d */
            public void mo40161d() {
                ReminderPlugin.this.mReminderReporter.mo40128c("select_date");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: e */
            public void mo40162e() {
                ReminderPlugin.this.mReminderReporter.mo40128c("select_month");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: f */
            public void mo40163f() {
                ReminderPlugin.this.mReminderReporter.mo40128c("click_continue_edit");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: g */
            public void mo40164g() {
                ReminderPlugin.this.mReminderReporter.mo40128c("click_confirm_quit");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: h */
            public void mo40165h() {
                ReminderPlugin.this.mReminderReporter.mo40128c("click_no_reminder");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: i */
            public void mo40166i() {
                ReminderPlugin.this.mReminderReporter.mo40128c("select_reminder_time");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: j */
            public void mo40167j() {
                ReminderPlugin.this.mReminderReporter.mo40128c("select_time");
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: a */
            public void mo40157a() {
                C13479a.m54764b("ReminderPlugin", "close reminder fragment.");
                ReminderPlugin.this.mReminderReporter.mo40128c("click_quit");
                ReminderPlugin.this.mReminderJsBinder.mo40170a();
                ReminderPlugin.this.mReminderViewModel.setActive(false);
            }

            @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
            /* renamed from: a */
            public void mo40158a(C10621b bVar) {
                C13479a.m54764b("ReminderPlugin", "save reminder settings.");
                ReminderPlugin.this.mReminderReporter.mo40128c("click_save");
                ReminderPlugin.this.mReminderJsBinder.mo40171a(ReminderModel.newInstance(bVar));
                ReminderPlugin.this.mReminderViewModel.setActive(false);
            }
        });
        if (getDocumentMetadata() != null) {
            BearUrl g = C6313i.m25327a().mo25399g(getDocumentMetadata().getUrl());
            this.mReminderReporter.mo40126a(C13598b.m55197d(g.f17447b));
            this.mReminderReporter.mo40127b(g.f17446a);
            this.mReminderViewModel.setBearUrl(g);
        }
        this.mReminderViewModel.getActive().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.reminder.export.$$Lambda$ReminderPlugin$KrRD1jXGEmIsSkh_xrmCRPnEeJI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ReminderPlugin.this.lambda$onAttachToHost$0$ReminderPlugin((Boolean) obj);
            }
        });
    }
}
