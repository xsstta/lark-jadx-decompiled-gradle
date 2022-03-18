package com.ss.android.lark.chatwindow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.aj;
import com.bytedance.lark.sdk.Sdk;
import com.facebook.yoga.android.YogaViewLayoutFactory;
import com.google.gson.Gson;
import com.larksuite.framework.utils.C26322v;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.biz.plugin.MultitaskSharedChatPropertiesViewModel;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.chatwindow.chat.v2.ChatWindowFragment;
import com.ss.android.lark.chat.utils.ChatResourceCache;
import com.ss.android.lark.eetroublebase.AbstractC36967b;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.eetroublecapture.C36969b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.C48366c;
import com.ss.android.lark.multitask.task.C48367d;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.GlobalTaskContainer;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.p1786d.AbstractC36434e;
import com.ss.android.lark.p1786d.AbstractC36435f;
import com.ss.android.lark.p1786d.C36439j;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.p2392o.AbstractC48702k;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ChatWindowActivity extends AbstractActivityC35240e implements AbstractC36435f, AbstractC36967b, AbstractC36982d, AbstractC48702k, ILifeCycleEventObserve, ILifeCycleEventObserve.AbstractC58308a {

    /* renamed from: a */
    private boolean f90935a;

    /* renamed from: b */
    private AbstractC36434e f90936b;

    /* renamed from: c */
    private String f90937c;

    /* renamed from: d */
    private boolean f90938d;

    /* renamed from: e */
    private ILifeCycleEventObserve.AbstractC58308a f90939e;

    /* renamed from: f */
    private MultitaskHelper f90940f;

    /* renamed from: g */
    private MultitaskSharedChatPropertiesViewModel f90941g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36435f
    /* renamed from: a */
    public AbstractC36434e mo129674a() {
        if (this.f90936b == null) {
            this.f90936b = C36443k.m143598a(this);
        }
        return this.f90936b;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        C29990c.m110930b().mo134577e().mo120978i();
    }

    @Override // com.ss.android.lark.eetroublebase.AbstractC36967b
    /* renamed from: c */
    public Map<String, String> mo129679c() {
        HashMap hashMap = new HashMap();
        hashMap.put("getChatId", this.f90937c);
        hashMap.put("isSecretChat", String.valueOf(this.f90938d));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public MultitaskSharedChatPropertiesViewModel mo129680d() {
        if (this.f90941g == null) {
            this.f90941g = (MultitaskSharedChatPropertiesViewModel) aj.m5366a(this).mo6005a(MultitaskSharedChatPropertiesViewModel.class);
        }
        return this.f90941g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        Intent intent = getIntent();
        if (intent == null || intent.getBooleanExtra("DoAnimationWithDefault", true)) {
            return true;
        }
        intent.removeExtra("DoAnimationWithDefault");
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        try {
            super.onDestroy();
            C26322v.m95321a((Context) this);
            C26322v.m95320a((Activity) this);
            ChatResourceCache.f88672a.mo126919a();
            TextLayoutBuilder.m226861b();
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165387e("chatwindow", (Throwable) e, true);
        }
    }

    /* renamed from: b */
    public void mo129677b() {
        PerfLog.start("showChatFragment", "");
        Bundle extras = getIntent().getExtras();
        ChatWindowFragment aVar = new ChatWindowFragment();
        aVar.setArguments(extras);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, ChatWindowFragment.class.getName());
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        int intExtra = getIntent().getIntExtra("multi_task_transition", 0);
        if (intExtra == 1) {
            return new ActivityAnimationManager.AnimationConfig(R.anim.chat_activity_bottom_in, R.anim.hold);
        }
        if (intExtra == 2) {
            return new ActivityAnimationManager.AnimationConfig(R.anim.chat_activity_bottom_in, R.anim.hold);
        }
        return super.getEnterAnimationConfig();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById == null || !findFragmentById.isVisible() || !(findFragmentById instanceof C29520a) || !((C29520a) findFragmentById).mo104599a()) {
            finish();
        }
    }

    /* renamed from: i */
    private void mo194400i() {
        String str = "";
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            str = getIntent().getExtras().getString("gochatwin_from", str);
        }
        if (str == null || !"notification".equalsIgnoreCase(str)) {
            this.f90935a = false;
        } else {
            C29990c.m110930b().mo134577e().mo120957a(ChatBundle.SourceType.PUSH.value);
            this.f90935a = true;
        }
        Log.m165389i("chatwindow", "statisticsPrefIfNeed:" + str + ", isFromNotification:" + this.f90935a);
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        try {
            List<Map<String, String>> b = C36969b.m145958b(findViewById(R.id.chat_message_list_view));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("channel_id", this.f90937c);
            linkedHashMap.put("isSecret", String.valueOf(this.f90938d));
            linkedHashMap.put("messages", b);
            String str = "user screenshot accompanying infos:" + new Gson().toJson(linkedHashMap);
            Log.m165389i("chatwindow", str);
            Sdk.log("screenshot", str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @Override // com.ss.android.lark.widget.ILifeCycleEventObserve
    /* renamed from: a */
    public void mo129675a(ILifeCycleEventObserve.AbstractC58308a aVar) {
        this.f90939e = aVar;
    }

    @Override // com.ss.android.lark.widget.ILifeCycleEventObserve
    /* renamed from: b */
    public void mo129678b(ILifeCycleEventObserve.AbstractC58308a aVar) {
        this.f90939e = null;
    }

    /* renamed from: a */
    private AbstractC48369g m137500a(final Intent intent) {
        return new AbstractC48369g() {
            /* class com.ss.android.lark.chatwindow.ChatWindowActivity.C352101 */

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
            public /* synthetic */ EventTracker O_() {
                return AbstractC48369g.CC.$default$O_(this);
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48369g
            public /* synthetic */ FragmentActivity p_() {
                return AbstractC48369g.CC.$default$p_(this);
            }

            /* renamed from: c */
            public AppCompatActivity mo23785d() {
                return ChatWindowActivity.this;
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: e */
            public AbstractC48375n mo23786e() {
                return GlobalTaskContainer.f121801b;
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: b */
            public AbstractC48378t mo23783b() {
                return new C48367d(ChatWindowActivity.class);
            }

            /* renamed from: f */
            public C48366c mo23782a() {
                return new C48366c(ChatWindowActivity.this, intent) {
                    /* class com.ss.android.lark.chatwindow.ChatWindowActivity.C352101.C352111 */

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: b */
                    public CharSequence mo23790b() {
                        return ChatWindowActivity.this.mo129680d().getChatName();
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public Task.IconFactory mo23788a() {
                        return new AvatarKeyIconFactory(ChatWindowActivity.this.mo129680d().getChatId());
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: c */
                    public String mo23791c() {
                        MultitaskSharedChatPropertiesViewModel d = ChatWindowActivity.this.mo129680d();
                        boolean isGroup = d.isGroup();
                        boolean isSecret = d.isSecret();
                        boolean isBot = d.isBot();
                        if (isGroup) {
                            return "group";
                        }
                        if (isBot) {
                            return "bot";
                        }
                        if (isSecret) {
                            return "secret";
                        }
                        return "private";
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: d */
                    public String mo23792d() {
                        String stringExtra = intent.getStringExtra("chatID");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            return stringExtra;
                        }
                        String stringExtra2 = intent.getStringExtra("chatterID");
                        return "chatter_id:" + stringExtra2;
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public void mo23789a(Bundle bundle) {
                        bundle.putAll(intent.getExtras());
                    }
                };
            }
        };
    }

    /* renamed from: b */
    private void m137502b(Intent intent) {
        this.f90940f = this.f90940f.mo169042a(m137500a(intent));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m137501a(intent, true);
        m137502b(intent);
    }

    @Override // com.ss.android.lark.widget.ILifeCycleEventObserve.AbstractC58308a
    /* renamed from: a */
    public void mo103142a(ILifeCycleEventObserve.Event event) {
        ILifeCycleEventObserve.AbstractC58308a aVar = this.f90939e;
        if (aVar != null) {
            aVar.mo103142a(event);
        }
        String str = this.TAG;
        Log.m165389i(str, "onEventChanged:" + event);
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.app.Activity
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return C36439j.m143590a(this);
        }
        if ("real_layout_inflater".equals(str)) {
            return super.getSystemService("layout_inflater");
        }
        return super.getSystemService(str);
    }

    @Override // com.ss.android.lark.p2392o.AbstractC48702k
    /* renamed from: a */
    public boolean mo129676a(String str) {
        return !str.equals(this.f90937c);
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById != null && findFragmentById.isVisible()) {
            if (!(findFragmentById instanceof ChatWindowFragment)) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (((ChatWindowFragment) findFragmentById).mo122995b(keyEvent)) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById != null && findFragmentById.isVisible()) {
            if (!(findFragmentById instanceof ChatWindowFragment)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (((ChatWindowFragment) findFragmentById).mo104600a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C29990c.m110930b().mo134577e().mo120966b(false);
        LayoutInflater.from(this).setFactory(YogaViewLayoutFactory.getInstance());
        super.onCreate(bundle);
        C33360a.m125899a(this);
        if (!C29990c.m110930b().mo134515N().mo134404g()) {
            C29990c.m110930b().mo134515N().mo134395a(this);
            finish();
            return;
        }
        m137501a(getIntent(), false);
        setSlideEnable(false);
        this.f90940f = MultitaskHelper.m190621a(m137500a(getIntent()), true, true);
    }

    /* renamed from: a */
    private void m137501a(Intent intent, boolean z) {
        mo194400i();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            finish();
            return;
        }
        this.f90937c = extras.getString("chatID");
        this.f90938d = extras.getBoolean("extra_is_secret_chat", false);
        Log.m165389i("chatwindow", "Enter chat:" + this.f90937c);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById == null || !z) {
            mo129677b();
        } else if (findFragmentById instanceof ChatWindowFragment) {
            ((ChatWindowFragment) findFragmentById).mo104596a(intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById != null) {
            findFragmentById.onActivityResult(i, i2, intent);
        }
    }
}
