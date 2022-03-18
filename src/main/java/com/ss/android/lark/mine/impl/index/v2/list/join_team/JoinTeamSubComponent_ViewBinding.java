package com.ss.android.lark.mine.impl.index.v2.list.join_team;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class JoinTeamSubComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private JoinTeamSubComponent f115421a;

    @Override // butterknife.Unbinder
    public void unbind() {
        JoinTeamSubComponent joinTeamSubComponent = this.f115421a;
        if (joinTeamSubComponent != null) {
            this.f115421a = null;
            joinTeamSubComponent.mJoinTeamTV = null;
            joinTeamSubComponent.mJoinTeamUpdateTip = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public JoinTeamSubComponent_ViewBinding(JoinTeamSubComponent joinTeamSubComponent, View view) {
        this.f115421a = joinTeamSubComponent;
        joinTeamSubComponent.mJoinTeamTV = (TextView) Utils.findRequiredViewAsType(view, R.id.join_team_text, "field 'mJoinTeamTV'", TextView.class);
        joinTeamSubComponent.mJoinTeamUpdateTip = (ImageView) Utils.findRequiredViewAsType(view, R.id.join_team_update_tip, "field 'mJoinTeamUpdateTip'", ImageView.class);
    }
}
