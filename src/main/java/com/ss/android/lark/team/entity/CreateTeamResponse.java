package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class CreateTeamResponse implements Serializable {
    private static final long serialVersionUID = -2941841327879308691L;
    private Item item;
    private Team team;

    public Item getItem() {
        return this.item;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setItem(Item item2) {
        this.item = item2;
    }

    public void setTeam(Team team2) {
        this.team = team2;
    }
}
