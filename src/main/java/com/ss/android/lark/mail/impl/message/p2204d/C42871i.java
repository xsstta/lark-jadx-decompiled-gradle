package com.ss.android.lark.mail.impl.message.p2204d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42933c;
import com.ss.android.lark.mail.impl.message.plugin.C42960d;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.message.d.i */
public class C42871i {

    /* renamed from: e */
    public static String f109173e;

    /* renamed from: f */
    public static boolean f109174f;

    /* renamed from: g */
    public static boolean f109175g;

    /* renamed from: r */
    private static boolean f109176r;

    /* renamed from: a */
    public FrameLayout f109177a;

    /* renamed from: b */
    public LinearLayout f109178b;

    /* renamed from: c */
    public C42933c f109179c;

    /* renamed from: d */
    public AbstractC42870h f109180d;

    /* renamed from: h */
    public boolean f109181h;

    /* renamed from: i */
    private FrameLayout f109182i;

    /* renamed from: j */
    private FrameLayout f109183j;

    /* renamed from: k */
    private View f109184k;

    /* renamed from: l */
    private View f109185l;

    /* renamed from: m */
    private TextView f109186m;

    /* renamed from: n */
    private ImageView f109187n;

    /* renamed from: o */
    private OperationTitleBar f109188o;

    /* renamed from: p */
    private ThreadActionManager f109189p;

    /* renamed from: q */
    private boolean f109190q;

    /* renamed from: s */
    private int f109191s;

    /* renamed from: t */
    private AbstractC42877a f109192t;

    /* renamed from: com.ss.android.lark.mail.impl.message.d.i$a */
    public interface AbstractC42877a {
        /* renamed from: a */
        void mo153387a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.d.i$b */
    public static class C42878b {

        /* renamed from: a */
        public static final C42871i f109204a = new C42871i();
    }

    private C42871i() {
    }

    /* renamed from: a */
    public static C42871i m170775a() {
        return C42878b.f109204a;
    }

    /* renamed from: c */
    public static boolean m170782c() {
        return f109176r;
    }

    /* renamed from: e */
    public int mo153855e() {
        return this.f109191s;
    }

    /* renamed from: d */
    public static boolean m170783d() {
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.readmail.pushoptimize")) {
            Log.m165389i("MessageListFirstFrameManager", "isPushOptmizeFGOpen true");
            return true;
        }
        Log.m165389i("MessageListFirstFrameManager", "isPushOptmizeFGOpen false");
        return false;
    }

    /* renamed from: h */
    private void m170785h() {
        View view = this.f109184k;
        if (view != null) {
            view.setVisibility(4);
            if (this.f109184k.getParent() != null) {
                ((ViewGroup) this.f109184k.getParent()).removeView(this.f109184k);
            }
        }
    }

