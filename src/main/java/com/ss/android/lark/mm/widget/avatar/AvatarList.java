package com.ss.android.lark.mm.widget.avatar;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0003 !\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0003J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\tR0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/AvatarList;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ss/android/lark/mm/widget/avatar/AvatarList$AvatarAdapter;", "adapter", "getAdapter", "()Lcom/ss/android/lark/mm/widget/avatar/AvatarList$AvatarAdapter;", "setAdapter", "(Lcom/ss/android/lark/mm/widget/avatar/AvatarList$AvatarAdapter;)V", "maxCount", "observer", "Lcom/ss/android/lark/mm/widget/avatar/AvatarList$DataObserver;", "overlapWidth", "addAvatar", "", "avatar", "Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "init", "onDataChanged", "setMaxCount", "setOverlapWidth", "setOverlapWidthByAvatarSize", "avatarSize", "AvatarAdapter", "Companion", "DataObserver", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarList extends LinearLayout {

    /* renamed from: b */
    public static final Companion f118792b = new Companion(null);

    /* renamed from: a */
    public int f118793a;

    /* renamed from: c */
    private int f118794c;

    /* renamed from: d */
    private DataObserver f118795d;

    /* renamed from: e */
    private AvatarAdapter<?> f118796e;

    /* renamed from: a */
    private final void m186695a(AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR4\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/AvatarList$AvatarAdapter;", "DATA", "Landroid/widget/BaseAdapter;", "avatarSize", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isDrawBorder", "", "(ILjava/util/List;Z)V", "getAvatarSize", "()I", "value", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "()Z", "setDrawBorder", "(Z)V", "getAvatar", "Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "context", "Landroid/content/Context;", "position", "getCount", "getItem", "(I)Ljava/lang/Object;", "getItemId", "", "getMoreAvatar", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "onItemCreated", "", "avatar", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.avatar.AvatarList$a */
    public static abstract class AvatarAdapter<DATA> extends BaseAdapter {

        /* renamed from: a */
        private List<? extends DATA> f118797a;

        /* renamed from: b */
        private final int f118798b;

        /* renamed from: c */
        private boolean f118799c;

        public AvatarAdapter() {
            this(0, null, false, 7, null);
        }

        /* renamed from: a */
        public abstract void mo165223a(Avatar avatar, int i);

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends DATA>, java.util.List<DATA> */
        /* renamed from: a */
        public final List<DATA> mo165679a() {
            return (List<? extends DATA>) this.f118797a;
        }

        /* renamed from: b */
        public final boolean mo165681b() {
            return this.f118799c;
        }

        public int getCount() {
            List<? extends DATA> list = this.f118797a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo165680a(List<? extends DATA> list) {
            this.f118797a = list;
            notifyDataSetChanged();
        }

        public DATA getItem(int i) {
            List<? extends DATA> list = this.f118797a;
            if (list != null) {
                return (DATA) list.get(i);
            }
            return null;
        }

        /* renamed from: a */
        public final Avatar mo165677a(Context context) {
            Integer num;
            Intrinsics.checkParameterIsNotNull(context, "context");
            List<? extends DATA> list = this.f118797a;
            if (list != null) {
                num = Integer.valueOf(list.size() - 5);
            } else {
                num = null;
            }
            TextAvatar textAvatar = new TextAvatar(context);
            textAvatar.setBorderStyle(0);
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(num);
            textAvatar.setAvatarText(sb.toString());
            textAvatar.setTextColor(Integer.valueOf(UIUtils.getColor(context, R.color.lkui_N650)));
            textAvatar.setAvatarBgColor(UIUtils.getColor(context, R.color.lkui_N300));
            if (this.f118799c) {
                textAvatar.setBorderColor(UIUtils.getColor(context, R.color.lkui_N00));
            }
            textAvatar.setAvatarSize(this.f118798b);
            return textAvatar;
        }

        /* renamed from: a */
        public final Avatar mo165678a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (getItem(i) == null) {
                return null;
            }
            Avatar avatar = new Avatar(context);
            if (this.f118799c) {
                avatar.setBorderColor(UIUtils.getColor(context, R.color.lkui_N00));
            }
            avatar.setAvatarSize(this.f118798b);
            mo165223a(avatar, i);
            return avatar;
        }

        public AvatarAdapter(int i, List<? extends DATA> list, boolean z) {
            this.f118798b = i;
            this.f118799c = z;
            this.f118797a = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AvatarAdapter(int i, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -2 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? true : z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/AvatarList$Companion;", "", "()V", "MAX_COUNT", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.avatar.AvatarList$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AvatarAdapter<?> getAdapter() {
        return this.f118796e;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/AvatarList$DataObserver;", "Landroid/database/DataSetObserver;", "(Lcom/ss/android/lark/mm/widget/avatar/AvatarList;)V", "onChanged", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.avatar.AvatarList$c */
    public final class DataObserver extends DataSetObserver {
        public void onChanged() {
            AvatarList.this.mo165670a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DataObserver() {
        }
    }

    /* renamed from: a */
    public final void mo165670a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC47143d(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.avatar.AvatarList$d */
    public static final class RunnableC47143d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AvatarList f118801a;

        RunnableC47143d(AvatarList avatarList) {
            this.f118801a = avatarList;
        }

        public final void run() {
            int i;
            Avatar avatar;
            int i2;
            this.f118801a.removeAllViews();
            AvatarAdapter<?> adapter = this.f118801a.getAdapter();
            int i3 = 0;
            if (adapter != null) {
                i = adapter.getCount();
            } else {
                i = 0;
            }
            int min = Math.min(i, this.f118801a.f118793a - 1);
            int i4 = 0;
            while (true) {
                avatar = null;
                if (i4 >= min) {
                    break;
                }
                AvatarList avatarList = this.f118801a;
                AvatarAdapter<?> adapter2 = avatarList.getAdapter();
                if (adapter2 != null) {
                    Context context = this.f118801a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    avatar = adapter2.mo165678a(context, i4);
                }
                avatarList.mo165671a(avatar);
                i4++;
            }
            AvatarAdapter<?> adapter3 = this.f118801a.getAdapter();
            if (adapter3 != null) {
                i2 = adapter3.getCount();
            } else {
                i2 = 0;
            }
            if (i2 == this.f118801a.f118793a) {
                AvatarList avatarList2 = this.f118801a;
                AvatarAdapter<?> adapter4 = avatarList2.getAdapter();
                if (adapter4 != null) {
                    Context context2 = this.f118801a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    avatar = adapter4.mo165678a(context2, this.f118801a.f118793a - 1);
                }
                avatarList2.mo165671a(avatar);
                return;
            }
            AvatarAdapter<?> adapter5 = this.f118801a.getAdapter();
            if (adapter5 != null) {
                i3 = adapter5.getCount();
            }
            if (i3 > this.f118801a.f118793a) {
                AvatarList avatarList3 = this.f118801a;
                AvatarAdapter<?> adapter6 = avatarList3.getAdapter();
                if (adapter6 != null) {
                    Context context3 = this.f118801a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                    avatar = adapter6.mo165677a(context3);
                }
                avatarList3.mo165671a(avatar);
            }
        }
    }

    public final void setMaxCount(int i) {
        this.f118793a = i;
    }

    public final void setOverlapWidth(int i) {
        this.f118794c = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarList(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setAdapter(AvatarAdapter<?> aVar) {
        AvatarAdapter<?> aVar2 = this.f118796e;
        if (aVar2 != null) {
            aVar2.unregisterDataSetObserver(this.f118795d);
        }
        this.f118796e = aVar;
        if (aVar != null) {
            aVar.registerDataSetObserver(this.f118795d);
        }
        this.f118795d.onChanged();
    }

    /* renamed from: a */
    public final void mo165671a(Avatar avatar) {
        int i;
        if (avatar != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (getChildCount() > 0) {
                int i2 = 0;
                if (getOrientation() == 0) {
                    i = -this.f118794c;
                } else {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                if (getOrientation() == 1) {
                    i2 = -this.f118794c;
                }
                layoutParams.topMargin = i2;
            }
            AvatarAdapter<?> aVar = this.f118796e;
            if (aVar == null || !aVar.mo165681b()) {
                addView(avatar, layoutParams);
            } else {
                addView(avatar.mo165657b(), layoutParams);
            }
        }
    }

    public final void setOverlapWidthByAvatarSize(int i) {
        int i2;
        if (i == -4) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i2 = context.getResources().getDimensionPixelSize(R.dimen.avatar_overlap_width_small);
        } else if (i == -3) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i2 = context2.getResources().getDimensionPixelSize(R.dimen.avatar_overlap_width_middle);
        } else if (i != -2) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            i2 = context3.getResources().getDimensionPixelSize(R.dimen.avatar_overlap_width_large);
        } else {
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            i2 = context4.getResources().getDimensionPixelSize(R.dimen.avatar_overlap_width_large);
        }
        this.f118794c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118793a = 6;
        this.f118795d = new DataObserver();
        m186695a(attributeSet, i);
    }
}
