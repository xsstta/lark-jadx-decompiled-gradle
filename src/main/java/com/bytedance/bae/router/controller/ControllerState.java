package com.bytedance.bae.router.controller;

interface ControllerState {
    int getState();

    void onEvent(int i, int i2);
}