    /* renamed from: i */
    private void m170786i() {
        TranslateAnimation translateAnimation = new TranslateAnimation((float) C43785p.m173533a(this.f109177a.getContext()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(300);
        this.f109177a.startAnimation(translateAnimation);
    }

    /* renamed from: b */
    public static boolean m170779b() {
        if (f109176r || f109174f || f109175g || C42330c.f107632a || !C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.readmail.firstframe")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m170784g() {
        ViewGroup a = this.f109180d.mo152909a();
        if (a != null) {
            FrameLayout frameLayout = this.f109177a;
            if (!(frameLayout == null || frameLayout.getParent() == null)) {
                ((ViewGroup) this.f109177a.getParent()).removeView(this.f109177a);
            }
            this.f109177a.setFitsSystemWindows(false);
            a.addView(this.f109177a);
        }
    }

    /* renamed from: f */
    public int mo153856f() {
        if (this.f109185l == null || this.f109186m == null) {
            return UIHelper.getDimens(R.dimen.mail_operation_title_bar_height);
        }
        Log.m165389i("MessageListFirstFrameManager", " updateHeaderTop mSubjectLayout : " + this.f109185l.getHeight() + "  mTitleView:" + this.f109186m.getHeight() + " mail_operation_title_bar_height:" + UIHelper.getDimens(R.dimen.mail_operation_title_bar_height));
        return this.f109185l.getHeight() + UIHelper.getDimens(R.dimen.mail_operation_title_bar_height);
    }

    /* renamed from: a */
    public void mo153851a(AbstractC42877a aVar) {
        this.f109192t = aVar;
    }

    /* renamed from: a */
    public static void m170776a(Context context) {
        if (MagicWindowUtil.m224687e(context)) {
            f109176r = true;
        }
    }

    /* renamed from: a */
    private void m170777a(Animation.AnimationListener animationListener) {
        this.f109181h = true;
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, (float) C43785p.m173533a(this.f109177a.getContext()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        translateAnimation.setAnimationListener(animationListener);
        this.f109177a.startAnimation(translateAnimation);
    }

    /* renamed from: c */
    private void m170781c(Context context) {
        if (this.f109184k != null) {
            this.f109177a.setVisibility(0);
            StatusBarUtil.setColorNoTranslucent((Activity) context, context.getResources().getColor(R.color.bg_base));
            this.f109184k.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (this.f109177a.getChildCount() > 0) {
                this.f109177a.removeAllViews();
            }
            if (this.f109184k.getParent() != null) {
                ((ViewGroup) this.f109184k.getParent()).removeView(this.f109184k);
            }
            if (!this.f109190q) {
                layoutParams.topMargin = com.ss.android.lark.utils.StatusBarUtil.getStatusBarHeight(context);
            }
            this.f109177a.addView(this.f109184k, layoutParams);
        }
    }

    /* renamed from: b */
    public void mo153854b(Context context) {
        if (this.f109184k == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.mail_message_list_mailtitle, (ViewGroup) null, false);
            this.f109184k = inflate;
            this.f109185l = inflate.findViewById(R.id.mail_message_list_mailtitle_subject);
            this.f109178b = (LinearLayout) this.f109184k.findViewById(R.id.mail_title_sub_layout);
            this.f109186m = (TextView) this.f109184k.findViewById(R.id.message_list_mail_title_bar_text);
            this.f109187n = (ImageView) this.f109184k.findViewById(R.id.message_list_mail_title_bar_flag);
            this.f109188o = (OperationTitleBar) this.f109184k.findViewById(R.id.mail_msg_list_operation_title_bar);
            this.f109189p = new ThreadActionManager(null);
            ThreadActionManager.initSync();
            this.f109182i = new FrameLayout(context);
            this.f109182i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: a */
    public void mo153852a(boolean z) {
        m170785h();
    }

    /* renamed from: b */
    private boolean m170780b(final AbstractC42870h hVar, final Context context) {
        if (this.f109181h) {
            return true;
        }
        FrameLayout frameLayout = this.f109177a;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = this.f109183j;
            if (!(frameLayout2 == null || frameLayout2.getParent() == null)) {
                ((ViewGroup) this.f109183j.getParent()).removeView(this.f109183j);
            }
            this.f109183j = null;
            return false;
        } else if (frameLayout.getVisibility() == 4) {
            this.f109177a = null;
            FrameLayout frameLayout3 = this.f109183j;
            if (!(frameLayout3 == null || frameLayout3.getParent() == null)) {
                ((ViewGroup) this.f109183j.getParent()).removeView(this.f109183j);
            }
            this.f109183j = null;
            return false;
        } else {
            if (hVar == null && this.f109180d != null) {
                this.f109180d = null;
            }
            StatusBarUtil.setColorNoTranslucent((Activity) context, context.getResources().getColor(R.color.bg_body));
            if (this.f109177a == null) {
                return false;
            }
            m170777a(new Animation.AnimationListener() {
                /* class com.ss.android.lark.mail.impl.message.p2204d.C42871i.animationAnimation$AnimationListenerC428743 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    if (!(C42871i.this.f109177a == null || C42871i.this.f109177a.getParent() == null)) {
                        ((ViewGroup) C42871i.this.f109177a.getParent()).removeView(C42871i.this.f109177a);
                    }
                    if (C42871i.this.f109178b != null) {
                        for (int childCount = C42871i.this.f109178b.getChildCount() - 1; childCount >= 1; childCount--) {
                            C42871i.this.f109178b.removeViewAt(childCount);
                        }
                    }
                    if (C42871i.this.f109179c != null) {
                        C42871i.this.f109179c.mo154007c();
                    }
                    if (C42871i.this.f109177a != null) {
                        C42871i.this.f109177a.removeAllViews();
                        C42871i.this.f109177a.setVisibility(4);
                    }
                    C42871i.this.f109181h = false;
                }
            });
            C43849u.m173827a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.p2204d.C42871i.RunnableC428754 */

                public void run() {
                    if (!C42871i.this.f109181h) {
                        if (C42871i.this.f109177a == null) {
                            return;
                        }
                        if (C42871i.this.f109177a.getVisibility() != 0 && C42871i.this.f109177a.getParent() == null) {
                            return;
                        }
                    }
                    if (hVar == null && C42871i.this.f109180d != null) {
                        C42871i.this.f109180d = null;
                    }
                    Context context = context;
                    StatusBarUtil.setColorNoTranslucent((Activity) context, context.getResources().getColor(R.color.bg_body));
                    if (C42871i.this.f109177a.getParent() != null) {
                        ((ViewGroup) C42871i.this.f109177a.getParent()).removeView(C42871i.this.f109177a);
                    }
                    if (C42871i.this.f109178b != null) {
                        for (int childCount = C42871i.this.f109178b.getChildCount() - 1; childCount >= 1; childCount--) {
                            C42871i.this.f109178b.removeViewAt(childCount);
                        }
                    }
                    C42871i.this.f109179c.mo154007c();
                    C42871i.this.f109177a.removeAllViews();
                    C42871i.this.f109177a.setVisibility(4);
                    C42871i.this.f109181h = false;
                }
            }, 250);
            return true;
        }
    }

    /* renamed from: a */
    public void mo153849a(Bundle bundle, Context context) {
        Log.m165389i("MessageListFirstFrameManager", "testFirstFrame openMsgListPage mCurrentRootLayout:" + this.f109177a);
        if (this.f109177a != null) {
            this.f109179c.mo154004a(bundle, context);
            this.f109177a.addView(this.f109179c.mo154005b(), 0);
        }
    }

    /* renamed from: a */
    public boolean mo153853a(AbstractC42870h hVar, Context context) {
        return m170780b(hVar, context);
    }

    /* renamed from: a */
    public void mo153848a(int i, int i2, Intent intent) {
        if (i != 2890) {
            return;
        }
        if (intent == null || intent.getExtras() == null) {
            Log.m165383e("MessageListFirstFrameManager", "onActivityResult REQUEST_CODE_SEND_TO_CHAT_TARGET_PICKER invalid data");
            return;
        }
        Bundle extras = intent.getExtras();
        new C42960d().mo154080a(extras.getStringArrayList("forwardToChatChatIDList"), extras.getString("thread_id"), extras.getStringArrayList("intent_key_message_id_list"), extras.getString(C41816b.m166115a().mo150150q()), new C42960d.AbstractC42962a() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42871i.C428732 */

            @Override // com.ss.android.lark.mail.impl.message.plugin.C42960d.AbstractC42962a
            /* renamed from: a */
            public void mo153858a(boolean z) {
                Log.m165389i("MessageListFirstFrameManager", "onSendToChatFinished:" + z);
                if (z) {
                    MailToast.m173697a((int) R.string.Mail_Share_SharedSuccessfully);
                } else {
                    MailToast.m173697a((int) R.string.Mail_Share_FailedToShare);
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x010e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m170778a(final com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h r25, final android.content.Context r26, java.lang.String r27, com.ss.android.lark.mail.impl.entity.MailThread r28) {
        /*
        // Method dump skipped, instructions count: 541
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.p2204d.C42871i.m170778a(com.ss.android.lark.mail.impl.message.d.h, android.content.Context, java.lang.String, com.ss.android.lark.mail.impl.entity.MailThread):void");
    }

    /* renamed from: a */
    public void mo153850a(final Bundle bundle, AbstractC42870h hVar, final Context context, String str, MailThread mailThread, boolean z) {
        Log.m165389i("MessageListFirstFrameManager", "gotoMessageListTabView startMsgListTabPage ");
        this.f109190q = z;
        this.f109180d = hVar;
        m170778a(hVar, context, str, mailThread);
        m170781c(context);
        m170784g();
        m170786i();
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42871i.RunnableC428721 */

            public void run() {
                C42871i.this.mo153849a(bundle, context);
            }
        });
    }
}
