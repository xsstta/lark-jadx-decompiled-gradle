package com.ss.android.openbusiness.bot.addsearch;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.webapp.Source;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.bot.BotViewItem;
import com.ss.android.openbusiness.bot.GroupBotRouter;
import com.ss.android.openbusiness.bot.net.data.Avatar;
import com.ss.android.openbusiness.monitor.GroupBotMonitorCode;
import com.ss.android.openbusiness.p3003a.C59447a;
import com.ss.android.openbusiness.p3006c.C59539a;
import com.ss.android.openbusiness.p3007d.C59550a;
import com.ss.android.openbusiness.p3007d.C59558d;
import com.ss.android.openbusiness.ui.C59601a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/openbusiness/adapter/BaseViewHolder;", "Lcom/ss/android/openbusiness/bot/BotViewItem;", "mContext", "Landroid/content/Context;", "mChatId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.addsearch.b */
public final class GroupBotAddSearchAdapter extends LarkRecyclerViewBaseAdapter<C59447a, BotViewItem> {

    /* renamed from: c */
    public static final Companion f147748c = new Companion(null);

    /* renamed from: a */
    public final Context f147749a;

    /* renamed from: b */
    public final String f147750b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchAdapter$Companion;", "", "()V", "TAG", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.b$e */
    public static final class View$OnClickListenerC59523e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchAdapter f147755a;

        /* renamed from: b */
        final /* synthetic */ BotViewItem f147756b;

        View$OnClickListenerC59523e(GroupBotAddSearchAdapter bVar, BotViewItem botViewItem) {
            this.f147755a = bVar;
            this.f147756b = botViewItem;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/openbusiness/bot/addsearch/GroupBotAddSearchAdapter$onBindViewHolder$5$1$1", "Lcom/ss/android/openbusiness/net/Service$ICallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/openbusiness/net/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.bot.addsearch.b$e$a */
        public static final class C59524a implements C59558d.AbstractC59560a {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC59523e f147757a;

            C59524a(View$OnClickListenerC59523e eVar) {
                this.f147757a = eVar;
            }

            @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
            /* renamed from: a */
            public void mo202859a(ErrorResult errorResult, C59558d.C59561b bVar) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
                Log.m165383e("GroupBotAddSearchAdapter", "addGroupBot fail " + bVar.f147844b);
                new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f147810k.mo202931h()).flush();
                LKUIToast.show(this.f147757a.f147755a.f147749a, UIUtils.getString(this.f147757a.f147755a.f147749a, R.string.Lark_GroupBot_AddBotFailed));
            }

