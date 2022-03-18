package com.ss.android.lark.collaboration.statics;

import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57859q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/collaboration/statics/CollaborationHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.collaboration.b.a */
public final class CollaborationHitPoint {

    /* renamed from: a */
    public static final Companion f91388a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/collaboration/statics/CollaborationHitPoint$Companion;", "", "()V", "sendDoActionContactBlockEvent", "", "scene", "", "sendRequestCollaborationEvent", "contacts", "", "Lcom/ss/android/lark/contact/entity/Contact;", "sendShowCollaborationDialogEvent", "applyCount", "", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo130090a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "scene");
            Statistics.sendEvent("collaboration_cancel_block", new JSONObject().put("scene", str));
        }

        /* renamed from: a */
        public final void mo130089a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "scene");
            Statistics.sendEvent("guide_authorize_collaboration_window", new JSONObject().put("default_number", i).put("scene", str));
        }

        /* renamed from: a */
        public final void mo130091a(List<? extends Contact> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "contacts");
            Intrinsics.checkParameterIsNotNull(str, "scene");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("default_number", list.size());
            jSONObject.put("scene", str);
            List<? extends Contact> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C57859q.m224565a(it.next().mo130406a()));
            }
            jSONObject.put("to_user_ids", arrayList);
            Statistics.sendEvent("authorize_collaboration_request", jSONObject);
        }
    }
}
