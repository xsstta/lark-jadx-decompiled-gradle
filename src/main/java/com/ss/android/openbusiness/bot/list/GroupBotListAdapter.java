package com.ss.android.openbusiness.bot.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.openbusiness.bot.GroupBotRouter;
import com.ss.android.openbusiness.bot.net.data.Avatar;
import com.ss.android.openbusiness.bot.net.data.Bot;
import com.ss.android.openbusiness.p3003a.C59447a;
import com.ss.android.openbusiness.p3006c.C59539a;
import com.ss.android.openbusiness.ui.C59601a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/openbusiness/bot/list/GroupBotListAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/openbusiness/adapter/BaseViewHolder;", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "mContext", "Landroid/content/Context;", "chatId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.list.a */
public final class GroupBotListAdapter extends LarkRecyclerViewBaseAdapter<C59447a, Bot> {

    /* renamed from: b */
    public static final Companion f147772b = new Companion(null);

    /* renamed from: a */
    public final Context f147773a;

    /* renamed from: c */
    private String f147774c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/openbusiness/bot/list/GroupBotListAdapter$Companion;", "", "()V", "TAG", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo202877a() {
        return this.f147774c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.a$b */
    public static final class View$OnClickListenerC59531b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotListAdapter f147775a;

        /* renamed from: b */
        final /* synthetic */ Bot f147776b;

        View$OnClickListenerC59531b(GroupBotListAdapter aVar, Bot bot) {
            this.f147775a = aVar;
            this.f147776b = bot;
        }

        public final void onClick(View view) {
            String a;
            if (this.f147776b != null && (a = this.f147775a.mo202877a()) != null) {
                Log.m165389i("GroupBotListAdapter", "open bot detail, botId: " + this.f147776b.mo202910j());
                String j = this.f147776b.mo202910j();
                if (j != null) {
                    GroupBotRouter.Companion aVar = GroupBotRouter.f147721a;
                    Context context = this.f147775a.f147773a;
                    Intrinsics.checkExpressionValueIsNotNull(j, "botId");
                    aVar.mo202819a(context, j, a, true);
                    C59539a.m231023a(this.f147776b.mo202903e(), j, this.f147776b.mo202905f());
                }
            }
        }
    }

    public GroupBotListAdapter(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f147773a = context;
        this.f147774c = str;
    }

    /* renamed from: a */
    public C59447a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.open_platform_bot_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…_bot_item, parent, false)");
        return new C59447a(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(C59447a aVar, int i) {
        String str;
        String str2;
        Avatar h;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Bot bot = (Bot) this.items.get(i);
        Context context = this.f147773a;
        String str3 = null;
        if (bot == null || (h = bot.mo202908h()) == null) {
            str = null;
        } else {
            str = h.mo202887a();
        }
        C59601a.m231145a(context, str, (ImageView) aVar.mo202722a(R.id.iv_icon));
        TextView textView = (TextView) aVar.mo202722a(R.id.tv_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "name");
        if (bot != null) {
            str2 = bot.mo202905f();
        } else {
            str2 = null;
        }
        textView.setText(str2);
        TextView textView2 = (TextView) aVar.mo202722a(R.id.tv_desc);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "desc");
        if (bot != null) {
            str3 = bot.mo202907g();
        }
        textView2.setText(str3);
        View a = aVar.mo202722a(R.id.tv_add);
        Intrinsics.checkExpressionValueIsNotNull(a, "holder.getView<TextView>(R.id.tv_add)");
        ((TextView) a).setVisibility(8);
        View a2 = aVar.mo202722a(R.id.tv_added);
        Intrinsics.checkExpressionValueIsNotNull(a2, "holder.getView<TextView>(R.id.tv_added)");
        ((TextView) a2).setVisibility(8);
        View a3 = aVar.mo202722a(R.id.tv_get);
        Intrinsics.checkExpressionValueIsNotNull(a3, "holder.getView<TextView>(R.id.tv_get)");
        ((TextView) a3).setVisibility(8);
        View a4 = aVar.mo202722a(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(a4, "holder.getView<View>(R.id.divider)");
        ViewGroup.LayoutParams layoutParams = a4.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i == this.items.size() - 1) {
                layoutParams2.leftMargin = C57582a.m223600a(0);
            } else {
                layoutParams2.leftMargin = C57582a.m223600a(76);
            }
            aVar.itemView.setOnClickListener(new View$OnClickListenerC59531b(this, bot));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }
}