            @Override // com.ss.android.openbusiness.p3007d.C59558d.AbstractC59560a
            /* renamed from: a */
            public void mo202858a(SendHttpResponse sendHttpResponse, C59558d.C59561b bVar) {
                Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
                Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
                try {
                    if (C57782ag.m224241a(sendHttpResponse.json_body) || !new JSONObject(sendHttpResponse.json_body).has("ok") || !new JSONObject(sendHttpResponse.json_body).getBoolean("ok")) {
                        Log.m165383e("GroupBotAddSearchAdapter", "addGroupBot fail " + sendHttpResponse.json_body);
                        String string = new JSONObject(sendHttpResponse.json_body).getString("msg");
                        new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f147810k.mo202931h()).flush();
                        LKUIToast.show(this.f147757a.f147755a.f147749a, string);
                        return;
                    }
                    BotViewItem botViewItem = this.f147757a.f147756b;
                    Intrinsics.checkExpressionValueIsNotNull(botViewItem, "item");
                    C59539a.m231024a(botViewItem.mo202910j());
                    C59480b.m230865a().mo144876b(this.f147757a.f147755a.f147749a, this.f147757a.f147755a.f147750b, -1);
                    new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f147810k.mo202930g()).flush();
                } catch (JSONException unused) {
                    Log.m165383e("GroupBotAddSearchAdapter", "addGroupBot fail ," + sendHttpResponse.json_body);
                    new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f147810k.mo202931h()).flush();
                    LKUIToast.show(this.f147757a.f147755a.f147749a, UIUtils.getString(this.f147757a.f147755a.f147749a, R.string.Lark_GroupBot_AddBotFailed));
                }
            }
        }

        public final void onClick(View view) {
            if (this.f147755a.f147750b != null) {
                BotViewItem botViewItem = this.f147756b;
                Intrinsics.checkExpressionValueIsNotNull(botViewItem, "item");
                C59550a.m231041a(botViewItem.mo202910j(), this.f147755a.f147750b, "0", new C59524a(this));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BotViewItem) getItem(i)).mo202811a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.b$c */
    public static final class View$OnClickListenerC59521c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BotViewItem f147753a;

        View$OnClickListenerC59521c(BotViewItem botViewItem) {
            this.f147753a = botViewItem;
        }

        public final void onClick(View view) {
            Log.m165389i("GroupBotAddSearchAdapter", "open app directory");
            AbstractC59446a a = C59480b.m230865a();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            a.mo144871a(view.getContext(), this.f147753a.mo202912l(), Source.UNKNOWN);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.b$d */
    public static final class View$OnClickListenerC59522d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BotViewItem f147754a;

        View$OnClickListenerC59522d(BotViewItem botViewItem) {
            this.f147754a = botViewItem;
        }

        public final void onClick(View view) {
            Log.m165389i("GroupBotAddSearchAdapter", "open app get page");
            BotViewItem botViewItem = this.f147754a;
            if (botViewItem != null) {
                C59539a.m231028b(botViewItem.mo202903e(), this.f147754a.mo202911k(), this.f147754a.mo202905f());
            }
            AbstractC59446a a = C59480b.m230865a();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            BotViewItem botViewItem2 = this.f147754a;
            Intrinsics.checkExpressionValueIsNotNull(botViewItem2, "item");
            a.mo144871a(context, botViewItem2.mo202913m(), Source.UNKNOWN);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.b$b */
    public static final class View$OnClickListenerC59520b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotAddSearchAdapter f147751a;

        /* renamed from: b */
        final /* synthetic */ BotViewItem f147752b;

        View$OnClickListenerC59520b(GroupBotAddSearchAdapter bVar, BotViewItem botViewItem) {
            this.f147751a = bVar;
            this.f147752b = botViewItem;
        }

        public final void onClick(View view) {
            String str = this.f147751a.f147750b;
            if (str != null) {
                Log.m165389i("GroupBotAddSearchAdapter", "open bot detail botId " + this.f147752b.mo202910j());
                String j = this.f147752b.mo202910j();
                if (j != null) {
                    GroupBotRouter.Companion aVar = GroupBotRouter.f147721a;
                    Context context = this.f147751a.f147749a;
                    Intrinsics.checkExpressionValueIsNotNull(j, "botId");
                    aVar.mo202819a(context, j, str, this.f147752b.mo202909i());
                }
                C59539a.m231023a(this.f147752b.mo202903e(), this.f147752b.mo202911k(), this.f147752b.mo202905f());
            }
        }
    }

    public GroupBotAddSearchAdapter(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f147749a = context;
        this.f147750b = str;
    }

    /* renamed from: a */
    public C59447a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 0) {
            return new C59447a(new View(this.f147749a));
        }
        if (i == 1 || i == 2) {
            i2 = R.layout.open_platform_bot_item;
        } else if (i == 3) {
            i2 = R.layout.open_platform_bot_divider;
        } else if (i == 4) {
            i2 = R.layout.open_platform_bot_search_recommend_tip;
        } else {
            i2 = R.layout.common_default_view;
        }
        return new C59447a(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C59447a aVar, int i) {
        boolean z;
        String str;
        String str2;
        int i2;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        BotViewItem botViewItem = (BotViewItem) getItem(i);
        if (botViewItem.mo202811a() == 1 || botViewItem.mo202811a() == 2) {
            View a = aVar.mo202722a(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(a, "holder.getView<View>(R.id.divider)");
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int i3 = i + 1;
                int i4 = 0;
                if (i3 >= this.items.size() - 1 || ((BotViewItem) getItem(i3)).mo202811a() != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (i == this.items.size() - 1 || z) {
                    layoutParams2.leftMargin = C57582a.m223600a(0);
                } else {
                    layoutParams2.leftMargin = C57582a.m223600a(76);
                }
                Intrinsics.checkExpressionValueIsNotNull(botViewItem, "item");
                Avatar h = botViewItem.mo202908h();
                if (h != null) {
                    Context context = this.f147749a;
                    Intrinsics.checkExpressionValueIsNotNull(h, "it");
                    C59601a.m231145a(context, h.mo202887a(), (ImageView) aVar.mo202722a(R.id.iv_icon));
                }
                TextView textView = (TextView) aVar.mo202722a(R.id.tv_name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "name");
                if (TextUtils.isEmpty(botViewItem.mo202813b())) {
                    str = botViewItem.mo202905f();
                } else {
                    str = botViewItem.mo202813b();
                }
                textView.setText(str);
                TextView textView2 = (TextView) aVar.mo202722a(R.id.tv_desc);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "desc");
                if (TextUtils.isEmpty(botViewItem.mo202815c())) {
                    str2 = botViewItem.mo202907g();
                } else {
                    str2 = botViewItem.mo202815c();
                }
                textView2.setText(str2);
                TextView textView3 = (TextView) aVar.mo202722a(R.id.tv_get);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = (TextView) aVar.mo202722a(R.id.tv_added);
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                TextView textView5 = (TextView) aVar.mo202722a(R.id.tv_add);
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                if (botViewItem.mo202811a() == 1) {
                    if (textView4 != null) {
                        if (botViewItem.mo202909i()) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        textView4.setVisibility(i2);
                    }
                    if (textView5 != null) {
                        if (botViewItem.mo202909i()) {
                            i4 = 8;
                        }
                        textView5.setVisibility(i4);
                    }
                    aVar.itemView.setOnClickListener(new View$OnClickListenerC59520b(this, botViewItem));
                } else if (botViewItem.mo202811a() == 2) {
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    aVar.itemView.setOnClickListener(new View$OnClickListenerC59521c(botViewItem));
                }
                if (textView3 != null) {
                    textView3.setOnClickListener(new View$OnClickListenerC59522d(botViewItem));
                }
                if (textView5 != null) {
                    textView5.setOnClickListener(new View$OnClickListenerC59523e(this, botViewItem));
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }
}
