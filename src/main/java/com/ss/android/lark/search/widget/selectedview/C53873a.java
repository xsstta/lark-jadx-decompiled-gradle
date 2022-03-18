package com.ss.android.lark.search.widget.selectedview;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.search.widget.calendar.EmailAvatarUtil;
import com.ss.android.lark.search.widget.calendar.EmailInfo;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.utils.C57860r;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.search.widget.selectedview.a */
public class C53873a extends LarkRecyclerViewBaseAdapter<C53876b, SearchBaseInfo> {

    /* renamed from: b */
    private static final int f133108b = UIHelper.dp2px(40.0f);

    /* renamed from: a */
    public AbstractC53875a f133109a;

    /* renamed from: c */
    private Context f133110c;

    /* renamed from: com.ss.android.lark.search.widget.selectedview.a$a */
    public interface AbstractC53875a {
        /* renamed from: a */
        void mo183631a(SearchBaseInfo searchBaseInfo);
    }

    /* renamed from: a */
    public void mo183782a(AbstractC53875a aVar) {
        this.f133109a = aVar;
    }

    public C53873a(Context context) {
        this.f133110c = context;
    }

    /* renamed from: com.ss.android.lark.search.widget.selectedview.a$b */
    public static class C53876b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LarkAvatarView f133113a;

        public C53876b(View view) {
            super(view);
            this.f133113a = (LarkAvatarView) view.findViewById(R.id.selected_avatar);
        }
    }

    /* renamed from: a */
    public C53876b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53876b(LayoutInflater.from(this.f133110c).inflate(R.layout.selected_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C53876b bVar, int i) {
        final SearchBaseInfo searchBaseInfo = (SearchBaseInfo) getItem(i);
        m208725a(bVar, searchBaseInfo);
        bVar.itemView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.search.widget.selectedview.C53873a.C538741 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C53873a.this.f133109a != null) {
                    C53873a.this.f133109a.mo183631a(searchBaseInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private void m208725a(C53876b bVar, SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof EmailInfo) {
            bVar.f133113a.setImageBitmap(EmailAvatarUtil.m208701a(((EmailInfo) searchBaseInfo).getAddress(), (float) f133108b));
        } else if (searchBaseInfo instanceof SearchDepartmentInfo) {
            bVar.f133113a.setImageResource(R.drawable.icon_department_avatar);
        } else if (!(searchBaseInfo instanceof SearchMailContactInfo) || !TextUtils.isEmpty(searchBaseInfo.getAvatarKey())) {
            String id = searchBaseInfo.getId();
            if (searchBaseInfo instanceof SearchThreadInfo) {
                SearchThreadInfo searchThreadInfo = (SearchThreadInfo) searchBaseInfo;
                if (searchThreadInfo.getChannel() == null || searchThreadInfo.getChannel().getId() == null) {
                    id = searchThreadInfo.getChatId();
                } else {
                    id = searchThreadInfo.getChannel().getId();
                }
                bVar.f133113a.mo89074a(new MiniIconModel(AvatarType.THRED, this.f133110c.getDrawable(R.drawable.feed_thread_icon)));
            }
            SearchWidgetModuleDependency.ISearchWidgetModuleDependency a = SearchWidgetModuleDependency.m208511a();
            Context context = this.f133110c;
            String avatarKey = searchBaseInfo.getAvatarKey();
            LarkAvatarView larkAvatarView = bVar.f133113a;
            int i = f133108b;
            a.mo102927a(context, avatarKey, id, larkAvatarView, i, i);
        } else {
            int i2 = f133108b;
            bVar.f133113a.setImageBitmap(C57860r.m224570a(i2, i2, searchBaseInfo.getTitle(), ContextCompat.getColor(this.f133110c, R.color.color_at_all_blue)));
        }
    }
}
