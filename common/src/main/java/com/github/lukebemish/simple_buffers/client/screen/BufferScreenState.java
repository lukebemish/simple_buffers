package com.github.lukebemish.simple_buffers.client.screen;

import com.github.lukebemish.simple_buffers.util.RelativeSide;

public enum BufferScreenState {
    ITEMS,
    RIGHT,
    LEFT,
    UP,
    DOWN,
    FRONT,
    BACK;

    public RelativeSide toSide() {
        switch (this) {
            case RIGHT:
                return  RelativeSide.RIGHT;
            case LEFT:
                return  RelativeSide.LEFT;
            case FRONT:
                return  RelativeSide.FRONT;
            case BACK:
                return  RelativeSide.BACK;
            case UP:
                return  RelativeSide.UP;
            case DOWN:
                return  RelativeSide.DOWN;
        }
        return null;
    }
}
