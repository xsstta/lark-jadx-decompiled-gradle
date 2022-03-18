package com.ss.android.lark.contact.feat.common;

import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.contact.feat.common.ItemViewHolder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00012\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H&¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/ItemCell;", "Value", "", "VH", "Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "()V", "getItemViewType", "", "onBindCellViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "(Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;Ljava/lang/Object;I)V", "onCreateCellViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.common.c */
public abstract class ItemCell<Value, VH extends ItemViewHolder<Value>> {
    /* renamed from: a */
    public abstract VH mo130686a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo130688a(VH vh, Value value, int i);

    /* renamed from: a */
    public final int mo130757a() {
        return getClass().hashCode();
    }
}
