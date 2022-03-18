package com.larksuite.component.universe_design.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0003\"#$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0003J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\tH\u0002R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatarList;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/larksuite/component/universe_design/image/UDAvatarList$AvatarAdapter;", "adapter", "getAdapter", "()Lcom/larksuite/component/universe_design/image/UDAvatarList$AvatarAdapter;", "setAdapter", "(Lcom/larksuite/component/universe_design/image/UDAvatarList$AvatarAdapter;)V", "maxCount", "getMaxCount", "()I", "setMaxCount", "(I)V", "observer", "Lcom/larksuite/component/universe_design/image/UDAvatarList$DataObserver;", "overlapWidth", "addAvatar", "", "avatar", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "init", "onDataChanged", "setOverlapWidth", "avatarSize", "AvatarAdapter", "Companion", "DataObserver", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDAvatarList extends LinearLayout {

    /* renamed from: a */
    public static final Companion f63452a = new Companion(null);

    /* renamed from: b */
    private int f63453b;

    /* renamed from: c */
    private int f63454c;

    /* renamed from: d */
    private DataObserver f63455d;

    /* renamed from: e */
    private AvatarAdapter<?> f63456e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004H&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR4\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatarList$AvatarAdapter;", "DATA", "Landroid/widget/BaseAdapter;", "avatarSize", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(ILjava/util/List;)V", "getAvatarSize", "()I", "value", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "maxCount", "getMaxCount", "setMaxCount", "(I)V", "getAvatar", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "context", "Landroid/content/Context;", "position", "getCount", "getItem", "(I)Ljava/lang/Object;", "getItemId", "", "getMoreAvatar", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "onItemCreated", "", "avatar", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.image.UDAvatarList$a */
    public static abstract class AvatarAdapter<DATA> extends BaseAdapter {

        /* renamed from: a */
        private List<? extends DATA> f63457a;

        /* renamed from: b */
        private int f63458b;

        /* renamed from: c */
        private final int f63459c;

        public AvatarAdapter() {
            this(0, null, 3, null);
        }

        /* renamed from: a */
        public abstract void mo18933a(UDAvatar uDAvatar, int i);

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends DATA>, java.util.List<DATA> */
        /* renamed from: a */
        public final List<DATA> mo91010a() {
            return (List<? extends DATA>) this.f63457a;
        }

        /* renamed from: b */
        public final int mo91012b() {
            return this.f63458b;
        }

        /* renamed from: c */
        public final int mo91013c() {
            return this.f63459c;
        }

        public int getCount() {
            List<? extends DATA> list = this.f63457a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo91011a(int i) {
            this.f63458b = i;
        }

        /* renamed from: c */
        public final void mo91014c(List<? extends DATA> list) {
            this.f63457a = list;
            notifyDataSetChanged();
        }

        public DATA getItem(int i) {
            List<? extends DATA> list = this.f63457a;
            if (list != null) {
                return (DATA) list.get(i);
            }
            return null;
        }

        /* renamed from: a */
        public UDAvatar mo91008a(Context context) {
            Integer num;
            Intrinsics.checkParameterIsNotNull(context, "context");
            List<? extends DATA> list = this.f63457a;
            if (list != null) {
                num = Integer.valueOf(list.size() - (this.f63458b - 1));
            } else {
                num = null;
            }
            UDTextAvatar uDTextAvatar = new UDTextAvatar(context);
            uDTextAvatar.setBorderStyle(0);
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(num);
            uDTextAvatar.setAvatarText(sb.toString());
            uDTextAvatar.setTextColor(Integer.valueOf(UDColorUtils.getColor(context, R.color.text_caption)));
            uDTextAvatar.setAvatarBgColor(UDColorUtils.getColor(context, R.color.bg_filler));
            uDTextAvatar.setBorderColor(UDColorUtils.getColor(context, R.color.bg_body));
            uDTextAvatar.setAvatarSize(this.f63459c);
            return uDTextAvatar;
        }

        public AvatarAdapter(int i, List<? extends DATA> list) {
            this.f63459c = i;
            this.f63457a = list;
            this.f63458b = 6;
        }

        /* renamed from: a */
        public UDAvatar mo91009a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (getItem(i) == null) {
                return null;
            }
            UDAvatar uDAvatar = new UDAvatar(context);
            uDAvatar.setBorderColor(UDColorUtils.getColor(context, R.color.bg_body));
            uDAvatar.setAvatarSize(this.f63459c);
            uDAvatar.setBackgroundColor(UDColorUtils.getColor(context, R.color.bg_filler));
            mo18933a(uDAvatar, i);
            return uDAvatar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AvatarAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatarList$Companion;", "", "()V", "MAX_COUNT", "", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.image.UDAvatarList$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AvatarAdapter<?> getAdapter() {
        return this.f63456e;
    }

    public final int getMaxCount() {
        return this.f63454c;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDAvatarList$DataObserver;", "Landroid/database/DataSetObserver;", "(Lcom/larksuite/component/universe_design/image/UDAvatarList;)V", "onChanged", "", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.image.UDAvatarList$c */
    public final class DataObserver extends DataSetObserver {
        public void onChanged() {
            UDAvatarList.this.mo91002a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DataObserver() {
        }
    }

    /* renamed from: a */
    public final void mo91002a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC25759d(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.image.UDAvatarList$d */
    public static final class RunnableC25759d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UDAvatarList f63461a;

        RunnableC25759d(UDAvatarList uDAvatarList) {
            this.f63461a = uDAvatarList;
        }

        public final void run() {
            int i;
            UDAvatar uDAvatar;
            int i2;
            this.f63461a.removeAllViews();
            AvatarAdapter<?> adapter = this.f63461a.getAdapter();
            int i3 = 0;
            if (adapter != null) {
                i = adapter.getCount();
            } else {
                i = 0;
            }
            int min = Math.min(i, this.f63461a.getMaxCount() - 1);
            int i4 = 0;
            while (true) {
                uDAvatar = null;
                if (i4 >= min) {
                    break;
                }
                UDAvatarList uDAvatarList = this.f63461a;
                AvatarAdapter<?> adapter2 = uDAvatarList.getAdapter();
                if (adapter2 != null) {
                    Context context = this.f63461a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    uDAvatar = adapter2.mo91009a(context, i4);
                }
                uDAvatarList.mo91003a(uDAvatar);
                i4++;
            }
            AvatarAdapter<?> adapter3 = this.f63461a.getAdapter();
            if (adapter3 != null) {
                i2 = adapter3.getCount();
            } else {
                i2 = 0;
            }
            if (i2 == this.f63461a.getMaxCount()) {
                UDAvatarList uDAvatarList2 = this.f63461a;
                AvatarAdapter<?> adapter4 = uDAvatarList2.getAdapter();
                if (adapter4 != null) {
                    Context context2 = this.f63461a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    uDAvatar = adapter4.mo91009a(context2, this.f63461a.getMaxCount() - 1);
                }
                uDAvatarList2.mo91003a(uDAvatar);
                return;
            }
            AvatarAdapter<?> adapter5 = this.f63461a.getAdapter();
            if (adapter5 != null) {
                i3 = adapter5.getCount();
            }
            if (i3 > this.f63461a.getMaxCount()) {
                UDAvatarList uDAvatarList3 = this.f63461a;
                AvatarAdapter<?> adapter6 = uDAvatarList3.getAdapter();
                if (adapter6 != null) {
                    Context context3 = this.f63461a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                    uDAvatar = adapter6.mo91008a(context3);
                }
                uDAvatarList3.mo91003a(uDAvatar);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDAvatarList(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setMaxCount(int i) {
        this.f63454c = i;
        AvatarAdapter<?> aVar = this.f63456e;
        if (aVar != null) {
            aVar.mo91011a(i);
        }
        AvatarAdapter<?> aVar2 = this.f63456e;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }

    public final void setAdapter(AvatarAdapter<?> aVar) {
        AvatarAdapter<?> aVar2 = this.f63456e;
        if (aVar2 != null) {
            aVar2.unregisterDataSetObserver(this.f63455d);
        }
        this.f63456e = aVar;
        if (aVar != null) {
            aVar.registerDataSetObserver(this.f63455d);
        }
        AvatarAdapter<?> aVar3 = this.f63456e;
        if (aVar3 != null) {
            setOverlapWidth(aVar3.mo91013c());
            aVar3.mo91011a(this.f63454c);
        }
        this.f63455d.onChanged();
    }

    private final void setOverlapWidth(int i) {
        int i2;
        if (i == -3) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i2 = UDDimenUtils.m93313d(context, R.dimen.ud_avatar_overlap_width_small);
        } else if (i == -2) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i2 = UDDimenUtils.m93313d(context2, R.dimen.ud_avatar_overlap_width_middle);
        } else if (i != -1) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            i2 = UDDimenUtils.m93313d(context3, R.dimen.ud_avatar_overlap_width_large);
        } else {
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            i2 = UDDimenUtils.m93313d(context4, R.dimen.ud_avatar_overlap_width_large);
        }
        this.f63453b = i2;
    }

    /* renamed from: a */
    public final void mo91003a(UDAvatar uDAvatar) {
        int i;
        int i2;
        if (uDAvatar != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (getChildCount() > 0) {
                int i3 = 0;
                if (getOrientation() == 0) {
                    i2 = -this.f63453b;
                } else {
                    i2 = 0;
                }
                layoutParams.leftMargin = i2;
                if (getOrientation() == 1) {
                    i3 = -this.f63453b;
                }
                layoutParams.topMargin = i3;
            }
            if (uDAvatar.getBorderColor() != 0) {
                int avatarSize = uDAvatar.getAvatarSize();
                if (avatarSize == -4) {
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    i = UDDimenUtils.m93313d(context, R.dimen.ud_avatar_border_width_mini);
                } else if (avatarSize == -3) {
                    Context context2 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    i = UDDimenUtils.m93313d(context2, R.dimen.ud_avatar_border_width_small);
                } else if (avatarSize == -2) {
                    Context context3 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                    i = UDDimenUtils.m93313d(context3, R.dimen.ud_avatar_border_width_middle);
                } else if (avatarSize != -1) {
                    Context context4 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                    i = UDDimenUtils.m93313d(context4, R.dimen.ud_avatar_border_width_large);
                } else {
                    Context context5 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                    i = UDDimenUtils.m93313d(context5, R.dimen.ud_avatar_border_width_large);
                }
                uDAvatar.setBorderWidth(Float.valueOf((float) i));
            }
            addView(uDAvatar.mo90989b(), layoutParams);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDAvatarList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92865a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_avatarList_maxCount}, i, 0);
            setMaxCount(obtainStyledAttributes.getInt(0, 6));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDAvatarList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63454c = 6;
        this.f63455d = new DataObserver();
        m92865a(attributeSet, i);
    }
}
